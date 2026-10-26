package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wh1 extends i {
    public final /* synthetic */ int a;
    public final kv b;
    public final Serializable c;

    public wh1() {
        this.a = 1;
        this.b = new rn1();
        this.c = new ArrayList();
    }

    public wh1(int i, String str) {
        this.a = 0;
        vh1 vh1Var = new vh1();
        this.b = vh1Var;
        vh1Var.g = i;
        this.c = str;
    }

    @Override // defpackage.i
    public void a(CharSequence charSequence) {
        switch (this.a) {
            case 1:
                ((ArrayList) this.c).add(charSequence);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003f A[LOOP:2: B:20:0x003b->B:22:0x003f, LOOP_END] */
    @Override // defpackage.i
    public void d() {
        int i;
        StringBuilder sb;
        int i2;
        switch (this.a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                do {
                    size--;
                    if (size >= 0) {
                        CharSequence charSequence = (CharSequence) arrayList.get(size);
                        int length = charSequence.length();
                        i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                char cCharAt = charSequence.charAt(i2);
                                if (cCharAt != ' ') {
                                    switch (cCharAt) {
                                        case '\t':
                                        case '\n':
                                        case 11:
                                        case '\f':
                                        case '\r':
                                            break;
                                    }
                                }
                                i2++;
                            } else {
                                i2 = -1;
                            }
                        }
                    }
                    sb = new StringBuilder();
                    for (i = 0; i < size + 1; i++) {
                        sb.append((CharSequence) arrayList.get(i));
                        sb.append('\n');
                    }
                    ((rn1) this.b).g = sb.toString();
                    break;
                } while (i2 == -1);
                sb = new StringBuilder();
                while (i < size + 1) {
                    sb.append((CharSequence) arrayList.get(i));
                    sb.append('\n');
                }
                ((rn1) this.b).g = sb.toString();
                break;
        }
    }

    @Override // defpackage.i
    public final kv e() {
        int i = this.a;
        kv kvVar = this.b;
        switch (i) {
            case 0:
                return (vh1) kvVar;
            default:
                return (rn1) kvVar;
        }
    }

    @Override // defpackage.i
    public void g(vo1 vo1Var) {
        switch (this.a) {
            case 0:
                vo1Var.f((String) this.c, (vh1) this.b);
                break;
        }
    }

    @Override // defpackage.i
    public final lv h(ix0 ix0Var) {
        switch (this.a) {
            case 0:
                return null;
            default:
                if (ix0Var.g >= 4) {
                    return new lv(-1, ix0Var.c + 4, false);
                }
                if (ix0Var.h) {
                    return lv.a(ix0Var.e);
                }
                return null;
        }
    }
}
