package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class fv implements t61 {
    public final /* synthetic */ int a;
    public final jq2 b;
    public final Object c;

    public /* synthetic */ fv(Object obj, jq2 jq2Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = jq2Var;
    }

    @Override // defpackage.t61
    public final Object a(so0 so0Var) {
        int i = this.a;
        qr0 qr0Var = qr0.d;
        Object obj = this.c;
        jq2 jq2Var = this.b;
        switch (i) {
            case 0:
                return new dm1(vl0.u(new BitmapDrawable(jq2Var.a.getResources(), (Bitmap) obj)), false, qr0Var);
            case 1:
                dy dyVar = new dy();
                byte[] bArr = (byte[]) obj;
                bArr.getClass();
                dyVar.S(bArr.length, bArr);
                return new xl3(py.f(dyVar, jq2Var.f), null, qr0Var);
            case 2:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return new xl3(new yl3(new u23(new ez(byteBuffer)), jq2Var.f, new fz(byteBuffer)), null, qr0Var);
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = ta4.a;
                boolean z = bitmapDrawable instanceof VectorDrawable;
                if (z) {
                    bitmapDrawable = new BitmapDrawable(jq2Var.a.getResources(), av1.j(bitmapDrawable, sm1.a(jq2Var), jq2Var.b, jq2Var.c, jq2Var.d == wx2.d));
                }
                return new dm1(vl0.u(bitmapDrawable), z, qr0Var);
        }
    }
}
