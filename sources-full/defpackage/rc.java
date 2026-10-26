package defpackage;

import android.graphics.Typeface;
import android.view.KeyEvent;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class rc extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rc(Object obj, int i, Object obj2) {
        super(1);
        this.c = i;
        this.d = obj;
        this.h = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f2  */
    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        k74 k74Var;
        Typeface typefaceH;
        boolean z = true;
        int i = 0;
        switch (this.c) {
            case 0:
                rx2 rx2Var = (rx2) this.d;
                rx2Var.setPositionProvider((tx2) this.h);
                rx2Var.g();
                return new qc(0);
            case 1:
                ((ux1) this.d).Y(((c) obj).then((c) this.h));
                return w84.a;
            case 2:
                InspectorInfo inspectorInfo = (InspectorInfo) obj;
                inspectorInfo.setName("animateEnterExit");
                inspectorInfo.getProperties().set("enter", (l41) this.d);
                inspectorInfo.getProperties().set("exit", (y51) this.h);
                inspectorInfo.getProperties().set("label", "animateEnterExit");
                return w84.a;
            case 3:
                return ((f2) this.d).invoke(((ArrayList) this.h).get(((Number) obj).intValue()));
            case 4:
                InspectorInfo inspectorInfo2 = (InspectorInfo) obj;
                inspectorInfo2.setName("background");
                inspectorInfo2.getProperties().set("alpha", Float.valueOf(1.0f));
                inspectorInfo2.getProperties().set("brush", (ng3) this.d);
                inspectorInfo2.getProperties().set("shape", (rg3) this.h);
                return w84.a;
            case 5:
                ey3 ey3Var = (ey3) obj;
                if (!kr1.n((ey3) this.d, ey3Var)) {
                    ((le1) this.h).invoke(ey3Var);
                }
                return w84.a;
            case 6:
                mv2.i((mv2) obj, (nv2) this.d, 0, 0, ((mv) this.h).c, 4);
                return w84.a;
            case 7:
                wx1 wx1Var = (wx1) obj;
                wx1Var.a();
                tz0.h(wx1Var, ((oq2) this.d).a, (yx) this.h, 0.0f, null, 60);
                return w84.a;
            case 8:
                wx1 wx1Var2 = (wx1) obj;
                wx1Var2.a();
                tz0.h(wx1Var2, (ic) this.d, (yx) this.h, 0.0f, null, 60);
                return w84.a;
            case 9:
                ((jx) this.d).a.l((in0) this.h);
                return w84.a;
            case 10:
                wx wxVar = (wx) this.d;
                Object obj2 = wxVar.d;
                vx vxVar = (vx) this.h;
                synchronized (obj2) {
                    wxVar.l.remove(vxVar);
                    if (wxVar.l.isEmpty()) {
                        wxVar.n.set(0);
                    }
                    break;
                }
                return w84.a;
            case 11:
                return ((f2) this.d).invoke(((ArrayList) this.h).get(((Number) obj).intValue()));
            case 12:
                return ((f2) this.d).invoke(((List) this.h).get(((Number) obj).intValue()));
            case 13:
                InspectorInfo inspectorInfo3 = (InspectorInfo) obj;
                inspectorInfo3.setName("combinedClickable");
                ValueElementSequence properties = inspectorInfo3.getProperties();
                Boolean bool = Boolean.TRUE;
                properties.set("enabled", bool);
                inspectorInfo3.getProperties().set("onClickLabel", null);
                inspectorInfo3.getProperties().set("role", null);
                inspectorInfo3.getProperties().set("onClick", (je1) this.d);
                inspectorInfo3.getProperties().set("onDoubleClick", null);
                inspectorInfo3.getProperties().set("onLongClick", (je1) this.h);
                inspectorInfo3.getProperties().set("onLongClickLabel", null);
                inspectorInfo3.getProperties().set("hapticFeedbackEnabled", bool);
                return w84.a;
            case 14:
                long j = ((ln2) obj).a;
                ((je1) this.d).invoke();
                ((ho0) this.h).a.setValue(new fo0(j));
                return w84.a;
            case 15:
                KeyEvent keyEvent = ((yu1) obj).a;
                if (((z22) this.d).a() == ch1.d && keyEvent.getKeyCode() == 4 && av1.A(keyEvent) == 1) {
                    ((xw3) this.h).e(null);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 16:
                if (((Boolean) ((pj2) this.d).invoke((wx0) obj)).booleanValue()) {
                    return (vu3) this.h;
                }
                return null;
            case 17:
                a9 a9Var = (a9) this.d;
                mz0 mz0Var = (mz0) this.h;
                long j2 = ((cy0) obj).a;
                long j3 = mz0Var.x ? ln2.j(-1.0f, j2) : ln2.j(1.0f, j2);
                nq2 nq2Var = mz0Var.t;
                iz0 iz0Var = kz0.a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (nq2Var == nq2.c ? 4294967295L & j3 : j3 >> 32));
                switch (a9Var.a) {
                    case 0:
                        ji4 ji4Var = (ji4) a9Var.b;
                        y8 y8Var = (y8) ji4Var.n;
                        float fO = ji4Var.o(fIntBitsToFloat);
                        ji4 ji4Var2 = y8Var.a;
                        ((bt2) ji4Var2.j).h(fO);
                        ((bt2) ji4Var2.k).h(0.0f);
                        break;
                    case 1:
                        ((ps0) a9Var.b).a.invoke(Float.valueOf(fIntBitsToFloat));
                        break;
                    default:
                        ((uj3) a9Var.b).b(fIntBitsToFloat);
                        break;
                }
                return w84.a;
            case 18:
                ((hh2) ((gh2) this.d)).b((tq1) this.h);
                return w84.a;
            case 19:
                mb1 mb1Var = (mb1) this.d;
                pb1 pb1Var = mb1Var.d;
                j74 j74Var = (j74) this.h;
                pb1Var.getClass();
                lb1 lb1Var = j74Var.a;
                lw2 lw2Var = (lw2) mb1Var.e.c;
                int i2 = j74Var.c;
                ic1 ic1Var = j74Var.b;
                if (lb1Var != null ? lb1Var instanceof ws0 : true) {
                    typefaceH = lw2Var.f(ic1Var, i2);
                } else {
                    if (!(lb1Var instanceof hf1)) {
                        if (lb1Var instanceof x62) {
                            typefaceH = (Typeface) ((x62) lb1Var).f.d;
                        } else {
                            k74Var = null;
                        }
                        if (k74Var != null) {
                            return k74Var;
                        }
                        u41.r("Could not load font");
                        return null;
                    }
                    typefaceH = lw2Var.h((hf1) lb1Var, ic1Var, i2);
                }
                k74Var = new k74(typefaceH);
                if (k74Var != null) {
                    return k74Var;
                }
                u41.r("Could not load font");
                return null;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                tz0 tz0Var = (tz0) obj;
                ms2 ms2Var = (ms2) this.d;
                xe0 xe0Var = (xe0) this.h;
                ms2Var.g(tz0Var, tz0Var.b(), 1.0f, xe0Var != null ? new jv(xe0Var.a(), 5) : null);
                return w84.a;
            case 21:
                InspectorInfo inspectorInfo4 = (InspectorInfo) obj;
                inspectorInfo4.setName("indication");
                inspectorInfo4.getProperties().set("interactionSource", (uq1) this.d);
                inspectorInfo4.getProperties().set("indication", (vn1) this.h);
                return w84.a;
            case 22:
                go1 go1Var = (go1) this.d;
                eo1 eo1Var = (eo1) this.h;
                go1Var.a.c(eo1Var);
                go1Var.b.setValue(Boolean.TRUE);
                return new ho1(go1Var, i, eo1Var);
            case 23:
                hw0 hw0Var = (hw0) this.d;
                Object obj3 = hw0Var.c;
                t00 t00Var = (t00) this.h;
                synchronized (obj3) {
                    ((ArrayList) hw0Var.a).remove(t00Var);
                }
                return w84.a;
            case 24:
                kc1 kc1VarO = ((tz1) this.d).o(((Number) obj).intValue());
                int i3 = kc1VarO.a;
                List list = kc1VarO.b;
                ArrayList arrayList = new ArrayList(list.size());
                ez1 ez1Var = (ez1) this.h;
                int size = list.size();
                int i4 = 0;
                while (i < size) {
                    int i5 = (int) ((sg1) list.get(i)).a;
                    arrayList.add(new ps2(Integer.valueOf(i3), new um0(ez1Var.a(i4, i5))));
                    i3++;
                    i4 += i5;
                    i++;
                }
                return arrayList;
            case 25:
                int iIntValue = ((Number) obj).intValue();
                ez1 ez1Var2 = (ez1) this.d;
                tz1 tz1Var = ez1Var2.f;
                int i6 = tz1Var.b;
                int iW = tz1Var.w(iIntValue);
                long jA = ez1Var2.a(0, iW);
                dz1 dz1Var = (dz1) this.h;
                return dz1Var.a(iIntValue, jA, 0, iW, dz1Var.c);
            case 26:
                return new i22((g93) this.d, (Map) obj, (b93) this.h);
            case 27:
                i22 i22Var = (i22) this.d;
                gi2 gi2Var = i22Var.c;
                Object obj4 = this.h;
                gi2Var.i(obj4);
                return new ho1(i22Var, z ? 1 : 0, obj4);
            case 28:
                mv2 mv2Var = (mv2) obj;
                ArrayList arrayListB = gt.b((List) this.d, (je1) ((x42) this.h).b);
                if (arrayListB != null) {
                    int size2 = arrayListB.size();
                    while (i < size2) {
                        ps2 ps2Var = (ps2) arrayListB.get(i);
                        nv2 nv2Var = (nv2) ps2Var.c;
                        je1 je1Var = (je1) ps2Var.d;
                        mv2.e(mv2Var, nv2Var, je1Var != null ? ((iq1) je1Var.invoke()).a : 0L);
                        i++;
                    }
                }
                return w84.a;
            default:
                n63 n63Var = (n63) obj;
                float f = ((bt2) ((hh3) this.d).c.j).f();
                float fB = bi3.b(n63Var.v);
                if (!Float.isNaN(f) && !Float.isNaN(fB) && fB != 0.0f) {
                    float fFloatValue = ((Number) ((ue) this.h).d()).floatValue();
                    n63Var.g(hf2.b(n63Var, fFloatValue));
                    n63Var.i(hf2.c(n63Var, fFloatValue));
                    n63Var.o(av1.b(0.5f, (f + fB) / fB));
                }
                return w84.a;
        }
    }
}
