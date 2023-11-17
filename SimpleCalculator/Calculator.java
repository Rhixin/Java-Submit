package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JButton btnCompute;
    private JComboBox cbOperations;
    private JLabel lblResult;

    public Calculator() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    int num1 = Integer.parseInt(tfNumber1.getText());
                    int num2 = Integer.parseInt(tfNumber2.getText());
                    int op = cbOperations.getSelectedIndex();
                    float result = 0;

                    switch (op){
                        case 0:
                            result = num1 + num2;
                            break;
                        case 1:
                            result = num1 - num2;
                            break;
                        case 2:
                            result = num1 * num2;
                            break;
                        case 3:
                            result = (float) num1 / num2;
                            break;
                    }

                    lblResult.setText(String.valueOf(result));

                }catch (Exception i){
                    JOptionPane.showMessageDialog(null,"Please input a valid number!");
                }
            }
        });
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.setSize(600, 400);
        calc.setTitle("Simple Calculator");
        calc.setLocation(700,350);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setContentPane(calc.panel1);
        calc.setVisible(true);
    }
}
