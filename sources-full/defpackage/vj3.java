package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class vj3 extends h63 implements ne1 {
    public Object d;
    public Iterator h;
    public int l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ Iterator r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj3(int i, int i2, Iterator it, so0 so0Var) {
        super(2, so0Var);
        this.p = i;
        this.q = i2;
        this.r = it;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        vj3 vj3Var = new vj3(this.p, this.q, this.r, so0Var);
        vj3Var.o = obj;
        return vj3Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return ((vj3) create((qf3) obj, (so0) obj2)).invokeSuspend(w84.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:48:0x0101  */
    /* JADX WARN: Code duplicated, block: B:51:0x0106  */
    /* JADX WARN: Code duplicated, block: B:52:0x010b  */
    /* JADX WARN: Code duplicated, block: B:62:0x013e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0153  */
    /* JADX WARN: Code duplicated, block: B:66:0x0159  */
    /* JADX WARN: Code duplicated, block: B:70:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0082 A[SYNTHETIC] */
    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        int i2;
        int i3;
        Iterator it;
        u63 u63Var;
        ArrayList arrayList;
        int i4;
        Iterator it2;
        int i5;
        Object next;
        int i6;
        Object[] objArr;
        int i7;
        u63 u63Var2;
        Object next2;
        boolean z;
        int i8;
        Object[] array;
        qf3 qf3Var = (qf3) this.o;
        int i9 = this.n;
        int i10 = this.q;
        boolean z2 = true;
        int i11 = this.p;
        hq0 hq0Var = hq0.c;
        if (i9 == 0) {
            g13.O(obj);
            int i12 = i11 <= 1024 ? i11 : 1024;
            i = i10 - i11;
            Iterator it3 = this.r;
            if (i >= 0) {
                arrayList = new ArrayList(i12);
                i4 = i12;
                it2 = it3;
                i5 = 0;
                while (it2.hasNext()) {
                    next = it2.next();
                    if (i5 > 0) {
                        i5--;
                    } else {
                        arrayList.add(next);
                        if (arrayList.size() == i11) {
                            this.o = qf3Var;
                            this.d = arrayList;
                            this.h = it2;
                            this.l = i4;
                            this.m = i;
                            this.n = 1;
                            qf3Var.b(this, arrayList);
                            return hq0Var;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.o = null;
                    this.d = null;
                    this.h = null;
                    this.l = i4;
                    this.m = i;
                    this.n = 2;
                    qf3Var.b(this, arrayList);
                    return hq0Var;
                }
            } else {
                u63 u63Var3 = new u63(0, new Object[i12]);
                i2 = i12;
                i3 = i;
                it = it3;
                u63Var = u63Var3;
                while (true) {
                    i6 = u63Var.d;
                    objArr = u63Var.c;
                    if (it.hasNext()) {
                        i7 = i2;
                        u63Var2 = u63Var;
                        break;
                    }
                    next2 = it.next();
                    z = z2;
                    if (u63Var.b() != i6) {
                        u41.r("ring buffer is full");
                        return null;
                    }
                    int i13 = u63Var.h;
                    int i14 = u63Var.l;
                    objArr[(i13 + i14) % i6] = next2;
                    u63Var.l = i14 + 1;
                    if (u63Var.b() != i6) {
                        if (u63Var.l < i11) {
                            ArrayList arrayList2 = new ArrayList(u63Var);
                            this.o = qf3Var;
                            this.d = u63Var;
                            this.h = it;
                            this.l = i2;
                            this.m = i3;
                            this.n = 3;
                            qf3Var.b(this, arrayList2);
                            return hq0Var;
                        }
                        i8 = i6 + (i6 >> 1) + 1;
                        if (i8 > i11) {
                            i8 = i11;
                        }
                        if (u63Var.h == 0) {
                            array = Arrays.copyOf(objArr, i8);
                        } else {
                            array = u63Var.toArray(new Object[i8]);
                        }
                        u63Var = new u63(u63Var.l, array);
                    }
                    z2 = z;
                }
                if (u63Var2.l > i10) {
                    ArrayList arrayList3 = new ArrayList(u63Var2);
                    this.o = qf3Var;
                    this.d = u63Var2;
                    this.h = null;
                    this.l = i7;
                    this.m = i3;
                    this.n = 4;
                    qf3Var.b(this, arrayList3);
                    return hq0Var;
                }
                if (!u63Var2.isEmpty()) {
                    this.o = null;
                    this.d = null;
                    this.h = null;
                    this.l = i7;
                    this.m = i3;
                    this.n = 5;
                    qf3Var.b(this, u63Var2);
                    return hq0Var;
                }
            }
        } else if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    i3 = this.m;
                    i2 = this.l;
                    it = this.h;
                    u63Var = (u63) this.d;
                    g13.O(obj);
                    u63Var.d(i10);
                    while (true) {
                        i6 = u63Var.d;
                        objArr = u63Var.c;
                        if (it.hasNext()) {
                            i7 = i2;
                            u63Var2 = u63Var;
                            break;
                        }
                        next2 = it.next();
                        z = z2;
                        if (u63Var.b() != i6) {
                            u41.r("ring buffer is full");
                            return null;
                        }
                        int i15 = u63Var.h;
                        int i16 = u63Var.l;
                        objArr[(i15 + i16) % i6] = next2;
                        u63Var.l = i16 + 1;
                        if (u63Var.b() != i6) {
                            if (u63Var.l < i11) {
                                ArrayList arrayList4 = new ArrayList(u63Var);
                                this.o = qf3Var;
                                this.d = u63Var;
                                this.h = it;
                                this.l = i2;
                                this.m = i3;
                                this.n = 3;
                                qf3Var.b(this, arrayList4);
                                return hq0Var;
                            }
                            i8 = i6 + (i6 >> 1) + 1;
                            if (i8 > i11) {
                                i8 = i11;
                            }
                            if (u63Var.h == 0) {
                                array = Arrays.copyOf(objArr, i8);
                            } else {
                                array = u63Var.toArray(new Object[i8]);
                            }
                            u63Var = new u63(u63Var.l, array);
                        }
                        z2 = z;
                    }
                } else if (i9 == 4) {
                    i3 = this.m;
                    i7 = this.l;
                    u63Var2 = (u63) this.d;
                    g13.O(obj);
                    u63Var2.d(i10);
                } else {
                    if (i9 != 5) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                if (u63Var2.l > i10) {
                    ArrayList arrayList5 = new ArrayList(u63Var2);
                    this.o = qf3Var;
                    this.d = u63Var2;
                    this.h = null;
                    this.l = i7;
                    this.m = i3;
                    this.n = 4;
                    qf3Var.b(this, arrayList5);
                    return hq0Var;
                }
                if (!u63Var2.isEmpty()) {
                    this.o = null;
                    this.d = null;
                    this.h = null;
                    this.l = i7;
                    this.m = i3;
                    this.n = 5;
                    qf3Var.b(this, u63Var2);
                    return hq0Var;
                }
            }
            g13.O(obj);
        } else {
            i5 = this.m;
            i4 = this.l;
            it2 = this.h;
            g13.O(obj);
            arrayList = new ArrayList(i11);
            i = i5;
            while (it2.hasNext()) {
                next = it2.next();
                if (i5 > 0) {
                    i5--;
                } else {
                    arrayList.add(next);
                    if (arrayList.size() == i11) {
                        this.o = qf3Var;
                        this.d = arrayList;
                        this.h = it2;
                        this.l = i4;
                        this.m = i;
                        this.n = 1;
                        qf3Var.b(this, arrayList);
                        return hq0Var;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.o = null;
                this.d = null;
                this.h = null;
                this.l = i4;
                this.m = i;
                this.n = 2;
                qf3Var.b(this, arrayList);
                return hq0Var;
            }
        }
        return w84.a;
    }
}
