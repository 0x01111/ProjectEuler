package projecteuler21to30;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;

class level26{
	void solve2(){		
		int remainder=0;	
		int max=0;
		int result=0;
		for(int d=2;d<1000;d++){
			ArrayList list=new ArrayList();
			list.add(new Integer(1));
			int count=1;
			int temp=10;
			while(true){
				remainder= temp%d;
				if(list.contains(remainder) || remainder==0){
					if(count>max){
						max=count;
						result=d;
					}
					if(d==6){
					System.out.println(list);
					System.out.println(count);
					}
					break;
				}else{
					list.add(new Integer(remainder));
					temp=remainder*10;
					count++;
				}
			}
		}
		System.out.println(result);
		
	}
	void solve1(){		
		int remainder=0;	
		int max=0;
		int result=0;
		for(int d=2;d<1000;d++){
			ArrayList list=new ArrayList();
			list.add(new Integer(1));
			int count=1;
			int temp=10;
			if(isPrime(d)){
			while(true){
				remainder= temp%d;
				if(list.contains(remainder) || remainder==0){
					if(count>max){
						max=count;
						result=d;
					}
					if(d==6){
					System.out.println(list);
					System.out.println(count);
					}
					break;
				}else{
					list.add(new Integer(remainder));
					temp=remainder*10;
					count++;
				}
			}
			}
		}
		System.out.println(result);
		
	}
	boolean isPrime(int num){
		for(int i=2;i<=Math.sqrt(num);i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
}
public class Problem26 {

	public static void main(String[] args){
		Date beginTime=new Date();
		new level26().solve2();//983
		Date endTime=new Date();
		long Time = endTime.getTime()-beginTime.getTime();
		System.out.println("Time:"+Time/1000+"Ãë"+Time%1000+"ºÁÃë");
		}
}
