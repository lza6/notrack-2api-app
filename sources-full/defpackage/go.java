package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class go extends r9 {
    public final Integer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public go(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r9)) {
            return false;
        }
        r9 r9Var = (r9) obj;
        if (!this.a.equals(((go) r9Var).a)) {
            return false;
        }
        if (!this.b.equals(((go) r9Var).b)) {
            return false;
        }
        if (!this.c.equals(((go) r9Var).c)) {
            return false;
        }
        if (!this.d.equals(((go) r9Var).d)) {
            return false;
        }
        if (!this.e.equals(((go) r9Var).e)) {
            return false;
        }
        if (!this.f.equals(((go) r9Var).f)) {
            return false;
        }
        if (!this.g.equals(((go) r9Var).g)) {
            return false;
        }
        if (!this.h.equals(((go) r9Var).h)) {
            return false;
        }
        if (!this.i.equals(((go) r9Var).i)) {
            return false;
        }
        if (!this.j.equals(((go) r9Var).j)) {
            return false;
        }
        if (this.k.equals(((go) r9Var).k)) {
            return this.l.equals(((go) r9Var).l);
        }
        return false;
    }

    public final int hashCode() {
        return this.l.hashCode() ^ ((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", hardware=");
        sb.append(this.c);
        sb.append(", device=");
        sb.append(this.d);
        sb.append(", product=");
        sb.append(this.e);
        sb.append(", osBuild=");
        sb.append(this.f);
        sb.append(", manufacturer=");
        sb.append(this.g);
        sb.append(", fingerprint=");
        sb.append(this.h);
        sb.append(", locale=");
        sb.append(this.i);
        sb.append(", country=");
        sb.append(this.j);
        sb.append(", mccMnc=");
        sb.append(this.k);
        sb.append(", applicationBuild=");
        return fq2.r(sb, this.l, "}");
    }
}
