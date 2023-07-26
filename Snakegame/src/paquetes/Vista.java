
package paquetes;

import com.sun.glass.events.KeyEvent;
import java.awt.Image;
import java.awt.Toolkit;

public class Vista extends javax.swing.JFrame {
  @Override
public Image getIconImage() {
   Image retValue = Toolkit.getDefaultToolkit().
         getImage(ClassLoader.getSystemResource("resources/snake.jpg"));


   return retValue;
}
panelsnake panel;
@SuppressWarnings("OverridableMethodCallInConstructor")
    public Vista() {
        this.setLocationRelativeTo(null);
      
        
         panel = new panelsnake(800,30);
        this.add(panel);
        panel.setBounds(10,10,800,800);
        panel.setOpaque(false);
     
        initComponents();

        Panelfondo fondo = new Panelfondo(800,30);
        this.add(fondo);
        fondo.setBounds(10,10,800,800);
    this.requestFocus(true);
               
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
    switch (evt.getKeyCode()) {    
        case KeyEvent.VK_LEFT:  
            panel.cambiardireccion("iz");
            break;
        case KeyEvent.VK_RIGHT:
            panel.cambiardireccion("de");
            break;
        case KeyEvent.VK_UP:
            panel. cambiardireccion("ab");
            break;
        case KeyEvent.VK_DOWN:
            panel.cambiardireccion("ar");
            break;
        default:
            break;
    }
    }//GEN-LAST:event_formKeyPressed

    
    public static void main(String args[]) {
  
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

