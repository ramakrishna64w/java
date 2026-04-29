import java.awt.*;
import java.awt.event.*;

class KEHandling extends Frame implements KeyListener {
    String msg = "", msg2 = "";

    KEHandling() {
        addKeyListener(this); // Corrected method name
    }

    public void keyPressed(KeyEvent ke) {
        msg += "Key Pressed ";
        repaint();
    }

    public void keyReleased(KeyEvent ke) {
        msg += "Key Released ";
        repaint();
    }

    public void keyTyped(KeyEvent ke) {
        msg2 += ke.getKeyChar(); // Corrected method name
        msg += "Key Typed ";
        repaint();
    }

    public static void main(String args[]) {
        KEHandling kh = new KEHandling(); // Corrected declaration
        kh.setTitle("My First Window");   // Corrected method name
        kh.setSize(200, 500);
        kh.setVisible(true);

        kh.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) { // Corrected method name
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        g.drawString(msg, 100, 50);  // Corrected method name
        g.drawString(msg2, 100, 100);
        msg = "";
    }
}