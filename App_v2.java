package hellofx;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class App_v2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a grid pane to layout the form
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25, 25, 25, 25));

        // Add labels and text fields for user input
        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label ageLabel = new Label("Age:");
        TextField ageField = new TextField();

        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();

        Label phoneLabel = new Label("Phone:");
        TextField phoneField = new TextField();

        // Add a button to submit the form
        Button submitButton = new Button("Submit");

        // Add form elements to the grid pane
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameField, 1, 0);

        gridPane.add(ageLabel, 0, 1);
        gridPane.add(ageField, 1, 1);

        gridPane.add(emailLabel, 0, 2);
        gridPane.add(emailField, 1, 2);

        gridPane.add(phoneLabel, 0, 3);
        gridPane.add(phoneField, 1, 3);

        gridPane.add(submitButton, 1, 4);

        // Add event handler for the submit button
        submitButton.setOnAction(event -> {
            // Get the user input from the text fields
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String email = emailField.getText();
            String phone = phoneField.getText();

            // Create a new scene to display the user information
            Label nameLabel2 = new Label("Name: " + name);
            Label ageLabel2 = new Label("Age: " + age);
            Label emailLabel2 = new Label("Email: " + email);
            Label phoneLabel2 = new Label("Phone: " + phone);

            VBox vbox = new VBox(nameLabel2, ageLabel2, emailLabel2, phoneLabel2);
            vbox.setAlignment(Pos.CENTER);
            vbox.setSpacing(10);

            Scene scene2 = new Scene(vbox, 400, 300);

            // Set the title of the window and display the new scene
            primaryStage.setTitle("User Information");
            primaryStage.setScene(scene2);
            primaryStage.show();
        });

        // Create a scene and add the grid pane
        Scene scene = new Scene(gridPane, 400, 300);

        // Set the title of the window and display it
        primaryStage.setTitle("User Information Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}