/********************************************************************
// These are the notes for ch 3 used in hayes class


import
//******************************************************************* */


import javax.swing.*;
import java.util.*;

public class ch8starter
{



    // good to use constants to difine arrays
    final static int  MAX = 5000000;
    //static int whatever = 0;

      public static void main (String[] args)
   {


      // System.out.println(sum(5) + "-----");

      // System.out.println( "is" + multiply(3,3) );

       //make int array of 100 and pop with 100 random int' 1-500

        int[] num = new int[MAX];
        Random gen = new Random();



        for ( int i = 0; i < MAX ; i++)
            num[i] = gen.nextInt(1000000)+1;

        for (int j = 4980000 ; j<MAX; j++)
            System.out.print(num[j]+"\t");
            
        RecursiveSorts.quickSort(num);
        
        //sort
        System.out.println("SOORTED LIST ______________________________________");
        
        for(int j = 0; j<MAX; j++)
            System.out.print(num[j] + "\t");


        //Make an array or strings with 10 names
        String[] names = {"Mike", "Jon", "Amber", "Jane",
                          "James", "Homer", "Alex", "Nic",
                          "Emy", "Nolan", "Christine", "Dave"};





/*
    //System.out.println( pow (4,3) + "p");

    System.out.println(reverse("abcd");
    reverse("abcd");


        //ei();
/**/
    //infinite(5);
/**/
   }// end of main







public static int pow (int a, int b)
{

    return 0;
}


 public static double  btp(int a, int b)
{
    return 0;
}


    public static int multiply(int a, int b)
    {
        if (a == 0 || b == 0)
            return 0;
        else
            return a + multiply(a, b-1);
        

    }





    




        public static void ei ()
        {

        }


    public static void foo ( int[] num1)
    {

    }



    public static int sum(int num)
    {
        if (num == 0)
            return 0;
        else return num + sum(num-1);
    }




}//end of class















