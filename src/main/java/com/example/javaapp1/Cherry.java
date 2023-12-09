package com.example.javaapp1;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Cherry extends ImageView {
    double xcoord;
    int cnt;
    public Cherry(double xcoord){
        super();
        cnt=0;
        Image myimage=new Image(getClass().getResourceAsStream("img_483479.png"));
        super.setImage(myimage);
        super.setY(321);
        super.setFitWidth(20);
        super.setFitHeight(20);
        this.xcoord=xcoord;
        super.setX(xcoord);
    }
}
