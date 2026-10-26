package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p31 implements SharedPreferences {
    public final SharedPreferences a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final String c;
    public final p4 d;
    public final hv0 e;

    public p31(String str, SharedPreferences sharedPreferences, p4 p4Var, hv0 hv0Var) {
        this.c = str;
        this.a = sharedPreferences;
        this.d = p4Var;
        this.e = hv0Var;
    }

    public static p31 a(Context context, String str, d5 d5Var) {
        ci4 ci4VarN;
        ci4 ci4VarN2;
        String str2 = d5Var.d;
        int i = iv0.a;
        w43.h(kv0.b);
        if (!y04.a()) {
            w43.f(new c5(w6.class, new a5[]{new a5(hv0.class, 6)}, 6), true);
        }
        q4.a();
        Context applicationContext = context.getApplicationContext();
        s44 s44Var = new s44();
        s44Var.n = gb2.F("AES256_SIV");
        if (applicationContext == null) {
            u41.k("need an Android context");
            return null;
        }
        s44Var.c = applicationContext;
        s44Var.d = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
        s44Var.h = str;
        String strM = fq2.m("android-keystore://", str2);
        if (!strM.startsWith("android-keystore://")) {
            u41.k("key URI must start with android-keystore://");
            return null;
        }
        s44Var.l = strM;
        jb jbVarA = s44Var.a();
        synchronized (jbVarA) {
            ci4VarN = ((sz0) jbVarA.d).n();
        }
        s44 s44Var2 = new s44();
        s44Var2.n = gb2.F("AES256_GCM");
        s44Var2.c = applicationContext;
        s44Var2.d = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
        s44Var2.h = str;
        String strM2 = fq2.m("android-keystore://", str2);
        if (!strM2.startsWith("android-keystore://")) {
            u41.k("key URI must start with android-keystore://");
            return null;
        }
        s44Var2.l = strM2;
        jb jbVarA2 = s44Var2.a();
        synchronized (jbVarA2) {
            ci4VarN2 = ((sz0) jbVarA2.d).n();
        }
        hv0 hv0Var = (hv0) ci4VarN.B(hv0.class);
        return new p31(str, applicationContext.getSharedPreferences(str, 0), (p4) ci4VarN2.B(p4.class), hv0Var);
    }

    public static boolean d(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public final String b(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            try {
                return new String(sr.b(this.e.a(str.getBytes(StandardCharsets.UTF_8), this.c.getBytes())), "US-ASCII");
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        } catch (GeneralSecurityException e2) {
            u41.n("Could not encrypt key. ", e2.getMessage(), e2);
            return null;
        }
    }

    public final Object c(String str) {
        int i;
        String str2;
        if (d(str)) {
            throw new SecurityException(ud2.p(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strB = b(str);
            String string = this.a.getString(strB, null);
            if (string != null) {
                byte[] bArrA = sr.a(string);
                p4 p4Var = this.d;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(p4Var.b(bArrA, strB.getBytes(charset)));
                byteBufferWrap.position(0);
                int i2 = byteBufferWrap.getInt();
                if (i2 == 0) {
                    i = 1;
                } else if (i2 == 1) {
                    i = 2;
                } else if (i2 == 2) {
                    i = 3;
                } else if (i2 == 3) {
                    i = 4;
                } else if (i2 != 4) {
                    i = i2 != 5 ? 0 : 6;
                } else {
                    i = 5;
                }
                if (i == 0) {
                    throw new SecurityException("Unknown type ID for encrypted pref value: " + i2);
                }
                int iZ = fq2.z(i);
                if (iZ == 0) {
                    int i3 = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                    byteBufferWrap.limit(i3);
                    String string2 = charset.decode(byteBufferSlice).toString();
                    if (!string2.equals("__NULL__")) {
                        return string2;
                    }
                } else {
                    if (iZ != 1) {
                        if (iZ == 2) {
                            return Integer.valueOf(byteBufferWrap.getInt());
                        }
                        if (iZ == 3) {
                            return Long.valueOf(byteBufferWrap.getLong());
                        }
                        if (iZ == 4) {
                            return Float.valueOf(byteBufferWrap.getFloat());
                        }
                        if (iZ == 5) {
                            return Boolean.valueOf(byteBufferWrap.get() != 0);
                        }
                        switch (i) {
                            case 1:
                                str2 = "STRING";
                                break;
                            case 2:
                                str2 = "STRING_SET";
                                break;
                            case 3:
                                str2 = "INT";
                                break;
                            case 4:
                                str2 = "LONG";
                                break;
                            case 5:
                                str2 = "FLOAT";
                                break;
                            case 6:
                                str2 = "BOOLEAN";
                                break;
                            default:
                                str2 = "null";
                                break;
                        }
                        throw new SecurityException("Unhandled type for encrypted pref value: ".concat(str2));
                    }
                    ul ulVar = new ul(0);
                    while (byteBufferWrap.hasRemaining()) {
                        int i4 = byteBufferWrap.getInt();
                        ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                        byteBufferSlice2.limit(i4);
                        byteBufferWrap.position(byteBufferWrap.position() + i4);
                        ulVar.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                    }
                    if (ulVar.h != 1 || !"__NULL__".equals(ulVar.d[0])) {
                        return ulVar;
                    }
                }
            }
            return null;
        } catch (GeneralSecurityException e) {
            u41.n("Could not decrypt value. ", e.getMessage(), e);
            return null;
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (d(str)) {
            throw new SecurityException(ud2.p(str, " is a reserved key for the encryption keyset."));
        }
        return this.a.contains(b(str));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new o31(this, this.a.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            if (!d(entry.getKey())) {
                try {
                    String str = new String(this.e.b(sr.a(entry.getKey()), this.c.getBytes()), StandardCharsets.UTF_8);
                    String str2 = str.equals("__NULL__") ? null : str;
                    map.put(str2, c(str2));
                } catch (GeneralSecurityException e) {
                    u41.n("Could not decrypt key. ", e.getMessage(), e);
                    return null;
                }
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object objC = c(str);
        return objC instanceof Boolean ? ((Boolean) objC).booleanValue() : z;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object objC = c(str);
        return objC instanceof Float ? ((Float) objC).floatValue() : f;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object objC = c(str);
        return objC instanceof Integer ? ((Integer) objC).intValue() : i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object objC = c(str);
        return objC instanceof Long ? ((Long) objC).longValue() : j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object objC = c(str);
        return objC instanceof String ? (String) objC : str2;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Object objC = c(str);
        Set ulVar = objC instanceof Set ? (Set) objC : new ul(0);
        return ulVar.size() > 0 ? ulVar : set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.remove(onSharedPreferenceChangeListener);
    }
}
