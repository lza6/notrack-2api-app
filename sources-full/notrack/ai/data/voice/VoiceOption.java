package notrack.ai.data.voice;

import app.template.extension.BuildConfig;
import defpackage.do3;
import defpackage.fq2;
import defpackage.gm4;
import defpackage.kr1;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.ud2;

/* JADX INFO: loaded from: classes.dex */
public final class VoiceOption {
    public static final Companion Companion = new Companion();
    private final int hz;
    private final String label;
    private final String name;
    private final int order;
    private final String sex;
    private final boolean show;

    public final class Companion {
        public final qu1 serializer() {
            return VoiceOption$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VoiceOption(int i, String str, String str2, String str3, int i2, int i3, boolean z) {
        if (3 != (i & 3)) {
            gm4.P(i, 3, VoiceOption$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.name = str;
        this.label = str2;
        if ((i & 4) == 0) {
            this.sex = BuildConfig.VERSION_NAME;
        } else {
            this.sex = str3;
        }
        if ((i & 8) == 0) {
            this.hz = 0;
        } else {
            this.hz = i2;
        }
        if ((i & 16) == 0) {
            this.order = 0;
        } else {
            this.order = i3;
        }
        if ((i & 32) == 0) {
            this.show = true;
        } else {
            this.show = z;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(VoiceOption voiceOption, do3 do3Var, tf3 tf3Var) {
        String str = voiceOption.name;
        boolean z = voiceOption.show;
        int i = voiceOption.order;
        int i2 = voiceOption.hz;
        String str2 = voiceOption.sex;
        do3Var.u(tf3Var, 0, str);
        do3Var.u(tf3Var, 1, voiceOption.label);
        if (do3Var.w(tf3Var) || !kr1.n(str2, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 2, str2);
        }
        if (do3Var.w(tf3Var) || i2 != 0) {
            do3Var.l(3, i2, tf3Var);
        }
        if (do3Var.w(tf3Var) || i != 0) {
            do3Var.l(4, i, tf3Var);
        }
        if (!do3Var.w(tf3Var) && z) {
            return;
        }
        do3Var.c(tf3Var, 5, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceOption)) {
            return false;
        }
        VoiceOption voiceOption = (VoiceOption) obj;
        return kr1.n(this.name, voiceOption.name) && kr1.n(this.label, voiceOption.label) && kr1.n(this.sex, voiceOption.sex) && this.hz == voiceOption.hz && this.order == voiceOption.order && this.show == voiceOption.show;
    }

    public final int getHz() {
        return this.hz;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getName() {
        return this.name;
    }

    public final int getOrder() {
        return this.order;
    }

    public final String getSex() {
        return this.sex;
    }

    public final boolean getShow() {
        return this.show;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.show) + fq2.e(this.order, fq2.e(this.hz, ud2.i(ud2.i(this.name.hashCode() * 31, 31, this.label), 31, this.sex), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = fq2.t("VoiceOption(name=", this.name, ", label=", this.label, ", sex=");
        sbT.append(this.sex);
        sbT.append(", hz=");
        sbT.append(this.hz);
        sbT.append(", order=");
        sbT.append(this.order);
        sbT.append(", show=");
        sbT.append(this.show);
        sbT.append(")");
        return sbT.toString();
    }
}
