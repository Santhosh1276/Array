package Array;
import java.util.*;
public class BigAndSmall {
	public static void biggest(int arr[],int n) {
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public static void smallest(int arr[],int n) {
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements you want ");
	    int n = sc.nextInt();
	    System.out.println("Enter all the elements  ");
	    int arr[]=new int [n];
	    for(int i=0;i<n;i++) {
	    	arr[i] = sc.nextInt();
	    }
	   
	    System.out.println(Arrays.toString(arr));
	    
	    BigAndSmall.biggest(arr,n);
	  
	    System.out.println("Biggest element is "+ arr[0]);
	    System.out.println("Second Biggest element is "+ arr[1]);
	    
	    BigAndSmall.smallest(arr, n);
	    System.out.println("Smallest element is "+ arr[0]);
	    System.out.println("Second smallest element is "+ arr[1]);
	}

}
