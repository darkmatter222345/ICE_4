
//package pizzashop;

import java.util.Scanner;

/**
  Review class for Final Exam Part D review.
 * Creates a pizza of a given type and cuts it into slices.
 * Note that the following source was used as a reference in 
 * creating this example:
 * Freeman, E.Freeman, E., Sierra, K., & Bates, B. (2004). Head First Design patterns. Sebastopol, CA: O'Reilly.
 * @author dancye, 2019
 */

//Changed it to Main.java
public class Main {

   public static PizzaCutter pizzaCutter = new PizzaCutter();//we only ever want one 
   // of these. The pizza shop takes consistency very seriously
   //and all pizzas must be cut by the same cutter.
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the pizza shop");
        System.out.println("What kind of pizza do you want?");
        System.out.println("Please enter exactly cheese or pepperoni");
        String type = sc.nextLine();
        
        // On this line PizzaFactory pf = new PizzaFactory();
       // Should be cut and compressed, to help simplify and be
        //abstracted, so that the factory pattern will be simple
        
        Pizza pizza = PizzaFactory.createPizza(type);
        
        System.out.println("how many slices would you like?");
        int numSlices = sc.nextInt();
        pizzaCutter.numSlices = numSlices;
        if (pizza!=null)
        {
            System.out.println("Great job, here is your pizza in " + numSlices + " slices");
            
        }
        else
        {
            System.out.println("Enter a valid pizza type so we can cut it next time!");
        }
        
    }//end main
    
}
