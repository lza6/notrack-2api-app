package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import notrack.ai.data.promo.PickSlot;
import notrack.ai.data.promo.PromoConfig;
import notrack.ai.data.promo.PromoRegex;

/* JADX INFO: loaded from: classes.dex */
public final class b13 {
    public boolean A;
    public final SharedPreferences a;
    public volatile PromoConfig b;
    public u43 c;
    public u43 d;
    public u43 e;
    public u43 f;
    public u43 g;
    public u43 h;
    public u43 i;
    public u43 j;
    public u43 k;
    public u43 l;
    public u43 m;
    public u43 n;
    public u43 o;
    public u43 p;
    public u43 q;
    public u43 r;
    public u43 s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public b13(Context context) {
        this.a = context.getApplicationContext().getSharedPreferences("promo", 0);
        PromoConfig.Companion.getClass();
        this.b = PromoConfig.DEFAULT;
        b();
    }

    public static u43 a(String str) {
        Object i63Var;
        if (mo3.C0(str)) {
            return null;
        }
        try {
            i63Var = new u43("(?iu)".concat(str));
        } catch (Throwable th) {
            i63Var = new i63(th);
        }
        return (u43) (i63Var instanceof i63 ? null : i63Var);
    }

    public static boolean d(u43 u43Var, u43 u43Var2, String str) {
        return (u43Var != null && u43Var.a(str)) || (u43Var2 != null && u43Var2.a(str));
    }

    public static u43 g(String str) {
        Object i63Var;
        if (mo3.C0(str)) {
            return null;
        }
        try {
            i63Var = new u43(str);
        } catch (Throwable th) {
            i63Var = new i63(th);
        }
        return (u43) (i63Var instanceof i63 ? null : i63Var);
    }

    public final void b() {
        PromoRegex regex = this.b.getRegex();
        this.c = a(regex.getMedia());
        this.d = g(regex.getMediaCjk());
        this.e = a(regex.getComp());
        this.f = g(regex.getCompCjk());
        this.g = a(regex.getExplicit());
        this.h = g(regex.getExplCjk());
        this.i = a(regex.getExplRu());
        this.j = a(regex.getImggen());
        this.k = g(regex.getImggenCjk());
        this.l = a(regex.getLive());
        this.m = g(regex.getLiveCjk());
        this.n = a(regex.getMore());
        this.o = g(regex.getMoreCjk());
        this.p = a(regex.getVpn());
        this.q = g(regex.getVpnCjk());
        this.r = a(regex.getBlock());
        this.s = g(regex.getBlockCjk());
    }

    public final boolean c() {
        PickSlot pickSlot = this.b.getPickSlot();
        return this.b.getEnabled() && pickSlot.getEnabled() && !mo3.C0(pickSlot.getTitle()) && !mo3.C0(pickSlot.getClickUrl()) && System.currentTimeMillis() >= this.a.getLong("pick.until", 0L);
    }

    public final void e(String str) {
        long verticalCooldownH = (((long) this.b.getVerticalCooldownH()) * 3600000) + System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = this.a.edit();
        String str2 = this.b.getVerticalOf().get(str);
        if (str2 != null) {
            str = str2;
        }
        editorEdit.putLong("promo.until." + str, verticalCooldownH).apply();
    }

    public final String f() {
        String str;
        if (this.v) {
            str = "media";
        } else if (this.w) {
            str = "imggen";
        } else if (this.x) {
            str = "live";
        } else if (this.y) {
            str = "more";
        } else if (this.A) {
            str = "comp";
        } else {
            str = this.z ? "vpn" : null;
        }
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.A = false;
        this.z = false;
        if (str != null && this.b.getEnabled() && this.b.getEnabled() && !this.u) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            SharedPreferences sharedPreferences = this.a;
            String str2 = this.b.getVerticalOf().get(str);
            if (str2 == null) {
                str2 = str;
            }
            if (jCurrentTimeMillis >= sharedPreferences.getLong("promo.until.".concat(str2), 0L)) {
                return str;
            }
        }
        return null;
    }
}
