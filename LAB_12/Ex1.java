import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex1 extends Application {
    public void start(Stage primaryStage) {
        TextField num1Field = new TextField();
        TextField num2Field = new TextField();
        num1Field.setPromptText("Enter first number");
        num2Field.setPromptText("Enter second number");

        Button computeButton = new Button("Compute");
        Canvas canvas = new Canvas(300, 200);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        computeButton.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());

                double sum = num1 + num2;
                double product = num1 * num2;
                double difference = num1 - num2;
                double quotient = num2 != 0 ? num1 / num2 : 0;

                gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
                gc.fillText("Sum: " + sum, 10, 30);
                gc.fillText("Product: " + product, 10, 60);
                gc.fillText("Difference: " + difference, 10, 90);
                gc.fillText("Quotient: " + quotient, 10, 120);
            } catch (NumberFormatException ex) {
                gc.fillText("Invalid input", 10, 30);
            }
        });

        VBox root = new VBox(10, num1Field, num2Field, computeButton, canvas);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Calculator App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
