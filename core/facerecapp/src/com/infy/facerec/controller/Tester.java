package com.infy.facerec.controller;

import com.infy.facerec.persistance.Face;

public class Tester {

	public static void main(String[] args) {
		Face face=new Face();
		
		face.saveFacePixelToDb();
		//if u have 2 classes with the same name then one of them must be fully quailifed
		
		com.infy.facerec.ui.Face face2=new com.infy.facerec.ui.Face();
	}
}
