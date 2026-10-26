package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.platform.AndroidClipboardManager_androidKt;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class sb3 implements bp1, bl3, x93, wp0, ld0 {
    public static sb3 d;
    public final /* synthetic */ int c;

    public /* synthetic */ sb3(int i) {
        this.c = i;
    }

    public sb3(pn3 pn3Var) {
        this.c = 2;
    }

    @Override // defpackage.ld0
    public long a() {
        return System.currentTimeMillis();
    }

    public boolean b(CharSequence charSequence) {
        return false;
    }

    @Override // defpackage.bp1
    public boolean c(sz0 sz0Var, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                ((dp1) sz0Var.c).e();
                Object objB = ((dp1) sz0Var.c).b();
                objB.getClass();
                Parcelable parcelable = (Parcelable) objB;
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                e.toString();
                return false;
            }
        }
        ClipDescription clipDescriptionA = ((dp1) sz0Var.c).a();
        dp1 dp1Var = (dp1) sz0Var.c;
        AndroidClipboardManager_androidKt.toClipEntry(new ClipData(clipDescriptionA, new ClipData.Item(dp1Var.c())));
        AndroidClipboardManager_androidKt.toClipMetadata(dp1Var.a());
        dp1Var.f();
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0043 A[RETURN] */
    @Override // defpackage.bl3
    public boolean e(Object obj, Object obj2) {
        zv3 zv3Var = (zv3) obj;
        zv3 zv3Var2 = (zv3) obj2;
        if (zv3Var == null || zv3Var2 == null) {
            if ((zv3Var == null) ^ (zv3Var2 == null)) {
                return false;
            }
            return true;
        }
        if (zv3Var.e == zv3Var2.e && zv3Var.f == zv3Var2.f && zv3Var.b == zv3Var2.b && kr1.n(zv3Var.c, zv3Var2.c) && um0.b(zv3Var.d, zv3Var2.d)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.x93
    public Object j(Object obj) {
        zf3 zf3Var;
        List list = (List) obj;
        int iIntValue = ((Number) list.get(0)).intValue();
        int iIntValue2 = ((Number) list.get(1)).intValue();
        int iIntValue3 = ((Number) list.get(2)).intValue();
        c52 c52VarA = kr1.A();
        int i = 3;
        while (true) {
            int i2 = iIntValue2 + 3;
            zf3Var = xz3.i;
            if (i >= i2) {
                break;
            }
            c52VarA.add(zf3Var.j(list.get(i)));
            i++;
        }
        c52 c52VarQ = kr1.q(c52VarA);
        c52 c52VarA2 = kr1.A();
        while (i < iIntValue2 + iIntValue3 + 3) {
            c52VarA2.add(zf3Var.j(list.get(i)));
            i++;
        }
        return new p84(c52VarQ, kr1.q(c52VarA2), iIntValue);
    }

    @Override // defpackage.x93
    public Object n(a93 a93Var, Object obj) {
        zf3 zf3Var;
        p84 p84Var = (p84) obj;
        c52 c52VarA = kr1.A();
        c52VarA.add(Integer.valueOf(p84Var.a));
        ml3 ml3Var = p84Var.b;
        c52VarA.add(Integer.valueOf(ml3Var.size()));
        ml3 ml3Var2 = p84Var.c;
        c52VarA.add(Integer.valueOf(ml3Var2.size()));
        int size = ml3Var.size();
        int i = 0;
        while (true) {
            zf3Var = xz3.i;
            if (i >= size) {
                break;
            }
            c52VarA.add(zf3Var.n(a93Var, ml3Var.get(i)));
            i++;
        }
        int size2 = ml3Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            c52VarA.add(zf3Var.n(a93Var, ml3Var2.get(i2)));
        }
        return kr1.q(c52VarA);
    }

    public String toString() {
        switch (this.c) {
            case 1:
                return "SharingStarted.Eagerly";
            case 2:
            default:
                return super.toString();
            case 3:
                return "ReusedSlotId";
        }
    }
}
