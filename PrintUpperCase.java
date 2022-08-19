package ForLoopUsingCondition;

public class PrintUpperCase {
	public static void main(String[] args) {
		String nums="rAmKumAr";
	String name=nums.toUpperCase();
		
		for(int i=0;i<nums.length();i++) {
		if(nums.charAt(i)==name.charAt(i))
			{
			System.out.println(nums.charAt(i));
		}
		
	}

}
}