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
            }
        }else{
            erreur("Veuillez entrer un nombre !");
        }

        if(isNumber(f.tf2.getText())){
            try {
                f.model.setNoteMaths(Float.parseFloat(f.tf2.getText()));
            } catch (NoteOutOfBound noteOutOfBound) {
                erreur("Veuillez entrer une note entre 0 et 20");
            }
        }else{
            erreur("Veuillez entrer un nombre !");
        }

        if(isNumber(f.tf3.getText())){
            try {
                f.model.setNoteInfo(Float.parseFloat(f.tf3.getText()));
            } catch (NoteOutOfBound noteOutOfBound) {
                erreur("Veuillez entrer une note entre 0 et 20");
            }
        }else{
            erreur("Veuillez entrer un nombre !");
        }

        if(isNumber(f.tf4.getText())){
            try {
                f.model.setNoteGeo(Float.parseFloat(f.tf4.getText()));
            } catch (NoteOutOfBound noteOutOfBound) {
                erreur("Veuillez entrer une note entre 0 et 20");
            }
        }else{
            erreur("Veuillez entrer un nombre !");
        }

        f.model.setCoeffActive(f.cb.isSelected());



        f.model.calculerMoyenne();
    }

    public void erreur(String description){
        JOptionPane.showMessageDialog(f,description,"Erreur",0);
        return;
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
