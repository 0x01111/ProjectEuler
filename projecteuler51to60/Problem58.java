package projecteuler51to60;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class level58{	
	void solve0(){
/*** i = 1
		(2i-1)^2-4(i-1)   (2i-1)^2-6(i-1) 
	   ----------------    -----------------
	    (2i-1)^2-2(i-1)      (2i-1)^2
	    
	    1+4i
***/
		int count = 0;
//		BigInteger a=BigInteger.valueOf(3);
//		BigInteger b=BigInteger.valueOf(2);
		
		for(int i=2;i<100000;i++){
			int a=(2*i-1)*(2*i-1)-6*(i-1);
			int b=(2*i-1)*(2*i-1)-4*(i-1);
			int c=(2*i-1)*(2*i-1)-2*(i-1);
			int num=1+4*(i-1);
			if(isPrime(a)) count++;
			if(isPrime(b)) count++;
			if(isPrime(c)) count++;
			if(1.0*count/(1.0*num)<0.1){
				System.out.println(2*i-1);
				return;
			}
				
		}
		
	}
	boolean isPrime(long num){
		if(num==2|| num==3 ||num==5 || num ==7)
			return true;
		if(num<2||num%2==0) return false;
		for(int i=3;i<Math.sqrt(num)+1;i++){
			if(num%i==0) return false;
		}
		return true;
	}
}
public class Problem58 {


	public static void main(String[] args){
		long begin= System.currentTimeMillis();
		new level58().solve0();
		long end = System.currentTimeMillis();
		long Time = end - begin;
		System.out.println("Time:"+Time/1000+"s"+Time%1000+"ms");
	}

}
