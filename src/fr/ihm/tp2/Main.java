package fr.ihm.tp2;

public class Main {
    public static final void main(String[] args){

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Fenetre fen = new Fenetre();
            }
        });

    }
}
