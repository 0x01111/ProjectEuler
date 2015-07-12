package projecteuler51to60;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class level57{	
	void solve0(){
/***
		a      a+2b 
	   ---    -------
	    b       a+b
***/
		int count = 0;
		BigInteger a=BigInteger.valueOf(3);
		BigInteger b=BigInteger.valueOf(2);
		for(int i=0;i<1000;i++){
			BigInteger tempA =caculateA(a,b);
			BigInteger tempB =caculateB(a,b);
			a = tempA;
			b = tempB;
			if(a.toString().length()>b.toString().length()){
				count++;
			}
		}
		System.out.println(count);
	}
	BigInteger caculateA(BigInteger a,BigInteger b){
		BigInteger res = a;
		res=res.add(b);
		res=res.add(b);
		return res;
	}
	BigInteger caculateB(BigInteger a,BigInteger b){
		BigInteger res =a;
		res = res.add(b);
		return res;
	}

	
}
public class Problem57 {


	public static void main(String[] args){
		long begin= System.currentTimeMillis();
		new level57().solve0();
		long end = System.currentTimeMillis();
		long Time = end - begin;
		System.out.println("Time:"+Time/1000+"s"+Time%1000+"ms");
	}

}
