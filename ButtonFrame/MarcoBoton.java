package ButtonFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarcoBoton extends JFrame
{
private final JButton botonJButtonSimple; // botón con texto solamente
private final JButton botonJButtonElegante; // botón con iconos

// MarcoBoton agrega objetos JButton a JFrame
public MarcoBoton()
{
super("Prueba de botones");
setLayout(new FlowLayout());

botonJButtonSimple = new JButton("Boton simple"); // botón con texto
add(botonJButtonSimple); // agrega botonJButtonSimple a JFrame

Icon insecto1 = new ImageIcon(getClass().getResource("Agua.gif"));
Icon insecto2 = new ImageIcon(getClass().getResource("TRUENO.gif"));
botonJButtonElegante = new JButton("Boton elegante", insecto1); // establece la imagen
botonJButtonElegante.setRolloverIcon(insecto2); // establece la imagen de sustitución
add(botonJButtonElegante); // agrega botonJButtonElegante a JFrame

// crea nuevo ManejadorBoton para manejar los eventos de botón
ManejadorBoton manejador = new ManejadorBoton();
botonJButtonElegante.addActionListener(manejador);
botonJButtonSimple.addActionListener(manejador);
}

// clase interna para manejar eventos de botón
private class ManejadorBoton implements ActionListener
{
// maneja evento de botón
 @Override
public void actionPerformed(ActionEvent evento)
{
JOptionPane.showMessageDialog(MarcoBoton.this, String.format(
"Usted oprimio: %s", evento.getActionCommand()));
}
}
}