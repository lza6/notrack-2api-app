package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class be4 extends Exception {
    public final String c;
    public final int d;
    public final Map h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be4(String str, int i, Map map) {
        super("vision_quota");
        str.getClass();
        map.getClass();
        this.c = str;
        this.d = i;
        this.h = map;
    }
}
