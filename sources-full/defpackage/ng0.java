package defpackage;

import android.app.ActivityOptions;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ng0 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();
    public final /* synthetic */ qg0 h;

    public ng0(qg0 qg0Var) {
        this.h = qg0Var;
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        b4 b4Var = (b4) this.e.get(str);
        if ((b4Var != null ? b4Var.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                b4Var.a.b(b4Var.b.c(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new q3(intent, i2));
        return true;
    }

    public final void b(int i, s3 s3Var, Object obj, jb jbVar) {
        Bundle bundle;
        int i2;
        s3Var.getClass();
        qg0 qg0Var = this.h;
        jb jbVarB = s3Var.b(qg0Var, obj);
        if (jbVarB != null) {
            new Handler(Looper.getMainLooper()).post(new iu(i, 1, this, jbVarB));
            return;
        }
        Intent intentA = s3Var.a(qg0Var, obj);
        if (intentA.getExtras() != null) {
            Bundle extras = intentA.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                intentA.setExtrasClassLoader(qg0Var.getClassLoader());
            }
        }
        if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = jbVar != null ? ((ActivityOptions) jbVar.d).toBundle() : null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
            String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i3 = 0; i3 < stringArrayExtra.length; i3++) {
                if (TextUtils.isEmpty(stringArrayExtra[i3])) {
                    u41.k(fq2.r(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                    return;
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i3], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i3));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i4 = 0;
                for (int i5 = 0; i5 < stringArrayExtra.length; i5++) {
                    if (!hashSet.contains(Integer.valueOf(i5))) {
                        strArr[i4] = stringArrayExtra[i5];
                        i4++;
                    }
                }
            }
            qg0Var.requestPermissions(stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
            qg0Var.startActivityForResult(intentA, i, bundle2);
            return;
        }
        sq1 sq1Var = (sq1) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            sq1Var.getClass();
            i2 = i;
            try {
                qg0Var.startIntentSenderForResult(sq1Var.c, i2, sq1Var.d, sq1Var.h, sq1Var.l, 0, bundle2);
            } catch (IntentSender.SendIntentException e) {
                e = e;
                new Handler(Looper.getMainLooper()).post(new iu(i2, 2, this, e));
            }
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            i2 = i;
        }
    }

    public final e4 c(String str, s3 s3Var, r3 r3Var) {
        str.getClass();
        s3Var.getClass();
        d(str);
        this.e.put(str, new b4(r3Var, s3Var));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            r3Var.b(obj);
        }
        Bundle bundle = this.g;
        q3 q3Var = (q3) xr0.c0(str, bundle);
        if (q3Var != null) {
            bundle.remove(str);
            r3Var.b(s3Var.c(q3Var.d, q3Var.c));
        }
        return new e4(this, str, s3Var, 1);
    }

    public final void d(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : new em0(new su0(d4.d, new s80(18), 1))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        j93.g("Sequence contains no element matching the predicate.");
    }

    public final void e(String str) {
        Integer num;
        str.getClass();
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbS = fq2.s("Dropping pending result for request ", str, ": ");
            sbS.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", sbS.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((q3) xr0.c0(str, bundle)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        c4 c4Var = (c4) linkedHashMap2.get(str);
        if (c4Var != null) {
            ArrayList arrayList = c4Var.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                c4Var.a.b((k32) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
