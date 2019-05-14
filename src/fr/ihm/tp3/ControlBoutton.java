package fr.ihm.tp3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlBoutton implements ActionListener {

    private Fenetre m_f;
    private Model m_model;

    public ControlBoutton(Fenetre f , Model m) {
        this.m_f = f;
        this.m_model = m;
        f.setControlBoutton(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if(isNumber(m_f.tf1.getText())){
            try {
                m_model.setNoteAnglais(Float.parseFloat(m_f.tf1.getText()));
            } catch (NoteOutOfBound noteOutOfBound) {
                erreur("Veuillez entrer une note entre 0 et 20");
                return;
            }
        }else{
            erreur("Veuillez entrer un nombre !");
            return;
        }

        if(isNumber(m_f.tf2.getText())){
            try {
                m_model.setNoteMaths(Float.parseFloat(m_f.tf2.getText()));
            } catch (NoteOutOfBound noteOutOfBound) {
                erreur("Veuillez entrer une note entre 0 et 20");
                return;
            }
        }else{
            erreur("Veuillez entrer un nombre !");
            return;
        }

        if(isNumber(m_f.tf3.getText())){
            try {
                m_model.setNoteInfo(Float.parseFloat(m_f.tf3.getText()));
            } catch (NoteOutOfBound noteOutOfBound) {
                erreur("Veuillez entrer une note entre 0 et 20");
                return;
            }
        }else{
            erreur("Veuillez entrer un nombre !");
            return;
        }

        if(isNumber(m_f.tf4.getText())){
            try {
                m_model.setNoteGeo(Float.parseFloat(m_f.tf4.getText()));
            } catch (NoteOutOfBound noteOutOfBound) {
                erreur("Veuillez entrer une note entre 0 et 20");
                return;
            }
        }else{
            erreur("Veuillez entrer un nombre !");
            return;
        }

        if(m_f.dp.getSelectedIndex() != 0){
            if(isNumber(m_f.tf5.getText())){
                try {
                    m_model.setNumOption((int) m_f.dp.getSelectedIndex());
                    m_model.setNoteOption(Float.parseFloat(m_f.tf5.getText()));

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



        m_model.setCoeffActive(m_f.cb.isSelected());

        try {
            m_model.setCoeffAnglais(lireCoeff(m_f.rb11, m_f.rb12, m_f.rb13));
            m_model.setCoeffMaths(lireCoeff(m_f.rb21, m_f.rb22, m_f.rb23));
            m_model.setCoeffInfo(lireCoeff(m_f.rb31, m_f.rb32, m_f.rb33));
            m_model.setCoeffGeo(lireCoeff(m_f.rb41, m_f.rb42, m_f.rb43));
        } catch (CoeffOutOfBound coeffOutOfBound) {
            erreur("Veuillez entrer les coefficient !");
            return;
        }


        m_f.tmoy.setText(Float.toString(m_model.calculerMoyenne()));
    }

    public void erreur(String description){
        JOptionPane.showMessageDialog(m_f,description,"Erreur",0);
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
