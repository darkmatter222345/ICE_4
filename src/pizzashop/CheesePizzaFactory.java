
class CheesePizzaFactory extends AbstractFactory {
   public Pizza getpizza(String Pizza) {
       if(Pizza.equalsIgnoreCase("Cheese")){
           return new CheesePizza();
       }
       return null;
   }
    
    
}
