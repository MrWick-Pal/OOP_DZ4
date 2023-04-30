package org.example;

import org.example.Classes.Calc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("--==== Простые операции ====--");
        Calc<?> calculator = new Calc<>();
        System.out.print("1. Умножение чисел: ");
        List<Number> someNumber1 = new ArrayList<>(Arrays.asList(5, 5));
        Double result1 = calculator.multiply(someNumber1);
        System.out.println(result1);
        System.out.print("2. Деление чисел: ");
        List<Number> someNumber2 = new ArrayList<>(Arrays.asList(25, 5));
        Double result2 = calculator.divide(someNumber2);
        System.out.println(result2);
        System.out.println("--==== Бинарные переводы ====--");
        System.out.print("Целые числа тип Integer: ");
        List<Object> iNumber1 = new ArrayList<>(Arrays.asList(5, 456));
        System.out.println(calculator.digitBinary(iNumber1));
        System.out.print("Вещественные числа тип Double/Float: ");
        List<Object> iNumber2 = new ArrayList<>(Arrays.asList(43.3, 23.0, 456.45656723));
        System.out.println(calculator.digitBinary(iNumber2));
        System.out.print("Строковое представление числа: ");
        List<Object> iNumber3 = new ArrayList<>(Arrays.asList("55", "12.0"));
        System.out.println(calculator.digitBinary(iNumber3));
        System.out.print("Символьное представление числа: ");
        List<Object> iNumber4 = new ArrayList<>(Arrays.asList('4', '9'));
        System.out.println(calculator.digitBinary(iNumber4));
    }
}