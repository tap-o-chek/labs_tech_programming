package lab1.AbstractFabric;

class MobFormElementFactory implements FormElementFactory {

    public Button createButton() {
        return new MobButton();
    }

    public Checkbox createCheckbox() {
        return new MobCheckbox();
    }

    public Input createInput() {
        return new MobInput();
    }

}