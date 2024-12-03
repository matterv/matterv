package computer.matter.qemu.common;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class EmptyObjectAsNullDeserializer extends JsonDeserializer<Object> {

    @Override
    public Object deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JacksonException {
        // Check if the current token indicates the start of an object
        if (jp.getCurrentToken() == JsonToken.START_OBJECT && jp.nextToken() == JsonToken.END_OBJECT) {
            // If the next token after the start of an object is the end of an object,
            // it means the object is empty. Thus, return null.
            return null;
        }
        // Delegate back to the context if it's not an empty object.
        // This line ensures that the usual deserialization process is used for non-empty objects.
        return ctxt.readValue(jp, Object.class);
    }
}