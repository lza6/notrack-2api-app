package defpackage;

import app.template.extension.BuildConfig;
import okio.Path$Companion;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class zj1 {
    public static final lz a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;

    static {
        lz lzVar = lz.l;
        a = Path$Companion.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        c = new String[64];
        String[] strArr = new String[FontInfo.NUMBER_OF_CHAR_CODES];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            binaryString.getClass();
            String strReplace = ka4.h("%8s", binaryString).replace(' ', '0');
            strReplace.getClass();
            strArr[i] = strReplace;
        }
        d = strArr;
        String[] strArr2 = c;
        strArr2[0] = BuildConfig.VERSION_NAME;
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = fq2.r(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = c;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = fq2.r(sb, strArr3[i4], "|PADDED");
        }
        int length = c.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = c;
            if (strArr4[i7] == null) {
                strArr4[i7] = d[i7];
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    public static String a(boolean z, int i, int i2, int i3, int i4) {
        String strO0;
        String str;
        String[] strArr = b;
        String strH = i3 < strArr.length ? strArr[i3] : ka4.h("0x%02x", Integer.valueOf(i3));
        if (i4 == 0) {
            strO0 = BuildConfig.VERSION_NAME;
        } else {
            String[] strArr2 = d;
            if (i3 == 2 || i3 == 3) {
                strO0 = strArr2[i4];
            } else if (i3 == 4 || i3 == 6) {
                strO0 = i4 == 1 ? "ACK" : strArr2[i4];
            } else if (i3 == 7 || i3 == 8) {
                strO0 = strArr2[i4];
            } else {
                String[] strArr3 = c;
                if (i4 < strArr3.length) {
                    str = strArr3[i4];
                    str.getClass();
                } else {
                    str = strArr2[i4];
                }
                if (i3 != 5 || (i4 & 4) == 0) {
                    strO0 = (i3 != 0 || (i4 & 32) == 0) ? str : to3.o0(str, "PRIORITY", "COMPRESSED");
                } else {
                    strO0 = to3.o0(str, "HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return ka4.h("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), strH, strO0);
    }
}
