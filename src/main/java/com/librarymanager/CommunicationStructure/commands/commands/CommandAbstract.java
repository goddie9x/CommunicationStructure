package com.librarymanager.CommunicationStructure.commands.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class CommandAbstract implements ICommand {
    @TargetAggregateIdentifier
    protected String aggregateIdentifier;

    public CommandAbstract() {
        aggregateIdentifier = UUID.randomUUID().toString();
    }
}