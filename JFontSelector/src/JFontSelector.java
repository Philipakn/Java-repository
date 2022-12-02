import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFontSelector extends JFrame implements ActionListener {

    JButton b1 = new JButton("Serif Font");
    JButton b2 = new JButton("Courier");
    JButton b3 = new JButton("Monospaced Font");
    JButton b4 = new JButton("Make Larger");
    JButton b5 = new JButton("Make Smaller");
    String text = "Change me";
    JLabel demo = new JLabel(text);

    Font f1 = new Font("Serif",Font.PLAIN,10);
    Font f2 = new Font("Courier",Font.PLAIN,10);
    Font f3 = new Font("Monospaced",Font.PLAIN,10);

    Container pane = getContentPane();
    GridLayout grid = new GridLayout(3,0);
    JPanel pan1 = new JPanel(new FlowLayout());
    JPanel pan2 = new JPanel(new FlowLayout());
    JPanel pan3 = new JPanel(new FlowLayout());

    final int width = 500;
    final int length = 500;

    public JFontSelector(){

        setDefaultCloseOperation(3);
        setSize(width,length);
        setContentPane(pane);
        demo.setFont(new Font("Courier",Font.PLAIN,20));
        pane.setLayout(grid);
        pan1.add(b1);
        pan1.add(b2);
        pan1.add(b3);
        pan2.add(b4);
        pan2.add(b5);
        pan3.add(demo);
        pane.add(pan1);
        pane.add(pan2);
        pane.add(pan3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Font chan;
        Font chan1;
        float size;

        if(e.getSource() == b1){
            demo.setFont(f1);
        }
        if(e.getSource() == b2){
            demo.setFont(f2);
        }
        if(e.getSource() == b3){
            demo.setFont(f3);
        }
        if(e.getSource() == b4){
            chan = demo.getFont();
            size = chan.getSize();
            chan1 = chan.deriveFont(size + 10);
            demo.setFont(chan1);
        }
        if(e.getSource() == b5){
            chan = demo.getFont();
            size = chan.getSize();
            chan1 = chan.deriveFont(size - 10);
            demo.setFont(chan1);

        }

            repaint();
    }
}
