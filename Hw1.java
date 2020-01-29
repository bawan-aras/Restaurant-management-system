package hw1;

import javax.swing.JOptionPane;

public class Hw1 {

    public static void main(String[] args) {
        int x = 1;
        while (x == 1) {

            int num = Integer.parseInt(JOptionPane.showInputDialog("Enter an Integer"));
            if ((num % 2 == 0)) {
                JOptionPane.showMessageDialog(null, "that number is even");
            } else {
                JOptionPane.showMessageDialog(null, "that number is odd");
            }
            int a = JOptionPane.showConfirmDialog(null, "do you want do another?", "select option", JOptionPane.YES_NO_CANCEL_OPTION);
if(a==JOptionPane.NO_OPTION){
    System.exit(0);
}
else if(a==JOptionPane.CANCEL_OPTION){
    System.exit(0);
}
        }

    }

}
