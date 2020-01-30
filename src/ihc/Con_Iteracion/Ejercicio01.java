package ConIteracion;

import java.applet.Applet;
import java.awt.Event;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

public class Ejercicio01 extends Applet {

    private Label lb;
    private TextField tf;
    private TextField tfa;
    private TextArea ta;
    int a[] = new int[5];
    int f[] = new int[5];

    public void init() {
        lb = new Label("Introducir rango");
        tf = new TextField(40);
        tfa = new TextField(40);
        ta = new TextArea(20, 20);
        this.add(lb);
        this.add(tf);
        this.add(tfa);
        this.add(ta);
    }

    public boolean action(Event e, Object o) {
        if (e.target == tf) {
            int rango = Integer.parseInt(tf.getText());
            cargarArray(rango);
            encontrarFrec(a);
            mostrarArray(a);
            mostrarGrafica();
        }
        return true;
    }

    public void cargarArray(int rango) {
        for (int i = 0; i < a.length; i++) {
            rango--;
            a[i] = (int) (Math.random() )* rango;
        }
    }

    public void mostrarArray(int[] a) {
        String s = "[ ";
        for (int i = 0; i < a.length; i++) {
            s += a[i] + " ";
        }
        s += " ]";
        tfa.setText(s);
    }

    private void mostrarGrafica() {
        for (int i = 0; i < f.length; i++) {
            ta.append(i + "   " + f[i] + "  :  " + barra(f[i], "x") + "\n");
        }
    }

    private void encontrarFrec(int[] a) {
        for (int i = 0; i < f.length; i++) {
            f[a[i]]++;
        }
    }

    private String barra(int f, String x) {
        String s = "";
        for (int i = 0; i < f; i++) {
            s += x;
        }
        System.out.println(s);
        return s;
    }

}
