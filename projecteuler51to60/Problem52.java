package projecteuler51to60;

import java.util.Set;
import java.util.TreeSet;

class level52{	
	void solve0(){
		int Max_Value=1000000;


		for(int i=2;i<Max_Value;++i){
			if(sameDigit(i,2*i)  &&sameDigit(i,3*i) &&
					sameDigit(i,4*i) &&sameDigit(i,5*i) &&
					sameDigit(i,6*i)){
				System.out.println(i);
				return;
			}
		}
	
	}
	void solve1(){
		int orig=1;
		int ans=0;
		while(ans==0){
			int count=1;
			for(int a=2;a<=6;a++){
				int b=orig*a;
				if(permutation(orig,b))
					count++;
			}
			if(count==6)
				ans=orig;
			orig++;
		}
		 System.out.println(ans);	
	}
	  public  boolean permutation(int a, int b)
	    {
	        int[] nums = new int[10];
	        int temp1 = a;
	        int temp2 = b;
	        while(temp1>0 && temp2>0)
	        {
	            nums[temp1%10]++;
	            nums[temp2%10]--;
	            temp1/=10;
	            temp2/=10;
	        }
	        for(int c = 0;c<10;c++)
	        {
	            if(nums[c] != 0)
	                return false;
	        }
	        return true;
	    }

	boolean sameDigit(int a,int b){
		String stra=String.valueOf(a);
		String strb=String.valueOf(b);
		Set<String> set=new TreeSet<String>();
		Set<String> setEqual=new TreeSet<String>();
		if(stra.length()!=strb.length()) return false;
		for(int i=0;i<stra.length();i++){
			set.add(stra.substring(i,i+1));
			set.add(strb.substring(i,i+1));
			setEqual.add(strb.substring(i,i+1));

		}
		return set.equals(setEqual);
	}
	

	
}
public class Problem52 {


	public static void main(String[] args){
		long begin= System.currentTimeMillis();
		new level52().solve0();
		long end = System.currentTimeMillis();
		long Time = end - begin;
		System.out.println("Time:"+Time/1000+"s"+Time%1000+"ms");
	}

}
