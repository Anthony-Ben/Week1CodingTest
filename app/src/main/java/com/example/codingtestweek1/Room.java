package com.example.codingtestweek1;

import java.util.ArrayList;
import java.util.List;

public class Room {
    public final boolean isInfected;
    public boolean visited = false;
    Room(boolean infected)
    {
        isInfected = infected;
    }

    public static boolean isOutbreak(Room[][] floor) {
    //Your logic here
    List<int[]> infectedList = new ArrayList<>();

        int[] runner = new int[2];
        for(int row = 0; row < floor.length; row++){
            for(int col = 0; col< floor[row].length; col++){
                floor[row][col].visited=true;
                if(floor[row][col].isInfected){
                    runner[0] = row;
                    runner[1] = col;
                    //System.out.println(runner[0] + " " + runner[1]);
                    infectedList.add(runner);
                }
            }
        }


        for(int i = 0; i < ints.length; i++){
            System.out.println();
        }

        return true;
    }

    public static void main(String[] args) {
        Room[][] verticalTrue = new Room[][] {
                {new Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(true), new
                        Room(true), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false), new Room(false), new Room(false), new Room(false), new
                        Room(false) }
        };
        isOutbreak(verticalTrue);
    }
}
