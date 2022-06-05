package lab1.AbstractFabric;

class MobInput implements Input {

    private String value;

    public Input value(String value) {
        this.value = value;
        return null; //
    }

    public String value() {
        return value;
    }

    public void render() {
        System.out.println(String.format("render MobInput. With value %s", value));
    }

}