package ihc.Sin_Iteracion;

import java.awt.Graphics;
import javax.swing.JApplet;

public class Ejercicio01 extends JApplet {

    int[] a = {2, 4, 3, 2, 1};
    int[] f = {0, 0, 0, 0, 0};

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawString("Dato", 10, 10);
        g.drawString("Frec", 50, 10);
        g.drawString("Barra", 100, 10);
        encontrarFrec(a, f);
        pintarGrafic(g);
    }

    public void encontrarFrec(int[] a, int[] f) {
        for (int i = 0; i < a.length; i++) {
            f[a[i]]++;
        }
    }

    public void pintarGrafic(Graphics g) {
        int fila = 30;
        for (int i = 0; i < f.length; i++) {
            g.drawString("" + i, 10, fila);
            g.drawString("" + f[i], 50, fila);
            g.drawString(barra(f[i], "x"), 100, fila);
            fila += 20;
        }
    }

    public String barra(int n, String c) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s += c;
        }
        return s;
    }
}
