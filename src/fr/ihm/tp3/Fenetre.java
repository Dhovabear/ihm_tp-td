package fr.ihm.tp3;

import fr.ihm.tp3.ControlBoutton;
import fr.ihm.tp3.ControlMenu;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

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


    public JMenuItem itemInterface1;
    public JMenuItem itemInterface2;
    public JMenuItem itemAide;
    public JMenuItem itemAPropos;

    public Model model;



    public Fenetre(Model model) throws HeadlessException, SansOptionException {
        this.model = model;
        initAttributs();
        ajoutWidgetV2();

        BufferedImage icon = null;

        try {
            icon = ImageIO.read(Fenetre.class.getResource("/icone.gif"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setIconImage(icon);

        iniFenetre();


        pack();
    }

    private void iniFenetre() {
        this.setTitle("AVG - Calculator");
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void setControlBoutton(ControlBoutton cb){
        bmoy.addActionListener(cb);
    }

    public void setControlMenu(ControlMenu cm){
        itemInterface1.addActionListener(cm);
        itemInterface2.addActionListener(cm);
    }

    public void initAttributs() throws SansOptionException {
        tf1 = new JTextField();
            tf1.setColumns(6);
            tf1.setText(Float.toString(model.getNoteAnglais()));
        tf2 = new JTextField();
            tf2.setColumns(6);
            tf2.setText(Float.toString(model.getNoteMaths()));
        tf3 = new JTextField();
            tf3.setColumns(6);
            tf3.setText(Float.toString(model.getNoteInfo()));
        tf4 = new JTextField();
            tf4.setColumns(6);
            tf4.setText(Float.toString(model.getNoteGeo()));

        tf5 = new JTextField();
            tf5.setColumns(6);
        if(model.getNumOption() != 0){
            tf5.setText(Float.toString(model.getNoteOption()));
        }



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

        switch (model.getCoeffAnglais()){
            case 1: rb11.setSelected(true); break;
            case 2: rb12.setSelected(true); break;
            case 3: rb13.setSelected(true); break;
        }

        switch (model.getCoeffMaths()){
            case 1: rb21.setSelected(true); break;
            case 2: rb22.setSelected(true); break;
            case 3: rb23.setSelected(true); break;
        }

        switch (model.getCoeffInfo()){
            case 1: rb31.setSelected(true); break;
            case 2: rb32.setSelected(true); break;
            case 3: rb33.setSelected(true); break;
        }

        switch (model.getCoeffGeo()){
            case 1: rb41.setSelected(true); break;
            case 2: rb42.setSelected(true); break;
            case 3: rb43.setSelected(true); break;
        }

        dp = new JComboBox<String>(new String[]{"","Latin","Grec","Sport"});
            dp.setSelectedIndex(model.getNumOption());
        cb = new JCheckBox("Prendre en compte les coefficients");
            cb.setSelected(model.getIsCoeffActive());
        bmoy = new JButton("Moyenne");
        tmoy = new JLabel("Valeur");


        itemInterface1 = new JMenuItem("Vue1");
        itemInterface2 = new JMenuItem("Vue2");
        itemAide = new JMenuItem("Comment ca marche ?");
        itemAPropos = new JMenuItem("A propos");

        try {
            itemInterface1.setIcon(new ImageIcon(ImageIO.read(Fenetre.class.getResource("/iconeVersion1.gif"))));
            itemInterface2.setIcon(new ImageIcon(ImageIO.read(Fenetre.class.getResource("/iconeVersion2.gif"))));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void creerMenu(){
        JMenu menu = new JMenu("Options");
            menu.add(itemInterface1);
            menu.add(itemInterface2);
            JMenu aide = new JMenu("Aide");
                aide.add(itemAide);
                aide.add(itemAPropos);
            menu.add(aide);
        JMenuBar barre = new JMenuBar();
        barre.add(menu);


        this.setJMenuBar(barre);
    }

    public void ajoutWidgetV1(){
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

        //On MET LES PANELS

        JPanel p1 = new JPanel();
            p1.add(t1);
            p1.add(tf1);
            p1.add(rb11);
            p1.add(rb12);
            p1.add(rb13);

        JPanel p2 = new JPanel();
            p2.add(t2);
            p2.add(tf2);
            p2.add(rb21);
            p2.add(rb22);
            p2.add(rb23);

        JPanel p3 = new JPanel();
            p3.add(t3);
            p3.add(tf3);
            p3.add(rb31);
            p3.add(rb32);
            p3.add(rb33);

        JPanel p4 = new JPanel();
            p4.add(t4);
            p4.add(tf4);
            p4.add(rb41);
            p4.add(rb42);
            p4.add(rb43);

        JPanel p5 = new JPanel();
            p5.add(dp);
            p5.add(tf5);
            p5.add(topt);

        JPanel p6 = new JPanel();
            p6.add(bmoy);
            p6.add(tmoy);


        JPanel pmain = new JPanel();
            pmain.setLayout(new BoxLayout(pmain,BoxLayout.Y_AXIS));
            pmain.add(p1);
            pmain.add(p2);
            pmain.add(p3);
            pmain.add(p4);
            pmain.add(p5);
            pmain.add(cb);
            pmain.add(p6);

            setContentPane(pmain);
            creerMenu();
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

        creerMenu();
        this.setContentPane(mainPan);
    }

    public void changerPourVue1(){
        getContentPane().removeAll();
        ajoutWidgetV1();
        pack();
    }

    public void changerPourVue2(){
        getContentPane().removeAll();
        ajoutWidgetV2();
        pack();
    }

    public void display(){
        setVisible(true);
    }

    public void undisplay(){
        setVisible(false);
    }

}
