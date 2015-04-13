package com.demo;


public class SendEmailAsynchronously {

	public static void main(String[] args) {

		Email email = new Email();
		Thread thread = new Thread(new SendEmailWorker(email, new CallBackInterfaceImpl()));
		thread.start();

	}

}
