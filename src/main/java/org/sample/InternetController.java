package org.sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class InternetController implements Initializable {

    @FXML
    private TextField textFieldFirstName, textFieldLastName, textFieldAddress;
    @FXML
    public TableView<Data> tableView;
    @FXML
    public TableColumn<Data, String> colFirstName, colLastName, colAddress;
    @FXML
    public TableColumn<Data, Object> colSpeed, colBandwidth, colDuration;
    @FXML
    private ToggleGroup speed, bandwidth, duration;
    @FXML
    private Label errorMsg;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colFirstName.setCellValueFactory(new PropertyValueFactory<>("FirstName"));
        colLastName.setCellValueFactory(new PropertyValueFactory<>("LastName"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("Address"));
        colSpeed.setCellValueFactory(new PropertyValueFactory<>("Speed"));
        colBandwidth.setCellValueFactory(new PropertyValueFactory<>("Bandwidth"));
        colDuration.setCellValueFactory(new PropertyValueFactory<>("Duration"));
        //tableView.setItems(observableList);
    }

    /*ObservableList<Data> observableList = FXCollections.observableArrayList(
            new Data("John", "Doe", "No Street", 5, 20, "1 year"),
            new Data("Jane", "Gavin", "21st Street", 10, 50, "1 year"),
            new Data("Mike", "Toole", "Mongola", 50, 100, "2 year"),
            new Data("Peter", "Doe", "21st Street", 10, 20, "1 year"),
            new Data("Jack", "Moore", "5th Avenue", 20, "Flat", "2 years")
    );*/

    @FXML
    private void saveForm(ActionEvent actionEvent) {
        ToggleButton speedBtn = (ToggleButton) speed.getSelectedToggle();
        ToggleButton bandwidthBtn = (ToggleButton) bandwidth.getSelectedToggle();
        ToggleButton durationBtn = (ToggleButton) duration.getSelectedToggle();
        errorMsg.setText("All Data successfully saved");

        if(textFieldFirstName.getText().trim().isEmpty()) {
            textFieldFirstName.requestFocus();
            errorMsg.setText("Please enter your First Name");
            return;
        }

        if(textFieldLastName.getText().trim().isEmpty()) {
            textFieldLastName.requestFocus();
            errorMsg.setText("Please enter your Last Name");
            return;
        }

        if(textFieldAddress.getText().trim().isEmpty()) {
            textFieldAddress.requestFocus();
            errorMsg.setText("Please enter your Address");
            return;
        }

        if(speedBtn == null) {
            errorMsg.setText("Please enter Speed (mb/s)");
            return;
        }

        if(bandwidthBtn == null) {
            errorMsg.setText("Please enter Bandwidth");
            return;
        }

        if(durationBtn == null) {
            errorMsg.setText("Please enter Duration");
            return;
        }

        Data data = new Data(
                textFieldFirstName.getText(),
                textFieldLastName.getText(),
                textFieldAddress.getText(),
                speedBtn.getText(),
                bandwidthBtn.getText(),
                durationBtn.getText());

        tableView.getItems().add(data);

        speed.selectToggle(null);
        bandwidth.selectToggle(null);
        duration.selectToggle(null);
    }

    @FXML
    private void clearForm() {
        textFieldFirstName.clear();
        textFieldLastName.clear();
        textFieldAddress.clear();
        errorMsg.setText("");
    }

    @FXML
    private void deleteTableRow(ActionEvent actionEvent) {
        tableView.getItems().removeAll(tableView.getSelectionModel().getSelectedItems());
    }
}
