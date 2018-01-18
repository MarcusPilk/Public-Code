package Revision;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by marcuspilkington on 22/05/2017.
 */
public class Revision4 extends JFrame{
    static int size = 100;
    JButton plus,minus,reset;
    JPanel cJP, sJP;
    Square sq;

    Revision4(){
        setTitle("Resize Square lolz");
        setLayout(new BorderLayout());
        cJP = new JPanel(){
            public void paintComponent(Graphics g){
                sq = new Square(10,10,size,Color.red);
                sq.draw(g);
            }
        };
        sJP = new JPanel(new GridLayout(1,3));

        buttonHandler bh = new buttonHandler(this);
        plus = new JButton("+");
        plus.addActionListener(bh);
        minus = new JButton("-");
        minus.addActionListener(bh);
        reset = new JButton("reset");
        reset.addActionListener(bh);

        sJP.add(plus);
        sJP.add(minus);
        sJP.add(reset);

        add(cJP,BorderLayout.CENTER );
        add(sJP, BorderLayout.SOUTH);

        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    class Square{
        int x,y,size;
        Color c;

        Square(int x, int y, int size, Color c){
            this.x = x;
            this.y = y;
            this.size = size;
            this.c = c;
        }

        public void draw(Graphics g){
            g.setColor(c);
            g.fillRect(x,y,size,size);
        }

    }

    class buttonHandler implements ActionListener{
        Revision4 r;

        public buttonHandler(Revision4 r) {
            this.r = r;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource().equals(plus)){
                size+=10;
            }else if(e.getSource().equals(minus)){
                size-=10;
            }else if(e.getSource().equals(reset)){
                size = 100;
            }
            repaint();
        }
    }

    public static void main(String[] args) {
        Revision4 r = new Revision4();
    }
}
