import lab6.DatabaseService;
import org.junit.jupiter.api.Test;

public class DatabaseServiceTest {

    @Test
    public void test() {
        DatabaseService service = new DatabaseService();
        service.exec();
    }

}
