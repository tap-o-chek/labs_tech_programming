package lab1.AbstractFabric;

public interface FormElementFactory {
    Button createButton();
    Checkbox createCheckbox();
    Input createInput();
}