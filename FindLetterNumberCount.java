
package ForLoopUsingCondition;

public class FindLetterNumberCount {
	public static void main(String[] args) {
		String a="TN-13-AR-1331";
		int b=0;
		int c=0;
		int d=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)>='A'&&a.charAt(i)<='Z')
			{
				b=b+1;
			
			}
			else if(a.charAt(i)>='0'&&a.charAt(i)<='9')
				{
		          c=c+1;
		
		        }
			else
			{
			d=d+1;
			}   }
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	

}}
