import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        TextField nameField = new TextField();
        nameField.setPromptText("Enter your name");

        CheckBox englishCheck = new CheckBox("English");
        CheckBox frenchCheck = new CheckBox("French");
        CheckBox spanishCheck = new CheckBox("Spanish");

        Button submitButton = new Button("Submit");
        Canvas canvas = new Canvas(300, 200);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        submitButton.setOnAction(e -> {
            gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
            String name = nameField.getText();
            gc.fillText("Name: " + name, 10, 30);
            gc.fillText("Languages:", 10, 60);
            if (englishCheck.isSelected()) gc.fillText("English", 20, 90);
            if (frenchCheck.isSelected()) gc.fillText("French", 20, 120);
            if (spanishCheck.isSelected()) gc.fillText("Spanish", 20, 150);
        });

        VBox root = new VBox(10, nameField, englishCheck, frenchCheck, spanishCheck, submitButton, canvas);
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Resume App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
