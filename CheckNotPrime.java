package ForLoopUsingCondition;

public class CheckNotPrime {
	public static void main(String [] args) {
		boolean prime=true;
		int a=59;
		
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				prime=false;
			}
			
		}
		if(prime) {
			System.out.println(a+" is a prime number ");
		}
		else
		{
			System.out.println(a+" is not prime number");
		}
	}

}
