package com.greatlearning.driver;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array");
		int size=sc.nextInt();
		int tranArr[]=new int[size];
		
		System.out.println("Enter the value of array");
		for(int i=0;i<size;i++) {
			tranArr[i]=sc.nextInt();
		}
		
		System.out.println("enter the total number of targets to be achieved");
		int totalTargets=sc.nextInt();
		int count=0;
		//int i=0;
		while(totalTargets!=0) {
			boolean isAchieved=false;
			++count;
			long target=0;
			System.out.println("enter the "+count+" value of target");
			
			target=sc.nextInt();
			
			long sum=0;
			for(int i=0;i<size;i++) {
				sum+=tranArr[i];
				
				if(sum>=target) {
					System.out.println("target is achieved after "+(i+1)+"transactions");
					isAchieved=true;
					break;
				}
			}
			if(!isAchieved) {
				System.out.println("Given target is not achieved");
				
					
				}
				--totalTargets;
			}
		}
	}

