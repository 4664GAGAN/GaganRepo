//package java_Conversions;

import java.util.Scanner;

public class Convertvalues {

	public static void main(String[] args) {
		
		System.out.println("Enter the conversion number\n");
		System.out.println(" 1: km to mi\n 2: lo to lg\n 3: C to F\n 4: C to K \n 5: L to Cup\n 6: Cup to L\n");
		Scanner obj = new Scanner(System.in);
		
		int n=obj.nextInt(); ;
		if(n==1) {
			System.out.println("Enter the input value\n");
			int input=obj.nextInt();
			//double km=input.nextDouble();
                          double miles=input/1.609;
			System.out.println(miles);
		}else if(n==2) {
			System.out.println("Enter the input value\n");
			int loz=obj.nextInt();
			double log=loz*28.35;
			System.out.println(log);
		}else if(n==3) {
			System.out.println("Enter the input value\n");
			int C=obj.nextInt();
			double F=(C*9/5)+32;
			System.out.println(F);
		}else if(n==4)
		{
			System.out.println("Enter the input value\n");
			int C=obj.nextInt();
			double K = C+273.15;
			System.out.println(K);
		}else if(n==5)
		{
			System.out.println("Enter the input value\n");
			int L=obj.nextInt();
			double cup=L*4.17;
			System.out.println(cup);
		}else if(n==6)
		{
			System.out.println("Enter the input value\n");
			int Cup=obj.nextInt();
			double L=Cup*0.24;
			System.out.println(L);
		}

	}

}
