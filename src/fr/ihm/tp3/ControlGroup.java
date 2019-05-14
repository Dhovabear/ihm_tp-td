package fr.ihm.tp3;

public class ControlGroup {


    public ControlGroup(Model model) throws SansOptionException {
        Fenetre fen = new Fenetre(model);

        ControlMenu cm = new ControlMenu(fen);
        ControlBoutton cb = new ControlBoutton(fen,model);

        fen.display();
    }
}
