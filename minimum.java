import java.util.Scanner;
class MinMaxInArray 
{
	int getMax(int[]inputArray)
	{
		int maxValue=inputArray[0];
  for(int i=1;i<inputArray.length;i++)
		{
			if(inputArray[i]>maxValue)
			{
				maxValue=inputArray[i];
			}
		}
		return maxValue;
	}
  int getMin(int[]inputArray)
	{
		int minValue=inputArray[0];

		for(int i=1;i<inputArray.length;i++)
		{
			if(inputArray[i]<minValue)
			{
				minValue=inputArray[i];
			}
		}
		return minValue;
	}
}

public class Main
{
	public static void main(String[] args)
	{
		int n;
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of elements you wants to enter :" );
n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter ["+(i+1)+"] element :" );
			arr[i]=sc.nextInt();
		}
MinMaxInArray mm=new MinMaxInArray();
		System.out.print("Maximum value is :" +mm.getMax(arr));
		System.out.print("Minimum value is :" +mm.getMin(arr));
	}
}
