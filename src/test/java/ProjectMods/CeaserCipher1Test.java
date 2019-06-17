package ProjectMods;
import org.junit.Test;
import static org.junit.Assert.*;
public class CeaserCipher1Test {

    @Test
    public void ceaserCipher1_initiatesCorrectly_true(){
        CeaserCipher1 testCipher = new CeaserCipher1("nam",2);
        assertTrue(testCipher instanceof CeaserCipher1);
    }

    @Test
    public void ceaserCipher1_getmName_name(){
        CeaserCipher1 testString = new CeaserCipher1("nam",2);
        Encrypt newEcrypt = new Encrypt();
        newEcrypt.setTheWord(testString.getMName());
        assertEquals("nam",newEcrypt.getMName());
    }

    @Test
    public void ceaserCipher_getmKey_2(){
        CeaserCipher1 testKey = new CeaserCipher1("nam",2);
        Encrypt newEcrypt = new Encrypt();
        newEcrypt.setKey(testKey.getMkey());
        assertEquals(2,newEcrypt.getMkey());
    }

    @Test
    public void ceaserCipher1_setTheWord_String(){
        Encrypt newEncrypt = new Encrypt();
        newEncrypt.setTheWord("me");
        assertEquals("me",newEncrypt.getMName());
    }

    @Test
    public void ceaserCipher1_setTheKey_int(){
        Encrypt newEncrypt = new Encrypt();
        newEncrypt.setKey(2);
        assertEquals(2,newEncrypt.getMkey());
    }

    @Test
    public void ceaserCipher1_encryptWord_encyptedText(){
        CeaserCipher1 testEncryptedText = new CeaserCipher1("nam",2);
        Encrypt encrypt= new Encrypt();
        encrypt.setTheWord(testEncryptedText.getMName());
        encrypt.setKey(testEncryptedText.getMkey());
        assertEquals("pco",encrypt.encrypt_word());
    }

    @Test
    public void ceaserCipher1_dencryptWord_decyptedText(){
        CeaserCipher1 testEncryptedText = new CeaserCipher1("pco",2);
        Decrypt decrypt = new Decrypt();
        decrypt.setKey(testEncryptedText.getMkey());
        decrypt.setTheWord(testEncryptedText.getMName());
        assertEquals("nam",decrypt.decrypt_word());
    }
}
