package Revision;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by marcuspilkington on 22/05/2017.
 */
public class Revision3 extends JFrame{
    JTextField jta1,jta2,jta3;
    JButton plus,minus;
    JPanel jp;

    Revision3(){
        setTitle("Revision.Calculator");
        jp = new JPanel(new GridLayout(1,5));
        jta1 = new JTextField("");
        jta2 = new JTextField("");
        jta3 = new JTextField("0");
        jta3.setEditable(false);

        buttonHandler bh = new buttonHandler(this);

        plus = new JButton("+");
        plus.addActionListener(bh);
        minus = new JButton("-");
        minus.addActionListener(bh);

        jp.add(jta1);
        jp.add(jta2);
        jp.add(plus);
        jp.add(minus);
        jp.add(jta3);

        add(jp);

        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    class buttonHandler implements ActionListener{
        Revision3 r;

        public buttonHandler(Revision3 r) {
            this.r = r;
        }

        public void actionPerformed(ActionEvent e) {
            if(e.getSource().equals(plus)){
               jta3.setText("" + (Integer.parseInt(jta1.getText()) + Integer.parseInt(jta2.getText())));
            }else if(e.getSource().equals(minus)){
                jta3.setText("" + (Integer.parseInt(jta1.getText()) - Integer.parseInt(jta2.getText())));
            }
        }
    }

    public static void main(String[] args) {
        Revision3 r = new Revision3();
    }
}
