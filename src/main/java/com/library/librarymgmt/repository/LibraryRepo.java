package com.library.librarymgmt.repository;

import com.library.librarymgmt.model.LibraryBook;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepo extends MongoRepository<LibraryBook,String> {

}
