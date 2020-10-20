/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negyedik_feladat;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Jocó
 */
public class IdoAtalakito extends JFrame implements ActionListener {

    private JLabel nap;
    private JLabel ora;
    private JLabel min;
    private JLabel sec;

    private JTextField nap1;
    private JTextField nap2;
    private JTextField napOssz;
    private JTextField ora1;
    private JTextField ora2;
    private JTextField oraOssz;
    private JTextField min1;
    private JTextField min2;
    private JTextField minOssz;
    private JTextField sec1;
    private JTextField sec2;
    private JTextField secOssz;

    private JButton szamolBt;

    private JPanel p1;
    private JPanel p2;
    private JPanel p3;

    public IdoAtalakito(String title) throws HeadlessException {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        this.szamolBt = new JButton("Számol");
        this.szamolBt.addActionListener(this);
        this.nap1 = new JTextField();
        this.nap2 = new JTextField();
        this.napOssz = new JTextField();

        this.ora1 = new JTextField();
        this.ora2 = new JTextField();
        this.oraOssz = new JTextField();

        this.min1 = new JTextField();
        this.min2 = new JTextField();
        this.minOssz = new JTextField();

        this.sec1 = new JTextField();
        this.sec2 = new JTextField();
        this.secOssz = new JTextField();

        this.p1 = new JPanel();
        this.p2 = new JPanel();
        this.p3 = new JPanel();

        GridLayout gr1 = new GridLayout(3, 1);
        this.setLayout(gr1);

        GridLayout gr2 = new GridLayout(2, 8);
        p1.setLayout(gr2);

        GridLayout gr3 = new GridLayout(1, 1);
        p2.setLayout(gr3);
        GridLayout gr4 = new GridLayout(1, 8);
        p3.setLayout(gr4);

        p1.add(nap1);
        p1.add(new JLabel("nap"));
        p1.add(ora1);
        p1.add(new JLabel("óra"));
        p1.add(min1);
        p1.add(new JLabel("perc"));
        p1.add(sec1);
        p1.add(new JLabel("másodperc"));
        p1.add(nap2);
        p1.add(new JLabel("nap"));
        p1.add(ora2);
        p1.add(new JLabel("óra"));
        p1.add(min2);
        p1.add(new JLabel("perc"));
        p1.add(sec2);
        p1.add(new JLabel("másodperc"));

        p2.add(szamolBt);

        p3.add(napOssz);
        p3.add(new JLabel("nap"));
        p3.add(oraOssz);
        p3.add(new JLabel("óra"));
        p3.add(minOssz);
        p3.add(new JLabel("perc"));
        p3.add(secOssz);
        p3.add(new JLabel("másodperc"));

        this.add(p1);
        this.add(p2);
        this.add(p3);

        pack();

    }

    public static void main(String[] args) {
        IdoAtalakito ido = new IdoAtalakito("IdoAtalakito");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.szamolBt) {
            int napOsszeg = Integer.parseInt(this.nap1.getText()) + Integer.parseInt(this.nap2.getText());
            int oraOsszeg = Integer.parseInt(this.ora1.getText()) + Integer.parseInt(this.ora2.getText());
            int percOsszeg = Integer.parseInt(this.min1.getText()) + Integer.parseInt(this.min2.getText());
            int secOsszeg = Integer.parseInt(this.sec1.getText()) + Integer.parseInt(this.sec2.getText());

            if (secOsszeg >= 60) {
                secOsszeg -= 60;
                percOsszeg++;
            }
            this.secOssz.setText(String.valueOf(secOsszeg));

            if (percOsszeg >= 60) {
                percOsszeg -= 60;
                oraOsszeg++;
            }
            this.minOssz.setText(String.valueOf(percOsszeg));
            if (oraOsszeg >= 24) {
                oraOsszeg -= 24;
                napOsszeg++;
            }
            this.oraOssz.setText(String.valueOf(oraOsszeg));
            this.napOssz.setText(String.valueOf(napOsszeg));

        }
    }
}
