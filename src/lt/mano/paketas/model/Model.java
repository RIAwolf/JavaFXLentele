package lt.mano.paketas.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Model {
    private ObservableList<ValueVO> _sarasas;

    private String _failoVardas = "mano.txt";
    private FileReader _in;
    private FileWriter _out;
    private BufferedReader _bufferis;

    public Model() {
        _sarasas = FXCollections.observableArrayList();
    }

    public void atidarytiFaila() {
        try {
            _in = new FileReader(_failoVardas);
            _bufferis = new BufferedReader(_in);
        } catch (Exception e) {

        }
    }

    public void skaitymasIsFailo() {
        try {
            String eilute = _bufferis.readLine();
            int i = 0;
            while (eilute != null) {
                String[] reiksmes = eilute.split("\\|");
                ValueVO asmuo = new ValueVO(
                        i++,
                        reiksmes[0],
                        Integer.parseInt(reiksmes[1]),
                        Float.parseFloat(reiksmes[2]),
                        reiksmes[3]
                );
                _sarasas.add(asmuo);
                eilute = _bufferis.readLine();
            }
            _bufferis.close();
            _in.close();
        } catch (Exception e) {

        }
    }

    public void irasymasIFaila() {
        try {
            _out = new FileWriter(_failoVardas);
            _out.write("");
            _out.write('\n');
            _out.close();
        } catch (Exception e) {
        }
    }

    public ObservableList<ValueVO> getSarasas() {
        return _sarasas;
    }
}
