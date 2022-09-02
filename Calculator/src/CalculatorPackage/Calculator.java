package CalculatorPackage;
public class Calculator {
	public static void main(String[] args) {
		int height1 = 72;
		int height2 = 61;
		int height3 = 77;
		int height4 = 74;
		int height5 = 72;
		int sum = height5 + height4 + height3 + height2 + height1;
		double avg = sum / 5;
		System.out.println("The average height of these students is " + avg + " inches.");
	}
}
