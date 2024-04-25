package com.calculator;

import static java.lang.Integer.parseInt;

public class StringCalculator {
    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        if (!numbers.contains(",")) {
            return parseInt(numbers);
        } else if (numbers.contains("\n")) {
            var noLine = numbers.replace("\n",",");
            return calc(noLine);
        } else {
            return calc(numbers);
        }
    }

    public static int calc(String entry) {

        var charNumbers = entry.split(",");

        var sum = 0;
        for(int i = 0; i < charNumbers.length; i++) {
            sum += parseInt(charNumbers[i]);
        }
        return sum;
    }

}
