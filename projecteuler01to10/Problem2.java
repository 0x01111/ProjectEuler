package projecteuler01to10;

class level2{
	void solve(){
		int f1=1;
		int f2=2;
		int sum=0;
		while(f2<4000000){
			if(f2%2==0){
				sum=sum+f2;
			}
			int temp=f2;
			f2=fib(f1,f2);
			f1=temp;
		}
		System.out.println("sum:"+sum);
	}
	int fib(int f1,int f2){
		return f1+f2;
	}
}
public class Problem2 {

	public static void main(String[] args){
		new level2().solve();//4613732
	}
}
