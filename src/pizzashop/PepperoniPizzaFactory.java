
class PepperoniPizzaFactory extends AbstractFactory {
    public Pizza getpizza(String Pizza){
        
        if(Pizza.equalsIgnoreCase("Pepperoni")){
            return new PepperoniPizza();
        }
        return null;
    } 
    
}
