package androidx.compose.ui.platform;

import android.view.RenderNode;

/* JADX INFO: loaded from: classes.dex */
final class RenderNodeVerificationHelper28 {
    public static final RenderNodeVerificationHelper28 INSTANCE = new RenderNodeVerificationHelper28();

    private RenderNodeVerificationHelper28() {
    }

    public final int getAmbientShadowColor(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public final int getSpotShadowColor(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public final void setAmbientShadowColor(RenderNode renderNode, int i) {
        renderNode.setAmbientShadowColor(i);
    }

    public final void setSpotShadowColor(RenderNode renderNode, int i) {
        renderNode.setSpotShadowColor(i);
    }
}
