package defpackage;

import app.template.extension.BuildConfig;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class nr3 extends i {
    public final ArrayList c;
    public final ArrayList d;
    public final mr3 a = new mr3();
    public final ArrayList b = new ArrayList();
    public boolean e = true;

    public nr3(ArrayList arrayList, ArrayList arrayList2) {
        this.c = arrayList;
        this.d = arrayList2;
    }

    public static ArrayList i(CharSequence charSequence) {
        String strTrim = charSequence.toString().trim();
        if (strTrim.startsWith("|")) {
            strTrim = strTrim.substring(1);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < strTrim.length()) {
            char cCharAt = strTrim.charAt(i);
            if (cCharAt == '\\') {
                int i2 = i + 1;
                if (i2 >= strTrim.length() || strTrim.charAt(i2) != '|') {
                    sb.append('\\');
                } else {
                    sb.append('|');
                    i = i2;
                }
            } else if (cCharAt != '|') {
                sb.append(cCharAt);
            } else {
                arrayList.add(sb.toString());
                sb.setLength(0);
            }
            i++;
        }
        if (sb.length() > 0) {
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    @Override // defpackage.i
    public final void a(CharSequence charSequence) {
        if (this.e) {
            this.e = false;
        } else {
            this.b.add(charSequence);
        }
    }

    @Override // defpackage.i
    public final kv e() {
        return this.a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.i
    public final void g(vo1 vo1Var) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        rr3 rr3Var = new rr3();
        mr3 mr3Var = this.a;
        mr3Var.b(rr3Var);
        im0 as3Var = new as3();
        rr3Var.b(as3Var);
        int i = 0;
        while (true) {
            arrayList = this.c;
            if (i >= size) {
                break;
            }
            String str = (String) arrayList2.get(i);
            qr3 qr3Var = new qr3();
            if (i < arrayList.size()) {
                qr3Var.h = (pr3) arrayList.get(i);
            }
            vo1Var.f(str.trim(), qr3Var);
            qr3Var.g = true;
            as3Var.b(qr3Var);
            i++;
        }
        ArrayList arrayList3 = this.b;
        int size2 = arrayList3.size();
        im0 or3Var = null;
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList3.get(i2);
            i2++;
            ArrayList arrayListI = i((CharSequence) obj);
            im0 as3Var2 = new as3();
            int i3 = 0;
            while (i3 < size) {
                String str2 = i3 < arrayListI.size() ? (String) arrayListI.get(i3) : BuildConfig.VERSION_NAME;
                qr3 qr3Var2 = new qr3();
                if (i3 < arrayList.size()) {
                    qr3Var2.h = (pr3) arrayList.get(i3);
                }
                vo1Var.f(str2.trim(), qr3Var2);
                as3Var2.b(qr3Var2);
                i3++;
            }
            if (or3Var == null) {
                or3Var = new or3();
                mr3Var.b(or3Var);
            }
            or3Var.b(as3Var2);
        }
    }

    @Override // defpackage.i
    public final lv h(ix0 ix0Var) {
        if (ix0Var.a.toString().contains("|")) {
            return lv.a(ix0Var.b);
        }
        return null;
    }
}
