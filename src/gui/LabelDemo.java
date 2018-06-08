package gui;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class LabelDemo {

    public static void main(String[] args) {
        JLabel northLabel = new JLabel("North");
        ImageIcon labelIcon = new ImageIcon("GUItip.gif");

        //create Jlabel with image
        JLabel centerLabel = new JLabel(labelIcon);

        //create a Jlabel with image and text
        JLabel southLabel = new JLabel(labelIcon);

        southLabel.setText("South");

        JFrame application = new JFrame();
        //define what happens when application close the window
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //add components to the Jframe
        application.add(northLabel,BorderLayout.NORTH);
        application.add(centerLabel,BorderLayout.CENTER);
        application.add(southLabel,BorderLayout.SOUTH);

        //define the size of the frame
        application.setSize(300,300);
        application.setVisible(true);

    }
}
