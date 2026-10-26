package defpackage;

import app.template.extension.BuildConfig;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class o22 extends m0 implements p22, RandomAccess {
    public final ArrayList d;

    static {
        new o22(10).c = false;
    }

    public o22(int i) {
        this(new ArrayList(i));
    }

    public o22(ArrayList arrayList) {
        this.d = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        b();
        this.d.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.m0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        b();
        if (collection instanceof p22) {
            collection = ((p22) collection).i();
        }
        boolean zAddAll = this.d.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // defpackage.m0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.d.size(), collection);
    }

    @Override // defpackage.p22
    public final void c(mz mzVar) {
        b();
        this.d.add(mzVar);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.m0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.d.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.yq1
    public final yq1 e(int i) {
        ArrayList arrayList = this.d;
        if (i < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new o22(arrayList2);
    }

    @Override // defpackage.p22
    public final p22 f() {
        return this.c ? new d94(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.d;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof mz)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, zq1.a);
            if (ha4.a.D(bArr, 0, bArr.length)) {
                arrayList.set(i, str2);
            }
            return str2;
        }
        mz mzVar = (mz) obj;
        Charset charset = zq1.a;
        if (mzVar.size() == 0) {
            str = BuildConfig.VERSION_NAME;
        } else {
            kz kzVar = (kz) mzVar;
            str = new String(kzVar.l, kzVar.l(), kzVar.size(), charset);
        }
        kz kzVar2 = (kz) mzVar;
        int iL = kzVar2.l();
        if (ha4.a.D(kzVar2.l, iL, kzVar2.size() + iL)) {
            arrayList.set(i, str);
        }
        return str;
    }

    @Override // defpackage.p22
    public final Object h(int i) {
        return this.d.get(i);
    }

    @Override // defpackage.p22
    public final List i() {
        return Collections.unmodifiableList(this.d);
    }

    @Override // defpackage.m0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        Object objRemove = this.d.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof mz)) {
            return new String((byte[]) objRemove, zq1.a);
        }
        mz mzVar = (mz) objRemove;
        Charset charset = zq1.a;
        if (mzVar.size() == 0) {
            return BuildConfig.VERSION_NAME;
        }
        kz kzVar = (kz) mzVar;
        return new String(kzVar.l, kzVar.l(), kzVar.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b();
        Object obj2 = this.d.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof mz)) {
            return new String((byte[]) obj2, zq1.a);
        }
        mz mzVar = (mz) obj2;
        Charset charset = zq1.a;
        if (mzVar.size() == 0) {
            return BuildConfig.VERSION_NAME;
        }
        kz kzVar = (kz) mzVar;
        return new String(kzVar.l, kzVar.l(), kzVar.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d.size();
    }
}
