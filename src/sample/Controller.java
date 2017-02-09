package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

//diagram sekwencji uzuzpełnić
//diagram aktywności
//zaznaczyc na jednym ze mamy hash map
//testy!
// wyslac mailem link do kodu na gift Hub z testem JUnit
// razem z doumentacją

public class Controller implements Initializable{

    public Key k = new Key();

    @FXML
    private Polygon keyC,keyD,keyE,keyF,keyG,keyA,keyH,keyC1,keyD1,keyE1,keyF1,keyG1,keyA1,keyH1;
    @FXML
    private Rectangle blackC, blackD, blackF,blackG,blackA,blackC1,blackD1, blackF1,blackG1,blackA1;
    @FXML
    private Ellipse ball;
    @FXML
    private HBox sheet;
    @FXML
    private MenuItem about, legenda;


    public AnchorPane myPane = new AnchorPane();

    private void pianoKeyHandler(int note, int x, int y){
        k.playNote(note);
        ball.setVisible(true);
        ball.setTranslateX(x);
        ball.setTranslateY(y);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Start");

        ball.setVisible(false);

        String image = this.getClass().getResource("pieciolinia.png").toExternalForm();
        sheet.setStyle(" -fx-background-image: url('" + image + "');  "
                + "-fx-background-position: center center; "
                + "-fx-background-repeat: stretch;");


        about.setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        final Stage dialog = new Stage();
                        dialog.initModality(Modality.APPLICATION_MODAL);

                        VBox dialogVbox = new VBox(20);
                        dialogVbox.getChildren().add(new Text("\n\t Natalia Skowronek, IA rok 3  2016/2017 \n\t Aplikacja PIANINO. Pozwala, przy uzyciu myszki, zagrac 2 oktawy \n\t jednoczesnie wyswietla na pieciolinii odpowiadającą nutę"));
                        Scene dialogScene = new Scene(dialogVbox, 390, 100);
                        dialog.setScene(dialogScene);
                        dialog.show();
                    }
                });

        legenda.setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        final Stage dialog = new Stage();
                        dialog.initModality(Modality.APPLICATION_MODAL);

                        VBox dialogVbox = new VBox(20);
                        dialogVbox.getChildren().add(new Text("\n\t" +
                                "LEGENDA:  \n\t" +
                                "Klawisz C - dźwięk C  \tKlawisz F - dźwięk GIS   \tKlawisz E - dźwięk E1 \n\t"+
                                "Klawisz V- dźwięk CIS  \tKlawisz G - dźwięk A   \tKlawisz R - dźwięk F1 \n\t"+
                                "Klawisz B - dźwięk D  \tKlawisz H - dźwięk AIS   \tKlawisz T - dźwięk FIS1 \n\t"+
                                "Klawisz N - dźwięk DIS  \tKlawisz J - dźwięk H   \tKlawisz Y - dźwięk G1 \n\t"+
                                "Klawisz M - dźwięk E  \tKlawisz K - dźwięk C1   \tKlawisz U - dźwięk GIS1 \n\t"+
                                "Klawisz A - dźwięk F  \tKlawisz L - dźwięk CIS1   \tKlawisz I - dźwięk A1 \n\t"+
                                "Klawisz S - dźwięk FIS  \tKlawisz Q - dźwięk D1   \tKlawisz O - dźwięk AIS1 \n\t"+
                                "Klawisz D - dźwięk G   \tKlawisz W - dźwięk DIS1 \tKlawisz P - dźwięk H1 \n\t"));

                        Scene dialogScene = new Scene(dialogVbox, 450, 200);
                        dialog.setScene(dialogScene);
                        dialog.show();
                    }
                });


        keyC.setOnMousePressed(e -> {
            pianoKeyHandler(1, 18, 104); keyC.setFill(Color.BLUEVIOLET);});
        blackC.setOnMousePressed(e -> {
            pianoKeyHandler(2, 18, 104); blackC.setFill(Color.BLUEVIOLET);});
        keyD.setOnMousePressed(e -> {
            pianoKeyHandler(3, 48, 99); keyD.setFill(Color.BLUEVIOLET);});
        blackD.setOnMousePressed(e -> {
            pianoKeyHandler(4, 48, 99); blackD.setFill(Color.BLUEVIOLET);});
        keyE.setOnMousePressed(e -> {
            pianoKeyHandler(5, 78, 93); keyE.setFill(Color.BLUEVIOLET);});
        keyF.setOnMousePressed(e -> {
            pianoKeyHandler(6, 108, 84); keyF.setFill(Color.BLUEVIOLET);});
        blackF.setOnMousePressed(e -> {
            pianoKeyHandler(7, 18, 104); blackF.setFill(Color.BLUEVIOLET);});
        keyG.setOnMousePressed(e -> {
            pianoKeyHandler(8, 138, 77); keyG.setFill(Color.BLUEVIOLET);});
        blackG.setOnMousePressed(e -> {
            pianoKeyHandler(9, 138, 77); blackG.setFill(Color.BLUEVIOLET);});
        keyA.setOnMousePressed(e -> {
            pianoKeyHandler(10, 168, 70); keyA.setFill(Color.BLUEVIOLET);});
        blackA.setOnMousePressed(e -> {
            pianoKeyHandler(11, 168, 70); blackA.setFill(Color.BLUEVIOLET);});
        keyH.setOnMousePressed(e -> {
            pianoKeyHandler(12, 198, 63); keyH.setFill(Color.BLUEVIOLET);});
        keyC1.setOnMousePressed(e -> {
            pianoKeyHandler(13, 228, 55); keyC1.setFill(Color.BLUEVIOLET);});
        blackC1.setOnMousePressed(e -> {
            pianoKeyHandler(14, 228, 55); blackC1.setFill(Color.BLUEVIOLET);});
        keyD1.setOnMousePressed(e -> {
            pianoKeyHandler(15, 258, 47); keyD1.setFill(Color.BLUEVIOLET);});
        blackD1.setOnMousePressed(e -> {
            pianoKeyHandler(16, 258, 47); blackD1.setFill(Color.BLUEVIOLET);});
        keyE1.setOnMousePressed(e -> {
            pianoKeyHandler(17, 288, 38); keyE1.setFill(Color.BLUEVIOLET);});
        keyF1.setOnMousePressed(e -> {
            pianoKeyHandler(18, 318, 33); keyF1.setFill(Color.BLUEVIOLET);});
        blackF1.setOnMousePressed(e -> {
            pianoKeyHandler(19, 318, 33); blackF1.setFill(Color.BLUEVIOLET);});
        keyG1.setOnMousePressed(e -> {
            pianoKeyHandler(20, 348, 27); keyG1.setFill(Color.BLUEVIOLET);});
        blackG1.setOnMousePressed(e -> {
            pianoKeyHandler(21, 348, 27); blackG1.setFill(Color.BLUEVIOLET);});
        keyA1.setOnMousePressed(e -> {
            pianoKeyHandler(22, 378, 21); keyA1.setFill(Color.BLUEVIOLET);});
        blackA1.setOnMousePressed(e -> {
            pianoKeyHandler(23, 378, 21); blackA1.setFill(Color.BLUEVIOLET);});
        keyH1.setOnMousePressed(e -> {
            pianoKeyHandler(24, 448, 16); keyH1.setFill(Color.BLUEVIOLET);});


        keyC.setOnMouseReleased(e-> {ball.setVisible(false); keyC.setFill(Color.WHITE);});
        keyC1.setOnMouseReleased(e-> {ball.setVisible(false); keyC1.setFill(Color.WHITE);});
        keyD.setOnMouseReleased(e-> {ball.setVisible(false); keyD.setFill(Color.WHITE);});
        keyD1.setOnMouseReleased(e-> {ball.setVisible(false); keyD1.setFill(Color.WHITE);});
        keyE.setOnMouseReleased(e-> {ball.setVisible(false); keyE.setFill(Color.WHITE);});
        keyE1.setOnMouseReleased(e-> {ball.setVisible(false); keyE1.setFill(Color.WHITE);});
        keyF.setOnMouseReleased(e-> {ball.setVisible(false); keyF.setFill(Color.WHITE);});
        keyF1.setOnMouseReleased(e-> {ball.setVisible(false); keyF1.setFill(Color.WHITE);});
        keyG.setOnMouseReleased(e-> {ball.setVisible(false); keyG.setFill(Color.WHITE);});
        keyG1.setOnMouseReleased(e-> {ball.setVisible(false); keyG1.setFill(Color.WHITE);});
        keyA.setOnMouseReleased(e-> {ball.setVisible(false); keyA.setFill(Color.WHITE);});
        keyA1.setOnMouseReleased(e-> {ball.setVisible(false); keyA1.setFill(Color.WHITE);});
        keyH.setOnMouseReleased(e-> {ball.setVisible(false); keyH.setFill(Color.WHITE);});
        keyH1.setOnMouseReleased(e-> {ball.setVisible(false); keyH1.setFill(Color.WHITE);});
        blackC.setOnMouseReleased(e-> {ball.setVisible(false); blackC.setFill(Color.BLACK);});
        blackD.setOnMouseReleased(e-> {ball.setVisible(false); blackD.setFill(Color.BLACK);});
        blackF.setOnMouseReleased(e-> {ball.setVisible(false); blackF.setFill(Color.BLACK);});
        blackG.setOnMouseReleased(e-> {ball.setVisible(false); blackG.setFill(Color.BLACK);});
        blackA.setOnMouseReleased(e-> {ball.setVisible(false); blackA.setFill(Color.BLACK);});
        blackC1.setOnMouseReleased(e-> {ball.setVisible(false); blackC1.setFill(Color.BLACK);});
        blackD1.setOnMouseReleased(e-> {ball.setVisible(false); blackD1.setFill(Color.BLACK);});
        blackF1.setOnMouseReleased(e-> {ball.setVisible(false); blackF1.setFill(Color.BLACK);});
        blackG1.setOnMouseReleased(e-> {ball.setVisible(false); blackG1.setFill(Color.BLACK);});
        blackA1.setOnMouseReleased(e-> {ball.setVisible(false); blackA1.setFill(Color.BLACK);});

    }

    @FXML
    public void handleKeyPressed(KeyEvent event){
        System.out.println("Key Pressed: " + event.getCode());
        if (event.getCode().toString() == "C")
        {   pianoKeyHandler(1, 18, 104); keyC.setFill(Color.BLUEVIOLET);}
        else if (event.getCode().toString() == "V")
        {   pianoKeyHandler(2, 18, 104); blackC.setFill(Color.BLUEVIOLET);}
        else if (event.getCode().toString() == "B")
        {   pianoKeyHandler(3, 48, 99); keyD.setFill(Color.BLUEVIOLET);}
        else if (event.getCode().toString() == "N")
        {   pianoKeyHandler(4, 48, 99); blackD.setFill(Color.BLUEVIOLET);}
        else if (event.getCode().toString() == "M")
        {   pianoKeyHandler(5, 78, 93); keyE.setFill(Color.BLUEVIOLET);}
        else if (event.getCode().toString() == "A")
        {   pianoKeyHandler(6, 108, 84); keyF.setFill(Color.BLUEVIOLET);}
        else if (event.getCode().toString() == "S")
        {   pianoKeyHandler(7, 18, 104); blackF.setFill(Color.BLUEVIOLET);}
        else if (event.getCode().toString() == "D")
        {   pianoKeyHandler(8, 138, 77); keyG.setFill(Color.BLUEVIOLET);}
        else if (event.getCode().toString() == "F")
        {   pianoKeyHandler(9, 138, 77); blackG.setFill(Color.BLUEVIOLET);}
        else if (event.getCode().toString() == "G")
        {   pianoKeyHandler(10, 168, 70); keyA.setFill(Color.BLUEVIOLET);}
        else if (event.getCode().toString() == "H")
        {   pianoKeyHandler(11, 168, 70); blackA.setFill(Color.BLUEVIOLET);}
        else if (event.getCode().toString() == "J")
        {pianoKeyHandler(12, 198, 63); keyH.setFill(Color.BLUEVIOLET);}
        else if (event.getCode().toString() == "K")
        {   pianoKeyHandler(13, 228, 55); keyC1.setFill(Color.BLUEVIOLET);}
        else if (event.getCode().toString() == "L")
        {   pianoKeyHandler(14, 228, 55); blackC1.setFill(Color.BLUEVIOLET);}
        else if (event.getCode().toString() == "Q")
        {   pianoKeyHandler(15, 258, 47); keyD1.setFill(Color.BLUEVIOLET);}
        else if (event.getCode().toString() == "W")
        {   pianoKeyHandler(16, 258, 47); blackD1.setFill(Color.BLUEVIOLET);}
        else if (event.getCode().toString() == "E")
        {    pianoKeyHandler(17, 288, 38); keyE1.setFill(Color.BLUEVIOLET);}
        else if (event.getCode().toString() == "R")
        {  pianoKeyHandler(18, 318, 33); keyF1.setFill(Color.BLUEVIOLET);}
        else if (event.getCode().toString() == "T")
        {   pianoKeyHandler(19, 318, 33); blackF1.setFill(Color.BLUEVIOLET);}
        else if (event.getCode().toString() == "Y")
        {   pianoKeyHandler(20, 348, 27); keyG1.setFill(Color.BLUEVIOLET);}
        else if (event.getCode().toString() == "U")
        {   pianoKeyHandler(21, 348, 27); blackG1.setFill(Color.BLUEVIOLET);}
        else if (event.getCode().toString() == "I")
        {   pianoKeyHandler(22, 378, 21); keyA1.setFill(Color.BLUEVIOLET);}
        else if (event.getCode().toString() == "O")
        {   pianoKeyHandler(23, 378, 21); blackA1.setFill(Color.BLUEVIOLET);}
        else if (event.getCode().toString() == "P")
        {   pianoKeyHandler(24, 448, 16); keyH1.setFill(Color.BLUEVIOLET);}

    }

    @FXML
    public void handleKeyReleased(KeyEvent event){
        System.out.println("Key Released: " + event.getCode());
        ball.setVisible(false);
        if(event.getCode().toString()=="C"){
            keyC.setFill(Color.WHITE);
        } else if (event.getCode().toString()=="V"){
            blackC.setFill(Color.BLACK);
        }  else if (event.getCode().toString() == "B")
        {   keyD.setFill(Color.WHITE);}
        else if (event.getCode().toString() == "N")
        {   blackD.setFill(Color.BLACK);}
        else if (event.getCode().toString() == "M")
        {    keyE.setFill(Color.WHITE);}
        else if (event.getCode().toString() == "A")
        {    keyF.setFill(Color.WHITE);}
        else if (event.getCode().toString() == "S")
        {    blackF.setFill(Color.BLACK);}
        else if (event.getCode().toString() == "D")
        {    keyG.setFill(Color.WHITE);}
        else if (event.getCode().toString() == "F")
        {    blackG.setFill(Color.BLACK);}
        else if (event.getCode().toString() == "G")
        {    keyA.setFill(Color.WHITE);}
        else if (event.getCode().toString() == "H")
        {    blackA.setFill(Color.BLACK);}
        else if (event.getCode().toString() == "J")
        {    keyH.setFill(Color.WHITE);}
        else if (event.getCode().toString() == "K")
        {    keyC1.setFill(Color.WHITE);}
        else if (event.getCode().toString() == "L")
        {    blackC1.setFill(Color.BLACK);}
        else if (event.getCode().toString() == "Q")
        {    keyD1.setFill(Color.WHITE);}
        else if (event.getCode().toString() == "W")
        {    blackD1.setFill(Color.BLACK);}
        else if (event.getCode().toString() == "E")
        {    keyE1.setFill(Color.WHITE);}
        else if (event.getCode().toString() == "R")
        {   keyF1.setFill(Color.WHITE);}
        else if (event.getCode().toString() == "T")
        {    blackF1.setFill(Color.BLACK);}
        else if (event.getCode().toString() == "Y")
        {    keyG1.setFill(Color.WHITE);}
        else if (event.getCode().toString() == "U")
        {    blackG1.setFill(Color.BLACK);}
        else if (event.getCode().toString() == "I")
        {    keyA1.setFill(Color.WHITE);}
        else if (event.getCode().toString() == "O")
        {    blackA1.setFill(Color.BLACK);}
        else if (event.getCode().toString() == "P")
        {    keyH1.setFill(Color.WHITE);}

    }
}

