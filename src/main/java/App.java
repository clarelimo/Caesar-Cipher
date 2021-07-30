import models.Encrypt;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome To The Caesar Cipher");
        System.out.println();

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter text to encrypt");
            String inputText = bufferedReader.readLine();
            System.out.println("Enter the shift key");
            String inputKey = bufferedReader.readLine();
            int key = Integer.parseInt(inputKey);

            if(key < 1 || key > 25){
                System.out.println("The key must be between 1 and 25");
            }else{
                Encrypt encrypt = new Encrypt();
                String encrypted = encrypt.encoding(inputText,key);
                System.out.println("Your encrypted text is: ");
                System.out.println(encrypted);
                System.out.println("Thank you for using our service!");
            }


        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

}
