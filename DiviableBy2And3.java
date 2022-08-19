package ForLoopUsingCondition;

public class DiviableBy2And3 {
	public static void main(String[] args) {
	int count=0;
		for(int i=1;i<=100;i++)
	{
		if(i%2==0||i%3==0)
		{
			count=count+1;
			System.out.println(i);
		}
	}
	System.out.println(count);
	}
	

}
