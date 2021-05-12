package com.moises;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Loading user input JEJE
        String input="";
        System.out.println("Escribe una palabra: (Si se usa espacios solo se tomara la palabra anterior)");
        Scanner userInput = new Scanner(System.in);
        //Al usar .next() nos aseguramos de que solo lea la palabra antes del primer espacio
        input = userInput.next();
        StringCompressor compressor = new StringCompressor();
        //ejecutando el metodo sortCharacters el cual necesita del metodo splitWord
        compressor.sortCharacters(compressor.splitWord(input));
        //El metodo showList debe invocarse solamente después de haberse ejecutado el metodo split por que si y ya :V
        compressor.showList();

    }
}
