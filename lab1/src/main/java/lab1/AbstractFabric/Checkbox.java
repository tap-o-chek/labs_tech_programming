package lab1.AbstractFabric;

public interface Checkbox {
    void render();
    Checkbox state(boolean state);
    boolean state();
}