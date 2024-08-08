package com.librarymanager.CommunicationStructure.queries.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookResponse {
    private String bookId;
    private String name;
    private String author;
    private Boolean isReady;
}
