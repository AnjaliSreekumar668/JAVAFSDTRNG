package com.ust.examples;
import java.io.File;
public class fileexample3 {

	public static void main(String[] args) {
		File file = new File("oldName");
        try {
        	file.createNewFile();
        }
        catch(Exception e) {
        e.getStackTrace();
	}
  File newFile = new File("newName");
  boolean value = file.renameTo(newFile);
  if(value) {
	  System.out.println("The name of the file is changed.");
  }
  else {
	  System.out.println("The name cannot be changed.");
  }
}
}
