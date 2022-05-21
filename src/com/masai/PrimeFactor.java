package com.masai;

public class PrimeFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 12;
		String bag = "";
		if(number>2 && number<100) {
			for(int i=1; i<=number; i++) {
				if(number%i == 0) {
					bag += i+" ";
				}
			}
		System.out.println(bag);
		}
		else {
			System.out.println("Invalid number");
		}
	}
}

	


