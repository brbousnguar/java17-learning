package org.example;

import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class loop {
    public static void main(String[] args) {
        skip: {
            if (Math.random() > 0.5 ) break skip;
            System.out.println("That was a small number");
        }
        System.out.println("Finished");

        // Break is completely abandoned the loop
        // Continue is skipping the current iteration
        outer: for (var x = 0; x < 5; System.out.println(), x++) {
            for (var y = 0; y < 5; y++) {
                if (y == x) continue outer;
                System.out.printf("x=%d, y=%d : ", x, y);
            }
        }
    }
}