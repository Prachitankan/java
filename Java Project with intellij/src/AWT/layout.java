package AWT;
import java.awt.*;
import java.awt.event.*;

public class layout {
    public static void main(String[] args) {
        /* Panel panel = new Panel();
        panel.setLayout(new FlowLayout());*/


        // Border Layout : Devide the frame into parts as North South East West and Center


        /*Frame frame = new Frame("JAVA Layout");
        frame.setLayout(new BorderLayout());

        frame.add(new Button("North"), BorderLayout.NORTH);
        frame.add(new Button("South"), BorderLayout.SOUTH);
        frame.add(new Button("East"), BorderLayout.EAST);
        frame.add(new Button("West"), BorderLayout.WEST);
        frame.add(new Button("Center"), BorderLayout.CENTER);


        //Set frame properties
        frame.setSize(500,500);
        frame.setVisible(true);

        //Add window listener to close the window
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

*/



        // Grid LayOut


     /*   Frame frame = new Frame("Grid Layout");

        Panel panel = new Panel();

        panel.setLayout(new GridLayout(3,3));

        panel.add(new Button("Button1"));
        panel.add(new Button("Button2"));
        panel.add(new Button("Button3"));
        panel.add(new Button("Button4"));
        panel.add(new Button("Button5"));
        panel.add(new Button("Button6"));
        panel.add(new Button("Button7"));
        panel.add(new Button("Button8"));
        panel.add(new Button("Button9"));


        frame.add(panel);
        frame.setSize(300,300);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
*/



        // Card LayOut
        /*Frame frame = new Frame("card Layout");
        Panel panel = new Panel();
        CardLayout cardLayout = new CardLayout();
        panel.setLayout(cardLayout);

        panel.add(new Button("Card1"), "Card1");
        panel.add(new Button("Card2"), "Card2");
        cardLayout.show(panel,"Card2");

        frame.add(panel);
        frame.setSize(300,300);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });*/



        //GridBag Layout

        Frame frame = new Frame();
        GridBagLayout layout = new GridBagLayout();
        frame.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(new Button("Button 1"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(new Button("Button 2"), gbc);

        // Add button 3 at (0, 1) spanning 2 columns
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(new Button("Button 3"), gbc);

        // Add button 4 at (0, 2) with padding
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.insets = new Insets(10, 10, 10, 10); // top, left, bottom, right
        frame.add(new Button("Button 4"), gbc);

        // Add button 5 at (1, 2) with weight
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.PAGE_END; // Align to bottom of cell
        frame.add(new Button("Button 5"), gbc);

        frame.setSize(400,300);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
