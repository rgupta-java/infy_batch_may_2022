package com.day4.session3.set_ex;

import java.io.*;
import java.util.*;
public class PrintUniqueWordsFromTheFile {
	public static void main(String[] args) {
		//read the file and print each word of it
		
		//1. create a set
		Set<String> words=new TreeSet<String>();
		
		//2. read a file and put unique tokens in a set
		try {
			BufferedReader br=new BufferedReader(new FileReader("data.txt"));
			//read and print each line
			String line=null;
			while((line=br.readLine())!=null) {
				String tokens[]=line.split(" ");
				for(String token: tokens) {
					words.add(token);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("file is not found");
		}catch(IOException e) {
			System.out.println("some io ex while processing the file");
		}catch(Exception e) {
			System.out.println("some other ex while processing the file");
		}
		
		//3. print that
		for(String word: words) {
			System.out.println(word);
		}
	}

}
