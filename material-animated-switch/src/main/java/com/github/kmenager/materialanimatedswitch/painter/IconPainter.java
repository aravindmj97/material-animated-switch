package com.github.kmenager.materialanimatedswitch.painter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;


public abstract class IconPainter implements SwitchInboxPinnedPainter {

    protected Bitmap iconBitmap;
    protected Context context;
    protected Paint paint;
    protected int width;
    protected int height;
    protected int imageHeight;
    protected int imageWidth;
    protected boolean isVisible = false;
    protected int iconXPosition;
    protected int iconYPosition;
    protected int margin;
    protected int iconSize;

    public IconPainter(Context context, Bitmap bitmap, int margin, int iconSize) {
        this.context = context;
        this.iconBitmap = bitmap;
        this.margin = margin;
        this.iconSize = iconSize;
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setAntiAlias(true);
        initBitmap();
    }

    protected void initBitmap() {
        iconBitmap = Bitmap.createScaledBitmap(iconBitmap, iconSize, iconSize, false);
        imageHeight = iconBitmap.getHeight();
        imageWidth = iconBitmap.getWidth();
    }

    @Override
    public void draw(Canvas canvas) {
        if (isVisible) {
            canvas.drawBitmap(iconBitmap, iconXPosition, iconYPosition, paint);
        }
    }

    @Override
    public void onSizeChanged(int height, int width) {
        this.height = height;
        this.width = width;
    }
}
