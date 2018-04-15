package com.company;


import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String collect = s.chars()
                .filter(c -> !Character.isDigit(c))
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        collect = collect.replace("." , ". ");
        collect = collect.replace(",", ", ");
        collect = collect.replace("?", "? ");
        collect = collect.replace("!", "! ");
        collect = collect.replace(":", ": ");
        collect = collect.replace(";", "; ");
        System.out.println(s);
        System.out.println(collect.replaceAll("[\\s]{2,}", " "));

    }
}