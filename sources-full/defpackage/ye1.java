package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ye1 {
    public final ArrayList a;
    public final ib b;
    public final ArrayList c;
    public final ib d;

    public ye1(boolean z) {
        List listU = kr1.U(4293936506L, 4294930326L, 4293408099L, 4294938544L);
        ArrayList arrayList = new ArrayList(le0.q0(listU, 10));
        Iterator it = listU.iterator();
        while (it.hasNext()) {
            arrayList.add(b(48, new qp((int) ((Number) it.next()).longValue(), 2)));
        }
        this.a = arrayList;
        this.b = b(64, new z70(3, z));
        List listU2 = kr1.U(4294423497L, 4294559446L, 4294155195L);
        ArrayList arrayList2 = new ArrayList(le0.q0(listU2, 10));
        Iterator it2 = listU2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b(40, new qp((int) ((Number) it2.next()).longValue(), 3)));
        }
        this.c = arrayList2;
        this.d = b(40, new oj0(9));
    }

    public static final int a(int[] iArr, float f) {
        return Color.argb(gb2.R(f * 255.0f), iArr[0], iArr[1], iArr[2]);
    }

    public static ib b(int i, ne1 ne1Var) {
        int i2 = i * 2;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.scale(2.0f, 2.0f);
        ne1Var.invoke(canvas, Float.valueOf(i));
        return new ib(bitmapCreateBitmap);
    }
}
