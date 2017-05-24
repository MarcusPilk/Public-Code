package Revision;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by marcuspilkington on 15/05/2017.
 */
public class Revision1 extends JFrame {

    static int size = 10;

    private JPanel jp;
    private JPanel Buttons;
    private JButton jbPlus;
    private JButton jbMinus;

    Revision1(){
        setLayout(new BorderLayout());

        jp = new JPanel()
        {
            public void paintComponent (Graphics graphics) {draw(graphics,size);}
        };
        Buttons = new JPanel(new GridLayout(0,2));
        jbPlus = new JButton("+");
        jbMinus = new JButton("-");
        changeSize cs = new changeSize(this);
        jbPlus.addActionListener(cs);
        jbMinus.addActionListener(cs);
        


        Buttons.add(jbPlus);
        Buttons.add(jbMinus);
        add(jp, BorderLayout.CENTER);
        add(Buttons, BorderLayout.SOUTH);

        setSize(500,500);
        setTitle("Revision 1");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void draw( Graphics g, int size){
        g.setColor( Color.GREEN);
        g.fillRect(10,10,size,size);
    }


    public static void main(String[] args) {
        new Revision1();
    }

    class changeSize implements ActionListener{
        Revision1 r;

        public changeSize(Revision1 r) {
            this.r =r;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource().equals(jbPlus)){
                size = size+20;
            }else if(e.getSource().equals(jbMinus)){
                size=size-20;
            }repaint();
        }
    }

}
