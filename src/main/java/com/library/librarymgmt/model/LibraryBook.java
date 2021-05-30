package com.library.librarymgmt.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Document(collection = "BookManagement")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class LibraryBook {

    @Id
    private String bookId;
    private String bookName;
    private String bookStatus;
    private String bookMark;
    private String bookNote;
}
