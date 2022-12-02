import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserGUI extends JFrame implements ActionListener {

    Container pane = getContentPane();
    static JTextField inputField = new JTextField();
    JLabel timeButton = new JLabel(" ", SwingConstants.CENTER);
    JButton searchButton = new JButton("Search");
    JLabel executionTime = new JLabel("Execution time :", SwingConstants.CENTER);
    static DefaultListModel model = new DefaultListModel();

    public UserGUI() {

        setTitle("Search GUI");
        setSize(550, 350);
        setContentPane(pane);
        pane.setLayout(null);
        pane.setBackground(new Color(0x9086729B, true));

        inputField.setBounds(80, 30, 120, 40);
        inputField.setSize(180, 40);
        pane.add(inputField);
        inputField.setHorizontalAlignment(inputField.CENTER);
        inputField.setVisible(true);

        searchButton.setBounds(260, 30, 120, 40);
        searchButton.setSize(200, 40);
        pane.add(searchButton);
        searchButton.setVisible(true);
        searchButton.addActionListener(this);
        searchButton.setFont(new Font("Serif", Font.BOLD, 16));

        executionTime.setBounds(80, 80, 120, 40);
        executionTime.setSize(180, 40);
        pane.add(executionTime);
        executionTime.setOpaque(true);
        executionTime.setVisible(true);
        executionTime.setFont(new Font("Serif", Font.BOLD, 16));

        timeButton.setBounds(260, 80, 120, 40);
        timeButton.setSize(200, 40);
        pane.add(timeButton);
        timeButton.setOpaque(true);
        timeButton.setVisible(true);
        timeButton.setFont(new Font("Serif", Font.BOLD, 16));

        JList list = new JList(model);
        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setBounds(160, 140, 120, 40);
        scrollPane.setSize(200, 140);
        scrollPane.setViewportView(list);
        list.setVisibleRowCount(8);
        list.setLayoutOrientation(JList.VERTICAL);
        list.setPreferredSize(new Dimension(200, 200));
        pane.add(scrollPane);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == searchButton) {

           // int coreAmount = java.lang.Runtime.getRuntime().availableProcessors();
            int coreAmount = 4;

            String[] importedArray = ImportAndSplitArray.importArray();
            String inputString = (inputField.getText()).toUpperCase();
            long startTime = System.currentTimeMillis();
            ImportAndSplitArray.isolateArray(coreAmount, importedArray, inputString);
            long endTime = System.currentTimeMillis();

            timeButton.setText(String.valueOf(endTime - startTime) + "ms");
        }
    }

    public static void showRunTime() {
        model.addElement(inputField.getText());
    }
}
