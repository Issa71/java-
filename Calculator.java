package com.qa.helloworld;

public class Calculator {

	public static void main(String[] args) {
		System.out.println(Sum(3,6));
        System.out.println(Subtract(7,5));
        System.out.println(Multiply(4,3));
        System.out.println(Divide(1.0,4.0));

	}
	public static int Sum (int a, int b){

        int result = a + b;
        return result;
    }

    public static int Subtract (int a, int b){

        int result = a - b;
        return result;
    }

    public static int Multiply (int a, int b){

        int result = a * b;
        return result;
    }

    public static Double Divide (Double a, Double b){

        Double result = a / b;
        return result;
    }

}
