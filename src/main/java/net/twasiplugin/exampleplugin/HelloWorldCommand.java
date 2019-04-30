package net.twasiplugin.exampleplugin;

import net.twasi.core.plugin.api.TwasiUserPlugin;
import net.twasi.core.plugin.api.customcommands.TwasiCustomCommandEvent;
import net.twasi.core.plugin.api.customcommands.TwasiPluginCommand;

public class HelloWorldCommand extends TwasiPluginCommand {
    HelloWorldCommand(TwasiUserPlugin twasiUserPlugin) {
        super(twasiUserPlugin);
    }

    public String getCommandName() {
        return "hello";
    }

    public void process(TwasiCustomCommandEvent e) {
        e.getRenderer().render("example.hello");
    }
}
