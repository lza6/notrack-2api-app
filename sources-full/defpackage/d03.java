package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.concurrent.Executor;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class d03 {
    public static final qn0 a = new qn0(24);

    public static void a(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0192 A[Catch: all -> 0x018f, TRY_ENTER, TryCatch #30 {all -> 0x018f, blocks: (B:94:0x016e, B:96:0x017a, B:107:0x0192, B:108:0x0197), top: B:283:0x016e }] */
    /* JADX WARN: Code duplicated, block: B:114:0x01a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x01a3 A[Catch: IllegalStateException -> 0x0189, IOException -> 0x018b, FileNotFoundException -> 0x018d, TRY_LEAVE, TryCatch #34 {FileNotFoundException -> 0x018d, IOException -> 0x018b, IllegalStateException -> 0x0189, blocks: (B:92:0x0166, B:97:0x0184, B:115:0x01a3, B:113:0x01a0, B:112:0x019d), top: B:299:0x0166 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e3 A[Catch: all -> 0x01f1, TRY_LEAVE, TryCatch #14 {all -> 0x01f1, blocks: (B:130:0x01d7, B:132:0x01e3, B:141:0x01f4), top: B:272:0x01d7 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x01f4 A[Catch: all -> 0x01f1, TRY_ENTER, TRY_LEAVE, TryCatch #14 {all -> 0x01f1, blocks: (B:130:0x01d7, B:132:0x01e3, B:141:0x01f4), top: B:272:0x01d7 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0211  */
    /* JADX WARN: Code duplicated, block: B:156:0x021b  */
    /* JADX WARN: Code duplicated, block: B:157:0x021f  */
    /* JADX WARN: Code duplicated, block: B:166:0x0241 A[Catch: all -> 0x027f, TryCatch #23 {all -> 0x027f, blocks: (B:164:0x023b, B:166:0x0241, B:167:0x0245, B:169:0x024b), top: B:277:0x023b }] */
    /* JADX WARN: Code duplicated, block: B:169:0x024b A[Catch: all -> 0x027f, TRY_LEAVE, TryCatch #23 {all -> 0x027f, blocks: (B:164:0x023b, B:166:0x0241, B:167:0x0245, B:169:0x024b), top: B:277:0x023b }] */
    /* JADX WARN: Code duplicated, block: B:235:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:239:0x02da  */
    /* JADX WARN: Code duplicated, block: B:246:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:269:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x023b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x0223 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x0250 A[EDGE_INSN: B:300:0x0250->B:171:0x0250 BREAK  A[LOOP:0: B:167:0x0245->B:301:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00df  */
    /* JADX WARN: Code duplicated, block: B:55:0x0111 A[Catch: all -> 0x0126, IllegalStateException -> 0x0129, IOException -> 0x012b, TRY_LEAVE, TryCatch #11 {IOException -> 0x012b, blocks: (B:53:0x0107, B:55:0x0111, B:66:0x012d, B:67:0x0132), top: B:269:0x0107, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x012d A[Catch: all -> 0x0126, IllegalStateException -> 0x0129, IOException -> 0x012b, TRY_ENTER, TryCatch #11 {IOException -> 0x012b, blocks: (B:53:0x0107, B:55:0x0111, B:66:0x012d, B:67:0x0132), top: B:269:0x0107, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x017a A[Catch: all -> 0x018f, TRY_LEAVE, TryCatch #30 {all -> 0x018f, blocks: (B:94:0x016e, B:96:0x017a, B:107:0x0192, B:108:0x0197), top: B:283:0x016e }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v18 */
    public static void b(Context context, Executor executor, c03 c03Var, boolean z) {
        boolean z2;
        ?? E;
        mv0[] mv0VarArrU;
        mv0[] mv0VarArr;
        c03 c03Var2;
        mv0[] mv0VarArr2;
        byte[] bArr;
        ?? r7;
        byte[] bArr2;
        ?? r8;
        boolean z3;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr3;
        int i;
        ?? r9;
        boolean z4;
        boolean z5;
        ?? r10;
        ByteArrayOutputStream byteArrayOutputStream;
        lv0 lv0Var;
        ?? r11;
        String str;
        FileInputStream fileInputStreamE;
        ?? r12;
        ?? r13;
        boolean z6;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            z6 = j == packageInfo.lastUpdateTime;
                            if (z6) {
                                c03Var.m(2, null);
                            }
                        } catch (Throwable th3) {
                            try {
                                dataInputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (IOException unused) {
                        z6 = false;
                    }
                } else {
                    z6 = false;
                }
                if (z6) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    g03.c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr4 = p23.f;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            lv0 lv0Var2 = new lv0(assets, executor, c03Var, name, file2);
            byte[] bArr5 = (byte[]) lv0Var2.d;
            if (bArr5 != null) {
                if (!file2.exists()) {
                    try {
                        if (file2.createNewFile()) {
                            lv0Var2.a = true;
                            E = lv0Var2.e(assets, "dexopt/baseline.prof");
                            if (E != 0) {
                                if (Arrays.equals(bArr4, xr0.k0(4, E))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                mv0VarArrU = p23.U(E, xr0.k0(4, E), (String) lv0Var2.g);
                                E.close();
                                lv0Var2.h = mv0VarArrU;
                            }
                            mv0VarArr = (mv0[]) lv0Var2.h;
                            if (mv0VarArr != null) {
                                str = "dexopt/baseline.profm";
                                fileInputStreamE = lv0Var2.e(assets, "dexopt/baseline.profm");
                                r11 = str;
                                if (fileInputStreamE == null) {
                                    if (fileInputStreamE != null) {
                                        fileInputStreamE.close();
                                        r11 = str;
                                    }
                                    lv0Var = null;
                                    E = r11;
                                } else {
                                    if (Arrays.equals(p23.g, xr0.k0(4, fileInputStreamE))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] bArrK0 = xr0.k0(4, fileInputStreamE);
                                    lv0Var2.h = p23.R(fileInputStreamE, bArrK0, bArr5, mv0VarArr);
                                    fileInputStreamE.close();
                                    lv0Var = lv0Var2;
                                    E = bArrK0;
                                }
                                if (lv0Var != null) {
                                    lv0Var2 = lv0Var;
                                }
                            }
                            c03Var2 = (c03) lv0Var2.c;
                            mv0VarArr2 = (mv0[]) lv0Var2.h;
                            bArr = (byte[]) lv0Var2.d;
                            r7 = E;
                            r7 = E;
                            if (mv0VarArr2 != null) {
                                z5 = lv0Var2.a;
                                if (z5) {
                                    u41.r("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr4);
                                byteArrayOutputStream.write(bArr);
                                if (p23.f0(byteArrayOutputStream, bArr, mv0VarArr2)) {
                                    lv0Var2.e = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    r10 = byteArrayOutputStream;
                                    lv0Var2.h = null;
                                    r7 = r10;
                                } else {
                                    c03Var2.m(5, null);
                                    lv0Var2.h = null;
                                    byteArrayOutputStream.close();
                                    r7 = byteArrayOutputStream;
                                }
                            }
                            bArr2 = (byte[]) lv0Var2.e;
                            if (bArr2 != null) {
                                if (lv0Var2.a) {
                                    u41.r("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                fileOutputStream = new FileOutputStream((File) lv0Var2.f);
                                channel = fileOutputStream.getChannel();
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    if (fileLockTryLock.isValid()) {
                                        bArr3 = new byte[ConstantsKt.MINIMUM_BLOCK_SIZE];
                                        while (true) {
                                            i = byteArrayInputStream.read(bArr3);
                                            if (i > 0) {
                                                break;
                                                break;
                                            }
                                            fileOutputStream.write(bArr3, 0, i);
                                        }
                                        r9 = 1;
                                        lv0Var2.f(1, null);
                                        fileLockTryLock.close();
                                        channel.close();
                                        fileOutputStream.close();
                                        byteArrayInputStream.close();
                                        lv0Var2.e = null;
                                        lv0Var2.h = null;
                                        z3 = true;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            z3 = false;
                            r9 = 1;
                            if (z3) {
                                a(packageInfo, filesDir);
                            }
                            z4 = z3;
                            r12 = r9;
                        } else {
                            lv0Var2.f(4, null);
                        }
                    } catch (IOException unused2) {
                        z2 = true;
                        lv0Var2.f(4, null);
                    }
                } else if (file2.canWrite()) {
                    lv0Var2.a = true;
                    try {
                        E = lv0Var2.e(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e) {
                        c03Var.m(6, e);
                        E = 0;
                    } catch (IOException e2) {
                        c03Var.m(7, e2);
                        E = 0;
                    }
                    try {
                        if (E != 0) {
                            try {
                                try {
                                    if (Arrays.equals(bArr4, xr0.k0(4, E))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    mv0VarArrU = p23.U(E, xr0.k0(4, E), (String) lv0Var2.g);
                                    try {
                                        E.close();
                                    } catch (IOException e3) {
                                        c03Var.m(7, e3);
                                    }
                                    lv0Var2.h = mv0VarArrU;
                                } catch (IOException e4) {
                                    c03Var.m(7, e4);
                                    try {
                                        E.close();
                                    } catch (IOException e5) {
                                        c03Var.m(7, e5);
                                    }
                                    mv0VarArrU = null;
                                }
                            } catch (IllegalStateException e6) {
                                c03Var.m(8, e6);
                                E.close();
                                mv0VarArrU = null;
                            }
                        }
                        mv0VarArr = (mv0[]) lv0Var2.h;
                        if (mv0VarArr != null && ((E = Build.VERSION.SDK_INT) >= 31 || E == 24 || E == 25)) {
                            try {
                                str = "dexopt/baseline.profm";
                                fileInputStreamE = lv0Var2.e(assets, "dexopt/baseline.profm");
                                r11 = str;
                                if (fileInputStreamE == null) {
                                    try {
                                        if (Arrays.equals(p23.g, xr0.k0(4, fileInputStreamE))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        byte[] bArrK1 = xr0.k0(4, fileInputStreamE);
                                        lv0Var2.h = p23.R(fileInputStreamE, bArrK1, bArr5, mv0VarArr);
                                        fileInputStreamE.close();
                                        lv0Var = lv0Var2;
                                        E = bArrK1;
                                    } catch (Throwable th5) {
                                        try {
                                            fileInputStreamE.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamE != null) {
                                        fileInputStreamE.close();
                                        r11 = str;
                                    }
                                    lv0Var = null;
                                    E = r11;
                                }
                            } catch (FileNotFoundException e7) {
                                c03Var.m(9, e7);
                                r11 = E;
                            } catch (IOException e8) {
                                c03Var.m(7, e8);
                                r11 = E;
                            } catch (IllegalStateException e9) {
                                lv0Var2.h = null;
                                c03Var.m(8, e9);
                                r11 = E;
                            }
                            if (lv0Var != null) {
                                lv0Var2 = lv0Var;
                            }
                        }
                        c03Var2 = (c03) lv0Var2.c;
                        mv0VarArr2 = (mv0[]) lv0Var2.h;
                        bArr = (byte[]) lv0Var2.d;
                        r7 = E;
                        r7 = E;
                        if (mv0VarArr2 != null && bArr != null) {
                            z5 = lv0Var2.a;
                            if (z5) {
                                u41.r("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr4);
                                    byteArrayOutputStream.write(bArr);
                                    if (p23.f0(byteArrayOutputStream, bArr, mv0VarArr2)) {
                                        c03Var2.m(5, null);
                                        lv0Var2.h = null;
                                        byteArrayOutputStream.close();
                                        r7 = byteArrayOutputStream;
                                    } else {
                                        lv0Var2.e = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        r10 = byteArrayOutputStream;
                                        lv0Var2.h = null;
                                        r7 = r10;
                                    }
                                } catch (Throwable th7) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th7;
                                    } catch (Throwable th8) {
                                        th7.addSuppressed(th8);
                                        throw th7;
                                    }
                                }
                            } catch (IOException e10) {
                                c03Var2.m(7, e10);
                                r10 = z5;
                            } catch (IllegalStateException e11) {
                                c03Var2.m(8, e11);
                                r10 = z5;
                            }
                        }
                        bArr2 = (byte[]) lv0Var2.e;
                        if (bArr2 != null) {
                            z3 = false;
                            r9 = 1;
                        } else {
                            try {
                                if (lv0Var2.a) {
                                    u41.r("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                        try {
                                            try {
                                                fileOutputStream = new FileOutputStream((File) lv0Var2.f);
                                                try {
                                                    try {
                                                        channel = fileOutputStream.getChannel();
                                                        try {
                                                            fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                bArr3 = new byte[ConstantsKt.MINIMUM_BLOCK_SIZE];
                                                                                while (true) {
                                                                                    i = byteArrayInputStream.read(bArr3);
                                                                                    if (i > 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr3, 0, i);
                                                                                    }
                                                                                }
                                                                                r9 = 1;
                                                                                lv0Var2.f(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                lv0Var2.e = null;
                                                                                lv0Var2.h = null;
                                                                                z3 = true;
                                                                            }
                                                                        } catch (Throwable th9) {
                                                                            th = th9;
                                                                            Throwable th10 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th10;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th10;
                                                                            } catch (Throwable th11) {
                                                                                th10.addSuppressed(th11);
                                                                                throw th10;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                    Throwable th13 = th;
                                                                    if (channel == null) {
                                                                        throw th13;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th13;
                                                                    } catch (Throwable th14) {
                                                                        th13.addSuppressed(th14);
                                                                        throw th13;
                                                                    }
                                                                }
                                                            } catch (Throwable th15) {
                                                                th = th15;
                                                            }
                                                        } catch (Throwable th16) {
                                                            th = th16;
                                                        }
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th18) {
                                                            th2.addSuppressed(th18);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th19) {
                                                    th = th19;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th20) {
                                                th = th20;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th21) {
                                                    th.addSuppressed(th21);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th22) {
                                            th = th22;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e12) {
                                        e = e12;
                                        r7 = 1;
                                        lv0Var2.f(6, e);
                                        r8 = r7;
                                        lv0Var2.e = null;
                                        lv0Var2.h = null;
                                        z3 = false;
                                        r9 = r8;
                                    } catch (IOException e13) {
                                        e = e13;
                                        r7 = 1;
                                        lv0Var2.f(7, e);
                                        r8 = r7;
                                        lv0Var2.e = null;
                                        lv0Var2.h = null;
                                        z3 = false;
                                        r9 = r8;
                                    }
                                } catch (FileNotFoundException e14) {
                                    e = e14;
                                    lv0Var2.f(6, e);
                                    r8 = r7;
                                    lv0Var2.e = null;
                                    lv0Var2.h = null;
                                    z3 = false;
                                    r9 = r8;
                                } catch (IOException e15) {
                                    e = e15;
                                    lv0Var2.f(7, e);
                                    r8 = r7;
                                    lv0Var2.e = null;
                                    lv0Var2.h = null;
                                    z3 = false;
                                    r9 = r8;
                                }
                            } catch (Throwable th23) {
                                lv0Var2.e = null;
                                lv0Var2.h = null;
                                throw th23;
                            }
                        }
                        if (z3) {
                            a(packageInfo, filesDir);
                        }
                        z4 = z3;
                        r12 = r9;
                    } catch (Throwable th24) {
                        try {
                            E.close();
                            throw th24;
                        } catch (IOException e16) {
                            c03Var.m(7, e16);
                            throw th24;
                        }
                    }
                } else {
                    lv0Var2.f(4, null);
                }
                if (z4 || !z) {
                    r13 = 0;
                } else {
                    r13 = r12;
                }
                g03.c(context, r13);
            }
            lv0Var2.f(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z4 = false;
            r12 = z2;
            if (z4) {
                r13 = 0;
            } else {
                r13 = 0;
            }
            g03.c(context, r13);
        } catch (PackageManager.NameNotFoundException e17) {
            c03Var.m(7, e17);
            g03.c(context, false);
        }
    }
}
