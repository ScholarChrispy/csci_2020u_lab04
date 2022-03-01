package com.registration.lab04;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.geometry.Insets;


import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // setting the basic pane properties
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(5);
        pane.setVgap(5);
        pane.setPadding(new Insets(25,25,25,25));
        pane.setPrefSize(500,500);

        // setting the text fields
        TextField username = new TextField("");
        PasswordField password = new PasswordField();
        TextField full_name = new TextField("");
        TextField email = new TextField("");
        TextField phone = new TextField("");
        DatePicker dob = new DatePicker(null);

        Text result_prompt = new Text();
        result_prompt.setVisible(false); // hiding the results by default
        result_prompt.setFont(Font.font("Arial", 15)); // changing the fond

        Text title = new Text("Registration:");
        title.setFont(Font.font("Arial", 20));
        GridPane.setHalignment(title, HPos.CENTER); // centering the title

        // setting the labels
        Label username_label = new Label("Username: ");
        Label password_label = new Label("Password: ");
        Label full_name_label = new Label("Full Name: ");
        Label email_label = new Label("Email: ");
        Label phone_label = new Label("Phone Number: ");
        Label dob_label = new Label("Date of Birth: ");

        // add the labels and the text fields to the pane
        pane.add(title, 0, 1);

        pane.add(username_label, 0, 2);
        pane.add(username, 0, 3);

        pane.add(password_label, 0, 4);
        pane.add(password, 0, 5);

        pane.add(full_name_label, 0, 6);
        pane.add(full_name, 0, 7);

        pane.add(email_label, 0, 8);
        pane.add(email, 0, 9);

        pane.add(phone_label, 0, 10);
        pane.add(phone, 0, 11);

        pane.add(dob_label, 0, 12);
        pane.add(dob, 0, 13);

        // modifying the width of the text fields
        username.setPrefWidth(pane.getPrefWidth());
        password.setPrefWidth(pane.getPrefWidth());
        dob.setPrefWidth(pane.getPrefWidth());

        // register button
        Button submit = new Button("Register");
        pane.add(submit, 0, 14);
        GridPane.setHalignment(submit, HPos.CENTER); // centering the register button

        // results field
        pane.add(result_prompt, 0, 15);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);

        Scene scene = new Scene(borderPane, 500, 500);
        stage.setTitle("Lab 04 Solution");
        stage.setScene(scene);
        stage.show();

        submit.setOnAction(e -> {
            result_prompt.setText("Results submitted! Thank you!");
            GridPane.setHalignment(result_prompt, HPos.CENTER); // centering the results
            result_prompt.setVisible(true); // showing the results
        });

    }

    public static void main(String[] args) {
        launch();
    }
}