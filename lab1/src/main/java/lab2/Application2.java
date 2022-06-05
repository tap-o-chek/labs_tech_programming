package lab2;
import lab2.Adapter.AdapterService;
import lab2.Bridge.BridgeService;
import lab2.Deputy.DeputyServ;

public class Application2 {
    public static void main(String[] args) {
        System.out.println("\nЛаба 2: Adapter");
        AdapterService ad_service=new AdapterService();
        ad_service.exec();

        System.out.println("\nЛаба 2: Bridge");
        BridgeService bridge_serv=new BridgeService();
        bridge_serv.exec();

        System.out.println("\nЛаба 2: Deputy");
        DeputyServ deputy_serv =new DeputyServ();
        deputy_serv.exec();
    }
}
