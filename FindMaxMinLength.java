package ForLoopUsingCondition;

public class FindMaxMinLength {
	public static void main(String[] args) {
		String []words= {"praveen","selva","venkat"};
		String maxlen=words[0];
		String minlen=words[0];
		for(int i=0;i<words.length;i++)
		{
			if(words[i].length()>maxlen.length())
			{
				maxlen=words[i];
			}
			else if(words[i].length()<minlen.length())
			{
				minlen=words[i];
			}
		}
		System.out.println(maxlen);
		System.out.println(minlen);
			
	}

}
