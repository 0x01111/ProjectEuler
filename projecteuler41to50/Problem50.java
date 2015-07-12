package projecteuler41to50;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class level40{	
	void solve0(){

		List<Integer> vec=new ArrayList<Integer>();
		vec.add(2);
		int i=3;
		int lim = 1000000;
		while(i<lim){
			if(isPrime(i))
				vec.add(i);
			i=i+2;
		}
		
		List cumsum=new ArrayList();
		int sum=0;
		for(Object element:vec){
			sum+=(Integer)element;
			cumsum.add(sum);
			if(sum>=lim)
				break;
		}
		int rslt=0;
		int count=0;
		for(int j=0;j<cumsum.size();j++){
			for(int k=cumsum.size()-1;k>j;k--){
				int tmp= (Integer)cumsum.get(k)-(Integer)cumsum.get(j);
				if((k-j+1)>count && vec.contains(tmp)){
					count=k-j+1;
					rslt=tmp;
				}
			}
		}
		System.out.println(rslt+" "+count);
		
	}
	boolean isPrime(int num){
		if(num==2 || num==3 ||num==5||num==7 ||num==11 || num==13) return true;
		if(num<2 || num%2==0) return false;
		for(int i=3;i<=Math.sqrt(num);++i)
			if(num%i==0)
				return false;
		return true;
	}

	
}
public class Problem50 {


	public static void main(String[] args){
		Date beginTime=new Date();
		new level40().solve0();
		Date endTime=new Date();
		long Time=endTime.getTime()-beginTime.getTime();
		System.out.println("Time:"+Time/1000+"s"+Time%1000+"ms");
	}

}
