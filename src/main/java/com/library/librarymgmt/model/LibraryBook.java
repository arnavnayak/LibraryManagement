package com.library.librarymgmt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Document(collection = "BookManagement")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LibraryBook {

    @Id
    private String bookId;
    private String bookName;
    private String bookStatus;
    private String bookMark;
    private String bookNote;
}
