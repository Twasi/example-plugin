package net.twasiplugin.exampleplugin;
import net.twasi.core.plugin.TwasiPlugin;
import net.twasi.core.plugin.api.TwasiUserPlugin;

public class ExamplePlugin extends TwasiPlugin {

    @Override
    public void onActivate() {
        // This code is called when the plugin is activated, e.g. after startup.
        // You could maybe check some dependencies or load your config.
    }

    @Override
    public void onDeactivate() {
        // This is called when the plugin is deactivated, e.g. before shutdown.
        // Please close here all open resources and save changes.
    }

    public Class<? extends TwasiUserPlugin> getUserPluginClass() {
        // This should return the class of the User plugin. One instance will be created per user.
        return ExampleUserPlugin.class;
    }
}
