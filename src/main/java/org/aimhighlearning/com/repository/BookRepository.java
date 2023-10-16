package org.aimhighlearning.com.repository;

import org.aimhighlearning.com.entity.Book;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author sandeep.rana
 */
@Repository
public interface BookRepository extends PagingAndSortingRepository<Book, String> {
}
