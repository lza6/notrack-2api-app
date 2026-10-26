package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class vb1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vb1(String str, Context context, Object obj, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = context;
        this.e = obj;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        int i2 = this.d;
        Object obj = this.e;
        Context context = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                Object[] objArr = {(sb1) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return yb1.b(str, context, Collections.unmodifiableList(arrayList), i2);
            default:
                try {
                    return yb1.b(str, context, (List) obj, i2);
                } catch (Throwable unused) {
                    return new xb1(-3);
                }
        }
    }
}
