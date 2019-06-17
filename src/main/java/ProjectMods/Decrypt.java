package ProjectMods;

public class Decrypt {
    private String mName;
    private int mkey;

    // setter
    public void setTheWord(String name){
        this.mName = name;

    }
    public void setKey(int key){
        this.mkey = key;

    }

    public String getmName(){
        return this.mName;
    }

    public int getMkey(){
        return this.mkey;
    }

    public String decrypt_word(){
        String result = "";
        for (int i =0;i<getmName().length();i++){
            char newChar = getmName().charAt(i);
            char toShiftedLetter = (char) (newChar - getMkey());
            result  += toShiftedLetter;
        }
        return result;
    }


}

