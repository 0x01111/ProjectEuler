package projecteuler41to50;

import java.util.Date;

class level47{

	void solve0(){
		int Max_Value=1000000;
		int[] primes=new int[999];
		primes[0]=2;
		int j=1;
		for(int i=3;i<999;i=i+2){
			if(isPrime(i))
				primes[j++]=i;
		}
		for(int i=20;i<Max_Value;i++){
			if(Judge(i,primes,j) && Judge(i+1,primes,j)
					&& Judge(i+2,primes,j)&&Judge(i+3,primes,j)){
				System.out.println(i);
				return;
			}
		}//134043
	}
	
	boolean Judge(int num,int[] primes,int n){
		boolean flag=false;
		int count=0;
		for(int i=0;i<n;i++){
			while(num%primes[i]==0){
			flag=true;
			num/=primes[i];
			
			}// 去除这个质数的n次方 ,去重
			
			if(flag==true) {
				flag=false;
				count++;
//				System.out.println(primes[i]);
			}
			if(count>4) return false;
		}
		if(count==4) return true;
		return false;
	}
	
	boolean isPrime(int num){
		if(num==2 ||num==3||num==5||num==7||num==11||num==13)
			return true;
		if(num<2||num%2==0)
			return false;
		for(int i=3;i<=Math.sqrt(num);++i)
			if(num%i==0)
				return false;
		return true;
	}
	
	
}
public class Problem47 {


	public static void main(String[] args){
		Date beginTime=new Date();
		new level47().solve0();
		Date endTime=new Date();
		long Time=endTime.getTime()-beginTime.getTime();
		System.out.println("Time:"+Time/1000+"s"+Time%1000+"ms");
	}

}
