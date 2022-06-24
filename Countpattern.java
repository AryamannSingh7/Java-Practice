import java.util.*;
class Countpattern{
	public static void main(String args[])
	{
		String str=new String();
		str="01101111010";
		int j,count=0;
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)==1)
				i++;
			else
			{
				j=i+1;
				while(str.charAt(j)==0)
				{
					if(j<len-1)
						j++;
					else
						break;
				}
				while(str.charAt(j)==1)
				{
					if(j<len-1)
						j++;
					else
						break;
				}
				count++;
				i=j;
			}
		}
		System.out.println("Count= " +count);
	}
}