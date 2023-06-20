import javax.swing.*;

public class PruebaPanelDibujo {
    public static void main(String[] args) {
        //crea una instancia (objeto) para la clase PanelDibujo
        PanelDibujo panel = new PanelDibujo();
        //crea un marco en la ventana
        JFrame aplicacion = new JFrame();
        //crea un boton para cerrar la ventana
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //aplicacion.add(panel); //agrega panel
        aplicacion.setSize(400,250); //establece tamaño de ventana
        aplicacion.setVisible(true); //permite ver la ventana


    }
}
