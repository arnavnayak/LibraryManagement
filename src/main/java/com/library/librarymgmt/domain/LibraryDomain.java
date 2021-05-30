package com.library.librarymgmt.domain;

import com.library.librarymgmt.request.LibraryBookEntryRequest;
import com.library.librarymgmt.response.LibraryFetchResponse;
import org.springframework.stereotype.Component;

@Component
public class LibraryDomain {
    public LibraryFetchResponse makeBookEntryDomain(LibraryBookEntryRequest libraryBookEntryRequest) {
        LibraryFetchResponse libraryFetchResponse= new LibraryFetchResponse();
        return libraryFetchResponse;
    }
}
