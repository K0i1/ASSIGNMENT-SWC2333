
/**
 * Program Purpose : To demostrate the implementation of instance variables and methods of the class named Flower
 * Programmer : Adila
 * Date : 20 February 2024
 */

//import the respective package
import javax.swing.JOptionPane;
public class Flower
{
 //Declaration of the instance variables
    private String name; 
    private String color;
    private double price; 
    private int quantity;
    
    //Constructor without param
    public Flower(String name, String color, double price, int quantity)
    {
        this.name = name; 
        this.color = color;
        this.price = price; 
        this.quantity = quantity;
    }//end of constructor
    
    //Accessor/retriever/getter
    public String getName()
    {
        return name;        
    }//end of accessor
    
    public String getColor()
    {
        return color;
    }//end of accesssor
    
    public double getPrice()
    {
        return price;
    }//end of accessor
    
    public int getQuantity()
    {
        return quantity;
    }//end of accessor
    
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }//end of accessor
    
    public double calcValue()
    {
        return price * quantity;
    }//end of accessor
    
    //Mutator for all data members
    public void setFlower(String name, String color, double price, int quantity)
    {
        name = name; 
        color = color;
        price = price;
        quantity = quantity;  
    }//end of mutator
    
    //toString method
    public String toString()
    {
        return ("Flower Name = " + name +
                "\nColor = " + color +
                "\nPrice(RM) = " + price +
                "\nQuantity = " + quantity);
    }//end of toString
}//end of class

