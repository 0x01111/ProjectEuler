package projecteuler11to20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

class level11{
	void solve() throws NumberFormatException, IOException {
		String fileName="src\\projecteuler11to20\\p11.csv";
		int ncol=20;
		int nrow=20;
		int[][] numbers=new int[nrow][ncol];
		numbers=CSVFileReader(fileName,nrow,ncol);
		int max=caculate(numbers,nrow,ncol);
		System.out.println(max);
	}
	
	int caculate(int[][] a,int nrow,int ncol){
		int max=0;
		for(int i=0;i<nrow;i++){
			for(int j=0;j<ncol;j++){
				//横 +4
				int mul=a[i][j];
				for(int k=1;k<4 && (4+j)<ncol;k++){
					mul*=a[i][j+k];
				}
				//System.out.print(mul+" "+max+",");
				if(mul>max) max=mul;
				
				//竖 +4
				mul=a[i][j];
				for(int k=1;k<4 &&(4+i)<nrow;k++){
					mul*=a[i+k][j];
				}
				//System.out.print(mul+" "+max+",");
				if(mul>max) max=mul;
				//右下 +4
				mul=a[i][j];
				for(int k=1;k<4 &&(4+j)<ncol&&(4+i)<nrow;k++ ){
					mul*=a[i+k][j+k];
				}
				//System.out.print(mul+" "+max+",");
				if(mul>max) max=mul;
				//右上 +4
				mul=a[i][j];
				for(int k=1;k<4&&(i+4)<ncol&&(j-4)>=0;k++){
					mul*=a[i+k][j-k];
				}
			//	System.out.print(mul+" "+max+",");
				if(mul>max) max=mul;
				//System.out.println();
			}
		}
		return max;
		
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
public class Problem11 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		new level11().solve();//70600674 
	}

}
