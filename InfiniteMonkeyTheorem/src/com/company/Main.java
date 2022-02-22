package com.company;
// @author: Zhanarbek's code

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    String name = "Erlan Omarbekov";
        Random rand = new Random();
        int i = 0;
        int counter = 0;
        StringBuilder randomWord = new StringBuilder("");
        while(!name.contentEquals(randomWord)){
            char temp = (char) (rand.nextInt(123));
            if(temp==name.charAt(i)){
                randomWord.append(temp);
                if(randomWord.equals(name)){
                    System.exit(0);
                }
                i++;
            }
            counter++;
            System.out.println(counter+"-йы раз "+"   Попалась буква "+temp+" "+"\n");
            System.out.println("Собранное слово = \n"  + randomWord+"\n");
        }
    }




}
