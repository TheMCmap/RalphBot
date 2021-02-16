package me.AndyW19.RalphBot;

import discord4j.core.event.domain.message.MessageCreateEvent;

interface Command {
    void execute(MessageCreateEvent event);
}
