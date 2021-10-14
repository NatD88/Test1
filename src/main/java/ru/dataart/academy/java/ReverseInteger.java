package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 12
     * -2,147,483,648 -> exception, error message
     */

    public int reverse(int inputNumber) {
        //Task implementation
        int result = 0;
        if (inputNumber > Integer.MAX_VALUE || inputNumber < Integer.MIN_VALUE)
            throw new RuntimeException("number is out of range");
        while (inputNumber !=0) {
            result =  result * 10 + inputNumber% 10;
            inputNumber = inputNumber/10;
        }
        return result;
    }
}
