package androidx.compose.foundation.relocation;

import androidx.compose.ui.c;
import defpackage.kx;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final c a(c cVar, kx kxVar) {
        return cVar.then(new BringIntoViewRequesterElement(kxVar));
    }
}
