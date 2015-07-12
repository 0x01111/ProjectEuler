package projecteuler51to60;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class level59{	
	void solve0(){
		String filenameString="src//projecteuler51to60//p059_cipher.txt";
		String encryptionKey = readFile(filenameString);
		String [] key = encryptionKey.split(",");
		int temp = Integer.valueOf(key[0]);
		System.out.println(temp);
		System.out.println(encryptionKey);
		for(int i=0;i<key.length;i++){
			
		}
	}
	String readFile(String filename){
		File file = new File(filename);
		FileReader fr = null;
		String encryptionKey="";
		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		String line;
		try {
			while((line=br.readLine())!=null){
				encryptionKey= encryptionKey.concat(line); 
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return encryptionKey;
	}

}
public class Problem59 {


	public static void main(String[] args){
		long begin= System.currentTimeMillis();
		new level59().solve0();
		long end = System.currentTimeMillis();
		long Time = end - begin;
		System.out.println("Time:"+Time/1000+"s"+Time%1000+"ms");
	}

}
