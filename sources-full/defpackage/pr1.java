package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class pr1 implements wb2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;

    public pr1(int i, int i2, Map map) {
        this.a = i;
        this.b = i2;
        this.c = map;
    }

    @Override // defpackage.wb2
    public final Map a() {
        return this.c;
    }

    @Override // defpackage.wb2
    public final void b() {
    }

    @Override // defpackage.wb2
    public final le1 c() {
        return null;
    }

    @Override // defpackage.wb2
    public final int getHeight() {
        return this.b;
    }

    @Override // defpackage.wb2
    public final int getWidth() {
        return this.a;
    }
}
