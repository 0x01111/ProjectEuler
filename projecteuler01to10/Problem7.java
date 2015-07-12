package projecteuler01to10;
class level7{
	void solve(){
			int i=1;			
			int num=3;
			while(num!=0){
		
				if(isPrime(num)){
				i++;
				if(i==10001){
					System.out.println(num);
					return;
				}
			}
				num++;
		}
	}
	boolean isPrime(int num){
		boolean flag=false;
		for(int i=2;i<(num);i++){
			if(num%i==0){
				flag=false;
				return flag;
			}else{
				flag=true;
			}
		}
		return flag;
	}
}
public class Problem7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new level7().solve();//104743
//		System.out.println(new level7().isPrime(7));
	}

}
