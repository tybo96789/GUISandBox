/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIConnector;

/**
 *
 * @author Tyler
 */
public class FrameRunner {
    
    public static void main(String[] args) {
        Thread thread = new Thread("testing"){
            @Override
            public void run()
            {
                new FrameTwo(new FrameOne());
            }
        };
        thread.start();
        
        
    }
    
}
