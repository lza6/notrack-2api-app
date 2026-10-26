package notrack.ai.data.api;

import app.template.extension.BuildConfig;
import defpackage.do3;
import defpackage.fq2;
import defpackage.kr1;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.ud2;

/* JADX INFO: loaded from: classes.dex */
public final class CarryDto {
    public static final Companion Companion = new Companion();
    private final String fromId;
    private final String fromTitle;
    private final String text;

    public final class Companion {
        public final qu1 serializer() {
            return CarryDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CarryDto(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.text = BuildConfig.VERSION_NAME;
        } else {
            this.text = str;
        }
        if ((i & 2) == 0) {
            this.fromId = BuildConfig.VERSION_NAME;
        } else {
            this.fromId = str2;
        }
        if ((i & 4) == 0) {
            this.fromTitle = BuildConfig.VERSION_NAME;
        } else {
            this.fromTitle = str3;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(CarryDto carryDto, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || !kr1.n(carryDto.text, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 0, carryDto.text);
        }
        if (do3Var.w(tf3Var) || !kr1.n(carryDto.fromId, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 1, carryDto.fromId);
        }
        if (!do3Var.w(tf3Var) && kr1.n(carryDto.fromTitle, BuildConfig.VERSION_NAME)) {
            return;
        }
        do3Var.u(tf3Var, 2, carryDto.fromTitle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarryDto)) {
            return false;
        }
        CarryDto carryDto = (CarryDto) obj;
        return kr1.n(this.text, carryDto.text) && kr1.n(this.fromId, carryDto.fromId) && kr1.n(this.fromTitle, carryDto.fromTitle);
    }

    public final String getFromId() {
        return this.fromId;
    }

    public final String getFromTitle() {
        return this.fromTitle;
    }

    public final String getText() {
        return this.text;
    }

    public final int hashCode() {
        return this.fromTitle.hashCode() + ud2.i(this.text.hashCode() * 31, 31, this.fromId);
    }

    public final String toString() {
        return fq2.r(fq2.t("CarryDto(text=", this.text, ", fromId=", this.fromId, ", fromTitle="), this.fromTitle, ")");
    }
}
