package com.timedust.rpgskillsplugin.skills;

public class Skill {
    private int experience;
    private int level;
    private final int maxLevel;

    public Skill(int experience, int level, int maxLevel) {
        this.experience = experience;
        this.level = level;
        this.maxLevel = maxLevel;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMaxLevel() {
        return maxLevel;
    }
}
