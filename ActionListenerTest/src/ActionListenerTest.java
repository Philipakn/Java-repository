
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class ActionListenerTest implements ActionListener, ItemListener {

    JButton button1;
    JButton button2;
    JFrame frame;
    JTextArea textArea;
    JCheckBox check;

    public ActionListenerTest() {

        button1 = new JButton("Click Me");
        button2 = new JButton("Click me too");
        frame = new JFrame("ActionListener Test");
        textArea = new JTextArea(5, 40);
        check = new JCheckBox("Coffee",false);
        frame.setLocationRelativeTo(null);
        FlowLayout flow = new FlowLayout();

        button1.addActionListener(this);
        button2.addActionListener(this);
        check.addItemListener(this);

        textArea.setLineWrap(true);
        frame.setLayout(flow);
        frame.add(textArea);
        frame.add(button1);
        frame.add(button2);
        frame.add(check);
        frame.pack();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == button1){
            textArea.setText("You have clicked the button one.");
        }else{
            textArea.setText("You have clicked the button two.");
        }
    }

    public static void main(String [] args) {
        ActionListenerTest test = new ActionListenerTest();
        System.out.println(test.check.getText());
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        textArea.setText("You have clicked the button three.");
    }
}
