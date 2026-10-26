package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okio.c;

/* JADX INFO: loaded from: classes.dex */
public class bu1 extends a71 {
    @Override // defpackage.a71
    public final List A(mt2 mt2Var) throws IOException {
        File file = mt2Var.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                j93.f(mt2Var, "failed to list ");
                return null;
            }
            m51.r(mt2Var, "no such file: ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(mt2Var.e(str));
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    @Override // defpackage.a71
    public z61 L(mt2 mt2Var) {
        mt2Var.getClass();
        File file = mt2Var.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new z61(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }

    @Override // defpackage.a71
    public final au1 O(mt2 mt2Var) {
        return new au1(new RandomAccessFile(mt2Var.toFile(), "r"));
    }

    @Override // defpackage.a71
    public final zh3 Q(mt2 mt2Var, boolean z) throws IOException {
        mt2Var.getClass();
        if (!z || !x(mt2Var)) {
            return new zm(new FileOutputStream(mt2Var.toFile(), false), 1, new c());
        }
        throw new IOException(mt2Var + " already exists.");
    }

    @Override // defpackage.a71
    public final wl3 R(mt2 mt2Var) {
        mt2Var.getClass();
        return new an(new FileInputStream(mt2Var.toFile()), c.d);
    }

    @Override // defpackage.a71
    public final zh3 a(mt2 mt2Var) {
        mt2Var.getClass();
        return new zm(new FileOutputStream(mt2Var.toFile(), true), 1, new c());
    }

    @Override // defpackage.a71
    public void c(mt2 mt2Var, mt2 mt2Var2) throws IOException {
        mt2Var.getClass();
        mt2Var2.getClass();
        if (mt2Var.toFile().renameTo(mt2Var2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + mt2Var + " to " + mt2Var2);
    }

    @Override // defpackage.a71
    public final void h(mt2 mt2Var) throws IOException {
        mt2Var.getClass();
        if (mt2Var.toFile().mkdir()) {
            return;
        }
        z61 z61VarL = L(mt2Var);
        if (z61VarL == null || !z61VarL.b) {
            j93.f(mt2Var, "failed to create directory: ");
        }
    }

    @Override // defpackage.a71
    public final void l(mt2 mt2Var) throws IOException {
        mt2Var.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = mt2Var.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        j93.f(mt2Var, "failed to delete ");
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
