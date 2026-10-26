package defpackage;

import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class ws2 extends i {
    public final rs2 a = new rs2();
    public final o42 b = new o42();

    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    @Override // defpackage.i
    public final void a(CharSequence charSequence) {
        int iU;
        int i;
        o42 o42Var = this.b;
        StringBuilder sb = o42Var.b;
        if (sb.length() != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        int iZ = 0;
        while (iZ < charSequence.length()) {
            int iZ2 = fq2.z(o42Var.a);
            if (iZ2 == 0) {
                int iZ3 = p23.Z(iZ, charSequence.length(), charSequence);
                if (iZ3 >= charSequence.length() || charSequence.charAt(iZ3) != '[') {
                    iZ = -1;
                } else {
                    o42Var.a = 2;
                    o42Var.d = new StringBuilder();
                    iZ = iZ3 + 1;
                    if (iZ >= charSequence.length()) {
                        o42Var.d.append('\n');
                    }
                }
            } else if (iZ2 == 1) {
                iU = yh4.U(iZ, charSequence);
                if (iU == -1) {
                    iZ = -1;
                } else {
                    o42Var.d.append(charSequence, iZ, iU);
                    if (iU >= charSequence.length()) {
                        o42Var.d.append('\n');
                        iZ = iU;
                    } else if (charSequence.charAt(iU) != ']' || (i = iU + 1) >= charSequence.length() || charSequence.charAt(i) != ':' || o42Var.d.length() > 999) {
                        iZ = -1;
                    } else {
                        String string = o42Var.d.toString();
                        Pattern pattern = t41.a;
                        String strReplaceAll = t41.c.matcher(string.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        if (strReplaceAll.isEmpty()) {
                            iZ = -1;
                        } else {
                            o42Var.e = strReplaceAll;
                            o42Var.a = 3;
                            iZ = p23.Z(iU + 2, charSequence.length(), charSequence);
                        }
                    }
                }
            } else if (iZ2 == 2) {
                int iZ4 = p23.Z(iZ, charSequence.length(), charSequence);
                int iT = yh4.T(iZ4, charSequence);
                if (iT != -1) {
                    o42Var.f = charSequence.charAt(iZ4) == '<' ? charSequence.subSequence(iZ4 + 1, iT - 1).toString() : charSequence.subSequence(iZ4, iT).toString();
                    iZ = p23.Z(iT, charSequence.length(), charSequence);
                    if (iZ >= charSequence.length()) {
                        o42Var.i = true;
                        sb.setLength(0);
                    } else if (iZ == iT) {
                        iZ = -1;
                    }
                    o42Var.a = 4;
                } else {
                    iZ = -1;
                }
            } else if (iZ2 == 3) {
                iZ = p23.Z(iZ, charSequence.length(), charSequence);
                if (iZ >= charSequence.length()) {
                    o42Var.a = 1;
                } else {
                    o42Var.g = (char) 0;
                    char cCharAt = charSequence.charAt(iZ);
                    if (cCharAt == '\"' || cCharAt == '\'') {
                        o42Var.g = cCharAt;
                    } else if (cCharAt == '(') {
                        o42Var.g = ')';
                    }
                    if (o42Var.g != 0) {
                        o42Var.a = 5;
                        o42Var.h = new StringBuilder();
                        iZ++;
                        if (iZ == charSequence.length()) {
                            o42Var.h.append('\n');
                        }
                    } else {
                        o42Var.a();
                        o42Var.a = 1;
                    }
                }
            } else if (iZ2 == 4) {
                iU = yh4.V(charSequence, iZ, o42Var.g);
                if (iU == -1) {
                    iZ = -1;
                } else {
                    o42Var.h.append(charSequence.subSequence(iZ, iU));
                    if (iU >= charSequence.length()) {
                        o42Var.h.append('\n');
                        iZ = iU;
                    } else {
                        iZ = p23.Z(iU + 1, charSequence.length(), charSequence);
                        if (iZ != charSequence.length()) {
                            iZ = -1;
                        } else {
                            o42Var.i = true;
                            o42Var.a();
                            sb.setLength(0);
                            o42Var.a = 1;
                        }
                    }
                }
            } else if (iZ2 == 5) {
                return;
            }
            if (iZ == -1) {
                o42Var.a = 6;
                return;
            }
        }
    }

    @Override // defpackage.i
    public final boolean c() {
        return true;
    }

    @Override // defpackage.i
    public final void d() {
        if (this.b.b.length() == 0) {
            this.a.k();
        }
    }

    @Override // defpackage.i
    public final kv e() {
        return this.a;
    }

    @Override // defpackage.i
    public final void g(vo1 vo1Var) {
        StringBuilder sb = this.b.b;
        if (sb.length() > 0) {
            vo1Var.f(sb.toString(), this.a);
        }
    }

    @Override // defpackage.i
    public final lv h(ix0 ix0Var) {
        if (ix0Var.h) {
            return null;
        }
        return lv.a(ix0Var.b);
    }
}
