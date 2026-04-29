import java.awt.*;
import java.awt.event.*;

class MEHDemo extends Frame implements MouseListener, MouseMotionListener {
    String msg = "", msg2 = "";
    int x = 150, y = 100, xl, yl;

    MEHDemo() {
        addMouseListener(this);
        addMouseMotionListener(this);
        setSize(400, 400);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        msg = "Mouse Clicked";
        repaint();
    }

    public void mouseEntered(MouseEvent me) {
        msg = "Mouse Entered";
        repaint();
    }

    public void mouseExited(MouseEvent me) {
        msg = "Mouse Exited";
        repaint();
    }

    public void mousePressed(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        msg = "Mouse Pressed";
        repaint();
    }

    public void mouseReleased(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        msg = "Mouse Released";
        repaint();
    }

    public void mouseDragged(MouseEvent me) {
        xl = me.getX();
        yl = me.getY();
        msg2 = "Mouse Dragged";
        repaint();
    }

    public void mouseMoved(MouseEvent me) {
        xl = me.getX();
        yl = me.getY();
        msg2 = "Mouse Moved";
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, x, y);
        g.drawString(msg2, xl, yl);
    }

    public static void main(String[] args) {
        new MEHDemo();
    }
}