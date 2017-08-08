package lt.mano.paketas.controller;

import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import lt.mano.paketas.model.Model;
import lt.mano.paketas.model.ValueVO;

import javax.annotation.Resources;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public TableView lentele;

    public TableColumn stulpelisNr;
    public TableColumn stulpelisVardas;
    public TableColumn stulpelisAmzius;
    public TableColumn stulpelisUgis;
    public TableColumn stulpelisSpalva;

    private Model _duomenys;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        _duomenys = new Model();

        stulpelisNr.setCellValueFactory(new PropertyValueFactory<ValueVO, String>("eilesNr"));
        stulpelisVardas.setCellValueFactory(new PropertyValueFactory<ValueVO, String>("vardas"));
        stulpelisAmzius.setCellValueFactory(new PropertyValueFactory<ValueVO, String>("amzius"));
        stulpelisUgis.setCellValueFactory(new PropertyValueFactory<ValueVO, String>("ugis"));
        stulpelisSpalva.setCellValueFactory(new PropertyValueFactory<ValueVO, String>("spalva"));
    }

    public void skaitytkIsFailo() {
        _duomenys.atidarytiFaila();
        _duomenys.skaitymasIsFailo();
        lentele.setItems(_duomenys.getSarasas());
    }

}
