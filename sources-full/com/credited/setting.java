package com.credited;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class setting {
    static {
        System.loadLibrary("null");
    }

    private static int dp(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static native void f(Context context);

    private static LinearLayout makeButtonRow(Context context, CheckBox checkBox) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        Button button = new Button(context);
        button.setText("关闭");
        button.setOnClickListener(new Cnull());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.rightMargin = dp(context, 8.0f);
        button.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-856756498);
        gradientDrawable.setCornerRadius(dp(context, 12.0f));
        button.setBackground(gradientDrawable);
        button.setTextColor(-9079435);
        linearLayout.addView(button);
        Button button2 = new Button(context);
        button2.setText("加入我们");
        button2.setOnClickListener(new url(checkBox, context));
        button2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(-856756498);
        gradientDrawable2.setCornerRadius(dp(context, 12.0f));
        button2.setBackground(gradientDrawable2);
        button2.setTextColor(-9079435);
        linearLayout.addView(button2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = dp(context, 16.0f);
        linearLayout.setLayoutParams(layoutParams2);
        return linearLayout;
    }

    private static LinearLayout makeButtonRowNoCheck(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        Button button = new Button(context);
        button.setText("关闭");
        button.setOnClickListener(new Cnull());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.rightMargin = dp(context, 8.0f);
        button.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-856756498);
        gradientDrawable.setCornerRadius(dp(context, 12.0f));
        button.setBackground(gradientDrawable);
        button.setTextColor(-9079435);
        linearLayout.addView(button);
        Button button2 = new Button(context);
        button2.setText("加入我们");
        button2.setOnClickListener(new url(context));
        button2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(-856756498);
        gradientDrawable2.setCornerRadius(dp(context, 12.0f));
        button2.setBackground(gradientDrawable2);
        button2.setTextColor(-9079435);
        linearLayout.addView(button2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = dp(context, 16.0f);
        linearLayout.setLayoutParams(layoutParams2);
        return linearLayout;
    }

    private static CheckBox makeCheck(Context context) {
        CheckBox checkBox = new CheckBox(context);
        checkBox.setText("不再显示");
        checkBox.setTextSize(14.0f);
        checkBox.setTextColor(-6381922);
        checkBox.setChecked(false);
        checkBox.setButtonTintList(ColorStateList.valueOf(-14575885));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = dp(context, 16.0f);
        checkBox.setLayoutParams(layoutParams);
        return checkBox;
    }

    private static TextView makeMessage(Context context) {
        TextView textView = new TextView(context);
        textView.setText("加入我们获取更多免费资源.");
        textView.setTextSize(14.0f);
        textView.setTextColor(-6381922);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = dp(context, 8.0f);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    private static TextView makeTitle(Context context) {
        TextView textView = new TextView(context);
        textView.setText("白嫖分享社");
        textView.setTextSize(20.0f);
        textView.setTextColor(-12434878);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        return textView;
    }

    public static native void s(Context context);

    public static void v(Context context) {
    }
}
