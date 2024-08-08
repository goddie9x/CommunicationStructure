package com.librarymanager.CommunicationStructure.queries.queries;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GetBookByIdQuery {
    private String bookId;
}
