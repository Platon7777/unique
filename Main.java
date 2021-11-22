package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,4,5,1,1,3,};
        System.out.println(uniqueCount(array));
    }

    static int uniqueCount(int[] array) {
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (array[j] == array[i]) {
                    unique = false;
                }
            }
            if (unique == true){
                result = result + 1;
            }
        }
        return result;
    }
}