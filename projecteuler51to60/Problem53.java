package projecteuler51to60;


class p53{	
	void solve1(){
		int count=0;
		int Max=1000000;
		int[][] table=new int[101][101];
		for(int row=0;row<=100;row++){
			table[row][0]=table[row][row]=1;
			for(int col=1;col<=row-1;++col){
				table[row][col]=table[row-1][col]+table[row-1][col-1];
				if(table[row][col]>Max || table[row][col]< 0){
					++count;
				}
			}
		}
		System.out.println(count);
		
	}
	void solve0(){
	 int count=0;
	 int Max=1000000;
	 boolean tag=true;
		for(int n=23;n<=100;n++){
			tag=true;
			for(int r=0;tag==true&& r<=n/2;r++){
				long c=choose(n,r);
				if(c>Max){
					count+=n+1-2*r;
					tag=false;
				}
			}
		}
		System.out.println(count);
	}
	long choose(int n,int r){
		long res=1;
		for(int i=n-r+1;i<=n;i++)
			res*=i;
		for(int i=1;i<=r;i++)
			res/=i;
		return res;
	}
	
}
public class Problem53 {


	public static void main(String[] args){
		long begin= System.currentTimeMillis();
		new p53().solve1();//4075
		long end = System.currentTimeMillis();
		long Time = end - begin;
		System.out.println("Time:"+Time/1000+"s"+Time%1000+"ms");
	}

}
