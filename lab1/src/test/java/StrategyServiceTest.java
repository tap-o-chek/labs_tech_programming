import lab3.Strategy.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrategyServiceTest {

    @Test
    public void test() {
        List<String> strings = new ArrayList<>();
        strings.add("с");
        strings.add("в");
        strings.add("е");
        strings.add("ч");
        strings.add("а");

        Strategy strategy = new CommaSeparated();
        StrategyService service = new StrategyServiceImpl(strategy);

        assertEquals("с,в,е,ч,а", service.exec(strings));

        strategy = new SemicolonSeparated();
        service.setStrategy(strategy);
        assertEquals("с;в;е;ч;а", service.exec(strings));
    }

}
