package com.timedust.rpgskillsplugin.skills;

import java.util.EnumMap;
import java.util.Map;

public class PlayerData {

    private final Map<SkillType, Skill> skills = new EnumMap<>(SkillType.class);

    public PlayerData() {
        for (SkillType type : SkillType.values()) {
            skills.put(type, new Skill(0, 1, type.getMaxLevel()));
        }
    }

    public Skill getSkill(SkillType type) {
        return skills.get(type);
    }

}
