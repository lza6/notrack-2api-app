package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h93 implements g93 {
    public final le1 a;
    public final fi2 b;
    public fi2 c;

    public h93(Map map, le1 le1Var) {
        fi2 fi2Var;
        this.a = le1Var;
        if (map == null || map.isEmpty()) {
            fi2Var = null;
        } else {
            fi2Var = new fi2(map.size());
            for (Map.Entry entry : map.entrySet()) {
                fi2Var.l(entry.getKey(), entry.getValue());
            }
        }
        this.b = fi2Var;
    }

    @Override // defpackage.g93
    public final boolean canBeSaved(Object obj) {
        return ((Boolean) this.a.invoke(obj)).booleanValue();
    }

    @Override // defpackage.g93
    public final Object consumeRestored(String str) {
        fi2 fi2Var = this.b;
        List list = fi2Var != null ? (List) fi2Var.j(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && fi2Var != null) {
            List listSubList = list.subList(1, list.size());
            int iF = fi2Var.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = fi2Var.c;
            Object obj = objArr[iF];
            fi2Var.b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    @Override // defpackage.g93
    public final Map performSave() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        fi2 fi2Var = this.b;
        if (fi2Var == null && this.c == null) {
            return a31.c;
        }
        int i3 = 0;
        int i4 = fi2Var != null ? fi2Var.e : 0;
        fi2 fi2Var2 = this.c;
        HashMap map = new HashMap(i4 + (fi2Var2 != null ? fi2Var2.e : 0));
        char c2 = 7;
        long j4 = -9187201950435737472L;
        int i5 = 8;
        if (fi2Var != null) {
            Object[] objArr = fi2Var.b;
            Object[] objArr2 = fi2Var.c;
            long[] jArr3 = fi2Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j5 = jArr3[i6];
                    j3 = 255;
                    if ((((~j5) << c2) & j5 & j4) != j4) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j5 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                map.put((String) objArr[i9], (List) objArr2[i9]);
                            }
                            j5 >>= 8;
                            i8++;
                            c2 = c2;
                            j4 = j4;
                        }
                        c = c2;
                        j = j4;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c2;
                        j = j4;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c2 = c;
                    j4 = j;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        fi2 fi2Var3 = this.c;
        if (fi2Var3 != null) {
            Object[] objArr3 = fi2Var3.b;
            Object[] objArr4 = fi2Var3.c;
            long[] jArr4 = fi2Var3.a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                while (true) {
                    long j6 = jArr4[i10];
                    if ((((~j6) << c) & j6 & j) != j) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = i3;
                        while (i12 < i11) {
                            if ((j6 & j3) < j2) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr3[i13];
                                List list = (List) objArr4[i13];
                                String str = (String) obj;
                                i2 = i5;
                                if (list.size() == 1) {
                                    Object objInvoke = ((je1) list.get(i3)).invoke();
                                    if (objInvoke != null) {
                                        if (!canBeSaved(objInvoke)) {
                                            j93.b(d53.a(objInvoke));
                                            return null;
                                        }
                                        map.put(str, kr1.o(objInvoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i3 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((je1) list.get(i3)).invoke();
                                        if (objInvoke2 != null && !canBeSaved(objInvoke2)) {
                                            j93.b(d53.a(objInvoke2));
                                            return null;
                                        }
                                        arrayList.add(objInvoke2);
                                        i3++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i2 = i5;
                            }
                            j6 >>= i2;
                            i12++;
                            i5 = i2;
                            jArr4 = jArr2;
                            i3 = 0;
                        }
                        jArr = jArr4;
                        i = i5;
                        if (i11 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i5;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i5 = i;
                    jArr4 = jArr;
                    i3 = 0;
                }
            }
        }
        return map;
    }

    @Override // defpackage.g93
    public final f93 registerProvider(String str, je1 je1Var) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!yo4.G(str.charAt(i))) {
                fi2 fi2Var = this.c;
                if (fi2Var == null) {
                    long[] jArr = qa3.a;
                    fi2Var = new fi2();
                    this.c = fi2Var;
                }
                Object objG = fi2Var.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    fi2Var.l(str, objG);
                }
                ((List) objG).add(je1Var);
                return new iy2(fi2Var, str, je1Var, 6);
            }
        }
        u41.k("Registered key is empty or blank");
        return null;
    }
}
