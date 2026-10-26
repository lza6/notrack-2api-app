package notrack.ai.data.api;

import defpackage.cv0;
import defpackage.cw;
import defpackage.do3;
import defpackage.ff1;
import defpackage.hs0;
import defpackage.lo3;
import defpackage.ly1;
import defpackage.nk0;
import defpackage.oq1;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.u41;
import defpackage.vl0;
import defpackage.xw2;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@cv0
public final /* synthetic */ class ExtractionDto$$serializer implements ff1 {
    public static final ExtractionDto$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        ExtractionDto$$serializer extractionDto$$serializer = new ExtractionDto$$serializer();
        INSTANCE = extractionDto$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.api.ExtractionDto", extractionDto$$serializer, 6);
        xw2Var.k("method", true);
        xw2Var.k("chars", true);
        xw2Var.k("token_estimate", true);
        xw2Var.k("truncated", true);
        xw2Var.k("ocr_used", true);
        xw2Var.k("langs", true);
        descriptor = xw2Var;
    }

    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        ly1[] ly1VarArr = ExtractionDto.$childSerializers;
        qu1 qu1VarQ = vl0.Q(lo3.a);
        oq1 oq1Var = oq1.a;
        qu1 qu1VarQ2 = vl0.Q(oq1Var);
        qu1 qu1VarQ3 = vl0.Q(oq1Var);
        cw cwVar = cw.a;
        return new qu1[]{qu1VarQ, qu1VarQ2, qu1VarQ3, vl0.Q(cwVar), vl0.Q(cwVar), vl0.Q((qu1) ly1VarArr[5].getValue())};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        ly1[] ly1VarArr = ExtractionDto.$childSerializers;
        boolean z = true;
        int i = 0;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        List list = null;
        while (z) {
            int iH = nk0VarB.h(tf3Var);
            switch (iH) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) nk0VarB.g(tf3Var, 0, lo3.a, str);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) nk0VarB.g(tf3Var, 1, oq1.a, num);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) nk0VarB.g(tf3Var, 2, oq1.a, num2);
                    i |= 4;
                    break;
                case 3:
                    bool = (Boolean) nk0VarB.g(tf3Var, 3, cw.a, bool);
                    i |= 8;
                    break;
                case 4:
                    bool2 = (Boolean) nk0VarB.g(tf3Var, 4, cw.a, bool2);
                    i |= 16;
                    break;
                case 5:
                    list = (List) nk0VarB.g(tf3Var, 5, (qu1) ly1VarArr[5].getValue(), list);
                    i |= 32;
                    break;
                default:
                    u41.f(iH);
                    return null;
            }
        }
        nk0VarB.q(tf3Var);
        return new ExtractionDto(i, str, num, num2, bool, bool2, list);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        ExtractionDto extractionDto = (ExtractionDto) obj;
        extractionDto.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        ExtractionDto.write$Self$app_playRelease(extractionDto, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
