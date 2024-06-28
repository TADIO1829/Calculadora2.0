import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class Normales {
    public JButton sum;
    public JPanel panel1;
    public JButton multi;
    public JButton rest;
    public JButton div;
    public JTextField NUM1;
    public JTextField NUM2;
    public JLabel resultado;
    double numero,numero2;


    public Normales() {
        NUM1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = NUM1.getText();
                numero= Double.parseDouble(num1);

            }
        });
        NUM2.addComponentListener(new ComponentAdapter() {
        });
        NUM2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num2 = NUM2.getText();
                numero2= Double.parseDouble(num2);
            }
        });


        sum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double suma = numero + numero2;
                resultado.setText(suma.toString());

            }
        });

        multi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double multi = numero * numero2;
                resultado.setText(multi.toString());

            }
        });
        rest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double resta = numero - numero2;
                resultado.setText(resta.toString());

            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numero2!=0){
                    Double division = numero / numero2;

                }else{
                    System.out.println("No se puede dividir el numero");
                }
            }
        });
    }
}
