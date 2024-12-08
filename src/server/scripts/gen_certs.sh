openssl genrsa -out root-ca.key 4096
openssl req -x509 -new -nodes -key root-ca.key -sha256 -days 3650 -out root-ca.crt -subj "/CN=Matterv Root CA/O=Matterv/OU=IT Department" -addext "basicConstraints=critical,CA:TRUE" -addext "keyUsage=critical,digitalSignature,cRLSign,keyCertSign"
keytool -import -alias root-ca -file root-ca.crt -keystore truststore.jks -storepass mattervpass

create_cert() {
    subdomain=$1
    pass=$2
    openssl genrsa -out ${subdomain}.key 2048
    openssl req -new -key ${subdomain}.key -out ${subdomain}.csr \
        -subj "/CN=${subdomain}/O=Matterv" \
        -addext "subjectAltName=DNS:${subdomain},DNS:${subdomain}.matterv.com" \
        -addext "keyUsage=critical,digitalSignature,keyEncipherment" \

    openssl x509 -req -in ${subdomain}.csr -CA root-ca.crt -CAkey root-ca.key -CAcreateserial \
        -out ${subdomain}.crt -days 365 -sha256 \
        -extfile <(printf "subjectAltName=DNS:${subdomain},DNS:${subdomain}.matterv.com\nkeyUsage=critical,digitalSignature,keyEncipherment\nextendedKeyUsage=serverAuth,clientAuth")
    openssl pkcs12 -export -in ${subdomain}.crt -inkey  ${subdomain}.key -out ${subdomain}.p12 -name ${subdomain} -password pass:${pass}

    keytool -importkeystore -srckeystore  ${subdomain}.p12 -srcstoretype PKCS12 -srcstorepass ${pass} -destkeystore  ${subdomain}.jks -deststorepass ${pass}
}

create_cert "host" "hoststorepass"
create_cert "matterverse" "matterversestorepass"
