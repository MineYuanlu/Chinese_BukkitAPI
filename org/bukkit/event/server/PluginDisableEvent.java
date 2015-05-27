package org.bukkit.event.server;

import org.bukkit.event.HandlerList;
import org.bukkit.plugin.Plugin;

/**
 * 当一个插件被禁用时调用.
 * <p>
 * 原文:Called when a plugin is disabled.
 */
public class PluginDisableEvent extends PluginEvent {
    private static final HandlerList handlers = new HandlerList();

    public PluginDisableEvent(final Plugin plugin) {
        super(plugin);
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}