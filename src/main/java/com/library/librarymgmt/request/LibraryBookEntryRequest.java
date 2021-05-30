package com.library.librarymgmt.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter @Getter @NoArgsConstructor
public class LibraryBookEntryRequest {

    @NonNull
    private String bookName;
    @NonNull
    private String bookStatus;
    private String bookMark;
    private String bookNote;
}
