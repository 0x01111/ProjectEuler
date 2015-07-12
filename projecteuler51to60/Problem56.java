package projecteuler51to60;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class level56{	
	void solve0(){
		int maxsum=0;
		for(int a=2;a<100;a++){
			for(int b=2;b<100;b++){
				BigInteger bigNum = BigInteger.valueOf(a).pow(b);
				maxsum=Math.max(digitSum(bigNum), maxsum);
//				System.out.println(maxsum);
			}
		}
		System.out.println(maxsum);
	}
	private  int digitSum(BigInteger n) {
		int sum = 0;
		String s = n.toString();
		for (int i = 0; i < s.length(); i++)
			sum += s.charAt(i) - '0';
		return sum;
	}
	int sumDigits(BigInteger num){
		int sum=0;
		BigInteger ten = BigInteger.valueOf(10);
		while(num.equals(0)){
			sum+=(num.mod(ten)).intValue();
			num = num.divide(ten);
		}
		return sum;
	}

	
}
public class Problem56 {


	public static void main(String[] args){
		long begin= System.currentTimeMillis();
		new level56().solve0();
		long end = System.currentTimeMillis();
		long Time = end - begin;
		System.out.println("Time:"+Time/1000+"s"+Time%1000+"ms");
	}

}
