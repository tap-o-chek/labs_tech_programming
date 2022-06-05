package lab1.FabricMethod;

class MobDialog extends AbstractDialog {
    public Button getButton() {
        return (Button) new MobButton();
    }
}
