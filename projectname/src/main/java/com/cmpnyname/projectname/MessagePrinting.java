package com.cmpnyname.projectname;

public class MessagePrinting {
	
	public MessagePrinting(String message) {
		//super();
		this.message = message;
	}
	
	public String printMessage() {
		System.out.println(message);
		return message;
			
	}

	public String prinSalutationtMessage() {
		message  = "Hi "+ message;
		System.out.println(message);
		return message;
			
	}
	
	public String printExitMessage() {
		message = "I'm Exiting this app, "+ message;
		
		return message;
		
	}
	
	String message;

}
