class Superclass {
   int age = 6;

   Superclass(int age) {
      this.age = 5; 		 
   }

   public void getAge() {
      System.out.println("The value of the variable named age in super class is: " +age);
   }
}

public class SubClass extends Superclass {
	SubClass(int age) {
      super(4);
   }

   public static void main(String args[]) {
	   SubClass s = new SubClass(24);
      s.getAge();
   }
}