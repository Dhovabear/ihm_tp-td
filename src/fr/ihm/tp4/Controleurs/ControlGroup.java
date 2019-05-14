package fr.ihm.tp4.Controleurs;

import com.sun.org.apache.xpath.internal.operations.Mod;
import fr.ihm.tp4.Fenetre;
import fr.ihm.tp4.Model;

public class ControlGroup {


    public ControlGroup(Model model){

        Fenetre fen = new Fenetre(model);
        //Listeners
        fen.display();
    }
}
