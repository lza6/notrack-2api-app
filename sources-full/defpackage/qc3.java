package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.text.Typography;
import okio.Options$Companion;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qc3 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ rc3 d;

    public /* synthetic */ qc3(rc3 rc3Var, int i) {
        this.c = i;
        this.d = rc3Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        rc3 rc3Var = this.d;
        wc0 wc0Var = (wc0) obj;
        switch (i) {
            case 0:
                wc0Var.getClass();
                wc0.a(wc0Var, TeXSymbolParser.TYPE_ATTR, lo3.b);
                wc0.a(wc0Var, "value", gm4.i("kotlinx.serialization.Sealed<" + Options$Companion.getClassSimpleName(rc3Var.a.c) + Typography.greater, xf3.n, new tf3[0], new qc3(rc3Var, 1)));
                List list = rc3Var.b;
                list.getClass();
                wc0Var.b = list;
                break;
            default:
                wc0Var.getClass();
                for (Map.Entry entry : rc3Var.e.entrySet()) {
                    wc0.a(wc0Var, (String) entry.getKey(), ((qu1) entry.getValue()).getDescriptor());
                }
                break;
        }
        return w84Var;
    }
}
