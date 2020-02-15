package ir.farin.intro.materialintroscreen.listeners.clickListeners;

import android.view.View;

import ir.farin.intro.materialintroscreen.MaterialIntroActivity;
import ir.farin.intro.materialintroscreen.animations.ViewTranslationWrapper;


public class PermissionNotGrantedClickListener implements View.OnClickListener {
    private final MaterialIntroActivity activity;
    private final ViewTranslationWrapper translationWrapper;

    public PermissionNotGrantedClickListener(MaterialIntroActivity activity, ViewTranslationWrapper translationWrapper) {
        this.activity = activity;
        this.translationWrapper = translationWrapper;
    }

    @Override
    public void onClick(View v) {
        translationWrapper.error();
        activity.showPermissionsNotGrantedError();
    }
}