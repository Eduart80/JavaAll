package JavaInDepth;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        array1();


    }
    static void array1(){
        int[] score = new int[4];
        score[0]= 12;
        score[1]=23;
        score[2]=34;
        score[3]= 100;
        System.out.println(Arrays.toString(score));
        int[] score2 = new int[] {90,23,44,11};
        System.out.println(Arrays.toString(score2));
        int[] score3 = {55,22,33,11};
        System.out.println(Arrays.toString(score3));
    }
}
