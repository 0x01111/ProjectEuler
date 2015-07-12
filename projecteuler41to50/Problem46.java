package projecteuler41to50;

import java.util.Date;

class level46{
	void solve0(){		
		int Max_Value=150000;
		boolean flag=false;
		for(int i=137;i<Max_Value;i=i+2){
			if(isComposite(i)){
			int num=i;
			while(getPrime(num)!=-1 && flag==false){
				num=getPrime(num);
				if((i-num)%2==0){
					int sqr=(int) Math.sqrt((i-num)/2);
					if(sqr*sqr==(i-num)/2){
						flag=true;
					}
				}
			}
			if(flag==true){
				flag=false;
			}else{
				System.out.println(i);
				return;
			}
			}
		}
		
	}
	boolean isComposite(int num){
		if(num%2==0) return true;
		if(num%3==0) return true;
		for(int i=2;i<num/2+1;++i)
			if(num%i==0)
				return true;
		return false;
	}
	int getPrime(int num){
		// 小于 num 的最大的质数
		for(int i=num-1;i>=2;i--){
			if(isPrime(i))
				return i;
		}
		return -1;
	}
	boolean isPrime(int num){
		if(num==2 || num==3 ||num==5) return true;
		for(int i=2;i<=Math.sqrt(num);++i)
			if(num%i==0)
				return false;
		return true;
	}
}
public class Problem46 {


	public static void main(String[] args){
		Date beginTime=new Date();
		new level46().solve0();
		Date endTime=new Date();
		long Time=endTime.getTime()-beginTime.getTime();
		System.out.println("Time:"+Time/1000+"s"+Time%1000+"ms");
	}

}
