package projecteuler21to30;
import java.util.Date;
class level21{
	void solve(){
		int sum=0;
		for(int i=2;i<10000;i++){
			sum+=SumAmicableNum(i);
		}
		sum/=2;// a<b  a+b  b+a 两次
		System.out.println("10000以下所有亲和数之和:"+sum);

	}
	int SumAmicableNum(int num){
		int sum=0;
		for(int i=1;i<=num/2;i++){//<num改成<=num/2 能够节省很多时间，一个数不可能被大于自身1、2的数整除
			if(num%i==0) sum+=i;
		}
		int num2=0;
		for(int i=1;i<=sum/2;i++){
			if(sum%i==0) num2+=i;
		}
		if(num==num2 &&num!=sum)  return (num+sum);
		return 0;
	}
}
public class Problem21 {

	public static void main(String[] args){
		Date beginTime=new Date();
		new level21().solve();//31626
		Date endTime=new Date();
		long Time=endTime.getTime()-beginTime.getTime();
		System.out.println("Time:"+Time/1000+"秒"+Time%1000+"毫秒");
	}
}
