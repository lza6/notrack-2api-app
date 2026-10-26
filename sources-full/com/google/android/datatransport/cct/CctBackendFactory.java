package com.google.android.datatransport.cct;

import android.content.Context;
import defpackage.f64;
import defpackage.i20;
import defpackage.ko;
import defpackage.nq0;

/* JADX INFO: loaded from: classes.dex */
public class CctBackendFactory {
    public f64 create(nq0 nq0Var) {
        Context context = ((ko) nq0Var).a;
        ko koVar = (ko) nq0Var;
        return new i20(context, koVar.b, koVar.c);
    }
}
