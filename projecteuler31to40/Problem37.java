package projecteuler31to40;

import java.util.Date;

class level37{

	void solve(){
		int Max_Value=1000000;
		int sum=0;
		boolean[] primes=PrimeArray(Max_Value);
		for(int i=10;i<Max_Value;i++){
			int num=i;
			boolean flag=true;
			if(primes[i]){
				while(num>10){
				 num=LeftToRight(num);
				 if(primes[num]==false){
					 flag=false;
					 break;
				 }
				}
				if(primes[num]==true && flag==true){
					num=i;
					while(num>10){
						num=RightToLeft(num);
						if(primes[num]==false){
							flag=false;
							break;
						}
					}
					if(primes[num]==true && flag==true){
						sum+=i;
						System.out.println(i);
					}
				}
			}
		}
		System.out.println(sum);
	}
	int RightToLeft(int num){
		if(num<10)
			return num;
		return num/10;
		
	}
	int LeftToRight(int num){
		String str=String.valueOf(num);
		return Integer.parseInt(str.substring(1));
	}
	boolean[] PrimeArray(int num){
		boolean[] primes=new boolean[num+1];
		primes[2]=true;
		for(int i=3;i<num+1;++i)
			primes[i]=isPrime(i);
		return primes;
	}
	boolean isPrime(int num){
		for(int i=2;i<=Math.sqrt(num);i++){
			if(num%i==0)
				return false;
		}
		return true;
	}
	
	
}
public class Problem37 {


	public static void main(String[] args){
		Date beginTime=new Date();
		new level37().solve();//
		Date endTime=new Date();
		long Time=endTime.getTime()-beginTime.getTime();
		System.out.println("Time:"+Time/1000+"s"+Time%1000+"ms");
	}

}
