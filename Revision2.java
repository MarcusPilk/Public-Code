package Revision;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by marcuspilkington on 22/05/2017.
 */
public class Revision2 extends JFrame {
    Revision2(){
        setLayout(new BorderLayout());
        JPanel nPanel = new JPanel();
        JPanel cPanel = new JPanel();
        JPanel sPanel = new JPanel(new GridLayout(4,3));
        JTextArea jText = new JTextArea(30,30);

        jText.setEditable(false);
        jText.setLineWrap(true);
        JLabel title = new JLabel("Phone");
        List<JButton> buttons = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            buttons.add(new JButton(String.valueOf(i)));
        }
        JButton hash = new JButton("#");
        JButton Zero = new JButton("0");
        JButton star = new JButton("*");
        nPanel.add(title);
        cPanel.add(jText);
        for (int i = 0; i < 9; i++) {
            sPanel.add(buttons.get(i));
        }
        sPanel.add(hash);
        sPanel.add(Zero);
        sPanel.add(star);
        add(nPanel, BorderLayout.NORTH);
        add(cPanel, BorderLayout.CENTER);
        add(sPanel, BorderLayout.SOUTH);
        setSize(400,600);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Revision2();

    }
}