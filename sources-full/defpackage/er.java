package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public final class er implements kd1 {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public int i;
    public CharSequence j;
    public int k;
    public CharSequence l;
    public ArrayList m;
    public ArrayList n;
    public boolean o;
    public ArrayList p;
    public final nd1 q;
    public boolean r;
    public int s;

    public er(nd1 nd1Var) {
        nd1Var.H();
        zc1 zc1Var = nd1Var.w;
        if (zc1Var != null) {
            zc1Var.v.getClassLoader();
        }
        this.a = new ArrayList();
        this.o = false;
        this.s = -1;
        this.q = nd1Var;
    }

    @Override // defpackage.kd1
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (nd1.K(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        this.q.d.add(this);
        return true;
    }

    public final void b(xd1 xd1Var) {
        this.a.add(xd1Var);
        xd1Var.d = this.b;
        xd1Var.e = this.c;
        xd1Var.f = this.d;
        xd1Var.g = this.e;
    }

    public final void c(int i) {
        if (this.g) {
            if (nd1.K(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                xd1 xd1Var = (xd1) arrayList.get(i2);
                xc1 xc1Var = xd1Var.b;
                if (xc1Var != null) {
                    xc1Var.A += i;
                    if (nd1.K(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + xd1Var.b + " to " + xd1Var.b.A);
                    }
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            xd1 xd1Var = (xd1) arrayList.get(size);
            if (xd1Var.c) {
                if (xd1Var.a == 8) {
                    xd1Var.c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = xd1Var.b.G;
                    xd1Var.a = 2;
                    xd1Var.c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        xd1 xd1Var2 = (xd1) arrayList.get(i2);
                        if (xd1Var2.c && xd1Var2.b.G == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final int e(boolean z, boolean z2) {
        if (this.r) {
            u41.r("commit already called");
            return 0;
        }
        if (nd1.K(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new u72());
            g("  ", printWriter, true);
            printWriter.close();
        }
        this.r = true;
        boolean z3 = this.g;
        nd1 nd1Var = this.q;
        if (z3) {
            this.s = nd1Var.k.getAndIncrement();
        } else {
            this.s = -1;
        }
        if (z2) {
            nd1Var.y(this, z);
        }
        return this.s;
    }

    public final void f(int i, xc1 xc1Var, String str) {
        String str2 = xc1Var.T;
        if (str2 != null) {
            wd1.c(xc1Var, str2);
        }
        Class<?> cls = xc1Var.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = xc1Var.H;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(xc1Var);
                String str4 = xc1Var.H;
                sb.append(": was ");
                sb.append(str4);
                sb.append(" now ");
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
            xc1Var.H = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + xc1Var + " with tag " + str + " to container view with no id");
            }
            int i2 = xc1Var.F;
            if (i2 != 0 && i2 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(xc1Var);
                int i3 = xc1Var.F;
                sb2.append(": was ");
                sb2.append(i3);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            xc1Var.F = i;
            xc1Var.G = i;
        }
        b(new xd1(1, xc1Var));
        xc1Var.B = this.q;
    }

    public final void g(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.i != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (this.k != 0 || this.l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.l);
            }
        }
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xd1 xd1Var = (xd1) arrayList.get(i);
            switch (xd1Var.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + xd1Var.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(xd1Var.b);
            if (z) {
                if (xd1Var.d != 0 || xd1Var.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(xd1Var.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(xd1Var.e));
                }
                if (xd1Var.f != 0 || xd1Var.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(xd1Var.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(xd1Var.g));
                }
            }
        }
    }

    public final void h(xc1 xc1Var) {
        nd1 nd1Var = xc1Var.B;
        if (nd1Var == null || nd1Var == this.q) {
            b(new xd1(3, xc1Var));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + xc1Var.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(Uuid.SIZE_BITS);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
