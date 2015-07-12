package projecteuler41to50;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

class level42{
	void solve() throws IOException{
		int result=0;

		String filename="src\\projecteuler41to50\\p042_words.txt";
		String[] WordString=ReadTxt(filename);
		for(int i=0;i<WordString.length;i++){
			String word=WordString[i];
			int wordTonum=WordToNumber(word);
			if(isTriang(wordTonum)==true){
				result+=1;	
			}
		}
		System.out.println("result:"+result);
	}
	int WordToNumber(String Word){
		int sum=0;
		for(int i=0;i<Word.length();++i){
			String letter=Word.substring(i, i+1);
			sum+=LetterToNumber(letter);
		}
		return sum;
	}
	boolean isTriang(int tn){
		int n=(int)Math.sqrt(2*tn);
		if(n*(n+1)==2*tn)
			return true;
		return false;
	}
	int LetterToNumber(String letter){
		letter=letter.toLowerCase();
		return letter.hashCode()-"a".hashCode()+1;
	}
	String[] ReadTxt(String filename) throws IOException{
		File fl=new File(filename);
		BufferedReader reader=null;
		String tempString=null;
		String WordString="";
		String[] WordArray;
		
		try {
			reader=new BufferedReader(new FileReader(fl));
			while((tempString=reader.readLine())!=null){
				WordString+=tempString;
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WordString=WordString.replaceAll("\"", "");
		WordArray=WordString.split(",");
		return WordArray;
	}
	

}
public class Problem42 {

	public static void main(String[] args) throws IOException{
		Date beginTime=new Date();
		new level42().solve();
		Date endTime=new Date();
		Long Time=endTime.getTime()-beginTime.getTime();
		System.out.println("Time:"+Time/1000+"s"+Time%1000+"ms");
	}
}
