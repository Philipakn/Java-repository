import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DebugFifteen3 extends JFrame implements KeyListener {

    char key;

    Container con = null;
    GridLayout grid = new GridLayout(2, 1);
    JLabel label = new JLabel("Key Typed:");
    JTextArea textArea = new JTextArea(3, 25);
    public DebugFifteen3()
    {
        setTitle("Debug Key Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con = this.getContentPane();
        con.setLayout(grid);
        con.add(textArea);
        con.add(label);
        addKeyListener(this);
        textArea.addKeyListener(this);
    }

    public void keyTyped(KeyEvent e)
    {
        char c = e.getKeyChar();
        label.setText("Key Typed: " + c);
    }

    public void keyPressed(KeyEvent e)
    {
    }

    public void keyReleased(KeyEvent e)
    {
    }

    public static void main(String[] args)
    {
        DebugFifteen3 kFrame = new DebugFifteen3();
        kFrame.setSize(300, 200);
        kFrame.setVisible(true);
    }
}
