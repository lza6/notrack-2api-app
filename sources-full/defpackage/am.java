package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import app.template.extension.BuildConfig;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.UByte;
import okhttp3.Protocol$Companion;
import okio.Path$Companion;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class am implements t61 {
    public final /* synthetic */ int a;
    public final da4 b;
    public final jq2 c;

    public /* synthetic */ am(da4 da4Var, jq2 jq2Var, int i) {
        this.a = i;
        this.b = da4Var;
        this.c = jq2Var;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x031b  */
    /* JADX WARN: Code duplicated, block: B:218:0x0501  */
    /* JADX WARN: Code duplicated, block: B:21:0x0072  */
    /* JADX WARN: Code duplicated, block: B:230:0x057e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.t61
    public final Object a(so0 so0Var) throws XmlPullParserException, IOException {
        String mimeTypeFromExtension;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        List listV;
        int size;
        Bundle bundle;
        int iZ0;
        int i;
        int i2;
        byte[] bArr;
        int i3;
        boolean z;
        int i4;
        int i5;
        Integer numS0;
        String mimeTypeFromExtension2;
        Drawable drawable;
        int i6 = this.a;
        char c = 6;
        int i7 = 0;
        qr0 qr0Var = qr0.h;
        da4 da4Var = this.b;
        jq2 jq2Var = this.c;
        String mimeTypeFromExtension3 = null;
        switch (i6) {
            case 0:
                String strD0 = ke0.D0(ke0.w0(1, jr1.v(da4Var)), "/", null, null, null, 62);
                yl3 yl3Var = new yl3(new u23(yh4.Y(jq2Var.a.getAssets().open(strD0))), jq2Var.f, new yl(strD0));
                if (mo3.C0(strD0)) {
                    mimeTypeFromExtension = null;
                } else {
                    String strS0 = mo3.S0('?', mo3.S0('#', strD0));
                    String strQ0 = mo3.Q0(mo3.Q0(strS0, '/', strS0), '.', BuildConfig.VERSION_NAME);
                    if (mo3.C0(strQ0)) {
                        mimeTypeFromExtension = null;
                    } else {
                        String lowerCase = strQ0.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        mimeTypeFromExtension = (String) ge2.a.get(lowerCase);
                        if (mimeTypeFromExtension == null) {
                            mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                        }
                    }
                }
                return new xl3(yl3Var, mimeTypeFromExtension, qr0Var);
            case 1:
                Uri uri = Uri.parse(da4Var.a);
                ContentResolver contentResolver = jq2Var.a.getContentResolver();
                String str = da4Var.d;
                if (kr1.n(str, "com.android.contacts") && kr1.n(ke0.F0(jr1.v(da4Var)), "display_photo")) {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                        u41.i(uri, "'.", "Unable to find a contact photo associated with '");
                        return null;
                    }
                    return new xl3(new yl3(new u23(yh4.Y(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), jq2Var.f, new on0(assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uri), qr0Var);
                }
                if (Build.VERSION.SDK_INT < 29 || !kr1.n(str, "media") || (size = (listV = jr1.v(da4Var)).size()) < 3 || !kr1.n(listV.get(size - 3), "audio") || !kr1.n(listV.get(size - 2), "albums")) {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                        u41.i(uri, "'.", "Unable to open '");
                        return null;
                    }
                    return new xl3(new yl3(new u23(yh4.Y(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), jq2Var.f, new on0(assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uri), qr0Var);
                }
                ai3 ai3Var = jq2Var.b;
                bw0 bw0Var = ai3Var.a;
                zv0 zv0Var = bw0Var instanceof zv0 ? (zv0) bw0Var : null;
                if (zv0Var != null) {
                    int i8 = zv0Var.a;
                    bw0 bw0Var2 = ai3Var.b;
                    zv0 zv0Var2 = bw0Var2 instanceof zv0 ? (zv0) bw0Var2 : null;
                    if (zv0Var2 != null) {
                        int i9 = zv0Var2.a;
                        bundle = new Bundle(1);
                        bundle.putParcelable("android.content.extra.SIZE", new Point(i8, i9));
                    } else {
                        bundle = null;
                    }
                } else {
                    bundle = null;
                }
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    u41.i(uri, "'.", "Unable to find a music thumbnail associated with '");
                    return null;
                }
                return new xl3(new yl3(new u23(yh4.Y(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), jq2Var.f, new on0(assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uri), qr0Var);
            case 2:
                String str2 = da4Var.a;
                String str3 = da4Var.a;
                int iA0 = mo3.A0(str2, ";base64,", 0, false, 6);
                if (iA0 == -1 || (iZ0 = mo3.z0(':', 0, 6, str3)) == -1) {
                    m51.y(da4Var, "invalid data uri: ");
                } else {
                    String strSubstring = str3.substring(iZ0 + 1, iA0);
                    pr prVar = rr.c;
                    int i10 = iA0 + 8;
                    int length = str3.length();
                    prVar.getClass();
                    boolean z2 = prVar.b;
                    Protocol$Companion.checkBoundsIndexes$kotlin_stdlib(i10, length, str3.length());
                    byte[] bytes = str3.substring(i10, length).getBytes(q30.b);
                    bytes.getClass();
                    int length2 = bytes.length;
                    Protocol$Companion.checkBoundsIndexes$kotlin_stdlib(0, length2, bytes.length);
                    int i11 = -2;
                    if (length2 == 0) {
                        i2 = 0;
                    } else if (length2 != 1) {
                        if (z2) {
                            i = length2;
                            int i12 = 0;
                            while (true) {
                                char c2 = c;
                                if (i12 < length2) {
                                    int i13 = tr.a[bytes[i12] & UByte.MAX_VALUE ? 1 : 0];
                                    if (i13 < 0) {
                                        if (i13 == -2) {
                                            i -= length2 - i12;
                                        } else {
                                            i--;
                                        }
                                    }
                                    i12++;
                                    c = c2;
                                }
                            }
                        } else if (bytes[length2 - 1] == 61) {
                            i = length2 - 1;
                            if (bytes[length2 - 2] == 61) {
                                i = length2 - 2;
                            }
                        } else {
                            i = length2;
                        }
                        i2 = (int) ((((long) i) * 6) / 8);
                    } else {
                        u41.k(ud2.m(length2, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
                    }
                    byte[] bArr2 = new byte[i2];
                    int[] iArr = prVar.a ? tr.b : tr.a;
                    int i14 = -8;
                    int i15 = 8;
                    int i16 = 0;
                    int i17 = -8;
                    int i18 = 0;
                    while (true) {
                        if (i7 < length2) {
                            if (i17 != i14 || (i5 = i7 + 3) >= length2) {
                                bArr = bytes;
                            } else {
                                bArr = bytes;
                                int i19 = i7 + 4;
                                int i20 = (iArr[bArr[i7 + 2] & UByte.MAX_VALUE ? 1 : 0] << 6) | (iArr[bytes[i7 + 1] & UByte.MAX_VALUE ? 1 : 0] << 12) | (iArr[bytes[i7] & UByte.MAX_VALUE ? 1 : 0] << 18) | iArr[bArr[i5] & UByte.MAX_VALUE ? 1 : 0];
                                if (i20 >= 0) {
                                    bArr2[i18] = (byte) (i20 >> 16);
                                    int i21 = i18 + 2;
                                    bArr2[i18 + 1] = (byte) (i20 >> 8);
                                    i18 += 3;
                                    bArr2[i21] = (byte) i20;
                                    bytes = bArr;
                                    i7 = i19;
                                }
                                i11 = -2;
                                i14 = -8;
                            }
                            int i22 = bArr[i7] & UByte.MAX_VALUE;
                            int i23 = iArr[i22];
                            if (i23 >= 0) {
                                i7++;
                                i16 = (i16 << 6) | i23;
                                int i24 = i17 + 6;
                                if (i24 >= 0) {
                                    bArr2[i18] = (byte) (i16 >>> i24);
                                    i16 &= (1 << i24) - 1;
                                    i17 -= 2;
                                    i18++;
                                } else {
                                    i17 = i24;
                                }
                                bytes = bArr;
                                i11 = -2;
                                i14 = -8;
                                i15 = 8;
                            } else if (i23 == -2) {
                                if (i17 == -8) {
                                    u41.k(ud2.m(i7, "Redundant pad character at index "));
                                } else if (i17 == -6) {
                                    i4 = i7 + 1;
                                    i3 = i4;
                                    z = true;
                                    i11 = -2;
                                } else if (i17 == -4) {
                                    int i25 = i7 + 1;
                                    if (z2) {
                                        while (i25 < length2) {
                                            if (tr.a[bArr[i25] & UByte.MAX_VALUE ? 1 : 0] == -1) {
                                                i25++;
                                            }
                                        }
                                    }
                                    if (i25 == length2 || bArr[i25] != 61) {
                                        u41.k(ud2.m(i25, "Missing one pad character at index "));
                                    } else {
                                        i4 = i25 + 1;
                                        i3 = i4;
                                        z = true;
                                        i11 = -2;
                                    }
                                } else if (i17 == -2) {
                                    i4 = i7 + 1;
                                    i3 = i4;
                                    z = true;
                                    i11 = -2;
                                } else {
                                    u41.r("Unreachable");
                                }
                            } else {
                                if (!z2) {
                                    char c3 = (char) i22;
                                    yo4.m(i15);
                                    String string = Integer.toString(i22, i15);
                                    string.getClass();
                                    throw new IllegalArgumentException("Invalid symbol '" + c3 + "'(" + string + ") at index " + i7);
                                }
                                i7++;
                                bytes = bArr;
                                i11 = -2;
                                i14 = -8;
                            }
                        } else {
                            bArr = bytes;
                            i3 = i7;
                            z = false;
                        }
                    }
                    if (i17 == i11) {
                        u41.k("The last unit of input does not have enough bits");
                    } else if (i17 != -8 && !z) {
                        u41.k("The padding option is set to PRESENT, but the input is not properly padded");
                    } else if (i16 == 0) {
                        if (z2) {
                            while (i3 < length2) {
                                if (tr.a[bArr[i3] & UByte.MAX_VALUE ? 1 : 0] == -1) {
                                    i3++;
                                }
                            }
                        }
                        if (i3 < length2) {
                            int i26 = bArr[i3] & UByte.MAX_VALUE;
                            StringBuilder sb = new StringBuilder("Symbol '");
                            sb.append((char) i26);
                            sb.append("'(");
                            yo4.m(8);
                            String string2 = Integer.toString(i26, 8);
                            string2.getClass();
                            sb.append(string2);
                            sb.append(") at index ");
                            u41.k(fq2.q(sb, i3 - 1, " is prohibited after the pad character"));
                        } else {
                            if (i18 == i2) {
                                dy dyVar = new dy();
                                dyVar.S(i2, bArr2);
                                return new xl3(py.f(dyVar, jq2Var.f), strSubstring, qr0.d);
                            }
                            u41.r("Check failed.");
                        }
                    } else {
                        u41.k("The pad bits must be zeros");
                    }
                }
                return null;
            case 3:
                String str4 = mt2.d;
                String strS = jr1.s(da4Var);
                if (strS == null) {
                    u41.r("filePath == null");
                    return null;
                }
                mt2 mt2Var = Path$Companion.get(strS);
                y61 y61VarE = py.e(mt2Var, jq2Var.f, null, null, 28);
                String strQ1 = mo3.Q0(mt2Var.b(), '.', BuildConfig.VERSION_NAME);
                if (!mo3.C0(strQ1)) {
                    String lowerCase2 = strQ1.toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    mimeTypeFromExtension3 = (String) ge2.a.get(lowerCase2);
                    if (mimeTypeFromExtension3 == null) {
                        mimeTypeFromExtension3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase2);
                    }
                }
                return new xl3(y61VarE, mimeTypeFromExtension3, qr0Var);
            case 4:
                String str5 = da4Var.e;
                if (str5 == null) {
                    str5 = BuildConfig.VERSION_NAME;
                }
                int iZ1 = mo3.z0('!', 0, 6, str5);
                if (iZ1 == -1) {
                    m51.y(da4Var, "Invalid jar:file URI: ");
                    return null;
                }
                String str6 = mt2.d;
                mt2 mt2Var2 = Path$Companion.get(str5.substring(0, iZ1));
                mt2 mt2Var3 = Path$Companion.get(str5.substring(iZ1 + 1, str5.length()));
                a71 a71Var = jq2Var.f;
                a71Var.getClass();
                y61 y61VarE2 = py.e(mt2Var3, wj4.c(mt2Var2, a71Var, new s80(22)), null, null, 28);
                String strQ2 = mo3.Q0(mt2Var3.b(), '.', BuildConfig.VERSION_NAME);
                if (!mo3.C0(strQ2)) {
                    String lowerCase3 = strQ2.toLowerCase(Locale.ROOT);
                    lowerCase3.getClass();
                    mimeTypeFromExtension3 = (String) ge2.a.get(lowerCase3);
                    if (mimeTypeFromExtension3 == null) {
                        mimeTypeFromExtension3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase3);
                    }
                }
                return new xl3(y61VarE2, mimeTypeFromExtension3, qr0Var);
            default:
                String str7 = da4Var.d;
                if (str7 != null) {
                    if (mo3.C0(str7)) {
                        str7 = null;
                    }
                    if (str7 != null) {
                        String str8 = (String) ke0.F0(jr1.v(da4Var));
                        if (str8 == null || (numS0 = to3.s0(str8)) == null) {
                            m51.A(da4Var, "Invalid android.resource URI: ");
                            return null;
                        }
                        int iIntValue = numS0.intValue();
                        Context context = jq2Var.a;
                        Resources resources = str7.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(str7);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(iIntValue, typedValue, true);
                        String string3 = typedValue.string.toString();
                        if (mo3.C0(string3)) {
                            mimeTypeFromExtension2 = null;
                        } else {
                            String strS1 = mo3.S0('?', mo3.S0('#', string3));
                            String strQ3 = mo3.Q0(mo3.Q0(strS1, '/', strS1), '.', BuildConfig.VERSION_NAME);
                            if (mo3.C0(strQ3)) {
                                mimeTypeFromExtension2 = null;
                            } else {
                                String lowerCase4 = strQ3.toLowerCase(Locale.ROOT);
                                lowerCase4.getClass();
                                mimeTypeFromExtension2 = (String) ge2.a.get(lowerCase4);
                                if (mimeTypeFromExtension2 == null) {
                                    mimeTypeFromExtension2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase4);
                                }
                            }
                        }
                        if (!kr1.n(mimeTypeFromExtension2, "text/xml")) {
                            return new xl3(new yl3(new u23(yh4.Y(resources.openRawResource(iIntValue, new TypedValue()))), jq2Var.f, new y53(str7, iIntValue)), mimeTypeFromExtension2, qr0Var);
                        }
                        if (str7.equals(context.getPackageName())) {
                            drawable = y64.y(context, iIntValue);
                            if (drawable == null) {
                                j93.b(ud2.m(iIntValue, "Invalid resource ID: "));
                                return null;
                            }
                        } else {
                            XmlResourceParser xml = resources.getXml(iIntValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found.");
                            }
                            Resources.Theme theme = context.getTheme();
                            ThreadLocal threadLocal = b63.a;
                            drawable = resources.getDrawable(iIntValue, theme);
                            if (drawable == null) {
                                j93.b(ud2.m(iIntValue, "Invalid resource ID: "));
                                return null;
                            }
                        }
                        Bitmap.Config[] configArr = ta4.a;
                        boolean z3 = drawable instanceof VectorDrawable;
                        if (z3) {
                            drawable = new BitmapDrawable(context.getResources(), av1.j(drawable, (Bitmap.Config) y64.A(jq2Var, sm1.b), jq2Var.b, jq2Var.c, jq2Var.d == wx2.d));
                        }
                        return new dm1(vl0.u(drawable), z3, qr0Var);
                    }
                }
                m51.A(da4Var, "Invalid android.resource URI: ");
                return null;
        }
    }
}
