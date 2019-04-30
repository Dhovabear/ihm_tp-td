package fr.ihm.tp2;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class Fenetre extends JFrame {


    public JTextField tf1;
    public JTextField tf2;
    public JTextField tf3;
    public JTextField tf4;


    public JRadioButton rb11;
    public JRadioButton rb12;
    public JRadioButton rb13;
    public JRadioButton rb21;
    public JRadioButton rb22;
    public JRadioButton rb23;
    public JRadioButton rb31;
    public JRadioButton rb32;
    public JRadioButton rb33;
    public JRadioButton rb41;
    public JRadioButton rb42;
    public JRadioButton rb43;

    public JComboBox<String> dp;
    public JTextField tf5;

    public JCheckBox cb;
    public JButton bmoy;
    public JLabel tmoy;

    public ControlBoutton controlB;

    public Fenetre() throws HeadlessException {
        initAttributs();
        ajoutWidgetV2();



        this.setTitle("AVG - Calculator");
        this.setResizable(true);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        controlB = new ControlBoutton(this);
    }

    public void initAttributs(){
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        tf5 = new JTextField();

        rb11 = new JRadioButton("1");
        rb12 = new JRadioButton("2");
        rb13 = new JRadioButton("3");
        rb21 = new JRadioButton("1");
        rb22 = new JRadioButton("2");
        rb23 = new JRadioButton("3");
        rb31 = new JRadioButton("1");
        rb32 = new JRadioButton("2");
        rb33 = new JRadioButton("3");
        rb41 = new JRadioButton("1");
        rb42 = new JRadioButton("2");
        rb43 = new JRadioButton("3");

        dp = new JComboBox<String>(new String[]{"","Latin","Grec","Sport"});
        cb = new JCheckBox("Prendre en compte les coefficients");
        bmoy = new JButton("Moyenne");
        tmoy = new JLabel("Valeur");

        ControlBoutton buttonControl = new ControlBoutton(this);
        bmoy.addActionListener(buttonControl);
    }

    public void ajoutWidgetV2(){

        //ON DECLARE LES LABELS
        JLabel t1 = new JLabel("Anglais");
        JLabel t2 = new JLabel("Mathématiques");
        JLabel t3 = new JLabel("Informatique");
        JLabel t4 = new JLabel("Géographie");
        JLabel topt = new JLabel("Optionnel");

        //ON DECLARE LES BUTTON GROUPS
        ButtonGroup bg1 = new ButtonGroup();
            bg1.add(rb11);
            bg1.add(rb12);
            bg1.add(rb13);

        ButtonGroup bg2 = new ButtonGroup();
            bg2.add(rb21);
            bg2.add(rb22);
            bg2.add(rb23);

        ButtonGroup bg3 = new ButtonGroup();
            bg3.add(rb31);
            bg3.add(rb32);
            bg3.add(rb33);

        ButtonGroup bg4 = new ButtonGroup();
            bg4.add(rb41);
            bg4.add(rb42);
            bg4.add(rb43);

        // ON AJOUTE LES RADIOS BOUTTONS DANS LEURS PANELS
        JPanel rbp1 = new JPanel();
            rbp1.add(rb11);
            rbp1.add(rb12);
            rbp1.add(rb13);

        JPanel rbp2 = new JPanel();
            rbp2.add(rb21);
            rbp2.add(rb22);
            rbp2.add(rb23);

        JPanel rbp3 = new JPanel();
            rbp3.add(rb31);
            rbp3.add(rb32);
            rbp3.add(rb33);

        JPanel rbp4 = new JPanel();
            rbp4.add(rb41);
            rbp4.add(rb42);
            rbp4.add(rb43);

         // ON MET CREER LES PANELS
        JPanel boite = new JPanel();
            boite.setLayout(new GridLayout(5,3));
            boite.add(t1);
            boite.add(tf1);
            boite.add(rbp1);

            boite.add(t2);
            boite.add(tf2);
            boite.add(rbp2);

            boite.add(t3);
            boite.add(tf3);
            boite.add(rbp3);

            boite.add(t4);
            boite.add(tf4);
            boite.add(rbp4);

            boite.add(dp);
            boite.add(tf5);
            boite.add(topt);

            boite.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));

        JPanel boitAutour = new JPanel();
            boitAutour.add(boite);

        JPanel pf1 = new JPanel();
            pf1.add(cb);
        JPanel pf2 = new JPanel();
            pf2.add(bmoy);
            pf2.add(tmoy);

        JPanel mainPan = new JPanel();
            mainPan.setLayout(new BoxLayout(mainPan,BoxLayout.Y_AXIS));
            mainPan.add(boitAutour);
            mainPan.add(pf1);
            mainPan.add(pf2);

        bmoy.addActionListener(controlB);
        this.setContentPane(mainPan);
    }

}
