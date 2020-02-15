package ir.farin.intro.materialintroscreen.widgets;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by hossein on 7/19/2016.
 */
public class DescriptionTextview extends android.support.v7.widget.AppCompatTextView{
    Typeface font = Typeface.createFromAsset(getResources().getAssets(), "fonts/default.ttf");

    public DescriptionTextview(Context context) {
        super(context);
        if (!isInEditMode())
            setTypeface(this.font);
    }

    public DescriptionTextview(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (!isInEditMode())
            setTypeface(this.font);
    }

    public DescriptionTextview(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if (!isInEditMode())
            setTypeface(this.font);
    }




}
