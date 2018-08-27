import java.io.*;
import java.util.*;

 class ArrayMin
{
   public static void main(String args[])
   {
       int small, size, i;
       int arr[] = new int[50];
       Scanner sc = new Scanner(System.in);
	   
       System.out.print("Enter Array Size : ");
       size = sc.nextInt();
	   
       System.out.print("Enter Array Elements : ");
       for(i=0; i<size; i++)
       {
           arr[i] = sc.nextInt();
       }
	   
       System.out.print("Searching for the Smallest Element....\n\n");
	   
       small = arr[0];
	   
       for(i=0; i<size; i++)
       {
           if(small > arr[i])
           {
               small = arr[i];
           }
           
       }
