package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class rc3 implements qu1 {
    public final vc0 a;
    public final List b;
    public final ly1 c = yo4.H(q22.c, new wl(17, this));
    public final Map d;
    public final LinkedHashMap e;

    public rc3(vc0 vc0Var, vc0[] vc0VarArr, qu1[] qu1VarArr, Annotation[] annotationArr) {
        this.a = vc0Var;
        this.b = z21.c;
        if (vc0VarArr.length != qu1VarArr.length) {
            j93.e(Options$Companion.getClassSimpleName(vc0Var.c), " should be marked @Serializable", "All subclasses of sealed class ");
            throw null;
        }
        int iMin = Math.min(vc0VarArr.length, qu1VarArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(new ps2(vc0VarArr[i], qu1VarArr[i]));
        }
        Map mapV = y92.V(arrayList);
        this.d = mapV;
        Set<Map.Entry> setEntrySet = mapV.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            String strB = ((qu1) entry.getValue()).getDescriptor().b();
            Object obj = linkedHashMap.get(strB);
            if (obj == null) {
                linkedHashMap.containsKey(strB);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                StringBuilder sb = new StringBuilder("Multiple sealed subclasses of '");
                sb.append(this.a);
                sb.append("' have the same serial name '");
                sb.append(strB);
                sb.append("': '");
                sb.append(entry2.getKey());
                Object key = entry.getKey();
                sb.append("', '");
                sb.append(key);
                sb.append('\'');
                throw new IllegalStateException(sb.toString().toString());
            }
            linkedHashMap.put(strB, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(y92.S(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (qu1) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.e = linkedHashMap2;
        List listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.b = listAsList;
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 descriptor = getDescriptor();
        nk0 nk0VarB = hs0Var.B(descriptor);
        Object objV = null;
        String strN = null;
        while (true) {
            int iH = nk0VarB.h(getDescriptor());
            if (iH == -1) {
                if (objV != null) {
                    nk0VarB.q(descriptor);
                    return objV;
                }
                u41.h(fq2.m("Polymorphic value has not been read for class ", strN));
                return null;
            }
            if (iH == 0) {
                strN = nk0VarB.n(getDescriptor(), iH);
            } else {
                if (iH != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    if (strN == null) {
                        strN = "unknown class";
                    }
                    sb.append(strN);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(iH);
                    throw new ag3(sb.toString());
                }
                if (strN == null) {
                    u41.k("Cannot read polymorphic value before its type token");
                    return null;
                }
                objV = nk0VarB.v(getDescriptor(), iH, av1.r(this, nk0VarB, strN), null);
            }
        }
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return (tf3) this.c.getValue();
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        obj.getClass();
        qu1 qu1VarS = av1.s(this, do3Var, obj);
        tf3 descriptor = getDescriptor();
        do3 do3VarA = do3Var.a(descriptor);
        do3VarA.u(getDescriptor(), 0, qu1VarS.getDescriptor().b());
        do3VarA.q(getDescriptor(), 1, qu1VarS, obj);
        do3VarA.v(descriptor);
    }
}
