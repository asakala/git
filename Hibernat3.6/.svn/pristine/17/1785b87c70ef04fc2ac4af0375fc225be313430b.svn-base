import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Demo {

	public static void main(String[] args) {

		SessionFactory sesionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println(sesionFactory.openSession());
	}
}
