package projecteuler01to10;

class level9{
	void solve(){
		int a=1;
		int b=1;
		int c=1000-a-b;
		for(a=1;a<=500;a++){
			for(b=1;b<=500;b++){
				for( c=333;c<1000;c++){
					if(a*a+b*b==c*c && (a+b+c==1000) && a<b &&b<c){
						System.out.println(a+"*"+b+"*"+c+"="+a*b*c);
					}
				}
//				if(1000000+2*a*b==2000*a+2000*b){
//					System.out.println(a+" "+b+" "+(1000-a-b));
//					return ;
//				}
			}
		}
	}
	
}
public class Problem9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new level9().solve();//31875000 输出结果是三个数的乘积而不是链接
//		System.out.println(200*200+375*375+"="+425*425);

	}

}
