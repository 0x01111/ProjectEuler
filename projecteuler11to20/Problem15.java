package projecteuler11to20;
import java.util.Date;
class level15{
	void solve(){
		int ncol=20;
		int nrow=20;
		long[][] array=new long[nrow+1][ncol+1];
		for(int i=0;i<=nrow;i++){
			array[i][0]=1;
			array[0][i]=1;
		}
		for(int i=1;i<=nrow;i++){
			for(int j=1;j<=ncol;j++){
				array[i][j]=array[i][j-1]+array[i-1][j];
			}
		}
		System.out.println("result="+array[nrow][ncol]);
		
	}
}
public class Problem15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date beginTime=new Date();
		new level15().solve();//137846528820
		Date endTime=new Date();
		long Time=endTime.getTime()-beginTime.getTime();
		System.out.println("Time="+Time/1000+"Ãë"+Time%1000+"ºÁÃë");

	}

}
