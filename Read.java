package com.QueTwo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileReader ir = new FileReader("d://abc.txt");
		
		BufferedReader br =new BufferedReader(ir);
		
		String line=br.readLine();
		
		while(line != null) {
			System.out.println(line);
			line=br.readLine();
		}
              br.close();
	}

}
