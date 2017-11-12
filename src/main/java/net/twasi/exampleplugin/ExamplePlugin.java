package net.twasi.exampleplugin;

import net.twasi.core.models.Message.Command;
import net.twasi.core.plugin.api.TwasiPlugin;

public class ExamplePlugin extends TwasiPlugin {

    @Override
    public void onEnable() {
        // This code is called when the plugin is enabled, e.g. after startup.
        // You could maybe check some dependencies or load your config.
    }

    @Override
    public void onDisable() {
        // This is called when the plugin is disabled, e.g. before shutdown.
        // Please close here all open resources and save changes.
    }

    @Override
    public void onCommand(Command command) {
        // This is called after a registered command is executed in any chat.
        // Do your thing here! This is what you're there for, isn't it?

        // if command name is hello (e.g. !hello)
        if (command.getCommandName().equalsIgnoreCase("hello")) {
            // then be kind and return a hello world
            command.reply("Hello World!");
        }
    }
}
