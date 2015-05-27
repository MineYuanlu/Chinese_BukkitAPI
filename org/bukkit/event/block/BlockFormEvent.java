package org.bukkit.event.block;

import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

/**
 * 当一个方块基于世界的条件被构成或者蔓延时，调用此事件.
 * <p>
 * 使用 {@link BlockSpreadEvent} 来捕获方块，事实上在方块蔓延的时候，不只是
 * "随意地" 构成。
 * <p>
 * 例子:
 * <ul>
 * <li>雪在下雪的时候形成
 * <li>冰在有雪的生物群系中构成
 * </ul>
 * <p>
 * 如果本事件被取消，方块将不会构成
 * @see BlockSpreadEvent
 */
public class BlockFormEvent extends BlockGrowEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();

    public BlockFormEvent(final Block block, final BlockState newState) {
        super(block, newState);
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}