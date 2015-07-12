package projecteuler21to30;

import java.util.Date;
class level27{
	void solve(){
		int length=0;
		int n=0;
		int ab=0;
		for(int a=-999;a<=999;a++){
			for(int b=1;b<=999;b++){
				 n=0;
				int num=n*n+n*a+b;
				while(isPrime(num) && num>0 ){
					n++;
					num=n*n+n*a+b;
				}
				if(n>length){
					length=n;
					ab=a*b;
//					System.out.println(ab+","+a+","+b+","+length);
				}
			}
		}
		System.out.println(ab+","+length);
		 n=0;
		int num=n*n+n*(-61)+971;
		while(isPrime(num) && num>0 ){
			n++;
			System.out.print(num+" ");
			num=n*n+n*(-61)+971;
		}
		System.out.println(n);
	}

	boolean isPrime(int num){
		for(int i=2;i<=Math.sqrt(num);++i){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
}
public class Problem27 {

	public static void main(String[] args){
		Date beginTime=new Date();
		new level27().solve();//-59231
		Date endTime=new Date();
		long Time = endTime.getTime()-beginTime.getTime();
		System.out.println("Time:"+Time/1000+"Ãë"+Time%1000+"ºÁÃë");
		}
}
