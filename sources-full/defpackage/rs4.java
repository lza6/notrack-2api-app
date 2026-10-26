package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class rs4 extends ks4 {
    public final /* synthetic */ ts4 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs4(ts4 ts4Var, us3 us3Var, String str) {
        super(ts4Var, new d5("OnRequestInstallCallback"), us3Var);
        this.h = ts4Var;
    }

    @Override // defpackage.ks4
    public final void j(Bundle bundle) {
        super.j(bundle);
        int i = bundle.getInt("error.code", -2);
        us3 us3Var = this.f;
        if (i != 0) {
            us3Var.a(new wp1(bundle.getInt("error.code", -2)));
            return;
        }
        bundle.getInt("version.code", -1);
        int i2 = bundle.getInt("update.availability");
        int i3 = bundle.getInt("install.status", 0);
        Integer numValueOf = bundle.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle.getInt("client.version.staleness"));
        bundle.getInt("in.app.update.priority", 0);
        bundle.getLong("bytes.downloaded");
        bundle.getLong("total.bytes.to.download");
        long j = bundle.getLong("additional.size.required");
        xs4 xs4Var = this.h.d;
        xs4Var.getClass();
        long jA = xs4.a(new File(xs4Var.a.getFilesDir(), "assetpacks"));
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("blocking.intent");
        PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("nonblocking.intent");
        PendingIntent pendingIntent3 = (PendingIntent) bundle.getParcelable("blocking.destructive.intent");
        PendingIntent pendingIntent4 = (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent");
        HashMap map = new HashMap();
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent");
        HashSet hashSet = new HashSet();
        if (integerArrayList != null) {
            hashSet.addAll(integerArrayList);
        }
        map.put("blocking.destructive.intent", hashSet);
        ArrayList<Integer> integerArrayList2 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent");
        HashSet hashSet2 = new HashSet();
        if (integerArrayList2 != null) {
            hashSet2.addAll(integerArrayList2);
        }
        map.put("nonblocking.destructive.intent", hashSet2);
        ArrayList<Integer> integerArrayList3 = bundle.getIntegerArrayList("update.precondition.failures:blocking.intent");
        HashSet hashSet3 = new HashSet();
        if (integerArrayList3 != null) {
            hashSet3.addAll(integerArrayList3);
        }
        map.put("blocking.intent", hashSet3);
        ArrayList<Integer> integerArrayList4 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent");
        HashSet hashSet4 = new HashSet();
        if (integerArrayList4 != null) {
            hashSet4.addAll(integerArrayList4);
        }
        map.put("nonblocking.intent", hashSet4);
        us3Var.b(new wk(i2, i3, numValueOf, j, jA, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4));
    }
}
