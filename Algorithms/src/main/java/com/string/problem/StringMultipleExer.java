package com.string.problem;

import java.util.*;
import java.util.stream.Collectors;

public class StringMultipleExer {

    public static void main(String[] args) {
        String value = "Hello Manish ";
        String count = "Learn Java with Merit Campus";
        String reverse = "Learn Java with Merit Campus";
        String para = "Java's primary motivation was platform independence and not internet. Platform independence means the ability to write a program on one platform and run it on any other platform without worrying about the platform specific features. If it works on one platform it should work on all other platforms.";
        String key = "it";
        String sent = "Oncz Hescz Sicz Otncz Ymcz Irlfriendgcz Hescz Sicz Ntelligenticz";
        String countWorld = "THIS IS A STRING PROGRAM. IS THIS EASY? YES IT IS";
        StringMultipleExer reverseParagraph = new StringMultipleExer();
        System.out.println(reverseParagraph.reverseParagraph(value));
        System.out.println(reverseParagraph.letterCount(count));
        reverseParagraph.reverseWord(reverse);
        reverseParagraph.searchKeyWord(para, key);
        System.out.println(reverseParagraph.convertToEnglish(sent));
        reverseParagraph.printWordAndItsCount(countWorld);
    }

    int size = 0;

    // Rever a Paragraph like Hello Manish How  -----  How Manish Hello
    private String reverseParagraph(String value) {

        String revered = new String();
        if (value == null || "".equalsIgnoreCase(value) || " ".equalsIgnoreCase(value)) return null;

        StringTokenizer stringTokenizer = new StringTokenizer(value, " ");
        while (stringTokenizer.hasMoreTokens()) {
            String nextString = (String) stringTokenizer.nextToken();
            char[] actual = nextString.toCharArray();
            char[] reversed = new char[actual.length];
            size = actual.length - 1;
            for (int i = 0; i < actual.length; i++) {
                reversed[size] = actual[i];
                size--;
            }
            size = 0;
            revered = revered + " " + String.valueOf(reversed);
        }
        return revered;
    }

    // Work counte like Hi Manish -- 26 or Hello And Hi --- 532
    private String letterCount(String value) {
        String finalNumber = "";
        if (value == null || "".equalsIgnoreCase(value) || " ".equalsIgnoreCase(value)) return null;

        StringTokenizer stringTokenizer = new StringTokenizer(value, " ");
        while (stringTokenizer.hasMoreTokens()) {
            String nextString = (String) stringTokenizer.nextToken();
            int count = nextString.length();
            finalNumber = finalNumber + count;
        }
        return finalNumber;
    }

    // Learn Java with Merit Campus to ---- Campus Merit with Java Learn
    private void reverseWord(String value) {
        if (value == null || "".equalsIgnoreCase(value) || " ".equalsIgnoreCase(value)) {
            System.out.println("null");
        }

        StringTokenizer stringTokenizer = new StringTokenizer(value, " ");
        System.out.println(stringTokenizer.countTokens());
        String[] reveredWord = new String[stringTokenizer.countTokens()];
        int size = stringTokenizer.countTokens() - 1;
        while (stringTokenizer.hasMoreTokens()) {
            String nextString = (String) stringTokenizer.nextToken();
            reveredWord[size] = nextString + " ";
            size--;
        }
        System.out.print("Reverse=============    ");
        Arrays.asList(reveredWord).stream().forEach(System.out::print);
    }

    // Search specific key in given sentence and count them
    private void searchKeyWord(String value, String key) {

        if (value == null || "".equalsIgnoreCase(value) || " ".equalsIgnoreCase(value)) {
            System.out.println("null");
        }
        Map<String, Integer> counter = new HashMap<>();
        StringTokenizer stringTokenizer = new StringTokenizer(value, " ");
        while (stringTokenizer.hasMoreTokens()) {
            String str = (String) stringTokenizer.nextToken();
            if (str != null && str.equalsIgnoreCase(key)) {
                if (counter.containsKey(key)) {
                    counter.put(key, counter.get(key) + 1);
                } else {
                    counter.put(key, 1);
                }
            }
        }
        System.out.println("\n");
        System.out.println(counter.entrySet().stream().mapToInt(a -> a.getValue()).max().getAsInt());

    }

    // Convert Pig Latin Sentence to java english sentence
    //Pig Latin to English remove the last two characters, after this move the current last character to the front and make every thing to lower case.

    private String convertToEnglish(String value) {
        if (value == null || "".equalsIgnoreCase(value) || " ".equalsIgnoreCase(value)) return null;
        String finalSentence = new String();
        StringTokenizer stringTokenizer = new StringTokenizer(value, " ");
        while (stringTokenizer.hasMoreTokens()) {
            String str = (String) stringTokenizer.nextToken();
            str = str.substring(0, str.length() - 2);
            char lastChar = str.charAt(str.length() - 1);
            String takeString = str.substring(0, str.length() - 1);
            takeString = String.valueOf(lastChar) + takeString;

            finalSentence = finalSentence + " " + takeString.toLowerCase();
        }
        return finalSentence;

    }

    // Print all words with count for given paragraph
    private void printWordAndItsCount(String value) {
        if (value == null || "".equalsIgnoreCase(value) || " ".equalsIgnoreCase(value)) {
            System.out.println("null");
        }
        value = value.replace(".","");
        value = value.replace("?","");
        System.out.println(value);
        StringTokenizer stringTokenizer = new StringTokenizer(value, " ");
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        while(stringTokenizer.hasMoreTokens()){
            String token = (String) stringTokenizer.nextToken();
            if(stringIntegerMap.containsKey(token)){
                stringIntegerMap.put(token, stringIntegerMap.get(token)+1);
            }else{
                stringIntegerMap.put(token, 1);
            }
        }

        System.out.println("Iterate. now");
        stringIntegerMap.entrySet().stream().filter(Objects::nonNull).collect(Collectors.toList()).forEach(System.out::println);

    }
}
