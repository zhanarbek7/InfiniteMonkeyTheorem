package com.company;
// @author: Zhanarbek's code

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    String name = "joe";
        Random rand = new Random();
        List<String> reserve = new ArrayList<>();
        int counter = 0;
        StringBuilder randomWord = new StringBuilder("");
        while(true) {
            for(int i = 0; i<name.length(); i++) {
                for(int j = 0; j<name.length(); j++) {}
                char temp = (char) (rand.nextInt(123-98)+98);
                randomWord.append(temp);

                if(name.contentEquals(randomWord)){
                    System.out.println("Random word: "+randomWord);
                    System.out.println("Name: "+name);
                    System.out.println("Успешно нашли c " + counter +" раза!");
                    System.out.println(bruteforce(reserve));
                    System.exit(0);
                }
            }
            System.out.println("Eщё не нашли, получившееся слово: "+randomWord);
            reserve.add(String.valueOf(randomWord));
            randomWord = new StringBuilder("");
            counter++;
        }
    }

    public static boolean bruteforce(List<String> input) {
        for (int i = 0; i < input.size(); i++) {
            for (int j = 0; j < input.size(); j++) {
                if (input.get(i).equals(input.get(j)) && i != j) {
                    System.out.println(input.get(i));
                    System.out.println(input.get(j));
                    return true;
                }
            }
        }
        return false;
    }


}
