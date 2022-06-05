package lab2.Bridge;

//Мост разделяет монолитный код приборов и пультов на две части:
// приборы (выступают реализацией) и пульты управления ими (выступают абстракцией)

public class BridgeService {

    private void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvRemote advancedRemote = new AdvRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }

    public void exec() {
        testDevice(new TV());
    }

}
