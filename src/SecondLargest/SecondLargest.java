package SecondLargest;

import java.util.Scanner;

public class SecondLargest {
	
	public static int Largest(int arr[],int size ,int max)
	{
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i] < arr[j] )
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<size;i++)
		{
			if(arr[i] != max)
			{
				System.out.println(arr[i]);
				break;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter Size of the Array :");
		int number = scan.nextInt();
		System.out.println("Enter elements of the Array :");
		int max =Integer.MIN_VALUE;
		int[] arr = new int[number];
		for(int i =0;i<number;i++)
		{
			arr[i]=scan.nextInt();
			if(max < arr[i])
			{
				max = arr[i];
			}
		}	
		
		int size = arr.length;
		int result = Largest(arr,size,max);

	}

}
