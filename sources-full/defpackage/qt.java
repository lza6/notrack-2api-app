package defpackage;

import app.template.extension.BuildConfig;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class qt {
    public static final Set o = py.S("none", "rain", "snow", "hearts", "bubbles", "petals", "fireflies", "own");
    public final boolean a;
    public final List b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final List f;
    public final st g;
    public final st h;
    public final Map i;
    public final Map j;
    public final int k;
    public final int l;
    public final o92 m;
    public final String n;

    public qt(boolean z, c52 c52Var, Set set, Set set2, Set set3, List list, st stVar, st stVar2, Map map, Map map2, int i, int i2, o92 o92Var, String str) {
        c52Var.getClass();
        stVar.getClass();
        this.a = z;
        this.b = c52Var;
        this.c = set;
        this.d = set2;
        this.e = set3;
        this.f = list;
        this.g = stVar;
        this.h = stVar2;
        this.i = map;
        this.j = map2;
        this.k = i;
        this.l = i2;
        this.m = o92Var;
        this.n = str;
    }

    public final rt a(String str) {
        str.getClass();
        Object obj = null;
        if (!to3.q0(str, "p:", false)) {
            return null;
        }
        for (Object obj2 : this.b) {
            if (((rt) obj2).a.equals(str.substring(2))) {
                obj = obj2;
                break;
            }
        }
        return (rt) obj;
    }

    public final String b(String str) {
        String str2 = (String) this.m.get(str);
        return str2 == null ? BuildConfig.VERSION_NAME : str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt)) {
            return false;
        }
        qt qtVar = (qt) obj;
        return this.a == qtVar.a && kr1.n(this.b, qtVar.b) && this.c.equals(qtVar.c) && this.d.equals(qtVar.d) && this.e.equals(qtVar.e) && this.f.equals(qtVar.f) && kr1.n(this.g, qtVar.g) && this.h.equals(qtVar.h) && this.i.equals(qtVar.i) && this.j.equals(qtVar.j) && this.k == qtVar.k && this.l == qtVar.l && this.m.equals(qtVar.m) && this.n.equals(qtVar.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + ((this.m.hashCode() + fq2.e(this.l, fq2.e(this.k, (this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ud2.j((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ud2.j(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31)) * 31, 31, this.f)) * 31)) * 31)) * 31)) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "BgConfig(enabled=" + this.a + ", presets=" + this.b + ", freeBg=" + this.c + ", freeFx=" + this.d + ", freePt=" + this.e + ", fx=" + this.f + ", dim=" + this.g + ", opacity=" + this.h + ", ptSizes=" + this.i + ", avaCap=" + this.j + ", ownMaxBg=" + this.k + ", ownMaxPt=" + this.l + ", strings=" + this.m + ", defSize=" + this.n + ")";
    }
}
