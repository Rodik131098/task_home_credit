package live;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void algorithm() {
        assertEquals("a_b_c", Main.algorithm("_abc_"));
        assertEquals("a__b__c_d_e", Main.algorithm("_abc__d__e_"));
        assertEquals("a_b_cd", Main.algorithm( "_abcd_"));
    }
}