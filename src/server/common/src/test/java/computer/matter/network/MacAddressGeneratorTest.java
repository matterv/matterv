package computer.matter.network;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MacAddressGeneratorTest {

    @Test
    void generateMacAddress48() {
        var m = MacAddressGenerator.generateMacAddress48(false, true);
        Assertions.assertTrue(MacAddressGenerator.isValidMacAddress(m));
    }
}