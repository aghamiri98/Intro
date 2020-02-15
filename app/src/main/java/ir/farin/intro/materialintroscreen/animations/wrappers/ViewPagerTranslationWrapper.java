package ir.farin.intro.materialintroscreen.animations.wrappers;

import android.view.View;

import ir.farin.intro.materialintroscreen.animations.ViewTranslationWrapper;
import ir.farin.intro.materialintroscreen.animations.translations.AlphaTranslation;
import ir.farin.intro.materialintroscreen.animations.translations.DefaultAlphaTranslation;

public class ViewPagerTranslationWrapper extends ViewTranslationWrapper {
    public ViewPagerTranslationWrapper(View view) {
        super(view);

        setDefaultTranslation(new DefaultAlphaTranslation())
                .setExitTranslation(new AlphaTranslation());
    }
}