package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.database.Cursor;
import android.util.SparseIntArray;
import android.view.WindowInsetsAnimation;
import android.view.animation.Animation;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mi4 implements lp3, i61, io2 {
    public final /* synthetic */ int c;
    public Object d;
    public Object h;

    public mi4(int i) {
        this.c = i;
        switch (i) {
            case 12:
                vf1 vf1Var = vf1.c;
                this.d = new SparseIntArray();
                this.h = vf1Var;
                break;
            default:
                this.d = new LinkedHashMap();
                this.h = new LinkedHashMap();
                break;
        }
    }

    public /* synthetic */ mi4(int i, boolean z) {
        this.c = i;
    }

    public mi4(Animator animator) {
        this.c = 5;
        this.d = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.h = animatorSet;
        animatorSet.play(animator);
    }

    public mi4(WindowInsetsAnimation.Bounds bounds) {
        this.c = 11;
        this.d = pp1.c(bounds.getLowerBound());
        this.h = pp1.c(bounds.getUpperBound());
    }

    public mi4(Animation animation) {
        this.c = 5;
        this.d = animation;
        this.h = null;
    }

    public mi4(WorkDatabase_Impl workDatabase_Impl) {
        this.c = 0;
        this.d = workDatabase_Impl;
        this.h = new av0(workDatabase_Impl, 6);
        new hr3(workDatabase_Impl, 20);
    }

    public /* synthetic */ mi4(Object obj) {
        this.c = 8;
        this.h = obj;
        this.d = new ArrayList();
    }

    public /* synthetic */ mi4(Object obj, int i, Object obj2) {
        this.c = i;
        this.d = obj;
        this.h = obj2;
    }

    public mi4(mi4 mi4Var) {
        oi2 oi2Var;
        this.c = 3;
        this.d = new oi2(0, new u20[16]);
        this.h = new oi2(0, new u20[16]);
        if (mi4Var == null || (oi2Var = (oi2) mi4Var.d) == null) {
            return;
        }
        Object[] objArr = oi2Var.c;
        int i = oi2Var.h;
        for (int i2 = 0; i2 < i; i2++) {
            u20 u20Var = (u20) objArr[i2];
            ((oi2) this.d).c(new u20(u20Var.a, u20Var.b, u20Var.c, u20Var.d));
        }
    }

    public mi4(n02 n02Var) {
        this.c = 6;
        this.d = n02Var;
        rh2 rh2Var = cn2.a;
        this.h = new rh2();
    }

    public mi4(nr0 nr0Var) {
        this.c = 10;
        this.d = nr0Var;
        this.h = new Object();
    }

    public mi4(yj4 yj4Var, bg1 bg1Var) {
        this.c = 1;
        this.h = "ClientTelemetry.API";
        this.d = yj4Var;
    }

    @Override // defpackage.io2
    public void a(sd sdVar) {
        dt4 dt4Var = (dt4) this.d;
        us3 us3Var = (us3) this.h;
        synchronized (dt4Var.f) {
            dt4Var.e.remove(us3Var);
        }
    }

    public void b(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(length + 1 + strValueOf.length());
        sb.append(str);
        sb.append("=");
        sb.append(strValueOf);
        ((ArrayList) this.d).add(sb.toString());
    }

    public void c(u20 u20Var, int i, int i2, int i3) {
        int i4;
        oi2 oi2Var = (oi2) this.h;
        int i5 = oi2Var.h;
        if (i5 == 0) {
            i4 = 0;
        } else if (i5 == 0) {
            j93.g("MutableVector is empty.");
            return;
        } else {
            u20 u20Var2 = (u20) oi2Var.c[i5 - 1];
            i4 = u20Var2.b - u20Var2.d;
        }
        if (u20Var == null) {
            int i6 = i - i4;
            u20Var = new u20(i, i2 + i3, i6, (i2 - i) + i6);
        } else {
            if (u20Var.a > i) {
                u20Var.a = i;
                u20Var.c = i;
            }
            int i7 = u20Var.b;
            if (i2 > i7) {
                int i8 = i7 - u20Var.d;
                u20Var.b = i2;
                u20Var.d = i2 - i8;
            }
            u20Var.b += i3;
        }
        oi2Var.c(u20Var);
    }

    @Override // defpackage.lp3
    public void d(kp3 kp3Var) {
        rh2 rh2Var = (rh2) this.h;
        rh2Var.a();
        for (Object obj : kp3Var) {
            Object objB = ((n02) this.d).b(obj);
            int iD = rh2Var.d(objB);
            int i = iD >= 0 ? rh2Var.c[iD] : 0;
            if (i == 7) {
                kp3Var.remove(obj);
            } else {
                rh2Var.h(i + 1, objB);
            }
        }
    }

    @Override // defpackage.lp3
    public boolean e(Object obj, Object obj2) {
        n02 n02Var = (n02) this.d;
        return kr1.n(n02Var.b(obj), n02Var.b(obj2));
    }

    public void f() {
        ((oi2) this.d).i();
    }

    public boolean g(vh4 vh4Var) {
        boolean zContainsKey;
        synchronized (this.h) {
            zContainsKey = ((nr0) this.d).a.containsKey(vh4Var);
        }
        return zContainsKey;
    }

    @Override // defpackage.t13
    public Object get() {
        return new zd2((Context) ((f61) this.d).c, (ci4) ((jb) this.h).get());
    }

    public ArrayList h(String str) {
        q73 q73VarA = q73.a(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        q73VarA.i(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.d;
        workDatabase_Impl.b();
        Cursor cursorM = workDatabase_Impl.m(q73VarA);
        try {
            ArrayList arrayList = new ArrayList(cursorM.getCount());
            while (cursorM.moveToNext()) {
                arrayList.add(cursorM.getString(0));
            }
            cursorM.close();
            q73VarA.l();
            return arrayList;
        } catch (Throwable th) {
            cursorM.close();
            q73VarA.l();
            throw th;
        }
    }

    public dn3 i(vh4 vh4Var) {
        dn3 dn3VarC;
        vh4Var.getClass();
        synchronized (this.h) {
            dn3VarC = ((nr0) this.d).c(vh4Var);
        }
        return dn3VarC;
    }

    public List j(String str) {
        List listD;
        str.getClass();
        synchronized (this.h) {
            listD = ((nr0) this.d).d(str);
        }
        return listD;
    }

    public dn3 k(vh4 vh4Var) {
        dn3 dn3VarF;
        synchronized (this.h) {
            dn3VarF = ((nr0) this.d).f(vh4Var);
        }
        return dn3VarF;
    }

    public String toString() {
        int i = 0;
        switch (this.c) {
            case 3:
                StringBuilder sb = new StringBuilder("ChangeList(changes=[");
                oi2 oi2Var = (oi2) this.d;
                Object[] objArr = oi2Var.c;
                int i2 = oi2Var.h;
                while (i < i2) {
                    u20 u20Var = (u20) objArr[i];
                    sb.append("(" + u20Var.c + ',' + u20Var.d + ")->(" + u20Var.a + ',' + u20Var.b + ')');
                    if (i < ((oi2) this.d).h - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
                sb.append("])");
                return sb.toString();
            case 4:
                StringBuilder sb2 = new StringBuilder("CssProperty{key='");
                sb2.append((String) this.d);
                sb2.append("', value='");
                return fq2.r(sb2, (String) this.h, "'}");
            case 8:
                StringBuilder sb3 = new StringBuilder(100);
                sb3.append(this.h.getClass().getSimpleName());
                sb3.append('{');
                ArrayList arrayList = (ArrayList) this.d;
                int size = arrayList.size();
                while (i < size) {
                    sb3.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb3.append(", ");
                    }
                    i++;
                }
                sb3.append('}');
                return sb3.toString();
            case 11:
                return "Bounds{lower=" + ((pp1) this.d) + " upper=" + ((pp1) this.h) + "}";
            default:
                return super.toString();
        }
    }
}
