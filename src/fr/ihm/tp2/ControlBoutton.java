package fr.ihm.tp2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControlBoutton implements ActionListener {

    Fenetre f;

    public ControlBoutton(Fenetre f) {
        this.f = f;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // INITIALISATION DES VARIABLES
        int lim = 4;
        int somCoef = 0;
        int sommeNotes = 0;
        boolean coeffsEnabled = false;

        String[] notes = new String[5];
        notes[0] =  f.tf1.getText();
        notes[1] =  f.tf2.getText();
        notes[2] =  f.tf3.getText();
        notes[3] =  f.tf4.getText();

        int[] coeff = new int[5];

        JRadioButton[][] bouttonsCoeffs = new JRadioButton[4][3];
        bouttonsCoeffs[0][0] = f.rb11;
        bouttonsCoeffs[0][1] = f.rb12;
        bouttonsCoeffs[0][2] = f.rb13;
        bouttonsCoeffs[1][0] = f.rb21;
        bouttonsCoeffs[1][1] = f.rb22;
        bouttonsCoeffs[1][2] = f.rb23;
        bouttonsCoeffs[2][0] = f.rb31;
        bouttonsCoeffs[2][1] = f.rb32;
        bouttonsCoeffs[2][2] = f.rb33;
        bouttonsCoeffs[3][0] = f.rb41;
        bouttonsCoeffs[3][1] = f.rb42;
        bouttonsCoeffs[3][2] = f.rb43;

        // SI ON PREND EN COMPTE LES COEFFS ON VERIFIE QUE LES RB SOIT BIEN TOUS COCHES
        //ON EN PROFITE POUR FAIRE LA SOMME DES COEFFS
        if(f.cb.isSelected()){
            for (int i = 0 ; i < 4 ; i++ ){
                if(!(bouttonsCoeffs[i][0].isSelected() || bouttonsCoeffs[i][1].isSelected() || bouttonsCoeffs[i][2].isSelected())){
                    erreur("Veuillez renseigner les coefficiens \nou décochez la case qui les prend en compte!");
                    return;
                }
                if(bouttonsCoeffs[i][0].isSelected()){
                    coeff[i] = 1;
                }else if(bouttonsCoeffs[i][1].isSelected()){
                    coeff[i] = 2;
                }else if(bouttonsCoeffs[i][2].isSelected()){
                    coeff[i] = 3;
                }
            }
            for ( int c: coeff) {
                somCoef += c;
            }
            coeffsEnabled = true;
        }else{
            somCoef = 4;
        }

        if(!f.dp.getItemAt(f.dp.getSelectedIndex()).equals("")){
            notes[4] = f.tf5.getText();
            lim = 5;
        }else{
            notes[4] = "";
        }


        for (int i = 0 ; i < lim ; i++){
            System.out.println(notes[i]);
            if(notes[i].equals("")){
                erreur("il manque des notes !");
                return;
            }
        }

        for (int i = 0 ; i < lim ; i++){
            System.out.println(notes[i]);
            if(isNumber(notes[i])){
                erreur("ARRET DETRE CON ET MARQUE UN PUTAIN DE CHIFFRE!!!");
                return;
            }
        }

        for (int i = 0 ; i < lim ; i++){
            System.out.println(notes[i]);
            if(Double.parseDouble(notes[i]) < 0 || Double.parseDouble(notes[i]) > 20){
                erreur("Veuillez entrer des notes dans l'interval [0,20] !");
                return;
            }
        }


        if(coeffsEnabled){
            for(int i = 0 ; i < 4 ; i++){
                sommeNotes += Double.parseDouble(notes[i])*coeff[i];
            }
        }else{
            for(int i = 0 ; i < 4 ; i++){
                sommeNotes += Double.parseDouble(notes[i]);
            }
        }


        if(!f.dp.getSelectedItem().equals("")){
            String opt = (String)f.dp.getSelectedItem();
            if(opt.equals("Latin") || opt.equals("Grec")){
                somCoef += 2;
                sommeNotes += Double.parseDouble(notes[4])*2;
            }else{
                somCoef +=1;
                sommeNotes += Double.parseDouble(notes[4]);
            }

        }

        f.tmoy.setText(Double.toString(sommeNotes/(double)somCoef));


    }

    void erreur(String description){
        JOptionPane.showMessageDialog(f,description,"Erreur",0);
    }

    boolean isNumber(String str){
        Pattern p = Pattern.compile("[^0123456789]");
        Matcher m = p.matcher(str);
        return m.find();
    }

}
