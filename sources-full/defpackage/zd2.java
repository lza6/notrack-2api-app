package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zd2 {
    public final bi4 a;
    public final ci4 b;
    public final HashMap c;

    public zd2(Context context, ci4 ci4Var) {
        bi4 bi4Var = new bi4();
        bi4Var.d = null;
        bi4Var.c = context;
        this.c = new HashMap();
        this.a = bi4Var;
        this.b = ci4Var;
    }

    public final synchronized f64 a(String str) {
        if (this.c.containsKey(str)) {
            return (f64) this.c.get(str);
        }
        CctBackendFactory cctBackendFactoryE = this.a.e(str);
        if (cctBackendFactoryE == null) {
            return null;
        }
        ci4 ci4Var = this.b;
        f64 f64VarCreate = cctBackendFactoryE.create(new ko((Context) ci4Var.d, (ld0) ci4Var.h, (ld0) ci4Var.l, str));
        this.c.put(str, f64VarCreate);
        return f64VarCreate;
    }
}
