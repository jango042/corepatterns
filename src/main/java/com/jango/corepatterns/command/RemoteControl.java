package com.jango.corepatterns.command;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RemoteControl {

    private Command command;

    public void pressButton() {
        command.execute();
    }
}
