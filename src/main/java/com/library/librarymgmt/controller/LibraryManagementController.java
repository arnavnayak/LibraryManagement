package com.library.librarymgmt.controller;

import com.library.librarymgmt.response.LibraryFetchResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library/books")
public class LibraryManagementController {

    @GetMapping(value = "/fetchAllBook", produces = "application/json")
    public LibraryFetchResponse fetchAllBooks(){
        LibraryFetchResponse libraryFetchResponse = new LibraryFetchResponse("1","something","incomplete","34","asldasldkajsd");
        return libraryFetchResponse;
    }
}
