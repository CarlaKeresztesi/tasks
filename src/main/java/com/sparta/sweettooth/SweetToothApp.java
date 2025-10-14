package com.sparta.sweettooth;

public class SweetToothApp {
    public static void main(String[] args) {
        int totalNumberOfSweets = 40;
        int students = 14;

        int sweetsLeft = totalNumberOfSweets % students;
        System.out.println("Number of sweets the teacher keeps: " + sweetsLeft);

        int sweetsEach = totalNumberOfSweets / students;
        System.out.println("Number of sweets each child will receive: " + sweetsEach);

    }
}
