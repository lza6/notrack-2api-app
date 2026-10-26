package defpackage;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class bf implements ImageDecoder$OnHeaderDecodedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l43 b;
    public final /* synthetic */ is0 c;

    public /* synthetic */ bf(is0 is0Var, l43 l43Var, int i) {
        this.a = i;
        this.c = is0Var;
        this.b = l43Var;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        int i = this.a;
        wx2 wx2Var = wx2.c;
        l43 l43Var = this.b;
        is0 is0Var = this.c;
        switch (i) {
            case 0:
                Size size = imageInfo.getSize();
                int width = size.getWidth();
                int height = size.getHeight();
                jq2 jq2Var = ((ef) is0Var).b;
                long jF = av1.f(width, height, jq2Var.b, jq2Var.c, (ai3) y64.A(jq2Var, rm1.b));
                int i2 = (int) (jF >> 32);
                int i3 = (int) (jF & 4294967295L);
                if (width > 0 && height > 0 && (width != i2 || height != i3)) {
                    double dG = av1.g(width, height, i2, i3, ((ef) is0Var).b.c);
                    boolean z = dG < 1.0d;
                    l43Var.c = z;
                    if (z || ((ef) is0Var).b.d == wx2Var) {
                        imageDecoder.setTargetSize(gb2.Q(((double) width) * dG), gb2.Q(dG * ((double) height)));
                    }
                }
                jq2 jq2Var2 = ((ef) is0Var).b;
                imageDecoder.setAllocator(yh4.I(sm1.a(jq2Var2)) ? 3 : 1);
                imageDecoder.setMemorySizePolicy(!((Boolean) y64.A(jq2Var2, sm1.g)).booleanValue() ? 1 : 0);
                f61 f61Var = sm1.c;
                if (ap.f(y64.A(jq2Var2, f61Var)) != null) {
                    imageDecoder.setTargetColorSpace(ap.f(y64.A(jq2Var2, f61Var)));
                }
                if (y64.A(jq2Var2, yo4.j) != null) {
                    m51.t();
                } else {
                    imageDecoder.setPostProcessor(null);
                }
                break;
            default:
                Size size2 = imageInfo.getSize();
                int width2 = size2.getWidth();
                int height2 = size2.getHeight();
                jq2 jq2Var3 = ((ev) is0Var).b;
                long jF2 = av1.f(width2, height2, jq2Var3.b, jq2Var3.c, (ai3) y64.A(jq2Var3, rm1.b));
                int i4 = (int) (jF2 >> 32);
                int i5 = (int) (jF2 & 4294967295L);
                if (width2 > 0 && height2 > 0 && (width2 != i4 || height2 != i5)) {
                    double dG2 = av1.g(width2, height2, i4, i5, ((ev) is0Var).b.c);
                    boolean z2 = dG2 < 1.0d;
                    l43Var.c = z2;
                    if (z2 || ((ev) is0Var).b.d == wx2Var) {
                        imageDecoder.setTargetSize(gb2.Q(((double) width2) * dG2), gb2.Q(dG2 * ((double) height2)));
                    }
                }
                imageDecoder.setOnPartialImageListener(new qn3());
                jq2 jq2Var4 = ((ev) is0Var).b;
                imageDecoder.setAllocator(yh4.I(sm1.a(jq2Var4)) ? 3 : 1);
                imageDecoder.setMemorySizePolicy(!((Boolean) y64.A(jq2Var4, sm1.g)).booleanValue() ? 1 : 0);
                f61 f61Var2 = sm1.c;
                if (ap.f(y64.A(jq2Var4, f61Var2)) != null) {
                    imageDecoder.setTargetColorSpace(ap.f(y64.A(jq2Var4, f61Var2)));
                }
                imageDecoder.setUnpremultipliedRequired(!((Boolean) y64.A(jq2Var4, sm1.d)).booleanValue());
                break;
        }
    }
}
