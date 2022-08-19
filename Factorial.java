package ForLoopUsingCondition;

public class Factorial {
	public static void main(String[] args) {
		int num[]= {5,7,4,3,8,2};
		int max=0;
			
		for(int i=0;i<num.length;i++)
				{
					if(num[i]>max) {
						max=num[i];
					
					}
				}
				int fact=1;
				for(int i=1;i<=max;i++)
				{
					fact=fact*i;
				}	
		System.out.println(fact);
		System.out.println(max);
	

}
}
