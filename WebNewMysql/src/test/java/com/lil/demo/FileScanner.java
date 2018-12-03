package com.lil.demo;

import java.io.File;

public class FileScanner {

	   public static void main( String [] args ) {
	        File actual = new File("./src/main/resources/static/");
	        for( File f : actual.listFiles()){
	            System.out.println( f.getName() );
	        }
	        
	    }
} 