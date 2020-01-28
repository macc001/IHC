package ihc.Sin_Iteracion;

import java.awt.Graphics;
import javax.swing.JApplet;

public class Ejercicio03 extends JApplet {

    int a[] = {4, 5, 1, 3, 5, 2, 5};

    public void init() {

    }

    public void paint(Graphics g) {
        g.drawString("vector normal: ", 10, 20);
        g.drawString("vector ordAcs: ", 10, 60);
        g.drawString("vector OrdDes: ", 10, 100);
        pintar(g, 40);
        mostrarVectorAcs(a);
        pintar(g, 80);
        mostrarVectorDes(a);
        pintar(g, 120);
    }

    private void mostrarVectorAcs(int[] a) {
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

    private void mostrarVectorDes(int[] a) {
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

    private void pintar(Graphics g, int fil) {
        int col = 20;
        for (int i = 0; i < a.length; i++) {
            g.drawString("" + a[i], col, fil);
            col += 20;
        }
    }

}
