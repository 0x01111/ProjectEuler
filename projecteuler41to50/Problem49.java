package projecteuler41to50;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

class level49{

	void solve0(){
		int[] primes=new int[1229];
		primes[0]=2;
		int j=1;
		for(int i=3;j<1229;i+=2)
			if(isPrime(i)){
				primes[j++]=i;
//				System.out.println(primes[j-1]);
			}
		for(int i=0;i<primes.length-1;i++){
			for(int k=i+1;k<primes.length;k++){
				if(primes[i]>1000 && sameDigits(primes[i],primes[k])){
					int diff=primes[k]-primes[i];
					int lastprime=primes[k]+diff;
					if(sameDigits(primes[k],lastprime) && isPrime(lastprime) && lastprime<10000){
						System.out.println(primes[i]+" "+primes[k]+" "+lastprime+" "+diff);
					}
				}
			}
		}
	}
	boolean sameDigits(int num1,int num2){
		String str1=String.valueOf(num1);
		String str2=String.valueOf(num2);
		Set<String> set1=new TreeSet<String>();
		Set<String> set2=new TreeSet<String>();
		for(int i=0;i<str1.length();i++){
			set1.add(str1.substring(i, i+1));
		}
		for(int i=0;i<str2.length();i++){
			set2.add(str2.substring(i, i+1));
		}
		if(set1.size()==set2.size())
		return set1.equals(set2);
		
		return false;
	}
	boolean isPrime(int num){
		if(num==2 || num==3 ||num==5||num==7||num==11|| num==13) return true;
		if(num<2||num%2==0 ||num%3==0) return false;
		for(int i=3;i<=Math.sqrt(num);++i)
			if(num%i==0) return false;
		return true;
	}
}
public class Problem49 {


	public static void main(String[] args){
		Date beginTime=new Date();
		new level49().solve0();
		Date endTime=new Date();
		long Time=endTime.getTime()-beginTime.getTime();
		System.out.println("Time:"+Time/1000+"s"+Time%1000+"ms");
	}

}
