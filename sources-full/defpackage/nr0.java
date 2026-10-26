package defpackage;

import android.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class nr0 {
    public final LinkedHashMap a;

    public nr0(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap(0, 0.75f, true);
                break;
            case 2:
            default:
                this.a = new LinkedHashMap();
                break;
            case 3:
                this.a = new LinkedHashMap();
                break;
            case 4:
                this.a = new LinkedHashMap();
                break;
        }
    }

    public nr0(yk2 yk2Var) {
        Map map = yk2Var.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ke0.P0((Collection) entry.getValue()));
        }
        this.a = linkedHashMap;
    }

    public void a(ee2... ee2VarArr) {
        for (ee2 ee2Var : ee2VarArr) {
            int i = ee2Var.a;
            int i2 = ee2Var.b;
            Integer numValueOf = Integer.valueOf(i);
            LinkedHashMap linkedHashMap = this.a;
            Object treeMap = linkedHashMap.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                linkedHashMap.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i2))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + ee2Var);
            }
            treeMap2.put(Integer.valueOf(i2), ee2Var);
        }
    }

    public void b(HashMap map) {
        Object[] objArr;
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            str.getClass();
            if (value == null) {
                value = null;
            } else {
                vc0 vc0VarA = r43.a(value.getClass());
                if (vc0VarA.equals(r43.a(Boolean.TYPE)) ? true : vc0VarA.equals(r43.a(Byte.TYPE)) ? true : vc0VarA.equals(r43.a(Integer.TYPE)) ? true : vc0VarA.equals(r43.a(Long.TYPE)) ? true : vc0VarA.equals(r43.a(Float.TYPE)) ? true : vc0VarA.equals(r43.a(Double.TYPE)) ? true : vc0VarA.equals(r43.a(String.class)) ? true : vc0VarA.equals(r43.a(Boolean[].class)) ? true : vc0VarA.equals(r43.a(Byte[].class)) ? true : vc0VarA.equals(r43.a(Integer[].class)) ? true : vc0VarA.equals(r43.a(Long[].class)) ? true : vc0VarA.equals(r43.a(Float[].class)) ? true : vc0VarA.equals(r43.a(Double[].class)) ? true : vc0VarA.equals(r43.a(String[].class))) {
                    continue;
                } else {
                    int i = 0;
                    if (vc0VarA.equals(r43.a(boolean[].class))) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = rr0.a;
                        int length = zArr.length;
                        objArr = new Boolean[length];
                        while (i < length) {
                            objArr[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                    } else if (vc0VarA.equals(r43.a(byte[].class))) {
                        byte[] bArr = (byte[]) value;
                        String str3 = rr0.a;
                        int length2 = bArr.length;
                        objArr = new Byte[length2];
                        while (i < length2) {
                            objArr[i] = Byte.valueOf(bArr[i]);
                            i++;
                        }
                    } else if (vc0VarA.equals(r43.a(int[].class))) {
                        int[] iArr = (int[]) value;
                        String str4 = rr0.a;
                        int length3 = iArr.length;
                        objArr = new Integer[length3];
                        while (i < length3) {
                            objArr[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                    } else if (vc0VarA.equals(r43.a(long[].class))) {
                        long[] jArr = (long[]) value;
                        String str5 = rr0.a;
                        int length4 = jArr.length;
                        objArr = new Long[length4];
                        while (i < length4) {
                            objArr[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                    } else if (vc0VarA.equals(r43.a(float[].class))) {
                        float[] fArr = (float[]) value;
                        String str6 = rr0.a;
                        int length5 = fArr.length;
                        objArr = new Float[length5];
                        while (i < length5) {
                            objArr[i] = Float.valueOf(fArr[i]);
                            i++;
                        }
                    } else {
                        if (!vc0VarA.equals(r43.a(double[].class))) {
                            u41.m("Key ", str, " has invalid type ", vc0VarA);
                            return;
                        }
                        double[] dArr = (double[]) value;
                        String str7 = rr0.a;
                        int length6 = dArr.length;
                        objArr = new Double[length6];
                        while (i < length6) {
                            objArr[i] = Double.valueOf(dArr[i]);
                            i++;
                        }
                    }
                    value = objArr;
                }
            }
            this.a.put(str, value);
        }
    }

    public dn3 c(vh4 vh4Var) {
        vh4Var.getClass();
        return (dn3) this.a.remove(vh4Var);
    }

    public List d(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.a;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (kr1.n(((vh4) entry.getKey()).a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((vh4) it.next());
        }
        return ke0.O0(linkedHashMap.values());
    }

    public void e(String str) {
        String lowerCase = "Cache-Control".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        this.a.put(lowerCase, kr1.V(str));
    }

    public dn3 f(vh4 vh4Var) {
        LinkedHashMap linkedHashMap = this.a;
        Object dn3Var = linkedHashMap.get(vh4Var);
        if (dn3Var == null) {
            dn3Var = new dn3(vh4Var);
            linkedHashMap.put(vh4Var, dn3Var);
        }
        return (dn3) dn3Var;
    }
}
