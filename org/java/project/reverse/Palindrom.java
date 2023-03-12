package org.java.project.reverse;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {

        String reverseWord = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String word = scanner.nextLine();

        for (int i = word.length()-1; i >= 0; i--) {
            reverseWord += word.charAt(i);
        }

        if (word.equals(reverseWord)){
            System.out.println(word + " kelimesi bir palindromdur");
        }else{
            System.out.println(word + " kelimesi palindrom değildir");
        }
    }

}
