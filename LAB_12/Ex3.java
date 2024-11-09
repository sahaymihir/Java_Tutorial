import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Ex3 extends Application {
    public void start(Stage primaryStage) {
        Text message = new Text("Scrolling Message");

        RadioButton leftToRight = new RadioButton("Left to Right");
        RadioButton rightToLeft = new RadioButton("Right to Left");
        ToggleGroup toggleGroup = new ToggleGroup();
        leftToRight.setToggleGroup(toggleGroup);
        rightToLeft.setToggleGroup(toggleGroup);
        rightToLeft.setSelected(true);

        Button startButton = new Button("Start Scrolling");

        startButton.setOnAction(e -> {
            TranslateTransition transition = new TranslateTransition(Duration.seconds(5), message);
            if (leftToRight.isSelected()) {
                transition.setFromX(-200);
                transition.setToX(200);
            } else {
                transition.setFromX(200);
                transition.setToX(-200);
            }
            transition.setCycleCount(TranslateTransition.INDEFINITE);
            transition.setAutoReverse(true);
            transition.play();
        });

        HBox options = new HBox(10, leftToRight, rightToLeft);
        options.setAlignment(Pos.CENTER);
        VBox root = new VBox(10, message, options, startButton);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 400, 200);
        primaryStage.setTitle("Message Scroller");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
