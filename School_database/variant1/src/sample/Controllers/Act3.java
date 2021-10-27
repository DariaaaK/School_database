package sample.Controllers;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import sample.DAO.Student;
import sample.Main;

public class Act3 {

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
    private Button b3;

    @FXML
    private AnchorPane pale21;

    @FXML
    private TextArea textArea;

    @FXML
    private Label l111;

    @FXML
    private TextArea classs;

    @FXML
    private Label l1111;

    @FXML
    private TextArea sub;

    @FXML
    void initialize() {
        b3.setOnAction(actionEvent -> {
            try {
                ResultSet resultset = Main.statement.executeQuery(
                        "SELECT AVG(mark) FROM marks WHERE class=\'"+classs.getText()+"\'AND subject=\'"+sub.getText()+"\'");
                if(resultset.next()){
                    String result = resultset.getString("AVG(mark)");
                    double d = Double.parseDouble(result);
                    String result2 = String.format("%.2f",d);
                    System.out.println(result2);
                    textArea.setText(result2);
                }else if (!resultset.next()){
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Error");
                    alert.setHeaderText(null);
                    alert.setContentText("Некорректные данные !");
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

