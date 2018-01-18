package Revision;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by marcuspilkington on 22/05/2017.
 */
public class PrimeNumber extends JFrame{
    JPanel jp1,jp2;
    JTextField jTF;
    JLabel jLB;
    JButton jBU;

    PrimeNumber(){
        setLayout(new GridLayout(2,1));
        setTitle("nth Prime Number");


        jp1 = new JPanel(new GridLayout(1,2));
        jp1.setBackground(Color.darkGray);
        jp2 = new JPanel();
        jp2.setBackground(Color.darkGray);

        jTF = new JTextField("");
        buttonHandler bh = new buttonHandler(this);
        jBU = new JButton("Solve");
        jBU.addActionListener(bh);
        jLB = new JLabel("Please enter a positive number in the Text Field");
        jLB.setFont(new Font(jLB.getFont().getName(),Font.PLAIN,20));
        jLB.setForeground(Color.WHITE);

        jp1.add(jTF);
        jp1.add(jBU);
        jp2.add(jLB);

        add(jp1);
        add(jp2);

        setSize(500,100);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    class buttonHandler implements ActionListener{
        PrimeNumber pn;

        public buttonHandler(PrimeNumber pn) {
            this.pn = pn;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(jTF.getText().isEmpty()){
                jLB.setText("Please enter a positive number in the Text Field");
            }else if(Integer.parseInt(jTF.getText())<1){
                jLB.setText("Please enter a positive number in the Text Field");
            }else{
            int a = Integer.parseInt(jTF.getText());
            jLB.setText(String.valueOf(nthPrime(a)));
        }}
    }

    public static void main(String[] args) {
        PrimeNumber pn = new PrimeNumber();
    }

    public static int nthPrime(int n) {
        int candidate, count;
        for(candidate = 2, count = 0; count < n; ++candidate) {
            if (isPrime(candidate)) {
                ++count;
            }
        }
        return candidate-1;
    }
    private static boolean isPrime(int n) {
        for(int i = 2; i < n; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
