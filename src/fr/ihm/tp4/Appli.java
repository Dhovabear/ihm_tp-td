package fr.ihm.tp4;

import fr.ihm.tp4.Controleurs.ControlGroup;

import javax.swing.*;

public class Appli {

    public static void main(String[] args){

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Model model = new Model();
                ControlGroup cGroupe = new ControlGroup(model);
            }
        });

    }
}
