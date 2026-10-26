package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xo4 extends sp4 {
    private static final xo4 zzb;
    private vp4 zzd = gq4.m;

    static {
        xo4 xo4Var = new xo4();
        zzb = xo4Var;
        sp4.f(xo4.class, xo4Var);
    }

    public static wo4 p() {
        return (wo4) zzb.k();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void q(xo4 xo4Var, ArrayList arrayList) {
        vp4 vp4Var = xo4Var.zzd;
        if (!((fp4) vp4Var).c) {
            int size = vp4Var.size();
            xo4Var.zzd = vp4Var.a(size + size);
        }
        List list = xo4Var.zzd;
        int size2 = arrayList.size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size2);
        } else if (list instanceof gq4) {
            gq4 gq4Var = (gq4) list;
            int i = gq4Var.h + size2;
            int length = gq4Var.d.length;
            if (i > length) {
                if (length != 0) {
                    while (length < i) {
                        length = Math.max(((length * 3) / 2) + 1, 10);
                    }
                    gq4Var.d = Arrays.copyOf(gq4Var.d, length);
                } else {
                    gq4Var.d = new Object[Math.max(i, 10)];
                }
            }
        }
        int size3 = list.size();
        int size4 = arrayList.size();
        for (int i2 = 0; i2 < size4; i2++) {
            Object obj = arrayList.get(i2);
            if (obj == null) {
                String strQ = ud2.q("Element at index ", " is null.", list.size() - size3);
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 < size3) {
                        m51.x(strQ);
                        return;
                    }
                    list.remove(size5);
                }
            } else {
                list.add(obj);
            }
        }
    }

    @Override // defpackage.sp4
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new iq4(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", vo4.class});
        }
        if (i2 == 3) {
            return new xo4();
        }
        if (i2 == 4) {
            return new wo4(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
