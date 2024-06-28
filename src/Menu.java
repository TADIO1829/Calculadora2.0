import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    public JPanel panel1;
    public JButton normalesButton;
    public JButton funcionesButton;

    public Menu() {
        normalesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jf = new JFrame("pe");
                jf.setContentPane(new Normales().panel1);
                jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jf.setSize(700, 200);
                jf.setPreferredSize(new Dimension(700, 200));
                jf.setMinimumSize(new Dimension(700, 200));
                jf.pack();
                jf.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(normalesButton)).dispose();

            }
        });
        funcionesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame j2 = new JFrame("Funciones");
                j2.setContentPane(new Funciones().panel1);
                j2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                j2.setSize(700, 200);
                j2.setPreferredSize(new Dimension(700, 200));
                j2.setMinimumSize(new Dimension(700, 200));
                j2.pack();
                j2.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(normalesButton)).dispose();

            }
        });
    }
}
