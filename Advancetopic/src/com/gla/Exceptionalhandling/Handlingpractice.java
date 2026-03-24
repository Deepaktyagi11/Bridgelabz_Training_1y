package com.gla.Exception;
class InvalidAgeCheckerException extends  Exception{
    public InvalidAgeCheckerException(String msg){
        super(msg);
    }
}

public class Handlingpractice{
    static void ageChecker(int age) throws InvalidAgeCheckerException {
        if (age < 18) {
            throw new InvalidAgeCheckerException("Age is invalid for voting");
        }
        System.out.println("Valid age for voting");
    }

    public static void main(String[] args) {
        try{
            ageChecker(20);
        } catch (InvalidAgeCheckerException e){
            System.out.println(e);
        }
    }
}