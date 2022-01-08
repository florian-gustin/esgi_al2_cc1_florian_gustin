package com.amazen.kernel;

public interface CommandBus {
    <C extends Command, R> R send(C command);
}