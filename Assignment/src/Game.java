import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame implements ActionListener {

    int width = 80;
    int height = 80;
    int counter = 1;
    Container pane = getContentPane();
    FlowLayout flow = new FlowLayout();
    Dimension d = new Dimension(width,height);
    Dimension e = new Dimension(250,20);
    Color col = new Color(0xFFFFFFFF, true);

    JButton p1_turn = new JButton("Good Luck!...");
    JButton replay = new JButton("Play Again!");
    JButton no_winner = new JButton("No Winner");
    JButton one = new JButton();
    JButton two = new JButton();
    JButton three = new JButton();
    JButton four = new JButton();
    JButton five = new JButton();
    JButton six = new JButton();
    JButton seven = new JButton();
    JButton eight = new JButton();
    JButton nine = new JButton();

    JButton winner_one = new JButton("Hurray!....Player one has won");
    JButton winner_two = new JButton("Hurray!....Player two has won");

    public Game(){

        setTitle("Tic Tac Toe");
        setSize(350,350);
        setContentPane(pane);
        pane.setLayout(flow);
        pane.setBackground(new Color(0x90A020B0, true));

        p1_turn.setPreferredSize(e);
        add(p1_turn);
        p1_turn.setVisible(true);

        replay.setPreferredSize(e);
        add(replay);
        replay.addActionListener(this);
        replay.setVisible(false);

        one.setPreferredSize(d);
        pane.add(one);
        one.addActionListener(this);
        one.setBackground(col);

        two.setPreferredSize(d);
        pane.add(two);
        two.addActionListener(this);
        two.setBackground(col);

        three.setPreferredSize(d);
        pane.add(three);
        three.addActionListener(this);
        three.setBackground(col);

        four.setPreferredSize(d);
        pane.add(four);
        four.addActionListener(this);
        four.setBackground(col);

        five.setPreferredSize(d);
        pane.add(five);
        five.addActionListener(this);
        five.setBackground(col);

        six.setPreferredSize(d);
        pane.add(six);
        six.addActionListener(this);
        six.setBackground(col);

        seven.setPreferredSize(d);
        pane.add(seven);
        seven.addActionListener(this);
        seven.setBackground(col);

        eight.setPreferredSize(d);
        pane.add(eight);
        eight.addActionListener(this);
        eight.setBackground(col);

        nine.setPreferredSize(d);
        pane.add(nine);
        nine.addActionListener(this);
        nine.setBackground(col);

        winner_one.setPreferredSize(e);

        no_winner.setPreferredSize(e);
        add(no_winner);
        no_winner.setVisible(false);


        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == one){
            if(counter == 1 ||counter == 3||counter == 5||counter == 7||counter == 9){
                one.setText("X");
                one.setFont(new Font("Dialog", Font.BOLD,40));

                if(!one.getText().isEmpty()&&!two.getText().isEmpty()&&!three.getText().isEmpty()&&!four.getText().isEmpty()&&!five.getText().isEmpty()
                        &&!six.getText().isEmpty()&&!seven.getText().isEmpty()&&!eight.getText().isEmpty()&&!nine.getText().isEmpty()){

                    if(!one.getText().equals("X")&&!two.getText().equals("X")&&!three.getText().equals("X")){

                        if(!four.getText().equals("X")&&!five.getText().equals("X")&&!six.getText().equals("X")){

                            if(!seven.getText().equals("X")&&!eight.getText().equals("X")&&!nine.getText().equals("X")){

                                if(!one.getText().equals("X")&&!four.getText().equals("X")&&!seven.getText().equals("X")){

                                    if(!two.getText().equals("X")&&!five.getText().equals("X")&&!eight.getText().equals("X")){

                                        if(!three.getText().equals("X")&&!six.getText().equals("X")&&!nine.getText().equals("X")){

                                            if(!one.getText().equals("X")&&!five.getText().equals("X")&&!nine.getText().equals("X")){

                                                if(!three.getText().equals("X")&&!five.getText().equals("X")&&!seven.getText().equals("X")){

                                                    if(!one.getText().equals("O")&&!two.getText().equals("O")&&!three.getText().equals("O")){

                                                        if(!four.getText().equals("O")&&!five.getText().equals("O")&&!six.getText().equals("O")){

                                                            if(!seven.getText().equals("O")&&!eight.getText().equals("O")&&!nine.getText().equals("O")){

                                                                if(!one.getText().equals("O")&&!four.getText().equals("O")&&!seven.getText().equals("O")){

                                                                    if(!two.getText().equals("O")&&!five.getText().equals("O")&&!eight.getText().equals("O")){

                                                                        if(!three.getText().equals("O")&&!six.getText().equals("O")&&!nine.getText().equals("O")){

                                                                            if(!one.getText().equals("O")&&!five.getText().equals("O")&&!nine.getText().equals("O")){

                                                                                if(!three.getText().equals("O")&&!five.getText().equals("O")&&!seven.getText().equals("O")){
                                                                                    replay.setVisible(true);
                                                                                    no_winner.setVisible(true);
                                                                                }

                                                                            }

                                                                        }

                                                                    }

                                                                }

                                                            }

                                                        }

                                                    }
                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }

                if(one.getText().equals("X")&&two.getText().equals("X")&&three.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    two.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);

                }

                if(four.getText().equals("X")&&five.getText().equals("X")&&six.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    four.setBackground(Color.green);
                    five.setBackground(Color.green);
                    six.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);

                }

                if(seven.getText().equals("X")&&eight.getText().equals("X")&&nine.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    seven.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);

                }

                if(one.getText().equals("X")&&four.getText().equals("X")&&seven.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    four.setBackground(Color.green);
                    seven.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);

                }

                if(two.getText().equals("X")&&five.getText().equals("X")&&eight.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    two.setBackground(Color.green);
                    five.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);

                }

                if(three.getText().equals("X")&&six.getText().equals("X")&&nine.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    three.setBackground(Color.green);
                    six.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);

                }

                if(one.getText().equals("X")&&five.getText().equals("X")&&nine.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    five.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);

                }

                if(three.getText().equals("X")&&five.getText().equals("X")&&seven.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    three.setBackground(Color.green);
                    five.setBackground(Color.green);
                    seven.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);

                }

            }else{
                one.setText("O");
                one.setFont(new Font("Dialog", Font.BOLD,40));

                if(!one.getText().isEmpty()&&!two.getText().isEmpty()&&!three.getText().isEmpty()&&!four.getText().isEmpty()&&!five.getText().isEmpty()
                        &&!six.getText().isEmpty()&&!seven.getText().isEmpty()&&!eight.getText().isEmpty()&&!nine.getText().isEmpty()){

                    if(!one.getText().equals("X")&&!two.getText().equals("X")&&!three.getText().equals("X")){

                        if(!four.getText().equals("X")&&!five.getText().equals("X")&&!six.getText().equals("X")){

                            if(!seven.getText().equals("X")&&!eight.getText().equals("X")&&!nine.getText().equals("X")){

                                if(!one.getText().equals("X")&&!four.getText().equals("X")&&!seven.getText().equals("X")){

                                    if(!two.getText().equals("X")&&!five.getText().equals("X")&&!eight.getText().equals("X")){

                                        if(!three.getText().equals("X")&&!six.getText().equals("X")&&!nine.getText().equals("X")){

                                            if(!one.getText().equals("X")&&!five.getText().equals("X")&&!nine.getText().equals("X")){

                                                if(!three.getText().equals("X")&&!five.getText().equals("X")&&!seven.getText().equals("X")){

                                                    if(!one.getText().equals("O")&&!two.getText().equals("O")&&!three.getText().equals("O")){

                                                        if(!four.getText().equals("O")&&!five.getText().equals("O")&&!six.getText().equals("O")){

                                                            if(!seven.getText().equals("O")&&!eight.getText().equals("O")&&!nine.getText().equals("O")){

                                                                if(!one.getText().equals("O")&&!four.getText().equals("O")&&!seven.getText().equals("O")){

                                                                    if(!two.getText().equals("O")&&!five.getText().equals("O")&&!eight.getText().equals("O")){

                                                                        if(!three.getText().equals("O")&&!six.getText().equals("O")&&!nine.getText().equals("O")){

                                                                            if(!one.getText().equals("O")&&!five.getText().equals("O")&&!nine.getText().equals("O")){

                                                                                if(!three.getText().equals("O")&&!five.getText().equals("O")&&!seven.getText().equals("O")){
                                                                                    replay.setVisible(true);
                                                                                    no_winner.setVisible(true);
                                                                                }

                                                                            }

                                                                        }

                                                                    }

                                                                }

                                                            }

                                                        }

                                                    }
                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }

                if(one.getText().equals("O")&&two.getText().equals("O")&&three.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    two.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);

                }

                if(four.getText().equals("O")&&five.getText().equals("O")&&six.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    four.setBackground(Color.green);
                    five.setBackground(Color.green);
                    six.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);

                }

                if(seven.getText().equals("O")&&eight.getText().equals("O")&&nine.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    seven.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);

                }

                if(one.getText().equals("O")&&four.getText().equals("O")&&seven.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    four.setBackground(Color.green);
                    seven.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);

                }

                if(two.getText().equals("O")&&five.getText().equals("O")&&eight.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    two.setBackground(Color.green);
                    five.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);

                }

                if(three.getText().equals("O")&&six.getText().equals("O")&&nine.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    three.setBackground(Color.green);
                    six.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);

                }

                if(one.getText().equals("O")&&five.getText().equals("O")&&nine.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    five.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);

                }

                if(three.getText().equals("O")&&five.getText().equals("O")&&seven.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    three.setBackground(Color.green);
                    five.setBackground(Color.green);
                    seven.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);

                }

            }

            one.setEnabled(false);
            counter = counter+1;
            repaint();

        }

        if(e.getSource() == two){
            if(counter == 1 ||counter == 3||counter == 5||counter == 7||counter == 9){
                two.setText("X");
                two.setFont(new Font("Dialog", Font.BOLD,40));

                if(!one.getText().isEmpty()&&!two.getText().isEmpty()&&!three.getText().isEmpty()&&!four.getText().isEmpty()&&!five.getText().isEmpty()
                        &&!six.getText().isEmpty()&&!seven.getText().isEmpty()&&!eight.getText().isEmpty()&&!nine.getText().isEmpty()){

                    if(!one.getText().equals("X")&&!two.getText().equals("X")&&!three.getText().equals("X")){

                        if(!four.getText().equals("X")&&!five.getText().equals("X")&&!six.getText().equals("X")){

                            if(!seven.getText().equals("X")&&!eight.getText().equals("X")&&!nine.getText().equals("X")){

                                if(!one.getText().equals("X")&&!four.getText().equals("X")&&!seven.getText().equals("X")){

                                    if(!two.getText().equals("X")&&!five.getText().equals("X")&&!eight.getText().equals("X")){

                                        if(!three.getText().equals("X")&&!six.getText().equals("X")&&!nine.getText().equals("X")){

                                            if(!one.getText().equals("X")&&!five.getText().equals("X")&&!nine.getText().equals("X")){

                                                if(!three.getText().equals("X")&&!five.getText().equals("X")&&!seven.getText().equals("X")){

                                                    if(!one.getText().equals("O")&&!two.getText().equals("O")&&!three.getText().equals("O")){

                                                        if(!four.getText().equals("O")&&!five.getText().equals("O")&&!six.getText().equals("O")){

                                                            if(!seven.getText().equals("O")&&!eight.getText().equals("O")&&!nine.getText().equals("O")){

                                                                if(!one.getText().equals("O")&&!four.getText().equals("O")&&!seven.getText().equals("O")){

                                                                    if(!two.getText().equals("O")&&!five.getText().equals("O")&&!eight.getText().equals("O")){

                                                                        if(!three.getText().equals("O")&&!six.getText().equals("O")&&!nine.getText().equals("O")){

                                                                            if(!one.getText().equals("O")&&!five.getText().equals("O")&&!nine.getText().equals("O")){

                                                                                if(!three.getText().equals("O")&&!five.getText().equals("O")&&!seven.getText().equals("O")){
                                                                                    replay.setVisible(true);
                                                                                    no_winner.setVisible(true);
                                                                                }

                                                                            }

                                                                        }

                                                                    }

                                                                }

                                                            }

                                                        }

                                                    }
                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }


                if(one.getText().equals("X")&&two.getText().equals("X")&&three.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    two.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(four.getText().equals("X")&&five.getText().equals("X")&&six.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    four.setBackground(Color.green);
                    five.setBackground(Color.green);
                    six.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(seven.getText().equals("X")&&eight.getText().equals("X")&&nine.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    seven.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("X")&&four.getText().equals("X")&&seven.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    four.setBackground(Color.green);
                    seven.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(two.getText().equals("X")&&five.getText().equals("X")&&eight.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    five.setBackground(Color.green);
                    two.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("X")&&six.getText().equals("X")&&nine.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    nine.setBackground(Color.green);
                    six.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("X")&&five.getText().equals("X")&&nine.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    five.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("X")&&five.getText().equals("X")&&seven.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    seven.setBackground(Color.green);
                    five.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

            }else{
                two.setText("O");
                two.setFont(new Font("Dialog", Font.BOLD,40));

                if(!one.getText().isEmpty()&&!two.getText().isEmpty()&&!three.getText().isEmpty()&&!four.getText().isEmpty()&&!five.getText().isEmpty()
                        &&!six.getText().isEmpty()&&!seven.getText().isEmpty()&&!eight.getText().isEmpty()&&!nine.getText().isEmpty()){

                    if(!one.getText().equals("X")&&!two.getText().equals("X")&&!three.getText().equals("X")){

                        if(!four.getText().equals("X")&&!five.getText().equals("X")&&!six.getText().equals("X")){

                            if(!seven.getText().equals("X")&&!eight.getText().equals("X")&&!nine.getText().equals("X")){

                                if(!one.getText().equals("X")&&!four.getText().equals("X")&&!seven.getText().equals("X")){

                                    if(!two.getText().equals("X")&&!five.getText().equals("X")&&!eight.getText().equals("X")){

                                        if(!three.getText().equals("X")&&!six.getText().equals("X")&&!nine.getText().equals("X")){

                                            if(!one.getText().equals("X")&&!five.getText().equals("X")&&!nine.getText().equals("X")){

                                                if(!three.getText().equals("X")&&!five.getText().equals("X")&&!seven.getText().equals("X")){

                                                    if(!one.getText().equals("O")&&!two.getText().equals("O")&&!three.getText().equals("O")){

                                                        if(!four.getText().equals("O")&&!five.getText().equals("O")&&!six.getText().equals("O")){

                                                            if(!seven.getText().equals("O")&&!eight.getText().equals("O")&&!nine.getText().equals("O")){

                                                                if(!one.getText().equals("O")&&!four.getText().equals("O")&&!seven.getText().equals("O")){

                                                                    if(!two.getText().equals("O")&&!five.getText().equals("O")&&!eight.getText().equals("O")){

                                                                        if(!three.getText().equals("O")&&!six.getText().equals("O")&&!nine.getText().equals("O")){

                                                                            if(!one.getText().equals("O")&&!five.getText().equals("O")&&!nine.getText().equals("O")){

                                                                                if(!three.getText().equals("O")&&!five.getText().equals("O")&&!seven.getText().equals("O")){
                                                                                    replay.setVisible(true);
                                                                                    no_winner.setVisible(true);
                                                                                }

                                                                            }

                                                                        }

                                                                    }

                                                                }

                                                            }

                                                        }

                                                    }
                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }


                if(one.getText().equals("O")&&two.getText().equals("O")&&three.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    two.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(four.getText().equals("O")&&five.getText().equals("O")&&six.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    four.setBackground(Color.green);
                    five.setBackground(Color.green);
                    six.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(seven.getText().equals("O")&&eight.getText().equals("O")&&nine.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    seven.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("O")&&four.getText().equals("O")&&seven.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    four.setBackground(Color.green);
                    seven.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(two.getText().equals("O")&&five.getText().equals("O")&&eight.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    five.setBackground(Color.green);
                    two.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("O")&&six.getText().equals("O")&&nine.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    nine.setBackground(Color.green);
                    six.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("O")&&five.getText().equals("O")&&nine.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    five.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("O")&&five.getText().equals("O")&&seven.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    seven.setBackground(Color.green);
                    five.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

            }
            two.setEnabled(false);
            counter = counter+1;
            repaint();
          //  revalidate();
        }

        if(e.getSource() == three){
            if(counter == 1 ||counter == 3||counter == 5||counter == 7||counter == 9){
                three.setText("X");
                three.setFont(new Font("Dialog", Font.BOLD,40));

                if(!one.getText().isEmpty()&&!two.getText().isEmpty()&&!three.getText().isEmpty()&&!four.getText().isEmpty()&&!five.getText().isEmpty()
                        &&!six.getText().isEmpty()&&!seven.getText().isEmpty()&&!eight.getText().isEmpty()&&!nine.getText().isEmpty()){

                    if(!one.getText().equals("X")&&!two.getText().equals("X")&&!three.getText().equals("X")){

                        if(!four.getText().equals("X")&&!five.getText().equals("X")&&!six.getText().equals("X")){

                            if(!seven.getText().equals("X")&&!eight.getText().equals("X")&&!nine.getText().equals("X")){

                                if(!one.getText().equals("X")&&!four.getText().equals("X")&&!seven.getText().equals("X")){

                                    if(!two.getText().equals("X")&&!five.getText().equals("X")&&!eight.getText().equals("X")){

                                        if(!three.getText().equals("X")&&!six.getText().equals("X")&&!nine.getText().equals("X")){

                                            if(!one.getText().equals("X")&&!five.getText().equals("X")&&!nine.getText().equals("X")){

                                                if(!three.getText().equals("X")&&!five.getText().equals("X")&&!seven.getText().equals("X")){

                                                    if(!one.getText().equals("O")&&!two.getText().equals("O")&&!three.getText().equals("O")){

                                                        if(!four.getText().equals("O")&&!five.getText().equals("O")&&!six.getText().equals("O")){

                                                            if(!seven.getText().equals("O")&&!eight.getText().equals("O")&&!nine.getText().equals("O")){

                                                                if(!one.getText().equals("O")&&!four.getText().equals("O")&&!seven.getText().equals("O")){

                                                                    if(!two.getText().equals("O")&&!five.getText().equals("O")&&!eight.getText().equals("O")){

                                                                        if(!three.getText().equals("O")&&!six.getText().equals("O")&&!nine.getText().equals("O")){

                                                                            if(!one.getText().equals("O")&&!five.getText().equals("O")&&!nine.getText().equals("O")){

                                                                                if(!three.getText().equals("O")&&!five.getText().equals("O")&&!seven.getText().equals("O")){
                                                                                    replay.setVisible(true);
                                                                                    no_winner.setVisible(true);
                                                                                }

                                                                            }

                                                                        }

                                                                    }

                                                                }

                                                            }

                                                        }

                                                    }
                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }


                if(one.getText().equals("X")&&two.getText().equals("X")&&three.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    two.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(four.getText().equals("X")&&five.getText().equals("X")&&six.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    four.setBackground(Color.green);
                    five.setBackground(Color.green);
                    six.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(seven.getText().equals("X")&&eight.getText().equals("X")&&nine.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    seven.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("X")&&four.getText().equals("X")&&seven.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    four.setBackground(Color.green);
                    seven.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(two.getText().equals("X")&&five.getText().equals("X")&&eight.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    five.setBackground(Color.green);
                    two.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("X")&&six.getText().equals("X")&&nine.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    nine.setBackground(Color.green);
                    six.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("X")&&five.getText().equals("X")&&nine.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    five.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("X")&&five.getText().equals("X")&&seven.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    seven.setBackground(Color.green);
                    five.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

            }else{
                three.setText("O");
                three.setFont(new Font("Dialog", Font.BOLD,40));

                if(!one.getText().isEmpty()&&!two.getText().isEmpty()&&!three.getText().isEmpty()&&!four.getText().isEmpty()&&!five.getText().isEmpty()
                        &&!six.getText().isEmpty()&&!seven.getText().isEmpty()&&!eight.getText().isEmpty()&&!nine.getText().isEmpty()){

                    if(!one.getText().equals("X")&&!two.getText().equals("X")&&!three.getText().equals("X")){

                        if(!four.getText().equals("X")&&!five.getText().equals("X")&&!six.getText().equals("X")){

                            if(!seven.getText().equals("X")&&!eight.getText().equals("X")&&!nine.getText().equals("X")){

                                if(!one.getText().equals("X")&&!four.getText().equals("X")&&!seven.getText().equals("X")){

                                    if(!two.getText().equals("X")&&!five.getText().equals("X")&&!eight.getText().equals("X")){

                                        if(!three.getText().equals("X")&&!six.getText().equals("X")&&!nine.getText().equals("X")){

                                            if(!one.getText().equals("X")&&!five.getText().equals("X")&&!nine.getText().equals("X")){

                                                if(!three.getText().equals("X")&&!five.getText().equals("X")&&!seven.getText().equals("X")){

                                                    if(!one.getText().equals("O")&&!two.getText().equals("O")&&!three.getText().equals("O")){

                                                        if(!four.getText().equals("O")&&!five.getText().equals("O")&&!six.getText().equals("O")){

                                                            if(!seven.getText().equals("O")&&!eight.getText().equals("O")&&!nine.getText().equals("O")){

                                                                if(!one.getText().equals("O")&&!four.getText().equals("O")&&!seven.getText().equals("O")){

                                                                    if(!two.getText().equals("O")&&!five.getText().equals("O")&&!eight.getText().equals("O")){

                                                                        if(!three.getText().equals("O")&&!six.getText().equals("O")&&!nine.getText().equals("O")){

                                                                            if(!one.getText().equals("O")&&!five.getText().equals("O")&&!nine.getText().equals("O")){

                                                                                if(!three.getText().equals("O")&&!five.getText().equals("O")&&!seven.getText().equals("O")){
                                                                                    replay.setVisible(true);
                                                                                    no_winner.setVisible(true);
                                                                                }

                                                                            }

                                                                        }

                                                                    }

                                                                }

                                                            }

                                                        }

                                                    }
                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }


                if(one.getText().equals("O")&&two.getText().equals("O")&&three.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    two.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(four.getText().equals("O")&&five.getText().equals("O")&&six.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    four.setBackground(Color.green);
                    five.setBackground(Color.green);
                    six.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(seven.getText().equals("O")&&eight.getText().equals("O")&&nine.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    seven.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("O")&&four.getText().equals("O")&&seven.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    four.setBackground(Color.green);
                    seven.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(two.getText().equals("O")&&five.getText().equals("O")&&eight.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    five.setBackground(Color.green);
                    two.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("O")&&six.getText().equals("O")&&nine.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    nine.setBackground(Color.green);
                    six.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("O")&&five.getText().equals("O")&&nine.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    five.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("O")&&five.getText().equals("O")&&seven.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    seven.setBackground(Color.green);
                    five.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

            }
            three.setEnabled(false);
            counter = counter+1;
            repaint();
          //  revalidate();
        }

        if(e.getSource() == four){
            if(counter == 1 ||counter == 3||counter == 5||counter == 7||counter == 9){
                four.setText("X");
                four.setFont(new Font("Dialog", Font.BOLD,40));

                if(!one.getText().isEmpty()&&!two.getText().isEmpty()&&!three.getText().isEmpty()&&!four.getText().isEmpty()&&!five.getText().isEmpty()
                        &&!six.getText().isEmpty()&&!seven.getText().isEmpty()&&!eight.getText().isEmpty()&&!nine.getText().isEmpty()){

                    if(!one.getText().equals("X")&&!two.getText().equals("X")&&!three.getText().equals("X")){

                        if(!four.getText().equals("X")&&!five.getText().equals("X")&&!six.getText().equals("X")){

                            if(!seven.getText().equals("X")&&!eight.getText().equals("X")&&!nine.getText().equals("X")){

                                if(!one.getText().equals("X")&&!four.getText().equals("X")&&!seven.getText().equals("X")){

                                    if(!two.getText().equals("X")&&!five.getText().equals("X")&&!eight.getText().equals("X")){

                                        if(!three.getText().equals("X")&&!six.getText().equals("X")&&!nine.getText().equals("X")){

                                            if(!one.getText().equals("X")&&!five.getText().equals("X")&&!nine.getText().equals("X")){

                                                if(!three.getText().equals("X")&&!five.getText().equals("X")&&!seven.getText().equals("X")){

                                                    if(!one.getText().equals("O")&&!two.getText().equals("O")&&!three.getText().equals("O")){

                                                        if(!four.getText().equals("O")&&!five.getText().equals("O")&&!six.getText().equals("O")){

                                                            if(!seven.getText().equals("O")&&!eight.getText().equals("O")&&!nine.getText().equals("O")){

                                                                if(!one.getText().equals("O")&&!four.getText().equals("O")&&!seven.getText().equals("O")){

                                                                    if(!two.getText().equals("O")&&!five.getText().equals("O")&&!eight.getText().equals("O")){

                                                                        if(!three.getText().equals("O")&&!six.getText().equals("O")&&!nine.getText().equals("O")){

                                                                            if(!one.getText().equals("O")&&!five.getText().equals("O")&&!nine.getText().equals("O")){

                                                                                if(!three.getText().equals("O")&&!five.getText().equals("O")&&!seven.getText().equals("O")){
                                                                                    replay.setVisible(true);
                                                                                    no_winner.setVisible(true);
                                                                                }

                                                                            }

                                                                        }

                                                                    }

                                                                }

                                                            }

                                                        }

                                                    }
                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }


                if(one.getText().equals("X")&&two.getText().equals("X")&&three.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    two.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(four.getText().equals("X")&&five.getText().equals("X")&&six.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    four.setBackground(Color.green);
                    five.setBackground(Color.green);
                    six.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(seven.getText().equals("X")&&eight.getText().equals("X")&&nine.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    seven.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("X")&&four.getText().equals("X")&&seven.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    four.setBackground(Color.green);
                    seven.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(two.getText().equals("X")&&five.getText().equals("X")&&eight.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    five.setBackground(Color.green);
                    two.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("X")&&six.getText().equals("X")&&nine.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    nine.setBackground(Color.green);
                    six.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("X")&&five.getText().equals("X")&&nine.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    five.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("X")&&five.getText().equals("X")&&seven.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    seven.setBackground(Color.green);
                    five.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

            }else{
                four.setText("O");
                four.setFont(new Font("Dialog", Font.BOLD,40));

                if(!one.getText().isEmpty()&&!two.getText().isEmpty()&&!three.getText().isEmpty()&&!four.getText().isEmpty()&&!five.getText().isEmpty()
                        &&!six.getText().isEmpty()&&!seven.getText().isEmpty()&&!eight.getText().isEmpty()&&!nine.getText().isEmpty()){

                    if(!one.getText().equals("X")&&!two.getText().equals("X")&&!three.getText().equals("X")){

                        if(!four.getText().equals("X")&&!five.getText().equals("X")&&!six.getText().equals("X")){

                            if(!seven.getText().equals("X")&&!eight.getText().equals("X")&&!nine.getText().equals("X")){

                                if(!one.getText().equals("X")&&!four.getText().equals("X")&&!seven.getText().equals("X")){

                                    if(!two.getText().equals("X")&&!five.getText().equals("X")&&!eight.getText().equals("X")){

                                        if(!three.getText().equals("X")&&!six.getText().equals("X")&&!nine.getText().equals("X")){

                                            if(!one.getText().equals("X")&&!five.getText().equals("X")&&!nine.getText().equals("X")){

                                                if(!three.getText().equals("X")&&!five.getText().equals("X")&&!seven.getText().equals("X")){

                                                    if(!one.getText().equals("O")&&!two.getText().equals("O")&&!three.getText().equals("O")){

                                                        if(!four.getText().equals("O")&&!five.getText().equals("O")&&!six.getText().equals("O")){

                                                            if(!seven.getText().equals("O")&&!eight.getText().equals("O")&&!nine.getText().equals("O")){

                                                                if(!one.getText().equals("O")&&!four.getText().equals("O")&&!seven.getText().equals("O")){

                                                                    if(!two.getText().equals("O")&&!five.getText().equals("O")&&!eight.getText().equals("O")){

                                                                        if(!three.getText().equals("O")&&!six.getText().equals("O")&&!nine.getText().equals("O")){

                                                                            if(!one.getText().equals("O")&&!five.getText().equals("O")&&!nine.getText().equals("O")){

                                                                                if(!three.getText().equals("O")&&!five.getText().equals("O")&&!seven.getText().equals("O")){
                                                                                    replay.setVisible(true);
                                                                                    no_winner.setVisible(true);
                                                                                }

                                                                            }

                                                                        }

                                                                    }

                                                                }

                                                            }

                                                        }

                                                    }
                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }


                if(one.getText().equals("O")&&two.getText().equals("O")&&three.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    two.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(four.getText().equals("O")&&five.getText().equals("O")&&six.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    four.setBackground(Color.green);
                    five.setBackground(Color.green);
                    six.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(seven.getText().equals("O")&&eight.getText().equals("O")&&nine.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    seven.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("O")&&four.getText().equals("O")&&seven.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    four.setBackground(Color.green);
                    seven.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(two.getText().equals("O")&&five.getText().equals("O")&&eight.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    five.setBackground(Color.green);
                    two.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("O")&&six.getText().equals("O")&&nine.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    nine.setBackground(Color.green);
                    six.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("O")&&five.getText().equals("O")&&nine.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    five.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("O")&&five.getText().equals("O")&&seven.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    seven.setBackground(Color.green);
                    five.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

            }
            four.setEnabled(false);
            counter = counter+1;
            repaint();
          //  revalidate();
        }

        if(e.getSource() == five){
            if(counter == 1 ||counter == 3||counter == 5||counter == 7||counter == 9){
                five.setText("X");
                five.setFont(new Font("Dialog", Font.BOLD,40));

                if(!one.getText().isEmpty()&&!two.getText().isEmpty()&&!three.getText().isEmpty()&&!four.getText().isEmpty()&&!five.getText().isEmpty()
                        &&!six.getText().isEmpty()&&!seven.getText().isEmpty()&&!eight.getText().isEmpty()&&!nine.getText().isEmpty()){

                    if(!one.getText().equals("X")&&!two.getText().equals("X")&&!three.getText().equals("X")){

                        if(!four.getText().equals("X")&&!five.getText().equals("X")&&!six.getText().equals("X")){

                            if(!seven.getText().equals("X")&&!eight.getText().equals("X")&&!nine.getText().equals("X")){

                                if(!one.getText().equals("X")&&!four.getText().equals("X")&&!seven.getText().equals("X")){

                                    if(!two.getText().equals("X")&&!five.getText().equals("X")&&!eight.getText().equals("X")){

                                        if(!three.getText().equals("X")&&!six.getText().equals("X")&&!nine.getText().equals("X")){

                                            if(!one.getText().equals("X")&&!five.getText().equals("X")&&!nine.getText().equals("X")){

                                                if(!three.getText().equals("X")&&!five.getText().equals("X")&&!seven.getText().equals("X")){

                                                    if(!one.getText().equals("O")&&!two.getText().equals("O")&&!three.getText().equals("O")){

                                                        if(!four.getText().equals("O")&&!five.getText().equals("O")&&!six.getText().equals("O")){

                                                            if(!seven.getText().equals("O")&&!eight.getText().equals("O")&&!nine.getText().equals("O")){

                                                                if(!one.getText().equals("O")&&!four.getText().equals("O")&&!seven.getText().equals("O")){

                                                                    if(!two.getText().equals("O")&&!five.getText().equals("O")&&!eight.getText().equals("O")){

                                                                        if(!three.getText().equals("O")&&!six.getText().equals("O")&&!nine.getText().equals("O")){

                                                                            if(!one.getText().equals("O")&&!five.getText().equals("O")&&!nine.getText().equals("O")){

                                                                                if(!three.getText().equals("O")&&!five.getText().equals("O")&&!seven.getText().equals("O")){
                                                                                    replay.setVisible(true);
                                                                                    no_winner.setVisible(true);
                                                                                }

                                                                            }

                                                                        }

                                                                    }

                                                                }

                                                            }

                                                        }

                                                    }
                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }


                if(one.getText().equals("X")&&two.getText().equals("X")&&three.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    two.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(four.getText().equals("X")&&five.getText().equals("X")&&six.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    four.setBackground(Color.green);
                    five.setBackground(Color.green);
                    six.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(seven.getText().equals("X")&&eight.getText().equals("X")&&nine.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    seven.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("X")&&four.getText().equals("X")&&seven.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    four.setBackground(Color.green);
                    seven.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(two.getText().equals("X")&&five.getText().equals("X")&&eight.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    two.setBackground(Color.green);
                    five.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("X")&&six.getText().equals("X")&&nine.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    nine.setBackground(Color.green);
                    six.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("X")&&five.getText().equals("X")&&nine.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    five.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("X")&&five.getText().equals("X")&&seven.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    seven.setBackground(Color.green);
                    five.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

            }else{
                five.setText("O");
                five.setFont(new Font("Dialog", Font.BOLD,40));

                if(!one.getText().isEmpty()&&!two.getText().isEmpty()&&!three.getText().isEmpty()&&!four.getText().isEmpty()&&!five.getText().isEmpty()
                        &&!six.getText().isEmpty()&&!seven.getText().isEmpty()&&!eight.getText().isEmpty()&&!nine.getText().isEmpty()){

                    if(!one.getText().equals("X")&&!two.getText().equals("X")&&!three.getText().equals("X")){

                        if(!four.getText().equals("X")&&!five.getText().equals("X")&&!six.getText().equals("X")){

                            if(!seven.getText().equals("X")&&!eight.getText().equals("X")&&!nine.getText().equals("X")){

                                if(!one.getText().equals("X")&&!four.getText().equals("X")&&!seven.getText().equals("X")){

                                    if(!two.getText().equals("X")&&!five.getText().equals("X")&&!eight.getText().equals("X")){

                                        if(!three.getText().equals("X")&&!six.getText().equals("X")&&!nine.getText().equals("X")){

                                            if(!one.getText().equals("X")&&!five.getText().equals("X")&&!nine.getText().equals("X")){

                                                if(!three.getText().equals("X")&&!five.getText().equals("X")&&!seven.getText().equals("X")){

                                                    if(!one.getText().equals("O")&&!two.getText().equals("O")&&!three.getText().equals("O")){

                                                        if(!four.getText().equals("O")&&!five.getText().equals("O")&&!six.getText().equals("O")){

                                                            if(!seven.getText().equals("O")&&!eight.getText().equals("O")&&!nine.getText().equals("O")){

                                                                if(!one.getText().equals("O")&&!four.getText().equals("O")&&!seven.getText().equals("O")){

                                                                    if(!two.getText().equals("O")&&!five.getText().equals("O")&&!eight.getText().equals("O")){

                                                                        if(!three.getText().equals("O")&&!six.getText().equals("O")&&!nine.getText().equals("O")){

                                                                            if(!one.getText().equals("O")&&!five.getText().equals("O")&&!nine.getText().equals("O")){

                                                                                if(!three.getText().equals("O")&&!five.getText().equals("O")&&!seven.getText().equals("O")){
                                                                                    replay.setVisible(true);
                                                                                    no_winner.setVisible(true);
                                                                                }

                                                                            }

                                                                        }

                                                                    }

                                                                }

                                                            }

                                                        }

                                                    }
                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }


                if(one.getText().equals("O")&&two.getText().equals("O")&&three.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    two.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(four.getText().equals("O")&&five.getText().equals("O")&&six.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    four.setBackground(Color.green);
                    five.setBackground(Color.green);
                    six.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(seven.getText().equals("O")&&eight.getText().equals("O")&&nine.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    seven.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("O")&&four.getText().equals("O")&&seven.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    four.setBackground(Color.green);
                    seven.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(two.getText().equals("O")&&five.getText().equals("O")&&eight.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    five.setBackground(Color.green);
                    two.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("O")&&six.getText().equals("O")&&nine.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    nine.setBackground(Color.green);
                    six.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("O")&&five.getText().equals("O")&&nine.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    five.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("O")&&five.getText().equals("O")&&seven.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    seven.setBackground(Color.green);
                    five.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

            }
            five.setEnabled(false);
            counter = counter+1;
            repaint();
          //  revalidate();
        }

        if(e.getSource() == six){
            if(counter == 1 ||counter == 3||counter == 5||counter == 7||counter == 9){
                six.setText("X");
                six.setFont(new Font("Dialog", Font.BOLD,40));

                if(!one.getText().isEmpty()&&!two.getText().isEmpty()&&!three.getText().isEmpty()&&!four.getText().isEmpty()&&!five.getText().isEmpty()
                        &&!six.getText().isEmpty()&&!seven.getText().isEmpty()&&!eight.getText().isEmpty()&&!nine.getText().isEmpty()){

                    if(!one.getText().equals("X")&&!two.getText().equals("X")&&!three.getText().equals("X")){

                        if(!four.getText().equals("X")&&!five.getText().equals("X")&&!six.getText().equals("X")){

                            if(!seven.getText().equals("X")&&!eight.getText().equals("X")&&!nine.getText().equals("X")){

                                if(!one.getText().equals("X")&&!four.getText().equals("X")&&!seven.getText().equals("X")){

                                    if(!two.getText().equals("X")&&!five.getText().equals("X")&&!eight.getText().equals("X")){

                                        if(!three.getText().equals("X")&&!six.getText().equals("X")&&!nine.getText().equals("X")){

                                            if(!one.getText().equals("X")&&!five.getText().equals("X")&&!nine.getText().equals("X")){

                                                if(!three.getText().equals("X")&&!five.getText().equals("X")&&!seven.getText().equals("X")){

                                                    if(!one.getText().equals("O")&&!two.getText().equals("O")&&!three.getText().equals("O")){

                                                        if(!four.getText().equals("O")&&!five.getText().equals("O")&&!six.getText().equals("O")){

                                                            if(!seven.getText().equals("O")&&!eight.getText().equals("O")&&!nine.getText().equals("O")){

                                                                if(!one.getText().equals("O")&&!four.getText().equals("O")&&!seven.getText().equals("O")){

                                                                    if(!two.getText().equals("O")&&!five.getText().equals("O")&&!eight.getText().equals("O")){

                                                                        if(!three.getText().equals("O")&&!six.getText().equals("O")&&!nine.getText().equals("O")){

                                                                            if(!one.getText().equals("O")&&!five.getText().equals("O")&&!nine.getText().equals("O")){

                                                                                if(!three.getText().equals("O")&&!five.getText().equals("O")&&!seven.getText().equals("O")){
                                                                                    replay.setVisible(true);
                                                                                    no_winner.setVisible(true);
                                                                                }

                                                                            }

                                                                        }

                                                                    }

                                                                }

                                                            }

                                                        }

                                                    }
                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }


                if(one.getText().equals("X")&&two.getText().equals("X")&&three.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    two.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(four.getText().equals("X")&&five.getText().equals("X")&&six.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    four.setBackground(Color.green);
                    five.setBackground(Color.green);
                    six.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(seven.getText().equals("X")&&eight.getText().equals("X")&&nine.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    seven.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("X")&&four.getText().equals("X")&&seven.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    four.setBackground(Color.green);
                    seven.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(two.getText().equals("X")&&five.getText().equals("X")&&eight.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    five.setBackground(Color.green);
                    two.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("X")&&six.getText().equals("X")&&nine.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    nine.setBackground(Color.green);
                    six.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("X")&&five.getText().equals("X")&&nine.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    five.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("X")&&five.getText().equals("X")&&seven.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    seven.setBackground(Color.green);
                    five.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

            }else{
                six.setText("O");
                six.setFont(new Font("Dialog", Font.BOLD,40));

                if(!one.getText().isEmpty()&&!two.getText().isEmpty()&&!three.getText().isEmpty()&&!four.getText().isEmpty()&&!five.getText().isEmpty()
                        &&!six.getText().isEmpty()&&!seven.getText().isEmpty()&&!eight.getText().isEmpty()&&!nine.getText().isEmpty()){

                    if(!one.getText().equals("X")&&!two.getText().equals("X")&&!three.getText().equals("X")){

                        if(!four.getText().equals("X")&&!five.getText().equals("X")&&!six.getText().equals("X")){

                            if(!seven.getText().equals("X")&&!eight.getText().equals("X")&&!nine.getText().equals("X")){

                                if(!one.getText().equals("X")&&!four.getText().equals("X")&&!seven.getText().equals("X")){

                                    if(!two.getText().equals("X")&&!five.getText().equals("X")&&!eight.getText().equals("X")){

                                        if(!three.getText().equals("X")&&!six.getText().equals("X")&&!nine.getText().equals("X")){

                                            if(!one.getText().equals("X")&&!five.getText().equals("X")&&!nine.getText().equals("X")){

                                                if(!three.getText().equals("X")&&!five.getText().equals("X")&&!seven.getText().equals("X")){

                                                    if(!one.getText().equals("O")&&!two.getText().equals("O")&&!three.getText().equals("O")){

                                                        if(!four.getText().equals("O")&&!five.getText().equals("O")&&!six.getText().equals("O")){

                                                            if(!seven.getText().equals("O")&&!eight.getText().equals("O")&&!nine.getText().equals("O")){

                                                                if(!one.getText().equals("O")&&!four.getText().equals("O")&&!seven.getText().equals("O")){

                                                                    if(!two.getText().equals("O")&&!five.getText().equals("O")&&!eight.getText().equals("O")){

                                                                        if(!three.getText().equals("O")&&!six.getText().equals("O")&&!nine.getText().equals("O")){

                                                                            if(!one.getText().equals("O")&&!five.getText().equals("O")&&!nine.getText().equals("O")){

                                                                                if(!three.getText().equals("O")&&!five.getText().equals("O")&&!seven.getText().equals("O")){
                                                                                    replay.setVisible(true);
                                                                                    no_winner.setVisible(true);
                                                                                }

                                                                            }

                                                                        }

                                                                    }

                                                                }

                                                            }

                                                        }

                                                    }
                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }


                if(one.getText().equals("O")&&two.getText().equals("O")&&three.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    two.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(four.getText().equals("O")&&five.getText().equals("O")&&six.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    four.setBackground(Color.green);
                    five.setBackground(Color.green);
                    six.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(seven.getText().equals("O")&&eight.getText().equals("O")&&nine.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    seven.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("O")&&four.getText().equals("O")&&seven.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    four.setBackground(Color.green);
                    seven.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(two.getText().equals("O")&&five.getText().equals("O")&&eight.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    five.setBackground(Color.green);
                    two.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("O")&&six.getText().equals("O")&&nine.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    nine.setBackground(Color.green);
                    six.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("O")&&five.getText().equals("O")&&nine.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    five.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("O")&&five.getText().equals("O")&&seven.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    seven.setBackground(Color.green);
                    five.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

            }
            six.setEnabled(false);
            counter = counter+1;
            repaint();
          //  revalidate();
        }

        if(e.getSource() == seven){
            if(counter == 1 ||counter == 3||counter == 5||counter == 7||counter == 9){
                seven.setText("X");
                seven.setFont(new Font("Dialog", Font.BOLD,40));

                if(!one.getText().isEmpty()&&!two.getText().isEmpty()&&!three.getText().isEmpty()&&!four.getText().isEmpty()&&!five.getText().isEmpty()
                        &&!six.getText().isEmpty()&&!seven.getText().isEmpty()&&!eight.getText().isEmpty()&&!nine.getText().isEmpty()){

                    if(!one.getText().equals("X")&&!two.getText().equals("X")&&!three.getText().equals("X")){

                        if(!four.getText().equals("X")&&!five.getText().equals("X")&&!six.getText().equals("X")){

                            if(!seven.getText().equals("X")&&!eight.getText().equals("X")&&!nine.getText().equals("X")){

                                if(!one.getText().equals("X")&&!four.getText().equals("X")&&!seven.getText().equals("X")){

                                    if(!two.getText().equals("X")&&!five.getText().equals("X")&&!eight.getText().equals("X")){

                                        if(!three.getText().equals("X")&&!six.getText().equals("X")&&!nine.getText().equals("X")){

                                            if(!one.getText().equals("X")&&!five.getText().equals("X")&&!nine.getText().equals("X")){

                                                if(!three.getText().equals("X")&&!five.getText().equals("X")&&!seven.getText().equals("X")){

                                                    if(!one.getText().equals("O")&&!two.getText().equals("O")&&!three.getText().equals("O")){

                                                        if(!four.getText().equals("O")&&!five.getText().equals("O")&&!six.getText().equals("O")){

                                                            if(!seven.getText().equals("O")&&!eight.getText().equals("O")&&!nine.getText().equals("O")){

                                                                if(!one.getText().equals("O")&&!four.getText().equals("O")&&!seven.getText().equals("O")){

                                                                    if(!two.getText().equals("O")&&!five.getText().equals("O")&&!eight.getText().equals("O")){

                                                                        if(!three.getText().equals("O")&&!six.getText().equals("O")&&!nine.getText().equals("O")){

                                                                            if(!one.getText().equals("O")&&!five.getText().equals("O")&&!nine.getText().equals("O")){

                                                                                if(!three.getText().equals("O")&&!five.getText().equals("O")&&!seven.getText().equals("O")){
                                                                                    replay.setVisible(true);
                                                                                    no_winner.setVisible(true);
                                                                                }

                                                                            }

                                                                        }

                                                                    }

                                                                }

                                                            }

                                                        }

                                                    }
                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }


                if(one.getText().equals("X")&&two.getText().equals("X")&&three.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    two.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(four.getText().equals("X")&&five.getText().equals("X")&&six.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    four.setBackground(Color.green);
                    five.setBackground(Color.green);
                    six.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(seven.getText().equals("X")&&eight.getText().equals("X")&&nine.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    seven.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("X")&&four.getText().equals("X")&&seven.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    four.setBackground(Color.green);
                    seven.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(two.getText().equals("X")&&five.getText().equals("X")&&eight.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    two.setBackground(Color.green);
                    five.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("X")&&six.getText().equals("X")&&nine.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    three.setBackground(Color.green);
                    six.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("X")&&five.getText().equals("X")&&nine.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    five.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("X")&&five.getText().equals("X")&&seven.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

            }else{
                seven.setText("O");
                seven.setFont(new Font("Dialog", Font.BOLD,40));

                if(!one.getText().isEmpty()&&!two.getText().isEmpty()&&!three.getText().isEmpty()&&!four.getText().isEmpty()&&!five.getText().isEmpty()
                        &&!six.getText().isEmpty()&&!seven.getText().isEmpty()&&!eight.getText().isEmpty()&&!nine.getText().isEmpty()){

                    if(!one.getText().equals("X")&&!two.getText().equals("X")&&!three.getText().equals("X")){

                        if(!four.getText().equals("X")&&!five.getText().equals("X")&&!six.getText().equals("X")){

                            if(!seven.getText().equals("X")&&!eight.getText().equals("X")&&!nine.getText().equals("X")){

                                if(!one.getText().equals("X")&&!four.getText().equals("X")&&!seven.getText().equals("X")){

                                    if(!two.getText().equals("X")&&!five.getText().equals("X")&&!eight.getText().equals("X")){

                                        if(!three.getText().equals("X")&&!six.getText().equals("X")&&!nine.getText().equals("X")){

                                            if(!one.getText().equals("X")&&!five.getText().equals("X")&&!nine.getText().equals("X")){

                                                if(!three.getText().equals("X")&&!five.getText().equals("X")&&!seven.getText().equals("X")){

                                                    if(!one.getText().equals("O")&&!two.getText().equals("O")&&!three.getText().equals("O")){

                                                        if(!four.getText().equals("O")&&!five.getText().equals("O")&&!six.getText().equals("O")){

                                                            if(!seven.getText().equals("O")&&!eight.getText().equals("O")&&!nine.getText().equals("O")){

                                                                if(!one.getText().equals("O")&&!four.getText().equals("O")&&!seven.getText().equals("O")){

                                                                    if(!two.getText().equals("O")&&!five.getText().equals("O")&&!eight.getText().equals("O")){

                                                                        if(!three.getText().equals("O")&&!six.getText().equals("O")&&!nine.getText().equals("O")){

                                                                            if(!one.getText().equals("O")&&!five.getText().equals("O")&&!nine.getText().equals("O")){

                                                                                if(!three.getText().equals("O")&&!five.getText().equals("O")&&!seven.getText().equals("O")){
                                                                                    replay.setVisible(true);
                                                                                    no_winner.setVisible(true);
                                                                                }

                                                                            }

                                                                        }

                                                                    }

                                                                }

                                                            }

                                                        }

                                                    }
                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }


                if(one.getText().equals("O")&&two.getText().equals("O")&&three.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    two.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(four.getText().equals("O")&&five.getText().equals("O")&&six.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    four.setBackground(Color.green);
                    five.setBackground(Color.green);
                    six.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(seven.getText().equals("O")&&eight.getText().equals("O")&&nine.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    seven.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("O")&&four.getText().equals("O")&&seven.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    four.setBackground(Color.green);
                    seven.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(two.getText().equals("O")&&five.getText().equals("O")&&eight.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    two.setBackground(Color.green);
                    five.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("O")&&six.getText().equals("O")&&nine.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    three.setBackground(Color.green);
                    six.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("O")&&five.getText().equals("O")&&nine.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    five.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("O")&&five.getText().equals("O")&&seven.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    three.setBackground(Color.green);
                    five.setBackground(Color.green);
                    seven.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

            }
            seven.setEnabled(false);
            counter = counter+1;
            repaint();
          //  revalidate();
        }

        if(e.getSource() == eight){
            if(counter == 1 ||counter == 3||counter == 5||counter == 7||counter == 9){
                eight.setText("X");
                eight.setFont(new Font("Dialog", Font.BOLD,40));

                if(!one.getText().isEmpty()&&!two.getText().isEmpty()&&!three.getText().isEmpty()&&!four.getText().isEmpty()&&!five.getText().isEmpty()
                        &&!six.getText().isEmpty()&&!seven.getText().isEmpty()&&!eight.getText().isEmpty()&&!nine.getText().isEmpty()){

                    if(!one.getText().equals("X")&&!two.getText().equals("X")&&!three.getText().equals("X")){

                        if(!four.getText().equals("X")&&!five.getText().equals("X")&&!six.getText().equals("X")){

                            if(!seven.getText().equals("X")&&!eight.getText().equals("X")&&!nine.getText().equals("X")){

                                if(!one.getText().equals("X")&&!four.getText().equals("X")&&!seven.getText().equals("X")){

                                    if(!two.getText().equals("X")&&!five.getText().equals("X")&&!eight.getText().equals("X")){

                                        if(!three.getText().equals("X")&&!six.getText().equals("X")&&!nine.getText().equals("X")){

                                            if(!one.getText().equals("X")&&!five.getText().equals("X")&&!nine.getText().equals("X")){

                                                if(!three.getText().equals("X")&&!five.getText().equals("X")&&!seven.getText().equals("X")){

                                                    if(!one.getText().equals("O")&&!two.getText().equals("O")&&!three.getText().equals("O")){

                                                        if(!four.getText().equals("O")&&!five.getText().equals("O")&&!six.getText().equals("O")){

                                                            if(!seven.getText().equals("O")&&!eight.getText().equals("O")&&!nine.getText().equals("O")){

                                                                if(!one.getText().equals("O")&&!four.getText().equals("O")&&!seven.getText().equals("O")){

                                                                    if(!two.getText().equals("O")&&!five.getText().equals("O")&&!eight.getText().equals("O")){

                                                                        if(!three.getText().equals("O")&&!six.getText().equals("O")&&!nine.getText().equals("O")){

                                                                            if(!one.getText().equals("O")&&!five.getText().equals("O")&&!nine.getText().equals("O")){

                                                                                if(!three.getText().equals("O")&&!five.getText().equals("O")&&!seven.getText().equals("O")){
                                                                                    replay.setVisible(true);
                                                                                    no_winner.setVisible(true);
                                                                                }

                                                                            }

                                                                        }

                                                                    }

                                                                }

                                                            }

                                                        }

                                                    }
                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }


                if(one.getText().equals("X")&&two.getText().equals("X")&&three.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    two.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(four.getText().equals("X")&&five.getText().equals("X")&&six.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    four.setBackground(Color.green);
                    five.setBackground(Color.green);
                    six.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(seven.getText().equals("X")&&eight.getText().equals("X")&&nine.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    seven.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("X")&&four.getText().equals("X")&&seven.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    four.setBackground(Color.green);
                    seven.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(two.getText().equals("X")&&five.getText().equals("X")&&eight.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    two.setBackground(Color.green);
                    five.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("X")&&six.getText().equals("X")&&nine.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    three.setBackground(Color.green);
                    six.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("X")&&five.getText().equals("X")&&nine.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    five.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("X")&&five.getText().equals("X")&&seven.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    three.setBackground(Color.green);
                    five.setBackground(Color.green);
                    seven.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

            }else{
                eight.setText("O");
                eight.setFont(new Font("Dialog", Font.BOLD,40));

                if(!one.getText().isEmpty()&&!two.getText().isEmpty()&&!three.getText().isEmpty()&&!four.getText().isEmpty()&&!five.getText().isEmpty()
                        &&!six.getText().isEmpty()&&!seven.getText().isEmpty()&&!eight.getText().isEmpty()&&!nine.getText().isEmpty()){

                    if(!one.getText().equals("X")&&!two.getText().equals("X")&&!three.getText().equals("X")){

                        if(!four.getText().equals("X")&&!five.getText().equals("X")&&!six.getText().equals("X")){

                            if(!seven.getText().equals("X")&&!eight.getText().equals("X")&&!nine.getText().equals("X")){

                                if(!one.getText().equals("X")&&!four.getText().equals("X")&&!seven.getText().equals("X")){

                                    if(!two.getText().equals("X")&&!five.getText().equals("X")&&!eight.getText().equals("X")){

                                        if(!three.getText().equals("X")&&!six.getText().equals("X")&&!nine.getText().equals("X")){

                                            if(!one.getText().equals("X")&&!five.getText().equals("X")&&!nine.getText().equals("X")){

                                                if(!three.getText().equals("X")&&!five.getText().equals("X")&&!seven.getText().equals("X")){

                                                    if(!one.getText().equals("O")&&!two.getText().equals("O")&&!three.getText().equals("O")){

                                                        if(!four.getText().equals("O")&&!five.getText().equals("O")&&!six.getText().equals("O")){

                                                            if(!seven.getText().equals("O")&&!eight.getText().equals("O")&&!nine.getText().equals("O")){

                                                                if(!one.getText().equals("O")&&!four.getText().equals("O")&&!seven.getText().equals("O")){

                                                                    if(!two.getText().equals("O")&&!five.getText().equals("O")&&!eight.getText().equals("O")){

                                                                        if(!three.getText().equals("O")&&!six.getText().equals("O")&&!nine.getText().equals("O")){

                                                                            if(!one.getText().equals("O")&&!five.getText().equals("O")&&!nine.getText().equals("O")){

                                                                                if(!three.getText().equals("O")&&!five.getText().equals("O")&&!seven.getText().equals("O")){
                                                                                    replay.setVisible(true);
                                                                                    no_winner.setVisible(true);
                                                                                }

                                                                            }

                                                                        }

                                                                    }

                                                                }

                                                            }

                                                        }

                                                    }
                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }


                if(one.getText().equals("O")&&two.getText().equals("O")&&three.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    two.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(four.getText().equals("O")&&five.getText().equals("O")&&six.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    four.setBackground(Color.green);
                    five.setBackground(Color.green);
                    six.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(seven.getText().equals("O")&&eight.getText().equals("O")&&nine.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    seven.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("O")&&four.getText().equals("O")&&seven.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    four.setBackground(Color.green);
                    seven.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(two.getText().equals("O")&&five.getText().equals("O")&&eight.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    two.setBackground(Color.green);
                    five.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("O")&&six.getText().equals("O")&&nine.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    three.setBackground(Color.green);
                    six.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("O")&&five.getText().equals("O")&&nine.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    five.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("O")&&five.getText().equals("O")&&seven.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    three.setBackground(Color.green);
                    five.setBackground(Color.green);
                    seven.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

            }
            eight.setEnabled(false);
            counter = counter+1;
            repaint();
          //  revalidate();
        }

        if(e.getSource() == nine){
            if(counter == 1 ||counter == 3||counter == 5||counter == 7||counter == 9){
                nine.setText("X");
                nine.setFont(new Font("Dialog", Font.BOLD,40));

                if(!one.getText().isEmpty()&&!two.getText().isEmpty()&&!three.getText().isEmpty()&&!four.getText().isEmpty()&&!five.getText().isEmpty()
                        &&!six.getText().isEmpty()&&!seven.getText().isEmpty()&&!eight.getText().isEmpty()&&!nine.getText().isEmpty()){

                    if(!one.getText().equals("X")&&!two.getText().equals("X")&&!three.getText().equals("X")){

                        if(!four.getText().equals("X")&&!five.getText().equals("X")&&!six.getText().equals("X")){

                            if(!seven.getText().equals("X")&&!eight.getText().equals("X")&&!nine.getText().equals("X")){

                                if(!one.getText().equals("X")&&!four.getText().equals("X")&&!seven.getText().equals("X")){

                                    if(!two.getText().equals("X")&&!five.getText().equals("X")&&!eight.getText().equals("X")){

                                        if(!three.getText().equals("X")&&!six.getText().equals("X")&&!nine.getText().equals("X")){

                                            if(!one.getText().equals("X")&&!five.getText().equals("X")&&!nine.getText().equals("X")){

                                                if(!three.getText().equals("X")&&!five.getText().equals("X")&&!seven.getText().equals("X")){

                                                    if(!one.getText().equals("O")&&!two.getText().equals("O")&&!three.getText().equals("O")){

                                                        if(!four.getText().equals("O")&&!five.getText().equals("O")&&!six.getText().equals("O")){

                                                            if(!seven.getText().equals("O")&&!eight.getText().equals("O")&&!nine.getText().equals("O")){

                                                                if(!one.getText().equals("O")&&!four.getText().equals("O")&&!seven.getText().equals("O")){

                                                                    if(!two.getText().equals("O")&&!five.getText().equals("O")&&!eight.getText().equals("O")){

                                                                        if(!three.getText().equals("O")&&!six.getText().equals("O")&&!nine.getText().equals("O")){

                                                                            if(!one.getText().equals("O")&&!five.getText().equals("O")&&!nine.getText().equals("O")){

                                                                                if(!three.getText().equals("O")&&!five.getText().equals("O")&&!seven.getText().equals("O")){
                                                                                    replay.setVisible(true);
                                                                                    no_winner.setVisible(true);
                                                                                }

                                                                            }

                                                                        }

                                                                    }

                                                                }

                                                            }

                                                        }

                                                    }
                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }


                if(one.getText().equals("X")&&two.getText().equals("X")&&three.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    two.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(four.getText().equals("X")&&five.getText().equals("X")&&six.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    four.setBackground(Color.green);
                    five.setBackground(Color.green);
                    six.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(seven.getText().equals("X")&&eight.getText().equals("X")&&nine.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    seven.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("X")&&four.getText().equals("X")&&seven.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    four.setBackground(Color.green);
                    seven.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(two.getText().equals("X")&&five.getText().equals("X")&&eight.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    two.setBackground(Color.green);
                    five.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("X")&&six.getText().equals("X")&&nine.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    three.setBackground(Color.green);
                    six.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("X")&&five.getText().equals("X")&&nine.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    five.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("X")&&five.getText().equals("X")&&seven.getText().equals("X")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    three.setBackground(Color.green);
                    five.setBackground(Color.green);
                    seven.setBackground(Color.green);
                    pane.add(winner_one);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

            }else{
                nine.setText("O");
                nine.setFont(new Font("Dialog", Font.BOLD,40));

                if(!one.getText().isEmpty()&&!two.getText().isEmpty()&&!three.getText().isEmpty()&&!four.getText().isEmpty()&&!five.getText().isEmpty()
                        &&!six.getText().isEmpty()&&!seven.getText().isEmpty()&&!eight.getText().isEmpty()&&!nine.getText().isEmpty()){

                    if(!one.getText().equals("X")&&!two.getText().equals("X")&&!three.getText().equals("X")){

                        if(!four.getText().equals("X")&&!five.getText().equals("X")&&!six.getText().equals("X")){

                            if(!seven.getText().equals("X")&&!eight.getText().equals("X")&&!nine.getText().equals("X")){

                                if(!one.getText().equals("X")&&!four.getText().equals("X")&&!seven.getText().equals("X")){

                                    if(!two.getText().equals("X")&&!five.getText().equals("X")&&!eight.getText().equals("X")){

                                        if(!three.getText().equals("X")&&!six.getText().equals("X")&&!nine.getText().equals("X")){

                                            if(!one.getText().equals("X")&&!five.getText().equals("X")&&!nine.getText().equals("X")){

                                                if(!three.getText().equals("X")&&!five.getText().equals("X")&&!seven.getText().equals("X")){

                                                    if(!one.getText().equals("O")&&!two.getText().equals("O")&&!three.getText().equals("O")){

                                                        if(!four.getText().equals("O")&&!five.getText().equals("O")&&!six.getText().equals("O")){

                                                            if(!seven.getText().equals("O")&&!eight.getText().equals("O")&&!nine.getText().equals("O")){

                                                                if(!one.getText().equals("O")&&!four.getText().equals("O")&&!seven.getText().equals("O")){

                                                                    if(!two.getText().equals("O")&&!five.getText().equals("O")&&!eight.getText().equals("O")){

                                                                        if(!three.getText().equals("O")&&!six.getText().equals("O")&&!nine.getText().equals("O")){

                                                                            if(!one.getText().equals("O")&&!five.getText().equals("O")&&!nine.getText().equals("O")){

                                                                                if(!three.getText().equals("O")&&!five.getText().equals("O")&&!seven.getText().equals("O")){
                                                                                    replay.setVisible(true);
                                                                                    no_winner.setVisible(true);
                                                                                }

                                                                            }

                                                                        }

                                                                    }

                                                                }

                                                            }

                                                        }

                                                    }
                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }


                if(one.getText().equals("O")&&two.getText().equals("O")&&three.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    two.setBackground(Color.green);
                    three.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(four.getText().equals("O")&&five.getText().equals("O")&&six.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    four.setBackground(Color.green);
                    five.setBackground(Color.green);
                    six.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(seven.getText().equals("O")&&eight.getText().equals("O")&&nine.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    seven.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("O")&&four.getText().equals("O")&&seven.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    four.setBackground(Color.green);
                    seven.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(two.getText().equals("O")&&five.getText().equals("O")&&eight.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    two.setBackground(Color.green);
                    five.setBackground(Color.green);
                    eight.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("O")&&six.getText().equals("O")&&nine.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    three.setBackground(Color.green);
                    six.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(one.getText().equals("O")&&five.getText().equals("O")&&nine.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    one.setBackground(Color.green);
                    five.setBackground(Color.green);
                    nine.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

                if(three.getText().equals("O")&&five.getText().equals("O")&&seven.getText().equals("O")){
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    three.setBackground(Color.green);
                    five.setBackground(Color.green);
                    seven.setBackground(Color.green);
                    pane.add(winner_two);
                    p1_turn.setVisible(false);
                    replay.setVisible(true);
                }

            }
            nine.setEnabled(false);
            counter = counter+1;
            repaint();
        }

        if(e.getSource() == replay){
            this.dispose();
            new Game();
        }

    }
}
