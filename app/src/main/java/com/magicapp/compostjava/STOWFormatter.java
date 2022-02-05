package com.magicapp.compostjava;

import android.content.Context;

public class STOWFormatter {private static final int[] sides = {0, 45, 90, 135, 180, 225, 270, 315, 360};
    private static String[] names = null;

    public SOTWFormatter(Context context) {
        initLocalizedNames(context);
    }

    public String format(float azimuth) {
        int iAzimuth = (int)azimuth;
        int index = findClosestIndex(iAzimuth);
        return iAzimuth + "° " + names[index];
    }

    private int findClosestIndex(int iAzimuth) {
    }
}
