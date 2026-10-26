package androidx.compose.ui.platform;

import defpackage.fq2;
import defpackage.g53;
import defpackage.ms0;
import defpackage.ok0;
import defpackage.ud2;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class DeviceRenderNodeData {
    public static final int $stable = 8;
    private float alpha;
    private int ambientShadowColor;
    private final int bottom;
    private float cameraDistance;
    private boolean clipToBounds;
    private boolean clipToOutline;
    private int compositingStrategy;
    private float elevation;
    private final int height;
    private final int left;
    private float pivotX;
    private float pivotY;
    private g53 renderEffect;
    private final int right;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private int spotShadowColor;
    private final int top;
    private float translationX;
    private float translationY;
    private final long uniqueId;
    private final int width;

    private DeviceRenderNodeData(long j, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, float f4, float f5, int i7, int i8, float f6, float f7, float f8, float f9, float f10, float f11, boolean z, boolean z2, float f12, g53 g53Var, int i9) {
        this.uniqueId = j;
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
        this.width = i5;
        this.height = i6;
        this.scaleX = f;
        this.scaleY = f2;
        this.translationX = f3;
        this.translationY = f4;
        this.elevation = f5;
        this.ambientShadowColor = i7;
        this.spotShadowColor = i8;
        this.rotationZ = f6;
        this.rotationX = f7;
        this.rotationY = f8;
        this.cameraDistance = f9;
        this.pivotX = f10;
        this.pivotY = f11;
        this.clipToOutline = z;
        this.clipToBounds = z2;
        this.alpha = f12;
        this.compositingStrategy = i9;
    }

    public /* synthetic */ DeviceRenderNodeData(long j, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, float f4, float f5, int i7, int i8, float f6, float f7, float f8, float f9, float f10, float f11, boolean z, boolean z2, float f12, g53 g53Var, int i9, ms0 ms0Var) {
        this(j, i, i2, i3, i4, i5, i6, f, f2, f3, f4, f5, i7, i8, f6, f7, f8, f9, f10, f11, z, z2, f12, g53Var, i9);
    }

    /* JADX INFO: renamed from: copy-fuCbV5c$default, reason: not valid java name */
    public static /* synthetic */ DeviceRenderNodeData m66xd38a2e9b(DeviceRenderNodeData deviceRenderNodeData, long j, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, float f4, float f5, int i7, int i8, float f6, float f7, float f8, float f9, float f10, float f11, boolean z, boolean z2, float f12, g53 g53Var, int i9, int i10, Object obj) {
        g53 g53Var2;
        int i11;
        float f13;
        long j2 = (i10 & 1) != 0 ? deviceRenderNodeData.uniqueId : j;
        int i12 = (i10 & 2) != 0 ? deviceRenderNodeData.left : i;
        int i13 = (i10 & 4) != 0 ? deviceRenderNodeData.top : i2;
        int i14 = (i10 & 8) != 0 ? deviceRenderNodeData.right : i3;
        int i15 = (i10 & 16) != 0 ? deviceRenderNodeData.bottom : i4;
        int i16 = (i10 & 32) != 0 ? deviceRenderNodeData.width : i5;
        int i17 = (i10 & 64) != 0 ? deviceRenderNodeData.height : i6;
        float f14 = (i10 & Uuid.SIZE_BITS) != 0 ? deviceRenderNodeData.scaleX : f;
        float f15 = (i10 & FontInfo.NUMBER_OF_CHAR_CODES) != 0 ? deviceRenderNodeData.scaleY : f2;
        float f16 = (i10 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? deviceRenderNodeData.translationX : f3;
        float f17 = (i10 & 1024) != 0 ? deviceRenderNodeData.translationY : f4;
        float f18 = (i10 & 2048) != 0 ? deviceRenderNodeData.elevation : f5;
        int i18 = (i10 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? deviceRenderNodeData.ambientShadowColor : i7;
        long j3 = j2;
        int i19 = (i10 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? deviceRenderNodeData.spotShadowColor : i8;
        float f19 = (i10 & 16384) != 0 ? deviceRenderNodeData.rotationZ : f6;
        float f20 = (i10 & 32768) != 0 ? deviceRenderNodeData.rotationX : f7;
        float f21 = (i10 & 65536) != 0 ? deviceRenderNodeData.rotationY : f8;
        float f22 = (i10 & 131072) != 0 ? deviceRenderNodeData.cameraDistance : f9;
        float f23 = (i10 & 262144) != 0 ? deviceRenderNodeData.pivotX : f10;
        float f24 = (i10 & 524288) != 0 ? deviceRenderNodeData.pivotY : f11;
        boolean z3 = (i10 & 1048576) != 0 ? deviceRenderNodeData.clipToOutline : z;
        boolean z4 = (i10 & 2097152) != 0 ? deviceRenderNodeData.clipToBounds : z2;
        float f25 = (i10 & 4194304) != 0 ? deviceRenderNodeData.alpha : f12;
        if ((i10 & 8388608) != 0) {
            deviceRenderNodeData.getClass();
            g53Var2 = null;
        } else {
            g53Var2 = g53Var;
        }
        if ((i10 & 16777216) != 0) {
            f13 = f25;
            i11 = deviceRenderNodeData.compositingStrategy;
        } else {
            i11 = i9;
            f13 = f25;
        }
        return deviceRenderNodeData.m68x9f2be6fe(j3, i12, i13, i14, i15, i16, i17, f14, f15, f16, f17, f18, i18, i19, f19, f20, f21, f22, f23, f24, z3, z4, f13, g53Var2, i11);
    }

    public final long component1() {
        return this.uniqueId;
    }

    public final float component10() {
        return this.translationX;
    }

    public final float component11() {
        return this.translationY;
    }

    public final float component12() {
        return this.elevation;
    }

    public final int component13() {
        return this.ambientShadowColor;
    }

    public final int component14() {
        return this.spotShadowColor;
    }

    public final float component15() {
        return this.rotationZ;
    }

    public final float component16() {
        return this.rotationX;
    }

    public final float component17() {
        return this.rotationY;
    }

    public final float component18() {
        return this.cameraDistance;
    }

    public final float component19() {
        return this.pivotX;
    }

    public final int component2() {
        return this.left;
    }

    public final float component20() {
        return this.pivotY;
    }

    public final boolean component21() {
        return this.clipToOutline;
    }

    public final boolean component22() {
        return this.clipToBounds;
    }

    public final float component23() {
        return this.alpha;
    }

    public final g53 component24() {
        return null;
    }

    /* JADX INFO: renamed from: component25--NrFUSI, reason: not valid java name */
    public final int m67x3272b8e9() {
        return this.compositingStrategy;
    }

    public final int component3() {
        return this.top;
    }

    public final int component4() {
        return this.right;
    }

    public final int component5() {
        return this.bottom;
    }

    public final int component6() {
        return this.width;
    }

    public final int component7() {
        return this.height;
    }

    public final float component8() {
        return this.scaleX;
    }

    public final float component9() {
        return this.scaleY;
    }

    /* JADX INFO: renamed from: copy-fuCbV5c, reason: not valid java name */
    public final DeviceRenderNodeData m68x9f2be6fe(long j, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, float f4, float f5, int i7, int i8, float f6, float f7, float f8, float f9, float f10, float f11, boolean z, boolean z2, float f12, g53 g53Var, int i9) {
        return new DeviceRenderNodeData(j, i, i2, i3, i4, i5, i6, f, f2, f3, f4, f5, i7, i8, f6, f7, f8, f9, f10, f11, z, z2, f12, g53Var, i9, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceRenderNodeData)) {
            return false;
        }
        DeviceRenderNodeData deviceRenderNodeData = (DeviceRenderNodeData) obj;
        return this.uniqueId == deviceRenderNodeData.uniqueId && this.left == deviceRenderNodeData.left && this.top == deviceRenderNodeData.top && this.right == deviceRenderNodeData.right && this.bottom == deviceRenderNodeData.bottom && this.width == deviceRenderNodeData.width && this.height == deviceRenderNodeData.height && Float.compare(this.scaleX, deviceRenderNodeData.scaleX) == 0 && Float.compare(this.scaleY, deviceRenderNodeData.scaleY) == 0 && Float.compare(this.translationX, deviceRenderNodeData.translationX) == 0 && Float.compare(this.translationY, deviceRenderNodeData.translationY) == 0 && Float.compare(this.elevation, deviceRenderNodeData.elevation) == 0 && this.ambientShadowColor == deviceRenderNodeData.ambientShadowColor && this.spotShadowColor == deviceRenderNodeData.spotShadowColor && Float.compare(this.rotationZ, deviceRenderNodeData.rotationZ) == 0 && Float.compare(this.rotationX, deviceRenderNodeData.rotationX) == 0 && Float.compare(this.rotationY, deviceRenderNodeData.rotationY) == 0 && Float.compare(this.cameraDistance, deviceRenderNodeData.cameraDistance) == 0 && Float.compare(this.pivotX, deviceRenderNodeData.pivotX) == 0 && Float.compare(this.pivotY, deviceRenderNodeData.pivotY) == 0 && this.clipToOutline == deviceRenderNodeData.clipToOutline && this.clipToBounds == deviceRenderNodeData.clipToBounds && Float.compare(this.alpha, deviceRenderNodeData.alpha) == 0 && this.compositingStrategy == deviceRenderNodeData.compositingStrategy;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final int getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final boolean getClipToBounds() {
        return this.clipToBounds;
    }

    public final boolean getClipToOutline() {
        return this.clipToOutline;
    }

    /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m69x884499ca() {
        return this.compositingStrategy;
    }

    public final float getElevation() {
        return this.elevation;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getLeft() {
        return this.left;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final g53 getRenderEffect() {
        return null;
    }

    public final int getRight() {
        return this.right;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final int getSpotShadowColor() {
        return this.spotShadowColor;
    }

    public final int getTop() {
        return this.top;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final long getUniqueId() {
        return this.uniqueId;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.compositingStrategy) + fq2.d(this.alpha, ud2.k(ud2.k(fq2.d(this.pivotY, fq2.d(this.pivotX, fq2.d(this.cameraDistance, fq2.d(this.rotationY, fq2.d(this.rotationX, fq2.d(this.rotationZ, fq2.e(this.spotShadowColor, fq2.e(this.ambientShadowColor, fq2.d(this.elevation, fq2.d(this.translationY, fq2.d(this.translationX, fq2.d(this.scaleY, fq2.d(this.scaleX, fq2.e(this.height, fq2.e(this.width, fq2.e(this.bottom, fq2.e(this.right, fq2.e(this.top, fq2.e(this.left, Long.hashCode(this.uniqueId) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.clipToOutline), 31, this.clipToBounds), 961);
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public final void setAmbientShadowColor(int i) {
        this.ambientShadowColor = i;
    }

    public final void setCameraDistance(float f) {
        this.cameraDistance = f;
    }

    public final void setClipToBounds(boolean z) {
        this.clipToBounds = z;
    }

    public final void setClipToOutline(boolean z) {
        this.clipToOutline = z;
    }

    /* JADX INFO: renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    public final void m70x3b703444(int i) {
        this.compositingStrategy = i;
    }

    public final void setElevation(float f) {
        this.elevation = f;
    }

    public final void setPivotX(float f) {
        this.pivotX = f;
    }

    public final void setPivotY(float f) {
        this.pivotY = f;
    }

    public final void setRenderEffect(g53 g53Var) {
    }

    public final void setRotationX(float f) {
        this.rotationX = f;
    }

    public final void setRotationY(float f) {
        this.rotationY = f;
    }

    public final void setRotationZ(float f) {
        this.rotationZ = f;
    }

    public final void setScaleX(float f) {
        this.scaleX = f;
    }

    public final void setScaleY(float f) {
        this.scaleY = f;
    }

    public final void setSpotShadowColor(int i) {
        this.spotShadowColor = i;
    }

    public final void setTranslationX(float f) {
        this.translationX = f;
    }

    public final void setTranslationY(float f) {
        this.translationY = f;
    }

    public String toString() {
        return "DeviceRenderNodeData(uniqueId=" + this.uniqueId + ", left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", width=" + this.width + ", height=" + this.height + ", scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", elevation=" + this.elevation + ", ambientShadowColor=" + this.ambientShadowColor + ", spotShadowColor=" + this.spotShadowColor + ", rotationZ=" + this.rotationZ + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", cameraDistance=" + this.cameraDistance + ", pivotX=" + this.pivotX + ", pivotY=" + this.pivotY + ", clipToOutline=" + this.clipToOutline + ", clipToBounds=" + this.clipToBounds + ", alpha=" + this.alpha + ", renderEffect=null, compositingStrategy=" + ((Object) ok0.a(this.compositingStrategy)) + ')';
    }
}
