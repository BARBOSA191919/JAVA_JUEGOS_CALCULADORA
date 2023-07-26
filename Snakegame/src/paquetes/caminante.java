
package paquetes;

import java.util.logging.Level;
import java.util.logging.Logger;


public class caminante implements Runnable{
panelsnake panel;
boolean estado=true;
public caminante(panelsnake panel){
    this.panel=panel;
}
    
@Override
@SuppressWarnings("SleepWhileInLoop")
            public void run(){
                while(estado){
                panel.avanzar();
                panel.repaint();
    try {
        Thread.sleep (100);
    } catch (InterruptedException ex) {
        Logger.getLogger(caminante.class.getName()).log(Level.SEVERE, null, ex);
            }
}
}
public void parar(){
this.estado=false;
}
}
