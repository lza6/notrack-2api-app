package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class ok4 extends ck4 implements xf1, yf1 {
    public static final yj4 l = qk4.a;
    public final Context e;
    public final Handler f;
    public final yj4 g;
    public final Set h;
    public final f13 i;
    public nh3 j;
    public gk4 k;

    public ok4(Context context, el4 el4Var, f13 f13Var) {
        super(0);
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.e = context;
        this.f = el4Var;
        this.i = f13Var;
        this.h = (Set) f13Var.b;
        this.g = l;
    }

    @Override // defpackage.xf1
    public final void b(int i) {
        gk4 gk4Var = this.k;
        ek4 ek4Var = (ek4) gk4Var.n.j.get(gk4Var.d);
        if (ek4Var != null) {
            if (ek4Var.l) {
                ek4Var.p(new ml0(17, null, null));
            } else {
                ek4Var.b(i);
            }
        }
    }

    @Override // defpackage.yf1
    public final void c(ml0 ml0Var) {
        this.k.a(ml0Var);
    }

    @Override // defpackage.xf1
    public final void e() {
        GoogleSignInAccount googleSignInAccountA;
        nh3 nh3Var = this.j;
        nh3Var.getClass();
        boolean z = false;
        try {
            nh3Var.z.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = nh3Var.c;
                ReentrantLock reentrantLock = yn3.c;
                g13.s(context);
                ReentrantLock reentrantLock2 = yn3.c;
                reentrantLock2.lock();
                try {
                    if (yn3.d == null) {
                        yn3.d = new yn3(context.getApplicationContext());
                    }
                    yn3 yn3Var = yn3.d;
                    reentrantLock2.unlock();
                    String strA = yn3Var.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strA)) {
                        String strA2 = yn3Var.a("googleSignInAccount:" + strA);
                        if (strA2 != null) {
                            try {
                                googleSignInAccountA = GoogleSignInAccount.a(strA2);
                            } catch (JSONException unused) {
                                googleSignInAccountA = null;
                            }
                        }
                    }
                    googleSignInAccountA = null;
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } else {
                googleSignInAccountA = null;
            }
            Integer num = nh3Var.B;
            g13.s(num);
            dl4 dl4Var = new dl4(2, account, num.intValue(), googleSignInAccountA);
            sk4 sk4Var = (sk4) nh3Var.q();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(sk4Var.f);
            int i = kk4.a;
            parcelObtain.writeInt(1);
            int iE0 = py.e0(parcelObtain, 20293);
            py.d0(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            py.Z(parcelObtain, 2, dl4Var, 0);
            py.f0(parcelObtain, iE0);
            parcelObtain.writeStrongBinder(this);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                sk4Var.e.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f.post(new io4(14, this, new zk4(1, new ml0(8, null, null), null), z));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }
}
