package com.library.librarymgmt.domain;

import com.library.librarymgmt.model.LibraryBook;
import com.library.librarymgmt.request.LibraryBookEntryRequest;
import com.library.librarymgmt.response.LibraryFetchResponse;
import com.library.librarymgmt.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LibraryDomain {

    @Autowired
    LibraryService libraryService;

    public List<LibraryBook> fetchAllBookDomain() {
        return libraryService.fetchAllBookService();
    }

    public LibraryBook makeBookEntryDomain(LibraryBookEntryRequest libraryBookEntryRequest) {

        return libraryService.makeBookEntryService(libraryBookEntryRequest);
    }

    public LibraryBook updateBookEntryDomain(LibraryBookEntryRequest libraryBookEntryRequest,String bookId) {

        return libraryService.updateBookEntryService(libraryBookEntryRequest,bookId);
    }

    public LibraryBook fetchBookByIdDomain(String bookId) {
        return libraryService.fetchBookById(bookId);
    }

    public String deleteBookByIdDomain(String bookId) {
        return libraryService.deleteBookByIdService(bookId);
    }
}
