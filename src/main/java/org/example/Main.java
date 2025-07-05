package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    LocalDate ld = LocalDate.now();
//        LocalTime lt = LocalTime.from(ld);
    System.out.println(ld.isSupported(ChronoField.YEAR));
    System.out.println(ld.isSupported(ChronoField.HOUR_OF_DAY));


    }
}