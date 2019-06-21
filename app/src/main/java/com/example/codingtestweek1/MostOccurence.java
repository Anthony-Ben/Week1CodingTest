package com.example.codingtestweek1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class MostOccurence{

    public static void main(String[] args) {

        int[]testArray = new int[]{1,1,5,4,4,4,3,2,9,9,9,};

        MostOccurence mostOccurence = new MostOccurence();

        mostOccurence.mostOccurred(testArray);

    }


    public void mostOccurred(int[] array){
        //make an array that holds the key
        //how to get the unique numbers
        //minVal
        //first sort the array
        Arrays.sort(array);

        int[] maxPair = new int[2];
        int totalOf = 0;


        for(int i = 1; i < array.length; i++){
            //System.out.println(array[i]);
            if(array[i-1]== array[i]){
                totalOf++;
                if(maxPair[1]< totalOf && (maxPair[0])< array[i-1]){
                    maxPair[0] = array[i-1];
                    maxPair[1] = totalOf;
                    totalOf = 0;
                }
                //System.out.println(totalOf);
            }
        }
        System.out.println(maxPair[0]);
    }
}