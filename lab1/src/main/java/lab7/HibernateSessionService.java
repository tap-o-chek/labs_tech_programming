package lab7;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
public class HibernateSessionService {
    private static final Logger LOGGER = LoggerFactory.getLogger(HibernateSessionService.class);
    private final GroupDao groupDao;
    private final StudentDao studentDao;
    public HibernateSessionService() {
        SessionFactory sessionFactory = HibernateConfiguration.getFactory();
        //studentDao = new SessionStudentDao(sessionFactory);
        studentDao = new EntityManagerStudentDao(sessionFactory);
        groupDao = new GroupDao(sessionFactory);
    }
    public void exec() {
        Student student = studentDao.findById(1L);
        LOGGER.info("{}", student);
        List<Student> students = studentDao.findAll();
        LOGGER.info("{}", students);
        Group group = groupDao.findById(1L);
        Student newStudent = new Student();
        newStudent.setName("Иван");
        newStudent.setSurname("Новый");
        newStudent.setGroup(group);
        studentDao.save(newStudent);
    }
}