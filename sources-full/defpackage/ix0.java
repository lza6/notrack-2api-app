package defpackage;

import app.template.extension.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class ix0 {
    public static final LinkedHashSet p = new LinkedHashSet(Arrays.asList(nv.class, vh1.class, p61.class, ij1.class, d04.class, y42.class, rn1.class));
    public static final Map q;
    public CharSequence a;
    public boolean d;
    public boolean h;
    public final List i;
    public final rn0 j;
    public final List k;
    public final hx0 l;
    public final ArrayList n;
    public final LinkedHashSet o;
    public int b = 0;
    public int c = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public final LinkedHashMap m = new LinkedHashMap();

    static {
        HashMap map = new HashMap();
        map.put(nv.class, new ov(0));
        map.put(vh1.class, new ov(2));
        map.put(p61.class, new ov(1));
        map.put(ij1.class, new ov(3));
        map.put(d04.class, new ov(7));
        map.put(y42.class, new ov(5));
        map.put(rn1.class, new ov(4));
        q = Collections.unmodifiableMap(map);
    }

    public ix0(ArrayList arrayList, rn0 rn0Var, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.o = linkedHashSet;
        this.i = arrayList;
        this.j = rn0Var;
        this.k = arrayList2;
        hx0 hx0Var = new hx0(0);
        this.l = hx0Var;
        arrayList3.add(hx0Var);
        linkedHashSet.add(hx0Var);
    }

    public final void a(i iVar) {
        while (!h().b(iVar.e())) {
            e(h());
        }
        h().e().b(iVar.e());
        this.n.add(iVar);
        this.o.add(iVar);
    }

    public final void b(ws2 ws2Var) {
        o42 o42Var = ws2Var.b;
        o42Var.a();
        ArrayList arrayList = o42Var.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            n42 n42Var = (n42) obj;
            rs2 rs2Var = ws2Var.a;
            n42Var.k();
            im0 im0Var = (im0) rs2Var.e;
            n42Var.e = im0Var;
            if (im0Var != null) {
                im0Var.f = n42Var;
            }
            n42Var.f = rs2Var;
            rs2Var.e = n42Var;
            im0 im0Var2 = (im0) rs2Var.b;
            n42Var.b = im0Var2;
            if (((im0) n42Var.e) == null) {
                im0Var2.c = n42Var;
            }
            String str = n42Var.g;
            LinkedHashMap linkedHashMap = this.m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, n42Var);
            }
        }
    }

    public final void c() {
        CharSequence charSequenceSubSequence;
        if (this.d) {
            int i = this.b + 1;
            CharSequence charSequence = this.a;
            CharSequence charSequenceSubSequence2 = charSequence.subSequence(i, charSequence.length());
            int i2 = 4 - (this.c % 4);
            StringBuilder sb = new StringBuilder(charSequenceSubSequence2.length() + i2);
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append(' ');
            }
            sb.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb.toString();
        } else {
            CharSequence charSequence2 = this.a;
            charSequenceSubSequence = charSequence2.subSequence(this.b, charSequence2.length());
        }
        h().a(charSequenceSubSequence);
    }

    public final void d() {
        char cCharAt = this.a.charAt(this.b);
        int i = this.b;
        if (cCharAt != '\t') {
            this.b = i + 1;
            this.c++;
        } else {
            this.b = i + 1;
            int i2 = this.c;
            this.c = (4 - (i2 % 4)) + i2;
        }
    }

    public final void e(i iVar) {
        if (h() == iVar) {
            ArrayList arrayList = this.n;
            arrayList.remove(arrayList.size() - 1);
        }
        if (iVar instanceof ws2) {
            b((ws2) iVar);
        }
        iVar.d();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e((i) list.get(size));
        }
    }

    public final void g() {
        int i = this.b;
        int i2 = this.c;
        this.h = true;
        int length = this.a.length();
        while (i < length) {
            char cCharAt = this.a.charAt(i);
            if (cCharAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (cCharAt != ' ') {
                this.h = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.e = i;
        this.f = i2;
        this.g = i2 - this.c;
    }

    public final i h() {
        ArrayList arrayList = this.n;
        return (i) arrayList.get(arrayList.size() - 1);
    }

    /* JADX WARN: Code duplicated, block: B:213:0x034d  */
    /* JADX WARN: Code duplicated, block: B:235:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:305:0x050c  */
    /* JADX WARN: Code duplicated, block: B:317:0x0549  */
    /* JADX WARN: Code duplicated, block: B:319:0x0563  */
    /* JADX WARN: Code duplicated, block: B:320:0x0565  */
    /* JADX WARN: Code duplicated, block: B:354:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:80:0x015e  */
    /* JADX WARN: Failed to find 'out' block for switch in B:167:0x029e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [ix0] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v78 */
    /* JADX WARN: Type inference failed for: r3v79 */
    public final void i(String str) {
        i iVar;
        int i;
        sv svVar;
        boolean z;
        int i2;
        char cCharAt;
        int i3;
        q61 q61Var;
        sv svVar2;
        wh1 wh1Var;
        int i4;
        StringBuilder sbW;
        int i5;
        z42 z42Var;
        char cCharAt2;
        z42 z42Var2;
        ?? r3;
        boolean zEquals;
        boolean zEquals2;
        int i6;
        int i7;
        char cCharAt3;
        StringBuilder sb;
        int i8;
        int i9;
        pr3 pr3Var;
        String string = str;
        int length = string.length();
        int i10 = 0;
        StringBuilder sb2 = null;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt4 = string.charAt(i11);
            if (cCharAt4 == 0) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(length);
                    sb2.append((CharSequence) string, 0, i11);
                }
                sb2.append((char) 65533);
            } else if (sb2 != null) {
                sb2.append(cCharAt4);
            }
        }
        if (sb2 != null) {
            string = sb2.toString();
        }
        this.a = string;
        this.b = 0;
        this.c = 0;
        this.d = false;
        ArrayList arrayList = this.n;
        int i12 = 1;
        for (i iVar2 : arrayList.subList(1, arrayList.size())) {
            g();
            lv lvVarH = iVar2.h(this);
            if (lvVarH == null) {
                break;
            }
            if (lvVarH.c) {
                e(iVar2);
                return;
            }
            int i13 = lvVarH.a;
            if (i13 != -1) {
                k(i13);
            } else {
                int i14 = lvVarH.b;
                if (i14 != -1) {
                    j(i14);
                }
            }
            i12++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i12, arrayList.size()));
        i iVar3 = (i) arrayList.get(i12 - 1);
        boolean zIsEmpty = arrayList2.isEmpty();
        boolean zF = (iVar3.e() instanceof rs2) || iVar3.f();
        while (true) {
            if (zF) {
                g();
                if (!this.h) {
                    int i15 = 4;
                    if (this.g >= 4 || !Character.isLetter(Character.codePointAt(this.a, this.e))) {
                        jb jbVar = new jb(29, iVar3);
                        Iterator it = this.i.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                char c = '*';
                                i = i10;
                                char c2 = '\t';
                                switch (((ov) it.next()).a) {
                                    case 0:
                                        iVar = iVar3;
                                        int i16 = this.e;
                                        CharSequence charSequence = this.a;
                                        i2 = 4;
                                        if (this.g >= 4 || i16 >= charSequence.length() || charSequence.charAt(i16) != '>') {
                                            svVar = null;
                                        } else {
                                            int i17 = this.c + this.g;
                                            int i18 = i17 + 1;
                                            CharSequence charSequence2 = this.a;
                                            int i19 = i16 + 1;
                                            if (i19 < charSequence2.length() && ((cCharAt = charSequence2.charAt(i19)) == '\t' || cCharAt == ' ')) {
                                                i18 = i17 + 2;
                                            }
                                            i[] iVarArr = new i[1];
                                            iVarArr[i] = new pv();
                                            svVar = new sv(iVarArr);
                                            svVar.c = i18;
                                        }
                                        break;
                                    case 1:
                                        iVar = iVar3;
                                        int i20 = this.g;
                                        if (i20 < 4) {
                                            int i21 = this.e;
                                            CharSequence charSequence3 = this.a;
                                            int length2 = charSequence3.length();
                                            int i22 = i21;
                                            int i23 = i;
                                            int i24 = i23;
                                            while (true) {
                                                i3 = i21;
                                                if (i22 < length2) {
                                                    char cCharAt5 = charSequence3.charAt(i22);
                                                    if (cCharAt5 == '`') {
                                                        i23++;
                                                    } else if (cCharAt5 == '~') {
                                                        i24++;
                                                    }
                                                    i22++;
                                                    i21 = i3;
                                                }
                                            }
                                            int i25 = 3;
                                            if (i23 < 3) {
                                                if (i24 >= i25 || i23 != 0) {
                                                    q61Var = null;
                                                } else {
                                                    q61Var = new q61('~', i24, i20);
                                                }
                                            } else if (i24 == 0) {
                                                int i26 = i3 + i23;
                                                int length3 = charSequence3.length();
                                                while (true) {
                                                    if (i26 >= length3) {
                                                        i26 = -1;
                                                    } else if (charSequence3.charAt(i26) != '`') {
                                                        i26++;
                                                    }
                                                }
                                                if (i26 != -1) {
                                                    q61Var = null;
                                                } else {
                                                    q61Var = new q61('`', i23, i20);
                                                }
                                            } else {
                                                i25 = 3;
                                                if (i24 >= i25) {
                                                    q61Var = null;
                                                } else {
                                                    q61Var = null;
                                                }
                                            }
                                            if (q61Var != null) {
                                                i[] iVarArr2 = new i[1];
                                                iVarArr2[i] = q61Var;
                                                svVar2 = new sv(iVarArr2);
                                                svVar2.b = i3 + q61Var.a.h;
                                                svVar = svVar2;
                                            }
                                            i2 = 4;
                                        }
                                        svVar = null;
                                        i2 = 4;
                                        break;
                                    case 2:
                                        iVar = iVar3;
                                        if (this.g < 4) {
                                            CharSequence charSequence4 = this.a;
                                            int i27 = this.e;
                                            int iY = p23.Y('#', i27, charSequence4.length(), charSequence4) - i27;
                                            if (iY == 0 || iY > 6) {
                                                wh1Var = null;
                                            } else {
                                                int i28 = i27 + iY;
                                                if (i28 >= charSequence4.length()) {
                                                    wh1Var = new wh1(iY, BuildConfig.VERSION_NAME);
                                                } else {
                                                    char cCharAt6 = charSequence4.charAt(i28);
                                                    char c3 = ' ';
                                                    char c4 = '\t';
                                                    if (cCharAt6 == ' ' || cCharAt6 == '\t') {
                                                        int length4 = charSequence4.length() - 1;
                                                        while (true) {
                                                            if (length4 < i28) {
                                                                length4 = i28 - 1;
                                                            } else {
                                                                char cCharAt7 = charSequence4.charAt(length4);
                                                                if (cCharAt7 == c4 || cCharAt7 == c3) {
                                                                    length4--;
                                                                    c4 = '\t';
                                                                    c3 = ' ';
                                                                }
                                                            }
                                                        }
                                                        int i29 = length4;
                                                        while (true) {
                                                            if (i29 < i28) {
                                                                i29 = i28 - 1;
                                                            } else if (charSequence4.charAt(i29) == '#') {
                                                                i29--;
                                                            }
                                                        }
                                                        int i30 = i29;
                                                        while (true) {
                                                            if (i30 < i28) {
                                                                i30 = i28 - 1;
                                                            } else {
                                                                char cCharAt8 = charSequence4.charAt(i30);
                                                                if (cCharAt8 == '\t' || cCharAt8 == ' ') {
                                                                    i30--;
                                                                }
                                                            }
                                                        }
                                                        wh1Var = i30 != i29 ? new wh1(iY, charSequence4.subSequence(i28, i30 + 1).toString()) : new wh1(iY, charSequence4.subSequence(i28, length4 + 1).toString());
                                                    } else {
                                                        wh1Var = null;
                                                    }
                                                }
                                            }
                                            if (wh1Var == null) {
                                                char cCharAt9 = charSequence4.charAt(i27);
                                                if (cCharAt9 == '-') {
                                                    if (p23.Z(p23.Y('-', i27 + 1, charSequence4.length(), charSequence4), charSequence4.length(), charSequence4) >= charSequence4.length()) {
                                                        i4 = 2;
                                                    } else {
                                                        i4 = i;
                                                    }
                                                } else if (cCharAt9 != '=') {
                                                    i4 = i;
                                                } else if (p23.Z(p23.Y('=', i27 + 1, charSequence4.length(), charSequence4), charSequence4.length(), charSequence4) >= charSequence4.length()) {
                                                    i4 = 1;
                                                } else if (p23.Z(p23.Y('-', i27 + 1, charSequence4.length(), charSequence4), charSequence4.length(), charSequence4) >= charSequence4.length()) {
                                                    i4 = 2;
                                                } else {
                                                    i4 = i;
                                                }
                                                if (i4 > 0 && (sbW = jbVar.w()) != null) {
                                                    wh1 wh1Var2 = new wh1(i4, sbW.toString());
                                                    i[] iVarArr3 = new i[1];
                                                    iVarArr3[i] = wh1Var2;
                                                    svVar2 = new sv(iVarArr3);
                                                    svVar2.b = charSequence4.length();
                                                    svVar2.d = true;
                                                }
                                                i2 = 4;
                                            } else {
                                                i[] iVarArr4 = new i[1];
                                                iVarArr4[i] = wh1Var;
                                                svVar2 = new sv(iVarArr4);
                                                svVar2.b = charSequence4.length();
                                            }
                                            svVar = svVar2;
                                            i2 = 4;
                                        }
                                        svVar = null;
                                        i2 = 4;
                                        break;
                                    case 3:
                                        iVar = iVar3;
                                        int i31 = i15;
                                        int i32 = this.e;
                                        CharSequence charSequence5 = this.a;
                                        if (this.g >= i31 || charSequence5.charAt(i32) != '<') {
                                            svVar = null;
                                        } else {
                                            int i33 = 1;
                                            while (true) {
                                                if (i33 <= 7) {
                                                    if (i33 != 7 || !(((i) jbVar.d).e() instanceof rs2)) {
                                                        Pattern[] patternArr = jj1.e[i33];
                                                        Pattern pattern = patternArr[i];
                                                        Pattern pattern2 = patternArr[1];
                                                        if (pattern.matcher(charSequence5.subSequence(i32, charSequence5.length())).find()) {
                                                            i[] iVarArr5 = new i[1];
                                                            iVarArr5[i] = new jj1(pattern2);
                                                            svVar = new sv(iVarArr5);
                                                            svVar.b = this.b;
                                                        }
                                                    }
                                                    i33++;
                                                } else {
                                                    svVar = null;
                                                }
                                            }
                                        }
                                        i2 = 4;
                                        break;
                                    case 4:
                                        iVar = iVar3;
                                        int i34 = 4;
                                        if (this.g < 4) {
                                            svVar = null;
                                        } else if (this.h || (h().e() instanceof rs2)) {
                                            i34 = 4;
                                            svVar = null;
                                        } else {
                                            i[] iVarArr6 = new i[1];
                                            iVarArr6[i] = new wh1();
                                            svVar = new sv(iVarArr6);
                                            i34 = 4;
                                            svVar.c = this.c + 4;
                                        }
                                        i2 = i34;
                                        break;
                                    case 5:
                                        i iVar4 = (i) jbVar.d;
                                        int i35 = this.g;
                                        if (i35 < 4) {
                                            int i36 = this.e;
                                            int i37 = this.c + i35;
                                            int i38 = jbVar.w() != null ? 1 : i;
                                            CharSequence charSequence6 = this.a;
                                            char cCharAt10 = charSequence6.charAt(i36);
                                            if (cCharAt10 == '*' || cCharAt10 == '+' || cCharAt10 == '-') {
                                                i5 = i38;
                                                iVar = iVar3;
                                                int i39 = i36 + 1;
                                                if (i39 >= charSequence6.length() || (cCharAt2 = charSequence6.charAt(i39)) == '\t' || cCharAt2 == ' ') {
                                                    ry ryVar = new ry();
                                                    ryVar.h = cCharAt10;
                                                    z42Var = new z42(ryVar, i39);
                                                } else {
                                                    z42Var = null;
                                                }
                                            } else {
                                                int length5 = charSequence6.length();
                                                int i40 = i36;
                                                int i41 = i;
                                                while (true) {
                                                    i5 = i38;
                                                    if (i40 < length5) {
                                                        char cCharAt11 = charSequence6.charAt(i40);
                                                        iVar = iVar3;
                                                        if (cCharAt11 != ')' && cCharAt11 != '.') {
                                                            switch (cCharAt11) {
                                                                case '0':
                                                                case '1':
                                                                case '2':
                                                                case '3':
                                                                case '4':
                                                                case '5':
                                                                case '6':
                                                                case '7':
                                                                case '8':
                                                                case '9':
                                                                    i41++;
                                                                    if (i41 <= 9) {
                                                                        i40++;
                                                                        i38 = i5;
                                                                        iVar3 = iVar;
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        } else if (i41 >= 1 && ((i7 = i40 + 1) >= charSequence6.length() || (cCharAt3 = charSequence6.charAt(i7)) == '\t' || cCharAt3 == ' ')) {
                                                            String string2 = charSequence6.subSequence(i36, i40).toString();
                                                            kq2 kq2Var = new kq2();
                                                            kq2Var.h = Integer.parseInt(string2);
                                                            kq2Var.i = cCharAt11;
                                                            z42Var = new z42(kq2Var, i7);
                                                        }
                                                    } else {
                                                        iVar = iVar3;
                                                    }
                                                    z42Var = null;
                                                }
                                            }
                                            if (z42Var == null) {
                                                z42Var2 = null;
                                            } else {
                                                y42 y42Var = z42Var.a;
                                                int i42 = z42Var.b;
                                                int i43 = (i42 - i36) + i37;
                                                int length6 = charSequence6.length();
                                                int i44 = i43;
                                                while (true) {
                                                    if (i42 >= length6) {
                                                        i6 = i;
                                                    } else {
                                                        char cCharAt12 = charSequence6.charAt(i42);
                                                        if (cCharAt12 == '\t') {
                                                            i44 = (4 - (i44 % 4)) + i44;
                                                        } else if (cCharAt12 == ' ') {
                                                            i44++;
                                                        } else {
                                                            i6 = 1;
                                                        }
                                                        i42++;
                                                    }
                                                }
                                                if (i5 == 0 || ((!(y42Var instanceof kq2) || ((kq2) y42Var).h == 1) && i6 != 0)) {
                                                    if (i6 == 0 || i44 - i43 > 4) {
                                                        i44 = i43 + 1;
                                                    }
                                                    z42Var2 = new z42(y42Var, i44);
                                                } else {
                                                    z42Var2 = null;
                                                }
                                            }
                                            if (z42Var2 != null) {
                                                y42 y42Var2 = z42Var2.a;
                                                int i45 = z42Var2.b;
                                                y52 y52Var = new y52(i45 - this.c);
                                                if (iVar4 instanceof a52) {
                                                    y42 y42Var3 = ((a52) iVar4).a;
                                                    if ((y42Var3 instanceof ry) && (y42Var2 instanceof ry)) {
                                                        zEquals2 = Character.valueOf(((ry) y42Var3).h).equals(Character.valueOf(((ry) y42Var2).h));
                                                    } else if ((y42Var3 instanceof kq2) && (y42Var2 instanceof kq2)) {
                                                        zEquals = Character.valueOf(((kq2) y42Var3).i).equals(Character.valueOf(((kq2) y42Var2).i));
                                                    } else {
                                                        r3 = i;
                                                    }
                                                    if (r3 == 0) {
                                                        r3 = zEquals;
                                                        r3 = zEquals2;
                                                        a52 a52Var = new a52(y42Var2);
                                                        y42Var2.g = true;
                                                        i[] iVarArr7 = new i[2];
                                                        iVarArr7[i] = a52Var;
                                                        iVarArr7[1] = y52Var;
                                                        svVar = new sv(iVarArr7);
                                                        svVar.c = i45;
                                                    } else {
                                                        r3 = zEquals;
                                                        r3 = zEquals2;
                                                        i[] iVarArr8 = new i[1];
                                                        iVarArr8[i] = y52Var;
                                                        sv svVar3 = new sv(iVarArr8);
                                                        svVar3.c = i45;
                                                        svVar = svVar3;
                                                    }
                                                } else {
                                                    r3 = zEquals;
                                                    r3 = zEquals2;
                                                    a52 a52Var2 = new a52(y42Var2);
                                                    y42Var2.g = true;
                                                    i[] iVarArr9 = new i[2];
                                                    iVarArr9[i] = a52Var2;
                                                    iVarArr9[1] = y52Var;
                                                    svVar = new sv(iVarArr9);
                                                    svVar.c = i45;
                                                }
                                            }
                                            i2 = 4;
                                        } else {
                                            iVar = iVar3;
                                        }
                                        svVar = null;
                                        i2 = 4;
                                        break;
                                    case 6:
                                        CharSequence charSequence7 = this.a;
                                        StringBuilder sbW2 = jbVar.w();
                                        if (sbW2 == null || !sbW2.toString().contains("|") || sbW2.toString().contains("\n")) {
                                            svVar = null;
                                        } else {
                                            CharSequence charSequenceSubSequence = charSequence7.subSequence(this.b, charSequence7.length());
                                            ArrayList arrayList3 = new ArrayList();
                                            int i46 = i;
                                            int i47 = i46;
                                            int i48 = i47;
                                            while (true) {
                                                if (i47 < charSequenceSubSequence.length()) {
                                                    char cCharAt13 = charSequenceSubSequence.charAt(i47);
                                                    if (cCharAt13 == c2 || cCharAt13 == ' ') {
                                                        sb = sbW2;
                                                        i47++;
                                                    } else {
                                                        sb = sbW2;
                                                        if (cCharAt13 == '-' || cCharAt13 == ':') {
                                                            if (i48 != 0 || arrayList3.isEmpty()) {
                                                                if (cCharAt13 == ':') {
                                                                    i47++;
                                                                    i8 = 1;
                                                                } else {
                                                                    i8 = i;
                                                                }
                                                                int i49 = i;
                                                                while (i47 < charSequenceSubSequence.length() && charSequenceSubSequence.charAt(i47) == '-') {
                                                                    i47++;
                                                                    i49 = 1;
                                                                }
                                                                if (i49 != 0) {
                                                                    if (i47 >= charSequenceSubSequence.length() || charSequenceSubSequence.charAt(i47) != ':') {
                                                                        i9 = i;
                                                                    } else {
                                                                        i47++;
                                                                        i9 = 1;
                                                                    }
                                                                    if (i8 != 0 && i9 != 0) {
                                                                        pr3Var = pr3.d;
                                                                    } else if (i8 != 0) {
                                                                        pr3Var = pr3.c;
                                                                    } else {
                                                                        pr3Var = i9 != 0 ? pr3.h : null;
                                                                    }
                                                                    arrayList3.add(pr3Var);
                                                                    i48 = i;
                                                                }
                                                            }
                                                        } else if (cCharAt13 == '|') {
                                                            i47++;
                                                            i48++;
                                                            if (i48 <= 1) {
                                                                i46 = 1;
                                                            }
                                                        }
                                                    }
                                                    sbW2 = sb;
                                                    c2 = '\t';
                                                } else {
                                                    sb = sbW2;
                                                    if (i46 == 0) {
                                                    }
                                                }
                                                arrayList3 = null;
                                            }
                                            if (arrayList3 == null || arrayList3.isEmpty()) {
                                                svVar = null;
                                            } else {
                                                ArrayList arrayListI = nr3.i(sb);
                                                if (arrayList3.size() >= arrayListI.size()) {
                                                    i[] iVarArr10 = new i[1];
                                                    iVarArr10[i] = new nr3(arrayList3, arrayListI);
                                                    sv svVar4 = new sv(iVarArr10);
                                                    svVar4.b = this.b;
                                                    svVar4.d = true;
                                                    svVar = svVar4;
                                                } else {
                                                    svVar = null;
                                                }
                                            }
                                        }
                                        iVar = iVar3;
                                        i2 = 4;
                                        break;
                                    default:
                                        if (this.g >= i15) {
                                            svVar = null;
                                        } else {
                                            int i50 = this.e;
                                            CharSequence charSequence8 = this.a;
                                            int length7 = charSequence8.length();
                                            int i51 = i;
                                            int i52 = i51;
                                            int i53 = i52;
                                            while (true) {
                                                if (i50 >= length7) {
                                                    int i54 = i52;
                                                    int i55 = i53;
                                                    if ((i51 >= 3 && i54 == 0 && i55 == 0) || ((i54 >= 3 && i51 == 0 && i55 == 0) || (i55 >= 3 && i51 == 0 && i54 == 0))) {
                                                        i[] iVarArr11 = new i[1];
                                                        iVarArr11[i] = new hx0(1);
                                                        svVar = new sv(iVarArr11);
                                                        svVar.b = charSequence8.length();
                                                    }
                                                } else {
                                                    char cCharAt14 = charSequence8.charAt(i50);
                                                    if (cCharAt14 == '\t' || cCharAt14 == ' ') {
                                                        i52 = i52;
                                                        i53 = i53;
                                                    } else if (cCharAt14 == c) {
                                                        i53++;
                                                    } else if (cCharAt14 == '-') {
                                                        i51++;
                                                    } else if (cCharAt14 == '_') {
                                                        i52++;
                                                    }
                                                    i50++;
                                                    c = '*';
                                                }
                                                svVar = null;
                                            }
                                        }
                                        iVar = iVar3;
                                        i2 = 4;
                                        break;
                                }
                                if (svVar == null) {
                                    i15 = i2;
                                    i10 = i;
                                    iVar3 = iVar;
                                }
                            } else {
                                i = i10;
                                iVar = iVar3;
                                svVar = null;
                            }
                        }
                        if (svVar == null) {
                            k(this.e);
                        } else {
                            if (!zIsEmpty) {
                                f(arrayList2);
                                zIsEmpty = true;
                            }
                            int i56 = svVar.b;
                            if (i56 != -1) {
                                k(i56);
                            } else {
                                int i57 = svVar.c;
                                if (i57 != -1) {
                                    j(i57);
                                }
                            }
                            if (svVar.d) {
                                i iVarH = h();
                                z = true;
                                arrayList.remove(arrayList.size() - 1);
                                this.o.remove(iVarH);
                                if (iVarH instanceof ws2) {
                                    b((ws2) iVarH);
                                }
                                iVarH.e().k();
                            } else {
                                z = true;
                            }
                            i[] iVarArr12 = svVar.a;
                            int length8 = iVarArr12.length;
                            iVar3 = iVar;
                            for (int i58 = i; i58 < length8; i58++) {
                                iVar3 = iVarArr12[i58];
                                a(iVar3);
                                zF = iVar3.f();
                            }
                            i10 = i;
                        }
                    }
                }
                iVar = iVar3;
                k(this.e);
            } else {
                iVar = iVar3;
            }
            if (!zIsEmpty && !this.h && h().c()) {
                c();
                return;
            }
            if (!zIsEmpty) {
                f(arrayList2);
            }
            if (!iVar.f()) {
                c();
                return;
            } else {
                if (this.h) {
                    return;
                }
                a(new ws2());
                c();
                return;
            }
        }
    }

    public final void j(int i) {
        int i2;
        int i3 = this.f;
        if (i >= i3) {
            this.b = this.e;
            this.c = i3;
        }
        int length = this.a.length();
        while (true) {
            i2 = this.c;
            if (i2 >= i || this.b == length) {
                break;
            } else {
                d();
            }
        }
        if (i2 <= i) {
            this.d = false;
            return;
        }
        this.b--;
        this.c = i;
        this.d = true;
    }

    public final void k(int i) {
        int i2 = this.e;
        if (i >= i2) {
            this.b = i2;
            this.c = this.f;
        }
        int length = this.a.length();
        while (true) {
            int i3 = this.b;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                d();
            }
        }
        this.d = false;
    }
}
