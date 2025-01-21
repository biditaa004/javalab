import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ColorButton extends JFrame {
    public ColorButton() {
        setTitle("Color Buttons");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton redButton = new JButton("PINK");
        redButton.setBackground(Color.PINK);
        redButton.addActionListener
        (new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.PINK);
            }
        }
        );

        JButton greenButton = new JButton("CYAN");
        greenButton.setBackground(Color.CYAN);
        greenButton.addActionListener
        (new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                getContentPane().setBackground(Color.CYAN);
            }
        }
        );

        JButton blueButton = new JButton("MAGENTA");
        blueButton.setBackground(Color.MAGENTA);
        blueButton.addActionListener
        (new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                getContentPane().setBackground(Color.MAGENTA);
            }
        }
        );

        add(redButton);
        add(greenButton);
        add(blueButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorButton();
    }
}