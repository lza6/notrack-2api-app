package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.RectF;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aq implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;

    public /* synthetic */ aq(Object obj, int i, Object obj2) {
        this.c = i;
        this.h = obj;
        this.d = obj2;
    }

    public /* synthetic */ aq(mi2 mi2Var, SharedPreferences sharedPreferences) {
        this.c = 1;
        this.d = mi2Var;
        this.h = sharedPreferences;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        tw2 tw2Var;
        int i = this.c;
        int i2 = 1;
        Object[] objArr = 0;
        w84 w84Var = w84.a;
        Object obj2 = this.d;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                tz0 tz0Var = (tz0) obj;
                tz0Var.getClass();
                qq.h(p9.a(tz0Var.A().y()), Float.intBitsToFloat((int) (tz0Var.b() >> 32)), 1.0f, (Bitmap) obj3, (pq0) ((mi2) obj2).getValue());
                float fC = bi3.c(tz0Var.b()) / 2.0f;
                ic icVarA = kc.a();
                icVarA.f(1);
                nt2.a(icVarA, xp1.a(0L, tz0Var.b()));
                long jW = tz0Var.W();
                int i3 = (int) (jW >> 32);
                float fIntBitsToFloat = Float.intBitsToFloat(i3) - fC;
                int i4 = (int) (jW & 4294967295L);
                float fIntBitsToFloat2 = Float.intBitsToFloat(i4) - fC;
                float fIntBitsToFloat3 = Float.intBitsToFloat(i3) + fC;
                float fIntBitsToFloat4 = Float.intBitsToFloat(i4) + fC;
                if (icVarA.b == null) {
                    icVarA.b = new RectF();
                }
                RectF rectF = icVarA.b;
                rectF.getClass();
                rectF.set(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4);
                Path path = icVarA.a;
                RectF rectF2 = icVarA.b;
                rectF2.getClass();
                path.addOval(rectF2, kc.b(lt2.c));
                tz0.H(tz0Var, icVarA, re0.b(0.55f, re0.b), null, 60);
                tz0.K(tz0Var, re0.b(0.9f, re0.e), fC - tz0Var.w(1.0f), 0L, new vo3(0, tz0Var.w(1.5f), 0, 0.0f, 30), 108);
                break;
            case 1:
                mi2 mi2Var = (mi2) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                gf3 gf3Var = (gf3) obj;
                gf3Var.getClass();
                if (!((Boolean) mi2Var.getValue()).booleanValue()) {
                    n60 n60Var = new n60(sharedPreferences, mi2Var, 2);
                    pu1[] pu1VarArr = ef3.a;
                    ((ue3) gf3Var).j(te3.s, new z0(null, n60Var));
                } else {
                    n60 n60Var2 = new n60(sharedPreferences, mi2Var, 1);
                    pu1[] pu1VarArr2 = ef3.a;
                    ((ue3) gf3Var).j(te3.t, new z0(null, n60Var2));
                }
                break;
            case 2:
                gn3 gn3Var = (gn3) obj3;
                n63 n63Var = (n63) obj;
                n63Var.getClass();
                n63Var.g(((Number) gn3Var.getValue()).floatValue());
                n63Var.i(((Number) gn3Var.getValue()).floatValue());
                n63Var.a(((Number) ((gn3) obj2).getValue()).floatValue());
                break;
            case 3:
                Context context = (Context) obj3;
                hb0 hb0Var = (hb0) obj2;
                uw2 uw2Var = (uw2) obj;
                uw2Var.getClass();
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null && (tw2Var = (tw2) hb0Var.b.i.getValue()) != null) {
                    String accountId = ((xa0) hb0Var.c.getValue()).c0.getAccountId();
                    if (accountId == null || mo3.C0(accountId)) {
                        jn3 jn3Var = hb0Var.u;
                        jn3Var.getClass();
                        jn3Var.p(null, "play_no_account");
                    } else {
                        py.F(id4.a(hb0Var), null, null, new ve(hb0Var, tw2Var, activity, uw2Var, accountId, null, 3, false), 3);
                    }
                }
                break;
            case 4:
                hb0 hb0Var2 = (hb0) obj3;
                Uri uri = (Uri) obj;
                String str = (String) ((mi2) obj2).getValue();
                str.getClass();
                qt qtVar = ((xa0) hb0Var2.d.c.getValue()).y;
                if (qtVar != null && uri != null) {
                    py.F(id4.a(hb0Var2), null, null, new qb(hb0Var2, str, uri, qtVar, null, 3), 3);
                }
                break;
            case 5:
                String str2 = (String) obj;
                str2.getClass();
                ((mi2) obj2).setValue(str2);
                iv2 iv2Var = new iv2();
                iv2Var.a = w3.a;
                ((j92) obj3).a(iv2Var, null);
                break;
            case 6:
                hb0 hb0Var3 = (hb0) obj3;
                gn3 gn3Var2 = (gn3) obj2;
                q3 q3Var = (q3) obj;
                q3Var.getClass();
                if (q3Var.c == -1) {
                    Intent intent = q3Var.d;
                    ArrayList<String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("android.speech.extra.RESULTS") : null;
                    if (stringArrayListExtra != null && !stringArrayListExtra.isEmpty()) {
                        hb0Var3.O(((xa0) gn3Var2.getValue()).d + " " + ((Object) stringArrayListExtra.get(0)));
                    }
                }
                break;
            case 7:
                List list = (List) obj3;
                q12 q12Var = (q12) obj;
                q12Var.getClass();
                q12Var.h.c(list.size(), new o12(null, new i90(0, list), new yg0(-632812321, new j90(list, (le1) obj2), true)));
                break;
            case 8:
                g22 g22Var = (g22) obj3;
                mi2 mi2Var2 = (mi2) obj2;
                ((Long) obj).getClass();
                z12 z12VarG = g22Var.g();
                mt0 mt0Var = g22Var.h;
                int i5 = z12VarG.n;
                if (i5 > 0 && ((Boolean) mi2Var2.getValue()).booleanValue() && !mt0Var.b()) {
                    int i6 = i5 - 1;
                    if (mt0Var.b()) {
                        py.F(((z12) g22Var.e.getValue()).h, null, null, new y90(i2, objArr == true ? 1 : 0, g22Var), 3);
                    }
                    g22Var.j(i6, DurationKt.NANOS_IN_MILLIS, false);
                }
                break;
            default:
                ((eh1) obj3).c.removeCallbacks((ba) obj2);
                break;
        }
        return w84Var;
    }
}
