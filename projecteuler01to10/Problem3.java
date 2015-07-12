package projecteuler01to10;

class level3{
	void solve(){
		int i=2;
	    long maxNum = 600851475143l;
		for(i=2;i*i<maxNum;i++){
			while(maxNum%i==0){
				maxNum/=i;
			}
		}
		System.out.println(maxNum);
	}
}
public class Problem3 {


	public static void main(String[] args) {
		new level3().solve();//6857
	}

}
