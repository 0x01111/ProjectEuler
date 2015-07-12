package projecteuler01to10;

class level6{
	int sum(int num){
		int sum=0;
		for(int i=1;i<=num;i++){
			sum+=i;
		}
		return sum;
	}
	int sqrt(int num){
		int result=0;
		for(int i=1;i<=num;i++){
			result+=i*i;
		}
		return result;
	}
}
public class Problem6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum100=new level6().sum(100);
		int sqrt100=new level6().sqrt(100);
		System.out.println(sum100*sum100-sqrt100);//25164150

	}

}
