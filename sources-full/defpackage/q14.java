package defpackage;

import app.template.extension.BuildConfig;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final enum q14 extends e44 {
    public q14() {
        super("RcdataLessthanSign", 10);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        if (p30Var.m('/')) {
            o14Var.e();
            o14Var.a(e44.s);
            return;
        }
        if (p30Var.o() && o14Var.o != null) {
            String str = "</" + o14Var.o;
            Locale locale = Locale.ENGLISH;
            String lowerCase = str.toLowerCase(locale);
            String upperCase = str.toUpperCase(locale);
            if (p30Var.p(lowerCase) <= -1 && p30Var.p(upperCase) <= -1) {
                m14 m14VarD = o14Var.d(false);
                String str2 = o14Var.o;
                m14VarD.b = str2;
                m14VarD.c = str2 != null ? str2.toLowerCase(locale) : BuildConfig.VERSION_NAME;
                o14Var.i = m14VarD;
                o14Var.k();
                p30Var.q();
                o14Var.c = e44.c;
                return;
            }
        }
        o14Var.h("<");
        o14Var.c = e44.h;
    }
}
