package lab1.FabricMethod;

public class FabricMethodService {

    public void exec(){
        Configuration configur = Configuration.initWeb();
        AbstractDialog dialog;

        switch(configur.getPlatform()) {
            case (Configuration.WEB):
                dialog = new WebDialog();
                break;
            case (Configuration.MOB):
                dialog = new MobDialog();
                break;
            default:
                throw new RuntimeException("Неизвестный тип платформы");
        }
        dialog.render();
    }
}
