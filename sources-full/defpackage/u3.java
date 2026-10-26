package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class u3 extends s3 {
    public final /* synthetic */ int a;

    public /* synthetic */ u3(int i) {
        this.a = i;
    }

    public /* synthetic */ u3(int i, boolean z) {
        this.a = i;
    }

    @Override // defpackage.s3
    public final Intent a(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.a) {
            case 0:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
                type.getClass();
                return type;
            case 1:
                iv2 iv2Var = (iv2) obj;
                iv2Var.getClass();
                int i = Build.VERSION.SDK_INT;
                if (i >= 33 || (i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                    Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                    intent.setType(Options$Companion.getVisualMimeType$activity_release(iv2Var.a));
                    return intent;
                }
                if (context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) != null) {
                    ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
                    if (resolveInfoResolveActivity == null) {
                        u41.r("Required value was null.");
                        return null;
                    }
                    ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
                    Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                    intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                    intent2.setType(Options$Companion.getVisualMimeType$activity_release(iv2Var.a));
                    return intent2;
                }
                if (context.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112) == null) {
                    Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                    intent3.setType(Options$Companion.getVisualMimeType$activity_release(iv2Var.a));
                    if (intent3.getType() != null) {
                        return intent3;
                    }
                    intent3.setType("*/*");
                    intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                    return intent3;
                }
                ResolveInfo resolveInfoResolveActivity2 = context.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112);
                if (resolveInfoResolveActivity2 == null) {
                    u41.r("Required value was null.");
                    return null;
                }
                ActivityInfo activityInfo2 = resolveInfoResolveActivity2.activityInfo;
                Intent intent4 = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
                intent4.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                intent4.setType(Options$Companion.getVisualMimeType$activity_release(iv2Var.a));
                return intent4;
            case 2:
                String[] strArr2 = (String[]) obj;
                strArr2.getClass();
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr2);
                intentPutExtra.getClass();
                return intentPutExtra;
            case 3:
                String str = (String) obj;
                str.getClass();
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                intentPutExtra2.getClass();
                return intentPutExtra2;
            case 4:
                Intent intent5 = (Intent) obj;
                intent5.getClass();
                return intent5;
            case 5:
                sq1 sq1Var = (sq1) obj;
                sq1Var.getClass();
                Intent intentPutExtra3 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", sq1Var);
                intentPutExtra3.getClass();
                return intentPutExtra3;
            default:
                sq1 sq1Var2 = (sq1) obj;
                Intent intent6 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent7 = sq1Var2.d;
                if (intent7 != null && (bundleExtra = intent7.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent6.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent7.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent7.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = sq1Var2.c;
                        intentSender.getClass();
                        sq1Var2 = new sq1(intentSender, null, sq1Var2.h, sq1Var2.l);
                    }
                }
                intent6.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", sq1Var2);
                if (nd1.K(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent6);
                }
                return intent6;
        }
    }

    @Override // defpackage.s3
    public jb b(Context context, Object obj) {
        int i = 5;
        switch (this.a) {
            case 0:
                ((String[]) obj).getClass();
                return null;
            case 1:
                ((iv2) obj).getClass();
                return null;
            case 2:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    return new jb(i, a31.c);
                }
                for (String str : strArr) {
                    if (jr1.h(context, str) != 0) {
                        return null;
                    }
                }
                int iS = y92.S(strArr.length);
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new jb(i, linkedHashMap);
            case 3:
                String str3 = (String) obj;
                str3.getClass();
                if (jr1.h(context, str3) == 0) {
                    return new jb(i, Boolean.TRUE);
                }
                return null;
            default:
                return super.b(context, obj);
        }
    }

    @Override // defpackage.s3
    public final Object c(Intent intent, int i) {
        List arrayList;
        z = false;
        boolean z = false;
        switch (this.a) {
            case 0:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
            case 1:
                if (i != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                Uri data = intent.getData();
                if (data != null) {
                    return data;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data2 = intent.getData();
                if (data2 != null) {
                    linkedHashSet.add(data2);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    arrayList = z21.c;
                } else {
                    if (clipData != null) {
                        int itemCount = clipData.getItemCount();
                        for (int i2 = 0; i2 < itemCount; i2++) {
                            Uri uri = clipData.getItemAt(i2).getUri();
                            if (uri != null) {
                                linkedHashSet.add(uri);
                            }
                        }
                    }
                    arrayList = new ArrayList(linkedHashSet);
                }
                return (Uri) ke0.z0(arrayList);
            case 2:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList2 = new ArrayList(intArrayExtra.length);
                        for (int i3 : intArrayExtra) {
                            arrayList2.add(Boolean.valueOf(i3 == 0));
                        }
                        ArrayList arrayListT0 = vl.t0(stringArrayExtra);
                        Iterator it = arrayListT0.iterator();
                        Iterator it2 = arrayList2.iterator();
                        ArrayList arrayList3 = new ArrayList(Math.min(le0.q0(arrayListT0, 10), le0.q0(arrayList2, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList3.add(new ps2(it.next(), it2.next()));
                        }
                        return y92.V(arrayList3);
                    }
                }
                return a31.c;
            case 3:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra2 != null) {
                    for (int i4 : intArrayExtra2) {
                        if (i4 == 0) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 4:
                return new q3(intent, i);
            case 5:
                return new q3(intent, i);
            default:
                return new q3(intent, i);
        }
    }
}
