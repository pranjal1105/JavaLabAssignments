package com;



public class CheckPositive {
	
	public static void main(String[] args) {
		int num=0;
		//System.out.println("Enter a number");
		//Scanner sc = new Scanner(System.in);
		//num=sc.nextInt();
		num= Integer.parseInt(args[0]);
		if(num>0)
		{
			System.out.println("Positive");
		}
		else
		{
			System.out.println("Negative");
		}
	}

}
