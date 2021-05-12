package com.moises;

import java.util.ArrayList;
import java.util.Collections;

public class StringCompressor {
    private ArrayList<Character> chars = new ArrayList<>();

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
    //If invoked before sorting it will just show the char list as given originally
    public void showList(){
        for(int i=0; i<chars.size();i++){
            System.out.print(chars.get(i) +", ");
            if(i == chars.size()-1){
                System.out.print(chars.get(i));
            }
        }
    }
}
