package org.example;

import java.time.Instant;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DeepDive {
    public static void main(String[] args) throws InterruptedException {
        var ins1 = Instant.now();
        System.out.println(ins1.truncatedTo(ChronoUnit.MINUTES));
        Thread.sleep(10_000); // Sleep for 10 seconds

        var ins2 = Instant.now();
        System.out.println(ins2.truncatedTo(ChronoUnit.MINUTES));



        System.out.println(
                ins1.truncatedTo(ChronoUnit.MINUTES)
                        .compareTo(ins2.truncatedTo(ChronoUnit.MINUTES))
        );
    }
}