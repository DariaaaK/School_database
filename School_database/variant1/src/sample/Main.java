package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.SQLException;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;

public class Main extends Application {
    public static Statement statement;
    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
            statement = getConnection("jdbc:mysql://localhost:3306/school?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root",
                    "11111111").createStatement();

        } catch (SQLException e) {
            e.printStackTrace(); }
        Parent root = FXMLLoader.load(getClass().getResource("signInPage.fxml"));
        primaryStage.setTitle("Program");
        primaryStage.setScene(new Scene(root, 843, 616));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
