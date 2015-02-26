/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIConnector;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Tyler
 */
public class FrameOne extends JFrame{
    private final int HIGHT = 300, WIDTH = 500;
    protected final FrameOne INSTANCE = this;
    
    private JPanel panel = new JPanel();
    private JButton button = new JButton("Export");
    private JTextField field = new JTextField();
    
    
    public FrameOne()
    {
        this.setSize(HIGHT, WIDTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.field.setColumns(50);
        this.field.setEditable(true);
        this.panel.setLayout(new GridLayout(2,1));
        this.panel.add(this.field);
        this.panel.add(this.button);
        this.add(this.panel);
        this.setVisible(true);
        
        
    }
    
    public void addActionListener(ActionListener lis)
    {
        this.button.addActionListener(lis);
    }
    
    public void rmActionListener(ActionListener lis)
    {
        this.button.removeActionListener(lis);
    }
    
    public String getText()
    {
        return this.field.getText();
    }
    
    
    
    
    
}
