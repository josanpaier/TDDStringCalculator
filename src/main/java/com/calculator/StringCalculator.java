package com.calculator;

import static java.lang.Integer.parseInt;

public class StringCalculator {
    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        if (!numbers.contains(",")) {
            return parseInt(numbers);
        }

        var charNumbers = numbers.split(",");

        var soma = 0;
        for(int i = 0; i < charNumbers.length; i++) {
            soma += parseInt(charNumbers[i]);
        }
        return soma;

    }

}
