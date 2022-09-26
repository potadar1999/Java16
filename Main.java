package com.QueOne;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		
		
		
		FileWriter fw=new FileWriter("d://abc.txt");
		
		fw.write("Ani ");
		fw.write("Patna");
		fw.write("\n");
		fw.write("Ani ");
		fw.write("Patna");
		fw.write("\n");
		fw.write("Ani ");
		fw.write("Patna");
		
		fw.flush();
		fw.close();
		
		System.out.println("Done");

		
	}

}
