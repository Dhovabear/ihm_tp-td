package fr.ihm.tp3;

import fr.ihm.tp3.Fenetre;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControlBoutton implements ActionListener {

    Fenetre f;

    public ControlBoutton(Fenetre f) {
        this.f = f;
        f.setControlBoutton(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(isNumber(f.tf1.getText())){
            try {
                f.model.setNoteAnglais(Float.parseFloat(f.tf1.getText()));
            } catch (NoteOutOfBound noteOutOfBound) {
                erreur("Veuillez entrer une note entre 0 et 20");
                return;
            }
        }else{
            erreur("Veuillez entrer un nombre !");
            return;
        }

        if(isNumber(f.tf2.getText())){
            try {
                f.model.setNoteMaths(Float.parseFloat(f.tf2.getText()));
            } catch (NoteOutOfBound noteOutOfBound) {
                erreur("Veuillez entrer une note entre 0 et 20");
                return;
            }
        }else{
            erreur("Veuillez entrer un nombre !");
            return;
        }

        if(isNumber(f.tf3.getText())){
            try {
                f.model.setNoteInfo(Float.parseFloat(f.tf3.getText()));
            } catch (NoteOutOfBound noteOutOfBound) {
                erreur("Veuillez entrer une note entre 0 et 20");
                return;
            }
        }else{
            erreur("Veuillez entrer un nombre !");
            return;
        }

        if(isNumber(f.tf4.getText())){
            try {
                f.model.setNoteGeo(Float.parseFloat(f.tf4.getText()));
            } catch (NoteOutOfBound noteOutOfBound) {
                erreur("Veuillez entrer une note entre 0 et 20");
                return;
            }
        }else{
            erreur("Veuillez entrer un nombre !");
            return;
        }

        if(f.dp.getSelectedIndex() != 0){
            if(isNumber(f.tf5.getText())){
                try {
                    f.model.setNumOption((int)f.dp.getSelectedIndex());
                    f.model.setNoteOption(Float.parseFloat(f.tf5.getText()));

                } catch (NumOptionOutOfBound numOptionOutOfBound) {
                    erreur("Une erreur est survenue avec l'option choisit");
                    return;
                } catch (NoteOutOfBound noteOutOfBound) {
                    erreur("Veuillez entrer une note entre 0 et 20 !");
                    return;
                }
            }else{
                erreur("veuillez entrez un nombre !");
                return;
            }
        }



        f.model.setCoeffActive(f.cb.isSelected());

        try {
            f.model.setCoeffAnglais(lireCoeff(f.rb11,f.rb12,f.rb13));
            f.model.setCoeffMaths(lireCoeff(f.rb21,f.rb22,f.rb23));
            f.model.setCoeffGeo(lireCoeff(f.rb31,f.rb32,f.rb33));
            f.model.setCoeffInfo(lireCoeff(f.rb41,f.rb42,f.rb43));
        } catch (CoeffOutOfBound coeffOutOfBound) {
            erreur("Veuillez entrer les coefficient !");
            return;
        }


        f.tmoy.setText(Float.toString(f.model.calculerMoyenne()));
    }

    public void erreur(String description){
        JOptionPane.showMessageDialog(f,description,"Erreur",0);
        return;
    }

    public int lireCoeff(JRadioButton b1 , JRadioButton b2 , JRadioButton b3){
        if(b1.isSelected()){
            return 1;
        }else if(b2.isSelected()){
            return 2;
        }else if(b3.isSelected()){
            return 3;
        }else{
            return -1;
        }
    }

    public boolean isNumber(String text){
        try{
            Float.parseFloat(text);
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
