package com.training;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Cashier implements InitializingBean{
	
	private String name;
	private String path;
	private BufferedWriter writer;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void openFile() throws IOException{
		System.out.println(" opening file");
		File logFile= new File(path,name+".txt");
		writer= new BufferedWriter(new FileWriter(logFile));
		
		
	}
	
	public void checkOut() throws IOException{
		System.out.println("checking out.....");
		writer.write("Checking out at "+new Date());
		writer.flush();
		writer.close();
	}
	
	public void closeFile() throws IOException{
		System.out.println("Closing");
		writer.close();
	}

	public void afterPropertiesSet() throws Exception {
		openFile();
		
	}

//	public void destroy() throws Exception {		
//		closeFile();
//		
//	}

}
