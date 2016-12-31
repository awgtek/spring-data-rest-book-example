package spring.data.rest.bookexample.repos;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import spring.data.rest.bookexample.entities.Book;

public interface BookRepository extends PagingAndSortingRepository<Book, Long> {
    @RestResource(path = "by-keyword", rel = "by-keyword")
    List<Book> findByKeywordsContainingIgnoreCase(@Param(value = "keyword") String keyword, 
    		Pageable pageable);
}