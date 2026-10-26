package defpackage;

import ai.notrack.app.R;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.InspectorInfo;

/* JADX INFO: loaded from: classes.dex */
public final class lb4 extends ww1 implements le1 {
    public static final lb4 d;
    public static final lb4 h;
    public static final lb4 l;
    public static final lb4 m;
    public static final lb4 n;
    public static final lb4 o;
    public static final lb4 p;
    public static final lb4 q;
    public static final lb4 r;
    public static final lb4 s;
    public static final lb4 t;
    public static final lb4 u;
    public static final lb4 v;
    public static final lb4 w;
    public static final lb4 x;
    public final /* synthetic */ int c;

    static {
        int i = 1;
        d = new lb4(i, 0);
        h = new lb4(i, 1);
        l = new lb4(i, 2);
        m = new lb4(i, 3);
        n = new lb4(i, 4);
        o = new lb4(i, 5);
        p = new lb4(i, 6);
        q = new lb4(i, 7);
        r = new lb4(i, 8);
        s = new lb4(i, 9);
        t = new lb4(i, 10);
        u = new lb4(i, 11);
        v = new lb4(i, 12);
        w = new lb4(i, 13);
        x = new lb4(i, 14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lb4(int i, int i2) {
        super(i);
        this.c = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb4(q43 q43Var) {
        super(1);
        this.c = 22;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                long j = ((ln2) obj).a;
                return new zf(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            case 1:
                zf zfVar = (zf) obj;
                float f = zfVar.a;
                return new ln2((((long) Float.floatToRawIntBits(zfVar.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            case 2:
                h43 h43Var = (h43) obj;
                return new bg(h43Var.a, h43Var.b, h43Var.c, h43Var.d);
            case 3:
                bg bgVar = (bg) obj;
                return new h43(bgVar.a, bgVar.b, bgVar.c, bgVar.d);
            case 4:
                long j2 = ((bi3) obj).a;
                return new zf(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            case 5:
                zf zfVar2 = (zf) obj;
                float f2 = zfVar2.a;
                return new bi3((((long) Float.floatToRawIntBits(zfVar2.b)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
            case 6:
                View view = (View) obj;
                view.getClass();
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 7:
                View view2 = (View) obj;
                view2.getClass();
                Object tag = view2.getTag(R.id.view_tree_lifecycle_owner);
                if (tag instanceof n32) {
                    return (n32) tag;
                }
                return null;
            case 8:
                View view3 = (View) obj;
                view3.getClass();
                Object parent2 = view3.getParent();
                if (parent2 instanceof View) {
                    return (View) parent2;
                }
                return null;
            case 9:
                View view4 = (View) obj;
                view4.getClass();
                Object tag2 = view4.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                if (tag2 instanceof ho2) {
                    return (ho2) tag2;
                }
                return null;
            case 10:
                View view5 = (View) obj;
                view5.getClass();
                Object parent3 = view5.getParent();
                if (parent3 instanceof View) {
                    return (View) parent3;
                }
                return null;
            case 11:
                View view6 = (View) obj;
                view6.getClass();
                Object tag3 = view6.getTag(R.id.view_tree_saved_state_registry_owner);
                if (tag3 instanceof u93) {
                    return (u93) tag3;
                }
                return null;
            case 12:
                View view7 = (View) obj;
                view7.getClass();
                Object parent4 = view7.getParent();
                if (parent4 instanceof View) {
                    return (View) parent4;
                }
                return null;
            case 13:
                View view8 = (View) obj;
                view8.getClass();
                Object tag4 = view8.getTag(R.id.view_tree_view_model_store_owner);
                if (tag4 instanceof nd4) {
                    return (nd4) tag4;
                }
                return null;
            case 14:
                fm0 fm0Var = (fm0) obj;
                fm0Var.getClass();
                return fm0Var.getClass().getSimpleName();
            case 15:
                InspectorInfo inspectorInfo = (InspectorInfo) obj;
                inspectorInfo.setName("aspectRatio");
                inspectorInfo.getProperties().set("ratio", Float.valueOf(1.0f));
                inspectorInfo.getProperties().set("matchHeightConstraintsFirst", Boolean.FALSE);
                return w84Var;
            case 16:
                ((InspectorInfo) obj).setName("matchParentSize");
                return w84Var;
            case 17:
                return new qq1((((long) ((int) (((qq1) obj).a & 4294967295L))) & 4294967295L) | (((long) 0) << 32));
            case 18:
                return new qq1((((long) ((int) (((qq1) obj).a >> 32))) << 32) | (((long) 0) & 4294967295L));
            case 19:
                return new qq1((((long) ((int) (((qq1) obj).a & 4294967295L))) & 4294967295L) | (((long) 0) << 32));
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                return new qq1((((long) ((int) (((qq1) obj).a >> 32))) << 32) | (((long) 0) & 4294967295L));
            case 21:
                return Boolean.valueOf(((db1) obj).z0(7));
            case 22:
                ((wi1) obj).getClass();
                return Boolean.TRUE;
            case 23:
                InspectorInfo inspectorInfo2 = (InspectorInfo) obj;
                inspectorInfo2.setName("width");
                inspectorInfo2.getProperties().set("intrinsicSize", gr1.d);
                return w84Var;
            case 24:
                ((Number) obj).intValue();
                return null;
            case 25:
                InspectorInfo inspectorInfo3 = (InspectorInfo) obj;
                inspectorInfo3.setName("requiredSize");
                inspectorInfo3.setValue(new rx0(20.0f));
                return w84Var;
            case 26:
                InspectorInfo inspectorInfo4 = (InspectorInfo) obj;
                inspectorInfo4.setName("requiredSize");
                fq2.l(52.0f, inspectorInfo4.getProperties(), "width", inspectorInfo4).set("height", new rx0(32.0f));
                return w84Var;
            case 27:
                ((InspectorInfo) obj).setName("imePadding");
                return w84Var;
            case 28:
                ((InspectorInfo) obj).setName("navigationBarsPadding");
                return w84Var;
            default:
                ((InspectorInfo) obj).setName("statusBarsPadding");
                return w84Var;
        }
    }
}
