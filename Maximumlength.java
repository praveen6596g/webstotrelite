package ForLoopUsingCondition;

public class Maximumlength {
	public static void main(String[] args) {
		int []price= {2200,5000,7000,9500,1800};
		int max=0;
		int min=price[0];
		for(int i=0;i<price.length;i++)
		{
			if(price[i]>=max) {
				max=price[i];
			}
		}
		System.out.println(max);
		for(int i=0;i<price.length;i++)
		{
			if(price[i]<=min)
			{
				min=price[i];
			}
		}
		System.out.println(min);
	}

}
