import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.application.*;
import javafx.geometry.*;



public class Calculator extends Application {
    public static void main(String[] args) { launch(args); }

    private Label firstNumberLbl;
    private TextField firstNumberTf;
    private Label secondNumberLbl;
    private TextField secondNumberTf;
    private Label operationLbl;
    private Button addBtn;
    private Button subBtn;
    private Button mulBtn;
    private Button divBtn;
    private Label resultLbl;
    private TextField resultTf;

    public TextField getFirstNumberTf() {
        return firstNumberTf;
    }

    public TextField getSecondNumberTf() {
        return secondNumberTf;
    }

    public void setResult(int result) {
        String resultString = Integer.toString(result);
        resultTf.setText(resultString);

    }


    public class AddHandler implements EventHandler <ActionEvent> {
        @Override

                public void handle (ActionEvent e ) {
            int firstNumber = Integer.parseInt(getFirstNumberTf().getText()); //Type TextField need to convert to string before convert to int
            int secondNumber = Integer.parseInt(getSecondNumberTf().getText());
            int result = firstNumber + secondNumber;
            resultTf.setText(Integer.toString(result));

        }
    }


    @Override
    public void start(Stage stage) throws Exception {
        // 1. create the leaf nodes

        firstNumberLbl = new Label("First Number:     ");
        //firstNumberLbl.setAlignment(Pos.TOP_LEFT);

        firstNumberTf = new TextField();


        secondNumberLbl =  new Label("Second Number: ");

       secondNumberTf = new TextField();

       operationLbl = new Label("Operation:");

       addBtn = new Button("+");
          addBtn.setOnAction(new AddHandler());
//          addBtn.setAlignment(Pos.CENTER);


        subBtn = new Button("-");
//        subBtn.setAlignment(Pos.BASELINE_CENTER);


        subBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                int firstNumber = Integer.parseInt(getFirstNumberTf().getText());
                int secondNumber = Integer.parseInt(getSecondNumberTf().getText());
                int result = firstNumber - secondNumber;
                resultTf.setText(Integer.toString(result));
            }
        });


        mulBtn = new Button("*");

        mulBtn.setOnAction(e -> {
            int firstNumber = Integer.parseInt(getFirstNumberTf().getText());
            int secondNumber = Integer.parseInt(getSecondNumberTf().getText());
            int result = firstNumber * secondNumber;
            resultTf.setText(Integer.toString(result));
        });

        divBtn = new Button("/");
        divBtn.setOnAction(e -> {
            int firstNumber = Integer.parseInt(getFirstNumberTf().getText());
            int secondNumber = Integer.parseInt(getSecondNumberTf().getText());
            int result = firstNumber / secondNumber;
            resultTf.setText(Integer.toString(result));

        });


        resultLbl = new Label("Result:");

        resultTf = new TextField();






        // 2. create the branch node



        GridPane gridPane = new GridPane();

        gridPane.add(firstNumberLbl,0,0);
        gridPane.add(firstNumberTf,1,0);
        gridPane.add(secondNumberLbl,0,1);
        gridPane.add(secondNumberTf,1,1);
        gridPane.add(operationLbl,0,2);

        HBox box = new HBox(10);
        box.getChildren().addAll(addBtn,subBtn,mulBtn,divBtn);

        gridPane.add(box,1,2);

        gridPane.add(resultLbl,0,3);
        gridPane.add(resultTf,1,3);








//        VBox box = new VBox(10);
//        box.setAlignment(Pos.TOP_LEFT);
//
//        HBox line1 = new HBox(10);
//        line1.setAlignment(Pos.TOP_LEFT);
//        line1.getChildren().addAll(firstNumberLbl, firstNumberTf);
//
//        HBox line2 = new HBox(10);
//        line2.setAlignment(Pos.CENTER_LEFT);
//        line2.getChildren().addAll(secondNumberLbl,secondNumberTf);
//
//
//
//        box.getChildren().add(line1);




//        box.getChildren().add(firstNumberLbl);
//        box.getChildren().add(firstNumberTf);
//        box.getChildren().add(secondNumberLbl);
//        box.getChildren().add(secondNumberTf);
//        box.getChildren().add(operationLbl);
//        box.getChildren().add(addBtn);
//        box.getChildren().add(subBtn);
//        box.getChildren().add(mulBtn);
//        box.getChildren().add(divBtn);
//        box.getChildren().add(resultLbl);
//        box.getChildren().add(resultTf);


//        HBox firstNumberBox = new HBox(10);
//        firstNumberBox.setAlignment(Pos.CENTER_RIGHT);
//        firstNumberBox.getChildren().add(firstNumberTf);






        // 3. set the scene, show the stage

        stage.setScene(new Scene(gridPane));
        stage.show();



    }
}