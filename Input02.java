package input02;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Is this a question?",
                "we just asking",
                2,
                null,
                null,
                "Type something here bruh.");
        
        String[] acceptableValues = {"bruh", "huyuy", "njyr"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "choose one",
                "we just asking",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
        
        JOptionPane.showMessageDialog(null,
                "There's no input here, just wait",
                "just an info",
                0);
        
        System.out.println("what you type = " +input1);       
        System.out.println("what you choose = " +input2);
        System.out.println("");
        String input2Up = input2.toUpperCase();
        System.out.println("CONGRATS FOR TAKE IN " +input2Up+ " SIDE!!");
    }
}
