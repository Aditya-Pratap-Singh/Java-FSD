package com;
import java.util.*;

public class EmailSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] MailArray = {"aditya@gmail.com","aditya@yahoomail.com","aditya@rediffmail.com","aditya@protonmail.com"};
		boolean b = false;
		System.out.println("Enter the mail to be searched: ");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		for(int i=0;i<MailArray.length;i++) {
			if(s.equals(MailArray[i])) {
				b=true;
				break;
			}
		}
		if(b)
			System.out.println("Mail is found in the array.");
		else
			System.out.println("Mail is not found in the array.");
		

	}

}
