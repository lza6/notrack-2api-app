package defpackage;

import app.template.extension.BuildConfig;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.text.Typography;
import org.scilab.forge.jlatexmath.TeXFormulaSettingsParser;

/* JADX INFO: loaded from: classes.dex */
public abstract class td2 {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }

    public static void b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            kz kzVar = mz.d;
            sb.append(xr0.W(new kz(((String) obj).getBytes(zq1.a))));
            sb.append(Typography.quote);
            return;
        }
        if (obj instanceof mz) {
            sb.append(": \"");
            sb.append(xr0.W((mz) obj));
            sb.append(Typography.quote);
            return;
        }
        if (obj instanceof ef1) {
            sb.append(" {");
            c((ef1) obj, sb, i + 2);
            sb.append("\n");
            a(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        b(sb, i3, "key", entry.getKey());
        b(sb, i3, "value", entry.getValue());
        sb.append("\n");
        a(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0194  */
    /* JADX WARN: Code duplicated, block: B:76:0x0196  */
    public static void c(ef1 ef1Var, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = ef1Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method2.getReturnType().equals(List.class)) {
                    b(sb, i, strSubstring.substring(0, strSubstring.length() - 4), ef1.l(method2, ef1Var, new Object[0]));
                }
                i2 = i3;
            }
            if (strSubstring.endsWith(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL) && !strSubstring.equals(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL) && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb, i, strSubstring.substring(0, strSubstring.length() - 3), ef1.l(method, ef1Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objL = ef1.l(method4, ef1Var, new Object[0]);
                    if (method5 == null) {
                        zBooleanValue = true;
                        if (objL instanceof Boolean) {
                            zEquals = !((Boolean) objL).booleanValue();
                        } else if (objL instanceof Integer) {
                            if (((Integer) objL).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objL instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objL).floatValue()) == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objL instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) objL).doubleValue()) == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objL instanceof String) {
                            zEquals = objL.equals(BuildConfig.VERSION_NAME);
                        } else if (objL instanceof mz) {
                            zEquals = objL.equals(mz.d);
                        } else if (!(objL instanceof g0) ? !((objL instanceof Enum) && ((Enum) objL).ordinal() == 0) : objL != ((g0) objL).a()) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) ef1.l(method5, ef1Var, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        b(sb, i, strSubstring, objL);
                    }
                }
            }
            i2 = i3;
        }
        y84 y84Var = ef1Var.unknownFields;
        if (y84Var != null) {
            for (int i5 = 0; i5 < y84Var.a; i5++) {
                b(sb, i, String.valueOf(y84Var.b[i5] >>> 3), y84Var.c[i5]);
            }
        }
    }
}
