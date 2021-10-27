package sample.Controllers;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import sample.DAO.Teacher;
import sample.Main;

public class Act1 {

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
    private Button b1;

    @FXML
    private AnchorPane pale21;

    @FXML
    private Label l11;

    @FXML
    private TextArea count;

    @FXML
    private TextArea textArea;

    @FXML
    void initialize() {
        ArrayList<Teacher> teachers = new ArrayList<>();
        try {
            ResultSet resultset = Main.statement.executeQuery(
                    "SELECT COUNT(teacher_id) FROM teachers");
            while(resultset.next()){
                String count1 = resultset.getString("COUNT(teacher_id)");
                count.setText(count1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        b1.setOnAction(actionEvent -> {
            try {
                ResultSet resultset = Main.statement.executeQuery(
                        "SELECT * FROM teachers");
                while(resultset.next()){
                    Teacher teacher = new Teacher();
                    teacher.setId(resultset.getString("teacher_id"));
                    teacher.setLast_name(resultset.getString("last_name"));
                    teacher.setFirs_name(resultset.getString("first_name"));
                    teacher.setSubject(resultset.getString("subject"));
                    teacher.setYearStag(resultset.getString("stag"));

                    teachers.add(teacher);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            String result = teachers.toString().replace("[","").replace("]","").replace(",","");
            textArea.setText(result);
        });
        bExit.setOnAction(actionEvent ->
                bExit.getScene()
                        .getWindow()
                        .hide());

    }
}
