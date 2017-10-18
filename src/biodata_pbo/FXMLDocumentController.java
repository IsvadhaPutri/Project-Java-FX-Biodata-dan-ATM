/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodata_pbo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author HP
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label formulir;


    @FXML
    Button buttonproses;
     
     @FXML
    Button buttonhapus;

    @FXML
    private TextArea textarea;

    @FXML
    private TextField edittelepon;

    @FXML
    private TextField absen;

    @FXML
    private TextField alamat;

    @FXML
    private TextField nama;
    @FXML
    private Label nama1;
    @FXML
    private Label absen1;
    @FXML
    private Label alamat1;
    @FXML
    private Label telepon1;
    @FXML
    private GridPane telepon;

   

    @FXML
    private void proses(ActionEvent event) {
        String Nama=nama.getText();
        String Absen=absen.getText();
        String Alamat=alamat.getText();
        String Telepon=edittelepon.getText();
       
        textarea.setText("Nama Anda : "+Nama+"\nAbsen : "+Absen+"\nAlamat : "+Alamat+"\nTelepon : "+Telepon);
    }
    
    @FXML
    private void hapus(ActionEvent event) {
        

    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
