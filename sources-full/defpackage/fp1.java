package defpackage;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import app.template.extension.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import notrack.ai.data.api.ChatEvent;
import okhttp3.Protocol$Companion;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class fp1 implements c00, x93 {
    public static final fp1 h;
    public Object c;
    public Object d;

    static {
        Object obj = null;
        h = new fp1(obj, obj);
    }

    public fp1(View view) {
        this.c = view;
        this.d = yo4.H(q22.d, new j(19, this));
    }

    public fp1(EditText editText) {
        this.c = editText;
        sz0 sz0Var = new sz0();
        fy2 fy2Var = new fy2();
        fy2Var.c = editText;
        p21 p21Var = new p21(editText);
        fy2Var.d = p21Var;
        editText.addTextChangedListener(p21Var);
        if (c21.b == null) {
            synchronized (c21.a) {
                try {
                    if (c21.b == null) {
                        c21 c21Var = new c21();
                        try {
                            c21.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, c21.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        c21.b = c21Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        editText.setEditableFactory(c21.b);
        sz0Var.c = fy2Var;
        this.d = sz0Var;
    }

    public /* synthetic */ fp1(Object obj, Object obj2) {
        this.c = obj;
        this.d = obj2;
    }

    public fp1(tz2 tz2Var, zh4 zh4Var) {
        tz2Var.getClass();
        zh4Var.getClass();
        this.c = tz2Var;
        this.d = zh4Var;
    }

    public fp1(xz3 xz3Var, p84 p84Var) {
        this.c = p84Var;
        this.d = cl3.d(xz3Var);
    }

    public static fp1 d(fp1 fp1Var, wl2 wl2Var, xy3 xy3Var, int i) {
        cx1 cx1Var = wl2Var;
        if ((i & 1) != 0) {
            cx1Var = (cx1) fp1Var.c;
        }
        if ((i & 2) != 0) {
            xy3Var = (xy3) fp1Var.d;
        }
        return new fp1(cx1Var, xy3Var);
    }

    @Override // defpackage.c00
    public void a(y23 y23Var, f63 f63Var) {
        ny nyVarD;
        String strV;
        Object i63Var;
        Object i63Var2;
        Object i63Var3;
        Object objL;
        Object i63Var4;
        e60 e60Var = (e60) this.d;
        wz2 wz2Var = (wz2) this.c;
        m33 m33Var = f63Var.o;
        int i = f63Var.l;
        if (f63Var.c()) {
            if (m33Var == null || (nyVarD = m33Var.D()) == null) {
                wz2Var.h0(null);
                return;
            }
            while (!nyVarD.r() && (strV = nyVarD.v()) != null) {
                try {
                    try {
                        if (to3.q0(strV, "data: ", false)) {
                            String string = mo3.U0(mo3.J0(strV, "data: ")).toString();
                            if (string.length() > 0) {
                                try {
                                    kt1 kt1Var = e60Var.j;
                                    kt1Var.getClass();
                                    wz2Var.i((ChatEvent) kt1Var.b(ChatEvent.Companion.serializer(), string));
                                } catch (Exception unused) {
                                    wz2Var.i(new ChatEvent.Unknown(string));
                                }
                            } else {
                                continue;
                            }
                        }
                    } catch (Exception e) {
                        Log.w("NoTrack", "stream broke", e);
                        wz2Var.i(new ChatEvent.Error("offline:" + e60Var.k(e, true), null, null, null));
                    }
                } catch (Throwable th) {
                    f63Var.close();
                    wz2Var.h0(null);
                    throw th;
                }
            }
            f63Var.close();
            wz2Var.h0(null);
            return;
        }
        Object obj = BuildConfig.VERSION_NAME;
        if (i == 403) {
            try {
                i63Var = f63Var.l().l();
            } catch (Throwable th2) {
                i63Var = new i63(th2);
            }
            if (i63Var instanceof i63) {
                i63Var = BuildConfig.VERSION_NAME;
            }
            try {
                i63Var2 = new JSONObject(mo3.U0(mo3.P0((String) i63Var, "data: ")).toString());
            } catch (Throwable th3) {
                i63Var2 = new i63(th3);
            }
            if (i63Var2 instanceof i63) {
                i63Var2 = null;
            }
            JSONObject jSONObject = (JSONObject) i63Var2;
            if (kr1.n(jSONObject != null ? jSONObject.optString("code") : null, "unofficial")) {
                String strOptString = jSONObject.optString("url");
                strOptString.getClass();
                if (!mo3.C0(strOptString)) {
                    String strOptString2 = jSONObject.optString("content", jSONObject.optString("message"));
                    strOptString2.getClass();
                    String strOptString3 = jSONObject.optString("url");
                    String strOptString4 = jSONObject.optString("cta");
                    if (mo3.C0(strOptString4)) {
                        strOptString4 = null;
                    }
                    wz2Var.i(new ChatEvent.Error(strOptString2, "unofficial", strOptString3, strOptString4));
                    f63Var.close();
                    wz2Var.h0(null);
                    return;
                }
            }
        }
        if (i == 400) {
            if (m33Var != null) {
                try {
                    objL = m33Var.l();
                } catch (Throwable th4) {
                    i63Var3 = new i63(th4);
                }
            } else {
                objL = null;
            }
            i63Var3 = objL == null ? BuildConfig.VERSION_NAME : objL;
            if (!(i63Var3 instanceof i63)) {
                obj = i63Var3;
            }
            try {
                i63Var4 = new JSONObject(mo3.U0(mo3.P0((String) obj, "data: ")).toString());
            } catch (Throwable th5) {
                i63Var4 = new i63(th5);
            }
            if (i63Var4 instanceof i63) {
                i63Var4 = null;
            }
            JSONObject jSONObject2 = (JSONObject) i63Var4;
            if (kr1.n(jSONObject2 != null ? jSONObject2.optString("code") : null, "too_long")) {
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("limits");
                wz2Var.i(new ChatEvent.Error("too_long:".concat(ke0.D0(kr1.U(jSONObject2.optString("plan", "free"), Integer.valueOf(jSONObject2.optInt("max", 4000)), Integer.valueOf(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optInt("plus") : 0), Integer.valueOf(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optInt("pro") : 0)), ":", null, null, null, 62)), null, null, null));
                wz2Var.h0(null);
                return;
            }
        }
        wz2Var.i(new ChatEvent.Error(ud2.m(i, "offline:HTTP "), null, null, null));
        wz2Var.h0(null);
    }

    public ey3 b(List list) {
        n11 n11Var;
        Exception e;
        try {
            int size = list.size();
            int i = 0;
            n11Var = null;
            while (i < size) {
                try {
                    n11 n11Var2 = (n11) list.get(i);
                    try {
                        n11Var2.a((o11) this.d);
                        i++;
                        n11Var = n11Var2;
                    } catch (Exception e2) {
                        e = e2;
                        n11Var = n11Var2;
                        StringBuilder sb = new StringBuilder();
                        StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                        sb2.append(((o11) this.d).a.g());
                        sb2.append(", composition=");
                        sb2.append(((o11) this.d).c());
                        sb2.append(", selection=");
                        o11 o11Var = (o11) this.d;
                        sb2.append((Object) jz3.h(p23.d(o11Var.b, o11Var.c)));
                        sb2.append("):");
                        sb.append(sb2.toString());
                        sb.append('\n');
                        ke0.C0(list, sb, new e8(n11Var, this), 60);
                        throw new RuntimeException(sb.toString(), e);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
            o11 o11Var2 = (o11) this.d;
            o11Var2.getClass();
            hg hgVar = new hg(o11Var2.a.toString());
            o11 o11Var3 = (o11) this.d;
            long jD = p23.d(o11Var3.b, o11Var3.c);
            jz3 jz3Var = jz3.g(((ey3) this.c).b) ? null : new jz3(jD);
            ey3 ey3Var = new ey3(hgVar, jz3Var != null ? jz3Var.a : p23.d(jz3.e(jD), jz3.f(jD)), ((o11) this.d).c());
            this.c = ey3Var;
            return ey3Var;
        } catch (Exception e4) {
            n11Var = null;
            e = e4;
        }
    }

    public void c(List list) {
        ra2 ra2Var = (ra2) this.d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rj1 rj1Var = (rj1) it.next();
            if (rj1Var.m()) {
                ds3 ds3VarW = ra2Var.W((String) rj1Var.h);
                if (ds3VarW != null) {
                    ds3VarW.a((ir3) this.c, ra2Var, rj1Var);
                } else {
                    ArrayList arrayList = rj1Var.n;
                    c(arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList));
                }
            }
        }
    }

    public void e() {
        ft2 ft2Var = (ft2) this.d;
        pk3 currentThreadSnapshot = Protocol$Companion.getCurrentThreadSnapshot();
        le1 le1VarE = currentThreadSnapshot != null ? currentThreadSnapshot.e() : null;
        pk3 pk3VarMakeCurrentNonObservable = Protocol$Companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            xz3 xz3Var = (xz3) ft2Var.getValue();
            Protocol$Companion.restoreNonObservable(currentThreadSnapshot, pk3VarMakeCurrentNonObservable, le1VarE);
            if (xz3Var != null) {
                p84 p84Var = (p84) this.c;
                ml3 ml3Var = p84Var.b;
                ml3 ml3Var2 = p84Var.c;
                ml3Var2.clear();
                while (ml3Var2.size() + ml3Var.size() > p84Var.a - 1) {
                    ml3Var.getClass();
                    if (ml3Var.isEmpty()) {
                        j93.g("List is empty.");
                        return;
                    }
                    ml3Var.remove(0);
                }
                ml3Var.add(xz3Var);
            }
            ft2Var.setValue(null);
        } catch (Throwable th) {
            Protocol$Companion.restoreNonObservable(currentThreadSnapshot, pk3VarMakeCurrentNonObservable, le1VarE);
            throw th;
        }
    }

    public InputMethodManager f() {
        return (InputMethodManager) ((ly1) this.d).getValue();
    }

    public KeyListener g(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((fy2) ((sz0) this.d).c).getClass();
        if (keyListener instanceof h21) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new h21(keyListener);
    }

    public void h(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.c).getContext().obtainStyledAttributes(attributeSet, g23.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public e21 i(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        sz0 sz0Var = (sz0) this.d;
        if (inputConnection == null) {
            sz0Var.getClass();
            inputConnection2 = null;
        } else {
            fy2 fy2Var = (fy2) sz0Var.c;
            fy2Var.getClass();
            if (!(inputConnection instanceof e21)) {
                inputConnection = new e21(editorInfo, inputConnection, (EditText) fy2Var.c);
            }
            inputConnection2 = inputConnection;
        }
        return (e21) inputConnection2;
    }

    @Override // defpackage.x93
    public Object j(Object obj) {
        return ((le1) this.d).invoke(obj);
    }

    @Override // defpackage.c00
    public void k(y23 y23Var, IOException iOException) {
        Log.w("NoTrack", "dispatch failed", iOException);
        wz2 wz2Var = (wz2) this.c;
        wz2Var.i(new ChatEvent.Error("offline:".concat(((e60) this.d).k(iOException, false)), null, null, null));
        wz2Var.h0(null);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    public void l(xz3 xz3Var) {
        xz3 xz3Var2;
        xz3 xz3Var3;
        ft2 ft2Var = (ft2) this.d;
        String str = xz3Var.c;
        pk3 currentThreadSnapshot = Protocol$Companion.getCurrentThreadSnapshot();
        le1 le1VarE = currentThreadSnapshot != null ? currentThreadSnapshot.e() : null;
        pk3 pk3VarMakeCurrentNonObservable = Protocol$Companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            xz3 xz3Var4 = (xz3) ft2Var.getValue();
            Protocol$Companion.restoreNonObservable(currentThreadSnapshot, pk3VarMakeCurrentNonObservable, le1VarE);
            if (xz3Var4 == null) {
                ft2Var.setValue(xz3Var);
                return;
            }
            boolean z = xz3Var4.g;
            String str2 = xz3Var4.b;
            String str3 = xz3Var4.c;
            int i = xz3Var4.a;
            yt3 yt3Var = xz3Var4.h;
            if (z) {
                boolean z2 = xz3Var.g;
                String str4 = xz3Var.b;
                int i2 = xz3Var.a;
                if (z2) {
                    long j = xz3Var.f;
                    long j2 = xz3Var4.f;
                    if (j < j2 || j - j2 >= 5000 || kr1.n(str3, "\n") || kr1.n(str3, "\r\n") || kr1.n(str, "\n") || kr1.n(str, "\r\n") || yt3Var != xz3Var.h) {
                        xz3Var2 = null;
                    } else {
                        if (yt3Var == yt3.c && str3.length() + i == i2) {
                            xz3Var3 = new xz3(xz3Var4.a, BuildConfig.VERSION_NAME, ud2.p(str3, str), xz3Var4.d, xz3Var.e, xz3Var4.f, false, 64);
                        } else if (yt3Var != yt3.d || xz3Var4.a() != xz3Var.a() || (xz3Var4.a() != vt3.c && xz3Var4.a() != vt3.d)) {
                            xz3Var2 = null;
                        } else if (i == str4.length() + i2) {
                            xz3Var3 = new xz3(xz3Var.a, ud2.p(str4, str2), BuildConfig.VERSION_NAME, xz3Var4.d, xz3Var.e, xz3Var4.f, false, 64);
                        } else {
                            int i3 = xz3Var4.a;
                            if (i3 == i2) {
                                xz3Var2 = new xz3(i3, ud2.p(str2, str4), BuildConfig.VERSION_NAME, xz3Var4.d, xz3Var.e, xz3Var4.f, false, 64);
                            } else {
                                xz3Var2 = null;
                            }
                        }
                        xz3Var2 = xz3Var3;
                    }
                } else {
                    xz3Var2 = null;
                }
            } else {
                xz3Var2 = null;
            }
            if (xz3Var2 != null) {
                ft2Var.setValue(xz3Var2);
            } else {
                e();
                ft2Var.setValue(xz3Var);
            }
        } catch (Throwable th) {
            Protocol$Companion.restoreNonObservable(currentThreadSnapshot, pk3VarMakeCurrentNonObservable, le1VarE);
            throw th;
        }
    }

    public void m(boolean z) {
        p21 p21Var = (p21) ((fy2) ((sz0) this.d).c).d;
        if (p21Var.h != z) {
            if (p21Var.d != null) {
                y11 y11VarA = y11.a();
                o21 o21Var = p21Var.d;
                y11VarA.getClass();
                p23.n(o21Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = y11VarA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    y11VarA.b.remove(o21Var);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            p21Var.h = z;
            if (z) {
                p21.a(p21Var.c, y11.a().c());
            }
        }
    }

    @Override // defpackage.x93
    public Object n(a93 a93Var, Object obj) {
        return ((ne1) this.c).invoke(a93Var, obj);
    }

    public void o(dn3 dn3Var, zf3 zf3Var) {
        dn3Var.getClass();
        ((zh4) this.d).a(new p00(this, dn3Var, zf3Var, 5));
    }

    public void p(dn3 dn3Var, int i) {
        dn3Var.getClass();
        ((zh4) this.d).a(new xn3((tz2) this.c, dn3Var, false, i));
    }
}
