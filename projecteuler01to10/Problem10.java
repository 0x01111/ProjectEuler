package projecteuler01to10;
class level10{
	void solve(){
			int i=1;			
			int num=3;
			int MaxNum=2000000;
			long sum=2;
			while(num<MaxNum){
		
				if(isPrime(num)){
					sum+=num;
					System.out.println(num);
					}
				num=num+1;
				}
			System.out.println(sum);
			return;
	}
	boolean isPrime(int num){
		for(int i=2;i<Math.sqrt(num)+1;i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
}
public class Problem10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new level10().solve();//142913828922
		System.out.println(new level10().isPrime(4));
	}

}
