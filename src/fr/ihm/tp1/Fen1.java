package fr.ihm.tp1;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Fen1 extends JFrame {

    public Fen1(){
       initComponentV1();

        this.setTitle("BLALALA");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(420 ,260));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


    void initComponentV1(){
        JPanel mainPan = new JPanel();
        //mainPan.setLayout(new BoxLayout(mainPan,BoxLayout.Y_AXIS));


            //LIGNE 1
            JPanel p1 = new JPanel();

                JLabel t = new JLabel("Anglais: ");
                JTextField tf = new JTextField();
                    tf.setColumns(6);
                ButtonGroup bg1 =  new ButtonGroup();
                    JRadioButton bt1 = new JRadioButton("1");
                    JRadioButton bt2 = new JRadioButton("2");
                    JRadioButton bt3 = new JRadioButton("3");
                    bg1.add(bt1);
                    bg1.add(bt2);
                    bg1.add(bt3);

                p1.add(t);
                p1.add(tf);
                p1.add(bt1);
                p1.add(bt2);
                p1.add(bt3);
            //FIN LIGNE 1

            //Ligne 2
            JPanel p2 = new JPanel();

                JLabel t2 = new JLabel("Mathematiques: ");
                JTextField tf2 = new JTextField();
                    tf2.setColumns(6);
                ButtonGroup bg2 = new ButtonGroup();
                    JRadioButton bt21 = new JRadioButton("1");
                    JRadioButton bt22 = new JRadioButton("2");
                    JRadioButton bt23 = new JRadioButton("3");
                    bg2.add(bt21);
                    bg2.add(bt22);
                    bg2.add(bt23);

                p2.add(t2);
                p2.add(tf2);
                p2.add(bt21);
                p2.add(bt22);
                p2.add(bt23);

            //LIGNE 3
            JPanel p3 = new JPanel();

            JLabel t3 = new JLabel("Informatique: ");
            JTextField tf3 = new JTextField();
                    tf3.setColumns(6);
            ButtonGroup bg3 =  new ButtonGroup();
            JRadioButton bt31 = new JRadioButton("1");
            JRadioButton bt32 = new JRadioButton("2");
            JRadioButton bt33 = new JRadioButton("3");
            bg3.add(bt31);
            bg3.add(bt32);
            bg3.add(bt33);

            p3.add(t3);
            p3.add(tf3);
            p3.add(bt31);
            p3.add(bt32);
            p3.add(bt33);
            //FIN LIGNE 1

        //LIGNE 4
        JPanel p4 = new JPanel();

        JLabel t4 = new JLabel("Geographie: ");
        JTextField tf4 = new JTextField();
        tf4.setColumns(6);
        ButtonGroup bg4 =  new ButtonGroup();
        JRadioButton bt41 = new JRadioButton("1");
        JRadioButton bt42 = new JRadioButton("2");
        JRadioButton bt43 = new JRadioButton("3");
        bg4.add(bt41);
        bg4.add(bt42);
        bg4.add(bt43);

        p4.add(t4);
        p4.add(tf4);
        p4.add(bt41);
        p4.add(bt42);
        p4.add(bt43);
        //FIN LIGNE 1

        JPanel p5 = new JPanel();
            JComboBox<String> listeOptions = new JComboBox<String>(new String[]{"Latin","Grec","Sport"} );
            JTextField tf5 = new JTextField();
                tf5.setColumns(6);
             JLabel t5 = new JLabel("Optionnel");

             p5.add(listeOptions);
             p5.add(tf5);
             p5.add(t5);

        JPanel p6 = new JPanel();
            JButton b6 = new JButton("Moyenne");
            JLabel t6 = new JLabel("Valeur");
            p6.add(b6);
            p6.add(t6);



        mainPan.add(p1);
        mainPan.add(p2);
        mainPan.add(p3);
        mainPan.add(p4);
        mainPan.add(p5);
        JCheckBox chbx = new JCheckBox("Prendre en considèration les coeffs");
        mainPan.add(chbx);
        mainPan.add(p6);

        this.setContentPane(mainPan);
    }

    void initComponentV2(){
        JPanel mainPan = new JPanel();
            mainPan.setLayout(new BoxLayout(mainPan,BoxLayout.Y_AXIS));

            JPanel boitAutour = new JPanel();
            JPanel boite = new JPanel();
                boite.setLayout(new GridLayout(5,3));
                    JLabel t1 = new JLabel("Anglais  ",SwingConstants.LEFT);
                        boite.add(t1);


                    JTextField tf1 = new JTextField();
                        tf1.setColumns(6);
                        boite.add(tf1);


                    JPanel bout1 = new JPanel();
                        ButtonGroup bg1 = new ButtonGroup();
                        JRadioButton b11 = new JRadioButton("1");
                            bg1.add(b11);
                            bout1.add(b11);
                        JRadioButton b12 = new JRadioButton("2");
                            bg1.add(b12);
                            bout1.add(b12);
                        JRadioButton b13 = new JRadioButton("3");
                            bg1.add(b13);
                            bout1.add(b13);
                    boite.add(bout1);


                    JLabel t2 = new JLabel("Mathematiques  ",SwingConstants.LEFT);
                        boite.add(t2);


                    JTextField tf2 = new JTextField();
                        tf2.setColumns(6);
                        boite.add(tf2);


                    JPanel bout2 = new JPanel();
                        ButtonGroup bg2 = new ButtonGroup();
                        JRadioButton b21 = new JRadioButton("1");
                            bg2.add(b21);
                            bout2.add(b21);
                        JRadioButton b22 = new JRadioButton("2");
                            bg2.add(b22);
                            bout2.add(b22);
                        JRadioButton b23 = new JRadioButton("3");
                            bg2.add(b23);
                            bout2.add(b23);
                    boite.add(bout2);



                    JLabel t3 = new JLabel("Informatique  ",SwingConstants.LEFT);
                        boite.add(t3);


                    JTextField tf3 = new JTextField();
                        tf3.setColumns(6);
                        boite.add(tf3);


                    JPanel bout3 = new JPanel();
                        ButtonGroup bg3 = new ButtonGroup();
                        JRadioButton b31 = new JRadioButton("1");
                            bg3.add(b31);
                            bout3.add(b31);
                        JRadioButton b32 = new JRadioButton("2");
                            bg3.add(b32);
                            bout3.add(b32);
                        JRadioButton b33 = new JRadioButton("3");
                            bg3.add(b33);
                            bout3.add(b33);
                    boite.add(bout3);

                    JLabel t4 = new JLabel("Géographie  ",SwingConstants.LEFT);
                        boite.add(t4);


                    JTextField tf4 = new JTextField();
                        tf4.setColumns(6);
                        boite.add(tf4);


                    JPanel bout4 = new JPanel();
                        ButtonGroup bg4 = new ButtonGroup();
                        JRadioButton b41 = new JRadioButton("1");
                            bg4.add(b41);
                            bout4.add(b41);
                        JRadioButton b42 = new JRadioButton("2");
                            bg4.add(b42);
                            bout4.add(b42);
                        JRadioButton b43 = new JRadioButton("3");
                            bg4.add(b43);
                            bout4.add(b43);
                    boite.add(bout4);


                    JComboBox<String> dp = new JComboBox<String>(new String[]{"None","Latin","Grec","Sport"});
                        boite.add(dp);
                     JTextField tf5 = new JTextField();
                        boite.add(tf5);
                    JLabel opt = new JLabel("OPTIONEL");
                        boite.add(opt);



                    boite.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));

            boitAutour.add(boite);
            mainPan.add(boitAutour);


                JPanel fin = new JPanel();

                    JButton b = new JButton("moyenne");
                        fin.add(b);
                    JLabel lb = new JLabel("moy");
                        fin.add(lb);


         JPanel n = new JPanel();
        JCheckBox cb = new JCheckBox("Prendre en compte les coeffs");
        n.add(cb);

        mainPan.add(n);
        mainPan.add(fin);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Float> l = new ArrayList<Float>();
                if(!tf1.getText().equals("")){
                    float tmp = Integer.parseInt(tf1.getText());
                    if(cb.isSelected()){
                        if (b11.isSelected()){
                            l.add(tmp);
                        }else if(b12.isSelected()){
                            l.add(tmp);
                            l.add(tmp);
                        }else if(b13.isSelected()){
                            l.add(tmp);
                            l.add(tmp);
                            l.add(tmp);
                        }
                    }else{
                        l.add(tmp);
                    }

                }
                if(!tf2.getText().equals("")){
                    float tmp = Integer.parseInt(tf2.getText());
                    if(cb.isSelected()){
                        if (b21.isSelected()){
                            l.add(tmp);
                        }else if(b22.isSelected()){
                            l.add(tmp);
                            l.add(tmp);
                        }else if(b23.isSelected()){
                            l.add(tmp);
                            l.add(tmp);
                            l.add(tmp);
                        }
                    }else{
                        l.add(tmp);
                    }
                }
                if(!tf3.getText().equals("")){
                    float tmp = Integer.parseInt(tf3.getText());
                    if(cb.isSelected()){
                        if (b31.isSelected()){
                            l.add(tmp);
                        }else if(b32.isSelected()){
                            l.add(tmp);
                            l.add(tmp);
                        }else if(b33.isSelected()){
                            l.add(tmp);
                            l.add(tmp);
                            l.add(tmp);
                        }
                    }else{
                        l.add(tmp);
                    }
                }
                if(!tf4.getText().equals("")){
                    float tmp = Integer.parseInt(tf4.getText());
                    if(cb.isSelected()){
                        if (b41.isSelected()){
                            l.add(tmp);
                        }else if(b42.isSelected()){
                            l.add(tmp);
                            l.add(tmp);
                        }else if(b43.isSelected()){
                            l.add(tmp);
                            l.add(tmp);
                            l.add(tmp);
                        }
                    }else{
                        l.add(tmp);
                    }
                }

                float tmpmoy = 0;

                for (Float n: l) {
                    tmpmoy += n;
                }

                tmpmoy /= l.size();

                if(!tf5.getText().equals("") && !dp.getItemAt(dp.getSelectedIndex()).equals("None")){
                    float tmp = Integer.parseInt(tf5.getText());
                    if(tmp > tmpmoy){
                        l.add(tmp);
                    }

                }

                float moy = 0;
                for (Float n: l) {
                    moy += n;
                }

                moy /= l.size();

                lb.setText(Float.toString(moy));


            }
        });

        setContentPane(mainPan);
    }

    public void tamere(){
        JPanel dd = new JPanel();
        JButton alla = new JButton("TOTO");
        dd.add(alla);


        alla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("AKBAR");
            }
        });


        this.setContentPane(dd);
    }
}


