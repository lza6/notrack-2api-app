package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class hi2 {
    public static final hi2 b = new hi2();
    public final AtomicReference a = new AtomicReference(new dg3(new ir3(13)));

    public final kr1 a(f13 f13Var) {
        AtomicReference atomicReference = this.a;
        dg3 dg3Var = (dg3) atomicReference.get();
        dg3Var.getClass();
        nz nzVar = (nz) f13Var.b;
        if (!dg3Var.b.containsKey(new bg3(f13.class, nzVar))) {
            try {
                x22 x22Var = new x22();
                ((wu1) f13Var.d).ordinal();
                return x22Var;
            } catch (GeneralSecurityException e) {
                throw new eg0("Creating a LegacyProtoKey failed", e);
            }
        }
        dg3 dg3Var2 = (dg3) atomicReference.get();
        dg3Var2.getClass();
        bg3 bg3Var = new bg3(f13.class, nzVar);
        HashMap map = dg3Var2.b;
        if (map.containsKey(bg3Var)) {
            return ((jv1) map.get(bg3Var)).b.d(f13Var);
        }
        m51.q(bg3Var, " available", "No Key Parser for requested key type ");
        return null;
    }

    public final synchronized void b(jv1 jv1Var) {
        ir3 ir3Var = new ir3((dg3) this.a.get());
        jv1Var.getClass();
        bg3 bg3Var = new bg3(f13.class, jv1Var.a);
        HashMap map = (HashMap) ir3Var.d;
        if (map.containsKey(bg3Var)) {
            jv1 jv1Var2 = (jv1) map.get(bg3Var);
            if (!jv1Var2.equals(jv1Var) || jv1Var != jv1Var2) {
                m51.w(bg3Var, "Attempt to register non-equal parser for already existing object of type: ");
            }
        } else {
            map.put(bg3Var, jv1Var);
        }
        this.a.set(new dg3(ir3Var));
    }

    public final synchronized void c(lv1 lv1Var) {
        ir3 ir3Var = new ir3((dg3) this.a.get());
        cg3 cg3Var = new cg3(lv1Var.a, f13.class);
        HashMap map = (HashMap) ir3Var.c;
        if (map.containsKey(cg3Var)) {
            lv1 lv1Var2 = (lv1) map.get(cg3Var);
            if (!lv1Var2.equals(lv1Var) || lv1Var != lv1Var2) {
                m51.w(cg3Var, "Attempt to register non-equal serializer for already existing object of type: ");
            }
        } else {
            map.put(cg3Var, lv1Var);
        }
        this.a.set(new dg3(ir3Var));
    }

    public final synchronized void d(zs2 zs2Var) {
        ir3 ir3Var = new ir3((dg3) this.a.get());
        zs2Var.getClass();
        bg3 bg3Var = new bg3(g13.class, zs2Var.a);
        HashMap map = (HashMap) ir3Var.l;
        if (map.containsKey(bg3Var)) {
            zs2 zs2Var2 = (zs2) map.get(bg3Var);
            if (!zs2Var2.equals(zs2Var) || zs2Var != zs2Var2) {
                m51.w(bg3Var, "Attempt to register non-equal parser for already existing object of type: ");
            }
        } else {
            map.put(bg3Var, zs2Var);
        }
        this.a.set(new dg3(ir3Var));
    }

    public final synchronized void e(at2 at2Var) {
        ir3 ir3Var = new ir3((dg3) this.a.get());
        cg3 cg3Var = new cg3(at2Var.a, g13.class);
        HashMap map = (HashMap) ir3Var.h;
        if (map.containsKey(cg3Var)) {
            at2 at2Var2 = (at2) map.get(cg3Var);
            if (!at2Var2.equals(at2Var) || at2Var != at2Var2) {
                m51.w(cg3Var, "Attempt to register non-equal serializer for already existing object of type: ");
            }
        } else {
            map.put(cg3Var, at2Var);
        }
        this.a.set(new dg3(ir3Var));
    }
}
