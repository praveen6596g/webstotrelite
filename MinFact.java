package ForLoopUsingCondition;

public class MinFact {
 public static void main(String[] args) {
	 int num[]= {5,7,4,3,8,2};
	 int min=num[0];
	 for(int i=0;i<num.length;i++)
	 {
		if(num[i]<min)
		{
			min=num[i];
		}
	 }
	    int fact=1;
	 for(int i=1;i<=min;i++)
	 {
		 fact=fact*i;
	 }
	 System.out.println(fact);
 }
}
