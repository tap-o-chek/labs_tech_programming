package lab1.FabricMethod;

public class WebDialog extends AbstractDialog {
    public Button getButton() {
        return new WebButton();
    }
}