package com.sarvan.android.app.materialseekbar.materialseekbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.drawable.Drawable;

/**
 * Created by Saravana.Pandian on 3/9/2017.
 */

public class TextDrawable extends Drawable {

    private final String text;
    private final Paint paint;

    public TextDrawable(String text, Context context) {

        this.text = text;
        this.paint = new Paint();
        /*Bitmap bm = BitmapFactory.decodeResource(context.getResources(), R.drawable.indicator).copy(Bitmap.Config.ARGB_8888, true);
        Canvas canvas = new Canvas(bm);
        canvas.drawText(text, 0, 0, paint);*/


        paint.setColor(Color.WHITE);
        paint.setTextSize(20f);
        paint.setAntiAlias(true);
        paint.setFakeBoldText(true);
        paint.setShadowLayer(6f, 0, 0, Color.BLACK);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextAlign(Paint.Align.CENTER);



    }

    @Override
    public void draw(Canvas canvas) {


        Paint circlePaint1 = new Paint();
        circlePaint1.setColor(Color.parseColor("#20B2AA"));
        circlePaint1.setFlags(Paint.ANTI_ALIAS_FLAG);
        circlePaint1.setStrokeWidth(50);
        circlePaint1.setStyle(Paint.Style.STROKE);
        circlePaint1.setStrokeJoin(Paint.Join.ROUND);
        canvas.drawCircle(0, 0,5f,circlePaint1);

        Paint circlePaint2 = new Paint();
        circlePaint2.setFlags(Paint.ANTI_ALIAS_FLAG);
        circlePaint2.setColor(Color.parseColor("#008080"));
        circlePaint2.setStrokeWidth(40);
        circlePaint2.setStyle(Paint.Style.STROKE);
        circlePaint2.setStrokeJoin(Paint.Join.ROUND);
        canvas.drawCircle(0, 0,5f,circlePaint2);

        canvas.drawText(text+"%", 0, 7, paint);
    }

    @Override
    public void setAlpha(int alpha) {
        paint.setAlpha(alpha);
    }

    @Override
    public void setColorFilter(ColorFilter cf) {
        paint.setColorFilter(cf);
    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT;
    }
}
