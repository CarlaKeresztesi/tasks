package com.sparta.debug;

public class DebugApp {
    public static void main(String[] args) {
        var name = "Josh Crabtree";
        String occupation = "trainee";
        String location = "London";
        var activityLevel = "moderate";

        System.out.println("My name is " + name);
        System.out.printf("I am a %s in %s%n", occupation, location);

        int age = 21;
        System.out.println("I am " + age + " years of age, with a "+ activityLevel + " activity level");

        // or formatted:
        System.out.printf("I am %d years of age, with a %s activity level.%n", age, activityLevel);
        
    }
}
