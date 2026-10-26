package okio;

import android.content.Context;
import android.os.Bundle;
import app.template.extension.BuildConfig;
import defpackage.ac2;
import defpackage.dl2;
import defpackage.dx1;
import defpackage.dy;
import defpackage.gj;
import defpackage.he2;
import defpackage.hi4;
import defpackage.i63;
import defpackage.il;
import defpackage.iq2;
import defpackage.j93;
import defpackage.jr1;
import defpackage.k93;
import defpackage.ka4;
import defpackage.kb1;
import defpackage.ke0;
import defpackage.kr1;
import defpackage.lz;
import defpackage.m51;
import defpackage.mo3;
import defpackage.n13;
import defpackage.n53;
import defpackage.o92;
import defpackage.or0;
import defpackage.q30;
import defpackage.qh4;
import defpackage.r43;
import defpackage.rr0;
import defpackage.s10;
import defpackage.t10;
import defpackage.th1;
import defpackage.tk1;
import defpackage.tm0;
import defpackage.to2;
import defpackage.to3;
import defpackage.u10;
import defpackage.u41;
import defpackage.ud2;
import defpackage.uo2;
import defpackage.uz3;
import defpackage.v10;
import defpackage.v3;
import defpackage.v72;
import defpackage.vc0;
import defpackage.vo0;
import defpackage.w3;
import defpackage.wh4;
import defpackage.wu0;
import defpackage.x3;
import defpackage.xg2;
import defpackage.xu0;
import defpackage.y10;
import defpackage.y64;
import defpackage.yg2;
import defpackage.yh4;
import defpackage.z21;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.Typography;
import notrack.ai.data.notify.PremiumPushWorker;
import okhttp3.Headers$Companion;
import okhttp3.Protocol$Companion;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXFormulaSettingsParser;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* JADX INFO: loaded from: classes.dex */
public abstract class Options$Companion {
    private static void buildTrieRecursive(long j, dy dyVar, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            u41.k("Failed requirement.");
            return;
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((lz) arrayList4.get(i8)).c() < i7) {
                u41.k("Failed requirement.");
                return;
            }
        }
        lz lzVar = (lz) arrayList.get(i2);
        lz lzVar2 = (lz) arrayList4.get(i3 - 1);
        if (i7 == lzVar.c()) {
            int iIntValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            lz lzVar3 = (lz) arrayList4.get(i9);
            i4 = i9;
            i5 = iIntValue;
            lzVar = lzVar3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (lzVar.h(i7) == lzVar2.h(i7)) {
            int iMin = Math.min(lzVar.c(), lzVar2.c());
            int i10 = 0;
            for (int i11 = i7; i11 < iMin && lzVar.h(i11) == lzVar2.h(i11); i11++) {
                i10++;
            }
            long j3 = (dyVar.d / 4) + j + 2 + ((long) i10) + 1;
            dyVar.Y(-i10);
            dyVar.Y(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                dyVar.Y(lzVar.h(i7) & KotlinVersion.MAX_COMPONENT_VALUE);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 == ((lz) arrayList4.get(i4)).c()) {
                    dyVar.Y(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    u41.r("Check failed.");
                    return;
                }
            }
            dy dyVar2 = new dy();
            dyVar.Y(((int) ((dyVar2.d / 4) + j3)) * (-1));
            buildTrieRecursive(j3, dyVar2, i12, arrayList4, i4, i3, arrayList5);
            dyVar.U(dyVar2);
            return;
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((lz) arrayList4.get(i14 - 1)).h(i7) != ((lz) arrayList4.get(i14)).h(i7)) {
                i13++;
            }
        }
        long j4 = (dyVar.d / 4) + j + 2 + ((long) (i13 * 2));
        dyVar.Y(i13);
        dyVar.Y(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int iH = ((lz) arrayList4.get(i15)).h(i7);
            if (i15 == i4 || iH != ((lz) arrayList4.get(i15 - 1)).h(i7)) {
                dyVar.Y(iH & KotlinVersion.MAX_COMPONENT_VALUE);
            }
        }
        dy dyVar3 = new dy();
        int i16 = i4;
        while (i16 < i3) {
            byte bH = ((lz) arrayList4.get(i16)).h(i7);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i18 = i3;
                    break;
                } else if (bH != ((lz) arrayList4.get(i18)).h(i7)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i17 == i18 && i7 + 1 == ((lz) arrayList4.get(i16)).c()) {
                dyVar.Y(((Number) arrayList5.get(i16)).intValue());
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
            } else {
                dyVar.Y(((int) ((dyVar3.d / 4) + j4)) * (-1));
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
                buildTrieRecursive(j2, dyVar3, i7 + 1, arrayList, i16, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j4 = j2;
            i16 = i6;
            arrayList5 = arrayList3;
        }
        dyVar.U(dyVar3);
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0007: SWITCH (r0v0 int)
 case -1811142716: goto B:118:0x0130
 case -1811142715: goto B:113:0x0123
 case -1811142714: goto B:108:0x0116
 case -1811142713: goto B:103:0x0109
 case -1811142712: goto B:98:0x00fc
 case -1811142711: goto B:93:0x00ef
 case -1811142710: goto B:88:0x00e2
 case -1811142709: goto B:83:0x00d5
 case -1811142708: goto B:78:0x00c8
 case -1811142707: goto B:73:0x00bb
 default: goto B:5:0x000a A[RegionRef:SW:4]
  (r0v0 int) from 0x000a: SWITCH (r0v0 int)
 case -1811142685: goto B:68:0x00ae
 case -1811142684: goto B:63:0x00a1
 case -1811142683: goto B:58:0x0094
 default: goto B:6:0x000d A[RegionRef:SW:5]
  (r0v0 int) from 0x000d: SWITCH (r0v0 int)
 case 80123371: goto B:53:0x0087
 case 80123372: goto B:48:0x007a
 case 80123373: goto B:43:0x006d
 case 80123374: goto B:38:0x0060
 case 80123375: goto B:33:0x0053
 case 80123376: goto B:28:0x0046
 case 80123377: goto B:23:0x0039
 case 80123378: goto B:18:0x002c
 case 80123379: goto B:13:0x001f
 case 80123380: goto B:8:0x0012
 default: goto B:331:? A[RegionRef:SW:6]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static String classFqNameOf(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "kotlin.Double.Companion";
            case "java.lang.Integer":
                return "kotlin.Int";
            case "java.lang.Cloneable":
                return "kotlin.Cloneable";
            case "java.lang.annotation.Annotation":
                return "kotlin.Annotation";
            case "java.lang.Comparable":
                return "kotlin.Comparable";
            case "java.util.Map":
                return "kotlin.collections.Map";
            case "java.util.Set":
                return "kotlin.collections.Set";
            case "double":
                return "kotlin.Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "kotlin.Byte.Companion";
            case "java.lang.CharSequence":
                return "kotlin.CharSequence";
            case "java.util.Collection":
                return "kotlin.collections.Collection";
            case "java.lang.Float":
                return "kotlin.Float";
            case "java.lang.Short":
                return "kotlin.Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "kotlin.Char.Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "kotlin.Long.Companion";
            case "java.util.Map$Entry":
                return "kotlin.collections.Map.Entry";
            case "int":
                return "kotlin.Int";
            case "byte":
                return "kotlin.Byte";
            case "char":
                return "kotlin.Char";
            case "long":
                return "kotlin.Long";
            case "boolean":
                return "kotlin.Boolean";
            case "java.util.List":
                return "kotlin.collections.List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "kotlin.Short.Companion";
            case "float":
                return "kotlin.Float";
            case "short":
                return "kotlin.Short";
            case "java.lang.Character":
                return "kotlin.Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "kotlin.Enum.Companion";
            case "java.lang.Boolean":
                return "kotlin.Boolean";
            case "java.lang.Byte":
                return "kotlin.Byte";
            case "java.lang.Enum":
                return "kotlin.Enum";
            case "java.lang.Long":
                return "kotlin.Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "kotlin.Float.Companion";
            case "java.util.Iterator":
                return "kotlin.collections.Iterator";
            case "java.util.ListIterator":
                return "kotlin.collections.ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "kotlin.String.Companion";
            case "java.lang.Double":
                return "kotlin.Double";
            case "java.lang.Number":
                return "kotlin.Number";
            case "java.lang.Object":
                return "kotlin.Any";
            case "java.lang.String":
                return "kotlin.String";
            case "java.lang.Iterable":
                return "kotlin.collections.Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "kotlin.Boolean.Companion";
            case "java.lang.Throwable":
                return "kotlin.Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "kotlin.Int.Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static n53 create(String str, ac2 ac2Var) {
        str.getClass();
        Charset charset = q30.a;
        if (ac2Var != null) {
            Pattern pattern = ac2.d;
            Charset charsetA = ac2Var.a(null);
            if (charsetA == null) {
                try {
                    ac2Var = get(ac2Var + "; charset=utf-8");
                } catch (IllegalArgumentException unused) {
                    ac2Var = null;
                }
            } else {
                charset = charsetA;
            }
        }
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        int length = bytes.length;
        ka4.c(bytes.length, 0L, length);
        return new n53(ac2Var, length, bytes);
    }

    public static xg2 createFormData(String str, String str2, n53 n53Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("form-data; name=");
        ac2 ac2Var = yg2.n;
        Protocol$Companion.appendQuotedString$okhttp(sb, str);
        if (str2 != null) {
            sb.append("; filename=");
            Protocol$Companion.appendQuotedString$okhttp(sb, str2);
        }
        String string = sb.toString();
        ArrayList arrayList = new ArrayList(20);
        Headers$Companion.checkName("Content-Disposition");
        arrayList.add("Content-Disposition");
        arrayList.add(mo3.U0(string).toString());
        th1 th1Var = new th1((String[]) arrayList.toArray(new String[0]));
        if (th1Var.b("Content-Type") != null) {
            u41.k("Unexpected header: Content-Type");
            return null;
        }
        if (th1Var.b("Content-Length") == null) {
            return new xg2(th1Var, n53Var);
        }
        u41.k("Unexpected header: Content-Length");
        return null;
    }

    public static k93 createHandle(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new k93();
            }
            HashMap map = new HashMap();
            for (String str : bundle2.keySet()) {
                str.getClass();
                map.put(str, bundle2.get(str));
            }
            return new k93(map);
        }
        ClassLoader classLoader = k93.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            u41.r("Invalid bundle passed as restored state");
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = parcelableArrayList.get(i);
            obj.getClass();
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
        }
        return new k93(linkedHashMap);
    }

    private static int dateCharacterOffset(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static boolean defaultValueEquals(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                int i4 = i3 + 1;
                if (i3 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt != ')' || (i2 = i2 - 1) != 0 || i3 == str.length() - 1) {
                    }
                    i++;
                    i3 = i4;
                }
            }
            if (i2 == 0) {
                return kr1.n(mo3.U0(str.substring(1, str.length() - 1)).toString(), str2);
            }
        }
        return false;
    }

    public static he2 from(he2 he2Var, dx1 dx1Var, uz3 uz3Var, wu0 wu0Var, kb1 kb1Var) {
        if (he2Var != null && dx1Var == he2Var.a && yh4.Q(uz3Var, dx1Var).equals(he2Var.b) && wu0Var.getDensity() == he2Var.c.c && kb1Var == he2Var.d) {
            return he2Var;
        }
        he2 he2Var2 = he2.h;
        if (he2Var2 != null && dx1Var == he2Var2.a && yh4.Q(uz3Var, dx1Var).equals(he2Var2.b) && wu0Var.getDensity() == he2Var2.c.c && kb1Var == he2Var2.d) {
            return he2Var2;
        }
        he2 he2Var3 = new he2(dx1Var, yh4.Q(uz3Var, dx1Var), new xu0(wu0Var.getDensity(), wu0Var.l()), kb1Var);
        he2.h = he2Var3;
        return he2Var3;
    }

    public static or0 fromByteArray(byte[] bArr) {
        bArr.getClass();
        if (bArr.length > 10240) {
            u41.r("Data cannot occupy more than 10240 bytes when serialized");
            return null;
        }
        if (bArr.length == 0) {
            return or0.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            int i = 0;
            boolean z = bArr2[0] == -84 && bArr2[1] == -19;
            byteArrayInputStream.reset();
            if (z) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i2 = objectInputStream.readInt();
                    while (i < i2) {
                        String utf = objectInputStream.readUTF();
                        utf.getClass();
                        linkedHashMap.put(utf, objectInputStream.readObject());
                        i++;
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        jr1.i(objectInputStream, th);
                        throw th2;
                    }
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    short s = dataInputStream.readShort();
                    if (s == -21521) {
                        short s2 = dataInputStream.readShort();
                        if (s2 != 1) {
                            j93.b(ud2.m(s2, "Unsupported version number: "));
                        }
                    } else {
                        j93.b(ud2.m(s, "Magic number doesn't match: "));
                    }
                    int i3 = dataInputStream.readInt();
                    while (i < i3) {
                        Serializable serializableFromByteArray$readValue = fromByteArray$readValue(dataInputStream, dataInputStream.readByte());
                        String utf2 = dataInputStream.readUTF();
                        utf2.getClass();
                        linkedHashMap.put(utf2, serializableFromByteArray$readValue);
                        i++;
                    }
                    dataInputStream.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        jr1.i(dataInputStream, th3);
                        throw th4;
                    }
                }
            }
        } catch (IOException e) {
            v72.f().e(rr0.a, "Error in Data#fromByteArray: ", e);
        } catch (ClassNotFoundException e2) {
            v72.f().e(rr0.a, "Error in Data#fromByteArray: ", e2);
        }
        return new or0(linkedHashMap);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    private static final Serializable fromByteArray$readValue(DataInputStream dataInputStream, byte b) throws IOException {
        if (b == 0) {
            return null;
        }
        if (b == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b == 7) {
            return dataInputStream.readUTF();
        }
        int i = 0;
        if (b == 8) {
            int i2 = dataInputStream.readInt();
            ?? r0 = new Boolean[i2];
            while (i < i2) {
                r0[i] = Boolean.valueOf(dataInputStream.readBoolean());
                i++;
            }
            return r0;
        }
        if (b == 9) {
            int i3 = dataInputStream.readInt();
            ?? r1 = new Byte[i3];
            while (i < i3) {
                r1[i] = Byte.valueOf(dataInputStream.readByte());
                i++;
            }
            return r1;
        }
        if (b == 10) {
            int i4 = dataInputStream.readInt();
            ?? r2 = new Integer[i4];
            while (i < i4) {
                r2[i] = Integer.valueOf(dataInputStream.readInt());
                i++;
            }
            return r2;
        }
        if (b == 11) {
            int i5 = dataInputStream.readInt();
            ?? r3 = new Long[i5];
            while (i < i5) {
                r3[i] = Long.valueOf(dataInputStream.readLong());
                i++;
            }
            return r3;
        }
        if (b == 12) {
            int i6 = dataInputStream.readInt();
            ?? r4 = new Float[i6];
            while (i < i6) {
                r4[i] = Float.valueOf(dataInputStream.readFloat());
                i++;
            }
            return r4;
        }
        if (b == 13) {
            int i7 = dataInputStream.readInt();
            ?? r5 = new Double[i7];
            while (i < i7) {
                r5[i] = Double.valueOf(dataInputStream.readDouble());
                i++;
            }
            return r5;
        }
        if (b != 14) {
            u41.r(ud2.m(b, "Unsupported type "));
            return null;
        }
        int i8 = dataInputStream.readInt();
        ?? r6 = new String[i8];
        while (i < i8) {
            String utf = dataInputStream.readUTF();
            if (kr1.n(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                utf = null;
            }
            r6[i] = utf;
            i++;
        }
        return r6;
    }

    public static ac2 get(String str) {
        str.getClass();
        Matcher matcher = ac2.d.matcher(str);
        if (!matcher.lookingAt()) {
            u41.q(str, "No subtype found for: \"");
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = strGroup.toLowerCase(locale);
        lowerCase.getClass();
        String strGroup2 = matcher.group(2);
        strGroup2.getClass();
        strGroup2.toLowerCase(locale).getClass();
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = ac2.e.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(iEnd) + "\" for: \"" + str + Typography.quote).toString());
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (to3.q0(strGroup4, "'", false) && to3.j0(strGroup4, "'", false) && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                }
                arrayList.add(strGroup3);
                arrayList.add(strGroup4);
                iEnd = matcher2.end();
            }
        }
        return new ac2(str, lowerCase, (String[]) arrayList.toArray(new String[0]));
    }

    public static String getClassQualifiedName(Class cls) {
        String strClassFqNameOf;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strClassFqNameOf2 = classFqNameOf(cls.getName());
            return strClassFqNameOf2 == null ? cls.getCanonicalName() : strClassFqNameOf2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strClassFqNameOf = classFqNameOf(componentType.getName())) != null) {
            strConcat = strClassFqNameOf.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public static String getClassSimpleName(Class cls) {
        String strSimpleNameOf;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strSimpleNameOf2 = simpleNameOf(cls.getName());
                return strSimpleNameOf2 == null ? cls.getSimpleName() : strSimpleNameOf2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strSimpleNameOf = simpleNameOf(componentType.getName())) != null) {
                strConcat = strSimpleNameOf.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return mo3.P0(simpleName, enclosingMethod.getName() + Typography.dollar);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return mo3.O0(simpleName, Typography.dollar, simpleName);
        }
        return mo3.P0(simpleName, enclosingConstructor.getName() + Typography.dollar);
    }

    public static String getVisualMimeType$activity_release(x3 x3Var) {
        if (x3Var instanceof w3) {
            return "image/*";
        }
        if (x3Var instanceof v3) {
            return null;
        }
        u41.e();
        return null;
    }

    public static boolean inWindow$app_playRelease(Calendar calendar) {
        int i = calendar.get(7);
        int i2 = calendar.get(11);
        if (i == 1) {
            if (10 <= i2 || i2 >= 21) {
            }
        } else {
            if (i != 6) {
                if (i != 7) {
                    return false;
                }
                return 10 <= i2 ? false : false;
            }
            if (18 > i2 || i2 >= 21) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPunctuation$ui_text_release(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static iq2 of(lz... lzVarArr) {
        if (lzVarArr.length == 0) {
            return new iq2(new lz[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(new il(lzVarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(-1);
        }
        int length = lzVarArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList2.set(kr1.p(arrayList, lzVarArr[i2]), Integer.valueOf(i3));
            i2++;
            i3++;
        }
        if (((lz) arrayList.get(0)).c() <= 0) {
            u41.k("the empty byte string is not a supported option");
            return null;
        }
        int i4 = 0;
        while (i4 < arrayList.size()) {
            lz lzVar = (lz) arrayList.get(i4);
            int i5 = i4 + 1;
            int i6 = i5;
            while (i6 < arrayList.size()) {
                lz lzVar2 = (lz) arrayList.get(i6);
                lzVar2.getClass();
                lzVar.getClass();
                if (!lzVar2.k(0, lzVar, lzVar.c())) {
                    break;
                }
                if (lzVar2.c() == lzVar.c()) {
                    m51.z(lzVar2, "duplicate option: ");
                    return null;
                }
                if (((Number) arrayList2.get(i6)).intValue() > ((Number) arrayList2.get(i4)).intValue()) {
                    arrayList.remove(i6);
                    ((Number) arrayList2.remove(i6)).intValue();
                } else {
                    i6++;
                }
            }
            i4 = i5;
        }
        dy dyVar = new dy();
        buildTrieRecursive(0L, dyVar, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i7 = (int) (dyVar.d / 4);
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr[i8] = dyVar.readInt();
        }
        return new iq2((lz[]) Arrays.copyOf(lzVarArr, lzVarArr.length), iArr);
    }

    public static gj parse(String str) throws ProtocolException {
        int i;
        String strSubstring;
        boolean zQ0 = to3.q0(str, "HTTP/1.", false);
        n13 n13Var = n13.HTTP_1_0;
        if (zQ0) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                n13Var = n13.HTTP_1_1;
            }
        } else {
            if (!to3.q0(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i3 = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                strSubstring = BuildConfig.VERSION_NAME;
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
            }
            return new gj(n13Var, i3, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0083  */
    /* JADX INFO: renamed from: parse, reason: collision with other method in class */
    public static v10 m1786parse(String str) {
        Object i63Var;
        str.getClass();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(TeXSymbolParser.TYPE_ATTR);
            if (strOptString == null) {
                i63Var = null;
            } else {
                int iHashCode = strOptString.hashCode();
                if (iHashCode != 363038612) {
                    if (iHashCode != 364355044) {
                        if (iHashCode == 1258646566 && strOptString.equals("carry_done")) {
                            String strOptString2 = jSONObject.optString("text");
                            strOptString2.getClass();
                            i63Var = new t10(strOptString2, parse(jSONObject));
                        } else {
                            i63Var = null;
                        }
                    } else if (strOptString.equals("carry_error")) {
                        String strOptString3 = jSONObject.optString("code", "failed");
                        strOptString3.getClass();
                        i63Var = new u10(strOptString3, strOptString3.equals("rate") ? Protocol$Companion.parse(jSONObject) : null);
                    } else {
                        i63Var = null;
                    }
                } else if (strOptString.equals("carry_delta")) {
                    String strOptString4 = jSONObject.optString("chunk");
                    strOptString4.getClass();
                    i63Var = new s10(strOptString4);
                } else {
                    i63Var = null;
                }
            }
        } catch (Throwable th) {
            i63Var = new i63(th);
        }
        return (v10) (i63Var instanceof i63 ? null : i63Var);
    }

    public static y10 parse(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("plan", "free");
        String str = mo3.C0(strOptString) ? "free" : strOptString;
        int iOptInt = jSONObject.optInt("limit", 0);
        int iOptInt2 = jSONObject.optInt("left", 0);
        int iOptInt3 = jSONObject.optInt("max_chars", jSONObject.optInt("max", 0));
        o92 o92Var = new o92();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("limits");
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            itKeys.getClass();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                next.getClass();
                o92Var.put(next, Integer.valueOf(jSONObjectOptJSONObject.optInt(next)));
            }
        }
        return new y10(str, iOptInt, iOptInt2, iOptInt3, o92Var.b());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0065  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c6 A[EDGE_INSN: B:94:0x01c6->B:106:0x01f2 BREAK  A[LOOP:1: B:17:0x0085->B:61:0x014d]] */
    public static List parseAll(tk1 tk1Var, th1 th1Var) {
        vo0 vo0Var;
        String strSubstring;
        tk1Var.getClass();
        th1Var.getClass();
        List listK = th1Var.k();
        int size = listK.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            String str = (String) listK.get(i);
            str.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArr = ka4.a;
            char c = ';';
            int iG = ka4.g(str, ';', 0, str.length());
            int iG2 = ka4.g(str, '=', 0, iG);
            if (iG2 == iG) {
                vo0Var = null;
            } else {
                int iM = ka4.m(0, iG2, str);
                String strSubstring2 = str.substring(iM, ka4.n(iM, iG2, str));
                if (strSubstring2.length() != 0 && ka4.l(strSubstring2) == -1) {
                    int iM2 = ka4.m(iG2 + 1, iG, str);
                    String strSubstring3 = str.substring(iM2, ka4.n(iM2, iG, str));
                    if (ka4.l(strSubstring3) == -1) {
                        int i2 = iG + 1;
                        int length = str.length();
                        long j = 253402300799999L;
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        long expires = 253402300799999L;
                        String str2 = null;
                        String strSubstring4 = null;
                        long j2 = -1;
                        boolean z4 = true;
                        while (true) {
                            long j3 = LongCompanionObject.MAX_VALUE;
                            if (i2 >= length) {
                                if (j2 == Long.MIN_VALUE) {
                                    j = Long.MIN_VALUE;
                                } else if (j2 != -1) {
                                    if (j2 <= 9223372036854775L) {
                                        j3 = j2 * 1000;
                                    }
                                    long j4 = jCurrentTimeMillis + j3;
                                    if (j4 >= jCurrentTimeMillis && j4 <= 253402300799999L) {
                                        j = j4;
                                    }
                                } else {
                                    j = expires;
                                }
                                String str3 = tk1Var.d;
                                if (str2 == null) {
                                    str2 = str3;
                                } else if (!kr1.n(str3, str2) && (!to3.j0(str3, str2, false) || str3.charAt((str3.length() - str2.length()) - 1) != '.' || ka4.g.c(str3))) {
                                    vo0Var = null;
                                    break;
                                }
                                if (str3.length() != str2.length() && PublicSuffixDatabase.g.a(str2) == null) {
                                    vo0Var = null;
                                    break;
                                }
                                if (strSubstring4 == null || !to3.q0(strSubstring4, "/", false)) {
                                    String strB = tk1Var.b();
                                    int iE0 = mo3.E0(strB, '/', 0, 6);
                                    strSubstring4 = iE0 != 0 ? strB.substring(0, iE0) : "/";
                                }
                                vo0Var = new vo0(strSubstring2, strSubstring3, j, str2, strSubstring4, z3, z, z2, z4);
                                break;
                            }
                            int iG3 = ka4.g(str, c, i2, length);
                            int iG4 = ka4.g(str, '=', i2, iG3);
                            int iM3 = ka4.m(i2, iG4, str);
                            String strSubstring5 = str.substring(iM3, ka4.n(iM3, iG4, str));
                            if (iG4 < iG3) {
                                int iM4 = ka4.m(iG4 + 1, iG3, str);
                                strSubstring = str.substring(iM4, ka4.n(iM4, iG3, str));
                            } else {
                                strSubstring = BuildConfig.VERSION_NAME;
                            }
                            if (strSubstring5.equalsIgnoreCase("expires")) {
                                try {
                                    expires = parseExpires(strSubstring.length(), strSubstring);
                                    z2 = true;
                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                }
                            } else if (strSubstring5.equalsIgnoreCase("max-age")) {
                                try {
                                    j2 = Long.parseLong(strSubstring);
                                    if (j2 <= 0) {
                                        j2 = Long.MIN_VALUE;
                                    }
                                } catch (NumberFormatException e) {
                                    Pattern patternCompile = Pattern.compile("-?\\d+");
                                    patternCompile.getClass();
                                    if (!patternCompile.matcher(strSubstring).matches()) {
                                        throw e;
                                    }
                                    if (to3.q0(strSubstring, "-", false)) {
                                        j3 = Long.MIN_VALUE;
                                    }
                                    j2 = j3;
                                }
                                z2 = true;
                            } else if (strSubstring5.equalsIgnoreCase("domain")) {
                                if (to3.j0(strSubstring, ".", false)) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                String strU = y64.U(mo3.J0(strSubstring, "."));
                                if (strU == null) {
                                    throw new IllegalArgumentException();
                                }
                                str2 = strU;
                                z4 = false;
                            } else if (strSubstring5.equalsIgnoreCase("path")) {
                                strSubstring4 = strSubstring;
                            } else if (strSubstring5.equalsIgnoreCase("secure")) {
                                z3 = true;
                            } else if (strSubstring5.equalsIgnoreCase("httponly")) {
                                z = true;
                            }
                            i2 = iG3 + 1;
                            c = ';';
                        }
                    } else {
                        vo0Var = null;
                    }
                } else {
                    vo0Var = null;
                }
            }
            if (vo0Var != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(vo0Var);
            }
        }
        if (arrayList == null) {
            return z21.c;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x009a  */
    private static long parseExpires(int i, String str) {
        int iDateCharacterOffset = dateCharacterOffset(str, 0, i, false);
        Matcher matcher = vo0.m.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int iA0 = -1;
        int i5 = -1;
        int i6 = -1;
        while (iDateCharacterOffset < i) {
            int iDateCharacterOffset2 = dateCharacterOffset(str, iDateCharacterOffset + 1, i, true);
            matcher.region(iDateCharacterOffset, iDateCharacterOffset2);
            if (i3 == -1 && matcher.usePattern(vo0.m).matches()) {
                String strGroup = matcher.group(1);
                strGroup.getClass();
                i3 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                strGroup2.getClass();
                i5 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                strGroup3.getClass();
                i6 = Integer.parseInt(strGroup3);
            } else if (i4 == -1 && matcher.usePattern(vo0.l).matches()) {
                String strGroup4 = matcher.group(1);
                strGroup4.getClass();
                i4 = Integer.parseInt(strGroup4);
            } else if (iA0 == -1) {
                Pattern pattern = vo0.k;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    strGroup5.getClass();
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = strGroup5.toLowerCase(locale);
                    lowerCase.getClass();
                    String strPattern = pattern.pattern();
                    strPattern.getClass();
                    iA0 = mo3.A0(strPattern, lowerCase, 0, false, 6) / 4;
                } else if (i2 != -1 && matcher.usePattern(vo0.j).matches()) {
                    String strGroup6 = matcher.group(1);
                    strGroup6.getClass();
                    i2 = Integer.parseInt(strGroup6);
                }
            } else if (i2 != -1) {
            }
            iDateCharacterOffset = dateCharacterOffset(str, iDateCharacterOffset2 + 1, i, false);
        }
        if (70 <= i2 && i2 < 100) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            u41.k("Failed requirement.");
            return 0L;
        }
        if (iA0 == -1) {
            u41.k("Failed requirement.");
            return 0L;
        }
        if (1 > i4 || i4 >= 32) {
            u41.k("Failed requirement.");
            return 0L;
        }
        if (i3 < 0 || i3 >= 24) {
            u41.k("Failed requirement.");
            return 0L;
        }
        if (i5 < 0 || i5 >= 60) {
            u41.k("Failed requirement.");
            return 0L;
        }
        if (i6 < 0 || i6 >= 60) {
            u41.k("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(ka4.f);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, iA0 - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i5);
        gregorianCalendar.set(13, i6);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static void schedule(Context context) {
        context.getClass();
        int i = 0;
        to2 to2Var = new to2(PremiumPushWorker.class, i);
        Calendar calendar = Calendar.getInstance();
        calendar.getClass();
        long j = 0;
        if (!inWindow$app_playRelease(calendar)) {
            Object objClone = calendar.clone();
            objClone.getClass();
            Calendar calendar2 = (Calendar) objClone;
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            while (true) {
                if (i >= 192) {
                    j = 86400000;
                    break;
                }
                calendar2.add(11, 1);
                Set set = PremiumPushWorker.i;
                if (inWindow$app_playRelease(calendar2)) {
                    long timeInMillis = calendar2.getTimeInMillis() - calendar.getTimeInMillis();
                    if (timeInMillis < 0) {
                        break;
                    }
                    j = timeInMillis;
                    break;
                }
                i++;
            }
        }
        TimeUnit.MILLISECONDS.getClass();
        ((hi4) to2Var.b).g = j;
        if (LongCompanionObject.MAX_VALUE - System.currentTimeMillis() <= ((hi4) to2Var.b).g) {
            u41.k("The given initial delay is too large and will cause an overflow!");
            return;
        }
        ((hi4) to2Var.b).j = new tm0(new dl2(null), 2, false, false, false, false, -1L, -1L, ke0.S0(new LinkedHashSet()));
        new qh4(wh4.a(context), "premium-friday", 2, kr1.T((uo2) to2Var.b()), 0).a();
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0007: SWITCH (r0v0 int)
 case -1811142716: goto B:118:0x0130
 case -1811142715: goto B:113:0x0123
 case -1811142714: goto B:108:0x0116
 case -1811142713: goto B:103:0x0109
 case -1811142712: goto B:98:0x00fc
 case -1811142711: goto B:93:0x00ef
 case -1811142710: goto B:88:0x00e2
 case -1811142709: goto B:83:0x00d5
 case -1811142708: goto B:78:0x00c8
 case -1811142707: goto B:73:0x00bb
 default: goto B:5:0x000a A[RegionRef:SW:4]
  (r0v0 int) from 0x000a: SWITCH (r0v0 int)
 case -1811142685: goto B:68:0x00ae
 case -1811142684: goto B:63:0x00a1
 case -1811142683: goto B:58:0x0094
 default: goto B:6:0x000d A[RegionRef:SW:5]
  (r0v0 int) from 0x000d: SWITCH (r0v0 int)
 case 80123371: goto B:53:0x0087
 case 80123372: goto B:48:0x007a
 case 80123373: goto B:43:0x006d
 case 80123374: goto B:38:0x0060
 case 80123375: goto B:33:0x0053
 case 80123376: goto B:28:0x0046
 case 80123377: goto B:23:0x0039
 case 80123378: goto B:18:0x002c
 case 80123379: goto B:13:0x001f
 case 80123380: goto B:8:0x0012
 default: goto B:313:? A[RegionRef:SW:6]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static String simpleNameOf(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "Companion";
            case "java.lang.Integer":
                return "Int";
            case "java.lang.Cloneable":
                return "Cloneable";
            case "java.lang.annotation.Annotation":
                return "Annotation";
            case "java.lang.Comparable":
                return "Comparable";
            case "java.util.Map":
                return TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL;
            case "java.util.Set":
                return "Set";
            case "double":
                return "Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "Companion";
            case "java.lang.CharSequence":
                return "CharSequence";
            case "java.util.Collection":
                return "Collection";
            case "java.lang.Float":
                return "Float";
            case "java.lang.Short":
                return "Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "Companion";
            case "java.util.Map$Entry":
                return "Entry";
            case "int":
                return "Int";
            case "byte":
                return "Byte";
            case "char":
                return "Char";
            case "long":
                return "Long";
            case "boolean":
                return "Boolean";
            case "java.util.List":
                return "List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "Companion";
            case "float":
                return "Float";
            case "short":
                return "Short";
            case "java.lang.Character":
                return "Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "Companion";
            case "java.lang.Boolean":
                return "Boolean";
            case "java.lang.Byte":
                return "Byte";
            case "java.lang.Enum":
                return "Enum";
            case "java.lang.Long":
                return "Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "Companion";
            case "java.util.Iterator":
                return "Iterator";
            case "java.util.ListIterator":
                return "ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "Companion";
            case "java.lang.Double":
                return "Double";
            case "java.lang.Number":
                return "Number";
            case "java.lang.Object":
                return "Any";
            case "java.lang.String":
                return "String";
            case "java.lang.Iterable":
                return "Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "Companion";
            case "java.lang.Throwable":
                return "Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static byte[] toByteArrayInternalV1(or0 or0Var) {
        or0Var.getClass();
        HashMap map = or0Var.a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    toByteArrayInternalV1$writeEntry(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                byteArray.getClass();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    jr1.i(dataOutputStream, th);
                    throw th2;
                }
            }
        } catch (IOException e) {
            v72.f().e(rr0.a, "Error in Data#toByteArray: ", e);
            return new byte[0];
        }
    }

    private static final void toByteArrayInternalV1$writeEntry(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
        int i;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                u41.j(getClassSimpleName(r43.a(obj.getClass()).c), "Unsupported value type ");
                return;
            }
            Object[] objArr = (Object[]) obj;
            vc0 vc0VarA = r43.a(objArr.getClass());
            if (vc0VarA.equals(r43.a(Boolean[].class))) {
                i = 8;
            } else if (vc0VarA.equals(r43.a(Byte[].class))) {
                i = 9;
            } else if (vc0VarA.equals(r43.a(Integer[].class))) {
                i = 10;
            } else if (vc0VarA.equals(r43.a(Long[].class))) {
                i = 11;
            } else if (vc0VarA.equals(r43.a(Float[].class))) {
                i = 12;
            } else if (vc0VarA.equals(r43.a(Double[].class))) {
                i = 13;
            } else {
                if (!vc0VarA.equals(r43.a(String[].class))) {
                    u41.j(getClassQualifiedName(r43.a(objArr.getClass()).c), "Unsupported value type ");
                    return;
                }
                i = 14;
            }
            dataOutputStream.writeByte(i);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i == 9) {
                    Byte b = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                } else if (i == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i == 11) {
                    Long l = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                } else if (i == 12) {
                    Float f = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f != null ? f.floatValue() : 0.0f);
                } else if (i == 13) {
                    Double d = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d != null ? d.doubleValue() : 0.0d);
                } else if (i == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }
}
