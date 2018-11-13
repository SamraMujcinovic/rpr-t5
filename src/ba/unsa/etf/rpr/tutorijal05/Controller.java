package ba.unsa.etf.rpr.tutorijal05;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    public Button equalsBtn;
    public TextField inputField;
    public int vr, vr2;

    public void ispisi(ActionEvent actionEvent) {
        System.out.println("Lolly " + vr);
    }

    /*
    add()
        operator = '+';

    equals()
        vr = vr operaor vr2
    */

    public void set1(ActionEvent actionEvent) {
        vr = 1;
    }
}
