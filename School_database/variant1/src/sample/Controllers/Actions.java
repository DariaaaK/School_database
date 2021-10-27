package sample.Controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.Main;

public class Actions {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane pale1;

    @FXML
    private ImageView im1;

    @FXML
    private AnchorPane pale2;

    @FXML
    private ImageView im5;

    @FXML
    private Button bExit;

    @FXML
    private Label l11;

    @FXML
    private Label l111;

    @FXML
    private Button b1;

    @FXML
    private Button b2;

    @FXML
    private Button b3;

    @FXML
    private Button b4;

    @FXML
    private Button b5;

    @FXML
    private Button b6;

    @FXML
    private AnchorPane pale5;

    @FXML
    private Label l12;

    @FXML
    private AnchorPane pale21;

    @FXML
    void initialize() {
        b1.setOnAction(actionEvent -> {
            b1.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/act1.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        b2.setOnAction(actionEvent -> {
            b2.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/act2.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        b3.setOnAction(actionEvent -> {
            b3.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/act3.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        b4.setOnAction(actionEvent -> {
            b4.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/act4.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        b5.setOnAction(actionEvent -> {
            try {
                ResultSet resultset = Main.statement.executeQuery(
                        "SELECT AVG(stag) FROM teachers");
                while(resultset.next()){
                    String result = resultset.getString("AVG(stag)");
                    double d = Double.parseDouble(result);
                    String result2 = String.format("%.1f",d);
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Средний стаж");
                    alert.setHeaderText(null);
                    alert.setContentText("Средний стаж учителей: "+result2 + " лет");
                    alert.showAndWait();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        });
        b6.setOnAction(actionEvent -> {
            b6.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/act6.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        bExit.setOnAction(actionEvent ->
                bExit.getScene()
                        .getWindow()
                        .hide());
    }
}
