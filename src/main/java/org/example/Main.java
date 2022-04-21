package org.example;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter a sentence:");
        int numWords = 4;
        var scanner = new Scanner(System.in);
        var inString = scanner.nextLine();
        var st = new StringTokenizer(inString);
        System.out.println("Number of words: " + st.countTokens());

    }
}














