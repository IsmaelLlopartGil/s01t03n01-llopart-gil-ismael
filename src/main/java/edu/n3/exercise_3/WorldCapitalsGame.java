package edu.n3.exercise_3;

import java.io.*;
import java.util.*;

public class WorldCapitalsGame {

	 private void start(){
	
		HashMap<String, String> hashMap=new HashMap<String, String>();
		String path="src" + File.separator + "main" + File.separator + "resources" + File.separator + "capitals.txt";
		char[] cancelingCharacters= {'[', '('};
		FileToHashMapConverter converter=new FileToHashMapConverter("=", path ,cancelingCharacters);
		hashMap=converter.getFileOnHashSet();
		
		play(hashMap);				
	}

	private void play(HashMap<String, String> hashMap) {
		
	    List<String> keysAsList=new ArrayList<String>(hashMap.keySet());
	    Random random=new Random();	  
	    byte score=0;
	    
	    String userName=Input.readString("Introdueix el teu nom");
	    System.out.println("Introdueix les capitals dels països proposats. (Amb accents)");
	    
	    for (int i=0; i<10; i++) {
	    	int randomInt=random.nextInt(keysAsList.size());
	    	String capital=keysAsList.get(randomInt);
	    	String answer=Input.readString("Capital de " + capital + "?");
	    	
	    	if (answer.toLowerCase().equals(hashMap.get(capital).toLowerCase())) {
	    		System.out.println("Correcte!");
	    		score+=1;
	    	}  else {
	    		System.out.println("Incorrecte!");
	    	}	    	
	    }
	    
	    System.out.println("La teva puntuació és: " + score + "/10.");
	    saveGame(userName, score);	    
	}
	
	private void saveGame(String userName, byte score) {
		String gameLine=userName + "=" + score;
		String path="src" + File.separator + "main" + File.separator + "resources" + File.separator + "classification.txt";
		DiskWriter writer=new DiskWriter(path);
		writer.writeLine(gameLine);		
	}

	public static void main(String[] args) {
		WorldCapitalsGame game=new WorldCapitalsGame();
		game.start();
	}
}
