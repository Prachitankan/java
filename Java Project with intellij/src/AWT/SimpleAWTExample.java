package AWT;

import java.awt.*;
import java.awt.event.*;

public class SimpleAWTExample {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Example");


        // Create a button
        Button button = new Button("Click Me");


        // Set button properties and add it to the frame
        button.setBounds(50, 50, 80, 30);
        frame.add(button);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);

        // Add window listener to close the window
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        // Add button click event listener
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });
    }
}

