package defpackage;

import java.util.Comparator;
import notrack.ai.data.chatmeta.FolderMeta;
import notrack.ai.data.voice.VoiceOption;

/* JADX INFO: loaded from: classes.dex */
public final class fb1 implements Comparator {
    public static final fb1 b = new fb1(0);
    public static final fb1 c = new fb1(1);
    public final /* synthetic */ int a;

    public /* synthetic */ fb1(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                db1 db1Var = (db1) obj;
                db1 db1Var2 = (db1) obj2;
                if (av1.C(db1Var) && av1.C(db1Var2)) {
                    ux1 ux1VarM = y64.M(db1Var);
                    ux1 ux1VarM2 = y64.M(db1Var2);
                    if (!kr1.n(ux1VarM, ux1VarM2)) {
                        Object[] objArr = new ux1[16];
                        int i = 0;
                        while (ux1VarM != null) {
                            int i2 = i + 1;
                            if (objArr.length < i2) {
                                int length = objArr.length;
                                Object[] objArr2 = new Object[Math.max(i2, length * 2)];
                                System.arraycopy(objArr, 0, objArr2, 0, length);
                                objArr = objArr2;
                            }
                            if (i != 0) {
                                System.arraycopy(objArr, 0, objArr, 0 + 1, i + 0);
                            }
                            objArr[0] = ux1VarM;
                            i++;
                            ux1VarM = ux1VarM.t();
                        }
                        Object[] objArr3 = new ux1[16];
                        int i3 = 0;
                        while (ux1VarM2 != null) {
                            int i4 = i3 + 1;
                            if (objArr3.length < i4) {
                                int length2 = objArr3.length;
                                Object[] objArr4 = new Object[Math.max(i4, length2 * 2)];
                                System.arraycopy(objArr3, 0, objArr4, 0, length2);
                                objArr3 = objArr4;
                            }
                            if (i3 != 0) {
                                System.arraycopy(objArr3, 0, objArr3, 0 + 1, i3 + 0);
                            }
                            objArr3[0] = ux1VarM2;
                            i3++;
                            ux1VarM2 = ux1VarM2.t();
                        }
                        int iMin = Math.min(i - 1, i3 - 1);
                        if (iMin >= 0) {
                            int i5 = 0;
                            while (kr1.n(objArr[i5], objArr3[i5])) {
                                if (i5 != iMin) {
                                    i5++;
                                }
                            }
                            return kr1.z(((ux1) objArr[i5]).u(), ((ux1) objArr3[i5]).u());
                        }
                        u41.r("Could not find a common ancestor between the two FocusModifiers.");
                    }
                } else {
                    if (av1.C(db1Var)) {
                        return -1;
                    }
                    if (av1.C(db1Var2)) {
                        return 1;
                    }
                }
                return 0;
            case 1:
                ux1 ux1Var = (ux1) obj;
                ux1 ux1Var2 = (ux1) obj2;
                int iZ = kr1.z(ux1Var2.x, ux1Var.x);
                return iZ != 0 ? iZ : kr1.z(ux1Var.hashCode(), ux1Var2.hashCode());
            case 2:
                return yh4.s(Integer.valueOf(((gg) obj).b), Integer.valueOf(((gg) obj2).b));
            case 3:
                return yh4.s(Integer.valueOf(((gg) obj).b), Integer.valueOf(((gg) obj2).b));
            case 4:
                return yh4.s(Integer.valueOf(((FolderMeta) obj).getOrder()), Integer.valueOf(((FolderMeta) obj2).getOrder()));
            case 5:
                return yh4.s(Integer.valueOf(((FolderMeta) obj).getOrder()), Integer.valueOf(((FolderMeta) obj2).getOrder()));
            case 6:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                int iMin2 = Math.min(str.length(), str2.length());
                for (int i6 = 4; i6 < iMin2; i6++) {
                    char cCharAt = str.charAt(i6);
                    char cCharAt2 = str2.charAt(i6);
                    if (cCharAt != cCharAt2) {
                        if (kr1.z(cCharAt, cCharAt2) >= 0) {
                            return 1;
                        }
                        return -1;
                    }
                }
                int length3 = str.length();
                int length4 = str2.length();
                if (length3 == length4) {
                    return 0;
                }
                if (length3 >= length4) {
                    return 1;
                }
                return -1;
            case 7:
                ux1 ux1Var3 = (ux1) obj;
                ux1 ux1Var4 = (ux1) obj2;
                int iZ2 = kr1.z(ux1Var3.x, ux1Var4.x);
                return iZ2 != 0 ? iZ2 : kr1.z(ux1Var3.hashCode(), ux1Var4.hashCode());
            case 8:
                ((un2) obj2).getClass();
                ((un2) obj).getClass();
                return yh4.s(2, 2);
            case 9:
                ((lf1) obj2).getClass();
                ((lf1) obj).getClass();
                return yh4.s(0, 0);
            case 10:
                return yh4.s(Integer.valueOf(((VoiceOption) obj).getOrder()), Integer.valueOf(((VoiceOption) obj2).getOrder()));
            default:
                return yh4.s(((sj4) obj).a, ((sj4) obj2).a);
        }
    }
}
