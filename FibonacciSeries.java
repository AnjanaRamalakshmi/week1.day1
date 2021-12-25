package week1.day1.assignment1;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		int input = 8;
		int firstNum = 0;
		int secNum = 1;
		int sum;
		System.out.println("Input =" +input);
		System.out.println(firstNum);
		for(int i = 1; i<=input; i++)
		{
			sum = firstNum + secNum;
			System.out.println(sum);
			firstNum = secNum;
			secNum = sum;
			//System.out.println(sum);
		}
		

	}

}
