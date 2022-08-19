package ForLoopUsingCondition;

public class vowelsCount {
	public static void main(String[] args) {
		String name="praveen";
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
			{
				count =count+1;
				System.out.println(name.charAt(i));
			}
		}
	System.out.println(count);
	}
	

}
