package ba.unsa.etf.rs.tut5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        KorisniciModel model = new KorisniciModel();
        model.napuni();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../../../../../../resources/sample.fxml"));
        loader.setController(new KorisnikController(model));
        Parent root = loader.load();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
        /*KorisniciModel model = new KorisniciModel();
        model.napuni();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        loader.setController(new KorisnikController(model));
        Parent root = loader.load();
        primaryStage.setTitle("Lista korisnika");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }*/


    public static void main(String[] args) {
        launch(args);
    }
}
