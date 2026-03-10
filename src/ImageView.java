/*
Alikhan Khakimov
alikham.khakimov.1@ens.etsmtl.ca
*/

package src;

import javafx.application.Platform;

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

import javafx.stage.FileChooser;
import java.io.File;

public class ImageView {
    private static final double W = 1920;
    private static final double H = 1080;

    private FileChooser fileChooser = new FileChooser();

    private MenuBar menuBar = new MenuBar();
    private BorderPane colonne1 = new BorderPane();
    private BorderPane colonne2 = new BorderPane();
    private BorderPane colonne3 = new BorderPane();

    private Menu menuFichier = new Menu("Fichier");
    private Menu menuEdition = new Menu("Edition");
    private Menu menuPressePapier = new Menu("Presse-Paper");

    private MenuItem ouvrirSauvegarde = new MenuItem("Sauvegarder perspective");
    private MenuItem ouvrirChargerPerspective = new MenuItem("Charger perspective");
    private MenuItem ouvrirChargerImage = new MenuItem("Charger image");
    private MenuItem ouvrirQuitter = new MenuItem("Quitter");

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

        ouvrirSelecteurFichiers(stage);
        quitterApplication();
    }

    public void dessinerMenu() {
        

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

    public void quitterApplication() {
        ouvrirQuitter.setOnAction(e -> {
            System.out.println("quitter");
            Platform.exit();
        });   
    }       

    public void ouvrirSelecteurFichiers(Stage stage) {
        /*
            CODE EMPRUNTE : 
            Les lignes suivantes sont basees d'un exemple de ce sites:
            https://jenkov.com/tutorials/javafx/filechooser.html
        */

        ouvrirChargerImage.setOnAction(e -> {
            File fichierChoisi = fileChooser.showOpenDialog(stage); 
        });

        /*
            FIN DU CODE EMPRUNTE 
        */
    }
    
}
