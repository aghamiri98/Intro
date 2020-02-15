package ir.farin.intro.materialintroscreen.animations.wrappers;

import android.view.View;

import ir.farin.intro.R;
import ir.farin.intro.materialintroscreen.animations.ViewTranslationWrapper;
import ir.farin.intro.materialintroscreen.animations.translations.DefaultPositionTranslation;
import ir.farin.intro.materialintroscreen.animations.translations.ExitDefaultTranslation;

public class NextButtonTranslationWrapper extends ViewTranslationWrapper {
    public NextButtonTranslationWrapper(View view) {
        super(view);

        setExitTranslation(new ExitDefaultTranslation())
                .setDefaultTranslation(new DefaultPositionTranslation())
                .setErrorAnimation(R.anim.shake_it);
    }
}