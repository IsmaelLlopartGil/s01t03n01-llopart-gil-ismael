package edu.n1.exercise_3;

import java.io.*;
import java.util.*;

public class FileToHashMapConverter {
	
	private char[] cancelingCharacters;
	private String fileName;
	private String splitCharacter;
	
	public FileToHashMapConverter(String splitCharacter, String fileName, char[] cancelingCharacters){
		this.splitCharacter=splitCharacter;
		this.fileName=fileName;
		this.cancelingCharacters=cancelingCharacters;
	}
	
	public FileToHashMapConverter(String splitCharacter, String fileName) {
		this.splitCharacter=splitCharacter;
		this.fileName=fileName;
	}
	
	public HashMap<String, String> getFileOnHashSet() {
		
		HashMap<String, String> hashMap=new HashMap<String, String>();
		String line;
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			
		    while ((line = reader.readLine()) != null)
		    {
		    	boolean ignoredLine=false;		    	
		    	
		    	if (cancelingCharacters!=null){
		    		
			    	for (char c : cancelingCharacters) {
			    		
						if (line.contains(Character.toString(c))) {
							ignoredLine=true;
						}		
					}	
		    	}
		    	
		    	if (!ignoredLine) {
		    		String[] parts = line.split(splitCharacter, 2);
		    		
			        if (parts.length >= 2)
			        {
			            String key = parts[0];
			            String value = parts[1];
			            hashMap.put(key, value);
			        }       
		    	}    
		    }			    
			reader.close();
	
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		
		return hashMap;
	}	
}
