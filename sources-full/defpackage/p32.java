package defpackage;

import android.os.Looper;
import androidx.lifecycle.Lifecycle$Event$Companion;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class p32 extends h32 {
    public final boolean a;
    public m61 b;
    public g32 c;
    public final WeakReference d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;
    public final jn3 i;

    public p32(n32 n32Var) {
        new AtomicReference(null);
        this.a = true;
        this.b = new m61();
        g32 g32Var = g32.d;
        this.c = g32Var;
        this.h = new ArrayList();
        this.d = new WeakReference(n32Var);
        this.i = gb2.f(g32Var);
    }

    @Override // defpackage.h32
    public final void a(m32 m32Var) {
        k32 gt0Var;
        Object obj;
        n32 n32Var;
        f32 f32Var;
        m32Var.getClass();
        d("addObserver");
        g32 g32Var = this.c;
        g32 g32Var2 = g32.c;
        if (g32Var != g32Var2) {
            g32Var2 = g32.d;
        }
        o32 o32Var = new o32();
        HashMap map = u32.a;
        boolean z = m32Var instanceof k32;
        boolean z2 = m32Var instanceof et0;
        int i = 2;
        if (z && z2) {
            gt0Var = new gt0((et0) m32Var, (k32) m32Var);
        } else if (z2) {
            gt0Var = new gt0((et0) m32Var, (k32) null);
        } else if (z) {
            gt0Var = (k32) m32Var;
        } else {
            Class<?> cls = m32Var.getClass();
            if (u32.b(cls) == 2) {
                Object obj2 = u32.b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    u32.a((Constructor) list.get(0), m32Var);
                    throw null;
                }
                int size = list.size();
                af1[] af1VarArr = new af1[size];
                if (size > 0) {
                    u32.a((Constructor) list.get(0), m32Var);
                    throw null;
                }
                gt0Var = new g43(i, af1VarArr);
            } else {
                gt0Var = new gt0(m32Var);
            }
        }
        o32Var.b = gt0Var;
        o32Var.a = g32Var2;
        m61 m61Var = this.b;
        u83 u83VarB = m61Var.b(m32Var);
        if (u83VarB != null) {
            obj = u83VarB.d;
        } else {
            HashMap map2 = m61Var.m;
            u83 u83Var = new u83(m32Var, o32Var);
            m61Var.l++;
            u83 u83Var2 = m61Var.d;
            if (u83Var2 == null) {
                m61Var.c = u83Var;
                m61Var.d = u83Var;
            } else {
                u83Var2.h = u83Var;
                u83Var.l = u83Var2;
                m61Var.d = u83Var;
            }
            map2.put(m32Var, u83Var);
            obj = null;
        }
        if (((o32) obj) == null && (n32Var = (n32) this.d.get()) != null) {
            boolean z3 = this.e != 0 || this.f;
            g32 g32VarC = c(m32Var);
            this.e++;
            while (o32Var.a.compareTo(g32VarC) < 0 && this.b.m.containsKey(m32Var)) {
                g32 g32Var3 = o32Var.a;
                ArrayList arrayList = this.h;
                arrayList.add(g32Var3);
                Lifecycle$Event$Companion lifecycle$Event$Companion = f32.Companion;
                g32 g32Var4 = o32Var.a;
                lifecycle$Event$Companion.getClass();
                g32Var4.getClass();
                int iOrdinal = g32Var4.ordinal();
                if (iOrdinal == 1) {
                    f32Var = f32.ON_CREATE;
                } else if (iOrdinal != 2) {
                    f32Var = iOrdinal != 3 ? null : f32.ON_RESUME;
                } else {
                    f32Var = f32.ON_START;
                }
                if (f32Var == null) {
                    m51.B(o32Var.a, "no event up from ");
                    return;
                } else {
                    o32Var.a(n32Var, f32Var);
                    arrayList.remove(arrayList.size() - 1);
                    g32VarC = c(m32Var);
                }
            }
            if (!z3) {
                g();
            }
            this.e--;
        }
    }

    @Override // defpackage.h32
    public final void b(m32 m32Var) {
        m32Var.getClass();
        d("removeObserver");
        this.b.d(m32Var);
    }

    public final g32 c(m32 m32Var) {
        o32 o32Var;
        HashMap map = this.b.m;
        u83 u83Var = map.containsKey(m32Var) ? ((u83) map.get(m32Var)).l : null;
        g32 g32Var = (u83Var == null || (o32Var = (o32) u83Var.d) == null) ? null : o32Var.a;
        ArrayList arrayList = this.h;
        g32 g32Var2 = arrayList.isEmpty() ? null : (g32) arrayList.get(arrayList.size() - 1);
        g32 g32Var3 = this.c;
        g32Var3.getClass();
        if (g32Var == null || g32Var.compareTo(g32Var3) >= 0) {
            g32Var = g32Var3;
        }
        return (g32Var2 == null || g32Var2.compareTo(g32Var) >= 0) ? g32Var : g32Var2;
    }

    public final void d(String str) {
        if (this.a) {
            bl.q0().m.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            j93.b(fq2.n("Method ", str, " must be called on the main thread"));
        }
    }

    public final void e(f32 f32Var) {
        f32Var.getClass();
        d("handleLifecycleEvent");
        f(f32Var.a());
    }

    public final void f(g32 g32Var) {
        g32 g32Var2 = this.c;
        if (g32Var2 == g32Var) {
            return;
        }
        g32 g32Var3 = g32.d;
        g32 g32Var4 = g32.c;
        if (g32Var2 == g32Var3 && g32Var == g32Var4) {
            StringBuilder sb = new StringBuilder("State must be at least CREATED to move to ");
            sb.append(g32Var);
            sb.append(", but was ");
            sb.append(this.c);
            Object obj = this.d.get();
            sb.append(" in component ");
            sb.append(obj);
            throw new IllegalStateException(sb.toString().toString());
        }
        this.c = g32Var;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        g();
        this.f = false;
        if (this.c == g32Var4) {
            this.b = new m61();
        }
    }

    public final void g() {
        f32 f32Var;
        f32 f32Var2;
        n32 n32Var = (n32) this.d.get();
        if (n32Var == null) {
            u41.r("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            m61 m61Var = this.b;
            if (m61Var.l != 0) {
                u83 u83Var = m61Var.c;
                u83Var.getClass();
                g32 g32Var = ((o32) u83Var.d).a;
                u83 u83Var2 = this.b.d;
                u83Var2.getClass();
                g32 g32Var2 = ((o32) u83Var2.d).a;
                if (g32Var == g32Var2 && this.c == g32Var2) {
                    break;
                }
                this.g = false;
                g32 g32Var3 = this.c;
                u83 u83Var3 = this.b.c;
                u83Var3.getClass();
                int iCompareTo = g32Var3.compareTo(((o32) u83Var3.d).a);
                ArrayList arrayList = this.h;
                if (iCompareTo < 0) {
                    m61 m61Var2 = this.b;
                    t83 t83Var = new t83(m61Var2.d, m61Var2.c, 1);
                    m61Var2.h.put(t83Var, Boolean.FALSE);
                    while (t83Var.hasNext() && !this.g) {
                        Map.Entry entry = (Map.Entry) t83Var.next();
                        entry.getClass();
                        m32 m32Var = (m32) entry.getKey();
                        o32 o32Var = (o32) entry.getValue();
                        while (o32Var.a.compareTo(this.c) > 0 && !this.g && this.b.m.containsKey(m32Var)) {
                            Lifecycle$Event$Companion lifecycle$Event$Companion = f32.Companion;
                            g32 g32Var4 = o32Var.a;
                            lifecycle$Event$Companion.getClass();
                            g32Var4.getClass();
                            int iOrdinal = g32Var4.ordinal();
                            if (iOrdinal == 2) {
                                f32Var2 = f32.ON_DESTROY;
                            } else if (iOrdinal != 3) {
                                f32Var2 = iOrdinal != 4 ? null : f32.ON_PAUSE;
                            } else {
                                f32Var2 = f32.ON_STOP;
                            }
                            if (f32Var2 == null) {
                                m51.B(o32Var.a, "no event down from ");
                                return;
                            } else {
                                arrayList.add(f32Var2.a());
                                o32Var.a(n32Var, f32Var2);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
                u83 u83Var4 = this.b.d;
                if (!this.g && u83Var4 != null && this.c.compareTo(((o32) u83Var4.d).a) > 0) {
                    m61 m61Var3 = this.b;
                    m61Var3.getClass();
                    v83 v83Var = new v83(m61Var3);
                    m61Var3.h.put(v83Var, Boolean.FALSE);
                    while (v83Var.hasNext() && !this.g) {
                        Map.Entry entry2 = (Map.Entry) v83Var.next();
                        m32 m32Var2 = (m32) entry2.getKey();
                        o32 o32Var2 = (o32) entry2.getValue();
                        while (o32Var2.a.compareTo(this.c) < 0 && !this.g && this.b.m.containsKey(m32Var2)) {
                            arrayList.add(o32Var2.a);
                            Lifecycle$Event$Companion lifecycle$Event$Companion2 = f32.Companion;
                            g32 g32Var5 = o32Var2.a;
                            lifecycle$Event$Companion2.getClass();
                            g32Var5.getClass();
                            int iOrdinal2 = g32Var5.ordinal();
                            if (iOrdinal2 == 1) {
                                f32Var = f32.ON_CREATE;
                            } else if (iOrdinal2 != 2) {
                                f32Var = iOrdinal2 != 3 ? null : f32.ON_RESUME;
                            } else {
                                f32Var = f32.ON_START;
                            }
                            if (f32Var == null) {
                                m51.B(o32Var2.a, "no event up from ");
                                return;
                            } else {
                                o32Var2.a(n32Var, f32Var);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.g = false;
        this.i.o(this.c);
    }
}
