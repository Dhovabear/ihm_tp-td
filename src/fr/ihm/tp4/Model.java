package fr.ihm.tp4;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Model {

    private String[] images;
    private DefaultListModel<String> listModel;

    private int imageAfficheeVue1;
    private int imageAfficheeVue2;


    public Model(){
        imageAfficheeVue1 = 0;
        imageAfficheeVue2 = 0;
        images = new String[6];
        images[0] = "/animos/Biche.jpg";
        images[1] = "/animos/CanardMan.gif";
        images[2] = "/animos/DoIt.jpg";
        images[3] = "/animos/GabeNewell.jpg";
        images[4] = "/animos/GoodEnough.png";
        images[5] = "/animos/Vieu.jpg";


        listModel = new DefaultListModel<String>();
        for(int i = 0; i < images.length ; i++){
            listModel.addElement(images[i].substring(8));
        }

    }


    public ImageIcon getImage(int index){
        ImageIcon i = new ImageIcon(getClass().getResource(images[index]));
        i = new ImageIcon(i.getImage().getScaledInstance(200,300,BufferedImage.SCALE_SMOOTH));
        return i;
    }


    public String[] getImages() {
        return images;
    }

    public DefaultListModel<String> getListModel() {
        return listModel;
    }

    public int getImageAfficheeVue1() {
        return imageAfficheeVue1;
    }

    public void setImageAfficheeVue1(int imageAfficheeVue1) {
        this.imageAfficheeVue1 = imageAfficheeVue1;
    }

    public int getImageAfficheeVue2() {
        return imageAfficheeVue2;
    }

    public void setImageAfficheeVue2(int imageAfficheeVue2) {
        this.imageAfficheeVue2 = imageAfficheeVue2;
    }
}
