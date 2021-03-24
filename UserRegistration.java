package com.bridgelabz.useregistration;


import java.util.Scanner;
import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final Scanner scan = new Scanner(System.in);

    //method
    public boolean validateUserData() {

        System.out.println("Enter Your First name");
        String firstName = scan.next();
        System.out.println("The first name is: " + firstName);
        String regExp = "^([A-Z]{1})([a-z]{2,})$";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public boolean validateUserDataLastName() {

        System.out.println("Enter Your Last name");
        String lastName = scan.next();
        System.out.println("The last name is: " + lastName);
        String regExp = "^([A-Z]{1})([a-z]{2,})$";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }
    public static void main(String[] args) {

        boolean result1 = new UserRegistration().validateUserData();
        boolean result2 = new UserRegistration().validateUserDataLastName();
        System.out.println(result2);
    }



}
