package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class mj {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        kn0 jbVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                jbVar = new jb(clipData, 3);
            } else {
                ln0 ln0Var = new ln0();
                ln0Var.d = clipData;
                ln0Var.h = 3;
                jbVar = ln0Var;
            }
            zc4.f(textView, jbVar.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        kn0 jbVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            jbVar = new jb(clipData, 3);
        } else {
            ln0 ln0Var = new ln0();
            ln0Var.d = clipData;
            ln0Var.h = 3;
            jbVar = ln0Var;
        }
        zc4.f(view, jbVar.build());
        return true;
    }
}
