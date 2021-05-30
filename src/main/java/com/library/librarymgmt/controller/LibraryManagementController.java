package com.library.librarymgmt.controller;

import com.library.librarymgmt.domain.LibraryDomain;
import com.library.librarymgmt.request.LibraryBookEntryRequest;
import com.library.librarymgmt.response.LibraryFetchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/library/books")
public class LibraryManagementController {

    @Autowired
    LibraryDomain libraryDomain;

    @GetMapping(value = "/fetchAllBook", produces = "application/json")
    public ResponseEntity<?> fetchAllBooks(){
        return ResponseEntity.ok(libraryDomain.fetchAllBookDomain());

    }

    @PostMapping(value = "/bookEntry", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> makeBookEntry(@RequestBody LibraryBookEntryRequest libraryBookEntryRequest){

        return ResponseEntity.ok(libraryDomain.makeBookEntryDomain(libraryBookEntryRequest));
    }
}
