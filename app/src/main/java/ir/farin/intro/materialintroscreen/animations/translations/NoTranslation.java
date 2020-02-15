package ir.farin.intro.materialintroscreen.animations.translations;

import android.support.annotation.FloatRange;
import android.view.View;

import ir.farin.intro.materialintroscreen.animations.IViewTranslation;


public class NoTranslation implements IViewTranslation {
    @Override
    public void translate(View view, @FloatRange(from = 0, to = 1.0) float percentage) {
    }
}