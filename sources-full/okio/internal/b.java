package okio.internal;

import defpackage.a71;
import defpackage.au1;
import defpackage.bu1;
import defpackage.c;
import defpackage.ke0;
import defpackage.le0;
import defpackage.m51;
import defpackage.mo3;
import defpackage.mt2;
import defpackage.pe0;
import defpackage.ps2;
import defpackage.wl;
import defpackage.wl3;
import defpackage.yh4;
import defpackage.yq3;
import defpackage.z61;
import defpackage.zh3;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a71 {
    public static final mt2 n;
    public final ClassLoader h;
    public final a71 l;
    public final yq3 m;

    static {
        String str = mt2.d;
        n = Path$Companion.get("/");
    }

    public b(ClassLoader classLoader) {
        bu1 bu1Var = a71.c;
        bu1Var.getClass();
        this.h = classLoader;
        this.l = bu1Var;
        this.m = new yq3(new wl(16, this));
    }

    @Override // defpackage.a71
    public final List A(mt2 mt2Var) throws FileNotFoundException {
        mt2 mt2Var2 = n;
        mt2Var2.getClass();
        String strP = c.b(mt2Var2, mt2Var, true).d(mt2Var2).c.p();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (ps2 ps2Var : (List) this.m.getValue()) {
            a71 a71Var = (a71) ps2Var.c;
            mt2 mt2Var3 = (mt2) ps2Var.d;
            try {
                List listA = a71Var.A(mt2Var3.e(strP));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listA) {
                    if (ResourceFileSystem$Companion.access$keepPath((mt2) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(le0.q0(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    mt2 mt2Var4 = (mt2) obj2;
                    mt2Var4.getClass();
                    String strReplace = mo3.J0(mt2Var4.c.p(), mt2Var3.c.p()).replace('\\', '/');
                    strReplace.getClass();
                    arrayList2.add(mt2Var2.e(strReplace));
                }
                pe0.s0(arrayList2, linkedHashSet);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return ke0.O0(linkedHashSet);
        }
        m51.r(mt2Var, "file not found: ");
        return null;
    }

    @Override // defpackage.a71
    public final z61 L(mt2 mt2Var) {
        mt2Var.getClass();
        if (!ResourceFileSystem$Companion.access$keepPath(mt2Var)) {
            return null;
        }
        mt2 mt2Var2 = n;
        mt2Var2.getClass();
        String strP = c.b(mt2Var2, mt2Var, true).d(mt2Var2).c.p();
        for (ps2 ps2Var : (List) this.m.getValue()) {
            z61 z61VarL = ((a71) ps2Var.c).L(((mt2) ps2Var.d).e(strP));
            if (z61VarL != null) {
                return z61VarL;
            }
        }
        return null;
    }

    @Override // defpackage.a71
    public final au1 O(mt2 mt2Var) throws FileNotFoundException {
        if (!ResourceFileSystem$Companion.access$keepPath(mt2Var)) {
            m51.r(mt2Var, "file not found: ");
            return null;
        }
        mt2 mt2Var2 = n;
        mt2Var2.getClass();
        String strP = c.b(mt2Var2, mt2Var, true).d(mt2Var2).c.p();
        Iterator it = ((List) this.m.getValue()).iterator();
        while (it.hasNext()) {
            ps2 ps2Var = (ps2) it.next();
            try {
                return ((a71) ps2Var.c).O(((mt2) ps2Var.d).e(strP));
            } catch (FileNotFoundException unused) {
            }
        }
        m51.r(mt2Var, "file not found: ");
        return null;
    }

    @Override // defpackage.a71
    public final zh3 Q(mt2 mt2Var, boolean z) throws IOException {
        mt2Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.a71
    public final wl3 R(mt2 mt2Var) throws IOException {
        mt2Var.getClass();
        if (!ResourceFileSystem$Companion.access$keepPath(mt2Var)) {
            m51.r(mt2Var, "file not found: ");
            return null;
        }
        mt2 mt2Var2 = n;
        mt2Var2.getClass();
        URL resource = this.h.getResource(c.b(mt2Var2, mt2Var, false).d(mt2Var2).c.p());
        if (resource == null) {
            m51.r(mt2Var, "file not found: ");
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        inputStream.getClass();
        return yh4.Y(inputStream);
    }

    @Override // defpackage.a71
    public final zh3 a(mt2 mt2Var) throws IOException {
        mt2Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.a71
    public final void c(mt2 mt2Var, mt2 mt2Var2) throws IOException {
        mt2Var.getClass();
        mt2Var2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.a71
    public final void h(mt2 mt2Var) throws IOException {
        mt2Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.a71
    public final void l(mt2 mt2Var) throws IOException {
        mt2Var.getClass();
        throw new IOException(this + " is read-only");
    }
}
