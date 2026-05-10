package com.timedust.rpgskillsplugin.skills;

public enum SkillType {
    COMBAT(25),
    MINING(25),
    FISHING(25),
    FARMING(25),
    FORAGING(25);

    private final int maxLevel;

    SkillType(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    public int getMaxLevel() {
        return maxLevel;
    }
}
