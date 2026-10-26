package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public class ut1 extends z {
    public final JsonObject f;
    public final tf3 g;
    public int h;
    public boolean i;

    public /* synthetic */ ut1(rs1 rs1Var, JsonObject jsonObject, String str, int i) {
        this(rs1Var, jsonObject, (i & 4) != 0 ? null : str, (tf3) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut1(rs1 rs1Var, JsonObject jsonObject, String str, tf3 tf3Var) {
        super(rs1Var, str);
        rs1Var.getClass();
        this.f = jsonObject;
        this.g = tf3Var;
    }

    @Override // defpackage.z, defpackage.hs0
    public final nk0 B(tf3 tf3Var) {
        tf3Var.getClass();
        tf3 tf3Var2 = this.g;
        if (tf3Var != tf3Var2) {
            return super.B(tf3Var);
        }
        JsonElement jsonElementE = E();
        String strB = tf3Var2.b();
        if (jsonElementE instanceof JsonObject) {
            return new ut1(this.c, (JsonObject) jsonElementE, this.d, tf3Var2);
        }
        throw vl0.e(-1, "Expected " + Options$Companion.getClassSimpleName(r43.a(JsonObject.class).c) + ", but had " + Options$Companion.getClassSimpleName(r43.a(jsonElementE.getClass()).c) + " as the serialized body of " + strB + " at element: " + T(), jsonElementE.toString());
    }

    @Override // defpackage.z
    public JsonElement D(String str) {
        str.getClass();
        return (JsonElement) y92.R(str, R());
    }

    @Override // defpackage.z
    public String P(tf3 tf3Var, int i) {
        tf3Var.getClass();
        rs1 rs1Var = this.c;
        ot1.a(rs1Var, tf3Var);
        String strE = tf3Var.e(i);
        if (this.e.f && !R().keySet().contains(strE)) {
            jb jbVar = rs1Var.c;
            ye yeVar = new ye(tf3Var, 17, rs1Var);
            jbVar.getClass();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) jbVar.d;
            Map map = (Map) concurrentHashMap.get(tf3Var);
            Object obj = null;
            rn0 rn0Var = ot1.a;
            Object objInvoke = map != null ? map.get(rn0Var) : null;
            if (objInvoke == null) {
                objInvoke = null;
            }
            if (objInvoke == null) {
                objInvoke = yeVar.invoke();
                Object concurrentHashMap2 = concurrentHashMap.get(tf3Var);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(tf3Var, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(rn0Var, objInvoke);
            }
            Map map2 = (Map) objInvoke;
            for (Object obj2 : R().keySet()) {
                Integer num = (Integer) map2.get((String) obj2);
                if (num != null && num.intValue() == i) {
                    obj = obj2;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return strE;
    }

    @Override // defpackage.z
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public JsonObject R() {
        return this.f;
    }

    @Override // defpackage.z, defpackage.hs0
    public final boolean e() {
        return !this.i && super.e();
    }

    @Override // defpackage.nk0
    public int h(tf3 tf3Var) {
        tf3Var.getClass();
        while (this.h < tf3Var.d()) {
            int i = this.h;
            this.h = i + 1;
            String strQ = Q(tf3Var, i);
            int i2 = this.h - 1;
            this.i = false;
            if (!R().containsKey(strQ)) {
                boolean z = (this.c.a.c || tf3Var.j(i2) || !tf3Var.i(i2).g()) ? false : true;
                this.i = z;
                if (z) {
                }
            }
            this.e.getClass();
            return i2;
        }
        return -1;
    }

    @Override // defpackage.z, defpackage.nk0
    public void q(tf3 tf3Var) {
        Set setN;
        tf3Var.getClass();
        ws1 ws1Var = this.e;
        if (ws1Var.b || (tf3Var.c() instanceof nx2)) {
            return;
        }
        rs1 rs1Var = this.c;
        ot1.a(rs1Var, tf3Var);
        if (ws1Var.f) {
            Set setN2 = gb2.n(tf3Var);
            jb jbVar = rs1Var.c;
            jbVar.getClass();
            Map map = (Map) ((ConcurrentHashMap) jbVar.d).get(tf3Var);
            Object obj = map != null ? map.get(ot1.a) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set setKeySet = map2 != null ? map2.keySet() : null;
            if (setKeySet == null) {
                setKeySet = f31.c;
            }
            Set set = setKeySet;
            setN2.getClass();
            Integer numValueOf = set instanceof Collection ? Integer.valueOf(set.size()) : null;
            LinkedHashSet linkedHashSet = new LinkedHashSet(y92.S(numValueOf != null ? setN2.size() + numValueOf.intValue() : setN2.size() * 2));
            linkedHashSet.addAll(setN2);
            pe0.s0(set, linkedHashSet);
            setN = linkedHashSet;
        } else {
            setN = gb2.n(tf3Var);
        }
        for (String str : R().keySet()) {
            if (!setN.contains(str) && !kr1.n(str, this.d)) {
                String string = R().toString();
                str.getClass();
                StringBuilder sbS = fq2.s("Encountered an unknown key '", str, "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: ");
                sbS.append((Object) vl0.X(-1, string));
                throw vl0.d(-1, sbS.toString());
            }
        }
    }
}
