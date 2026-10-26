package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class ko3 {
    public static final String pluralStringResource(int i, int i2, ck0 ck0Var, int i3) {
        return d63.resources(ck0Var, 0).getQuantityString(i, i2);
    }

    public static final String pluralStringResource(int i, int i2, Object[] objArr, ck0 ck0Var, int i3) {
        return d63.resources(ck0Var, 0).getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
    }

    public static final String[] stringArrayResource(int i, ck0 ck0Var, int i2) {
        return d63.resources(ck0Var, 0).getStringArray(i);
    }

    public static final String stringResource(int i, ck0 ck0Var, int i2) {
        return d63.resources(ck0Var, 0).getString(i);
    }

    public static final String stringResource(int i, Object[] objArr, ck0 ck0Var, int i2) {
        return d63.resources(ck0Var, 0).getString(i, Arrays.copyOf(objArr, objArr.length));
    }
}
