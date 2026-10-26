package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.content.SharedPreferences;
import app.template.extension.BuildConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.IntCompanionObject;
import notrack.ai.data.account.Entitlements;
import notrack.ai.data.api.ChatEvent;
import notrack.ai.data.avatars.AvatarView;
import notrack.ai.data.chatmeta.ChatMetaDoc;
import notrack.ai.data.promo.OwnCard;
import notrack.ai.data.promo.OwnConfig;
import notrack.ai.data.promo.OwnFacts;
import notrack.ai.data.promo.OwnSlot;
import notrack.ai.data.voice.VoiceConfig;
import okhttp3.Protocol$Companion;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class hb0 extends gd4 {
    public long A;
    public final StringBuilder B;
    public ym3 C;
    public Boolean D;
    public ym3 E;
    public final e60 b;
    public final jn3 c;
    public final s23 d;
    public final jy e;
    public final x20 f;
    public ym3 g;
    public ym3 h;
    public int i;
    public final yq3 j;
    public final bk k;
    public OwnCard l;
    public boolean m;
    public String n;
    public boolean o;
    public final jn3 p;
    public final s23 q;
    public final s23 r;
    public final jn3 s;
    public final s23 t;
    public final jn3 u;
    public final s23 v;
    public final jn3 w;
    public final s23 x;
    public final jn3 y;
    public final s23 z;

    public hb0(e60 e60Var) {
        Object value;
        xa0 xa0Var;
        String string;
        int i;
        Object value2;
        Object value3;
        xa0 xa0Var2;
        Object i63Var;
        qt qtVar;
        Entitlements entitlements;
        s23 s23Var;
        Object value4;
        Object i63Var2;
        AvatarView avatarView;
        Object i63Var3;
        AvatarView avatarView2;
        Object value5;
        Object value6;
        this.b = e60Var;
        tt ttVar = new tt(0, 0, 63, null);
        ChatMetaDoc chatMetaDoc = new ChatMetaDoc();
        Entitlements.Companion.getClass();
        Entitlements entitlements2 = Entitlements.ANONYMOUS;
        we4 we4Var = new we4(null, 0, 0.0f, null, 511);
        z21 z21Var = z21.c;
        g04 g04Var = g04.d;
        t94 t94Var = t94.a;
        f31 f31Var = f31.c;
        jn3 jn3VarF = gb2.f(new xa0(z21Var, false, null, BuildConfig.VERSION_NAME, z21Var, false, false, null, false, null, g04Var, 1.0f, "normal", "system", false, false, false, t94Var, z21Var, false, null, BuildConfig.VERSION_NAME, false, false, null, ttVar, null, false, 0L, null, 0, null, null, false, BuildConfig.VERSION_NAME, false, 0L, null, 0, null, true, false, null, null, null, null, false, null, BuildConfig.VERSION_NAME, chatMetaDoc, f31Var, false, f31Var, null, entitlements2, false, null, true, null, null, null, false, null, null, we4Var, false, null, null, null, null, null, null));
        this.c = jn3VarF;
        this.d = new s23(jn3VarF);
        int i2 = 6;
        so0 so0Var = null;
        jy jyVarB = gm4.b(-2, 6, null);
        this.e = jyVarB;
        this.f = new x20(jyVarB, false);
        L();
        boolean zA = this.b.a.a("app_lock_enabled", false);
        do {
            value = jn3VarF.getValue();
            xa0Var = (xa0) value;
            tu2 tu2Var = this.b.a;
            string = tu2Var.b().getString("uid", null);
            string = string == null ? tu2Var.d.getString("uid", null) : string;
            i = 8;
        } while (!jn3VarF.n(value, xa0.a(xa0Var, null, false, null, null, null, false, false, null, false, string != null ? mo3.T0(8, string) : null, this.b.a.a("theme_dark", true) ? g04Var : g04.c, qz3.d(this.b.j().getFloat("chatTextScale", 1.0f)), this.b.m(), null, this.b.a.a("secure_mode", false), zA, zA, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -122369, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
        r(false);
        int i3 = 3;
        py.F(id4.a(this), null, null, new bb0(this, so0Var, 12), 3);
        this.j = new yq3(new h60(this, i));
        boolean z = ef4.r;
        if (z) {
            py.F(id4.a(this), null, null, new bb0(this, so0Var, i2), 3);
            py.F(id4.a(this), null, null, new bb0(this, so0Var, 7), 3);
        }
        if (z) {
            py.F(id4.a(this), null, null, new fb0(this, (String) null, false, (so0) null), 3);
        }
        e60 e60Var2 = this.b;
        jn3 jn3Var = this.c;
        do {
            value2 = jn3Var.getValue();
        } while (!jn3Var.n(value2, xa0.a((xa0) value2, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, e60Var2.i().a("me"), e60Var2.i().a("ai"), -1, -1, 63)));
        py.F(id4.a(this), null, null, new bb0(this, so0Var, 10), 3);
        e60 e60Var3 = this.b;
        jn3 jn3Var2 = this.c;
        do {
            value3 = jn3Var2.getValue();
            xa0Var2 = (xa0) value3;
            String string2 = ((SharedPreferences) e60Var3.c.h).getString("state", null);
            try {
                JSONObject jSONObject = new JSONObject(string2 == null ? "{}" : string2);
                String strOptString = jSONObject.optString("bg", "none");
                strOptString.getClass();
                String strOptString2 = jSONObject.optString("fx", "none");
                strOptString2.getClass();
                int iOptInt = jSONObject.optInt("dim", 35);
                String strOptString3 = jSONObject.optString("pt", "none");
                strOptString3.getClass();
                String strOptString4 = jSONObject.optString("ps", "m");
                strOptString4.getClass();
                i63Var = new tt(strOptString, strOptString2, iOptInt, strOptString3, strOptString4, jSONObject.optInt("po", 60));
            } catch (Throwable th) {
                i63Var = new i63(th);
            }
        } while (!jn3Var2.n(value3, xa0.a(xa0Var2, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, (tt) (i63Var instanceof i63 ? new tt(0, 0, 63, null) : i63Var), null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -33554433, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
        ci4 ci4Var = e60Var3.c;
        String strQ = py.Q();
        ci4Var.getClass();
        String string3 = ((SharedPreferences) ci4Var.h).getString("cfg_".concat(strQ), null);
        if (string3 != null) {
            Set set = qt.o;
            qtVar = Protocol$Companion.parse(string3);
        } else {
            qtVar = null;
        }
        if (qtVar != null) {
            do {
                value6 = jn3Var2.getValue();
            } while (!jn3Var2.n(value6, xa0.a((xa0) value6, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, qtVar, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -16777217, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
        }
        py.F(id4.a(this), null, null, new bb0(this, so0Var, i3), 3);
        String string4 = this.b.j().getString("carry_cfg_".concat(py.Q()), null);
        r10 r10VarM1785parse = string4 != null ? Protocol$Companion.m1785parse(string4) : null;
        if (r10VarM1785parse != null) {
            jn3 jn3Var3 = this.c;
            do {
                value5 = jn3Var3.getValue();
            } while (!jn3Var3.n(value5, xa0.a((xa0) value5, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, r10VarM1785parse, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -2, KotlinVersion.MAX_COMPONENT_VALUE)));
        }
        py.F(id4.a(this), null, null, new bb0(this, so0Var, 4), 3);
        fy2 fy2Var = this.b.g;
        kt1 kt1Var = (kt1) fy2Var.d;
        String strE = fy2Var.e();
        if (strE == null || mo3.C0(strE)) {
            entitlements = null;
        } else {
            String string5 = fy2Var.d().getString("nickname", null);
            String string6 = fy2Var.d().getString("plan", "free");
            String str = string6 == null ? "free" : string6;
            boolean z2 = fy2Var.d().getBoolean("plan_active", false);
            boolean z3 = !fy2Var.d().getBoolean("plan_active", false);
            String string7 = fy2Var.d().getString("avatar_me", null);
            if (string7 != null) {
                try {
                    i63Var2 = (AvatarView) kt1Var.b(AvatarView.Companion.serializer(), string7);
                } catch (Throwable th2) {
                    i63Var2 = new i63(th2);
                }
                avatarView = (AvatarView) (i63Var2 instanceof i63 ? null : i63Var2);
            } else {
                avatarView = null;
            }
            String string8 = fy2Var.d().getString("avatar_ai", null);
            if (string8 != null) {
                try {
                    i63Var3 = (AvatarView) kt1Var.b(AvatarView.Companion.serializer(), string8);
                } catch (Throwable th3) {
                    i63Var3 = new i63(th3);
                }
                avatarView2 = (AvatarView) (i63Var3 instanceof i63 ? null : i63Var3);
            } else {
                avatarView2 = null;
            }
            entitlements = new Entitlements(string5, str, z2, z3, avatarView, avatarView2, 1890);
        }
        if (entitlements != null) {
            jn3 jn3Var4 = this.c;
            do {
                value4 = jn3Var4.getValue();
            } while (!jn3Var4.n(value4, xa0.a((xa0) value4, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, entitlements, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -4194305, KotlinVersion.MAX_COMPONENT_VALUE)));
        }
        Context context = this.b.b;
        context.getClass();
        this.k = new bk(context);
        this.n = BuildConfig.VERSION_NAME;
        jn3 jn3VarF2 = gb2.f(null);
        this.p = jn3VarF2;
        this.q = new s23(jn3VarF2);
        tw2 tw2Var = (tw2) this.b.i.getValue();
        this.r = (tw2Var == null || (s23Var = tw2Var.c) == null) ? new s23(gb2.f(z21Var)) : s23Var;
        jn3 jn3VarF3 = gb2.f(Boolean.FALSE);
        this.s = jn3VarF3;
        this.t = new s23(jn3VarF3);
        jn3 jn3VarF4 = gb2.f(null);
        this.u = jn3VarF4;
        this.v = new s23(jn3VarF4);
        jn3 jn3VarF5 = gb2.f(Boolean.valueOf(this.b.d.c()));
        this.w = jn3VarF5;
        this.x = new s23(jn3VarF5);
        jn3 jn3VarF6 = gb2.f(null);
        this.y = jn3VarF6;
        this.z = new s23(jn3VarF6);
        this.B = new StringBuilder();
    }

    public static final Object e(hb0 hb0Var, k81 k81Var, mq3 mq3Var) throws Throwable {
        hb0Var.getClass();
        Object objA = new t81(k81Var, new db0(hb0Var, null), 0).a(new ab0(hb0Var, 1), mq3Var);
        return objA == hq0.c ? objA : w84.a;
    }

    public static final void f(hb0 hb0Var) {
        Object value;
        xa0 xa0Var;
        ArrayList arrayList;
        hb0Var.y.o(null);
        jn3 jn3Var = hb0Var.w;
        Boolean bool = Boolean.FALSE;
        jn3Var.getClass();
        jn3Var.p(null, bool);
        jn3 jn3Var2 = hb0Var.c;
        do {
            value = jn3Var2.getValue();
            xa0Var = (xa0) value;
            List list = xa0Var.a;
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (((yd2) obj).d != xd2.h) {
                    arrayList.add(obj);
                }
            }
        } while (!jn3Var2.n(value, xa0.a(xa0Var, arrayList, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -2, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
    }

    public static final void g(hb0 hb0Var, Set set) {
        Object value;
        hb0Var.getClass();
        boolean zV0 = ke0.v0(set, ((xa0) hb0Var.d.c.getValue()).c);
        jn3 jn3Var = hb0Var.c;
        do {
            value = jn3Var.getValue();
        } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, f31.c, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -3670017, KotlinVersion.MAX_COMPONENT_VALUE)));
        hb0Var.L();
        if (zV0) {
            hb0Var.N();
        }
    }

    public static final void h(hb0 hb0Var) {
        yg1 yg1VarI = hb0Var.b.i();
        yg1VarI.getClass();
        List listU = kr1.U("me", "ai");
        ArrayList arrayList = new ArrayList();
        Iterator it = listU.iterator();
        while (true) {
            ps2 ps2Var = null;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            AvatarView avatarViewA = yg1VarI.a(str);
            if (avatarViewA != null) {
                if (!kr1.n(avatarViewA.getKind(), "tile") || mo3.C0(avatarViewA.getRef())) {
                    avatarViewA = null;
                }
                if (avatarViewA != null) {
                    ps2Var = new ps2(str, avatarViewA.getRef());
                }
            }
            if (ps2Var != null) {
                arrayList.add(ps2Var);
            }
        }
        Map mapV = y92.V(arrayList);
        if (mapV.isEmpty()) {
            return;
        }
        py.F(id4.a(hb0Var), null, null, new eb0(mapV, hb0Var, null), 3);
    }

    public static boolean m(xa0 xa0Var) {
        return xa0Var.c0.getPlanActive() && py.S("plus", "pro").contains(xa0Var.c0.getPlan());
    }

    public static tt n(xa0 xa0Var) {
        xa0Var.getClass();
        qt qtVar = xa0Var.y;
        if (qtVar != null) {
            if (!qtVar.a) {
                qtVar = null;
            }
            if (qtVar != null) {
                tt ttVar = xa0Var.A;
                if (ttVar != null) {
                    return ttVar;
                }
                tt ttVarA = xa0Var.z.a(qtVar);
                return m(xa0Var) ? ttVarA : ttVarA.d(qtVar);
            }
        }
        return null;
    }

    public static boolean o(xa0 xa0Var) {
        int i;
        xa0Var.getClass();
        r10 r10Var = xa0Var.G;
        if (r10Var != null && r10Var.a && xa0Var.c != null && !xa0Var.b) {
            List list = xa0Var.a;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (((yd2) it.next()).c == mm3.c && (i = i + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            } else {
                i = 0;
            }
            if (i >= r10Var.d) {
                return true;
            }
        }
        return false;
    }

    public final s23 A() {
        return this.z;
    }

    public final s23 B() {
        return this.q;
    }

    public final s23 C() {
        return this.x;
    }

    public final s23 D() {
        return this.t;
    }

    public final s23 E() {
        return this.v;
    }

    public final s23 F() {
        return this.r;
    }

    public final s23 G() {
        return this.d;
    }

    public final ef4 H() {
        return (ef4) this.j.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:221:0x0939  */
    public final void I(ChatEvent chatEvent) {
        char c;
        String strP;
        Object value;
        xa0 xa0Var;
        List listE;
        String string;
        String string2;
        int iNextIndex;
        String url;
        Object value2;
        xa0 xa0Var2;
        int iNextIndex2;
        List list;
        String strW;
        String content;
        String url2;
        String cta;
        Object value3;
        int iNextIndex3;
        Object value4;
        xa0 xa0Var3;
        ArrayList arrayListP0;
        int iNextIndex4;
        Object objPrevious;
        Object value5;
        xa0 xa0VarA;
        int iNextIndex5;
        Object value6;
        xa0 xa0Var4;
        int iNextIndex6;
        List listO0;
        String str;
        String str2;
        String str3;
        int retryAfter;
        l50 l50Var;
        r10 r10Var;
        Object value7;
        Object value8;
        xd2 xd2Var = xd2.d;
        mm3 mm3Var = mm3.h;
        mm3 mm3Var2 = mm3.c;
        mm3 mm3Var3 = mm3.d;
        bk bkVar = this.k;
        c50 c50Var = c50.a;
        s23 s23Var = this.d;
        e60 e60Var = this.b;
        jn3 jn3Var = this.c;
        boolean z = chatEvent instanceof ChatEvent.Delta;
        if (!z) {
            y();
        }
        xd2 xd2Var2 = xd2Var;
        so0 so0Var = null;
        if (chatEvent instanceof ChatEvent.ChatMeta) {
            do {
                value8 = jn3Var.getValue();
            } while (!jn3Var.n(value8, xa0.a((xa0) value8, null, false, ((ChatEvent.ChatMeta) chatEvent).getChatId(), null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -5, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
            if (this.D == null) {
                py.F(id4.a(this), null, null, new bb0(this, so0Var, 10), 3);
                return;
            }
            return;
        }
        if (chatEvent instanceof ChatEvent.CarryHint) {
            String str4 = ((xa0) s23Var.getValue()).c;
            if (str4 == null || (r10Var = ((xa0) s23Var.getValue()).G) == null || !r10Var.a) {
                return;
            }
            Set<String> stringSet = e60Var.j().getStringSet("carry_hint_off", f31.c);
            stringSet.getClass();
            if (stringSet.contains(str4)) {
                return;
            }
            do {
                value7 = jn3Var.getValue();
            } while (!jn3Var.n(value7, xa0.a((xa0) value7, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, true, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -16385, KotlinVersion.MAX_COMPONENT_VALUE)));
            return;
        }
        boolean z2 = chatEvent instanceof ChatEvent.InstrRefused;
        String str5 = "impr";
        int i = 0;
        mm3 mm3Var4 = mm3Var;
        String str6 = BuildConfig.VERSION_NAME;
        if (z2) {
            do {
                value6 = jn3Var.getValue();
                xa0Var4 = (xa0) value6;
                List listE2 = xa0Var4.E();
                ListIterator listIterator = listE2.listIterator(listE2.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((yd2) listIterator.previous()).b() == mm3Var2) {
                            iNextIndex6 = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex6 = -1;
                        break;
                    }
                }
                String strW2 = iNextIndex6 >= 0 ? ((yd2) xa0Var4.E().get(iNextIndex6)).b : BuildConfig.VERSION_NAME;
                listO0 = iNextIndex6 >= 0 ? ke0.O0(xa0Var4.E().subList(0, iNextIndex6)) : xa0Var4.E();
                if (!mo3.C0(xa0Var4.w())) {
                    strW2 = xa0Var4.w();
                }
                str = strW2;
                ChatEvent.InstrRefused instrRefused = (ChatEvent.InstrRefused) chatEvent;
                String reason = instrRefused.getReason();
                if (kr1.n(reason, "rate")) {
                    String scope = instrRefused.getScope();
                    if (kr1.n(scope, "day")) {
                        str2 = "rate_day";
                    } else if (kr1.n(scope, "min")) {
                        str2 = "rate_min";
                    } else {
                        str3 = "rate";
                    }
                    str3 = str2;
                } else if (kr1.n(reason, "too_long")) {
                    str3 = "too_long";
                } else {
                    str2 = "refused";
                    str3 = str2;
                }
                retryAfter = instrRefused.getRetryAfter();
                if (kr1.n(instrRefused.getReason(), "rate") && kr1.n(instrRefused.getScope(), "day")) {
                    String scope2 = instrRefused.getScope();
                    String plan = instrRefused.getPlan();
                    if (mo3.C0(plan)) {
                        plan = "free";
                    }
                    l50 l50Var2 = new l50(instrRefused.getLimit(), instrRefused.getRetryAfter(), scope2, plan, instrRefused.getLimits());
                    z("impr", "instr_gate", "instr_app");
                    l50Var = l50Var2;
                } else {
                    l50Var = null;
                }
            } while (!jn3Var.n(value6, xa0.a(xa0Var4, listO0, false, null, str, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, true, false, null, null, null, false, 0L, null, retryAfter, l50Var, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, str3, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, 1061158900, -32769, KotlinVersion.MAX_COMPONENT_VALUE)));
            return;
        }
        if (chatEvent instanceof ChatEvent.UserEcho) {
            String messageId = ((ChatEvent.UserEcho) chatEvent).getMessageId();
            if (messageId != null) {
                do {
                    value5 = jn3Var.getValue();
                    xa0VarA = (xa0) value5;
                    List listE3 = xa0VarA.E();
                    ListIterator listIterator2 = listE3.listIterator(listE3.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            if (((yd2) listIterator2.previous()).b() == mm3Var2) {
                                iNextIndex5 = listIterator2.nextIndex();
                                break;
                            }
                        } else {
                            iNextIndex5 = -1;
                            break;
                        }
                    }
                    if (iNextIndex5 >= 0) {
                        ArrayList arrayListP1 = ke0.P0(xa0VarA.E());
                        arrayListP1.set(iNextIndex5, yd2.a((yd2) arrayListP1.get(iNextIndex5), null, null, messageId, KotlinVersion.MAX_COMPONENT_VALUE));
                        xa0VarA = xa0.a(xa0VarA, arrayListP1, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -2, -1, KotlinVersion.MAX_COMPONENT_VALUE);
                    }
                } while (!jn3Var.n(value5, xa0VarA));
                return;
            }
            return;
        }
        if (chatEvent instanceof ChatEvent.Thinking) {
            this.m = false;
            this.o = false;
            String string3 = UUID.randomUUID().toString();
            string3.getClass();
            while (true) {
                Object value9 = jn3Var.getValue();
                xa0 xa0Var5 = (xa0) value9;
                mm3 mm3Var5 = mm3Var3;
                if (jn3Var.n(value9, xa0.a(xa0Var5, ke0.I0(xa0Var5.E(), new yd2(string3, BuildConfig.VERSION_NAME, mm3Var3, xd2.c, null, false, null, 480)), false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -2, -1, KotlinVersion.MAX_COMPONENT_VALUE))) {
                    X(c50Var);
                    return;
                }
                mm3Var3 = mm3Var5;
            }
        } else {
            mm3 mm3Var6 = mm3Var3;
            int i2 = 2;
            if (z) {
                this.B.append(((ChatEvent.Delta) chatEvent).getChunk());
                List listE4 = ((xa0) s23Var.getValue()).E();
                ListIterator listIterator3 = listE4.listIterator(listE4.size());
                do {
                    if (!listIterator3.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator3.previous();
                } while (((yd2) objPrevious).b() != mm3Var6);
                yd2 yd2Var = (yd2) objPrevious;
                if (yd2Var != null && yd2Var.e) {
                    y();
                    return;
                } else {
                    if (this.C == null) {
                        this.C = py.F(id4.a(this), null, null, new bb0(this, so0Var, i2), 3);
                        return;
                    }
                    return;
                }
            }
            if (chatEvent instanceof ChatEvent.Message) {
                do {
                    value4 = jn3Var.getValue();
                    xa0Var3 = (xa0) value4;
                    arrayListP0 = ke0.P0(xa0Var3.E());
                    ListIterator listIterator4 = arrayListP0.listIterator(arrayListP0.size());
                    while (true) {
                        if (listIterator4.hasPrevious()) {
                            if (((yd2) listIterator4.previous()).b() == mm3Var6) {
                                iNextIndex4 = listIterator4.nextIndex();
                                break;
                            }
                        } else {
                            iNextIndex4 = -1;
                            break;
                        }
                    }
                    if (iNextIndex4 != -1) {
                        arrayListP0.set(iNextIndex4, yd2.a((yd2) arrayListP0.get(iNextIndex4), ((ChatEvent.Message) chatEvent).getContent(), null, null, 493));
                    }
                } while (!jn3Var.n(value4, xa0.a(xa0Var3, arrayListP0, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -2, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
                return;
            }
            int i3 = -1;
            if (!(chatEvent instanceof ChatEvent.Busy)) {
                mm3 mm3Var7 = mm3Var6;
                if (chatEvent instanceof ChatEvent.Done) {
                    do {
                        value3 = jn3Var.getValue();
                    } while (!jn3Var.n(value3, xa0.a((xa0) value3, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -3, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
                    L();
                    X(e50.a);
                    String strF = e60Var.d.f();
                    boolean z3 = this.o;
                    this.o = false;
                    if (strF != null) {
                        b0(strF);
                        return;
                    } else {
                        if (z3 && a0()) {
                            return;
                        }
                        M();
                        return;
                    }
                }
                boolean z4 = chatEvent instanceof ChatEvent.Error;
                if (z4) {
                    ChatEvent.Error error = (ChatEvent.Error) chatEvent;
                    if (kr1.n(error.getCode(), "unofficial") && (url = error.getUrl()) != null && !mo3.C0(url)) {
                        do {
                            value2 = jn3Var.getValue();
                            xa0Var2 = (xa0) value2;
                            List listE5 = xa0Var2.E();
                            ListIterator listIterator5 = listE5.listIterator(listE5.size());
                            while (true) {
                                if (listIterator5.hasPrevious()) {
                                    if (((yd2) listIterator5.previous()).b() == mm3Var2) {
                                        iNextIndex2 = listIterator5.nextIndex();
                                        break;
                                    }
                                } else {
                                    iNextIndex2 = -1;
                                    break;
                                }
                            }
                            List listE6 = xa0Var2.E();
                            if (iNextIndex2 >= 0) {
                                listE6 = ke0.O0(listE6.subList(0, iNextIndex2));
                            }
                            list = listE6;
                            strW = (iNextIndex2 < 0 || !mo3.C0(xa0Var2.w())) ? xa0Var2.w() : ((yd2) xa0Var2.E().get(iNextIndex2)).b;
                            content = error.getContent();
                            url2 = error.getUrl();
                            cta = error.getCta();
                            if (cta == null) {
                                cta = "Download";
                            } else {
                                if (mo3.C0(cta)) {
                                    cta = null;
                                }
                                if (cta == null) {
                                    cta = "Download";
                                }
                            }
                        } while (!jn3Var.n(value2, xa0.a(xa0Var2, list, false, null, strW, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, new e94(content, url2, cta), null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -12, -2049, KotlinVersion.MAX_COMPONENT_VALUE)));
                        return;
                    }
                }
                if (z4) {
                    ChatEvent.Error error2 = (ChatEvent.Error) chatEvent;
                    c = ':';
                    if (to3.q0(error2.getContent(), "too_long:", false)) {
                        List listN0 = mo3.N0(error2.getContent(), new char[]{':'});
                        String str7 = (String) ke0.A0(1, listN0);
                        if (str7 == null) {
                            str7 = BuildConfig.VERSION_NAME;
                        }
                        String str8 = (String) ke0.A0(2, listN0);
                        if (str8 == null) {
                            str8 = BuildConfig.VERSION_NAME;
                        }
                        Context context = e60Var.b;
                        context.getClass();
                        if (kr1.n(str7, "pro")) {
                            string2 = context.getString(R.string.len_pro, str8);
                        } else if (kr1.n(str7, "plus")) {
                            String str9 = (String) ke0.A0(4, listN0);
                            if (str9 == null) {
                                str9 = BuildConfig.VERSION_NAME;
                            }
                            string2 = context.getString(R.string.len_plus, str8, str9);
                        } else {
                            String str10 = (String) ke0.A0(3, listN0);
                            if (str10 == null) {
                                str10 = BuildConfig.VERSION_NAME;
                            }
                            String str11 = (String) ke0.A0(4, listN0);
                            if (str11 == null) {
                                str11 = BuildConfig.VERSION_NAME;
                            }
                            string2 = context.getString(R.string.len_free, str8, str10, str11);
                        }
                        String str12 = string2;
                        str12.getClass();
                        while (true) {
                            Object value10 = jn3Var.getValue();
                            xa0 xa0Var6 = (xa0) value10;
                            List listE7 = xa0Var6.E();
                            ListIterator listIterator6 = listE7.listIterator(listE7.size());
                            while (true) {
                                if (listIterator6.hasPrevious()) {
                                    if (((yd2) listIterator6.previous()).b() == mm3Var2) {
                                        iNextIndex = listIterator6.nextIndex();
                                        break;
                                    }
                                } else {
                                    iNextIndex = -1;
                                    break;
                                }
                            }
                            String strW3 = iNextIndex >= 0 ? ((yd2) xa0Var6.E().get(iNextIndex)).b : str6;
                            List listO1 = iNextIndex >= 0 ? ke0.O0(xa0Var6.E().subList(i, iNextIndex)) : xa0Var6.E();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : listO1) {
                                yd2 yd2Var2 = (yd2) obj;
                                if (yd2Var2.b() != mm3Var7 || yd2Var2.b.length() != 0) {
                                    arrayList.add(obj);
                                }
                            }
                            String string4 = UUID.randomUUID().toString();
                            string4.getClass();
                            String str13 = str6;
                            int i4 = i;
                            mm3 mm3Var8 = mm3Var2;
                            c50 c50Var2 = c50Var;
                            mm3 mm3Var9 = mm3Var4;
                            mm3 mm3Var10 = mm3Var7;
                            xd2 xd2Var3 = xd2Var2;
                            ArrayList arrayListI0 = ke0.I0(arrayList, new yd2(string4, str12, mm3Var9, xd2Var3, null, false, null, 496));
                            if (!mo3.C0(xa0Var6.w())) {
                                strW3 = xa0Var6.w();
                            }
                            if (jn3Var.n(value10, xa0.a(xa0Var6, arrayListI0, false, null, strW3, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -12, -1, KotlinVersion.MAX_COMPONENT_VALUE))) {
                                X(c50Var2);
                                return;
                            }
                            str6 = str13;
                            mm3Var7 = mm3Var10;
                            i = i4;
                            mm3Var4 = mm3Var9;
                            xd2Var2 = xd2Var3;
                            c50Var = c50Var2;
                            mm3Var2 = mm3Var8;
                        }
                    }
                } else {
                    c = ':';
                }
                if (z4) {
                    ChatEvent.Error error3 = (ChatEvent.Error) chatEvent;
                    if (kr1.n(error3.getContent(), "offline") || to3.q0(error3.getContent(), "offline:", false)) {
                        String strO0 = mo3.O0(error3.getContent(), c, BuildConfig.VERSION_NAME);
                        Context context2 = e60Var.b;
                        context2.getClass();
                        strP = ud2.p(context2.getString(R.string.network_error), (mo3.C0(strO0) || kr1.n(error3.getContent(), "offline")) ? BuildConfig.VERSION_NAME : " · ".concat(strO0));
                    } else {
                        strP = error3.getContent();
                    }
                    String str14 = strP;
                    do {
                        value = jn3Var.getValue();
                        xa0Var = (xa0) value;
                        listE = xa0Var.E();
                        string = UUID.randomUUID().toString();
                        string.getClass();
                    } while (!jn3Var.n(value, xa0.a(xa0Var, ke0.I0(listE, new yd2(string, str14, mm3Var4, xd2Var2, null, false, null, 496)), false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -4, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
                    X(c50Var);
                    return;
                }
                return;
            }
            ChatEvent.Busy busy = (ChatEvent.Busy) chatEvent;
            String why = busy.getWhy();
            int iHashCode = why.hashCode();
            if (iHashCode != 3327206) {
                if (iHashCode == 3533313) {
                    if (why.equals("slow")) {
                        this.o = true;
                        return;
                    }
                    return;
                } else if (iHashCode != 3570510 || !why.equals("ttft")) {
                    return;
                }
            } else if (!why.equals("load")) {
                return;
            }
            if (mo3.C0(busy.getText()) || this.m || !bkVar.a(e60Var.d.b.getOwn())) {
                return;
            }
            bkVar.n();
            this.m = true;
            this.n = busy.getAb();
            py.F(id4.a(this), null, null, new za0(this, str5, busy.getAb(), so0Var, 0), 3);
            while (true) {
                Object value11 = jn3Var.getValue();
                xa0 xa0Var7 = (xa0) value11;
                ArrayList arrayListP2 = ke0.P0(xa0Var7.E());
                ListIterator listIterator7 = arrayListP2.listIterator(arrayListP2.size());
                while (true) {
                    if (!listIterator7.hasPrevious()) {
                        iNextIndex3 = i3;
                        break;
                    }
                    yd2 yd2Var3 = (yd2) listIterator7.previous();
                    if (yd2Var3.b() == mm3Var6 && yd2Var3.e) {
                        iNextIndex3 = listIterator7.nextIndex();
                        break;
                    }
                }
                jn3 jn3Var2 = jn3Var;
                mm3 mm3Var11 = mm3Var6;
                int i5 = i3;
                yd2 yd2Var4 = new yd2("note-" + UUID.randomUUID(), busy.getText(), mm3Var4, xd2.m, null, false, null, 496);
                if (iNextIndex3 != i5) {
                    arrayListP2.add(iNextIndex3, yd2Var4);
                } else {
                    arrayListP2.add(yd2Var4);
                }
                if (jn3Var2.n(value11, xa0.a(xa0Var7, arrayListP2, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -2, -1, KotlinVersion.MAX_COMPONENT_VALUE))) {
                    return;
                }
                i3 = i5;
                mm3Var6 = mm3Var11;
                jn3Var = jn3Var2;
            }
        }
    }

    public final int J() {
        xa0 xa0Var = (xa0) this.d.c.getValue();
        String plan = xa0Var.c0.getPlanActive() ? xa0Var.c0.getPlan() : "free";
        k50 k50Var = xa0Var.u;
        Map map = k50Var != null ? k50Var.e : null;
        if (map == null) {
            map = a31.c;
        }
        Integer num = (Integer) map.get(plan);
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = (Integer) map.get("free");
        if (num2 != null) {
            return num2.intValue();
        }
        return 4000;
    }

    public final void K() {
        jn3 jn3Var;
        Object value;
        z("click", "instr_gate", "instr_app");
        do {
            jn3Var = this.c;
            value = jn3Var.getValue();
        } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, IntCompanionObject.MAX_VALUE, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
    }

    public final void L() {
        py.F(id4.a(this), null, null, new bb0(this, null, 5), 3);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00db  */
    /* JADX WARN: Code duplicated, block: B:82:0x0194  */
    public final void M() {
        int i;
        boolean z;
        Object value;
        xa0 xa0Var;
        int size;
        OwnCard ownCard;
        Object next;
        Object next2;
        jn3 jn3Var = this.c;
        if (((xa0) jn3Var.getValue()).c0.getAds()) {
            OwnConfig ownConfigS = S();
            List<yd2> list = ((xa0) jn3Var.getValue()).a;
            if (list == null || !list.isEmpty()) {
                i = 0;
                for (yd2 yd2Var : list) {
                    if (yd2Var.c == mm3.d && !yd2Var.e && (i = i + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            } else {
                i = 0;
            }
            int iT = T();
            SharedPreferences sharedPreferences = this.b.d.a;
            Set<String> setKeySet = sharedPreferences.getAll().keySet();
            boolean z2 = true;
            if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
                z = sharedPreferences.contains("pick.until");
            } else {
                Iterator<T> it = setKeySet.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String str = (String) it.next();
                        str.getClass();
                        if (to3.q0(str, "promo.until.", false)) {
                        }
                    } else if (sharedPreferences.contains("pick.until")) {
                    }
                }
            }
            bk bkVar = this.k;
            bkVar.getClass();
            SharedPreferences sharedPreferences2 = (SharedPreferences) bkVar.d;
            boolean enabled = ownConfigS.getEnabled();
            Set<String> set = f31.c;
            OwnCard ownCard2 = null;
            Object obj = null;
            if (enabled && !ownConfigS.getCards().isEmpty() && (ownConfigS.getMaxPerChat() <= 0 || bkVar.c < ownConfigS.getMaxPerChat())) {
                int i2 = bkVar.b;
                List<OwnSlot> schedule = ownConfigS.getSchedule();
                if (schedule.isEmpty()) {
                    size = Integer.MAX_VALUE;
                } else if (i2 < schedule.size()) {
                    size = schedule.get(i2).getAt();
                } else if (ownConfigS.getRepeatEvery() <= 0) {
                    size = Integer.MAX_VALUE;
                } else {
                    size = (((i2 - schedule.size()) + 1) * ownConfigS.getRepeatEvery()) + ((OwnSlot) ke0.E0(schedule)).getAt();
                }
                if (size != Integer.MAX_VALUE && i >= size) {
                    int i3 = bkVar.b;
                    List<OwnSlot> schedule2 = ownConfigS.getSchedule();
                    if (ownConfigS.getCards().isEmpty()) {
                        ownCard = null;
                    } else if (i3 < schedule2.size()) {
                        Iterator<T> it2 = ownConfigS.getCards().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            boolean z3 = z2;
                            if (kr1.n(((OwnCard) next).getId(), schedule2.get(i3).getCard())) {
                                break;
                            } else {
                                z2 = z3;
                            }
                        }
                        ownCard = (OwnCard) next;
                    } else {
                        ownCard = ownConfigS.getCards().get((i3 - schedule2.size()) % ownConfigS.getCards().size());
                    }
                    Set<String> stringSet = sharedPreferences2.getStringSet("seen_ids", set);
                    if (stringSet == null) {
                        stringSet = set;
                    }
                    if (ownCard == null || !bk.e(ownCard, iT, z) || stringSet.contains(ownCard.getId())) {
                        Iterator<T> it3 = ownConfigS.getCards().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it3.next();
                            OwnCard ownCard3 = (OwnCard) next2;
                            if (bk.e(ownCard3, iT, z) && !stringSet.contains(ownCard3.getId())) {
                                break;
                            }
                        }
                        OwnCard ownCard4 = (OwnCard) next2;
                        if (ownCard4 != null) {
                            ownCard2 = ownCard4;
                        } else if (ownCard == null || !bk.e(ownCard, iT, z)) {
                            for (Object obj2 : ownConfigS.getCards()) {
                                if (bk.e((OwnCard) obj2, iT, z)) {
                                    obj = obj2;
                                    break;
                                }
                            }
                            ownCard2 = (OwnCard) obj;
                        } else {
                            ownCard2 = ownCard;
                        }
                    } else {
                        ownCard2 = ownCard;
                    }
                }
            }
            if (ownCard2 == null) {
                return;
            }
            this.l = ownCard2;
            bkVar.b++;
            bkVar.c++;
            Set<String> stringSet2 = sharedPreferences2.getStringSet("seen_ids", set);
            if (stringSet2 != null) {
                set = stringSet2;
            }
            Set<String> setR0 = ke0.R0(set);
            if (setR0.add(ownCard2.getId())) {
                sharedPreferences2.edit().putStringSet("seen_ids", setR0).apply();
            }
            do {
                value = jn3Var.getValue();
                xa0Var = (xa0) value;
            } while (!jn3Var.n(value, xa0.a(xa0Var, ke0.I0(xa0Var.a, new yd2("own-" + UUID.randomUUID(), ownCard2.getId(), mm3.h, xd2.l, null, false, null, 496)), false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -2, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
            X(c50.a);
            R("impr", ownCard2.getId());
        }
    }

    public final void N() {
        jn3 jn3Var;
        Object value;
        ym3 ym3Var = this.h;
        if (ym3Var != null) {
            ym3Var.c(null);
        }
        ym3 ym3Var2 = this.g;
        if (ym3Var2 != null) {
            ym3Var2.c(null);
        }
        w();
        this.i++;
        bk bkVar = this.k;
        if (!kr1.n((String) bkVar.e, null)) {
            bkVar.e = null;
            bkVar.b = 0;
            bkVar.c = 0;
        }
        this.l = null;
        do {
            jn3Var = this.c;
            value = jn3Var.getValue();
        } while (!jn3Var.n(value, xa0.a((xa0) value, z21.c, false, null, BuildConfig.VERSION_NAME, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, BuildConfig.VERSION_NAME, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -6291726, -61441, KotlinVersion.MAX_COMPONENT_VALUE)));
        X(y40.a);
    }

    public final void O(String str) {
        jn3 jn3Var;
        Object value;
        str.getClass();
        do {
            jn3Var = this.c;
            value = jn3Var.getValue();
        } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, mo3.T0(J(), str), null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -9, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
    }

    public final void P(String str) {
        jn3 jn3Var;
        Object value;
        str.getClass();
        do {
            jn3Var = this.c;
            value = jn3Var.getValue();
        } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, str, null, null, -1, -1, 223)));
        if (((xa0) jn3Var.getValue()).q0 == null) {
            py.F(id4.a(this), null, null, new bb0(this, null, 8), 3);
        }
    }

    public final void Q() {
        jn3 jn3Var;
        Object value;
        if (o((xa0) this.d.c.getValue())) {
            do {
                jn3Var = this.c;
                value = jn3Var.getValue();
            } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, true, null, false, 0L, null, 0, null, true, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -257, -16675, KotlinVersion.MAX_COMPONENT_VALUE)));
            X(y40.a);
            q();
        }
    }

    public final void R(String str, String str2) {
        py.F(id4.a(this), null, null, new za0(this, str, str2, null, 1), 3);
    }

    public final OwnConfig S() {
        OwnConfig own = this.b.d.b.getOwn();
        OwnFacts ownFactsCopy$default = OwnFacts.copy$default(own.getFacts());
        List<OwnCard> cards = own.getCards();
        ArrayList arrayList = new ArrayList();
        for (Object obj : cards) {
            if (!kr1.n(((OwnCard) obj).getId(), "plans")) {
                arrayList.add(obj);
            }
        }
        return OwnConfig.copy$default(own, ownFactsCopy$default, arrayList);
    }

    public final int T() {
        List list = ((xa0) this.c.getValue()).a;
        int i = 0;
        if (list != null && list.isEmpty()) {
            return 0;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((yd2) it.next()).c == mm3.c && (i = i + 1) < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i;
    }

    public final void U() {
        py.F(id4.a(this), null, null, new bb0(this, null, 11), 3);
    }

    public final void V() {
        jn3 jn3Var;
        Object value;
        xa0 xa0Var;
        ChatMetaDoc chatMetaDocB;
        f31 f31Var;
        Set<String> stringSet;
        do {
            jn3Var = this.c;
            value = jn3Var.getValue();
            xa0Var = (xa0) value;
            e60 e60Var = this.b;
            chatMetaDocB = e60Var.f.B();
            SharedPreferences sharedPreferences = (SharedPreferences) e60Var.f.d;
            f31Var = f31.c;
            stringSet = sharedPreferences.getStringSet("collapsed", f31Var);
        } while (!jn3Var.n(value, xa0.a(xa0Var, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, chatMetaDocB, stringSet == null ? f31Var : stringSet, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -393217, KotlinVersion.MAX_COMPONENT_VALUE)));
    }

    public final void W(String str) {
        jn3 jn3Var;
        Object value;
        str.getClass();
        if (kr1.n(((xa0) this.d.c.getValue()).c, str)) {
            do {
                jn3Var = this.c;
                value = jn3Var.getValue();
            } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -257, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
            X(y40.a);
            return;
        }
        ym3 ym3Var = this.h;
        if (ym3Var != null) {
            ym3Var.c(null);
        }
        ym3 ym3Var2 = this.g;
        if (ym3Var2 != null) {
            ym3Var2.c(null);
        }
        w();
        int i = this.i + 1;
        this.i = i;
        bk bkVar = this.k;
        if (!kr1.n((String) bkVar.e, str)) {
            bkVar.e = str;
            bkVar.b = 0;
            bkVar.c = 0;
        }
        this.l = null;
        this.h = py.F(id4.a(this), null, null, new gb0(i, this, null, str), 3);
    }

    public final void X(f50 f50Var) {
        py.F(id4.a(this), null, null, new k(this, f50Var, null, 12), 3);
    }

    public final void Y(String str) {
        Object value;
        xa0 xa0Var;
        u43 u43Var;
        String string = mo3.U0(((xa0) this.d.c.getValue()).d).toString();
        List list = ((xa0) this.d.c.getValue()).s;
        if (string.length() == 0 || ((xa0) this.d.c.getValue()).b) {
            return;
        }
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((hn) it.next()).e == gn.c) {
                    return;
                }
            }
        }
        ym3 ym3Var = this.g;
        if (ym3Var != null) {
            ym3Var.c(null);
        }
        w();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((hn) obj).e == gn.d) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            String str2 = ((hn) obj2).a;
            if (str2 != null) {
                arrayList2.add(str2);
            }
        }
        String string2 = UUID.randomUUID().toString();
        string2.getClass();
        yd2 yd2Var = new yd2(string2, string, mm3.c, xd2.c, list, false, null, 464);
        jn3 jn3Var = this.c;
        do {
            value = jn3Var.getValue();
            xa0Var = (xa0) value;
        } while (!jn3Var.n(value, xa0.a(xa0Var, ke0.I0(xa0Var.a, yd2Var), true, null, BuildConfig.VERSION_NAME, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, z21.c, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -262156, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
        X(c50.a);
        X(e50.a);
        b13 b13Var = this.b.d;
        b13Var.getClass();
        if (b13Var.b.getEnabled() && !mo3.C0(string)) {
            if (b13.d(b13Var.r, b13Var.s, string)) {
                b13Var.u = true;
            }
            if (!b13Var.u) {
                if (b13.d(b13Var.c, b13Var.d, string)) {
                    b13Var.v = true;
                }
                if (b13.d(b13Var.j, b13Var.k, string)) {
                    b13Var.w = true;
                }
                if (b13.d(b13Var.l, b13Var.m, string)) {
                    b13Var.x = true;
                }
                if (b13.d(b13Var.n, b13Var.o, string)) {
                    b13Var.y = true;
                }
                if (b13.d(b13Var.p, b13Var.q, string)) {
                    b13Var.z = true;
                }
                if (b13.d(b13Var.g, b13Var.h, string) || ((u43Var = b13Var.i) != null && u43Var.a(string))) {
                    z = true;
                }
                boolean zD = b13.d(b13Var.e, b13Var.f, string);
                if (z || zD) {
                    int i2 = b13Var.t + (z ? 2 : 1);
                    b13Var.t = i2;
                    if (i2 >= b13Var.b.getCompThreshold()) {
                        b13Var.A = true;
                    }
                }
            }
        }
        this.g = py.F(id4.a(this), null, null, new pb(((xa0) this.d.c.getValue()).c, this, string, arrayList2, str, null, 3), 3);
    }

    public final void Z() {
        jn3 jn3Var;
        Object value;
        do {
            jn3Var = this.c;
            value = jn3Var.getValue();
        } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -65537, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
    }

    public final boolean a0() {
        Object next;
        Object value;
        xa0 xa0Var;
        jn3 jn3Var = this.c;
        if (((xa0) jn3Var.getValue()).c0.getAds()) {
            OwnConfig ownConfigS = S();
            if (ownConfigS.getEnabled()) {
                Iterator<T> it = ownConfigS.getCards().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kr1.n(((OwnCard) next).getId(), "fast"));
                OwnCard ownCard = (OwnCard) next;
                if (ownCard != null) {
                    bk bkVar = this.k;
                    bkVar.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long fastCooldownMin = ((long) ownConfigS.getFastCooldownMin()) * 60000;
                    ArrayList arrayListF = bkVar.f();
                    ArrayList arrayList = new ArrayList();
                    int size = arrayListF.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayListF.get(i);
                        i++;
                        if (jCurrentTimeMillis - ((Number) obj).longValue() < 86400000) {
                            arrayList.add(obj);
                        }
                    }
                    if (ownConfigS.getFastMaxPerDay() > 0 && arrayList.size() >= ownConfigS.getFastMaxPerDay()) {
                        return false;
                    }
                    if (!arrayList.isEmpty() && jCurrentTimeMillis - ((Number) ke0.G0(arrayList)).longValue() < fastCooldownMin) {
                        return false;
                    }
                    this.l = ownCard;
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    ArrayList arrayListF2 = bkVar.f();
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = arrayListF2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayListF2.get(i2);
                        i2++;
                        if (jCurrentTimeMillis2 - ((Number) obj2).longValue() < 86400000) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayListI0 = ke0.I0(arrayList2, Long.valueOf(jCurrentTimeMillis2));
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) bkVar.d).edit();
                    ArrayList arrayList3 = new ArrayList(le0.q0(arrayListI0, 10));
                    int size3 = arrayListI0.size();
                    int i3 = 0;
                    while (i3 < size3) {
                        Object obj3 = arrayListI0.get(i3);
                        i3++;
                        arrayList3.add(String.valueOf(((Number) obj3).longValue()));
                    }
                    editorEdit.putStringSet("fast_log", ke0.S0(arrayList3)).apply();
                    do {
                        value = jn3Var.getValue();
                        xa0Var = (xa0) value;
                    } while (!jn3Var.n(value, xa0.a(xa0Var, ke0.I0(xa0Var.a, new yd2("own-" + UUID.randomUUID(), ownCard.getId(), mm3.h, xd2.l, null, false, null, 496)), false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -2, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
                    X(c50.a);
                    R("impr", ownCard.getId());
                    return true;
                }
            }
        }
        return false;
    }

    public final void b0(String str) {
        if (!((xa0) this.d.c.getValue()).c0.getAds()) {
            return;
        }
        b13 b13Var = this.b.d;
        b13Var.getClass();
        String str2 = str;
        b13Var.e(str2);
        while (true) {
            jn3 jn3Var = this.c;
            Object value = jn3Var.getValue();
            xa0 xa0Var = (xa0) value;
            if (jn3Var.n(value, xa0.a(xa0Var, ke0.I0(xa0Var.a, new yd2("promo-" + UUID.randomUUID(), str2, mm3.h, xd2.h, null, false, null, 496)), false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -2, -1, KotlinVersion.MAX_COMPONENT_VALUE))) {
                X(c50.a);
                return;
            }
            str2 = str;
        }
    }

    public final void c0(String str) {
        str.getClass();
        String str2 = ((xa0) this.c.getValue()).c;
        if (str2 == null) {
            return;
        }
        List list = ((xa0) this.c.getValue()).a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            yd2 yd2Var = (yd2) obj;
            if (yd2Var.c == mm3.d && !yd2Var.e) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj2 = arrayList.get(i2);
            i2++;
            if (kr1.n(((yd2) obj2).a, str)) {
                break;
            } else {
                i++;
            }
        }
        int i3 = i;
        if (i3 < 0) {
            return;
        }
        ef4 ef4VarH = H();
        String strE0 = e0();
        boolean z = ef4.r;
        ef4VarH.getClass();
        if (((we4) ef4VarH.d.getValue()).a && kr1.n(((we4) ef4VarH.d.getValue()).b, str)) {
            ef4VarH.e();
            return;
        }
        boolean z2 = ((we4) ef4VarH.d.getValue()).a || ef4VarH.m != null;
        ef4VarH.h++;
        ef4VarH.f(z2, false);
        ef4VarH.h++;
        int i4 = ef4VarH.h;
        ef4VarH.n = str2;
        jn3 jn3Var = ef4VarH.d;
        jn3Var.p(null, new we4(str, i3, ((we4) jn3Var.getValue()).h, ef4VarH.o, 112));
        ef4VarH.i = py.F(ef4VarH.c, null, null, new df4(ef4VarH, i4, str2, i3, strE0, (so0) null), 3);
    }

    @Override // defpackage.gd4
    public final void d() {
        if (ef4.r) {
            ef4 ef4VarH = H();
            boolean z = ((we4) ef4VarH.d.getValue()).a || ef4VarH.m != null;
            ef4VarH.h++;
            ef4VarH.f(z, true);
        }
    }

    public final void d0(boolean z) {
        Object value;
        jn3 jn3Var = this.c;
        boolean z2 = ((xa0) jn3Var.getValue()).i;
        do {
            value = jn3Var.getValue();
        } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, z, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -257, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
        if (!z || z2) {
            return;
        }
        L();
    }

    public final String e0() {
        String language;
        Locale locale = Locale.getDefault();
        String country = locale.getCountry();
        if (country == null || country.length() == 0) {
            language = locale.getLanguage();
        } else {
            String language2 = locale.getLanguage();
            String country2 = locale.getCountry();
            country2.getClass();
            String upperCase = country2.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            language = language2 + "-" + upperCase;
        }
        VoiceConfig voiceConfig = ((xa0) this.c.getValue()).l0;
        List<String> languages = voiceConfig != null ? voiceConfig.getLanguages() : null;
        if (languages == null) {
            languages = z21.c;
        }
        if (languages.contains(language)) {
            language.getClass();
            return language;
        }
        String language3 = locale.getLanguage();
        language3.getClass();
        return language3;
    }

    public final AvatarView i(String str) {
        xa0 xa0Var = (xa0) this.c.getValue();
        if (!xa0Var.c0.getSignedIn()) {
            return str.equals("ai") ? xa0Var.t0 : xa0Var.s0;
        }
        boolean zEquals = str.equals("ai");
        Entitlements entitlements = xa0Var.c0;
        return zEquals ? entitlements.getAvatarAi() : entitlements.getAvatar();
    }

    public final void j() {
        jn3 jn3Var;
        Object value;
        xa0 xa0Var;
        s23 s23Var = this.d;
        if (((xa0) s23Var.c.getValue()).A != null && !m((xa0) s23Var.c.getValue())) {
            z("close", "chatbg_gate", "chatbg_app");
        }
        this.b.c.w();
        do {
            jn3Var = this.c;
            value = jn3Var.getValue();
            xa0Var = (xa0) value;
        } while (!jn3Var.n(value, xa0.a(xa0Var, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, xa0Var.C + 1, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -469762049, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
    }

    public final void k() {
        jn3 jn3Var;
        Object value;
        xa0 xa0Var;
        this.b.c.w();
        do {
            jn3Var = this.c;
            value = jn3Var.getValue();
            xa0Var = (xa0) value;
        } while (!jn3Var.n(value, xa0.a(xa0Var, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, xa0Var.C + 1, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -469762049, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
    }

    public final File l(String str) {
        tt ttVar = ((xa0) this.d.c.getValue()).A;
        e60 e60Var = this.b;
        if (ttVar != null && e60Var.c.v(str).isFile()) {
            return e60Var.c.v(str);
        }
        File fileE = e60Var.c.E(str);
        if (fileE.isFile()) {
            return fileE;
        }
        return null;
    }

    public final void p() {
        jn3 jn3Var;
        Object value;
        z("click", "carry_gate", "carry_app");
        do {
            jn3Var = this.c;
            value = jn3Var.getValue();
        } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -1025, KotlinVersion.MAX_COMPONENT_VALUE)));
    }

    public final void q() {
        jn3 jn3Var;
        Object value;
        String str = ((xa0) this.d.c.getValue()).c;
        if (str == null) {
            return;
        }
        ym3 ym3Var = this.E;
        so0 so0Var = null;
        if (ym3Var != null) {
            ym3Var.c(null);
        }
        do {
            jn3Var = this.c;
            value = jn3Var.getValue();
        } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, BuildConfig.VERSION_NAME, true, System.currentTimeMillis(), null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -61, KotlinVersion.MAX_COMPONENT_VALUE)));
        this.E = py.F(id4.a(this), null, null, new ya0(1, this, so0Var, str), 3);
        py.F(id4.a(this), null, null, new bb0(this, so0Var, 0), 3);
    }

    public final void r(boolean z) {
        if (z) {
            X(new d50("Updates are delivered through Google Play"));
        }
        py.F(id4.a(this), null, null, new bb0(this, null, 1), 3);
    }

    public final void s() {
        jn3 jn3Var;
        Object value;
        do {
            jn3Var = this.c;
            value = jn3Var.getValue();
        } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -16777217, KotlinVersion.MAX_COMPONENT_VALUE)));
    }

    public final void t() {
        jn3 jn3Var;
        Object value;
        do {
            jn3Var = this.c;
            value = jn3Var.getValue();
        } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -1, 253)));
    }

    public final void u() {
        jn3 jn3Var;
        Object value;
        do {
            jn3Var = this.c;
            value = jn3Var.getValue();
        } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -1, 247)));
    }

    public final void v() {
        jn3 jn3Var;
        Object value;
        do {
            jn3Var = this.c;
            value = jn3Var.getValue();
        } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -1, 251)));
    }

    public final void w() {
        ym3 ym3Var = this.C;
        if (ym3Var != null) {
            ym3Var.c(null);
        }
        this.C = null;
        this.B.setLength(0);
    }

    public final void x() {
        jn3 jn3Var;
        Object value;
        do {
            jn3Var = this.c;
            value = jn3Var.getValue();
        } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, f31.c, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -1572865, KotlinVersion.MAX_COMPONENT_VALUE)));
    }

    public final void y() {
        jn3 jn3Var;
        Object value;
        xa0 xa0Var;
        ArrayList arrayListP0;
        int iNextIndex;
        ym3 ym3Var = this.C;
        if (ym3Var != null) {
            ym3Var.c(null);
        }
        this.C = null;
        StringBuilder sb = this.B;
        if (sb.length() == 0) {
            return;
        }
        String string = sb.toString();
        sb.setLength(0);
        do {
            jn3Var = this.c;
            value = jn3Var.getValue();
            xa0Var = (xa0) value;
            arrayListP0 = ke0.P0(xa0Var.a);
            ListIterator listIterator = arrayListP0.listIterator(arrayListP0.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (((yd2) listIterator.previous()).c == mm3.d) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            if (iNextIndex != -1) {
                yd2 yd2Var = (yd2) arrayListP0.get(iNextIndex);
                arrayListP0.set(iNextIndex, yd2.a(yd2Var, ud2.p(yd2Var.b, string), null, null, 493));
            }
        } while (!jn3Var.n(value, xa0.a(xa0Var, arrayListP0, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -2, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
    }

    public final void z(String str, String str2, String str3) {
        Entitlements entitlements = ((xa0) this.d.c.getValue()).c0;
        py.F(id4.a(this), null, null, new pb(this, str, str2, str3, entitlements.getPlanActive() ? entitlements.getPlan() : "free", null, 2), 3);
    }
}
