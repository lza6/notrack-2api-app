package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class zc4 {
    public static WeakHashMap a;
    public static Field b;
    public static boolean c;
    public static final nc4 d = new nc4();
    public static final pc4 e = new pc4();

    public static pd4 a(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        pd4 pd4Var = (pd4) a.get(view);
        if (pd4Var != null) {
            return pd4Var;
        }
        pd4 pd4Var2 = new pd4(view);
        a.put(view, pd4Var2);
        return pd4Var2;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = yc4.d;
        yc4 yc4Var = (yc4) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (yc4Var == null) {
            yc4Var = new yc4();
            yc4Var.a = null;
            yc4Var.b = null;
            yc4Var.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, yc4Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = yc4Var.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = yc4.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (yc4Var.a == null) {
                            yc4Var.a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = yc4.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                yc4Var.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    yc4Var.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        View viewA = yc4Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (yc4Var.b == null) {
                    yc4Var.b = new SparseArray();
                }
                yc4Var.b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return vc4.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static String[] d(dj djVar) {
        return Build.VERSION.SDK_INT >= 31 ? xc4.a(djVar) : (String[]) djVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void e(View view, int i) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i2 = Build.VERSION.SDK_INT;
            Object objA = null;
            if (i2 >= 28) {
                tag = uc4.a(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    List<CharSequence> text = accessibilityEventObtain.getText();
                    if (i2 >= 28) {
                        objA = uc4.a(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            objA = tag2;
                        }
                    }
                    text.add((CharSequence) objA);
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            List<CharSequence> text2 = accessibilityEventObtain2.getText();
            if (i2 >= 28) {
                objA = uc4.a(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    objA = tag3;
                }
            }
            text2.add((CharSequence) objA);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static nn0 f(View view, nn0 nn0Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + nn0Var + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return xc4.b(view, nn0Var);
        }
        b04 b04Var = (b04) view.getTag(R.id.tag_on_receive_content_listener);
        po2 po2Var = d;
        if (b04Var == null) {
            if (view instanceof po2) {
                po2Var = (po2) view;
            }
            return po2Var.a(nn0Var);
        }
        nn0 nn0VarA = b04.a(view, nn0Var);
        if (nn0VarA == null) {
            return null;
        }
        if (view instanceof po2) {
            po2Var = (po2) view;
        }
        return po2Var.a(nn0VarA);
    }

    public static void g(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            vc4.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void h(View view, c1 c1Var) {
        if (c1Var == null && (c(view) instanceof b1)) {
            c1Var = new c1();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c1Var == null ? null : c1Var.getBridge());
    }

    public static void i(View view, CharSequence charSequence) {
        new oc4(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).f(view, charSequence);
        pc4 pc4Var = e;
        if (charSequence == null) {
            pc4Var.c.remove(view);
            view.removeOnAttachStateChangeListener(pc4Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(pc4Var);
        } else {
            pc4Var.c.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(pc4Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(pc4Var);
            }
        }
    }

    public static void j(View view, be0 be0Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(be0Var != null ? new fg4(be0Var) : null);
            return;
        }
        PathInterpolator pathInterpolator = dg4.d;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (be0Var == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener cg4Var = new cg4(view, be0Var);
        view.setTag(R.id.tag_window_insets_animation_callback, cg4Var);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(cg4Var);
        }
    }
}
