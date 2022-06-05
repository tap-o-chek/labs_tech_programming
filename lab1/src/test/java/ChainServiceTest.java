import lab3.Chain.Request;
import lab3.Chain.ChainServ;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChainServiceTest {

    @Test
    public void main() {
        String inputStream = "method:GET\npath:/user/info\nsession:hfhfhf-dhdhdhdhf-ayeye76";
        ChainServ service = new ChainServ();
        Request request = service.exec(inputStream);

        assertEquals("GET", request.getMethod());
        assertEquals("/user/info", request.getPath());
        assertEquals("hfhfhf-dhdhdhdhf-ayeye76", request.getSession());
    }

}