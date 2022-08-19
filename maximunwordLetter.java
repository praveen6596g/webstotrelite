package ForLoopUsingCondition;

public class maximunwordLetter {
	public static void main(String[] args) {
		String []shoe= {"adidas","nike","reebok","woodland"};
		String max=shoe[0];
		int temp=0;
		for(int i=0;i<shoe.length;i++)
		{
			if(shoe[i].length()>=temp)
			
			{
				temp=shoe[i].length();
				max=shoe[i];
			}
		}
		System.out.println(max);
	}

}
