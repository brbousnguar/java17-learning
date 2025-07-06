package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class switchArrow {
    public static void main(String[] args) {
        // print a classical switch statement
        // the day should be generated dynamically
        String day = "Wednesday";
        switch (day) {
            case "Monday"->
                System.out.println("Start of the week");
            case "Tuesday"->
                System.out.println("Second day of the week");
            case "Wednesday"->
                System.out.println("Midweek day");
            case "Thursday"->
                System.out.println("Almost weekend");
            case "Friday"->
                System.out.println("End of the work week");
            default->
                System.out.println("It's the weekend!");
        }

    }
}