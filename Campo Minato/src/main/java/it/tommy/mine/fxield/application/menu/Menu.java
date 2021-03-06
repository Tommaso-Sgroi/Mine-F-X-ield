package it.tommy.mine.fxield.application.menu;

import it.tommy.mine.fxield.application.campominato.CampoMinatoApplication;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public abstract class Menu extends Pane {
    protected VBox vBox = new VBox(10);
    protected CampoMinatoApplication app;
    protected double translateY;

    public Menu(ImageView imageView, CampoMinatoApplication app) {
        this.translateY = 100;
        if(imageView!=null) getChildren().add(imageView);
        vBox.setTranslateY(translateY);
        this.app = app;
    }

    public Menu(CampoMinatoApplication app){this(null, app);}

//    public Menu(ImageView imageView){
//        this(imageView, null);
//    }

    public void addItems(Node... nodes){
        vBox.getChildren().addAll(nodes);
        //getChildren().add(vBox);
    }

    protected void addVboxToPane(){getChildren().add(vBox);}


}
