package com.codingdojo.models;
import java.util.ArrayList;
import java.util.Collections;

public class Museum {

	public static void main(String[] args) {
		ArrayList<Art> museum = new ArrayList<Art>();

		Painting p1 = new Painting("oil");
		museum.add(p1);
		Painting p2 = new Painting("water color");
		museum.add(p2);
		Painting p3 = new Painting("acrylic");
		museum.add(p3);
		
		Sculpture s1 = new Sculpture("marble");
		museum.add(s1);
		Sculpture s2 = new Sculpture("ice");
		museum.add(s2);
		
		Collections.shuffle(museum);
		for(Art each : museum) {
			each.viewArt();
		}
		
	}

}
