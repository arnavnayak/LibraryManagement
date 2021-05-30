package com.library.librarymgmt.service;

import com.library.librarymgmt.model.LibraryBook;
import com.library.librarymgmt.repository.LibraryRepo;
import com.library.librarymgmt.request.LibraryBookEntryRequest;
import com.library.librarymgmt.response.LibraryFetchResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
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


}
