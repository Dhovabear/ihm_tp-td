package fr.ihm.tp2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlMenu implements ActionListener {

    private Fenetre fen;

    public ControlMenu(Fenetre fen) {
        super();
        this.fen = fen;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String txt = ((JMenuItem)e.getSource()).getText();

        if(txt.equals("Vue1")){
            fen.getContentPane().removeAll();
            fen.ajoutWidgetV1();
            fen.pack();
        }else if(txt.equals("Vue2")){
            fen.getContentPane().removeAll();
            fen.ajoutWidgetV2();
            fen.pack();
        }
    }
}
