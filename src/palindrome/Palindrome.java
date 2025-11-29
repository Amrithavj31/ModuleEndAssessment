package palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int num,rem,temp,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		temp=num;
		while (num>0){
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}	
		if (sum==temp) {
			System.out.println(temp+"\t is palindrome");
		}
		else {
			System.out.println(temp+"\t is not palindrome");
		}
	}
}
