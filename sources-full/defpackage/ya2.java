package defpackage;

import app.template.extension.BuildConfig;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class ya2 extends d0 {
    public final /* synthetic */ int c;
    public final Object d;

    public /* synthetic */ ya2(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.t
    public final int b() {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                return ((za2) obj).a.groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // defpackage.t, java.util.Collection, java.util.Set
    public /* bridge */ boolean contains(Object obj) {
        switch (this.c) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.c;
        Object obj = this.d;
        switch (i2) {
            case 0:
                String strGroup = ((za2) obj).a.group(i);
                return strGroup == null ? BuildConfig.VERSION_NAME : strGroup;
            default:
                List list = (List) obj;
                if (i >= 0 && i <= size() - 1) {
                    return list.get((size() - 1) - i);
                }
                StringBuilder sbS = ud2.s("Element index ", " must be in range [", i);
                sbS.append(new lq1(0, size() - 1, 1));
                sbS.append("].");
                throw new IndexOutOfBoundsException(sbS.toString());
        }
    }

    @Override // defpackage.d0, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.c) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // defpackage.d0, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.c) {
            case 1:
                return new o63(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // defpackage.d0, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.c) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // defpackage.d0, java.util.List
    public ListIterator listIterator() {
        switch (this.c) {
            case 1:
                return new o63(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // defpackage.d0, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.c) {
            case 1:
                return new o63(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
