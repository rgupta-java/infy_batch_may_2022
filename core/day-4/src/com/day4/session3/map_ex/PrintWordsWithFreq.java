package com.day4.session3.map_ex;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class PrintWordsWithFreq {
	public static void main(String[] args) {
		// read the file and print each word of it

		// 1. create a set
		Map<String, Integer> words = new HashMap<>();

		// 2. read a file and put unique tokens in a set
		try {
			BufferedReader br = new BufferedReader(new FileReader("data.txt"));
			// read and print each line
			String line = null;
			while ((line = br.readLine()) != null) {
				String tokens[] = line.split(" ");
				for (String token : tokens) {
					
					if (words.containsKey(token)) {
						Integer freq = words.get(token);
						freq++;
						words.put(token, freq);
					} else {
						words.put(token, 1);
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("file is not found");
		} catch (IOException e) {
			System.out.println("some io ex while processing the file");
		} catch (Exception e) {
			System.out.println("some other ex while processing the file");
		}

		//3. print it 
		Set<Entry<String, Integer>> entrySet = words.entrySet();
		for(Entry<String, Integer> entry: entrySet) {
			System.out.println(entry.getKey() +": "+ entry.getValue());
		}
		
	}

}
