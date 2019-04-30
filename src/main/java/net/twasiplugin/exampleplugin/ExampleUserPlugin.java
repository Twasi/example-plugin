package net.twasiplugin.exampleplugin;

import net.twasi.core.plugin.api.TwasiUserPlugin;
import net.twasi.core.plugin.api.events.TwasiDisableEvent;
import net.twasi.core.plugin.api.events.TwasiEnableEvent;
import net.twasi.core.plugin.api.events.TwasiInstallEvent;

public class ExampleUserPlugin extends TwasiUserPlugin {

    @Override
    public void onEnable(TwasiEnableEvent e) {
        // Called when the user plugin is enabled
        // Application start, plugin installation (after onInstall)

        // Register command should be called here
        registerCommand(new HelloWorldCommand(this));
    }

    @Override
    public void onDisable(TwasiDisableEvent e) {
        // Called when the user plugin is disabled
        // Application shutdown, plugin uninstallation (after onUninstall)
    }

    @Override
    public void onInstall(TwasiInstallEvent e) {
        // Called when the plugin is installed, but not when the application is started.
        e.getAdminGroup().addKey("example.admin.*");
        e.getDefaultGroup().addKey("example.default.*");
        e.getModeratorsGroup().addKey("example.mods.*");
    }

    @Override
    public void onUninstall(TwasiInstallEvent e) {
        // Called when the plugin is uninstalled, but not when the application is stopped.
        e.getAdminGroup().removeKey("example.admin.*");
        e.getDefaultGroup().removeKey("example.default.*");
        e.getModeratorsGroup().removeKey("example.mods.*");
    }

}
