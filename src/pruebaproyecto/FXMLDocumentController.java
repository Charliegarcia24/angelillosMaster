/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaproyecto;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 44881206h
 */
public class FXMLDocumentController implements Initializable {

    Connection conn;
    BD bd = new BD();
    @FXML
    private Label label;
    @FXML
    private TextField tfUsuario;
    @FXML
    private TextField tfDNI;
    @FXML
    private TextField tfEmail;
    @FXML
    private Button Registrarse;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        bd.conectar();
    }

    @FXML
    private void registrarse(ActionEvent event) throws SQLException {
        bd.insertar(tfUsuario.getText(), tfDNI.getText(),tfEmail.getText());
    }

}
