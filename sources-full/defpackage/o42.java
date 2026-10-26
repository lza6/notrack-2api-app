package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o42 {
    public StringBuilder d;
    public String e;
    public String f;
    public char g;
    public StringBuilder h;
    public int a = 1;
    public final StringBuilder b = new StringBuilder();
    public final ArrayList c = new ArrayList();
    public boolean i = false;

    public final void a() {
        if (this.i) {
            String strA = t41.a(this.f);
            StringBuilder sb = this.h;
            String strA2 = sb != null ? t41.a(sb.toString()) : null;
            String str = this.e;
            n42 n42Var = new n42();
            n42Var.g = str;
            n42Var.h = strA;
            n42Var.i = strA2;
            this.c.add(n42Var);
            this.d = null;
            this.i = false;
            this.e = null;
            this.f = null;
            this.h = null;
        }
    }
}
