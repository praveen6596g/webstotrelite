package ForLoopUsingCondition;

public class Maxmumlength {
	public static void main(String[] args) {
		String []shoe= {"adidas","nike","reebok","woodland"};
	
		for(int i=0;i<shoe.length;i++)
		{
			if(shoe[i].contains("e")) {
				System.out.println(shoe[i].charAt(shoe[i].length()-1));
			}
		}
		
	}

}
