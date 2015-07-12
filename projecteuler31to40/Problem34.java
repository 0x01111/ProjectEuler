package projecteuler31to40;

import java.util.Date;

class level34{
	void solve(){
		int Max_Value=50000;

		int allsum=0;
		int remainder=0;
		int[] Factorial={1,1,2,6,24,120,720,5040,40320,362880};
		for(int i=100;i<=Max_Value;++i){
			int num=i;
			int sum=0;
			while(num!=0){
				remainder=num%10;
				sum+=Factorial[remainder];
				num=num/10;
			}
			if(i==sum) {
				allsum+=i;
				System.out.println(sum);
			}
		}
		System.out.println(allsum);
	}
	long Fact(int num){
		if(num==0 ||num==1){
			return 1;
		}else{
			return Fact(num-1)*num;
		}
	}

}
public class Problem34 {

	public static void main(String[] args){
		Date beginTime=new Date();
		new level34().solve();
		Date endTime=new Date();
		Long Time=endTime.getTime()-beginTime.getTime();
		System.out.println("Time="+Time/1000+"Ãë"+Time%1000+"ºÁÃë");
	}
}
