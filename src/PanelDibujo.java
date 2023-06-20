import javax.swing.*;
import java.awt.*;

public class PanelDibujo extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent((g));
        int anchura = getWidth();
        int altura = getHeight();

        /*
        g.drawLine(20,0,20,altura);
        g.drawLine(200,0,200,altura);
        g.drawLine(20,0,altura/2,anchura/2);
        g.drawLine(altura/2,anchura/2,200,0);
        */

        //g.drawString("Melany Sangucho",5,20);
    }
}
