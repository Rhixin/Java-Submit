package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.time.Year.isLeap;

public class Leapyear extends JFrame{
    private JTextField tfyear;
    private JButton btnCheckYear;
    private JPanel panel1;

    public Leapyear (){

        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println(tfyear.getText());

                try {
                    if( isLeap(Integer.parseInt(tfyear.getText())) ) {
                        //System.out.println("Leap Year siya");
                        JOptionPane.showMessageDialog(null,"Leap Year");
                    }else {
                        //System.out.println("Dili ni Leap Year");
                        JOptionPane.showMessageDialog(null,"Not a leap Year");
                    }
                } catch (NumberFormatException i) {
                    //System.out.println("Dili number");
                    JOptionPane.showMessageDialog(null,"Not a valid input");
                }


            }
        });
    }

    public static void main(String[] args) {
        Leapyear f = new Leapyear();
        f.setSize(1000, 800);
        f.setTitle("Leap Year Checker");
        f.setLocation(400,150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setContentPane(f.panel1);
        f.setVisible(true);
    }



}
