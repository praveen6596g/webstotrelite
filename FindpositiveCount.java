package ForLoopUsingCondition;

public class FindpositiveCount {
	public static void main(String[] args) {
		int nums[]= {1,2,-85,-5,4,7};
		int positivecount=0;
		int negativeCount=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>0)
			{
				positivecount=positivecount+1;
			
			}
			else
			{ 
				negativeCount=negativeCount+1;
				
			}
		}
		System.out.println(positivecount);
		System.out.println(negativeCount);
		
	}

}
