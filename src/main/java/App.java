import ProjectMods.CeaserCipher1;
import ProjectMods.Decrypt;
import ProjectMods.Encrypt;

import java.util.*;
public class App {
    public static void main(String[] args){
        System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\tWELCOME TO MY ENCRYPTION GAME ;) ;) ");
        System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        boolean mainBranch = true;
        while (mainBranch){
            System.out.println("Welcome to MyDomain Of Encryption. What would you like to do?\n\tType 1 to Encrypt\n\tType 2 to Decrypt\n\tType 3 to exit");
            Scanner scanner = new Scanner(System.in);
            Integer inputChoice = scanner.nextInt();
            if (inputChoice.equals(1)){
                System.out.println("Type a word and Encrypt");
                String encryptWord = scanner.next();
                System.out.println("Enter an Integer to Encrypt");
                Integer encryptKey = scanner.nextInt();
                CeaserCipher1 ceaserCipher1 = new CeaserCipher1(encryptWord,encryptKey);
                Encrypt encrypt = new Encrypt();
                encrypt.setTheWord(ceaserCipher1.getMName());
                encrypt.setKey(ceaserCipher1.getMkey());
                System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("    Your Encrypted word is : " + " "+encrypt.encrypt_word() + " and the key is "+ encrypt.getMkey() );
                System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
            else if (inputChoice.equals(2)){
                System.out.println("KeyIn encrypted word");
                String decryptedWord = scanner.next();
                System.out.println("Enter the Integer Key used for encryption");
                Integer decryptedKey = scanner.nextInt();
                CeaserCipher1 ceaserCipher1 = new CeaserCipher1(decryptedWord,decryptedKey);
                Decrypt decrypt = new Decrypt();
                decrypt.setTheWord(ceaserCipher1.getMName());
                decrypt.setKey(ceaserCipher1.getMkey());
                System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("    Your decrypted word is: " +" "+ decrypt.decrypt_word() + " " + " and the key is " + decrypt.getMkey());
                System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            }else if (inputChoice.equals(3)){
                mainBranch = false;
            }
            else {
                System.out.println("You made a wrong entry to the specified Datatype");
            }

        }
    }

}
