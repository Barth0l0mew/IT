package ComCompany;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

public class Sample2 extends  JFrame{
    private JPanel panel;
    private JRadioButton blackRadioButton;
    private JRadioButton greenRadioButton;
    private JRadioButton whiteRadioButton;
    private JButton button1;
    private JLabel label1;
    private ButtonGroup color2;

    public Sample2(){
        setTitle("Sample1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 300);
        setContentPane(panel);
        setLocationRelativeTo(null);
        setVisible(true);


        whiteRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                for (Enumeration<AbstractButton> buttons = color2.getElements(); buttons.hasMoreElements();) {
                    AbstractButton button = buttons.nextElement();

                    if (button.isSelected()) {
                        label1.setText(button.getText());
                    }
                }

            }
        });
        blackRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        Sample2 sample2 = new Sample2();
    }
}
