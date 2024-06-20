import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class jfLearner {
    // Simple test function that prints button pressed.
    public static void testfunction(){
        System.out.println("button pressed");
    };

    public static void main(String[] args){
        // Create the frame
        JFrame frame = new JFrame();
        // Create the button
        JButton button1 = new JButton("clickme");
        // Set button boundaries.
        button1.setBounds(130, 100, 100, 40);
        // Set button action with a awt.event listener.
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Call the function that you want to run.
                testfunction();
            }
        }); 
        // Add the button to the frame.       
        frame.add(button1);
        // Set frame parameters.
        frame.setSize(800,600);
        frame.setLayout(null);// using no layout managers
        frame.setVisible(true);
    };

}
