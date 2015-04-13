package com.demo;

public class SendEmailWorker  implements Runnable{
	
	private Email email;
	private CallBackInterface callBackInterface;
	
	
	public SendEmailWorker(Email email , CallBackInterface callBackInterface){
		this.email = email;
		this.callBackInterface = callBackInterface;
	}

	@Override
	public void run() {
		System.out.println("Started sending email ");
		System.out.println("Step 1 - done ");
		System.out.println("Step 2 - done ");
		System.out.println("Step 3 - done ");
		System.out.println("Completed sending email ");
		callBackInterface.completedSendingEmail(email);
		
	}

}
