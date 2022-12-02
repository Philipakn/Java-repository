import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMovingFrame extends JFrame implements ActionListener {

    JPanel[] pan = new JPanel[5];
    JButton but = new JButton("Click me");
    JLabel lab = new JLabel("Mover");
    BorderLayout bod = new BorderLayout();
    Container con = getContentPane();

    public JMovingFrame(){

        pan[0] = new JPanel();
        pan[1] = new JPanel();
        pan[2] = new JPanel();
        pan[3] = new JPanel();
        pan[4] = new JPanel();
        setSize(400,400);
        setContentPane(con);
        setDefaultCloseOperation(3);
        con.setLayout(bod);
        pan[0].add(lab);
        pan[0].add(but);
        con.add(pan[0],BorderLayout.CENTER);
        con.add(pan[1],BorderLayout.EAST);
        con.add(pan[2],BorderLayout.SOUTH);
        con.add(pan[3],BorderLayout.WEST);
        con.add(pan[4],BorderLayout.NORTH);
        but.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int hold;
        int max = 4, min = 0;
        if(e.getSource() == but ){
            remove(lab);
            hold = (int)(Math.floor(Math.random()*(max-min+1)+min));
            pan[hold].add(lab);
        }
        revalidate();
    }
}
