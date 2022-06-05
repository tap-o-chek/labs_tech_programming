package lab1.FabricMethod;

public abstract class AbstractDialog implements Dialog {

    abstract Button getButton();

    public void render() {
        Button button = getButton();
        button.render();
    }
}
