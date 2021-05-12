package com.moises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class StringCompressor {
    private ArrayList<Character> chars = new ArrayList<>();
    private ArrayList<Integer> asciiCode = new ArrayList<>();
    private int maxCapacity = 100;
    StringBuilder finalStr = new StringBuilder(maxCapacity);

    public ArrayList<Character> getChars() {
        return chars;
    }

    public void setChars(ArrayList<Character> chars) {
        this.chars = chars;
    }



    //Default Constructor
    public StringCompressor(){

    }
    //this method takes the user input and split it in to an arraylist in order to be able to sort it quickly
    public ArrayList<Character> splitWord(String userInput){
        if(userInput.length() <= maxCapacity){
            for(int i = 0; i<userInput.length();i++){
                chars.add(userInput.charAt(i));
            }
        }else{
            System.out.println("Input Exceeds the max length: "+maxCapacity);
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
    public void compressString(ArrayList<Character> collection){
        //La idea de ordenarlos es que ponga juntas las letras repetidas para hacer una comparacion de un index y un index+1

        int index = 0, nextIndex= 0;
        int repeatedCount = 1;//Esto por que cada letra siempre estara mínimo 1 vez
        char currentChar = collection.get(index), nextChar = collection.get(nextIndex);
        int nextASCII=(int)nextChar;

        //1111111111111111111111111111111111111111111111111
        for(int j=0;j<collection.size();j++){
            //Quiero comparar el char actual con el siguiente
            try{
                index = j;
                nextIndex = j+1;
                currentChar = collection.get(index);
                nextChar = collection.get(nextIndex);
            }catch (Exception e){
                //Como siempre va a votar la excepcion al ultimo, le digo pues ya el valor del ultimo elemento directamente :V
                asciiCode.add((int)collection.get(collection.size()-1));
            }
            //Para tomar sus codigos ascii siempre y cuando el caracter actual sea distinto del siguiente para tener una lista de caracteres unicos
            if(nextChar != currentChar){
                int currentASCII = (int)currentChar;
                asciiCode.add(currentASCII);
            }
        }
        //111111111111111111111111111111111111111111111111
        //solo pa' debugear quiero mostrar los valores del asciiCode(ArrayList)
        for (Integer val:asciiCode) {
            System.out.print(val+" ");
        }
        System.out.println("");
    }
    public HashMap<Integer,Character> getRepeatedCharactersCounts(ArrayList<Character> collection){
        HashMap<Integer,Character> getCounts = new HashMap<>();


        return getCounts;
    }
}
