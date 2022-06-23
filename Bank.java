import java.util.*;
class Bank{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Program made by Aryamann Singh CE-18");
		double p,p1;
		int r,r1,n,n1,opt;
		do
		{
			System.out.println("Press 1: To calculate Term Deposit");
			System.out.println("Press 2: To calculate Recurring Deposit");
			System.out.println("Enter your choice: ");
			opt=sc.nextInt();
			switch(opt)
			{
				case 1: System.out.println("Enter principle: ");
					p=sc.nextDouble();
					System.out.println("Enter rate of interest: ");
					r=sc.nextInt();
					System.out.println("Enter time period: ");
					n=sc.nextInt();
					double A;
					A= p*Math.pow((1+r/100),n);
					System.out.println("Term deposit= "+A);
					break;
				case 2: System.out.println("Enter monthly installment: ");
					p1=sc.nextDouble();
					System.out.println("Enter rate of interest: ");
					r1=sc.nextInt();
					System.out.println("Enter time period: ");
					n1=sc.nextInt();
					double A1;
					A1= (p1*n1 + p1*n1*(n1+1)/2)*(r1/100)*(1/12);
					System.out.println("Recurring Deposit= "+A1);
					break;
				case 3: System.out.println("GoodBye!");
					break;
				default: System.out.println("Inappropriate Choice");
					 break;
			}
		}while(opt!=3);
	}
}
