package ir.farin.intro.materialintroscreen.widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

/**
 * Created by hossein on 7/19/2016.
 */
public class TitleTextview extends android.support.v7.widget.AppCompatTextView{
    Typeface font = Typeface.createFromAsset(getResources().getAssets(), "fonts/default2.ttf");

    public TitleTextview(Context context) {
        super(context);
        if (!isInEditMode())
            setTypeface(this.font);
    }

    public TitleTextview(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (!isInEditMode())
            setTypeface(this.font);
    }

    public TitleTextview(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if (!isInEditMode())
            setTypeface(this.font);
    }




}
