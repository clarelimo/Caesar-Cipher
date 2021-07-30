package models;

import org.junit.Test;

public class EncryptTest {

    @Test
    public  void encrypt_onlyString_exception(){
        //arrange
        Encrypt encrypt = new Encrypt();

        //act
        // var input = encrypt.imput;

        //assert
//            assertEquals(input instanceof String);

    }

    @Test
    public  void  encrypt_notNull_Exception() throws Exception {
        Encrypt encrypt = new Encrypt();

        String  actual = encrypt.encoding("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG",1);
    }

    @Test
    public void  encrypt_encryptText_string(){

    }

}
