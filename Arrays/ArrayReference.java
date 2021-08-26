package com.company.Arrays;

import java.util.Arrays;

public class ArrayReference {
    public static void main(String[] args){
        int[] array1=new int[5];
        int[] array2=array1;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        array2[0]=1;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        String[] string1=new String[5];
        System.out.println(Arrays.toString(string1));

    }
}
