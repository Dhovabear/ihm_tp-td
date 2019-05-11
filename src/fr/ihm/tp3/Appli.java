package fr.ihm.tp3;

class Appli {

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater( new Runnable() {
            public void run() {
                Model model = new Model();
                try {
                    ControlGroup control = new ControlGroup(model);
                } catch (SansOptionException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
