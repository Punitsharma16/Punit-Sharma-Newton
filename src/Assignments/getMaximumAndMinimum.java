package Assignments;

import java.util.Scanner;

public class getMaximumAndMinimum {
        //function for find the maximum in the array.
    static int GetMax(int[] arr){
            int max = arr[0];

            for(int i=0; i<arr.length; i++){
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            return max;
        }

        //function to find the minimum in the array.
        static int GetMin(int[] arr){
            int min = arr[0];
            for(int i=0; i<arr.length; i++){
                if(arr[i]<min){
                    min = arr[i];
                }
            }
            return min;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of array");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the array");
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("The maximum value is : "+GetMax(arr));
            System.out.print("The minimum value is : "+GetMin(arr));

        }
    }
