
package paquetes;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panelfondo extends JPanel {
Color colofondo=Color.gray;
int tammax,tam,can,res;
    
public Panelfondo (int tammax,int can){
this.tammax=tammax;
this.can=can;
this.tam=tammax/can;
this.res=tammax/can;

}
    public void paint(Graphics pintor){
        super.paint(pintor);
        pintor.setColor(colofondo);
for (int i = 0; i< can; i++){
for (int j = 0; j<can; j++){
pintor.fillRect(res/2+i*tam,res/2+j*tam,tam-1,tam-1);
}
}
}
}

