import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Funciones {
    public JButton senoButton;
    public JPanel panel1;
    public JButton cosenoButton;
    public JButton tangenteButton;
    public JTextField NUM;
    public JLabel resultado;
    private JButton raizCuadradaButton;
    double numero;


    public Funciones() {
        NUM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = NUM.getText();
                numero= Double.parseDouble(num1);
            }
        });

        senoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double seno = Math.sin(Math.toRadians(numero));
                resultado.setText(String.format("%.2f", seno));


            }
        });
        cosenoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double coseno = Math.cos(Math.toRadians(numero));
                resultado.setText(String.format("%.2f", coseno));
            }
        });
        tangenteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double tangente = Math.tan(Math.toRadians(numero));
                resultado.setText(String.format("%.2f", tangente));

            }
        });
        raizCuadradaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double raiz=Math.sqrt(numero);
                resultado.setText(String.format("%.2f", raiz));
            }
        });
    }
}
