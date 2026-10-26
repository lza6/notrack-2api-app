package notrack.ai.data.api;

import defpackage.cw;
import defpackage.do3;
import defpackage.fq2;
import defpackage.gm4;
import defpackage.kr1;
import defpackage.lo3;
import defpackage.oq1;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.ud2;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class UploadResponse {
    public static final Companion Companion = new Companion();
    private final long bytes;
    private final Boolean dedup;
    private final String error;
    private final ExtractionDto extraction;
    private final String fileId;
    private final String kind;
    private final String name;
    private final Integer pages;
    private final String preview;
    private final String status;

    public final class Companion {
        public final qu1 serializer() {
            return UploadResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UploadResponse(int i, String str, String str2, String str3, long j, Integer num, ExtractionDto extractionDto, String str4, String str5, String str6, Boolean bool) {
        if (7 != (i & 7)) {
            gm4.P(i, 7, UploadResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.fileId = str;
        this.name = str2;
        this.kind = str3;
        if ((i & 8) == 0) {
            this.bytes = 0L;
        } else {
            this.bytes = j;
        }
        if ((i & 16) == 0) {
            this.pages = null;
        } else {
            this.pages = num;
        }
        if ((i & 32) == 0) {
            this.extraction = null;
        } else {
            this.extraction = extractionDto;
        }
        if ((i & 64) == 0) {
            this.preview = null;
        } else {
            this.preview = str4;
        }
        if ((i & Uuid.SIZE_BITS) == 0) {
            this.status = "ready";
        } else {
            this.status = str5;
        }
        if ((i & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
            this.error = null;
        } else {
            this.error = str6;
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0) {
            this.dedup = null;
        } else {
            this.dedup = bool;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(UploadResponse uploadResponse, do3 do3Var, tf3 tf3Var) {
        String str = uploadResponse.fileId;
        Boolean bool = uploadResponse.dedup;
        String str2 = uploadResponse.error;
        String str3 = uploadResponse.status;
        String str4 = uploadResponse.preview;
        ExtractionDto extractionDto = uploadResponse.extraction;
        Integer num = uploadResponse.pages;
        long j = uploadResponse.bytes;
        do3Var.u(tf3Var, 0, str);
        do3Var.u(tf3Var, 1, uploadResponse.name);
        do3Var.u(tf3Var, 2, uploadResponse.kind);
        if (do3Var.w(tf3Var) || j != 0) {
            do3Var.n(tf3Var, 3, j);
        }
        if (do3Var.w(tf3Var) || num != null) {
            do3Var.p(tf3Var, 4, oq1.a, num);
        }
        if (do3Var.w(tf3Var) || extractionDto != null) {
            do3Var.p(tf3Var, 5, ExtractionDto$$serializer.INSTANCE, extractionDto);
        }
        if (do3Var.w(tf3Var) || str4 != null) {
            do3Var.p(tf3Var, 6, lo3.a, str4);
        }
        if (do3Var.w(tf3Var) || !kr1.n(str3, "ready")) {
            do3Var.u(tf3Var, 7, str3);
        }
        if (do3Var.w(tf3Var) || str2 != null) {
            do3Var.p(tf3Var, 8, lo3.a, str2);
        }
        if (!do3Var.w(tf3Var) && bool == null) {
            return;
        }
        do3Var.p(tf3Var, 9, cw.a, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadResponse)) {
            return false;
        }
        UploadResponse uploadResponse = (UploadResponse) obj;
        return kr1.n(this.fileId, uploadResponse.fileId) && kr1.n(this.name, uploadResponse.name) && kr1.n(this.kind, uploadResponse.kind) && this.bytes == uploadResponse.bytes && kr1.n(this.pages, uploadResponse.pages) && kr1.n(this.extraction, uploadResponse.extraction) && kr1.n(this.preview, uploadResponse.preview) && kr1.n(this.status, uploadResponse.status) && kr1.n(this.error, uploadResponse.error) && kr1.n(this.dedup, uploadResponse.dedup);
    }

    public final long getBytes() {
        return this.bytes;
    }

    public final ExtractionDto getExtraction() {
        return this.extraction;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        int iH = ud2.h(ud2.i(ud2.i(this.fileId.hashCode() * 31, 31, this.name), 31, this.kind), 31, this.bytes);
        Integer num = this.pages;
        int iHashCode = (iH + (num == null ? 0 : num.hashCode())) * 31;
        ExtractionDto extractionDto = this.extraction;
        int iHashCode2 = (iHashCode + (extractionDto == null ? 0 : extractionDto.hashCode())) * 31;
        String str = this.preview;
        int i = ud2.i((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.status);
        String str2 = this.error;
        int iHashCode3 = (i + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.dedup;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = fq2.t("UploadResponse(fileId=", this.fileId, ", name=", this.name, ", kind=");
        sbT.append(this.kind);
        sbT.append(", bytes=");
        sbT.append(this.bytes);
        sbT.append(", pages=");
        sbT.append(this.pages);
        sbT.append(", extraction=");
        sbT.append(this.extraction);
        ud2.v(sbT, ", preview=", this.preview, ", status=", this.status);
        sbT.append(", error=");
        sbT.append(this.error);
        sbT.append(", dedup=");
        sbT.append(this.dedup);
        sbT.append(")");
        return sbT.toString();
    }
}
