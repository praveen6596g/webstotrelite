package ForLoopUsingCondition;

public class FindPalinDrovine {
	public static void main(String[] args) {
		String a="telugu";
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a;
			
			
		}
		if(b.equalsIgnoreCase(a)) {
			System.out.println(a+" is a palindrovine");
		}
		else
		{
			System.out.println(a+" is not a palindrovine");
		}
	}

}
