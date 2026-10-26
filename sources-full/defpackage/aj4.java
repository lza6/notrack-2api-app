package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class aj4 {
    public final hi4 a;
    public final Context b;
    public final String c;
    public final zh4 d;
    public final jl0 e;
    public final sb3 f;
    public final tz2 g;
    public final WorkDatabase h;
    public final ji4 i;
    public final bv0 j;
    public final ArrayList k;
    public final String l;
    public final is1 m;

    public aj4(s44 s44Var) {
        hi4 hi4Var = (hi4) s44Var.n;
        this.a = hi4Var;
        this.b = (Context) s44Var.c;
        String str = hi4Var.a;
        this.c = str;
        this.d = (zh4) s44Var.h;
        jl0 jl0Var = (jl0) s44Var.d;
        this.e = jl0Var;
        this.f = jl0Var.d;
        this.g = (tz2) s44Var.l;
        WorkDatabase workDatabase = (WorkDatabase) s44Var.m;
        this.h = workDatabase;
        this.i = workDatabase.u();
        this.j = workDatabase.f();
        ArrayList arrayList = (ArrayList) s44Var.o;
        this.k = arrayList;
        this.l = fq2.r(fq2.s("Work [ id=", str, ", tags={ "), ke0.D0(arrayList, ",", null, null, null, 62), " } ]");
        this.m = yo4.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [so0] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static final Object a(aj4 aj4Var, uo0 uo0Var) throws Throwable {
        zi4 zi4Var;
        boolean z;
        hi4 hi4Var;
        String str;
        OverwritingInputMerger overwritingInputMerger;
        OverwritingInputMerger overwritingInputMerger2;
        Object ui4Var;
        final aj4 aj4Var2 = aj4Var;
        String str2 = aj4Var2.c;
        zh4 zh4Var = aj4Var2.d;
        WorkDatabase workDatabase = aj4Var2.h;
        jl0 jl0Var = aj4Var2.e;
        t73 t73Var = jl0Var.m;
        hi4 hi4Var2 = aj4Var2.a;
        if (uo0Var instanceof zi4) {
            zi4Var = (zi4) uo0Var;
            int i = zi4Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                zi4Var.l = i - Integer.MIN_VALUE;
            } else {
                zi4Var = new zi4(aj4Var2, uo0Var);
            }
        } else {
            zi4Var = new zi4(aj4Var2, uo0Var);
        }
        Object objY = zi4Var.d;
        int i2 = zi4Var.l;
        try {
            if (i2 == 0) {
                g13.O(objY);
                t73 t73Var2 = jl0Var.e;
                t73Var.getClass();
                boolean zB = jr1.B();
                String str3 = hi4Var2.x;
                String str4 = hi4Var2.c;
                String str5 = hi4Var2.d;
                or0 or0Var = hi4Var2.e;
                if (!zB || str3 == null) {
                    z = zB;
                    hi4Var = hi4Var2;
                    str = str3;
                } else {
                    int iHashCode = hi4Var2.hashCode();
                    if (Build.VERSION.SDK_INT >= 29) {
                        y44.a(iHashCode, jr1.O(str3));
                        z = zB;
                        hi4Var = hi4Var2;
                        str = str3;
                    } else {
                        String strO = jr1.O(str3);
                        try {
                            if (jr1.h == null) {
                                z = zB;
                                try {
                                    hi4Var = hi4Var2;
                                    str = str3;
                                    try {
                                        jr1.h = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                                    } catch (Exception e) {
                                        e = e;
                                        jr1.x("asyncTraceBegin", e);
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    hi4Var = hi4Var2;
                                    str = str3;
                                    jr1.x("asyncTraceBegin", e);
                                }
                            } else {
                                z = zB;
                                hi4Var = hi4Var2;
                                str = str3;
                            }
                            jr1.h.invoke(null, Long.valueOf(jr1.f), strO, Integer.valueOf(iHashCode));
                        } catch (Exception e3) {
                            e = e3;
                            z = zB;
                        }
                    }
                }
                final int i3 = 0;
                Boolean bool = (Boolean) workDatabase.n(new Callable(aj4Var2) { // from class: si4
                    public final /* synthetic */ aj4 b;

                    {
                        this.b = aj4Var2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i4 = i3;
                        boolean z2 = true;
                        aj4 aj4Var3 = this.b;
                        switch (i4) {
                            case 0:
                                hi4 hi4Var3 = aj4Var3.a;
                                int i5 = hi4Var3.b;
                                String str6 = hi4Var3.c;
                                if (i5 != 1) {
                                    String str7 = bj4.a;
                                    v72.f().c(str7, str6 + " is not in ENQUEUED state. Nothing more to do");
                                    return Boolean.TRUE;
                                }
                                if (hi4Var3.d() || (hi4Var3.b == 1 && hi4Var3.k > 0)) {
                                    aj4Var3.f.getClass();
                                    if (System.currentTimeMillis() < hi4Var3.a()) {
                                        v72.f().c(bj4.a, "Delaying execution for " + str6 + " because it is being executed before schedule.");
                                        return Boolean.TRUE;
                                    }
                                }
                                return Boolean.FALSE;
                            default:
                                ji4 ji4Var = aj4Var3.i;
                                String str8 = aj4Var3.c;
                                if (ji4Var.k(str8) == 1) {
                                    ji4Var.v(2, str8);
                                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) ji4Var.a;
                                    workDatabase_Impl.b();
                                    hr3 hr3Var = (hr3) ji4Var.i;
                                    he1 he1VarA = hr3Var.a();
                                    he1VarA.i(1, str8);
                                    try {
                                        workDatabase_Impl.c();
                                        try {
                                            he1VarA.a();
                                            workDatabase_Impl.p();
                                            workDatabase_Impl.k();
                                            hr3Var.j(he1VarA);
                                            ji4Var.w(-256, str8);
                                        } catch (Throwable th) {
                                            workDatabase_Impl.k();
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        hr3Var.j(he1VarA);
                                        throw th2;
                                    }
                                } else {
                                    z2 = false;
                                }
                                return Boolean.valueOf(z2);
                        }
                    }
                });
                bool.getClass();
                if (bool.booleanValue()) {
                    return new vi4();
                }
                if (hi4Var.d()) {
                    overwritingInputMerger = null;
                } else {
                    jl0Var.f.getClass();
                    str5.getClass();
                    String str6 = ep1.a;
                    try {
                        overwritingInputMerger = null;
                        try {
                            Object objNewInstance = Class.forName(str5).getDeclaredConstructor(null).newInstance(null);
                            objNewInstance.getClass();
                            overwritingInputMerger2 = (OverwritingInputMerger) objNewInstance;
                        } catch (Exception e4) {
                            e = e4;
                            v72.f().e(ep1.a, "Trouble instantiating ".concat(str5), e);
                            overwritingInputMerger2 = overwritingInputMerger;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        overwritingInputMerger = null;
                    }
                    if (overwritingInputMerger2 == null) {
                        v72.f().d(bj4.a, "Could not create Input Merger ".concat(str5));
                        return new ti4();
                    }
                    List listT = kr1.T(or0Var);
                    ji4 ji4Var = aj4Var2.i;
                    ji4Var.getClass();
                    q73 q73VarA = q73.a(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                    q73VarA.i(1, str2);
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) ji4Var.a;
                    workDatabase_Impl.b();
                    Cursor cursorM = workDatabase_Impl.m(q73VarA);
                    try {
                        ArrayList arrayList = new ArrayList(cursorM.getCount());
                        while (cursorM.moveToNext()) {
                            byte[] blob = cursorM.getBlob(0);
                            or0 or0Var2 = or0.b;
                            arrayList.add(Options$Companion.fromByteArray(blob));
                        }
                        cursorM.close();
                        q73VarA.l();
                        ArrayList arrayListH0 = ke0.H0(listT, arrayList);
                        nr0 nr0Var = new nr0(0);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int size = arrayListH0.size();
                        while (i3 < size) {
                            Object obj = arrayListH0.get(i3);
                            i3++;
                            Map mapUnmodifiableMap = Collections.unmodifiableMap(((or0) obj).a);
                            mapUnmodifiableMap.getClass();
                            linkedHashMap.putAll(mapUnmodifiableMap);
                        }
                        nr0Var.b(linkedHashMap);
                        or0Var = new or0(nr0Var.a);
                        Options$Companion.toByteArrayInternalV1(or0Var);
                    } catch (Throwable th) {
                        cursorM.close();
                        q73VarA.l();
                        throw th;
                    }
                }
                UUID uuidFromString = UUID.fromString(str2);
                ArrayList arrayList2 = aj4Var2.k;
                ExecutorService executorService = jl0Var.a;
                jt0 jt0Var = jl0Var.b;
                uh4 uh4Var = new uh4(workDatabase, aj4Var2.g, zh4Var);
                WorkerParameters workerParameters = new WorkerParameters();
                workerParameters.a = uuidFromString;
                workerParameters.b = or0Var;
                new HashSet(arrayList2);
                workerParameters.c = executorService;
                workerParameters.d = jt0Var;
                workerParameters.e = zh4Var;
                workerParameters.f = t73Var2;
                try {
                    s62 s62VarO = t73Var2.o(aj4Var2.b, str4, workerParameters);
                    final int i4 = 1;
                    s62VarO.d = true;
                    vp0 vp0Var = zi4Var.getContext().get(bg1.s);
                    vp0Var.getClass();
                    gs1 gs1Var = (gs1) vp0Var;
                    aj4Var2 = aj4Var;
                    gs1Var.A(new ld(1, s62VarO, str, aj4Var, z));
                    Object objN = workDatabase.n(new Callable(aj4Var2) { // from class: si4
                        public final /* synthetic */ aj4 b;

                        {
                            this.b = aj4Var2;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            int i5 = i4;
                            boolean z2 = true;
                            aj4 aj4Var3 = this.b;
                            switch (i5) {
                                case 0:
                                    hi4 hi4Var3 = aj4Var3.a;
                                    int i6 = hi4Var3.b;
                                    String str7 = hi4Var3.c;
                                    if (i6 != 1) {
                                        String str8 = bj4.a;
                                        v72.f().c(str8, str7 + " is not in ENQUEUED state. Nothing more to do");
                                        return Boolean.TRUE;
                                    }
                                    if (hi4Var3.d() || (hi4Var3.b == 1 && hi4Var3.k > 0)) {
                                        aj4Var3.f.getClass();
                                        if (System.currentTimeMillis() < hi4Var3.a()) {
                                            v72.f().c(bj4.a, "Delaying execution for " + str7 + " because it is being executed before schedule.");
                                            return Boolean.TRUE;
                                        }
                                    }
                                    return Boolean.FALSE;
                                default:
                                    ji4 ji4Var2 = aj4Var3.i;
                                    String str9 = aj4Var3.c;
                                    if (ji4Var2.k(str9) == 1) {
                                        ji4Var2.v(2, str9);
                                        WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) ji4Var2.a;
                                        workDatabase_Impl2.b();
                                        hr3 hr3Var = (hr3) ji4Var2.i;
                                        he1 he1VarA = hr3Var.a();
                                        he1VarA.i(1, str9);
                                        try {
                                            workDatabase_Impl2.c();
                                            try {
                                                he1VarA.a();
                                                workDatabase_Impl2.p();
                                                workDatabase_Impl2.k();
                                                hr3Var.j(he1VarA);
                                                ji4Var2.w(-256, str9);
                                            } catch (Throwable th2) {
                                                workDatabase_Impl2.k();
                                                throw th2;
                                            }
                                        } catch (Throwable th3) {
                                            hr3Var.j(he1VarA);
                                            throw th3;
                                        }
                                    } else {
                                        z2 = false;
                                    }
                                    return Boolean.valueOf(z2);
                            }
                        }
                    });
                    objN.getClass();
                    if (((Boolean) objN).booleanValue() && !gs1Var.isCancelled()) {
                        y83 y83Var = zh4Var.d;
                        y83Var.getClass();
                        zp0 zp0VarB = g13.B(y83Var);
                        il3 il3Var = new il3(aj4Var2, s62VarO, uh4Var, overwritingInputMerger, 6);
                        zi4Var.c = aj4Var2;
                        zi4Var.l = 1;
                        objY = py.Y(zp0VarB, il3Var, zi4Var);
                        ui4Var = hq0.c;
                        if (objY != ui4Var) {
                        }
                        return ui4Var;
                    }
                    return new vi4();
                } catch (Throwable unused) {
                    String str7 = bj4.a;
                    v72.f().d(str7, "Could not create Worker " + str4);
                    return new ti4();
                }
            }
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aj4Var2 = zi4Var.c;
            g13.O(objY);
            r62 r62Var = (r62) objY;
            r62Var.getClass();
            ui4Var = new ui4(r62Var);
            return ui4Var;
        } catch (CancellationException e6) {
            String str8 = bj4.a;
            v72 v72VarF = v72.f();
            String strR = fq2.r(new StringBuilder(), aj4Var2.l, " was cancelled");
            if (v72VarF.c <= 4) {
                Log.i(str8, strR, e6);
            }
            throw e6;
        } catch (Throwable th2) {
            v72.f().e(bj4.a, fq2.r(new StringBuilder(), aj4Var2.l, " failed because it threw an exception/error"), th2);
            return new ti4();
        }
    }

    public final void b(int i) {
        ji4 ji4Var = this.i;
        String str = this.c;
        ji4Var.v(1, str);
        this.f.getClass();
        ji4Var.t(str, System.currentTimeMillis());
        ji4Var.q(this.a.v, str);
        ji4Var.n(str, -1L);
        ji4Var.w(i, str);
    }

    public final void c() {
        this.f.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ji4 ji4Var = this.i;
        String str = this.c;
        ji4Var.t(str, jCurrentTimeMillis);
        ji4Var.v(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) ji4Var.a;
        workDatabase_Impl.b();
        hr3 hr3Var = (hr3) ji4Var.j;
        he1 he1VarA = hr3Var.a();
        he1VarA.i(1, str);
        try {
            workDatabase_Impl.c();
            try {
                he1VarA.a();
                workDatabase_Impl.p();
                workDatabase_Impl.k();
                hr3Var.j(he1VarA);
                ji4Var.q(this.a.v, str);
                workDatabase_Impl.b();
                hr3 hr3Var2 = (hr3) ji4Var.f;
                he1 he1VarA2 = hr3Var2.a();
                he1VarA2.i(1, str);
                try {
                    workDatabase_Impl.c();
                    try {
                        he1VarA2.a();
                        workDatabase_Impl.p();
                        workDatabase_Impl.k();
                        hr3Var2.j(he1VarA2);
                        ji4Var.n(str, -1L);
                    } catch (Throwable th) {
                        workDatabase_Impl.k();
                        throw th;
                    }
                } catch (Throwable th2) {
                    hr3Var2.j(he1VarA2);
                    throw th2;
                }
            } catch (Throwable th3) {
                workDatabase_Impl.k();
                throw th3;
            }
        } catch (Throwable th4) {
            hr3Var.j(he1VarA);
            throw th4;
        }
    }

    public final void d(r62 r62Var) {
        r62Var.getClass();
        String str = this.c;
        ArrayList arrayListV = kr1.V(str);
        while (true) {
            boolean zIsEmpty = arrayListV.isEmpty();
            ji4 ji4Var = this.i;
            if (zIsEmpty) {
                or0 or0Var = ((o62) r62Var).a;
                or0Var.getClass();
                ji4Var.q(this.a.v, str);
                ji4Var.u(str, or0Var);
                return;
            }
            String str2 = (String) pe0.t0(arrayListV);
            if (ji4Var.k(str2) != 6) {
                ji4Var.v(4, str2);
            }
            arrayListV.addAll(this.j.y(str2));
        }
    }
}
