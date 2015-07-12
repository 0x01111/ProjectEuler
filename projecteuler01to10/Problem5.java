package projecteuler01to10;

class level5{
	void solve1(){
		int num=100;//±éÀúÕÒÊı
		while(num!=0){
		int i;
		for( i=2;i<=20;i++){
			if(num%i==0){
			continue;
			}else break;
		}
		if(i>20){
			System.out.println(num);
			return;
		}
		num++;
		}
	}
}
public class Problem5 {


	public static void main(String[] args) {
		new level5().solve1();//232792560

	}

}
