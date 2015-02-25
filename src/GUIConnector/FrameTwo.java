/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIConnector;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Tyler
 */
public class FrameTwo extends JFrame{
    
    private JLabel label = new JLabel();
    private final int HIGHT = 300, WIDTH = 500;
    protected final FrameTwo INSTANCE = this;
    
    private JPanel panel = new JPanel();
    
    private FrameOne parent;
    
    public FrameTwo(FrameOne parent)
    {
        this.parent = parent;
        this.parent.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
                INSTANCE.label.setText(INSTANCE.parent.getText());
            }
        });
        
        this.setSize(HIGHT, WIDTH);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.panel.setLayout(new GridLayout(2,1));
        this.panel.add(this.label);
        this.add(this.panel);
        this.setVisible(true);
        
    }
    
}
