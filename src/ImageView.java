/*
Alikhan Khakimov
alikham.khakimov.1@ens.etsmtl.ca
*/

package src;

import java.util.List;
import java.util.ArrayList;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.paint.Color;

public class ImageView {
    private static final double W = 1920;
    private static final double H = 1080;

    private MenuBar menuBar = new MenuBar();
    private BorderPane colonne1 = new BorderPane();
    private BorderPane colonne2 = new BorderPane();
    private BorderPane colonne3 = new BorderPane();

    public void setup(Stage stage) {
        dessinerMenu();
        dessinerImageView();

        BorderPane root = new BorderPane();

        root.setTop(menuBar);
        root.setLeft(colonne1);
        root.setCenter(colonne2);
        root.setRight(colonne3);
            
        stage.setTitle("Laboratoire MVC-Image et perspectives");

        stage.setScene(new Scene(root, W, H));
        stage.show();
        stage.centerOnScreen();
    }

    public void dessinerMenu() {
        Menu menuFichier = new Menu("Fichier");
        Menu menuEdition = new Menu("Edition");
        Menu menuPressePapier = new Menu("Presse-Paper");

        MenuItem ouvrirSauvegarde = new MenuItem("Sauvegarder perspective");
        MenuItem ouvrirChargerPerspective = new MenuItem("Charger perspective");
        MenuItem ouvrirChargerImage = new MenuItem("Charger image");
        MenuItem ouvrirQuitter = new MenuItem("Quitter");

        menuFichier.getItems().add(ouvrirSauvegarde);
        menuFichier.getItems().add(ouvrirChargerPerspective);
        menuFichier.getItems().add(ouvrirChargerImage);
        menuFichier.getItems().add(ouvrirQuitter);
           
        menuBar.getMenus().add(menuFichier);
        menuBar.getMenus().add(menuEdition);
        menuBar.getMenus().add(menuPressePapier);
    }

    public void dessinerImageView() {
        colonne1.setPrefSize(W / 3, H);
        colonne1.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, new BorderWidths(7))));
        colonne2.setPrefSize(W / 3, H);
        colonne2.setBorder(new Border(new BorderStroke(Color.BLUE, BorderStrokeStyle.SOLID, null, new BorderWidths(7))));;
        colonne3.setPrefSize(W / 3, H);
        colonne3.setBorder(new Border(new BorderStroke(Color.BLUE, BorderStrokeStyle.SOLID, null, new BorderWidths(7))));;
    }
}
