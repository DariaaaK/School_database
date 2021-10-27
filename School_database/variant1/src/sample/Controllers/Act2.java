package sample.Controllers;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import sample.DAO.Student;
import sample.DAO.Teacher;
import sample.Main;

public class Act2 {

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
    private Button b2;

    @FXML
    private AnchorPane pale21;

    @FXML
    private Label l11;

    @FXML
    private TextArea count;

    @FXML
    private TextArea textArea;

    @FXML
    private Label l111;

    @FXML
    private TextArea classs;

    @FXML
    void initialize() {
        ArrayList<Student> students = new ArrayList<>();
        try {
            ResultSet resultset = Main.statement.executeQuery(
                    "SELECT COUNT(student_id) FROM students");
            while(resultset.next()){
                String count1 = resultset.getString("COUNT(student_id)");
                count.setText(count1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        b2.setOnAction(actionEvent -> {
            try {
                ResultSet resultset = Main.statement.executeQuery(
                        "SELECT * FROM students WHERE class=\'"+classs.getText()+"\'");
                while(resultset.next()){
                    Student student = new Student();
                    student.setId(resultset.getString("student_id"));
                    student.setLastName(resultset.getString("last_name"));
                    student.setFirstName(resultset.getString("first_name"));
                    student.setClassOfStudent(resultset.getString("class"));
                    student.setTel(resultset.getString("numTel"));
                    students.add(student);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            String result = students.toString().replace("[","").replace("]","").replace(",","");
            textArea.setText(result);
        });
        bExit.setOnAction(actionEvent ->
                bExit.getScene()
                        .getWindow()
                        .hide());
    }
}
