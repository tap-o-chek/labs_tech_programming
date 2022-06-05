package lab1;
//импорты:
import lab1.Singleton.SingletonService;
import lab1.FabricMethod.FabricMethodService;
import lab1.AbstractFabric.AbstractFabricService;
import lab1.Builder.BuilderService;

public class Application1 {
    public static void main(String[] args) {
        System.out.println("Лаба 1: Singleton");
        SingletonService st_service = new SingletonService();
        st_service.exec();

        System.out.println("\nЛаба 1: Fabric Method");
        FabricMethodService fm_service = new FabricMethodService();
        fm_service.exec();


        System.out.println("\nЛаба 1: Abstract Fabric Method");
        AbstractFabricService af_service = new AbstractFabricService();
        af_service.exec();

        System.out.println("\nЛаба 1: Builder");
        BuilderService b_service = new BuilderService();
        b_service.exec();
    }
}