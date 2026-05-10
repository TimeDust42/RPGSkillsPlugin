package com.timedust.rpgskillsplugin.utils;

public class SkillUtils {

    public static final int BASE_EXP = 100;

    public static int expForLevel(int n) {
        return BASE_EXP * (n * n);
    }

}
