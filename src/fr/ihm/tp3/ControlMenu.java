package fr.ihm.tp3;

import fr.ihm.tp3.Fenetre;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlMenu implements ActionListener {

    private Fenetre fen;

    public ControlMenu(Fenetre fen) {
        this.fen = fen;
        fen.setControlMenu(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String txt = ((JMenuItem)e.getSource()).getText();

        if(txt.equals("Vue1")){
            fen.changerPourVue1();
        }else if(txt.equals("Vue2")){
            fen.changerPourVue2();
        }
    }
}
