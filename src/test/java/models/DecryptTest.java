package models;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class DecryptTest {

    @Test
    public  void  decrypt_notNull_Exception(){
        Decrypt decrypt = new Decrypt("ABCD",3);
        assertNotNull(decrypt);
    }

    @Test
    public  void  decrypt_onlyString_Exception(){
        Decrypt decrypt = new Decrypt("BC",1);
        decrypt.getDecrypted();
        assertTrue(decrypt.getDecrypted() instanceof String );
    }

    @Test
    public void  decrypt_boundaryLength_exception(){
        try {
            Decrypt decrypt = new Decrypt("THE QUICK BROWN FOX",30);
            decrypt.getDecrypted();

        }catch (Exception ex){
            assertEquals("The key must be between 1 and 25",ex.getMessage());
        }
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
