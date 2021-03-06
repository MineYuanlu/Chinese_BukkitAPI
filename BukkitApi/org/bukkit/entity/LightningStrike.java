package org.bukkit.entity;

import org.jetbrains.annotations.NotNull;

/**
 * 代表雷击的实例，可能会或者不会造成伤害。
 */
public interface LightningStrike extends Entity {

    /**
     * 返回雷击是否是没有伤害的效果。
     * <p>
     * 原文：Returns whether the strike is an effect that does no damage.
     *
     * @return 雷击是否为效果
     */
    public boolean isEffect();

    // Spigot start
    public class Spigot extends Entity.Spigot {

        /*
         * 返回此雷击是否为静默的(是否发声).
         * <p>
         * 原文:Returns whether the strike is silent.
         *
         * @return 此雷击是否为静默的(true代表静默, 不会发声, false代表会产生雷响).
         */
        public boolean isSilent() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    @NotNull
    @Override
    Spigot spigot();
    // Spigot end
}