package defpackage;

import android.content.SharedPreferences;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class o31 implements SharedPreferences.Editor {
    public final p31 a;
    public final SharedPreferences.Editor b;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public o31(p31 p31Var, SharedPreferences.Editor editor) {
        this.a = p31Var;
        this.b = editor;
    }

    public final void a() {
        if (this.d.getAndSet(false)) {
            p31 p31Var = this.a;
            for (String str : ((HashMap) p31Var.getAll()).keySet()) {
                if (!this.c.contains(str) && !p31.d(str)) {
                    this.b.remove(p31Var.b(str));
                }
            }
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        a();
        this.b.apply();
        b();
        this.c.clear();
    }

    public final void b() {
        p31 p31Var = this.a;
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : p31Var.b) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(p31Var, (String) it.next());
            }
        }
    }

    public final void c(String str, byte[] bArr) {
        p31 p31Var = this.a;
        p31Var.getClass();
        if (p31.d(str)) {
            throw new SecurityException(ud2.p(str, " is a reserved key for the encryption keyset."));
        }
        this.c.add(str);
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strB = p31Var.b(str);
            try {
                Pair pair = new Pair(strB, new String(sr.b(p31Var.d.a(bArr, strB.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));
                this.b.putString((String) pair.first, (String) pair.second);
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        } catch (GeneralSecurityException e2) {
            u41.n("Could not encrypt data: ", e2.getMessage(), e2);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.d.set(true);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        a();
        try {
            return this.b.commit();
        } finally {
            b();
            copyOnWriteArrayList.clear();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.putInt(5);
        byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(4);
        byteBufferAllocate.putFloat(f);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(2);
        byteBufferAllocate.putInt(i);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.putInt(3);
        byteBufferAllocate.putLong(j);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.put(bytes);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        int i = 0;
        if (set == null) {
            set = new ul(0);
            set.add("__NULL__");
        }
        ArrayList arrayList = new ArrayList(set.size());
        int size = set.size() * 4;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
            arrayList.add(bytes);
            size += bytes.length;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
        byteBufferAllocate.putInt(1);
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            byte[] bArr = (byte[]) obj;
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        p31 p31Var = this.a;
        p31Var.getClass();
        if (p31.d(str)) {
            throw new SecurityException(ud2.p(str, " is a reserved key for the encryption keyset."));
        }
        this.b.remove(p31Var.b(str));
        this.c.add(str);
        return this;
    }
}
