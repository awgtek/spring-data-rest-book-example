package spring.data.rest.bookexample;

import java.util.Arrays;
import java.util.HashSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.data.rest.bookexample.entities.Book;

public class DataUtil {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
		EntityManagerFactory emf = (EntityManagerFactory) context.getBean("entityManagerFactory");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		for (int x = 1; x <= 2; x++) {
			Book book = new Book();
			
			book.setKeywords(new HashSet<String>(Arrays.asList("keyWord" + x)));
			em.persist(book);
			em.flush();
		}

		em.getTransaction().commit();
		System.out.println("Dummy Data Created");
	}

}
