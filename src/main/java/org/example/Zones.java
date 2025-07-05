package org.example;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoField;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Zones {
    public static void main(String[] args) {
        ZoneId zi = ZoneId.of("Europe/Paris");
        System.out.println(zi.getId());
    }
}