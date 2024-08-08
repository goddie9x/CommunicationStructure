package com.librarymanager.CommunicationStructure.commands.commands;

import com.librarymanager.CommunicationStructure.commands.events.IEvent;

public interface ICommand {
    public String getAggregateIdentifier();

    public IEvent genEvent();
}
