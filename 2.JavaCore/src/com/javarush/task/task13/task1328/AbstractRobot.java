package com.javarush.task.task13.task1328;

import java.util.Random;

public abstract class AbstractRobot implements Attackable, Defensable{

    private static int hitCount;

    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        //hitCount = hitCount + 1;
        hitCount = randInt(1,4);

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            attackedBodyPart = BodyPart.LEG;
        } else if (hitCount > 3) {
            hitCount = 0;
            attackedBodyPart = BodyPart.CHEST;
        }
        return attackedBodyPart;
    }

    public BodyPart defense() {
        BodyPart defencedBodyPart = null;
        //hitCount = hitCount + 1;
        hitCount = randInt(1,4);

        if (hitCount == 1) {
            defencedBodyPart = BodyPart.CHEST;
        } else if (hitCount == 2) {
            defencedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {
            defencedBodyPart = BodyPart.ARM;
        } else if (hitCount > 3) {
            hitCount = 0;
            defencedBodyPart = BodyPart.HEAD;
        }
        return defencedBodyPart;
    }

    public static int randInt(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min)+1) + min;
    }

    public abstract String getName();
}
