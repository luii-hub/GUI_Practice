package panels;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class Main {

    //JPanel = GUI Component that functions as a container to hold other components
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("images/Kiwi.Jpg");

        JLabel label = new JLabel();
        label.setText("Hello World");
        label.setIcon(icon);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.cyan);
        bluePanel.setBounds(250, 0, 250, 250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);

        greenPanel.add(label); //Add label (component) to Panel
        //Adders
        frame.add(redPanel);
        frame.add(greenPanel);
        frame.add(bluePanel);

    }

}
