package com.library.librarymgmt.controller;

import com.library.librarymgmt.domain.LibraryDomain;
import com.library.librarymgmt.request.LibraryBookEntryRequest;
import com.library.librarymgmt.response.LibraryFetchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/library/books")
public class LibraryManagementController {

    @Autowired
    LibraryDomain libraryDomain;

    @GetMapping(value = "/fetchAllBook", produces = "application/json")
    public LibraryFetchResponse fetchAllBooks(){
        LibraryFetchResponse libraryFetchResponse = new LibraryFetchResponse("1","something","incomplete","34","asldasldkajsd");
        return libraryFetchResponse; // TODO to be changed to actual response
    }

    @PostMapping(value = "/bookEntry", consumes = "application/json", produces = "application/json")
    public LibraryFetchResponse makeBookEntry(@RequestBody LibraryBookEntryRequest libraryBookEntryRequest){

        LibraryFetchResponse libraryFetchResponse = libraryDomain.makeBookEntryDomain(libraryBookEntryRequest);
        return libraryFetchResponse;
    }
}
