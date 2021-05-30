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

    public LibraryFetchResponse makeBookEntryDomain(LibraryBookEntryRequest libraryBookEntryRequest) {
        LibraryFetchResponse libraryFetchResponse= libraryService.makeBookEntryService(libraryBookEntryRequest);
        return libraryFetchResponse;
    }

    public List<LibraryBook> fetchAllBookDomain() {
        return libraryService.fetchAllBookService();

    }
}
