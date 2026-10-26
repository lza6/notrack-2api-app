package defpackage;

import java.util.Iterator;
import java.util.List;
import notrack.ai.data.account.Entitlements;
import notrack.ai.data.promo.PromoCopy;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v40 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v40(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7 A[LOOP:0: B:24:0x0077->B:35:0x00a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e1 A[LOOP:2: B:41:0x00b2->B:52:0x00e1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX WARN: Code duplicated, block: B:70:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0132  */
    /* JADX WARN: Code duplicated, block: B:89:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x004d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x004d A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x0132, please report this as an issue */
    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        Object next;
        String str;
        ps2 ps2Var;
        String str2;
        Object next2;
        String str3;
        String str4;
        int i = this.c;
        gs1 gs1Var = null;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                return w40.ChatBgSheet$lambda$56$lambda$55$lambda$48$lambda$3$lambda$2((qt) obj3, (ck0) obj, ((Integer) obj2).intValue());
            case 1:
                return wa0.ChatDrawer$lambda$725((Integer) obj3, (ck0) obj, ((Integer) obj2).intValue());
            case 2:
                return wa0.PromoCard$lambda$402$lambda$401$lambda$397$lambda$396((PromoCopy) obj3, (ck0) obj, ((Integer) obj2).intValue());
            case 3:
                return wa0.ChatScreen$lambda$208$lambda$207((e94) obj3, (ck0) obj, ((Integer) obj2).intValue());
            case 4:
                return wa0.AccountSheet$lambda$1073$lambda$1072$lambda$1040$lambda$1039$lambda$1038$lambda$1037((Entitlements) obj3, (ck0) obj, ((Integer) obj2).intValue());
            case 5:
                int iIntValue = ((Integer) obj).intValue();
                vp0 vp0Var = (vp0) obj2;
                wp0 key = vp0Var.getKey();
                vp0 vp0Var2 = ((p83) obj3).d.get(key);
                if (key == bg1.s) {
                    gs1 gs1Var2 = (gs1) vp0Var2;
                    gs1 parent = (gs1) vp0Var;
                    while (parent != null) {
                        if (parent != gs1Var2 && (parent instanceof db3)) {
                            ub0 ub0VarD = ((db3) parent).D();
                            parent = ub0VarD != null ? ub0VarD.getParent() : null;
                        } else {
                            gs1Var = parent;
                            if (gs1Var == gs1Var2) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + gs1Var + ", expected child of " + gs1Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                            if (gs1Var2 != null) {
                                iIntValue++;
                            }
                        }
                    }
                    if (gs1Var == gs1Var2) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + gs1Var + ", expected child of " + gs1Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (gs1Var2 != null) {
                        iIntValue++;
                    }
                } else if (vp0Var != vp0Var2) {
                    iIntValue = Integer.MIN_VALUE;
                } else {
                    iIntValue++;
                }
                return Integer.valueOf(iIntValue);
            case 6:
                List list = (List) obj3;
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                charSequence.getClass();
                if (list.size() == 1) {
                    String str5 = (String) ke0.J0(list);
                    int iA0 = mo3.A0(charSequence, str5, iIntValue2, false, 4);
                    if (iA0 < 0) {
                        ps2Var = null;
                    } else {
                        ps2Var = new ps2(Integer.valueOf(iA0), str5);
                    }
                } else {
                    if (iIntValue2 < 0) {
                        iIntValue2 = 0;
                    }
                    lq1 lq1Var = new lq1(iIntValue2, charSequence.length(), 1);
                    boolean z = charSequence instanceof String;
                    int i2 = lq1Var.h;
                    int i3 = lq1Var.d;
                    if (z) {
                        if ((i2 <= 0 || iIntValue2 > i3) && (i2 >= 0 || i3 > iIntValue2)) {
                            ps2Var = null;
                        } else {
                            while (true) {
                                Iterator it = list.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        str4 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str3 = (String) next2;
                                    if (str3 != null) {
                                        ps2Var = new ps2(Integer.valueOf(iIntValue2), str3);
                                    } else if (iIntValue2 != i3) {
                                        iIntValue2 += i2;
                                    } else {
                                        ps2Var = null;
                                    }
                                } while (!str4.regionMatches(0, (String) charSequence, iIntValue2, str4.length()));
                                str3 = (String) next2;
                                if (str3 != null) {
                                    ps2Var = new ps2(Integer.valueOf(iIntValue2), str3);
                                } else if (iIntValue2 != i3) {
                                    iIntValue2 += i2;
                                } else {
                                    ps2Var = null;
                                }
                            }
                        }
                    } else if ((i2 <= 0 || iIntValue2 > i3) && (i2 >= 0 || i3 > iIntValue2)) {
                        ps2Var = null;
                    } else {
                        int i4 = iIntValue2;
                        while (true) {
                            Iterator it2 = list.iterator();
                            do {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    str2 = (String) next;
                                } else {
                                    next = null;
                                }
                                str = (String) next;
                                if (str != null) {
                                    ps2Var = new ps2(Integer.valueOf(i4), str);
                                } else if (i4 != i3) {
                                    i4 += i2;
                                } else {
                                    ps2Var = null;
                                }
                            } while (!mo3.I0(str2, 0, charSequence, i4, str2.length(), false));
                            str = (String) next;
                            if (str != null) {
                                ps2Var = new ps2(Integer.valueOf(i4), str);
                            } else if (i4 != i3) {
                                i4 += i2;
                            } else {
                                ps2Var = null;
                            }
                        }
                    }
                }
                if (ps2Var != null) {
                    return new ps2(ps2Var.c, Integer.valueOf(((String) ps2Var.d).length()));
                }
                return null;
            default:
                CharSequence charSequence2 = (CharSequence) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                charSequence2.getClass();
                int iB0 = mo3.B0(charSequence2, (char[]) obj3, iIntValue3, false);
                if (iB0 < 0) {
                    return null;
                }
                return new ps2(Integer.valueOf(iB0), 1);
        }
    }
}
