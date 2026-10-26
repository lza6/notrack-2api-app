package defpackage;

import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import app.template.extension.BuildConfig;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class xk2 implements t61 {
    public final String a;
    public final jq2 b;
    public final ly1 c;
    public final yq3 d;
    public final ly1 e;
    public final tl0 f;

    public xk2(String str, jq2 jq2Var, yq3 yq3Var, yq3 yq3Var2, yq3 yq3Var3, tl0 tl0Var) {
        this.a = str;
        this.b = jq2Var;
        this.c = yq3Var;
        this.d = yq3Var2;
        this.e = yq3Var3;
        this.f = tl0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(xk2 xk2Var, am3 am3Var, uo0 uo0Var) {
        vk2 vk2Var;
        dy dyVar;
        if (uo0Var instanceof vk2) {
            vk2Var = (vk2) uo0Var;
            int i = vk2Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                vk2Var.l = i - Integer.MIN_VALUE;
            } else {
                vk2Var = new vk2(xk2Var, uo0Var);
            }
        } else {
            vk2Var = new vk2(xk2Var, uo0Var);
        }
        Object obj = vk2Var.d;
        int i2 = vk2Var.l;
        if (i2 == 0) {
            g13.O(obj);
            dy dyVar2 = new dy();
            vk2Var.c = dyVar2;
            vk2Var.l = 1;
            am3Var.c.B(dyVar2);
            w84 w84Var = w84.a;
            hq0 hq0Var = hq0.c;
            if (w84Var == hq0Var) {
                return hq0Var;
            }
            dyVar = dyVar2;
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dyVar = vk2Var.c;
            g13.O(obj);
        }
        return py.f(dyVar, xk2Var.e());
    }

    /* JADX WARN: Code duplicated, block: B:112:0x021c A[Catch: Exception -> 0x003d, TryCatch #8 {Exception -> 0x003d, blocks: (B:13:0x0038, B:107:0x0201, B:108:0x020b, B:110:0x0219, B:112:0x021c, B:116:0x0226, B:117:0x0227, B:109:0x020c), top: B:151:0x0038, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0223  */
    /* JADX WARN: Code duplicated, block: B:132:0x0244  */
    /* JADX WARN: Code duplicated, block: B:145:0x020c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0234 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x023e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0176  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [sz0] */
    /* JADX WARN: Type inference failed for: r1v13, types: [sz0] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v6, types: [sz0] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31, types: [sz0] */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    public static final Object c(xk2 xk2Var, b33 b33Var, gl2 gl2Var, gl2 gl2Var2, uo0 uo0Var) throws Exception {
        wk2 wk2Var;
        gl2 gl2Var3;
        sz0 sz0Var;
        ?? r4;
        ?? r1;
        ?? th;
        ?? th2;
        hw0 hw0VarC;
        sz0 sz0Var2;
        am3 am3Var;
        am3 am3Var2;
        hw0 hw0Var;
        lw0 lw0Var;
        jw0 jw0VarH;
        b33 b33Var2 = b33Var;
        gl2 gl2Var4 = gl2Var2;
        if (uo0Var instanceof wk2) {
            wk2Var = (wk2) uo0Var;
            int i = wk2Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                wk2Var.o = i - Integer.MIN_VALUE;
            } else {
                wk2Var = new wk2(xk2Var, uo0Var);
            }
        } else {
            wk2Var = new wk2(xk2Var, uo0Var);
        }
        Object vzVar = wk2Var.m;
        hq0 hq0Var = hq0.c;
        int i2 = wk2Var.o;
        b33 b33Var3 = null;
        if (i2 == 0) {
            g13.O(vzVar);
            if (!xk2Var.b.h.d) {
                if (b33Var2 == null) {
                    return null;
                }
                try {
                    ud2.u(b33Var2);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
                return null;
            }
            ls0 ls0Var = (ls0) xk2Var.e.getValue();
            wk2Var.c = b33Var2;
            wk2Var.d = gl2Var4;
            wk2Var.o = 1;
            ls0Var.getClass();
            if (gl2Var4.a != 304 || gl2Var == null) {
                vzVar = new vz(gl2Var4);
            } else {
                yk2 yk2Var = gl2Var.d;
                yk2 yk2Var2 = gl2Var4.d;
                yk2Var.getClass();
                Map map = yk2Var.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ke0.P0((Collection) entry.getValue()));
                }
                for (Map.Entry entry2 : yk2Var2.a.entrySet()) {
                    String str = (String) entry2.getKey();
                    List list = (List) entry2.getValue();
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    linkedHashMap.put(lowerCase, ke0.P0(list));
                }
                vzVar = new vz(new gl2(gl2Var4.a, gl2Var4.b, gl2Var4.c, new yk2(y92.W(linkedHashMap)), null, gl2Var4.f));
            }
            if (vzVar == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r1 = wk2Var.l;
                gl2Var3 = wk2Var.h;
                gl2Var4 = wk2Var.d;
                try {
                    g13.O(vzVar);
                    r1 = r1;
                    hw0Var = (hw0) r1.c;
                    lw0Var = (lw0) hw0Var.d;
                    synchronized (lw0Var.p) {
                        hw0Var.a(true);
                        jw0VarH = lw0Var.h(((iw0) hw0Var.c).a);
                    }
                    return jw0VarH != null ? new b33(jw0VarH) : b33Var3;
                } catch (Exception e2) {
                    e = e2;
                    try {
                        ((hw0) r1.c).a(false);
                    } catch (Exception unused2) {
                    }
                    am3Var = gl2Var4.e;
                    if (am3Var != null) {
                        try {
                            ud2.u(am3Var);
                        } catch (RuntimeException e3) {
                            throw e3;
                        } catch (Exception unused3) {
                        }
                    }
                    am3Var2 = gl2Var3.e;
                    if (am3Var2 != null) {
                        throw e;
                    }
                    try {
                        ud2.u(am3Var2);
                        throw e;
                    } catch (RuntimeException e4) {
                        throw e4;
                    } catch (Exception unused4) {
                        throw e;
                    }
                }
            }
            gl2 gl2Var5 = wk2Var.d;
            b33 b33Var4 = wk2Var.c;
            g13.O(vzVar);
            gl2Var4 = gl2Var5;
            b33Var2 = b33Var4;
            b33Var3 = null;
        }
        gl2Var3 = ((vz) vzVar).a;
        if (gl2Var3 == null) {
            return b33Var3;
        }
        if (b33Var2 != null) {
            jw0 jw0Var = b33Var2.c;
            lw0 lw0Var2 = jw0Var.h;
            synchronized (lw0Var2.p) {
                jw0Var.close();
                hw0VarC = lw0Var2.c(jw0Var.c.a);
            }
            if (hw0VarC != null) {
                sz0Var2 = new sz0(hw0VarC);
            } else {
                r4 = b33Var3;
            }
        } else {
            c33 c33Var = (c33) xk2Var.d.getValue();
            if (c33Var == null) {
                r4 = b33Var3;
            } else {
                String str2 = xk2Var.b.e;
                if (str2 == null) {
                    str2 = xk2Var.a;
                }
                lw0 lw0Var3 = c33Var.b;
                lz lzVar = lz.l;
                hw0 hw0VarC2 = lw0Var3.c(Path$Companion.encodeUtf8(str2).b("SHA-256").d());
                if (hw0VarC2 != null) {
                    sz0Var = new sz0(hw0VarC2);
                } else {
                    r4 = b33Var3;
                }
            }
        }
        if (r4 == 0) {
            r4 = sz0Var;
            r4 = sz0Var2;
            return b33Var3;
        }
        try {
            r4 = sz0Var;
            r4 = sz0Var2;
            zh3 zh3VarQ = xk2Var.e().Q(((hw0) r4.c).b(0), false);
            zh3VarQ.getClass();
            t23 t23Var = new t23(zh3VarQ);
            try {
                jr1.R(gl2Var3, t23Var);
                try {
                    t23Var.close();
                    th = b33Var3;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                try {
                    t23Var.close();
                } catch (Throwable th5) {
                    gb2.l(th4, th5);
                }
                th = th4;
            }
            if (th != 0) {
                throw th;
            }
            am3 am3Var3 = gl2Var3.e;
            if (am3Var3 != null) {
                a71 a71VarE = xk2Var.e();
                mt2 mt2VarB = ((hw0) r4.c).b(1);
                b33Var3 = b33Var3;
                wk2Var.c = b33Var3;
                wk2Var.d = gl2Var4;
                wk2Var.h = gl2Var3;
                wk2Var.l = r4;
                wk2Var.o = 2;
                ny nyVar = am3Var3.c;
                zh3 zh3VarQ2 = a71VarE.Q(mt2VarB, false);
                zh3VarQ2.getClass();
                t23 t23Var2 = new t23(zh3VarQ2);
                try {
                    new Long(nyVar.B(t23Var2));
                    try {
                        t23Var2.close();
                        th2 = b33Var3;
                    } catch (Throwable th6) {
                        th2 = th6;
                    }
                } catch (Throwable th7) {
                    try {
                        t23Var2.close();
                    } catch (Throwable th8) {
                        gb2.l(th7, th8);
                    }
                    th2 = th7;
                }
                if (th2 != 0) {
                    throw th2;
                }
                if (w84.a == hq0Var) {
                    return hq0Var;
                }
            } else {
                b33Var3 = b33Var3;
            }
            r1 = r4;
            hw0Var = (hw0) r1.c;
            lw0Var = (lw0) hw0Var.d;
            synchronized (lw0Var.p) {
                hw0Var.a(true);
                jw0VarH = lw0Var.h(((iw0) hw0Var.c).a);
                if (jw0VarH != null) {
                }
            }
        } catch (Exception e5) {
            e = e5;
            r1 = r4;
            ((hw0) r1.c).a(false);
            am3Var = gl2Var4.e;
            if (am3Var != null) {
                ud2.u(am3Var);
            }
            am3Var2 = gl2Var3.e;
            if (am3Var2 != null) {
                throw e;
            }
            ud2.u(am3Var2);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0012  */
    public static String f(String str, String str2) {
        String mimeTypeFromExtension;
        if (str2 == null || to3.q0(str2, "text/plain", false)) {
            if (mo3.C0(str)) {
                mimeTypeFromExtension = null;
            } else {
                String strS0 = mo3.S0('?', mo3.S0('#', str));
                String strQ0 = mo3.Q0(mo3.Q0(strS0, '/', strS0), '.', BuildConfig.VERSION_NAME);
                if (mo3.C0(strQ0)) {
                    mimeTypeFromExtension = null;
                } else {
                    String lowerCase = strQ0.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    mimeTypeFromExtension = (String) ge2.a.get(lowerCase);
                    if (mimeTypeFromExtension == null) {
                        mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                    }
                }
            }
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        if (str2 != null) {
            return mo3.R0(';', str2);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:68:0x015f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0160 A[Catch: Exception -> 0x0041, PHI: r0 r1
  0x0160: PHI (r0v26 java.lang.Object) = (r0v19 java.lang.Object), (r0v2 java.lang.Object) binds: [B:67:0x015d, B:22:0x0050] A[DONT_GENERATE, DONT_INLINE]
  0x0160: PHI (r1v10 q43) = (r1v8 q43), (r1v16 q43) binds: [B:67:0x015d, B:22:0x0050] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {Exception -> 0x0041, blocks: (B:15:0x003c, B:74:0x017c, B:22:0x0050, B:69:0x0160, B:71:0x0164, B:58:0x011d, B:60:0x0123, B:66:0x0148, B:41:0x00a7, B:43:0x00ae, B:45:0x00bc, B:52:0x00ec, B:54:0x00f8, B:48:0x00d0, B:50:0x00da, B:63:0x013f, B:64:0x0146), top: B:86:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0164 A[Catch: Exception -> 0x0041, TryCatch #3 {Exception -> 0x0041, blocks: (B:15:0x003c, B:74:0x017c, B:22:0x0050, B:69:0x0160, B:71:0x0164, B:58:0x011d, B:60:0x0123, B:66:0x0148, B:41:0x00a7, B:43:0x00ae, B:45:0x00bc, B:52:0x00ec, B:54:0x00f8, B:48:0x00d0, B:50:0x00da, B:63:0x013f, B:64:0x0146), top: B:86:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0179, code lost:
    
        if (r0 == r11) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    @Override // defpackage.t61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.so0 r18) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xk2.a(so0):java.lang.Object");
    }

    public final Object d(cl2 cl2Var, ne1 ne1Var, uk2 uk2Var) {
        if (this.b.i.c && kr1.n(Looper.myLooper(), Looper.getMainLooper())) {
            throw new NetworkOnMainThreadException();
        }
        zz zzVar = (zz) this.c.getValue();
        return zz.a(zzVar.a, cl2Var, new k(ne1Var, null, 22), uk2Var);
    }

    public final a71 e() {
        a71 a71Var;
        c33 c33Var = (c33) this.d.getValue();
        return (c33Var == null || (a71Var = c33Var.a) == null) ? this.b.f : a71Var;
    }

    public final cl2 g() {
        f61 f61Var = qm1.b;
        jq2 jq2Var = this.b;
        yk2 yk2Var = (yk2) y64.A(jq2Var, f61Var);
        yk2Var.getClass();
        nr0 nr0Var = new nr0(yk2Var);
        tz tzVar = jq2Var.h;
        boolean z = tzVar.c;
        boolean z2 = jq2Var.i.c && this.f.a();
        if (!z2 && z) {
            nr0Var.e("only-if-cached, max-stale=2147483647");
        } else if (!z2 || z) {
            if (!z2 && !z) {
                nr0Var.e("no-cache, only-if-cached");
            }
        } else if (tzVar.d) {
            nr0Var.e("no-cache");
        } else {
            nr0Var.e("no-cache, no-store");
        }
        String str = (String) y64.A(jq2Var, qm1.a);
        yk2 yk2Var2 = new yk2(y92.W(nr0Var.a));
        if (y64.A(jq2Var, qm1.c) == null) {
            return new cl2(this.a, str, yk2Var2, jq2Var.j);
        }
        m51.t();
        return null;
    }

    public final y61 h(b33 b33Var) {
        jw0 jw0Var = b33Var.c;
        if (jw0Var.d) {
            u41.r("snapshot is closed");
            return null;
        }
        mt2 mt2Var = (mt2) jw0Var.c.c.get(1);
        a71 a71VarE = e();
        String str = this.b.e;
        if (str == null) {
            str = this.a;
        }
        return py.e(mt2Var, a71VarE, str, b33Var, 16);
    }

    public final gl2 i(b33 b33Var) throws Throwable {
        Throwable th;
        gl2 gl2VarF;
        try {
            a71 a71VarE = e();
            jw0 jw0Var = b33Var.c;
            if (jw0Var.d) {
                throw new IllegalStateException("snapshot is closed");
            }
            wl3 wl3VarR = a71VarE.R((mt2) jw0Var.c.c.get(0));
            wl3VarR.getClass();
            u23 u23Var = new u23(wl3VarR);
            try {
                gl2VarF = jr1.F(u23Var);
                try {
                    u23Var.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    u23Var.close();
                } catch (Throwable th4) {
                    gb2.l(th3, th4);
                }
                th = th3;
                gl2VarF = null;
            }
            if (th == null) {
                return gl2VarF;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }
}
