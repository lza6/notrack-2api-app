package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class sh1 {
    public final ArrayList a;

    public sh1() {
        this.a = new ArrayList(20);
    }

    public sh1(a54 a54Var) {
        fl2 fl2Var;
        a54Var.getClass();
        kt ktVar = new kt(a54Var.b, 0);
        kt ktVar2 = new kt(a54Var.c);
        kt ktVar3 = new kt(a54Var.e, 4);
        im0 im0Var = a54Var.d;
        kt ktVar4 = new kt(im0Var, 2);
        kt ktVar5 = new kt(im0Var, 3);
        al2 al2Var = new al2(im0Var);
        zk2 zk2Var = new zk2(im0Var);
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = a54Var.a;
            String str = ph4.a;
            context.getClass();
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            fl2Var = new fl2((ConnectivityManager) systemService);
        } else {
            fl2Var = null;
        }
        this.a = vl.t0(new fm0[]{ktVar, ktVar2, ktVar3, ktVar4, ktVar5, al2Var, zk2Var, fl2Var});
    }

    public sh1(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new yz2(jSONObjectOptJSONObject));
                }
            }
        }
        this.a = arrayList;
    }

    public void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        ArrayList arrayList = this.a;
        arrayList.add(str);
        arrayList.add(mo3.U0(str2).toString());
    }

    public boolean b(hi4 hi4Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            if (((fm0) obj).b(hi4Var)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            v72.f().c(ph4.a, "Work " + hi4Var.a + " constrained by " + ke0.D0(arrayList, null, null, null, lb4.x, 31));
        }
        return arrayList.isEmpty();
    }

    public th1 c() {
        return new th1((String[]) this.a.toArray(new String[0]));
    }

    public void d(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public k81 e(hi4 hi4Var) {
        hi4Var.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            if (((fm0) obj).a(hi4Var)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(le0.q0(arrayList, 10));
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            arrayList3.add(((fm0) obj2).c(hi4Var.j));
        }
        return sf3.x(new pm0(4, (k81[]) ke0.O0(arrayList3).toArray(new k81[0])));
    }
}
