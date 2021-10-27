package sample.Controllers;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import sample.Main;

public class Act6 {

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
    private Label l1112;

    @FXML
    private TextArea count;

    @FXML
    void initialize() {
        try {
            ResultSet resultset = Main.statement.executeQuery(
                    "SELECT COUNT(id) FROM marks where marks.mark<5");
            while(resultset.next()){
                String count1 = resultset.getString("COUNT(id)");
                count.setText(count1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        b3.setOnAction(actionEvent -> {
            try {
                ResultSet resultset = Main.statement.executeQuery(
                        "SELECT count(id),classOfSt FROM marks WHERE classOfSt=\'"+classs.getText()+"\'AND marks.mark <5");
                while (resultset.next()){
                    String result = resultset.getString("count(id)");
                    String cl = resultset.getString("classOfSt");
                    textArea.setText("Двоечников в "+cl+" классе : "+result);
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
