/**
 * 
 */
package com.paxotech.abercrombie.framework.scripts;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;




/**
 * @author masihur
 *
 */
public class RenameFile {
		public static ArrayList<String> toBeRenamed = new ArrayList<String>();
	
	   private static final String FILE_DIR = System.getProperty("user.dir")+"/TestVideos/";
	   private static final String FILE_TEXT_EXT = ".avi";

	   public static void run() {
	         new RenameFile().renameFile(FILE_DIR, FILE_TEXT_EXT);
	   }

	   public void renameFile(String folder, String ext){

	     GenericExtFilter filter = new GenericExtFilter(ext);
	     File dir = new File(folder);
	     if (dir.exists()) { 
	     //list out all the file name with .txt extension
	     String[] list = dir.list(filter);


	     if (list.length == 0) return;

	     File fileRename;
	     File renameToFile;
	     for (int i=0;i<list.length;i++){
	    String temp = new StringBuffer(FILE_DIR)
	                      .append(File.separator)
	                      .append(list[i]).toString();
	        fileRename = new File(temp);
	        renameToFile=new File(toBeRenamed.get(i));
	        boolean isRenamed = fileRename.renameTo(renameToFile);
	        System.out.println("file : " + temp + " is renamed : " + isRenamed);
	     }
	   }
	   }
	   //inner class, generic extension filter 
	   public class GenericExtFilter implements FilenameFilter {

	       private String ext;

	       public GenericExtFilter(String ext) {
	         this.ext = ext;             
	       }

	       public boolean accept(File dir, String name) {
	         return (name.endsWith(ext));
	       }
	    }
	}
