package Assignment;

import java.util.Scanner;

public class ArrayList {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int[] arr= {5,10,15,20,25,30,35,40,45,50};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
	}

}

}
