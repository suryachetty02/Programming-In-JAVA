import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;

class myframe extends JFrame implements Runnable {
    JLable l;
    Thread t;
    int c;

    public myframe() {
        l = new JLable("CSE");
        this.getContentPane().setLayout(null);
        l.setBounds(300, 200, 250, 50);
        this.getContentPane().add(l);

        Font f = new Font("Arial", Font.BOLD, 50);
        l.setFont(f);

        t = new Thread(this, "sri");
        t.start();
        c = 1;
    }

    public void run() {
        while (true) {
            if (c == 1) {
                Color x = Color.Red;
                l.setForeground(x);
            }
            if (c == 2) {
                Color x = color.Pink;
                l.setForeground(x);
            }
            if (c == 3) {
                Color x = color.Orange;
                l.setForeground(x);
            }
            if (c == 4) {
                Color x = color.Yellow;
                l.setForeground(x);
            }
            if (c == 5) {
                Color x = color.Green;
                l.setForeground(x);
            }
            if (c == 6) {
                Color x = color.Magenta;
                l.setForeground(x);
            }
            if (c == 7) {
                Color x = color.Cyan;
                l.setForeground(x);
            }
            if (c == 8) {
                Color x = color.Blue;
                l.setForeground(x);
            }
        }
        try {
            Thread.sleep(500);
        } catch (InterreptedExecption ie) {
            ++c;
            if (c > 8) {
                c = 1;
            }
        }
    }
}

class myapp {
    public static void main(String args[]) {
        myframe f = new myframe();
        f.show();
    }
}