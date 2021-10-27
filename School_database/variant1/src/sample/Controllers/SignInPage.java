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
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.Main;

public class SignInPage {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane pale1;

    @FXML
    private ImageView im1;

    @FXML
    private Label l1;

    @FXML
    private Label l2;

    @FXML
    private TextField login;

    @FXML
    private PasswordField password;

    @FXML
    private Button bLogin;

    @FXML
    private ImageView im2;

    @FXML
    private ImageView im3;

    @FXML
    private AnchorPane pale2;

    @FXML
    private ImageView im5;

    @FXML
    private Button bExit;

    @FXML
    void initialize() {
        bLogin.setOnAction(actionEvent -> {
            try {
                ResultSet result = Main.statement.executeQuery(
                        "SELECT teacher_id FROM teachers WHERE login=\'" + login.getText() + "\'AND password=\'" +
                                password.getText() + "\'");
                if (result.next()) {
                    bLogin.getScene().getWindow().hide();
                    FXMLLoader loader0 = new FXMLLoader();
                    loader0.setLocation(getClass().getResource("/sample/actions.fxml"));
                    try {
                        loader0.load();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Parent root0 = loader0.getRoot();
                    Stage stage0 = new Stage();
                    stage0.setScene(new Scene(root0));
                    stage0.showAndWait();

                } else {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Error");
                    alert.setHeaderText(null);
                    alert.setContentText("Неправильный логин или пароль !");
                    alert.showAndWait();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        });
        bExit.setOnAction(actionEvent ->
                bExit.getScene()
                        .getWindow()
                        .hide());

    }
}
