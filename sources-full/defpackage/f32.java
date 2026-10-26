package defpackage;

import androidx.lifecycle.Lifecycle$Event$Companion;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f32 {
    private static final /* synthetic */ f32[] $VALUES;
    public static final Lifecycle$Event$Companion Companion;
    public static final f32 ON_ANY;
    public static final f32 ON_CREATE;
    public static final f32 ON_DESTROY;
    public static final f32 ON_PAUSE;
    public static final f32 ON_RESUME;
    public static final f32 ON_START;
    public static final f32 ON_STOP;

    static {
        f32 f32Var = new f32("ON_CREATE", 0);
        ON_CREATE = f32Var;
        f32 f32Var2 = new f32("ON_START", 1);
        ON_START = f32Var2;
        f32 f32Var3 = new f32("ON_RESUME", 2);
        ON_RESUME = f32Var3;
        f32 f32Var4 = new f32("ON_PAUSE", 3);
        ON_PAUSE = f32Var4;
        f32 f32Var5 = new f32("ON_STOP", 4);
        ON_STOP = f32Var5;
        f32 f32Var6 = new f32("ON_DESTROY", 5);
        ON_DESTROY = f32Var6;
        f32 f32Var7 = new f32("ON_ANY", 6);
        ON_ANY = f32Var7;
        $VALUES = new f32[]{f32Var, f32Var2, f32Var3, f32Var4, f32Var5, f32Var6, f32Var7};
        Companion = new Lifecycle$Event$Companion();
    }

    public static f32 valueOf(String str) {
        return (f32) Enum.valueOf(f32.class, str);
    }

    public static f32[] values() {
        return (f32[]) $VALUES.clone();
    }

    public final g32 a() {
        switch (e32.a[ordinal()]) {
            case 1:
            case 2:
                return g32.h;
            case 3:
            case 4:
                return g32.l;
            case 5:
                return g32.m;
            case 6:
                return g32.c;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
