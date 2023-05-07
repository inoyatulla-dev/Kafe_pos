package com.example.final4_11;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class OrderController extends check {
    private Parent root;
    private  Stage stage;
    private Scene scene;


    @FXML
    private Label label_jami;

    @FXML
    private TextField text_lavash;

    @FXML
    private TextField text_choy;

    @FXML
    private TextField text_osh;

    @FXML
    private TextField text_salat;

    @FXML
    private Label text_xz;


    int choy = 3000;
    int lavash = 20000;
    int osh = 35000;
    int salat = 10000;
    int natija;
    int result = 0;
    int foiz;


    int getchoy;
    long getlavash;
    long getosh;
    long getsalat;



    public void ButtonChoy(ActionEvent actionEvent) {

        getchoy += 1;
        text_choy.setText(getchoy + "");
        natija+=getchoy*choy;
        foiz = (natija / 100) * 12;
        result = natija;// + foiz;
        label_jami.setText(result + "" + " so'm");
        text_xz.setText(foiz + "" + " so'm");
    }

    public void Buttonlavash(ActionEvent actionEvent) {
        getlavash += 1;
        text_lavash.setText(getlavash + "");
        natija+=getlavash * lavash;
        foiz = (natija / 100) * 12;
        result = natija;// + foiz;
        label_jami.setText(result + "" + " so'm");
        text_xz.setText(foiz + "" + " so'm");
    }

    public void Buttonosh(ActionEvent actionEvent) {
        getosh += 1;
        text_osh.setText(getosh + "");
        natija+=getosh*osh;
        foiz = (natija / 100) * 12;
        result = natija ;//+ foiz;
        label_jami.setText(result + "" + " so'm");
        text_xz.setText(foiz + "" + " so'm");
    }

    public void ButtonSalat(ActionEvent actionEvent) {
        getsalat += 1;
        text_salat.setText(getsalat + "");
        natija+=getsalat*salat;
        //foiz = (natija / 100) * 12;
        result = natija ;//+ foiz;
        label_jami.setText(result + "" + " so'm");
        text_xz.setText(foiz + "" + " so'm");
    }

    public void Hisobla(ActionEvent event) {
        // Muxsulotltrarning narxi

        getchoy = Integer.parseInt(text_choy.getText());
        getlavash = Long.parseLong(text_lavash.getText());
        getosh = Long.parseLong(text_osh.getText());
        getsalat = Long.parseLong(text_salat.getText());
/*
        if (getchoy >= 0) {
            choy *= getchoy;
            result += choy;
        }
        if (getlavash >= 0) {
            lavash *= getlavash;
            result += lavash;
        }
        if (getosh >= 0) {
            osh *= getosh;
            result += osh;
        }
        if (getsalat >= 0) {
            salat *= getsalat;
            result += salat;
        }
        foiz = (result / 100) * 12;
        result += foiz;
*/
        natija = (int) (choy * getchoy + lavash * getlavash + osh * getosh + salat * getsalat);
        foiz = (natija / 100) * 12;
        result = natija + foiz;
        label_jami.setText(result + "" + " so'm");
        text_xz.setText(foiz + "" + " so'm");

    }

    public void Tozalash(ActionEvent event) {
        text_lavash.setText("");
        text_choy.setText("");
        text_osh.setText("");
        text_salat.setText("");
        label_jami.setText("");
        text_xz.setText("");
        getsalat = 0;
        getlavash = 0;
        getchoy = 0;
        getosh = 0;
        result = 0;
        natija=0;

    }
    public void Chek(ActionEvent Event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("chek.fxml")));
        stage = (Stage) ((Node) Event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }


}