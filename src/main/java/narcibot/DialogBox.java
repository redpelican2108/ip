package narcibot;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class DialogBox extends HBox{
    private Label text;
    private ImageView displayPicture;

    public DialogBox(Label l, ImageView iv) {
        assert(l != null);
        assert(iv != null);
        text = l;
        displayPicture = iv;

        text.setWrapText(true);
        displayPicture.setFitWidth(100.0);
        displayPicture.setFitHeight(100.0);

        this.setAlignment(Pos.TOP_LEFT);
        this.getChildren().addAll(displayPicture, text);
    }
}
