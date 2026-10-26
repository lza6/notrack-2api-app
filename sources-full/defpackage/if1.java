package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes.dex */
public final class if1 extends v0 {
    public static final Parcelable.Creator<if1> CREATOR = new p3(29);
    public static final Scope[] w = new Scope[0];
    public static final o61[] x = new o61[0];
    public final int c;
    public final int d;
    public final int h;
    public String l;
    public IBinder m;
    public Scope[] n;
    public Bundle o;
    public Account p;
    public o61[] q;
    public o61[] r;
    public final boolean s;
    public final int t;
    public final boolean u;
    public final String v;

    public if1(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, o61[] o61VarArr, o61[] o61VarArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? w : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        o61[] o61VarArr3 = x;
        o61VarArr = o61VarArr == null ? o61VarArr3 : o61VarArr;
        o61VarArr2 = o61VarArr2 == null ? o61VarArr3 : o61VarArr2;
        this.c = i;
        this.d = i2;
        this.h = i3;
        if ("com.google.android.gms".equals(str)) {
            this.l = "com.google.android.gms";
        } else {
            this.l = str;
        }
        if (i < 2) {
            Account accountB = null;
            if (iBinder != null) {
                int i5 = e2.e;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface zs4Var = iInterfaceQueryLocalInterface instanceof wk1 ? (wk1) iInterfaceQueryLocalInterface : new zs4(iBinder);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        accountB = ((zs4) zs4Var).b();
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    }
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th;
                }
            }
            this.p = accountB;
        } else {
            this.m = iBinder;
            this.p = account;
        }
        this.n = scopeArr;
        this.o = bundle;
        this.q = o61VarArr;
        this.r = o61VarArr2;
        this.s = z;
        this.t = i4;
        this.u = z2;
        this.v = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        p3.a(this, parcel, i);
    }
}
