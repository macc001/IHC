package ihc.Practicas;

import java.awt.Graphics;
import javax.swing.JApplet;

public class Practica extends JApplet {

    int a[] = {5, 2, 3, 1, 58, 2, 1};

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawString("vector normal", 10, 10);
        g.drawString("vector Asc", 10, 50);
        g.drawString("vector Des", 10, 100);
        pintar(g, 25);
        ordAcs(a);
        pintar(g, 65);
        ordDesc(a);
        pintar(g, 115);
    }

    private void pintar(Graphics g, int fila) {
        int col = 20;
        for (int i = 0; i < a.length; i++) {
            g.drawString("" + a[i], col, fila);
            col += 20;
        }
    }

    private void ordAcs(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
            }
        }
    }

    private void ordDesc(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > a[i]) {
                    int aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
            }
        }
    }
}
