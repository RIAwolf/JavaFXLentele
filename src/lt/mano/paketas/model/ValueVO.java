package lt.mano.paketas.model;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ValueVO {
    public SimpleIntegerProperty eilesNr;
    public SimpleStringProperty vardas;
    public SimpleIntegerProperty amzius;
    public SimpleFloatProperty ugis;
    public SimpleStringProperty spalva;

    public ValueVO(int pEilesNr, String pVardas, int pAmzius, float pUgis, String pSpalva) {
        eilesNr = new SimpleIntegerProperty(pEilesNr);
        vardas = new SimpleStringProperty(pVardas);
        amzius = new SimpleIntegerProperty(pAmzius);
        ugis = new SimpleFloatProperty(pUgis);
        spalva = new SimpleStringProperty(pSpalva);
    }
    /// getteriai lentelei, butina kad uzpildyti laukelius
    public SimpleIntegerProperty eilesNrProperty(){return eilesNr;}
    public SimpleIntegerProperty amziusProperty(){return amzius;}
    public SimpleFloatProperty ugisProperty(){return ugis;}
    public SimpleStringProperty spalvaProperty(){return spalva;}
    public SimpleStringProperty vardasProperty(){return vardas;}

}
