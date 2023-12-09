package Test;
/*
swap every two elements of an array 
if it is even sized array and create a new array for an odd sized array
 */

import java.util.Scanner;

public class Array_even_odd {

    public static void even_size_array(int[] arr){

//        create new array

        int new_odd_array[]=new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            new_odd_array[i]=arr[i];
        }

//        display the new array


        for (int i:new_odd_array){
            System.out.print(i+" ");
        }

    }
    /*
    even size array
     */
    public static void odd_size_array(int[] arr){

        for(int i=0;i< arr.length-2;i+=2){


//            swap 2 elements in array

            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }


//        display


        for (int i=0;i< arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int n=sc.nextInt();
        /* array inilialization*/

        int arr[]=new int[n];

        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


//        check if array even or odd

        if(n%2==0){
            even_size_array(arr);
        }
        else {
            odd_size_array(arr);
        }


    }

}
