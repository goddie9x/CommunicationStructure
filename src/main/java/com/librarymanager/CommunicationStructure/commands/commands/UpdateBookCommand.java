package com.librarymanager.CommunicationStructure.commands.commands;

import java.util.UUID;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import com.librarymanager.CommunicationStructure.commands.events.IEvent;
import com.librarymanager.CommunicationStructure.queries.responses.BookResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UpdateBookCommand extends CommandAbstract {
    @TargetAggregateIdentifier
    protected String aggregateIdentifier;
    protected BookResponse book;

    public UpdateBookCommand(BookResponse book) {
        this.aggregateIdentifier = UUID.randomUUID().toString();
        this.book = book;
    }

    @Override
    public IEvent genEvent() {
        throw new UnsupportedOperationException("Unimplemented method 'genEvent'");
    }
}
