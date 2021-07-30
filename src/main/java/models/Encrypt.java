package models;

public class Encrypt {

    private String encrypted = "";


    public String encoding(String plainText, int key) throws Exception {
        int n = plainText.length();

        if(n <=0 || n > 25) throw new Exception("The characters must be between 0 and 25");

        for(int i=0;i<n;i++){
            char letter = plainText.charAt(i);
            if(Character.isLetter(letter)) {
                if (Character.isUpperCase(letter)) {
                    char r = (char) (letter + key);
                    if (r > 'Z') {
                        encrypted += (char) (letter - (26 - key));
                    } else {
                        encrypted += r;
                    }
                } else if (Character.isLowerCase(letter)) {
                    char r = (char) (letter + key);
                    if (r > 'z') {
                        encrypted += (char) (letter - (26 - key));
                    } else {
                        encrypted += r;
                    }
                }

            }else{
                encrypted+=letter;
//                throw new Exception("Please enter letters only");
            }

        }

        return  encrypted;

    }

}
