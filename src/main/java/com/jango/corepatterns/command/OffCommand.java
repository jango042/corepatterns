package com.jango.corepatterns.command;

public class OffCommand implements Command{
    private Television television;

    OffCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.off();
    }
}
