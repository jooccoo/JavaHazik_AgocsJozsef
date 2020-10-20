/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otodik_feladat;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Jocó
 */
public class Szamologep extends JFrame implements ActionListener {

    private JTextField tf;
    private JButton bt0;
    private JButton bt1;
    private JButton bt2;
    private JButton bt3;
    private JButton bt4;
    private JButton bt5;
    private JButton bt6;
    private JButton bt7;
    private JButton bt8;
    private JButton bt9;

    private JButton empty;
    private JButton backspace;
    private JButton ce;
    private JButton c;
    private JButton mc;
    private JButton mr;
    private JButton ms;
    private JButton mPlus;
    private JButton dot;
    private JButton plusPerMin;
    private JButton multiply;
    private JButton divide;
    private JButton plus;
    private JButton minus;
    private JButton sqrt;
    private JButton percentage;
    private JButton x1;
    private JButton equal;

    private JPanel p1;
    private JPanel p2;
    private JPanel p3;

    private double szam1;
    private double szam2;
    private double eredmeny;
    private String muvelet;
    private boolean pont;

    public Szamologep(String title) throws HeadlessException {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        this.muvelet = "empty";

        this.tf = new JTextField();
        this.bt0 = new JButton("0");
        this.bt1 = new JButton("1");
        this.bt2 = new JButton("2");
        this.bt3 = new JButton("3");
        this.bt4 = new JButton("4");
        this.bt5 = new JButton("5");
        this.bt6 = new JButton("6");
        this.bt7 = new JButton("7");
        this.bt8 = new JButton("8");
        this.bt9 = new JButton("9");

        // add action listeners
        this.bt0.addActionListener(this);
        this.bt1.addActionListener(this);
        this.bt2.addActionListener(this);
        this.bt3.addActionListener(this);
        this.bt4.addActionListener(this);
        this.bt5.addActionListener(this);
        this.bt6.addActionListener(this);
        this.bt7.addActionListener(this);
        this.bt8.addActionListener(this);
        this.bt9.addActionListener(this);

        this.empty = new JButton("");
        this.backspace = new JButton("Backspace");
        this.ce = new JButton("CE");
        this.ce.setBackground(Color.RED);
        this.c = new JButton("C");
        this.mc = new JButton("MC");
        this.mr = new JButton("MR");
        this.ms = new JButton("MS");
        this.mPlus = new JButton("M+");
        this.dot = new JButton(".");
        this.dot.setBackground(Color.GREEN);
        this.plusPerMin = new JButton("+/-");
        this.multiply = new JButton("*");
        this.divide = new JButton("/");
        this.plus = new JButton("+");
        this.plus.setBackground(Color.GREEN);
        this.minus = new JButton("-");
        this.sqrt = new JButton("sqrt");
        this.percentage = new JButton("%");
        this.x1 = new JButton("1/x");
        this.equal = new JButton("=");
        this.equal.setBackground(Color.GREEN);
        this.p1 = new JPanel();
        this.p2 = new JPanel();
        this.p3 = new JPanel();

        this.plus.addActionListener(this);
        this.equal.addActionListener(this);
        this.ce.addActionListener(this);
        this.dot.addActionListener(this);
        GridLayout gr1 = new GridLayout(3, 1);
        this.setLayout(gr1);
        GridLayout gr2 = new GridLayout(1, 1);
        p1.setLayout(gr2);
        p1.setPreferredSize(new Dimension(10, 10));
        gr2.setHgap(0);

        GridLayout gr3 = new GridLayout(1, 4);
        p2.setLayout(gr3);
        GridLayout gr4 = new GridLayout(4, 6);
        p3.setLayout(gr4);

        p1.add(tf);

        p2.add(empty);
        p2.add(backspace);
        p2.add(ce);
        p2.add(c);

        p3.add(mc);
        p3.add(bt7);
        p3.add(bt8);
        p3.add(bt9);
        p3.add(divide);
        p3.add(sqrt);
        p3.add(mr);
        p3.add(bt4);
        p3.add(bt5);
        p3.add(bt6);
        p3.add(multiply);
        p3.add(percentage);
        p3.add(ms);
        p3.add(bt1);
        p3.add(bt2);
        p3.add(bt3);
        p3.add(minus);
        p3.add(x1);
        p3.add(mPlus);
        p3.add(bt0);
        p3.add(plusPerMin);
        p3.add(dot);
        p3.add(plus);
        p3.add(equal);

        this.add(p1);
        this.add(p2);
        this.add(p3);

        pack();

    }

    public static void main(String[] args) {
        Szamologep sz = new Szamologep("Számológép");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String s = ae.getActionCommand();

        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {

            tf.setText(tf.getText() + s);

            if (this.muvelet.equals("+")) {
                this.szam2 = Double.parseDouble(tf.getText());
            } else {
                // set the value of text 
                this.szam1 = Double.parseDouble(tf.getText());
                this.eredmeny = this.szam1;
            }
        } else if (s.charAt(0) == '+') {
            this.eredmeny += this.szam2;
            this.muvelet = "+";
            tf.setText("");
        } else if (s.charAt(0) == '=') {
            System.out.println(this.eredmeny += this.szam2);
            tf.setText(String.valueOf(this.eredmeny));
            this.szam1 = 0;
            this.szam2 = 0;
            this.muvelet = "";
        } else if (s.charAt(0) == 'C' && s.charAt(1) == 'E') {
            this.szam1 = 0;
            this.szam2 = 0;
            this.eredmeny = 0;
            this.muvelet = "";
            tf.setText("");
        } 
    }
}
