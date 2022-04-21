
package org.example;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        int numOfThes = 0;
        System.out.println("Enter a sentence: ");
        var scanner = new Scanner(System.in);
        var inString = scanner.nextLine();
        var st = new StringTokenizer(inString);
        while (st.hasMoreTokens()) {
            if (st.nextToken().equalsIgnoreCase("the")) {
                numOfThes++;
            }
        }
        System.out.println("Number of THEs: " + numOfThes);
    }

}














