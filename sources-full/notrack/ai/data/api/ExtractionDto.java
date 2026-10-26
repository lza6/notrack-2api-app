package notrack.ai.data.api;

import defpackage.cw;
import defpackage.do3;
import defpackage.kr1;
import defpackage.lg;
import defpackage.lo3;
import defpackage.ly1;
import defpackage.oq1;
import defpackage.q22;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.yo4;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ExtractionDto {
    private final Integer chars;
    private final List<String> langs;
    private final String method;
    private final Boolean ocrUsed;
    private final Integer tokenEstimate;
    private final Boolean truncated;
    public static final Companion Companion = new Companion();
    private static final ly1[] $childSerializers = {null, null, null, null, null, yo4.H(q22.c, new lg(21))};

    public final class Companion {
        public final qu1 serializer() {
            return ExtractionDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ExtractionDto(int i, String str, Integer num, Integer num2, Boolean bool, Boolean bool2, List list) {
        if ((i & 1) == 0) {
            this.method = null;
        } else {
            this.method = str;
        }
        if ((i & 2) == 0) {
            this.chars = null;
        } else {
            this.chars = num;
        }
        if ((i & 4) == 0) {
            this.tokenEstimate = null;
        } else {
            this.tokenEstimate = num2;
        }
        if ((i & 8) == 0) {
            this.truncated = null;
        } else {
            this.truncated = bool;
        }
        if ((i & 16) == 0) {
            this.ocrUsed = null;
        } else {
            this.ocrUsed = bool2;
        }
        if ((i & 32) == 0) {
            this.langs = null;
        } else {
            this.langs = list;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(ExtractionDto extractionDto, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || extractionDto.method != null) {
            do3Var.p(tf3Var, 0, lo3.a, extractionDto.method);
        }
        if (do3Var.w(tf3Var) || extractionDto.chars != null) {
            do3Var.p(tf3Var, 1, oq1.a, extractionDto.chars);
        }
        if (do3Var.w(tf3Var) || extractionDto.tokenEstimate != null) {
            do3Var.p(tf3Var, 2, oq1.a, extractionDto.tokenEstimate);
        }
        if (do3Var.w(tf3Var) || extractionDto.truncated != null) {
            do3Var.p(tf3Var, 3, cw.a, extractionDto.truncated);
        }
        if (do3Var.w(tf3Var) || extractionDto.ocrUsed != null) {
            do3Var.p(tf3Var, 4, cw.a, extractionDto.ocrUsed);
        }
        if (!do3Var.w(tf3Var) && extractionDto.langs == null) {
            return;
        }
        do3Var.p(tf3Var, 5, (qu1) $childSerializers[5].getValue(), extractionDto.langs);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtractionDto)) {
            return false;
        }
        ExtractionDto extractionDto = (ExtractionDto) obj;
        return kr1.n(this.method, extractionDto.method) && kr1.n(this.chars, extractionDto.chars) && kr1.n(this.tokenEstimate, extractionDto.tokenEstimate) && kr1.n(this.truncated, extractionDto.truncated) && kr1.n(this.ocrUsed, extractionDto.ocrUsed) && kr1.n(this.langs, extractionDto.langs);
    }

    public final Boolean getTruncated() {
        return this.truncated;
    }

    public final int hashCode() {
        String str = this.method;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.chars;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.tokenEstimate;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.truncated;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.ocrUsed;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<String> list = this.langs;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ExtractionDto(method=" + this.method + ", chars=" + this.chars + ", tokenEstimate=" + this.tokenEstimate + ", truncated=" + this.truncated + ", ocrUsed=" + this.ocrUsed + ", langs=" + this.langs + ")";
    }
}
