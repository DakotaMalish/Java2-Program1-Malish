/*
******************************************************
***  Java2Program1Malish
***  Dakota Malish
******************************************************
*** Purpose of the class 
*** to calculate a 15% tip and dimonstrate a simple use of Try catches 
******************************************************
*** 09/05/18
******************************************************
*** 09/05/18 
******************************************************
*/
package java2.program1.malish;
import javax.swing.JOptionPane;

public class Java2Program1Malish {

    public static void main(String[] args) {
        try{
            String userBill = JOptionPane.showInputDialog(null, 
                    "This calculates the amount of you should tip for you're bill *based on %15* input the total bill here.");
        Double userBillDouble = Double.parseDouble(userBill);
        userBillDouble = userBillDouble*0.15;
        JOptionPane.showMessageDialog(null, 
                "This is how much you should tip you're Server: "+
                        userBillDouble);
        
        }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null,
                            " Pealse only enter numbers nothing else.");
                    }
        
    }
    
}
