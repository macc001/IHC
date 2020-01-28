package ihc.Sin_Iteracion;

import java.awt.Graphics;
import java.util.Arrays;
import javax.swing.JApplet;

public class Ejercicio04 extends JApplet {

    int m[][] = {{4, 2, 3, 2, 1}, {5, 4, 6, 2, 5}};

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        g.drawString("matriz", 140, 10);
        pintarM(g, m, 110, 30);
        g.drawString("suma columna", 5, 70);
        sumaCol(g, m);
        g.drawString("menor columna", 5, 90);

    }

    private void pintarM(Graphics g, int[][] m, int x, int y) {
        for (int[] m1 : m) {
            System.out.println(Arrays.toString(m1));
            int col = x;
            for (int j = 0; j < m1.length; j++) {
                g.drawString("" + m1[j], col, y);
                col += 20;
            }
            y += 20;
        }
    }

    private void pintarA(Graphics g, int col) {
//        int fil = 20;
//        for (int i = 0; i < a.length; i++) {
//            g.drawString("" + a[i], col, fil);
//            col += 20;
//        }
    }

    private void sumaCol(Graphics g, int[][] m) {
        for (int j = 0; j < m.length; j++) {
            int suma = 0;
            for (int i = 0; i < m[0].length; i++) {
                suma = suma + m[j][i];
            }
            g.drawString("" + suma, 10, 15);
        }
    }
}
