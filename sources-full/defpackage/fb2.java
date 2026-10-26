package defpackage;

import androidx.compose.foundation.d;
import androidx.compose.runtime.Composer$Companion;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class fb2 {
    public static final un3 a = new un3(bb2.d);

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void MaterialExpressiveTheme(ye0 ye0Var, vg3 vg3Var, m74 m74Var, ne1 ne1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        m74 m74Var2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1399457222);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.h(ye0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var.h(vg3Var) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= kk0Var.h(m74Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= kk0Var.j(ne1Var) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && kk0Var.F()) {
            kk0Var.V();
            m74Var2 = m74Var;
        } else {
            if (i4 != 0) {
                ye0Var = null;
            }
            if (i5 != 0) {
                vg3Var = null;
            }
            m74 m74Var3 = i6 == 0 ? m74Var : null;
            un3 un3Var = a;
            if (((Boolean) kk0Var.l(un3Var)).booleanValue()) {
                kk0Var.a0(547059915);
                kk0Var.a0(1126027167);
                ab2 ab2Var = ab2.a;
                ye0 colorScheme = ye0Var == null ? ab2Var.getColorScheme(kk0Var, 6) : ye0Var;
                kk0Var.r(false);
                kk0Var.a0(1126029309);
                m74 typography = m74Var3 == null ? ab2Var.getTypography(kk0Var, 6) : m74Var3;
                kk0Var.r(false);
                kk0Var.a0(1126031253);
                vg3 shapes = vg3Var == null ? ab2Var.getShapes(kk0Var, 6) : vg3Var;
                kk0Var.r(false);
                MaterialTheme(colorScheme, shapes, typography, ne1Var, kk0Var, i3 & 7168, 0);
                kk0Var.r(false);
            } else {
                kk0Var.a0(547327197);
                yk0.CompositionLocalProvider(un3Var.c(Boolean.TRUE), zg0.rememberComposableLambda(2050809758, true, new cb2(ye0Var, vg3Var, m74Var3, ne1Var), kk0Var, 54), kk0Var, 56);
                kk0Var.r(false);
            }
            m74Var2 = m74Var3;
        }
        ye0 ye0Var2 = ye0Var;
        vg3 vg3Var2 = vg3Var;
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new db2(ye0Var2, vg3Var2, m74Var2, ne1Var, i, i2, 0));
        }
    }

    public static final void MaterialTheme(ye0 ye0Var, vg3 vg3Var, m74 m74Var, ne1 ne1Var, ck0 ck0Var, int i, int i2) {
        ye0 colorScheme;
        int i3;
        vg3 shapes;
        m74 typography;
        int i4;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-2127166334);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                colorScheme = ye0Var;
                int i5 = kk0Var.h(colorScheme) ? 4 : 2;
                i3 = i5 | i;
            } else {
                colorScheme = ye0Var;
            }
            i3 = i5 | i;
        } else {
            colorScheme = ye0Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                shapes = vg3Var;
                int i6 = kk0Var.h(shapes) ? 32 : 16;
                i3 |= i6;
            } else {
                shapes = vg3Var;
            }
            i3 |= i6;
        } else {
            shapes = vg3Var;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                typography = m74Var;
                if (kk0Var.h(typography)) {
                    i4 = FontInfo.NUMBER_OF_CHAR_CODES;
                }
                i3 |= i4;
            } else {
                typography = m74Var;
            }
            i4 = Uuid.SIZE_BITS;
            i3 |= i4;
        } else {
            typography = m74Var;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= kk0Var.j(ne1Var) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && kk0Var.F()) {
            kk0Var.V();
        } else {
            kk0Var.X();
            if ((i & 1) == 0 || kk0Var.D()) {
                int i7 = i2 & 1;
                ab2 ab2Var = ab2.a;
                if (i7 != 0) {
                    colorScheme = ab2Var.getColorScheme(kk0Var, 6);
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    shapes = ab2Var.getShapes(kk0Var, 6);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    typography = ab2Var.getTypography(kk0Var, 6);
                    i3 &= -897;
                }
            } else {
                kk0Var.V();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            }
            kk0Var.s();
            yk0.CompositionLocalProvider(new s13[]{af0.a.c(colorScheme), d.a.c(g73.m194xaeb141ad(false, 0.0f, 0L, kk0Var, 0, 7)), l73.a.c(zf0.a), wg3.a.c(shapes), mz3.a.c(rememberTextSelectionColors(colorScheme, kk0Var, i3 & 14)), o74.a.c(typography)}, zg0.rememberComposableLambda(-1066563262, true, new eb2(typography, ne1Var), kk0Var, 54), kk0Var, 56);
        }
        ye0 ye0Var2 = colorScheme;
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new db2(ye0Var2, shapes, typography, ne1Var, i, i2, 1));
        }
    }

    public static final lz3 rememberTextSelectionColors(ye0 ye0Var, ck0 ck0Var, int i) {
        long j = ye0Var.a;
        kk0 kk0Var = (kk0) ck0Var;
        boolean zG = kk0Var.g(j);
        Object objP = kk0Var.P();
        if (zG || objP == Composer$Companion.getEmpty()) {
            objP = new lz3(j, re0.b(0.4f, j));
            kk0Var.l0(objP);
        }
        return (lz3) objP;
    }
}
