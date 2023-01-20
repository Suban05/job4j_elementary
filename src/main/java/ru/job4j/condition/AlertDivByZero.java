package ru.job4j.condition;

public class AlertDivByZero {
    public static void possibleDiv(int number) {
        var message = "";
        if (number == 0) {
            message = "Could not div by 0.";
        } else if (number < 0) {
            message = "This is negative number";
        }
        if (!message.isEmpty()) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        AlertDivByZero.possibleDiv(4);
        AlertDivByZero.possibleDiv(0);
        AlertDivByZero.possibleDiv(-1);
    }
}