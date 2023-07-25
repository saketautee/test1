import java.util.Scanner;

class DigitCount{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int count = 0,rem = 0,temp=num;
		System.out.print("Enter the digit :");
		int digit = sc.nextInt();

		while(num != 0)
		{
			rem=num%10;
			num=num/10;
			if(rem==digit)
			{
				count++;
			}
		}
		System.out.println("Count of digit " +digit+" in "+temp+" is "+count);
	}
}
