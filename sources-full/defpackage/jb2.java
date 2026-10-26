package defpackage;

import android.text.Editable;
import android.util.LruCache;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import ru.noties.jlatexmath.JLatexMathDrawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class jb2 {
    public static final LruCache a = new LruCache(160);
    public static final LruCache b = new LruCache(160);
    public static final yq3 c = new yq3(new b72(1));

    public static void a(Editable editable, List list, float f, int i, int i2, boolean z) {
        char c2;
        List listB0 = rf3.b0(u43.b(nb2.a, editable.toString()));
        if (listB0.isEmpty()) {
            return;
        }
        int i3 = 1;
        Iterator it = new ya2(1, listB0).iterator();
        while (true) {
            ListIterator listIterator = (ListIterator) ((o63) it).d;
            if (!listIterator.hasPrevious()) {
                return;
            }
            za2 za2Var = (za2) listIterator.previous();
            lb2 lb2Var = (lb2) ke0.A0(Integer.parseInt((String) ((ya2) za2Var.a()).get(i3)), list);
            int i4 = za2Var.b().c;
            int i5 = za2Var.b().d + i3;
            if (lb2Var == null) {
                editable.delete(i4, i5);
            } else {
                String str = lb2Var.b;
                boolean z2 = lb2Var.c;
                String strReplace = lb2Var.a.replace('\n', ' ');
                strReplace.getClass();
                editable.replace(i4, i5, strReplace);
                int length = strReplace.length() + i4;
                char c3 = z2 ? 'D' : 'I';
                StringBuilder sb = new StringBuilder();
                sb.append(c3);
                sb.append("|");
                sb.append(f);
                sb.append("|");
                sb.append(i);
                String strR = fq2.r(sb, "|", str);
                LruCache lruCache = a;
                JLatexMathDrawable jLatexMathDrawable = (JLatexMathDrawable) lruCache.get(strR);
                boolean z3 = false;
                if (jLatexMathDrawable == null) {
                    LruCache lruCache2 = b;
                    if (kr1.n(lruCache2.get(strR), Boolean.TRUE)) {
                        jLatexMathDrawable = null;
                    } else {
                        try {
                            u43 u43Var = nb2.a;
                            JLatexMathDrawable jLatexMathDrawableBuild = JLatexMathDrawable.builder(nb2.f(str, hf0.b(i) > 0.5d)).textSize(z2 ? 1.1f * f : f).color(i).align(z2 ? 1 : 0).padding(0).build();
                            jLatexMathDrawableBuild.setBounds(0, 0, jLatexMathDrawableBuild.getIntrinsicWidth(), jLatexMathDrawableBuild.getIntrinsicHeight());
                            lruCache.put(strR, jLatexMathDrawableBuild);
                            jLatexMathDrawable = jLatexMathDrawableBuild;
                        } catch (Throwable unused) {
                            lruCache2.put(strR, Boolean.TRUE);
                            jLatexMathDrawable = null;
                        }
                    }
                }
                if (jLatexMathDrawable != null) {
                    if (z2 && z) {
                        if (length < editable.length()) {
                            c2 = '\n';
                            if (editable.charAt(length) != '\n') {
                                editable.insert(length, "\n");
                            }
                        } else {
                            c2 = '\n';
                        }
                        if (i4 > 0 && editable.charAt(i4 - 1) != c2) {
                            editable.insert(i4, "\n");
                            i4++;
                            length++;
                        }
                    }
                    if (z2 && z) {
                        z3 = true;
                    }
                    hb2 hb2Var = new hb2(jLatexMathDrawable, z3, i2);
                    editable.setSpan(hb2Var, i4, length, 33);
                    if (hb2Var.b() * hb2Var.c.getIntrinsicWidth() > hb2Var.h + 0.5f) {
                        editable.setSpan(new ib2(lb2Var, f, i), i4, length, 33);
                    }
                }
                i3 = 1;
            }
        }
    }
}
