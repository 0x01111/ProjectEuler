package projecteuler01to10;

class level1{
	level1(){
		
	}
	void solve(){
		int i=1;
		int sum=0;
		while(i<1000){
			if(i%3==0 || i%5==0){
				sum+=i;
			}
			i++;
		}
		System.out.println("小于1000，能被3或5整除的数之和："+sum);
	}
}
public class Problem1 {

	public static void main(String[] args) {
		new level1().solve();//233168

	}

}
