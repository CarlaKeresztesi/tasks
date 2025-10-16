package com.ck.tasks1.jsongenerator;

public class JsonGeneratorApp {
    public static void main(String[] args) {

         String firstName = "Alex";
         String lastName = "Chen";
         String email = "alex.chen@example.com";
         String phone = "+44 20 79746 0832";
         String occupation = "Software Engineer";
         boolean is_active = true;
         int years_service = 4;

        StringBuilder jsonBuilder = new StringBuilder(); //created empty StringBuilder with default capacity

        jsonBuilder.append("{\n"); // \n --> new line
        jsonBuilder.append("  \"first_name\": \"" + firstName + "\",\n"); //escape the double quotes as they repres Strings
        jsonBuilder.append("  \"last_name\": \"" + lastName + "\",\n"); // \" --> insert double quote character into the String
        jsonBuilder.append("  \"email\": \"" + email + "\",\n"); // "\",\n" --> adds a closing ", a comma, and a newline (\n)
        ",\n


        System.out.println(jsonBuilder.toString());
    }
}


