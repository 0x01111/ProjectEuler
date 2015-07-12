package projecteuler41to50;

import java.math.BigInteger;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

class level48{

	void solve0(){
		BigInteger result=new BigInteger("0");
		for(int i=1;i<=1000;i++){
			String str=String.valueOf(i);
			BigInteger num=new BigInteger(str);
			num=num.pow(i);
			result=result.add(num);
		}
		String resultStr=result.toString();
		System.out.println(resultStr.substring(resultStr.length()-10));
		
	}
	void solve1(){
		long result=0;
		long modulus=10000000000l;
		for(int i=1;i<=1000;i++){
			long subresult=PowMod(i,i,modulus);
			result=result+subresult;
		}
		
		System.out.println(result%modulus);
		
	}
	long PowMod(int base,int exponent,long modulus){
		long res=base;
		for(int i=2;i<=exponent;++i){
			res=(res*base)%modulus;
		}
		return res;
	}
	void solve2(){
		long result=0;
		long modulus=10000000000l;
		for(int i=1;i<=1000;i++){
			long subresult=ModularExponentiation(i,i,modulus);
			result=result+subresult;
//			System.out.println(result+" "+subresult);
		}
		
		System.out.println(result%modulus);
		
	}
	long ModularExponentiation(long base,long exponent,long modulus){
		long result=1;
		for(int i=1;i<=exponent;++i){
			result=(result*base) % modulus;
		}
		return result;
	 }
}
public class Problem48 {


	public static void main(String[] args){
		Date beginTime=new Date();
		new level48().solve2();
		Date endTime=new Date();
		long Time=endTime.getTime()-beginTime.getTime();
		System.out.println("Time:"+Time/1000+"s"+Time%1000+"ms");
	}

}
