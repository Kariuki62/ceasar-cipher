package ProjectMods;

public class Encrypt {
    private String mName;
    private int mkey;
    public String getMName(){
        return this.mName;
    }
    public int getMkey(){
        return this.mkey;
    }
    //setter
    public void setTheWord(String name){
        this.mName = name;
    }
    public void setKey(int key){
        this.mkey = key;
    }
    public String encrypt_word(){
        String result = "";
        for (int i =0;i<getMName().length();i++){
            char newChar = getMName().charAt(i);
            char toShiftedLetter = (char) (newChar + getMkey());
            result  += toShiftedLetter;
        }
        return result;
    }

}

