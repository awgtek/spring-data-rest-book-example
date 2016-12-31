package spring.data.rest.bookexample.repos;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import spring.data.rest.bookexample.entities.Book;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:app-context.xml")
@TransactionConfiguration(defaultRollback=false)
@Transactional
public class BookRepositoryTest {
	
	@Autowired
	BookRepository bookRepository;

	@Test
	public void testFindByKeywordsContainingIgnoreCase() {
		List<Book> books = bookRepository.findByKeywordsContainingIgnoreCase("keyWord1", null);
		for (Book book : books) {
			System.out.println(book.getKeywords().iterator().next().toString());
		}
		System.out.println("done");
	}

}
