package com.bjpublic.intellij.tutorial;

import java.util.Arrays;

/*
public class Main
{
    public static final int SIZE = 10;

    public static void main(String[] args)
    {
	// write your code here
        for (int num = 0; num < SIZE; num++)
        {
            int sum = 0;
            int i = 0;
            i = i + num * (num+1);
            sum = sum + i*num;

            System.out.println("Print Sum =" + sum);

            if (num%2 == 0) {
                System.out.println("은(는) 짝수");
            }
            else {
                System.out.println("은(는) 홀수");
            }
            System.out.println("How old are you?");
            Scanner scanner = new Scanner(System.in);
        }
    }
}
*/
/*
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Find the search string in a file - Target 1");
        System.out.println("Find the search string in a file - Target 2");
        System.out.println("Find the search string in a file - Target 3");

        System.out.println("Find the search string in a file - Before 1");
        System.out.println("Find the search string in a file - Before 2");
        System.out.println("Find the search string in a file - Before 3");
    }
}
*/
public class Main {
    public static final int SIZE = 3;

    public static void main(String[] args) {
        int[] array = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = generator();
            System.out.println("Generator complete! - " + array[i]);
        }

        System.out.println("정렬 전 >> " + Arrays.toString(array));

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);

        System.out.println("정렬 후 >> " + Arrays.toString(array));
    }

    public static int generator() {
        return (int) (Math.random() * 10) + 1;
    }
}