package projecteuler41to50;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

class level41{	
	void solve(){
		long Max_Value=7654321;
		long Min_Value=1234567;
		int d=1;
		for(long i=Max_Value;i>2;i=i-2){
			if(isNDigit(i)){
				if(isPrime(i)){
					System.out.println("OK:"+i);
					break;
				}
				
			}
		}
//		isPandigital(1234567,7654321);
//		isPandigital(1234,4321);
		
	}
	void isPandigital(long min,long max){
		for(long i=max;i>=min;i=i-2){
			if(isNDigit(i)){
				if(isPrime(i)){
					System.out.println("Pandigital:"+i);
				}
				
			}
		}
	}
	boolean isNDigit(long num){
		String str=String.valueOf(num);
		Set set=new TreeSet();
		Set setEqual=new TreeSet();
		if(str.indexOf("0")>-1) return false;
		if(str.length()>=10) return false;
		for(int i=0;i<str.length();i++){
			set.add(str.substring(i,i+1));
			setEqual.add(String.valueOf(i+1));
			if(set.size()< (i+1)){
				return false;
			}
		}
		return set.equals(setEqual);
	}
	boolean isPrime(long num){
		for(long i=2;i<=Math.sqrt(num);i++)
			if(num%i==0)
				return false;
		return true;
	}
//	long permutation(String pre,String wor){
//		if(len==1) return 1;
//		result=permutation(result,n-1)*10+n;
		
//	}
	
}
public class Problem41 {


	public static void main(String[] args){
		Date beginTime=new Date();
		new level41().solve();
		Date endTime=new Date();
		long Time=endTime.getTime()-beginTime.getTime();
		System.out.println("Time:"+Time/1000+"s"+Time%1000+"ms");
	}

}
