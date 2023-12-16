

package com.example.bookDemo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bookDemo.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByName(String name);
    // Add other custom queries if needed...
}

