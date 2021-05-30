package com.library.librarymgmt.service;

import com.library.librarymgmt.model.LibraryBook;
import com.library.librarymgmt.repository.LibraryRepo;
import com.library.librarymgmt.request.LibraryBookEntryRequest;
import com.library.librarymgmt.response.LibraryFetchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LibraryService {

    @Autowired
    LibraryRepo libraryRepo;

    public List<LibraryBook> fetchAllBookService() {
        List<LibraryBook> allBookList = libraryRepo.findAll();

        return allBookList;
    }

    public LibraryFetchResponse makeBookEntryService(LibraryBookEntryRequest libraryBookEntryRequest) {
        LibraryFetchResponse libraryFetchResponse = new LibraryFetchResponse();
        return libraryFetchResponse;
    }


}
