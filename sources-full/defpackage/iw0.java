package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class iw0 {
    public final String a;
    public final long[] b = new long[2];
    public final ArrayList c = new ArrayList(2);
    public final ArrayList d = new ArrayList(2);
    public boolean e;
    public boolean f;
    public hw0 g;
    public int h;
    public final /* synthetic */ lw0 i;

    public iw0(lw0 lw0Var, String str) {
        this.i = lw0Var;
        this.a = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(this.i.c.e(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.i.c.e(sb.toString()));
            sb.setLength(length);
        }
    }

    public final jw0 a() {
        if (!this.e || this.g != null || this.f) {
            return null;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            lw0 lw0Var = this.i;
            if (i >= size) {
                this.h++;
                return new jw0(lw0Var, this);
            }
            if (!lw0Var.y.x((mt2) arrayList.get(i))) {
                try {
                    lw0Var.O(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i++;
        }
    }
}
