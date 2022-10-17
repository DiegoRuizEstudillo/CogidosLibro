package TextFieldFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CampoTextoMarco extends JFrame {
    private final JTextField campoTexto1;
    private final JTextField campoTexto2;
    private final JTextField campoTexto3;
    private final JPasswordField campoContraseña;

    public CampoTextoMarco(){
        super("Prueba de JTextField y JPasswordField");
        setLayout(new FlowLayout());

        campoTexto1=new JTextField(10);
        add(campoTexto1);

        campoTexto2=new JTextField("Escriba el Texto aquí");
        add(campoTexto2);

        campoTexto3=new JTextField("Campo de texto no editable",21);
        campoTexto3.setEditable(false);
        add(campoTexto3);

        campoContraseña=new JPasswordField("Texto oculto");
        add(campoContraseña);

        ManejadorCampoTexto manejador=new ManejadorCampoTexto();
        campoTexto1.addActionListener(manejador);
        campoTexto2.addActionListener(manejador);
        campoTexto3.addActionListener(manejador);
        campoContraseña.addActionListener(manejador);
    }
    private class ManejadorCampoTexto implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            String cadena= "";

            if(evento.getSource()==campoTexto1)
                cadena=String.format("campoTexto1: %s", evento.getActionCommand());
            else if (evento.getSource()==campoTexto2)
                cadena=String.format("campoTexto2:%s", evento.getActionCommand());

            else if (evento.getSource()==campoContraseña)
                cadena=String.format("campoContraseña: %s", evento.getActionCommand());

            JOptionPane.showMessageDialog(null, cadena);
        }
    }
}