package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class zl implements s61 {
    public final /* synthetic */ int a;

    public /* synthetic */ zl(int i) {
        this.a = i;
    }

    @Override // defpackage.s61
    public final t61 a(Object obj, jq2 jq2Var, g33 g33Var) {
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        int i4 = 3;
        switch (this.a) {
            case 0:
                da4 da4Var = (da4) obj;
                Bitmap.Config[] configArr = ta4.a;
                if (kr1.n(da4Var.c, "file") && kr1.n(ke0.z0(jr1.v(da4Var)), "android_asset")) {
                    return new am(da4Var, jq2Var, i);
                }
                return null;
            case 1:
                return new fv((Bitmap) obj, jq2Var, i);
            case 2:
                return new fv((byte[]) obj, jq2Var, i2);
            case 3:
                return new fv((ByteBuffer) obj, jq2Var, i3);
            case 4:
                da4 da4Var2 = (da4) obj;
                if (kr1.n(da4Var2.c, "content")) {
                    return new am(da4Var2, jq2Var, i2);
                }
                return null;
            case 5:
                da4 da4Var3 = (da4) obj;
                if (kr1.n(da4Var3.c, "data")) {
                    return new am(da4Var3, jq2Var, i3);
                }
                return null;
            case 6:
                return new fv((Drawable) obj, jq2Var, i4);
            case 7:
                da4 da4Var4 = (da4) obj;
                String str = da4Var4.c;
                if ((str != null && !str.equals("file")) || da4Var4.e == null) {
                    return null;
                }
                Bitmap.Config[] configArr2 = ta4.a;
                if (kr1.n(da4Var4.c, "file") && kr1.n(ke0.z0(jr1.v(da4Var4)), "android_asset")) {
                    return null;
                }
                return new am(da4Var4, jq2Var, i4);
            case 8:
                da4 da4Var5 = (da4) obj;
                if (kr1.n(da4Var5.c, "jar:file")) {
                    return new am(da4Var5, jq2Var, 4);
                }
                return null;
            default:
                da4 da4Var6 = (da4) obj;
                if (kr1.n(da4Var6.c, "android.resource")) {
                    return new am(da4Var6, jq2Var, 5);
                }
                return null;
        }
    }
}
