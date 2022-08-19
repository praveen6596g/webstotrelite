package ForLoopUsingCondition;

public class Student {
	public static void main(String[] args) {
		String name[]= {"sundar","arun","venkat","rajasri","ajith"};
		String first=name[0];
		for(int i=0;i<name.length;i++) {
			if(name[i].startsWith("a"))
			{
				 first =name[i];
			
			
		
		System.out.println(first);
			}
		}
	}

}
