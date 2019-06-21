package com.example.codingtestweek1;

public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int num2 = 111;
        int num3 = 123;

        System.out.println(num);
        Armstrong armstrong = new Armstrong();
        armstrong.cube(num);
        armstrong.cube(num2);
        armstrong.cube(num3);
    }

    public void cube (int num) {

        int change;
        change = num;
        int ones = change % 10;

        change = change/10;

        int tens = change % 10;

        change = change/10;

        int hundreds = change % 10;

        int result;

        ones = (int)Math.pow(ones,3);
        tens = (int)Math.pow(tens,3);
        hundreds = (int)Math.pow(hundreds,3);

        result = ones + tens + hundreds;

        if(result == num){
            System.out.println(num + " is an armstrong number");
        }

    }

}
