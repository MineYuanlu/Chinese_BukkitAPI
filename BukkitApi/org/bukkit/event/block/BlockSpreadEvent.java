package org.bukkit.event.block;

import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.event.HandlerList;

/**
 * 当一个方块基于世界条件地蔓延时，调用此事件.
 * <p>
 * 用 {@link BlockFormEvent} 来捕获方块 。方块蔓延是“随意”的形式，不是
 * 实际地传播。原：that "randomly" form instead of actually spread.
 * <p>
 * 例如:
 * <ul>
 * <li>蘑菇的蔓延
 * <li>火的蔓延
 * </ul>
 * <p>
 * 若本事件被取消，方块就不会蔓延。
 *
 * @see BlockFormEvent
 */
public class BlockSpreadEvent extends BlockFormEvent {
    private static final HandlerList handlers = new HandlerList();
    private final Block source;

    public BlockSpreadEvent(final Block block, final Block source, final BlockState newState) {
        super(block, newState);
        this.source = source;
    }

    /**
     * 获取这个事件中蔓延的源方块
     *
     * @return 这个事件中蔓延的源方块
     */
    public Block getSource() {
        return source;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}