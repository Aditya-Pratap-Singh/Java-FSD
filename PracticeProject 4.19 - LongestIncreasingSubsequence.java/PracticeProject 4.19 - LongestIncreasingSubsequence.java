package com;
import java.util.*;

public class LongestIncreasingSubsequence {
	
	public static int LongestIncreasingSubsequenceLength(int A[], int len[], int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(A[i]>A[j])
				{
					len[i]=Math.max(len[j]+1,len[j]);
				}
			}
		}
			Arrays.sort(len);
			
			return len[n-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int A[]= new int[n];
		int len[]= new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
			len[i]=1;
		}
		
		System.out.println("Longest increasing subsequence length is: "+ LongestIncreasingSubsequenceLength(A,len,n));

	}

}
