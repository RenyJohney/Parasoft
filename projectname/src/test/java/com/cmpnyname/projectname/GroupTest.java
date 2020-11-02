package com.cmpnyname.projectname;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTest {
	
String message = "Reny";
MessagePrinting msgPrinting = new MessagePrinting(message);
PrintString printString = new PrintString();


  @Test(groups = {"functiontest","checkintest"})
  public void testprintMessage() {
  System.out.println("%%%%%%%Inside testprintMessage()");
  System.out.println("############testprintMessage : " +message);
  //Assert.assertEquals(message, msgPrinting.printMessage());

  }
  
  @Test(groups = {"checkintest"})
  public void testprintSalMessage() {
	  System.out.println("Inside testprintSalMessage()");
	  System.out.println("testprintMessage : " +message);
	
	 // message = "Hi " +"Reny";
	 // Assert.assertEquals(message, msgPrinting.printMessage());
  }
  
  @Test(groups = {"functiontest"})
  public void testprintExitMessage() {
	  System.out.println("Inside testprintExitMessage()");
	  //message = "I'm Exiting this app, "+ "Reny";
	  System.out.println("testprintExitMessage : " +"I'm Exiting this app, "+ "Reny");
	
	  //Assert.assertEquals(message, msgPrinting.printMessage());
  }
}
