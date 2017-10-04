package com.example.cduse.languagesettings.language;

/**
 * Created by cduse on 10/3/2017.
 */

public enum SupportedLangauges {
    ENGLISH(new Language(1, "en", "English", true, false)),
    MANDARIN(new Language(2, "cmn", "Chinese Mandarin", true, false)),
    ARABIC(new Language(3, "ar", "Arabic", true, false)),
    RUSSIAN(new Language(4, "ru", "Russian", true, false));

    private Language value;

    SupportedLangauges(Language language) {
        this.value = language;
    }

    public static boolean isSupported(String languageCode) {
        for (SupportedLangauges supportedLangauges : SupportedLangauges.values()) {
            if (supportedLangauges.value.getCode().equals(languageCode)) {
                return true;
            }
        }
        return false;
    }

    public Language getValue() {
        return value;
    }
}
