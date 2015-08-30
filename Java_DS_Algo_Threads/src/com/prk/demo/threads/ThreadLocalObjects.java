package com.prk.demo.threads;

import com.prk.app.common.classes.CurrentThread;

public class ThreadLocalObjects {
	
	public static void main(String [] args){
		
		System.out.println(CurrentThread.getApplciationId());
		
		CurrentThread.setApplciationId(100);
		
		System.out.println(CurrentThread.getApplciationId());
		
	}

}
