package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n60 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ SharedPreferences d;
    public final /* synthetic */ mi2 h;

    public /* synthetic */ n60(SharedPreferences sharedPreferences, mi2 mi2Var, int i) {
        this.c = i;
        this.d = sharedPreferences;
        this.h = mi2Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        mi2 mi2Var = this.h;
        SharedPreferences sharedPreferences = this.d;
        switch (i) {
            case 0:
                mi2Var.setValue(Boolean.valueOf(!((Boolean) mi2Var.getValue()).booleanValue()));
                sharedPreferences.edit().putBoolean("side_tools_open", ((Boolean) mi2Var.getValue()).booleanValue()).apply();
                return w84.a;
            case 1:
                mi2Var.setValue(Boolean.FALSE);
                sharedPreferences.edit().putBoolean("side_tools_open", false).apply();
                return Boolean.TRUE;
            default:
                Boolean bool = Boolean.TRUE;
                mi2Var.setValue(bool);
                sharedPreferences.edit().putBoolean("side_tools_open", true).apply();
                return bool;
        }
    }
}
