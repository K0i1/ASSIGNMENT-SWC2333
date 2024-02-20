
/**
 * Program Purpose : To define the attributes (instance variables) and behaviours (instance methods) of a class named FlowerShop
 * Programmer : Adila
 * Date : 20 February 2024
 */

//import the respective package
import javax.swing.JOptionPane;
//Driver class
public class FlowerShop
{
  //Driver method
  public static void main(String[] args)
  {

      //Declaration of an array of size 10 named Flower
      Flower[] flower = new Flower[2];
      
      //Declaration of all variables
      String name, color;
      int quantity;
      double price;
      
      for(int i=0; i<2; i++)
      {
          name = JOptionPane.showInputDialog("Enter the flower name" + (i + 1) + " : ");
          color= JOptionPane.showInputDialog("Choose the flower color: ");
          price = Double.parseDouble(JOptionPane.showInputDialog("Enter the flower price(RM):"));
          quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the flower quantity:"));
             
          //Instantiate each element of the array
          flower[i] = new Flower(name, color, price, quantity);
          
          //Call the toString method
          System.out.println(flower[i].toString());
          
        }//end of for
  }//end of main
}//end of class
