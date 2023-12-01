package com.example.apprestaurantbackend.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class PathUtil {

    @UtilityClass
    private static class VersionPath {
        public final String VERSION_1 = "/v1";
        public final String VERSION_2 = "/v2";
        public final String VERSION_3 = "/v3";
    }

    private final String MAIN = "/api";
    private final String VERSION = VersionPath.VERSION_2;

    public final String BASE_PATH = MAIN + VERSION;
}
