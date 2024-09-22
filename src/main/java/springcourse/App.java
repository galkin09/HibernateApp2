package springcourse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import springcourse.model.Principal;
import springcourse.model.School;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration().addAnnotatedClass(Principal.class).addAnnotatedClass(School.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

            // С помощью Hibernate получите любого директора, а затем получите его школу.
//            Principal p = session.get(Principal.class, 1);
//            System.out.println(p.getSchool().getSchoolNumber());

            // Получите любую школу, а затем получите ее директора.
//            School s = session.get(School.class, 1);
//            System.out.println(s.getPrincipal().getName());

            // Создайте нового директора и новую школу и свяжите эти сущности.
//            Principal p = new Principal("Tyler", 33);
//            School s = new School(66);
//            p.setSchool(s);
//            session.persist(p);


            // Смените директора у существующей школы.
//            School s = session.get(School.class, 1);
//            Principal p = new Principal("New principal", 44);
//            p.setSchool(s);
//            session.persist(p);

            // Попробуйте добавить вторую школу для существующего директора и изучите возникающую ошибку
//            School s = session.get(School.class, 1);
//            Principal p = session.get(Principal.class, 5);
//            s.setPrincipal(p);

            session.getTransaction().commit();
        }finally {
            session.close();

        }
    }
}
