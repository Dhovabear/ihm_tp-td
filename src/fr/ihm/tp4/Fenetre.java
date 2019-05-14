package fr.ihm.tp4;

import javax.swing.*;

public class Fenetre extends JFrame {

    private JList<String> listImages;
    private JLabel labelImageTab1;

    private Model model;

    public Fenetre(Model model){

        this.model = model;
        initFenetre();
        initComponent();
        creeVue();

    }


    private void initFenetre(){
        setTitle("DiaporamaDeOuf");
        setResizable(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void initComponent(){
        listImages = new JList<>(model.getListModel());
        listImages.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        labelImageTab1 = new JLabel();
    }


    public void creeVue(){

        JScrollPane panneauGauche = new JScrollPane(listImages);

        JPanel d = new JPanel();
        d.add(labelImageTab1);
        labelImageTab1.setIcon(model.getImage(model.getImageAfficheeVue1()));

        JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,panneauGauche,d);
        sp.setDividerLocation(150);


        JTabbedPane mainPan = new JTabbedPane();
        mainPan.addTab("Tab 1",sp);

        setContentPane(mainPan);
        pack();
    }

    public void display() {
        setVisible(true);
    }
}
