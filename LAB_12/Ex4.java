import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex4 extends Application {

    @Override
    public void start(Stage primaryStage) {
        TextField diameterField = new TextField();
        diameterField.setPromptText("Enter diameter");

        ListView<String> options = new ListView<>();
        options.getItems().addAll("Area", "Radius", "Diameter", "Circumference");
        options.getSelectionModel().selectFirst();

        Button calculateButton = new Button("Calculate");
        Canvas canvas = new Canvas(300, 200);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        calculateButton.setOnAction(e -> {
            try {
                double diameter = Double.parseDouble(diameterField.getText());
                double radius = diameter / 2;
                double area = Math.PI * radius * radius;
                double circumference = Math.PI * diameter;

                gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
                gc.strokeOval(50, 50, diameter, diameter);

                String selectedOption = options.getSelectionModel().getSelectedItem();
                switch (selectedOption) {
                    case "Area":
                        gc.fillText("Area: " + area, 10, 170);
                        break;
                    case "Radius":
                        gc.fillText("Radius: " + radius, 10, 170);
                        break;
                    case "Diameter":
                        gc.fillText("Diameter: " + diameter, 10, 170);
                        break;
                    case "Circumference":
                        gc.fillText("Circumference: " + circumference, 10, 170);
                        break;
                }
            } catch (NumberFormatException ex) {
                gc.fillText("Invalid input", 10, 30);
            }
        });

        VBox root = new VBox(10, diameterField, options, calculateButton, canvas);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Circle Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
