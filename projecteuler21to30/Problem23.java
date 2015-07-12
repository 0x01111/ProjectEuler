package projecteuler21to30;

import java.util.Date;
import java.util.HashSet;

class level23{
	void solve2(){
		int[] arr=new int [28124];
		int[] b= new int[28124];
		for(int i=1;i<28124;i++){
			b[i]=i;
		}
		int count=1;
		for(int i=1;i<28124;++i){
			int s=getSum(i);
			if(s>i){
				arr[count]=i;
				count++;
			}
			
		}
		for(int i=1;i<count;i++){
			for(int j=i;j<count;++j){
				int temp=arr[i]+arr[j];
				if(temp<=28123){
					b[temp]=0;
				}
			}
		}
		int sum=0;
		for(int i=1;i<28124;++i){
			sum+=b[i];
		}
		System.out.println(sum);//1s53ms
	}
	void solve(){

		long sum=0;
		HashSet<Integer> al=new HashSet<Integer>();
		for(int i=1;i<28124;++i){
			int s=deficientNum(i);
			if(s!=-1) {
				al.add(i);
			}
		}
		Object[] array=al.toArray();
		HashSet hs=new HashSet();

			for(int j=0;j<array.length;++j){
				for(int k=j;k<array.length;++k){
					int temp=(Integer)array[j]+(Integer)array[k];
						if(temp<=28123){//”–÷ÿ∏¥µƒ

							hs.add(temp);
						
						}
					}
			}
			sum=0;
			for(Object obj:hs){
				int res=(Integer)obj;
				sum+=res;
			}
			int tempsum=0;
			for(int i=1;i<=28123;i++)
				tempsum+=i;
			System.out.println((tempsum-sum));//4179871 2s130ms
		}
	int getSum(int num){
		int sum=0;
		for(int i=1;i<num/2+1;++i){
			if(num%i==0){
				sum+=i;
			}
		}
		return sum;
	}
	int deficientNum (int num){
		int sum=0;
		for(int i=1;i<=num/2;i++){
			if(num%i==0) sum+=i;
		}
		if(sum>num) return num;
		return -1;
	}
	
}
public class Problem23 {

	public static void main(String[] args){
		Date beginTime=new Date();
		new level23().solve2();//4179871
		Date endTime=new Date();
		long Time = endTime.getTime()-beginTime.getTime();
		System.out.println("Time:"+Time/1000+"√Î"+Time%1000+"∫¡√Î");
	}
}
