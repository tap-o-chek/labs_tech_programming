package lab2.Bridge;

public class AdvRemote extends BasicRemote {
    public AdvRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
