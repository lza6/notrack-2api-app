package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.io.ByteArrayOutputStream;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public final class pq extends mq3 implements ne1 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ float d;
    public /* synthetic */ Object h;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq(float f, Bitmap bitmap, pq0 pq0Var, so0 so0Var) {
        super(2, so0Var);
        this.d = f;
        this.h = bitmap;
        this.l = pq0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq(n43 n43Var, float f, so0 so0Var) {
        super(2, so0Var);
        this.l = n43Var;
        this.d = f;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        float f = this.d;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                return new pq(f, (Bitmap) this.h, (pq0) obj2, so0Var);
            default:
                pq pqVar = new pq((n43) obj2, f, so0Var);
                pqVar.h = obj;
                return pqVar;
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                return ((pq) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            default:
                ((pq) create((pb3) obj, (so0) obj2)).invokeSuspend(w84Var);
                return w84Var;
        }
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        float f = this.d;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                g13.O(obj);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(ConstantsKt.MINIMUM_BLOCK_SIZE, ConstantsKt.MINIMUM_BLOCK_SIZE, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.getClass();
                qq.h(new Canvas(bitmapCreateBitmap), 512.0f, 512.0f / f, (Bitmap) this.h, (pq0) obj2);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 92, byteArrayOutputStream);
                    bitmapCreateBitmap.recycle();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        jr1.i(byteArrayOutputStream, th);
                        throw th2;
                    }
                }
            default:
                g13.O(obj);
                ((n43) obj2).c = ((pb3) this.h).a(f);
                return w84.a;
        }
    }
}
