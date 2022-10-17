package CombinationPictureFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MarcoCuadroCombinado extends JFrame {
    private final JComboBox<String> imagenesJComboBox; //Contiene los nombres de los iconos
    private final JLabel etiqueta; //Muesta el icono seleccionado

    private static final String nombres[]={
            "0.gif","1.gif","2.gif","3.gif"};
    private final Icon[] iconos = {
            new ImageIcon(getClass().getResource(nombres[0])),
            new ImageIcon(getClass().getResource(nombres[1])),
            new ImageIcon(getClass().getResource(nombres[2])),
            new ImageIcon(getClass().getResource(nombres[3]))};

    //The FrameCombined Frame constructor adds a JComboBox object to JFrame
    public MarcoCuadroCombinado(){
        super("JComboBox Test");
        setLayout(new FlowLayout());// sets the framework schema

        imagenesJComboBox = new JComboBox<String>(nombres);// sets JComboBox
        imagenesJComboBox.setMaximumRowCount(4);//shows three rows

        imagenesJComboBox.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent evento) {
                        if(evento.getStateChange() == ItemEvent.SELECTED)
                            etiqueta.setIcon(iconos[
                                    imagenesJComboBox.getSelectedIndex()]);
                    }
                }
        );
        add(imagenesJComboBox); //adds combo box to JFrame
        etiqueta = new JLabel(iconos[0]);// displays the first icon
        add(etiqueta);// adds tag to JFrame
    }
}// end of the Frame classCombined Frame
