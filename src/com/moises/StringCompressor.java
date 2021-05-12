package com.moises;

import java.util.ArrayList;
import java.util.Collections;

public class StringCompressor {
    private ArrayList<Character> chars = new ArrayList<>();


    public ArrayList<Character> getChars() {
        return chars;
    }

    public void setChars(ArrayList<Character> chars) {
        this.chars = chars;
    }



    //Default Constructor
    public StringCompressor(){

    }
    //

    public ArrayList<Character> splitWord(String userInput){
        for(int i = 0; i<userInput.length();i++){
            chars.add(userInput.charAt(i));
        }
        return chars;
    }
    public ArrayList<Character> sortCharacters(ArrayList<Character> chars){
        Collections.sort(chars);
        return chars;
    }
    //If invoked before sorting it won't have any values
    public void showList(){
        if(chars.size()==0){
            splitWord("NULL");
        }
        for(int i=0; i<chars.size();i++){
            if(i == chars.size()-1){
                System.out.print(chars.get(i));
            }else{
                System.out.print(chars.get(i) +", ");
            }
        }
    }
    public void simpleCompression(ArrayList<Character> collection){

    }
}
