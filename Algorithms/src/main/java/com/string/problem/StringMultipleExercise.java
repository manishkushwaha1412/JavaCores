package com.string.problem;

public class StringMultipleExercise {

    int size = 0;

    public static void main(String[] args) {
        StringMultipleExercise stringMultipleExercise = new StringMultipleExercise();
        System.out.println(stringMultipleExercise.reverseString("kushwaha"));
        System.out.println(stringMultipleExercise.checkIfStringContainsOnlyDigit("4678"));
        System.out.println(stringMultipleExercise.checkIfStringContainsOnlyDigit2("asd4678"));
    }
    private  String reverseString(String value){
        char[] charA = value.toCharArray();
        char[] mchar = new char[charA.length];
        size = charA.length-1;
        for (int i = 0; i < charA.length; i++) {
            mchar[size] = charA[i];
            size--;
        }
        return String.valueOf(mchar);
    }

    private boolean checkIfStringContainsOnlyDigit(String value){
        return value.matches("[0-9]+");
    }
    private boolean checkIfStringContainsOnlyDigit2(String value){
        char val[] = value.toCharArray();
        for (Character c: val   ) {
            if(!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
}
