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

    public boolean validateEmail() {

        System.out.println("Enter Your Email");
        String email = scan.next();
        System.out.println("The email is: " + email);
        String regExp = "^[a-zA-Z0-9]+([.+-_][a-zA-Z0-9]+)*@[a-zA-z0-9]+.[a-zA-Z]{2}([.][a-zA-Z]{2,4}){0,1}$";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean validateMobNum() {

        System.out.println("Enter Your Mobile No.");
        String number = scan.next();
        System.out.println("The Mobile No is: " + number);
        String regExp =  "^(\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})\\d{3}\\d{4}$";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();

    }

    public boolean validPassword() {

        System.out.println("Enter Your Password.");
        String name = scan.next();
        System.out.println("The Password is: " + name);
        String regExp =  "^[A-Za-z0-9]{8,}$";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();

    }

    public static void main(String[] args) {

        boolean result1 = new UserRegistration().validateUserData();
        boolean result2 = new UserRegistration().validateUserDataLastName();
        boolean result3 = new UserRegistration().validateEmail();
        boolean result4 = new UserRegistration().validateMobNum();
        boolean result5 = new UserRegistration().validPassword();
        System.out.println(result5);
    }



}
