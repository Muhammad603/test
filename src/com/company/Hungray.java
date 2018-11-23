package com.company;

import java.util.Scanner;
public class   Hungray extends Main
{
    Scanner sc=new Scanner(System.in);

    String Hungry;

    public void message()
    {

        System.out.print("Are u hungry?");
        Hungry=sc.nextLine();

        if(Hungry=="yes")
        {
            System.out.println("Eat samosa");
        }
        else
        {
            System.out.println("Do work");
        }


    }

}
