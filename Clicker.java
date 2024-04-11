.package com.example.demo;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Clicker extends Application
 {
    int count=0;
    double t1,t2;

    @Override
    public void start(Stage stage) throws IOException 
      {
            Label text = new Label("0");
            AnchorPane bg = new AnchorPane();
            String[] colors = {"RED","BLUE","BLACK","GREEN","WHITE","CYAN","PINK"};
            ChoiceBox colorchanger = new ChoiceBox(FXCollections.observableArrayList(colors));
            Button button = new Button();

            bg.setStyle("-fx-background-color :LIGHTSKYBLUE;");


            colorchanger.setLayoutX(14);
            colorchanger.setLayoutY(14);
            colorchanger.setPrefWidth(150);
            colorchanger.setOnAction(event ->
   {
     String bgcolor = (String) colorchanger.getValue();
      bg.setStyle("-fx-background-color: "+bgcolor);
    }
);

        button.setLayoutX(119);
        button.setLayoutY(353);
        button.setText("START");
        button.setFont(Font.font("Bauhaus 93",15));

        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() 
{
            	 @Override
            	  public void handle(MouseEvent mouseEvent) 
   {
                   setCount(button,text);
            	}
        };
        button.addEventFilter(MouseEvent.MOUSE_CLICKED,eventHandler);

        text.setFont(Font.font("Bauhaus 93",50));
        AnchorPane.setTopAnchor(text,192.0);
        AnchorPane.setLeftAnchor(text,136.0);
        bg.getChildren().addAll(text,button,colorchanger);
        Scene scene = new Scene(bg, 300, 500);

        stage.setTitle("Clicker!!");
        Image icon = new Image("C:\\Users\\gamar\\IdeaProjects\\demo1\\src\\cursor-vector-icon.jpg");
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }


    public void setCount(Button button , Label text)
     {
        count++;
        button.setText("CLICK");
        text.setText(Integer.toString(count));
        button.setLayoutX(Math.random()*250);
        button.setLayoutY((Math.random()*375)+100);
        AnchorPane.setLeftAnchor(text,136.0);
        AnchorPane.setTopAnchor(text,192.0);
        text.setFont(Font.font("Bauhaus 93",50));
        if(count==1)
         {
            t1=System.currentTimeMillis();
         }
       if(count==20)
        {
            t2=System.currentTimeMillis();
            text.setText("YOU'VE CLICKED\n 20 TIMES IN:\n"+((t2-t1)/1000)+" SECS");
            text.setFont(Font.font("Bauhaus 93",20));
            AnchorPane.setLeftAnchor(text,86.0);
            AnchorPane.setTopAnchor(text,192.0);
            button.setLayoutX(119);
            button.setLayoutY(353);
            button.setText("START");
            count=0;
        }
    }

    public static void main(String[] args) 
   {
        launch();
    }
}
