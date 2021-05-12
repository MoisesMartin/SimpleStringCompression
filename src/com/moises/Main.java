package com.moises;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Loading user input JEJE
        String input="";
        System.out.println("Escribe una palabra: ");
        Scanner userInput = new Scanner(System.in);
        input = userInput.next();
        StringCompressor compressor = new StringCompressor();
        //ejecutando el metodo sortCharacters el cual necesita del metodo splitWord
        compressor.sortCharacters(compressor.splitWord(input));
        compressor.showList();
    }
}
