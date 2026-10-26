package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fg implements Appendable {
    public final StringBuilder c;
    public final ArrayList d;
    public final ArrayList h;

    public fg() {
        this.c = new StringBuilder(16);
        this.d = new ArrayList();
        this.h = new ArrayList();
        new ArrayList();
    }

    public fg(hg hgVar) {
        this();
        a(hgVar);
    }

    public final void a(hg hgVar) {
        StringBuilder sb = this.c;
        int length = sb.length();
        sb.append(hgVar.d);
        List list = hgVar.c;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                gg ggVar = (gg) list.get(i);
                this.h.add(new eg(ggVar.b + length, ggVar.c + length, ggVar.a, ggVar.d));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.c.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof hg) {
            a((hg) charSequence);
            return this;
        }
        this.c.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof hg;
        StringBuilder sb = this.c;
        if (!z) {
            sb.append(charSequence, i, i2);
            return this;
        }
        hg hgVar = (hg) charSequence;
        int length = sb.length();
        sb.append((CharSequence) hgVar.d, i, i2);
        List listA = ig.a(hgVar, i, i2, null);
        if (listA != null) {
            int size = listA.size();
            for (int i3 = 0; i3 < size; i3++) {
                gg ggVar = (gg) listA.get(i3);
                this.h.add(new eg(ggVar.b + length, ggVar.c + length, ggVar.a, ggVar.d));
            }
        }
        return this;
    }

    public final void b(int i) {
        ArrayList arrayList = this.d;
        if (i >= arrayList.size()) {
            qo1.b(i + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i) {
            if (arrayList.isEmpty()) {
                qo1.b("Nothing to pop.");
            }
            ((eg) arrayList.remove(arrayList.size() - 1)).c = this.c.length();
        }
    }

    public final int c(em3 em3Var) {
        eg egVar = new eg(em3Var, this.c.length(), 0, 12);
        ArrayList arrayList = this.d;
        arrayList.add(egVar);
        this.h.add(egVar);
        return arrayList.size() - 1;
    }

    public final hg d() {
        StringBuilder sb = this.c;
        String string = sb.toString();
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((eg) arrayList.get(i)).a(sb.length()));
        }
        return new hg(string, arrayList2);
    }
}
