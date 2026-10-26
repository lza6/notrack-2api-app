package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class he4 {
    public final byte[] a;
    public final String b;
    public final int c;
    public final int d;
    public final double e;
    public final List f;
    public final String g;
    public final int h;
    public final String i;
    public final String j;
    public final int k;
    public final int l;

    public he4(byte[] bArr, String str, int i, int i2, double d, List list, String str2, int i3, String str3, String str4, int i4, int i5) {
        this.a = bArr;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = d;
        this.f = list;
        this.g = str2;
        this.h = i3;
        this.i = str3;
        this.j = str4;
        this.k = i4;
        this.l = i5;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        StringBuilder sbT = fq2.t("VoiceChunk(audio=", Arrays.toString(this.a), ", token=", this.b, ", chunkIndex=");
        sbT.append(this.c);
        sbT.append(", chunkCount=");
        sbT.append(this.d);
        sbT.append(", seconds=");
        sbT.append(this.e);
        sbT.append(", plan=");
        sbT.append(this.f);
        sbT.append(", text=");
        sbT.append(this.g);
        sbT.append(", answerIndex=");
        sbT.append(this.h);
        ud2.v(sbT, ", voiceName=", this.i, ", voiceSource=", this.j);
        sbT.append(", left=");
        sbT.append(this.k);
        sbT.append(", limit=");
        sbT.append(this.l);
        sbT.append(")");
        return sbT.toString();
    }
}
