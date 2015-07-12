package projecteuler51to60;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class level55{	
	void solve0(){
		int Max=10000;
		int count=0;
		for(int i=0;i<Max;i++){
			if(isLychrel(i))
				count++;
		}
		System.out.println(count);
	}
	private boolean isLychrel(int n){
		BigInteger temp = BigInteger.valueOf(n);
		for(int i=0;i<49;i++){
			BigInteger revtemp = new BigInteger(reverse(temp.toString())); 
			temp = temp.add(revtemp);
			if(isPalindrome(temp.toString())){
				return false;
			}
			
		}
		return true;
	}
	 String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}
	 public  boolean isPalindrome(String s) {
			return s.equals(reverse(s));
	}
	 public  boolean isPalindrome(int x) {
			return isPalindrome(Integer.toString(x));
	}
}
public class Problem55 {


	public static void main(String[] args){
		long begin= System.currentTimeMillis();
		new level55().solve0();
		long end = System.currentTimeMillis();
		long Time = end - begin;
		System.out.println("Time:"+Time/1000+"s"+Time%1000+"ms");
	}

}
