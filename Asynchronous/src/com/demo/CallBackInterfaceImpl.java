package com.demo;

public class CallBackInterfaceImpl implements CallBackInterface {

	@Override
	public void completedSendingEmail(Email email) {
		System.out.println("Call back interface called");
		
	}

}
