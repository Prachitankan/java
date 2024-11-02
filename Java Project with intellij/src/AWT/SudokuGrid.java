package AWT;

import java.awt.*;
import java.awt.event.*;

public class SudokuGrid {
    public static void main(String[] args) {
        Frame frame = new Frame("Sudoku Grid");

        // Create a panel with a 9x9 grid layout
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(9, 9)); // 9 rows, 9 columns

        // Add text fields to the panel
        for (int i = 0; i < 81; i++) {
            TextField textField = new TextField();

            textField.setFont(new Font("Arial", Font.BOLD, 20));
            textField.setBackground(new Color(50, 85, 112)); // Midnight blue background
            textField.setForeground(Color.WHITE); // White text color

            // Add key listener to restrict input to numbers 1 to 9
            textField.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    char c = e.getKeyChar();
                    // Check if the text field already has a character or if the input is not a digit 1-9
                    if (!textField.getText().isEmpty() || !(c >= '1' && c <= '9')) {
                        e.consume(); // Ignore the event if the condition is met
                    }
                }
            });

            // Centering the text is not directly possible in AWT TextField
            panel.add(textField);
        }

        // Add the panel to the frame
        frame.add(panel);

        // Set frame properties
        frame.setSize(600, 600);
        frame.setVisible(true);

        // Add window listener to close the window
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
