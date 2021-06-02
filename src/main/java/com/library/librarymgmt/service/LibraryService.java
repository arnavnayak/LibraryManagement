package com.library.librarymgmt.service;

import com.library.librarymgmt.model.LibraryBook;
import com.library.librarymgmt.repository.LibraryRepo;
import com.library.librarymgmt.request.LibraryBookEntryRequest;
import com.library.librarymgmt.response.LibraryFetchResponse;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
@Slf4j
public class LibraryService {

    @Autowired
    LibraryRepo libraryRepo;

    public List<LibraryBook> fetchAllBookService() {
        List<LibraryBook> allBookList = libraryRepo.findAll();

        return allBookList;
    }

    public LibraryBook makeBookEntryService(LibraryBookEntryRequest libraryBookEntryRequest) {
        ModelMapper modelMapper = new ModelMapper();
        LibraryBook bookEntry = modelMapper.map(libraryBookEntryRequest,LibraryBook.class);
        UUID uuid=UUID.randomUUID();
        bookEntry.setBookId(uuid.toString());
        return libraryRepo.save(bookEntry);
    }


    public LibraryBook updateBookEntryService(LibraryBookEntryRequest libraryBookEntryRequest,String bookId) {
        ModelMapper modelMapper = new ModelMapper();
        LibraryBook updatedBookEntry = modelMapper.map(libraryBookEntryRequest,LibraryBook.class);
        //Logic of getting the bookid
        LibraryBook bookEntry = fetchBookById(bookId);
        updatedBookEntry.setBookId(bookEntry.getBookId());
        return libraryRepo.save(updatedBookEntry);
    }

    public LibraryBook fetchBookById(String bookId) {
        log.info("inside fetchBookById service : bookId: {}",bookId);
        Optional<LibraryBook> bookDetails = libraryRepo.findById(bookId);
        log.info("after fetching bookdetails fetchBookById service : bookId: {}",bookDetails);
        return bookDetails.get();
    }

    public String deleteBookByIdService(String bookId) {
        log.info("inside deleteBookByIdService  : bookId: {}",bookId);
        libraryRepo.deleteById(bookId);
        log.info("after deleting bookdetails fetchBookById service :");
        return "successfully deleted bookId : "+bookId;
    }
}
