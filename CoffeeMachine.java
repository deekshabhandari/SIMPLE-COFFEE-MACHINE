import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

    
    	        System.out.println("Starting to make a coffee");
    	        System.out.println("Grinding coffee beans");
    	        System.out.println("Boiling water");
    	        System.out.println("Mixing boiled water with crushed coffee beans");
    	        System.out.println("Pouring coffee into the cup");
    	        System.out.println("Pouring some milk into the cup");
    	        System.out.println("Coffee is ready!");
    	        
    	        
    	        int x;
    	        int water = 200;
    	        int milk  = 50;
    	        int beans = 15;

    	        System.out.println("Write how many cups of coffee you will need:");
    	        Scanner in = new Scanner(System.in);

    	        x = in.nextInt();
    	        System.out.println("For " +x +" cups of coffee you will need:");
    	        System.out.println(water*x +" ml of water");
    	        System.out.println(milk*x +" ml of milk");
    	        System.out.println(beans*x +" g of coffee beans in the Machine....");
    	        
    	        
    	        System.out.println("COFFEE WILL BE READY IN 2 MINUTES!!!");
    	        
    	        
    	        
    	        

    	    }
    	}