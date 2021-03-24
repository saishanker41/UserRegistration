package com.bridgelabz.useregistration;


import java.util.Scanner;
import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final Scanner scan = new Scanner(System.in);

    //method
    public boolean validateUserData(String firstName) {


        System.out.println("The first name is: " + firstName);
        String regExp = "^([A-Z]{1})([a-z]{2,})$";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();



    }
    public static void main(String[] args) {
        System.out.println("Enter Your First name");
        String firstName = scan.next();
        boolean result = new UserRegistration().validateUserData(firstName);
        System.out.println(result);
    }



}
