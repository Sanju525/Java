
/*
class Array{
    public static void main(String[] args)
        {
            int[] age ;
            age = new int[5];
            System.out.println(age[0]);
            System.out.println(age[1]);
            System.out.println(age[2]);
            System.out.println(age[3]);
            System.out.println(age[4]);

        }

        } */

import java.util.Scanner;
class Array{
    public static void main(String[] args){
        int[] num = new int[5];
        byte i;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the integers");
        for(i=0;i<5;i++)
            num[i] = input.nextInt();       //Tried without any external help...
        for(i=0;i<5;i++)
            System.out.println(num[i]);
    }
}