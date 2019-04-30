package fr.ihm.tp1;

public class App {

    public static  void  main(String[] args){

            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    Fen1 fen = new Fen1();
                }
            });
    }

}
