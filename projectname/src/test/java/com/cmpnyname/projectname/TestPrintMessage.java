package com.cmpnyname.projectname;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPrintMessage {
	String message = "Reny";
	MessagePrinting msgPrinting = new MessagePrinting(message);
	  
	
  @Test(enabled = false)
  public void testPrintMessage() {
	  System.out.println("Inside Test 1 : Testing function : printMessage()");
	  Assert.assertEquals(message, msgPrinting.printMessage());
	  
  }
}
