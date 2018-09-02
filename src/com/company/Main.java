package com.company;

public class Main {

    public static void main(String[] args)
    {
	int Num1 = 10;
	int Num2 = 100;
	int Num3 = 2;
	int Num4 = 51;

	int Result1 = Num1 + Num3;
	System.out.println("Result 1: " + Num1 + " + " + Num3 + " = " + Result1);
	int Result2 = Result1 - Num4;
	System.out.println("Result 2: " + Result1 + " - " + Num4 + " = " + Result2);
	int Result3 = Result2 * Num2;
	System.out.println("Result 3: " + Result2 + " * " + Num2 + " = " + Result3);
	int Result4 = Result3 / Result1;
	System.out.println("Result 4: " + Result3 + " / " + Result1 +  " = " + Result4);
	int Result5 = Result4 % Num3;
	System.out.println("Result 5: " + Result4 + " % " + Num3 +  " = " + Result5);
    }
}
