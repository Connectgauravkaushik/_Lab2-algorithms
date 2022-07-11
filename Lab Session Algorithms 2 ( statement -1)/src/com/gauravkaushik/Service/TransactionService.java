package com.gauravkaushik.Service;

import java.util.Scanner;

public class TransactionService {

public void checkTransaction(int arr[], int targetNo ) {
	Scanner sc = new Scanner(System.in);
	
	//for(int i=0; i<targetNo-1; i++) for reference only instead of while we can write for loop as well.
	
	
       while(targetNo-- !=0) {
		int flag =0;
		long target;
		
		System.out.println("enter the value of target");
		
		target = sc.nextInt();	
		
		long sum=0;
		
		  for(int i=0; i<arr.length; i++) {
			
			sum+=arr[i];
			
			if(sum >= target) {
				System.out.println("Target achieved "+(i+1) + "transaction");
				flag =1;
				break;
			}
		}
		
		if(flag==0) {
			System.out.println("Given target is not achieved");
			
		}
	}	
	
	sc.close();
   }
}

