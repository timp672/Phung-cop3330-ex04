/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tim Phung
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        //user input
        System.out.println( "Enter a noun: ");
        String noun = scan.nextLine();

        System.out.println( "Enter a verb: ");
        String verb = scan.nextLine();

        System.out.println( "Enter an adjective: ");
        String adjective = scan.nextLine();

        System.out.println( "Enter an adverb: ");
        String adverb = scan.nextLine();

        //print statement
        System.out.println("Do you " +verb+ " your " +adjective+ " " +noun+ " " +adverb+ "? That's hilarious!");
    }
}
