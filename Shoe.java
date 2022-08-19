package ForLoopUsingCondition;

public class Shoe {
public static void main(String[] args) {
	String []num= {"adidas","nike","reebok","woodland"};
	String a="";
	for(int i=0;i<num.length;i++) {
		if(num[i].contains("a"))
				{
			a=a+num[i];
				}
				
	}
	System.out.println(a);
}
}
