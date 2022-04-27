package com.varsitycollege.canvasdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public boolean check = false;
    public boolean left = false;
    public boolean right = false;
    public boolean up = false;
    public boolean down = false;
    float x,y;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();


        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.WHITE);
        canvas.drawPaint(paint);
        paint.setColor(Color.parseColor("#6200EE"));

        if(check==false){
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, 100, paint);
            x =this.getWidth()/2;
            y = this.getHeight()/2;
        }
        else if(left){
            x = x-40;
            canvas.drawCircle(x,y,100,paint);
        }
        else if(right){
            x = x+40;
            canvas.drawCircle(x,y,100,paint);
        }
        else if(up){
            y = y-40;
            canvas.drawCircle(x,y,100,paint);
        }
        else if(down){
            y = y+40;
            canvas.drawCircle(x,y,100,paint);
        }

    }
}