package com.day3;

public class VowelAndConsonant {
    void checkCharacter(char ch){
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                System.out.println("Vowel");
            }
            else{
                System.out.println("Consonant");
            }
        }
        else System.out.println("Invalid Character!");

    }

    public static void main(String[] args) {

        VowelAndConsonant obj = new VowelAndConsonant();

        obj.checkCharacter('a');
        obj.checkCharacter('I');
        obj.checkCharacter('B');
        obj.checkCharacter('c');
        obj.checkCharacter('8');
    }


}
