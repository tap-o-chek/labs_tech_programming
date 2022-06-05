import lab7.HibernateSessionService;
import org.testng.annotations.Test;

class HibernateServiceTest {

    @Test
    void exec() {
        HibernateSessionService service = new HibernateSessionService();
        service.exec();
    }
}
