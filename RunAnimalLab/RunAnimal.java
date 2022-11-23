import java.util.Scanner;
public class RunAnimal{
   public static void main (String[]args){
   Scanner sc = new Scanner(System.in);
   

   System.out.print("Choose an Animal. Press B for Bird, C for Cat or D for Dog:");
   String c = sc.nextLine();
   if(c.equalsIgnoreCase("B")){
   	    Bird kalapati = new Bird();
   	    	kalapati.eat();
   	    	kalapati.sleep();
   	    	kalapati.makesound();
   }
   else if(c.equalsIgnoreCase("C")){
   	    Cat aspin= new Cat();
   	    	aspin.eat();
   	    	aspin.sleep();
   	    	aspin.makesound();
   }
   else if(c.equalsIgnoreCase("D")){
   	    Dog shitzu = new Dog();
   	    	shitzu.eat();
   	    	shitzu.sleep();
   	    	shitzu.makesound();
   }
   
   else{
   	System.out.println("Invalid choice");
   }
 }
}