package lab1.AbstractFabric;

class WebButton implements Button {
    public void render() {
        System.out.println("render WebButton");
    }

    public void onClick() {
        System.out.println("Event on click WebButton");
    }
}