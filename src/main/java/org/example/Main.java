package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        var inputString = myScanner.nextLine();
        var stringTokenizer = new StringTokenizer(inputString);
        var list = new ArrayList<Integer>();

        while(stringTokenizer.hasMoreTokens()) {
            var word = stringTokenizer.nextToken();
            list.add(word.length());
        }

        System.out.println(list);

    }}



