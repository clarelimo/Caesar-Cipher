package models;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class DecryptTest {

    @Test
    public  void  decrypt_notNull_Exception(){

    }

    @Test
    public  void  decrypt_onlyString_Exception(){

    }

    @Test
    public  void decrypt_encryptedText_string() throws Exception {
        Decrypt decrypt = new Decrypt("BC",1);
        decrypt.Decode();
        String actual = decrypt.getDecrypted();
        String expected = "AB";

        assertEquals(expected,actual);

    }
}
