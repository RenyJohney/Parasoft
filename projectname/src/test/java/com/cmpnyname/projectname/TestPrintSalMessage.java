package com.cmpnyname.projectname;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPrintSalMessage {
	String message = "Reny";
	MessagePrinting msgPrinting = new MessagePrinting(message);
	
  @Test
  public void testPrintSalMessage() {
	  System.out.println("Inside Test 2 : Testing function : printSalMessage()");
	  message = "Hi " +message;
	  Assert.assertEquals(message, msgPrinting.prinSalutationtMessage());
  }
}
