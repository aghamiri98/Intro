package ir.farin.intro.materialintroscreen.animations.wrappers;

import android.view.View;

import ir.farin.intro.materialintroscreen.animations.ViewTranslationWrapper;
import ir.farin.intro.materialintroscreen.animations.translations.DefaultPositionTranslation;
import ir.farin.intro.materialintroscreen.animations.translations.ExitDefaultTranslation;

public class PageIndicatorTranslationWrapper extends ViewTranslationWrapper {
    public PageIndicatorTranslationWrapper(View view) {
        super(view);

        setDefaultTranslation(new DefaultPositionTranslation())
                .setExitTranslation(new ExitDefaultTranslation());
    }
}