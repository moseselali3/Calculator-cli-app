import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.text.Text;
import javafx.stage.*;
import javafx.application.*;
import javafx.geometry.*;


public class LoginForm extends Application {
    public static void main(String[] args) { launch(args);}

    private Label usernameLbl;
    private TextField usernameTf;
    private Label passwordLbl;
    private PasswordField passwordPf;
    private Button loginButton;

    Text loginMessage = new Text();
        //loginMessage.setText("");



    public Text isLoginDetailsCorrect (TextField usernameTf, PasswordField passwordPf){



        if(this.usernameTf.getText().equals("sam") && this.passwordPf.getText().equals("mypassword"))
            this.loginMessage.setText("Password is correct!");
        else { loginMessage.setText("Password is incorrect!");}
            return this.loginMessage;
        }




    @Override
    public void start(Stage stage) throws Exception {


        usernameLbl = new Label("Username:");

        usernameTf = new TextField();

        passwordLbl = new Label("Password:");

        passwordPf = new PasswordField();

        loginButton = new Button("Login");
        loginButton.setOnAction(event -> {
            isLoginDetailsCorrect(usernameTf,passwordPf);
        });


        GridPane gridPane = new GridPane();

        gridPane.add(usernameLbl,0,0);
        gridPane.add(usernameTf,1,0);
        gridPane.add(passwordLbl,0,1);
        gridPane.add(passwordPf,1,1);
        gridPane.add(loginButton,1,2);
        gridPane.add(loginMessage,1,3);




        stage.setScene(new Scene(gridPane));
        stage.show();
    }
}


