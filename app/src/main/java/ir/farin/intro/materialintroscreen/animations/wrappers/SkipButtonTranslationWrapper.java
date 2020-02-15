package ir.farin.intro.materialintroscreen.animations.wrappers;

import android.view.View;

import ir.farin.intro.materialintroscreen.animations.ViewTranslationWrapper;
import ir.farin.intro.materialintroscreen.animations.translations.DefaultPositionTranslation;
import ir.farin.intro.materialintroscreen.animations.translations.EnterDefaultTranslation;
import ir.farin.intro.materialintroscreen.animations.translations.ExitDefaultTranslation;

public class SkipButtonTranslationWrapper extends ViewTranslationWrapper {
    public SkipButtonTranslationWrapper(View view) {
        super(view);

        setEnterTranslation(new EnterDefaultTranslation())
                .setDefaultTranslation(new DefaultPositionTranslation())
                .setExitTranslation(new ExitDefaultTranslation());
    }
}