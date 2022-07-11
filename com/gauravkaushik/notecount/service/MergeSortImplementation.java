package com.gauravkaushik.notecount.service;

public class MergeSortImplementation {
	public void sort(int arr[],int left, int right) {
		if(left < right) {
			int mid =(left+ right)/2;
			
			sort(arr, left, mid);
			sort( arr, mid+1, right);
			
			merge(arr, left, mid, right);
		}
	}
	void merge(int arr[], int left, int mid, int right) {
		//Find the sizes of two sub arrays to be merged
		int n1 = mid-left+1;
		int n2 = right-mid;
		
		//create a temporary array
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];
		
		//copy data to temporary array
		for(int i=0; i<n1; ++i) {
	       leftArray[i]= arr[left +i];
		}
		for(int j=0; j<n2; ++j)
			rightArray[j] = arr[mid+1+j];
		
		//Merge the temporary arrays
		
		//Initial indexes of first and second sub-arrays
		int i=0, j=0;
		
		//initial indexes of merged sub-array array
		int k= left;
		
		while(i < n1 && j< n2) {
			if(leftArray[i] >= rightArray[j] ) {
             arr[k]= leftArray[i];
             i++;	
			}else {
				arr[k]= rightArray[j];
				j++;
			}
			k++;
		}
		
		//copy remaining elements of left array if any 
		while(i< n1) {
			arr[k]= leftArray[i];
			i++;
			k++;
		}
		//copy remaining elements of right array if any
		while(j<n2) {
			arr[k]= rightArray[j];
			j++;
			k++;
		}
		
	}

}
