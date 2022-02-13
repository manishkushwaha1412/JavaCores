package com.practice.algo;

import com.sun.deploy.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

public class StringProblem {

    public static void main(String[] args) {
        StringProblem stringProblem = new StringProblem();
        String reverse = "Hello my name is Manish";
        stringProblem.reverseParagraph(reverse);
        String count = "Hello Manish how";
        stringProblem.countCharacters(count);

        // Identify duplicate numbers in the list
        List<Integer> numbers = Arrays.asList(2, 4, 5, 7, 4, 3, 2, 7, 6, 5);
        Set<Integer> duplicates = new HashSet<>();
        numbers.stream().filter(n -> !duplicates.add(n)).collect(Collectors.toList()).forEach(System.out::println);

        String sent = "is a, b. d, asdsa wrewer, sdfdsf sddsf, a sdfdsf";
        sent =  sent.replaceAll("[.,]","");
        System.out.println(sent);
        List<String> strings = Arrays.asList(sent.split("\\s+"));
        Set<String> duplicateString = new HashSet<>();
        strings.stream().filter(s-> !duplicateString.add(s)).collect(Collectors.toList()).forEach(System.out::println);


    }


    // Reverse a Paragraph like Hello Manish How  -----  How Manish Hello
    public void reverseParagraph(String value){
        if(value == null) return;
        StringTokenizer stringTokenizer = new StringTokenizer(value, " ");
        int token =  stringTokenizer.countTokens();
        String[] revered = new String[token];
        while (stringTokenizer.hasMoreTokens()){
            String tokenn =  stringTokenizer.nextToken();
            revered[token-1] = tokenn;
            token--;
        }
        System.out.println("Revered of "+value +" is \n "+ Arrays.toString(revered));
    }

    // Word count like Hi Manish -- 26 or Hello And Hi --- 532
    private void countCharacters(String value ){
        if(value == null || value.matches("^$")) return;
        StringTokenizer stringTokenizer = new StringTokenizer(value, " ");
        String counter = "";
        while (stringTokenizer.hasMoreTokens()){
            String text =  stringTokenizer.nextToken();
            counter = counter+text.length();
        }
        System.out.println("Character count for "+ value +" is :: "+counter);

    }

    // Learn Java with Merit Campus to ---- Campus Merit with Java Learn

    // Search specific key in given sentence and count them

    /* Convert Pig Latin Sentence to java english sentence
    //Pig Latin to English remove the last two characters, after this move the current last character to the front and make every thing to lower case.

    // Print all words with count for given paragraph
     */
}
