
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

    private static JTextField input;
    private double number;
    int operation;
    private double toplam = 0.0;
    JLabel jl1;
    JButton jb1;
    JButton jb2;
    JButton jb3;
    JButton jb4;
    JButton jb5;
    JButton jb6;
    JButton jb7;
    JButton jb8;
    JButton jb9;
    JButton jb10;
    JButton jb11;
    JButton jb12;
    JButton jb13;
    JButton jb14;
    JButton jb15;
    JButton jb16;
    JButton jb17;
    JButton jb18;
    JButton jb19;
    JButton jb20;
    JButton jb21;
    JButton jb22;
    JButton jb23;
    JButton jb24;

    public void addInput(String str) {
        JTextField var10000 = input;
        String var10001 = input.getText();
        var10000.setText(var10001 + str);
    }

    public void addLabel(String str) {
        JLabel var10000 = this.jl1;
        String var10001 = input.getText();
        var10000.setText(var10001 + str);
    }

    public void calculate() {
        double answer;
        switch (this.operation) {
            case 1:
                answer = this.number + Double.parseDouble(input.getText());
                input.setText(Double.toString(answer));
                break;
            case 2:
                answer = this.number - Double.parseDouble(input.getText());
                input.setText(Double.toString(answer));
                break;
            case 3:
                answer = this.number / Double.parseDouble(input.getText());
                input.setText(Double.toString(answer));
                break;
            case 4:
                answer = this.number * Double.parseDouble(input.getText());
                input.setText(Double.toString(answer));
                break;
            case 5:
                answer = this.number % Double.parseDouble(input.getText());
                input.setText(Double.toString(answer));
                break;
            case 6:
                answer = Math.pow(this.number, 2.0);
                input.setText(Double.toString(answer));
                break;
            case 7:
                answer = Math.sqrt(this.number);
                input.setText(Double.toString(answer));
                break;
            case 8:
                answer = 1.0 / this.number;
                input.setText(Double.toString(answer));
        }

    }

    public Main() {
        this.setType(Type.UTILITY);
        this.setTitle("Hesap Makinesi");
        this.setResizable(false);
        this.setDefaultCloseOperation(3);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(contentPane);
        contentPane.setLayout((LayoutManager) null);
        JPanel screen = new JPanel();
        screen.setBounds(0, 70, 353, 70);
        contentPane.add(screen);
        screen.setLayout((LayoutManager) null);
        this.setVisible(true);
        this.setSize(353, 507);
        this.jl1 = new JLabel();
        this.jl1.setHorizontalAlignment(4);
        this.jl1.setBounds(0, 35, 339, 40);
        contentPane.add(this.jl1);
        input = new JTextField(10);
        input.setEditable(false);
        input.setHorizontalAlignment(4);
        input.setFont(new Font("Tahoma", 1, 12));
        input.setBounds(0, 70, 340, 70);
        contentPane.add(input);
        JLabel jl = new JLabel("Standart");
        jl.setFont(new Font("Verdana", 1, 13));
        jl.setBounds(50, 10, 100, 30);
        contentPane.add(jl);
        this.jb1 = new JButton("=");
        this.jb1.setBounds(254, 420, 85, 50);
        this.jb1.setBackground(new Color(18, 165, 220, 253));
        this.jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main.this.calculate();
                Main.this.jl1.setText("");
                Main.input.setText(String.valueOf(Main.this.toplam + Double.parseDouble(Main.input.getText())));
            }
        });
        contentPane.add(this.jb1);
        this.jb2 = new JButton(".");
        this.jb2.setBounds(170, 420, 85, 50);
        this.jb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main.this.addInput(e.getActionCommand());
            }
        });
        contentPane.add(this.jb2);
        this.jb3 = new JButton("0");
        this.jb3.setBounds(85, 420, 85, 50);
        this.jb3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main.this.addInput(e.getActionCommand());
            }
        });
        contentPane.add(this.jb3);
        this.jb4 = new JButton("+/-");
        this.jb4.setBounds(0, 420, 85, 50);
        this.jb4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Main.input.getText() == null) {
                    Main.input.setText("");
                } else {
                    Main.this.number = Double.parseDouble(Main.input.getText());
                    Main var10000 = Main.this;
                    var10000.number *= -1.0;
                    Main.input.setText(String.valueOf(Main.this.number));
                }

            }
        });
        contentPane.add(this.jb4);
        this.jb5 = new JButton("+");
        this.jb5.setBounds(254, 370, 85, 50);
        this.jb5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!Main.input.getText().equals("")) {
                    Main.this.number = Double.parseDouble(Main.input.getText());
                    Main.this.operation = 1;
                    Main.input.setText("");
                    double var10001 = Main.this.number;
                    Main.this.jl1.setText("" + var10001 + e.getActionCommand());
                }

            }
        });
        contentPane.add(this.jb5);
        this.jb6 = new JButton("3");
        this.jb6.setBounds(170, 370, 85, 50);
        this.jb6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main.this.addInput(e.getActionCommand());
            }
        });
        contentPane.add(this.jb6);
        this.jb7 = new JButton("2");
        this.jb7.setBounds(85, 370, 85, 50);
        this.jb7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main.this.addInput(e.getActionCommand());
            }
        });
        contentPane.add(this.jb7);
        this.jb8 = new JButton("1");
        this.jb8.setBounds(0, 370, 85, 50);
        this.jb8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main.this.addInput(e.getActionCommand());
            }
        });
        contentPane.add(this.jb8);
        this.jb9 = new JButton("-");
        this.jb9.setBounds(254, 320, 85, 50);
        this.jb9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!Main.input.getText().equals("")) {
                    Main.this.number = Double.parseDouble(Main.input.getText());
                    Main.this.operation = 2;
                    Main.input.setText("");
                    double var10001 = Main.this.number;
                    Main.this.jl1.setText("" + var10001 + e.getActionCommand());
                }

            }
        });
        contentPane.add(this.jb9);
        this.jb10 = new JButton("6");
        this.jb10.setBounds(170, 320, 85, 50);
        this.jb10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main.this.addInput(e.getActionCommand());
            }
        });
        contentPane.add(this.jb10);
        this.jb11 = new JButton("5");
        this.jb11.setBounds(85, 320, 85, 50);
        this.jb11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main.this.addInput(e.getActionCommand());
            }
        });
        contentPane.add(this.jb11);
        this.jb12 = new JButton("4");
        this.jb12.setBounds(0, 320, 85, 50);
        this.jb12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main.this.addInput(e.getActionCommand());
            }
        });
        contentPane.add(this.jb12);
        this.jb13 = new JButton("x");
        this.jb13.setBounds(254, 270, 85, 50);
        this.jb13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main.this.number = Double.parseDouble(Main.input.getText());
                Main.this.operation = 4;
                Main.input.setText("");
                double var10001 = Main.this.number;
                Main.this.jl1.setText("" + var10001 + e.getActionCommand());
            }
        });
        contentPane.add(this.jb13);
        this.jb14 = new JButton("9");
        this.jb14.setBounds(170, 270, 85, 50);
        this.jb14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main.this.addInput(e.getActionCommand());
            }
        });
        contentPane.add(this.jb14);
        this.jb15 = new JButton("8");
        this.jb15.setBounds(85, 270, 85, 50);
        this.jb15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main.this.addInput(e.getActionCommand());
            }
        });
        contentPane.add(this.jb15);
        this.jb16 = new JButton("7");
        this.jb16.setBounds(0, 270, 85, 50);
        this.jb16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main.this.addInput(e.getActionCommand());
            }
        });
        contentPane.add(this.jb16);
        this.jb17 = new JButton("÷");
        this.jb17.setBounds(254, 220, 85, 50);
        this.jb17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main.this.number = Double.parseDouble(Main.input.getText());
                Main.this.operation = 3;
                Main.input.setText("");
                double var10001 = Main.this.number;
                Main.this.jl1.setText("" + var10001 + e.getActionCommand());
            }
        });
        contentPane.add(this.jb17);
        this.jb18 = new JButton("√¯");
        this.jb18.setBounds(170, 220, 85, 50);
        this.jb18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main.this.number = Double.parseDouble(Main.input.getText());
                Main.this.operation = 7;
                Main.input.setText(String.valueOf(Math.sqrt(Main.this.number)));
            }
        });
        contentPane.add(this.jb18);
        this.jb19 = new JButton("x²");
        this.jb19.setBounds(85, 220, 85, 50);
        this.jb19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main.this.number = Double.parseDouble(Main.input.getText());
                Main.this.operation = 6;
                Main.input.setText(String.valueOf(Math.pow(Main.this.number, 2.0)));
            }
        });
        contentPane.add(this.jb19);
        this.jb20 = new JButton("1/x");
        this.jb20.setBounds(0, 220, 85, 50);
        this.jb20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main.this.number = Double.parseDouble(Main.input.getText());
                Main.this.operation = 8;
                Main.input.setText(String.valueOf(1.0 / Main.this.number));
            }
        });
        contentPane.add(this.jb20);
        this.jb21 = new JButton("←");
        this.jb21.setBounds(254, 170, 85, 50);
        this.jb21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String numbers = Main.input.getText();
                int length = numbers.length();
                if (length > 0) {
                    Main.input.setText(numbers.substring(0, length - 1));
                }

            }
        });
        contentPane.add(this.jb21);
        this.jb22 = new JButton("C");
        this.jb22.setBounds(170, 170, 85, 50);
        this.jb22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main.input.setText("");
                Main.this.toplam = 0.0;
            }
        });
        contentPane.add(this.jb22);
        this.jb23 = new JButton("CE");
        this.jb23.setBounds(85, 170, 85, 50);
        this.jb23.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main.this.jl1.setText("");
                Main.input.setText("");
                Main.this.toplam = 0.0;
            }
        });
        contentPane.add(this.jb23);
        this.jb24 = new JButton("%");
        this.jb24.setBounds(0, 170, 85, 50);
        this.jb24.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main.this.number = Double.parseDouble(Main.input.getText());
                Main.this.operation = 5;
                Main.input.setText("");
                double var10001 = Main.this.number;
                Main.this.jl1.setText("" + var10001 + e.getActionCommand());
            }
        });
        contentPane.add(this.jb24);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Main frame = new Main();
                frame.setVisible(true);
            } catch (Exception var1) {
                var1.printStackTrace();
            }

        });
    }
}
