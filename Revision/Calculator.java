package Revision;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

/**
 * Created by marcuspilkington on 22/05/2017.
 */
public class Calculator extends JFrame{
    JPanel jpLeft,jpRight,jpRN,jpRS;
    JButton times,minus,plus,div,CA,equals;
    JTextField jtQ,jtA;
    List<JButton> buttons;
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");

    Calculator(){
        setTitle("Calculator");
        setLayout(new GridLayout(1,2));


        jpLeft = new JPanel(new GridLayout(4,3));
        jpLeft.setBackground(Color.darkGray);
        jpRight= new JPanel(new GridLayout(2,1));
        jpRight.setBackground(Color.darkGray);
        jpRN = new JPanel(new GridLayout(2,1));
        jpRN.setBackground(Color.darkGray);
        jpRS = new JPanel(new GridLayout(2,2));
        jpRS.setBackground(Color.darkGray);

        buttonHandler bh = new buttonHandler(this);


        times = new JButton("*");
        times.addActionListener(bh);
        minus = new JButton("-");
        minus.addActionListener(bh);
        plus = new JButton("+");
        plus.addActionListener(bh);
        div = new JButton("/");
        div.addActionListener(bh);
        CA = new JButton("CA");
        CA.addActionListener(bh);
        equals = new JButton("=");
        equals.addActionListener(bh);


        jtQ = new JTextField(15);
        jtA = new JTextField(15);
        jtA.setEditable(false);

        buttons = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            buttons.add(new JButton(String.valueOf(i)));
            buttons.get(i).addActionListener(bh);
        }

        jpRS.add(times);
        jpRS.add(plus);
        jpRS.add(div);
        jpRS.add(minus);

        jpRN.add(jtQ);
        jpRN.add(jtA);

        jpRight.add(jpRN);
        jpRight.add(jpRS);


        for (int i = 1; i < 10; i++) {
            jpLeft.add(buttons.get(i));

        }

        jpLeft.add(CA);
        jpLeft.add(buttons.get(0));
        jpLeft.add(equals);

        add(jpLeft);
        add(jpRight);

        setSize(600,500);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    class buttonHandler implements ActionListener{
        Calculator c;

        public buttonHandler(Calculator c) {
            this.c = c;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource().equals(buttons.get(1))){
                jtQ.setText(jtQ.getText() + "1");
            }else if(e.getSource().equals(buttons.get(2))){
                jtQ.setText(jtQ.getText() + "2");
            }else if(e.getSource().equals(buttons.get(3))){
                jtQ.setText(jtQ.getText() + "3");
            }else if(e.getSource().equals(buttons.get(4))){
                jtQ.setText(jtQ.getText() + "4");
            }else if(e.getSource().equals(buttons.get(5))){
                jtQ.setText(jtQ.getText() + "5");
            }else if(e.getSource().equals(buttons.get(6))){
                jtQ.setText(jtQ.getText() + "6");
            }else if(e.getSource().equals(buttons.get(7))){
                jtQ.setText(jtQ.getText() + "7");
            }else if(e.getSource().equals(buttons.get(8))){
                jtQ.setText(jtQ.getText() + "8");
            }else if(e.getSource().equals(buttons.get(9))){
                jtQ.setText(jtQ.getText() + "9");
            }else if(e.getSource().equals(buttons.get(0))){
                jtQ.setText(jtQ.getText() + "0");
            }else if(e.getSource().equals(times)){
                jtQ.setText(jtQ.getText() + "*");
            }else if(e.getSource().equals(plus)){
                jtQ.setText(jtQ.getText() + "+");
            }else if(e.getSource().equals(minus)){
                jtQ.setText(jtQ.getText() + "-");
            }else if(e.getSource().equals(div)){
                jtQ.setText(jtQ.getText() + "/");
            }else if(e.getSource().equals(equals)){
                try {
                    jtA.setText(String.valueOf(engine.eval(jtQ.getText())));
                } catch (ScriptException e1) {
                    e1.printStackTrace();
                }

            }else if(e.getSource().equals(CA)){
                jtQ.setText("");
                jtA.setText("");
            }
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
    }
}
