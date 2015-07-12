package projecteuler11to20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.StringTokenizer;

class level18{
	void solve() throws IOException{
		String fileName="src\\projecteuler11to20\\p18.csv";
		int ncol=15;
		int nrow=15;
		int[][] a=new int[nrow][ncol];
		a=CSVFileReader(fileName,nrow,ncol);
		
		for(int i=14;i>=0;i--){
			for(int j=0;j<i;j++){
				if(a[i][j]>a[i][j+1])
					a[i-1][j]+=a[i][j];
				else
					a[i-1][j]+=a[i][j+1];
			}

		}
		System.out.println("最大路径值："+a[0][0]);


	}
	int[][] CSVFileReader(String fileName,int nrow,int ncol) throws NumberFormatException, IOException {
		  
		  File file = new File(fileName);
		  int [][] numbers = new int [nrow][ncol];
		  StringBuilder sb = new StringBuilder();
		  String line = null;
		  int row = 0;
		  int col = 0;
		  BufferedReader br = null;
			br = new BufferedReader(new FileReader(file));

			while( (line = br.readLine()) != null && row<nrow) {
				StringTokenizer st = new StringTokenizer(line,",");
				while (st.hasMoreTokens())
				{
					//get next token and store it in the array
					numbers[row][col] = Integer.parseInt(st.nextToken());//字符转换成数字
					col++;
				}
				col = 0;
				row++;
			  }
			br.close();
			return numbers;
	}

}
public class Problem18 {

	public static void main(String [] args) throws IOException{
		Date beginTime=new Date();
		new level18().solve();//1074
		Date endTime=new Date();
		long Time=endTime.getTime()-beginTime.getTime();
		System.out.println("Time="+Time/1000+"秒:"+Time%1000+"毫秒");
	}
}
