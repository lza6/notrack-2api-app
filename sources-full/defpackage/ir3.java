package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class ir3 implements ce4, vw2, ac4, i61 {
    public Object c;
    public Object d;
    public Object h;
    public Object l;

    public ir3(int i) {
        switch (i) {
            case 3:
                this.c = new ArrayList();
                this.d = new HashMap();
                this.h = new HashMap();
                break;
            case 8:
                this.c = new ArrayList();
                this.d = new ArrayList();
                this.h = new ArrayList();
                this.l = ix0.p;
                break;
            case 10:
                this.c = new wq();
                long[] jArr = qa3.a;
                this.d = new fi2();
                break;
            case 13:
                this.c = new HashMap();
                this.d = new HashMap();
                this.h = new HashMap();
                this.l = new HashMap();
                break;
            default:
                this.d = new ArrayDeque();
                this.h = new ArrayDeque();
                this.l = new ArrayDeque();
                break;
        }
    }

    public ir3(Context context) {
        this.c = context.getApplicationContext();
        this.d = nm1.o;
        this.h = null;
        this.l = new e61();
    }

    public ir3(Typeface typeface, be2 be2Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.l = typeface;
        this.c = be2Var;
        this.h = new ce2(1024);
        int iA = be2Var.a(6);
        if (iA != 0) {
            int i5 = iA + be2Var.c;
            i = ((ByteBuffer) be2Var.l).getInt(((ByteBuffer) be2Var.l).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.d = new char[i * 2];
        int iA2 = be2Var.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + be2Var.c;
            i2 = ((ByteBuffer) be2Var.l).getInt(((ByteBuffer) be2Var.l).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            h74 h74Var = new h74(this, i7);
            ae2 ae2VarB = h74Var.b();
            int iA3 = ae2VarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) ae2VarB.l).getInt(iA3 + ae2VarB.c) : 0, (char[]) this.d, i7 * 2);
            ae2 ae2VarB2 = h74Var.b();
            int iA4 = ae2VarB2.a(16);
            if (iA4 != 0) {
                int i8 = iA4 + ae2VarB2.c;
                i3 = ((ByteBuffer) ae2VarB2.l).getInt(((ByteBuffer) ae2VarB2.l).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (!(i3 > 0)) {
                u41.k("invalid metadata codepoint length");
                throw null;
            }
            ce2 ce2Var = (ce2) this.h;
            ae2 ae2VarB3 = h74Var.b();
            int iA5 = ae2VarB3.a(16);
            if (iA5 != 0) {
                int i9 = iA5 + ae2VarB3.c;
                i4 = ((ByteBuffer) ae2VarB3.l).getInt(((ByteBuffer) ae2VarB3.l).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            ce2Var.a(h74Var, 0, i4 - 1);
        }
    }

    public ir3(c81 c81Var) {
        this(new sk3(14, c81Var));
    }

    public ir3(dg3 dg3Var) {
        this.c = new HashMap(dg3Var.a);
        this.d = new HashMap(dg3Var.b);
        this.h = new HashMap(dg3Var.c);
        this.l = new HashMap(dg3Var.d);
    }

    public /* synthetic */ ir3(Object obj) {
        this.c = obj;
    }

    public /* synthetic */ ir3(Object obj, Object obj2, Object obj3, Object obj4) {
        this.c = obj;
        this.d = obj2;
        this.h = obj3;
        this.l = obj4;
    }

    @Override // defpackage.ce4
    public void A(rs2 rs2Var) {
        k0(rs2Var);
    }

    @Override // defpackage.ce4
    public void B(sd0 sd0Var) {
        k0(sd0Var);
    }

    @Override // defpackage.ce4
    public void C(sl3 sl3Var) {
        k0(sl3Var);
    }

    @Override // defpackage.ce4
    public void D(j42 j42Var) {
        k0(j42Var);
    }

    public void E(xc1 xc1Var) {
        if (((ArrayList) this.c).contains(xc1Var)) {
            m51.A(xc1Var, "Fragment already added: ");
            return;
        }
        synchronized (((ArrayList) this.c)) {
            ((ArrayList) this.c).add(xc1Var);
        }
        xc1Var.s = true;
    }

    public void F(Object obj, Object obj2, fw1 fw1Var, boolean z) throws GeneralSecurityException {
        byte[] bArrArray;
        if (((ConcurrentHashMap) this.d) == null) {
            u41.r("addPrimitive cannot be called after build");
            return;
        }
        if (obj == null && obj2 == null) {
            m51.v("at least one of the `fullPrimitive` or `primitive` must be set");
            return;
        }
        if (fw1Var.D() != mv1.ENABLED) {
            m51.v("only ENABLED key is allowed");
            return;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.d;
        Integer numValueOf = Integer.valueOf(fw1Var.B());
        if (fw1Var.C() == lr2.RAW) {
            numValueOf = null;
        }
        kr1 kr1VarA = hi2.b.a(f13.d(fw1Var.A().B(), fw1Var.A().C(), fw1Var.A().A(), fw1Var.C(), numValueOf));
        int iOrdinal = fw1Var.C().ordinal();
        if (iOrdinal == 1) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(fw1Var.B()).array();
        } else if (iOrdinal == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(fw1Var.B()).array();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                m51.v("unknown output prefix type");
                return;
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(fw1Var.B()).array();
        } else {
            bArrArray = py.d;
        }
        hz2 hz2Var = new hz2(obj, obj2, bArrArray, fw1Var.D(), fw1Var.C(), fw1Var.B(), fw1Var.A().B(), kr1VarA);
        ArrayList arrayList = new ArrayList();
        arrayList.add(hz2Var);
        byte[] bArr = hz2Var.c;
        iz2 iz2Var = new iz2(bArr != null ? Arrays.copyOf(bArr, bArr.length) : null);
        List list = (List) concurrentHashMap.put(iz2Var, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(hz2Var);
            concurrentHashMap.put(iz2Var, Collections.unmodifiableList(arrayList2));
        }
        if (z) {
            if (((hz2) this.h) == null) {
                this.h = hz2Var;
            } else {
                u41.r("you cannot set two primary primitives");
            }
        }
    }

    public void G(im0 im0Var) {
        if (((im0) im0Var.f) != null) {
            K();
            ((jm3) this.h).a('\n');
        }
    }

    public oi1 H() {
        Integer num = (Integer) this.c;
        if (num == null) {
            m51.v("key size is not set");
            return null;
        }
        if (((Integer) this.d) == null) {
            m51.v("tag size is not set");
            return null;
        }
        if (((d5) this.h) == null) {
            m51.v("hash type is not set");
            return null;
        }
        if (((d5) this.l) == null) {
            m51.v("variant is not set");
            return null;
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.c));
        }
        Integer num2 = (Integer) this.d;
        int iIntValue = num2.intValue();
        d5 d5Var = (d5) this.h;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (d5Var == d5.A) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (d5Var == d5.B) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (d5Var == d5.C) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (d5Var == d5.D) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (d5Var != d5.E) {
                m51.v("unknown hash type; must be SHA256, SHA384 or SHA512");
                return null;
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new oi1(((Integer) this.c).intValue(), ((Integer) this.d).intValue(), (d5) this.l, (d5) this.h);
    }

    public g33 I() {
        vg0 vg0Var;
        Context context = (Context) this.c;
        nm1 nm1Var = (nm1) this.d;
        e61 e61Var = (e61) this.l;
        e61Var.getClass();
        nm1 nm1Var2 = new nm1(nm1Var.a, nm1Var.b, nm1Var.c, nm1Var.d, nm1Var.e, nm1Var.f, nm1Var.g, nm1Var.h, nm1Var.i, nm1Var.j, nm1Var.k, nm1Var.l, nm1Var.m, new g61(av1.L(e61Var.a)));
        yq3 yq3Var = new yq3(new lg(22));
        yq3 yq3Var2 = new yq3(new wl(13, this));
        yq3 yq3Var3 = new yq3(new lg(23));
        vg0 vg0Var2 = (vg0) this.h;
        if (vg0Var2 == null) {
            z21 z21Var = z21.c;
            vg0Var = new vg0(z21Var, z21Var, z21Var, z21Var, z21Var);
        } else {
            vg0Var = vg0Var2;
        }
        return new g33(new d33(context, nm1Var2, yq3Var, yq3Var2, yq3Var3, vg0Var));
    }

    public void J(dn3 dn3Var) {
        Runnable runnable;
        dn3Var.getClass();
        synchronized (this.h) {
            runnable = (Runnable) ((LinkedHashMap) this.l).remove(dn3Var);
        }
        if (runnable != null) {
            ((Handler) ((jb) this.c).d).removeCallbacks(runnable);
        }
    }

    public void K() {
        jm3 jm3Var = (jm3) this.h;
        StringBuilder sb = jm3Var.c;
        if (sb.length() <= 0 || '\n' == sb.charAt(sb.length() - 1)) {
            return;
        }
        jm3Var.a('\n');
    }

    public void L(Iterable iterable) {
        if (iterable == null) {
            m51.x("extensions must not be null");
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            z51 z51Var = (z51) it.next();
            if (z51Var instanceof ho3) {
                switch (((ho3) z51Var).a) {
                    case 0:
                        ((ArrayList) this.d).add(new go3(0));
                        break;
                    case 1:
                        ((ArrayList) this.d).add(new go3(1));
                        break;
                    default:
                        ((ArrayList) this.c).add(new ov(6));
                        break;
                }
            }
        }
    }

    public xc1 M(String str) {
        ud1 ud1Var = (ud1) ((HashMap) this.d).get(str);
        if (ud1Var != null) {
            return ud1Var.c;
        }
        return null;
    }

    public xc1 N(String str) {
        for (ud1 ud1Var : ((HashMap) this.d).values()) {
            if (ud1Var != null) {
                xc1 xc1VarN = ud1Var.c;
                if (!str.equals(xc1VarN.m)) {
                    xc1VarN = xc1VarN.D.c.N(str);
                }
                if (xc1VarN != null) {
                    return xc1VarN;
                }
            }
        }
        return null;
    }

    public void O(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        f0();
    }

    public void P(v23 v23Var) {
        v23Var.d.decrementAndGet();
        O((ArrayDeque) this.h, v23Var);
    }

    public sp3 Q(k3 k3Var) {
        ArrayList arrayList = (ArrayList) this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sp3 sp3Var = (sp3) arrayList.get(i);
            if (sp3Var != null && sp3Var.b == k3Var) {
                return sp3Var;
            }
        }
        sp3 sp3Var2 = new sp3((Context) this.d, k3Var);
        arrayList.add(sp3Var2);
        return sp3Var2;
    }

    public ArrayList R() {
        ArrayList arrayList = new ArrayList();
        for (ud1 ud1Var : ((HashMap) this.d).values()) {
            if (ud1Var != null) {
                arrayList.add(ud1Var);
            }
        }
        return arrayList;
    }

    public ArrayList S() {
        ArrayList arrayList = new ArrayList();
        for (ud1 ud1Var : ((HashMap) this.d).values()) {
            if (ud1Var != null) {
                arrayList.add(ud1Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public wq T(Object obj) {
        wq wqVar = (wq) this.l;
        if (this.h == obj && wqVar != null) {
            return wqVar;
        }
        fi2 fi2Var = (fi2) this.d;
        Object objG = fi2Var.g(obj);
        if (objG == null) {
            wq wqVar2 = (wq) this.c;
            wq wqVar3 = new wq();
            wqVar3.a = wqVar2.a;
            wqVar3.b = wqVar2.b;
            fi2Var.l(obj, wqVar3);
            objG = wqVar3;
        }
        wq wqVar4 = (wq) objG;
        this.h = obj;
        this.l = wqVar4;
        return wqVar4;
    }

    public List U() {
        ArrayList arrayList;
        if (((ArrayList) this.c).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.c)) {
            arrayList = new ArrayList((ArrayList) this.c);
        }
        return arrayList;
    }

    public np4 V() {
        return (np4) ((ly1) this.h).getValue();
    }

    public gr3 W(vh4 vh4Var) {
        vh4Var.getClass();
        String str = vh4Var.a;
        int i = vh4Var.b;
        q73 q73VarA = q73.a(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        q73VarA.i(1, str);
        q73VarA.s(i, 2);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.c;
        workDatabase_Impl.b();
        Cursor cursorM = workDatabase_Impl.m(q73VarA);
        try {
            return cursorM.moveToFirst() ? new gr3(cursorM.getString(kr1.F(cursorM, "work_spec_id")), cursorM.getInt(kr1.F(cursorM, "generation")), cursorM.getInt(kr1.F(cursorM, "system_id"))) : null;
        } finally {
            cursorM.close();
            q73VarA.l();
        }
    }

    public cg X(cg cgVar, cg cgVar2) {
        ir3 ir3Var = this;
        if (((cg) ir3Var.l) == null) {
            ir3Var.l = cgVar.c();
        }
        cg cgVar3 = (cg) ir3Var.l;
        if (cgVar3 == null) {
            kr1.n0("targetVector");
            throw null;
        }
        int iB = cgVar3.b();
        int i = 0;
        while (true) {
            cg cgVar4 = (cg) ir3Var.l;
            if (i >= iB) {
                if (cgVar4 != null) {
                    return cgVar4;
                }
                kr1.n0("targetVector");
                throw null;
            }
            if (cgVar4 == null) {
                kr1.n0("targetVector");
                throw null;
            }
            sk3 sk3Var = (sk3) ir3Var.c;
            float fA = cgVar.a(i);
            float fA2 = cgVar2.a(i);
            y71 y71Var = (y71) sk3Var.d;
            double dB = y71Var.b(fA2);
            double d = z71.a;
            float f = y71Var.a * y71Var.b;
            cgVar4.e((Math.signum(fA2) * ((float) (Math.exp((d / (d - 1.0d)) * dB) * ((double) f)))) + fA, i);
            i++;
            ir3Var = this;
            iB = iB;
        }
    }

    public cg Y(long j, cg cgVar, cg cgVar2) {
        if (((cg) this.h) == null) {
            this.h = cgVar.c();
        }
        cg cgVar3 = (cg) this.h;
        if (cgVar3 == null) {
            kr1.n0("velocityVector");
            throw null;
        }
        int iB = cgVar3.b();
        int i = 0;
        while (true) {
            cg cgVar4 = (cg) this.h;
            if (i >= iB) {
                if (cgVar4 != null) {
                    return cgVar4;
                }
                kr1.n0("velocityVector");
                throw null;
            }
            if (cgVar4 == null) {
                kr1.n0("velocityVector");
                throw null;
            }
            sk3 sk3Var = (sk3) this.c;
            cgVar.getClass();
            long j2 = j / 1000000;
            x71 x71VarA = ((y71) sk3Var.d).a(cgVar2.a(i));
            long j3 = x71VarA.c;
            cgVar4.e((((Math.signum(x71VarA.a) * fb.a(j3 > 0 ? j2 / j3 : 1.0f).b) * x71VarA.b) / j3) * 1000.0f, i);
            i++;
        }
    }

    public void Z(gr3 gr3Var) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.c;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((av0) this.d).m(gr3Var);
            workDatabase_Impl.p();
        } finally {
            workDatabase_Impl.k();
        }
    }

    public int a0() {
        return ((jm3) this.h).c.length();
    }

    @Override // defpackage.xb4
    public long b(cg cgVar, cg cgVar2, cg cgVar3) {
        int iB = cgVar.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = Math.max(jMax, ((sk3) this.c).i(i).d(cgVar.a(i), cgVar2.a(i), cgVar3.a(i)));
        }
        return jMax;
    }

    public void b0(ud1 ud1Var) {
        xc1 xc1Var = ud1Var.c;
        String str = xc1Var.m;
        HashMap map = (HashMap) this.d;
        if (map.get(str) != null) {
            return;
        }
        map.put(xc1Var.m, ud1Var);
        if (nd1.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + xc1Var);
        }
    }

    @Override // defpackage.ce4
    public void c(ry ryVar) {
        k0(ryVar);
    }

    public void c0(ud1 ud1Var) {
        HashMap map = (HashMap) this.d;
        xc1 xc1Var = ud1Var.c;
        if (xc1Var.K) {
            ((qd1) this.l).h(xc1Var);
        }
        if (map.get(xc1Var.m) == ud1Var && ((ud1) map.put(xc1Var.m, null)) != null && nd1.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + xc1Var);
        }
    }

    @Override // defpackage.ce4
    public void d(kj1 kj1Var) {
        k0(kj1Var);
    }

    public boolean d0(k3 k3Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.c).onActionItemClicked(Q(k3Var), new qc2((Context) this.d, (xp3) menuItem));
    }

    @Override // defpackage.ce4
    public void e(gr0 gr0Var) {
        k0(gr0Var);
    }

    public boolean e0(k3 k3Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.c;
        sp3 sp3VarQ = Q(k3Var);
        ph3 ph3Var = (ph3) this.l;
        Menu qd2Var = (Menu) ph3Var.get(menu);
        if (qd2Var == null) {
            qd2Var = new qd2((Context) this.d, (hc2) menu);
            ph3Var.put(menu, qd2Var);
        }
        return callback.onCreateActionMode(sp3VarQ, qd2Var);
    }

    @Override // defpackage.ce4
    public void f(er0 er0Var) {
        k0(er0Var);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:24:0x0071 A[Catch: all -> 0x009e, TryCatch #4 {all -> 0x009e, blocks: (B:22:0x006b, B:24:0x0071, B:27:0x00a0), top: B:53:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:53:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0071, please report this as an issue */
    public void f0() {
        int size;
        int i;
        v23 v23Var;
        byte[] bArr = ka4.a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.d).iterator();
                it.getClass();
                while (it.hasNext()) {
                    v23 v23Var2 = (v23) it.next();
                    if (((ArrayDeque) this.h).size() >= 64) {
                        break;
                    }
                    if (v23Var2.d.get() < 5) {
                        it.remove();
                        v23Var2.d.incrementAndGet();
                        arrayList.add(v23Var2);
                        ((ArrayDeque) this.h).add(v23Var2);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.h).size();
                    ((ArrayDeque) this.l).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    v23Var = (v23) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.c) == null) {
                                this.c = new ThreadPoolExecutor(0, IntCompanionObject.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ia4(ka4.h + " Dispatcher", false));
                            }
                            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.c;
                            threadPoolExecutor.getClass();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    v23Var.getClass();
                    y23 y23Var = v23Var.h;
                    ir3 ir3Var = y23Var.c.c;
                    byte[] bArr2 = ka4.a;
                    try {
                        try {
                            threadPoolExecutor.execute(v23Var);
                        } catch (RejectedExecutionException e) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e);
                            y23Var.j(interruptedIOException);
                            v23Var.c.k(y23Var, interruptedIOException);
                            y23Var.c.c.P(v23Var);
                        }
                    } catch (Throwable th2) {
                        y23Var.c.c.P(v23Var);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        size = arrayList.size();
        while (i < size) {
            v23Var = (v23) arrayList.get(i);
            synchronized (this) {
                if (((ThreadPoolExecutor) this.c) == null) {
                    this.c = new ThreadPoolExecutor(0, IntCompanionObject.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ia4(ka4.h + " Dispatcher", false));
                }
                ThreadPoolExecutor threadPoolExecutor2 = (ThreadPoolExecutor) this.c;
                threadPoolExecutor2.getClass();
                v23Var.getClass();
                y23 y23Var2 = v23Var.h;
                ir3 ir3Var2 = y23Var2.c.c;
                byte[] bArr3 = ka4.a;
                threadPoolExecutor2.execute(v23Var);
            }
        }
    }

    @Override // defpackage.ce4
    public void g(kq2 kq2Var) {
        k0(kq2Var);
    }

    public Bundle g0(String str, Bundle bundle) {
        HashMap map = (HashMap) this.h;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    @Override // defpackage.t13
    public Object get() {
        return new ir3((Executor) ((t13) this.c).get(), (o83) ((t13) this.d).get(), (ci4) ((iy2) this.h).get(), (o83) ((t13) this.l).get());
    }

    @Override // defpackage.ce4
    public void h(vh1 vh1Var) {
        k0(vh1Var);
    }

    public void h0(int i, Object obj) {
        jm3 jm3Var = (jm3) this.h;
        jm3.c(jm3Var, obj, i, jm3Var.c.length());
    }

    @Override // defpackage.ce4
    public void i(ij1 ij1Var) {
        k0(ij1Var);
    }

    public void i0(im0 im0Var, int i) {
        Class<?> cls = im0Var.getClass();
        pa2 pa2Var = (pa2) this.c;
        dm3 dm3VarJ = pa2Var.g.j(cls);
        if (dm3VarJ != null) {
            h0(i, dm3VarJ.a(pa2Var, (ua2) this.d));
        }
    }

    @Override // defpackage.ce4
    public void j(n42 n42Var) {
        k0(n42Var);
    }

    public void j0(dn3 dn3Var) {
        dn3Var.getClass();
        ba baVar = new ba(this, 12, dn3Var);
        synchronized (this.h) {
        }
        ((Handler) ((jb) this.c).d).postDelayed(baVar, 5400000L);
    }

    public void k0(im0 im0Var) {
        wa2 wa2Var = (wa2) ((Map) this.l).get(im0Var.getClass());
        if (wa2Var != null) {
            wa2Var.a(this, im0Var);
        } else {
            l0(im0Var);
        }
    }

    @Override // defpackage.ce4
    public void l(it3 it3Var) {
        k0(it3Var);
    }

    public void l0(im0 im0Var) {
        im0 im0Var2 = (im0) im0Var.c;
        while (im0Var2 != null) {
            im0 im0Var3 = (im0) im0Var2.f;
            im0Var2.a(this);
            im0Var2 = im0Var3;
        }
    }

    @Override // defpackage.ce4
    public void m(h52 h52Var) {
        k0(h52Var);
    }

    @Override // defpackage.ce4
    public void n(yo3 yo3Var) {
        k0(yo3Var);
    }

    @Override // defpackage.ce4
    public void o(zl1 zl1Var) {
        k0(zl1Var);
    }

    @Override // defpackage.ce4
    public void p(rn1 rn1Var) {
        k0(rn1Var);
    }

    @Override // defpackage.ce4
    public void q(d04 d04Var) {
        k0(d04Var);
    }

    @Override // defpackage.ce4
    public void r(p61 p61Var) {
        k0(p61Var);
    }

    @Override // defpackage.xb4
    public cg s(long j, cg cgVar, cg cgVar2, cg cgVar3) {
        if (((cg) this.h) == null) {
            this.h = cgVar3.c();
        }
        cg cgVar4 = (cg) this.h;
        if (cgVar4 == null) {
            kr1.n0("velocityVector");
            throw null;
        }
        int iB = cgVar4.b();
        int i = 0;
        while (true) {
            cg cgVar5 = (cg) this.h;
            if (i >= iB) {
                if (cgVar5 != null) {
                    return cgVar5;
                }
                kr1.n0("velocityVector");
                throw null;
            }
            if (cgVar5 == null) {
                kr1.n0("velocityVector");
                throw null;
            }
            cgVar5.e(((sk3) this.c).i(i).c(j, cgVar.a(i), cgVar2.a(i), cgVar3.a(i)), i);
            i++;
        }
    }

    @Override // defpackage.xb4
    public cg u(long j, cg cgVar, cg cgVar2, cg cgVar3) {
        if (((cg) this.d) == null) {
            this.d = cgVar.c();
        }
        cg cgVar4 = (cg) this.d;
        if (cgVar4 == null) {
            kr1.n0("valueVector");
            throw null;
        }
        int iB = cgVar4.b();
        int i = 0;
        while (true) {
            cg cgVar5 = (cg) this.d;
            if (i >= iB) {
                if (cgVar5 != null) {
                    return cgVar5;
                }
                kr1.n0("valueVector");
                throw null;
            }
            if (cgVar5 == null) {
                kr1.n0("valueVector");
                throw null;
            }
            cgVar5.e(((sk3) this.c).i(i).b(j, cgVar.a(i), cgVar2.a(i), cgVar3.a(i)), i);
            i++;
        }
    }

    @Override // defpackage.ce4
    public void v(r21 r21Var) {
        k0(r21Var);
    }

    @Override // defpackage.xb4
    public cg w(cg cgVar, cg cgVar2, cg cgVar3) {
        if (((cg) this.l) == null) {
            this.l = cgVar3.c();
        }
        cg cgVar4 = (cg) this.l;
        if (cgVar4 == null) {
            kr1.n0("endVelocityVector");
            throw null;
        }
        int iB = cgVar4.b();
        int i = 0;
        while (true) {
            cg cgVar5 = (cg) this.l;
            if (i >= iB) {
                if (cgVar5 != null) {
                    return cgVar5;
                }
                kr1.n0("endVelocityVector");
                throw null;
            }
            if (cgVar5 == null) {
                kr1.n0("endVelocityVector");
                throw null;
            }
            cgVar5.e(((sk3) this.c).i(i).e(cgVar.a(i), cgVar2.a(i), cgVar3.a(i)), i);
            i++;
        }
    }

    @Override // defpackage.ce4
    public void x(mh1 mh1Var) {
        k0(mh1Var);
    }

    @Override // defpackage.ce4
    public void y(nv nvVar) {
        k0(nvVar);
    }

    @Override // defpackage.ce4
    public void z(gx0 gx0Var) {
        k0(gx0Var);
    }
}
