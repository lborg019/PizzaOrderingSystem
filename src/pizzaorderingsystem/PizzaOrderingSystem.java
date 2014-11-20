/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaorderingsystem;
import java.util.ArrayList;

/**
 *
 * @author KCISCisco
 */
public class PizzaOrderingSystem {

    /**
     * @param args the command line arguments
     *
     * Choosing a size for the pizza... radio or spinner
     * Possible toppings for the pizza... check box
     * Name of the person making the order... text box
     * Special instructions... text area
     * Delivery? ... check box
     * Create a pizza object
     * Output: Price... label
     *
     */
    
    String pSize;
    ArrayList<String> pToppings;
    String pName;
    String pInstructions;
    String pOption;
    String pPrice;

    @Override
    public String toString() {
        return "Your Order:"
               + "\nSize: " + pSize
               + "\nToppings: " + pToppings.toString()
               + "\nName: " + pName
               + "\nInstructions: " + pInstructions
               + "\nOption: " + pOption
               + "\nPrice: $ " + pPrice;
    }

    public PizzaOrderingSystem(String pSize, ArrayList pToppings, String pName, String pInstructions, String pOption, String pPrice) {
        this.pSize = pSize;
        this.pToppings = pToppings;
        this.pName = pName;
        this.pInstructions = pInstructions;
        this.pOption = pOption;
        this.pPrice = pPrice;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
