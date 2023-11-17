package FoodOrderinsystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Float;

public class FoodOrder extends JFrame{
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftdrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;
    private JPanel panel1;

    public FoodOrder(){
        JCheckBox[] cboxes = {cPizza, cBurger, cFries, cSoftdrinks, cTea, cSundae};
        JRadioButton[] rbuttons = {rbNone, rb5, rb10, rb15};
        Integer[] prices = {100,80,65,55,50,40};
        Double[] discounts = {1.0, 0.95,0.90, 0.85};

        rbNone.setSelected(true);

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sum = 0;
                int index = 0;
                for(JCheckBox i : cboxes){
                    if(i.isSelected()){
                        sum += prices[index];
                    }
                    index++;
                }

                float final_sum = sum;
                index = 0;
                for(JRadioButton i : rbuttons){
                    if(i.isSelected()){
                        final_sum *= (discounts[index]);
                    }
                    index++;
                }

                if(final_sum == 0){
                    JOptionPane.showMessageDialog(null, "Order something please!");
                    return;
                }

                JOptionPane.showMessageDialog(null, String.format("The total price is Php %.2f", final_sum) );
            }
        });
    }

    public static void main(String[] args) {
        FoodOrder fd = new FoodOrder();
        fd.setSize(1000, 800);
        fd.setTitle("Food Ordering System");
        fd.setLocation(400,150);
        fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fd.setContentPane(fd.panel1);
        fd.setVisible(true);
    }


}
