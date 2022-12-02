package GuiSwing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyFrame {
    MyFrame() {

        /* Part 1 */
        //ImageIcon frameLogo = new ImageIcon("images/dota2.png"); //Create an ImageIcon
        ImageIcon image = new ImageIcon("images/Kiwi.Jpg");
        Border labelBorder = javax.swing.BorderFactory.createLineBorder(Color.CYAN, 3); //Creates a border of the label

        JLabel label = new JLabel(); //Creates a label
        label.setText("Im a Birb"); //Set Text of Label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //Set Text LEFT, CENTER, or RIGHT of imageIcon
        label.setVerticalTextPosition(JLabel.TOP); //Set Text on TOP, CENTER, or BOTTOM of imageIcon
        label.setForeground(Color.decode("#FF5733")); // Set Font Color
        label.setFont(new Font("Comic Sans MS", Font.BOLD, 20)); //Set Font, Font Size, Font Type
        label.setIconTextGap(20); //Set Gap between text and image (can do +-)
        label.setBackground(Color.black); //Set background color
        label.setOpaque(true);  //Display background color
        label.setBorder(labelBorder); //Shows the border
        label.setVerticalAlignment(JLabel.CENTER); //Set vertical position (icon+text) within label
        label.setHorizontalAlignment(JLabel.CENTER); //Set Horizontal position (icon+text) within label
        // label.setBounds() : Set X and Y Axis of (icon+text) manually and the size of the (Icon+Text) manually.
        // This method is powerful kasi kahit na baguhin mo ung dimensions ng frame, static position niya.

        JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("MyFarm"); //Title of the tab/frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit on close Tab
        //frame.setSize(500, 500); //Set x and y dimension
        //frame.setLayout(null);
        frame.setVisible(true); //make the frame visible (this is very important)

        // frame.setIconImage(frameLogo.getImage()); //Change Icon of the frame

       // frame.getContentPane().setBackground(Color.decode("#FDF4E3")); //Set background color of frame

        /** Part 2
         *  JLabel: a GUI display area for a string of text, an image, or both
         *
         */



        // Creates an image and set that image into the label


        frame.add(label); //Do not forget to add this or else it won't appear ang label
        frame.pack(); //Fits all elements depending in the size.


    }
}
