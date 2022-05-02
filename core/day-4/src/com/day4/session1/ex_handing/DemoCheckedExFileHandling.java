package com.day4.session1.ex_handing;

import java.io.*;

public class DemoCheckedExFileHandling {
	public static void main(String[] args) {
		//read the file and print each word of it
		try {
			BufferedReader br=new BufferedReader(new FileReader("data.txt"));
			//read and print each line
			String line=null;
			while((line=br.readLine())!=null) {
				//now i need to make token of each
				String tokens[]=line.split(" ");
				for(String token: tokens) {
					System.out.println(token.toLowerCase());
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("file is not found");
		}catch(IOException e) {
			System.out.println("some io ex while processing the file");
		}catch(Exception e) {
			System.out.println("some other ex while processing the file");
		}
	}

}
