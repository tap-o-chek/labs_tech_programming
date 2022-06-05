package lab1.AbstractFabric;

class WebFormElementFactory implements FormElementFactory {

    public Button createButton() {
        return new WebButton();
    }

    public Checkbox createCheckbox() {
        return new WebCheckbox();
    }

    public Input createInput() {
        return new WebInput();
    }

}