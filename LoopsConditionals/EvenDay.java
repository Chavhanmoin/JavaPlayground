package LoopsConditionals;

import java.util.Scanner;

public class EvenDay {
    public static void main(String[] args) {
        int count=0;
        for(int day=1;day<=31;day++){
            if (day%2==0){
                count++;
            }

        }
        System.out.println("Kunal can go "+ count +" days out.");
    }
}
