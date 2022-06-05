package lab1.AbstractFabric;

public class AbstractFabricService {

    public void exec() {
        renderForm(initFactory());
    }

    private FormElementFactory initFactory() throws RuntimeException {
        Configuration configuration = Configuration.initWeb();
        FormElementFactory factory;

        switch(configuration.getPlatform())
        {
            case (Configuration.WEB):
                factory = new WebFormElementFactory();
            case (Configuration.MOB):
                factory = new MobFormElementFactory();
            default:
                throw new RuntimeException("Не известный тип платформы");
        }
        //return factory;
    }

    private void renderForm(FormElementFactory factory) {
        Input input = factory.createInput();
        Button button = factory.createButton();

        input.value("Тестовое значение поля ввода данных");
        input.render();
        button.render();
    }
}