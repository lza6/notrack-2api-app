package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class g33 implements im1 {
    public static final /* synthetic */ int f = 0;
    public final d33 a;
    public final qo0 b = yo4.a(y64.I(py.g(), new ob1(bg1.m, 1)));
    public final bi4 c;
    public final vg0 d;
    public volatile /* synthetic */ int e;

    static {
        AtomicIntegerFieldUpdater.newUpdater(g33.class, "e");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a4 A[LOOP:0: B:16:0x009c->B:18:0x00a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x00cc A[LOOP:1: B:20:0x00c6->B:22:0x00cc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:28:0x0105  */
    /* JADX WARN: Code duplicated, block: B:31:0x0199  */
    /* JADX WARN: Code duplicated, block: B:34:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:36:0x01be  */
    /* JADX WARN: Code duplicated, block: B:39:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:41:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:44:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:48:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b3 A[EDGE_INSN: B:51:0x00b3->B:19:0x00b3 BREAK  A[LOOP:0: B:16:0x009c->B:18:0x00a4], SYNTHETIC] */
    public g33(d33 d33Var) {
        Object kn1Var;
        ArrayList arrayList;
        Iterator it;
        int i;
        ArrayList arrayList2;
        Iterator it2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        nm1 nm1Var;
        Object obj;
        kf3 kf3Var;
        int i2;
        Object obj2;
        Object obj3;
        Object obj4;
        this.a = d33Var;
        int i3 = 1;
        sd sdVar = new sd();
        sdVar.b = new WeakReference(this);
        sdVar.c = new qd(sdVar, this);
        sdVar.d = new rd(sdVar);
        bi4 bi4Var = new bi4();
        bi4Var.c = this;
        int i4 = Build.VERSION.SDK_INT;
        int i5 = 0;
        if (i4 >= 26) {
            if (!oh1.a) {
                kn1Var = (i4 == 26 || i4 == 27) ? new rn0(16) : new kn1(true);
            }
            bi4Var.d = kn1Var;
            this.c = bi4Var;
            vg0 vg0Var = d33Var.f;
            vu vuVar = new vu();
            vuVar.c = ke0.P0(vg0Var.a);
            vuVar.d = ke0.P0(vg0Var.b);
            vuVar.h = ke0.P0(vg0Var.c);
            List list = (List) vg0Var.f.getValue();
            arrayList = new ArrayList();
            it = list.iterator();
            while (true) {
                i = 9;
                if (it.hasNext()) {
                    break;
                } else {
                    arrayList.add(new wl(i, (ps2) it.next()));
                }
            }
            vuVar.l = arrayList;
            List list2 = (List) vg0Var.g.getValue();
            arrayList2 = new ArrayList();
            it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new ug0((gs0) it2.next(), i3));
            }
            vuVar.m = arrayList2;
            ArrayList arrayList5 = (ArrayList) vuVar.c;
            arrayList3 = (ArrayList) vuVar.l;
            ArrayList arrayList6 = (ArrayList) vuVar.h;
            arrayList4 = (ArrayList) vuVar.m;
            nm1Var = d33Var.b;
            obj = nm1Var.n.a.get(sf3.b);
            if (((Boolean) (obj == null ? Boolean.TRUE : obj)).booleanValue()) {
                arrayList3.add(new b72(12));
                arrayList4.add(new b72(13));
            }
            vuVar.d(new ce(i5), r43.a(Uri.class));
            vuVar.d(new ce(3), r43.a(Integer.class));
            arrayList6.add(new ps2(new bd(0), r43.a(da4.class)));
            vuVar.e(new zl(i5), r43.a(da4.class));
            vuVar.e(new zl(4), r43.a(da4.class));
            vuVar.e(new zl(i), r43.a(da4.class));
            vuVar.e(new zl(6), r43.a(Drawable.class));
            vuVar.e(new zl(i3), r43.a(Bitmap.class));
            f61 f61Var = jm1.a;
            Object obj5 = nm1Var.n.a.get(jm1.a);
            int iIntValue = ((Number) (obj5 == null ? 4 : obj5)).intValue();
            int i6 = lf3.a;
            kf3Var = new kf3(iIntValue);
            i2 = Build.VERSION.SDK_INT;
            obj2 = v51.a;
            if (i2 >= 29) {
                obj3 = nm1Var.n.a.get(jm1.c);
                if (((Boolean) (obj3 == null ? Boolean.TRUE : obj3)).booleanValue()) {
                    obj4 = nm1Var.n.a.get(jm1.b);
                    if (((v51) (obj4 == null ? obj2 : obj4)).equals(obj2)) {
                        arrayList4.add(new ug0(new rn3(kf3Var), i5));
                    }
                }
            }
            Object obj6 = nm1Var.n.a.get(jm1.b);
            arrayList4.add(new ug0(new cv(kf3Var, (v51) (obj6 != null ? obj6 : obj2)), i5));
            vuVar.d(new ce(i3), r43.a(File.class));
            vuVar.e(new zl(8), r43.a(da4.class));
            vuVar.e(new zl(3), r43.a(ByteBuffer.class));
            vuVar.d(new ce(4), r43.a(String.class));
            int i7 = 2;
            vuVar.d(new ce(i7), r43.a(mt2.class));
            arrayList6.add(new ps2(new bd(1), r43.a(da4.class)));
            arrayList6.add(new ps2(new bd(2), r43.a(da4.class)));
            vuVar.e(new zl(7), r43.a(da4.class));
            vuVar.e(new zl(i7), r43.a(byte[].class));
            vuVar.e(new zl(5), r43.a(da4.class));
            arrayList5.add(new y31(this, sdVar, bi4Var));
            this.d = new vg0(av1.K(arrayList5), av1.K((ArrayList) vuVar.d), av1.K(arrayList6), av1.K(arrayList3), av1.K(arrayList4));
        }
        boolean z = oh1.a;
        kn1Var = new kn1(false);
        bi4Var.d = kn1Var;
        this.c = bi4Var;
        vg0 vg0Var2 = d33Var.f;
        vu vuVar2 = new vu();
        vuVar2.c = ke0.P0(vg0Var2.a);
        vuVar2.d = ke0.P0(vg0Var2.b);
        vuVar2.h = ke0.P0(vg0Var2.c);
        List list3 = (List) vg0Var2.f.getValue();
        arrayList = new ArrayList();
        it = list3.iterator();
        while (true) {
            i = 9;
            if (it.hasNext()) {
                break;
                break;
            }
            arrayList.add(new wl(i, (ps2) it.next()));
        }
        vuVar2.l = arrayList;
        List list4 = (List) vg0Var2.g.getValue();
        arrayList2 = new ArrayList();
        it2 = list4.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new ug0((gs0) it2.next(), i3));
        }
        vuVar2.m = arrayList2;
        ArrayList arrayList7 = (ArrayList) vuVar2.c;
        arrayList3 = (ArrayList) vuVar2.l;
        ArrayList arrayList8 = (ArrayList) vuVar2.h;
        arrayList4 = (ArrayList) vuVar2.m;
        nm1Var = d33Var.b;
        obj = nm1Var.n.a.get(sf3.b);
        if (((Boolean) (obj == null ? Boolean.TRUE : obj)).booleanValue()) {
            arrayList3.add(new b72(12));
            arrayList4.add(new b72(13));
        }
        vuVar2.d(new ce(i5), r43.a(Uri.class));
        vuVar2.d(new ce(3), r43.a(Integer.class));
        arrayList8.add(new ps2(new bd(0), r43.a(da4.class)));
        vuVar2.e(new zl(i5), r43.a(da4.class));
        vuVar2.e(new zl(4), r43.a(da4.class));
        vuVar2.e(new zl(i), r43.a(da4.class));
        vuVar2.e(new zl(6), r43.a(Drawable.class));
        vuVar2.e(new zl(i3), r43.a(Bitmap.class));
        f61 f61Var2 = jm1.a;
        Object obj7 = nm1Var.n.a.get(jm1.a);
        int iIntValue2 = ((Number) (obj7 == null ? 4 : obj7)).intValue();
        int i8 = lf3.a;
        kf3Var = new kf3(iIntValue2);
        i2 = Build.VERSION.SDK_INT;
        obj2 = v51.a;
        if (i2 >= 29) {
            obj3 = nm1Var.n.a.get(jm1.c);
            if (((Boolean) (obj3 == null ? Boolean.TRUE : obj3)).booleanValue()) {
                obj4 = nm1Var.n.a.get(jm1.b);
                if (((v51) (obj4 == null ? obj2 : obj4)).equals(obj2)) {
                    arrayList4.add(new ug0(new rn3(kf3Var), i5));
                }
            }
        }
        Object obj8 = nm1Var.n.a.get(jm1.b);
        arrayList4.add(new ug0(new cv(kf3Var, (v51) (obj8 != null ? obj8 : obj2)), i5));
        vuVar2.d(new ce(i3), r43.a(File.class));
        vuVar2.e(new zl(8), r43.a(da4.class));
        vuVar2.e(new zl(3), r43.a(ByteBuffer.class));
        vuVar2.d(new ce(4), r43.a(String.class));
        int i9 = 2;
        vuVar2.d(new ce(i9), r43.a(mt2.class));
        arrayList8.add(new ps2(new bd(1), r43.a(da4.class)));
        arrayList8.add(new ps2(new bd(2), r43.a(da4.class)));
        vuVar2.e(new zl(7), r43.a(da4.class));
        vuVar2.e(new zl(i9), r43.a(byte[].class));
        vuVar2.e(new zl(5), r43.a(da4.class));
        arrayList7.add(new y31(this, sdVar, bi4Var));
        this.d = new vg0(av1.K(arrayList7), av1.K((ArrayList) vuVar2.d), av1.K(arrayList8), av1.K(arrayList3), av1.K(arrayList4));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b0 A[Catch: all -> 0x003d, TryCatch #5 {all -> 0x003d, blocks: (B:15:0x0038, B:92:0x0185, B:94:0x018b, B:97:0x0198, B:99:0x01a9, B:98:0x019e, B:100:0x01b0, B:102:0x01b4, B:105:0x01c0, B:106:0x01c5), top: B:130:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x01b4 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #5 {all -> 0x003d, blocks: (B:15:0x0038, B:92:0x0185, B:94:0x018b, B:97:0x0198, B:99:0x01a9, B:98:0x019e, B:100:0x01b0, B:102:0x01b4, B:105:0x01c0, B:106:0x01c5), top: B:130:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x01c0 A[Catch: all -> 0x003d, TRY_ENTER, TryCatch #5 {all -> 0x003d, blocks: (B:15:0x0038, B:92:0x0185, B:94:0x018b, B:97:0x0198, B:99:0x01a9, B:98:0x019e, B:100:0x01b0, B:102:0x01b4, B:105:0x01c0, B:106:0x01c5), top: B:130:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01d8 A[Catch: all -> 0x01e5, TRY_LEAVE, TryCatch #0 {all -> 0x01e5, blocks: (B:111:0x01d4, B:113:0x01d8, B:118:0x01e7, B:119:0x01ed), top: B:122:0x01d4 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x01e7 A[Catch: all -> 0x01e5, TRY_ENTER, TryCatch #0 {all -> 0x01e5, blocks: (B:111:0x01d4, B:113:0x01d8, B:118:0x01e7, B:119:0x01ed), top: B:122:0x01d4 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0129 A[Catch: all -> 0x006d, TryCatch #4 {all -> 0x006d, blocks: (B:29:0x0068, B:78:0x0122, B:80:0x0129, B:82:0x0133, B:83:0x013d, B:84:0x0140), top: B:128:0x0068 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0133 A[Catch: all -> 0x006d, TryCatch #4 {all -> 0x006d, blocks: (B:29:0x0068, B:78:0x0122, B:80:0x0129, B:82:0x0133, B:83:0x013d, B:84:0x0140), top: B:128:0x0068 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0158  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0181  */
    /* JADX WARN: Code duplicated, block: B:94:0x018b A[Catch: all -> 0x003d, TryCatch #5 {all -> 0x003d, blocks: (B:15:0x0038, B:92:0x0185, B:94:0x018b, B:97:0x0198, B:99:0x01a9, B:98:0x019e, B:100:0x01b0, B:102:0x01b4, B:105:0x01c0, B:106:0x01c5), top: B:130:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0196 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0198 A[Catch: all -> 0x003d, TryCatch #5 {all -> 0x003d, blocks: (B:15:0x0038, B:92:0x0185, B:94:0x018b, B:97:0x0198, B:99:0x01a9, B:98:0x019e, B:100:0x01b0, B:102:0x01b4, B:105:0x01c0, B:106:0x01c5), top: B:130:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x019e A[Catch: all -> 0x003d, TryCatch #5 {all -> 0x003d, blocks: (B:15:0x0038, B:92:0x0185, B:94:0x018b, B:97:0x0198, B:99:0x01a9, B:98:0x019e, B:100:0x01b0, B:102:0x01b4, B:105:0x01c0, B:106:0x01c5), top: B:130:0x0038 }] */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0114, code lost:
    
        if (r4.a(r8) == r11) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.pm1 r16, int r17, defpackage.uo0 r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g33.a(pm1, int, uo0):java.lang.Object");
    }

    public final Object b(pm1 pm1Var, uo0 uo0Var) {
        ps3 ps3Var = pm1Var.c;
        return ((pm1Var.q instanceof r33) || ((h32) y64.z(pm1Var, sm1.e)) != null) ? yo4.q(new q8(this, pm1Var, (so0) null, 23), uo0Var) : a(pm1Var, 1, uo0Var);
    }

    public final k33 c() {
        return (k33) this.a.d.getValue();
    }

    public final void d(s41 s41Var, ps3 ps3Var, bg1 bg1Var) {
        pm1 pm1Var = s41Var.b;
        if (ps3Var instanceof um) {
            ((fm2) y64.z(pm1Var, sm1.a)).getClass();
        } else if (ps3Var != null) {
            ps3Var.h(s41Var.a);
        }
        bg1Var.getClass();
        pm1Var.getClass();
    }
}
