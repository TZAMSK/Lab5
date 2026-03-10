/*
Alikhan Khakimov
alikham.khakimov.1@ens.etsmtl.ca
*/

package src;

import src.ImageView;
import javafx.application.Application;

import javafx.stage.Stage;

public class Main extends Application{
    @Override
    public void start (Stage stage) {
        ImageView iView = new ImageView();
        iView.setup(stage);
    } 

    public static void main(String[] args) {
        launch(args);
    }

}
