package com.mycompany.apace1st;

public class Apace1st {

    public static void main(String[] args) {

        Integer[] integers = {
            1, 2, 3, 4, 5
        };
        String[] strings ={
           "London", "Paris", "New york", "Austin"
        };
        
        print(integers);
        print(strings);
    }
    
    public static <E> void print(E[] list) {
        for (E item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}

