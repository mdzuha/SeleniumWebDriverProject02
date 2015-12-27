/**
 * 
 */
package com.paxotech.abercrombie.framework.scripts;

import java.io.File;
import java.io.FilenameFilter;



/**
 * @author masihur
 *
 */
public class ClearDir {
	   
	   private static final String FILE_DIR = System.getProperty("user.dir")+"/FailedTestCases/";
	   private static final String FILE_TEXT_EXT = ".png";

	   public static void runPng() {
	         new ClearDir();
			ClearDir.deleteFile(FILE_DIR, FILE_TEXT_EXT);
	   }
	   

	   private static final String FILE_DIR2 = System.getProperty("user.dir")+"/TestVideos/";
	   private static final String FILE_TEXT_EXT2 = ".avi";

	   public static void runAvi() {
	         new ClearDir();
			ClearDir.deleteFile(FILE_DIR2, FILE_TEXT_EXT2);
	   }
	   private static final String FILE_DIR3 = System.getProperty("user.dir")+"/log/";
	   private static final String FILE_TEXT_EXT3 = ".log";

	   public static void runLog() {
	         new ClearDir();
			ClearDir.deleteFile(FILE_DIR3, FILE_TEXT_EXT3);
	   }
	   private static final String FILE_DIR4 = System.getProperty("user.dir");
	   private static final String FILE_TEXT_EXT4 = ".zip";

	   public static void runZip() {
	         new ClearDir();
			ClearDir.deleteFile(FILE_DIR4, FILE_TEXT_EXT4);
	   }
	   
	   
	   public static void deleteFile(String folder, String ext){

	     GenericExtFilter filter = new GenericExtFilter(ext);
	     File dir = new File(folder);
	     if (dir.exists()) { 
	     //list out all the file name with .txt extension
	     String[] list = dir.list(filter);

	     if (list.length == 0) return;

	     File fileDelete;

	     for (String file : list){
	    String temp = new StringBuffer(folder)
	                      .append(File.separator)
	                      .append(file).toString();
	        fileDelete = new File(temp);
	        boolean isdeleted = fileDelete.delete();
	        System.out.println("file : " + temp + " is deleted : " + isdeleted);
	     }
	   }
	   }
	   //inner class, generic extension filter 
	   public static class GenericExtFilter implements FilenameFilter {

	       private String ext;

	       public GenericExtFilter(String ext) {
	         this.ext = ext;             
	       }

	       public boolean accept(File dir, String name) {
	         return (name.endsWith(ext));
	       }
	    }
	}
