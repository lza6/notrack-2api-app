package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import defpackage.em3;
import defpackage.gc1;
import defpackage.gm4;
import defpackage.hc1;
import defpackage.ic1;
import defpackage.iy3;
import defpackage.kr1;
import defpackage.pg3;
import defpackage.re0;
import defpackage.tt3;
import defpackage.yz3;
import defpackage.zr;
import defpackage.zz3;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DecodeHelper {
    public static final int $stable = 8;
    private final Parcel parcel;

    public DecodeHelper(String str) {
        Parcel parcelObtain = Parcel.obtain();
        this.parcel = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    private final int dataAvailable() {
        return this.parcel.dataAvail();
    }

    /* JADX INFO: renamed from: decodeBaselineShift-y9eOQZs, reason: not valid java name */
    private final float m57x7f1d95e2() {
        return decodeFloat();
    }

    private final byte decodeByte() {
        return this.parcel.readByte();
    }

    private final float decodeFloat() {
        return this.parcel.readFloat();
    }

    private final int decodeInt() {
        return this.parcel.readInt();
    }

    private final pg3 decodeShadow() {
        long jM59x7af8cd42 = m59x7af8cd42();
        float fDecodeFloat = decodeFloat();
        return new pg3(jM59x7af8cd42, (((long) Float.floatToRawIntBits(decodeFloat())) & 4294967295L) | (Float.floatToRawIntBits(fDecodeFloat) << 32), decodeFloat());
    }

    private final String decodeString() {
        return this.parcel.readString();
    }

    private final tt3 decodeTextDecoration() {
        int iDecodeInt = decodeInt();
        boolean z = (iDecodeInt & 2) != 0;
        boolean z2 = (iDecodeInt & 1) != 0;
        tt3 tt3Var = tt3.d;
        tt3 tt3Var2 = tt3.c;
        if (!z || !z2) {
            if (z) {
                return tt3Var;
            }
            return z2 ? tt3Var2 : tt3.b;
        }
        List listU = kr1.U(tt3Var, tt3Var2);
        Integer numValueOf = 0;
        int size = listU.size();
        for (int i = 0; i < size; i++) {
            numValueOf = Integer.valueOf(numValueOf.intValue() | ((tt3) listU.get(i)).a);
        }
        return new tt3(numValueOf.intValue());
    }

    private final iy3 decodeTextGeometricTransform() {
        return new iy3(decodeFloat(), decodeFloat());
    }

    /* JADX INFO: renamed from: decodeULong-s-VKNKU, reason: not valid java name */
    private final long m58x1a6c48ff() {
        return this.parcel.readLong();
    }

    /* JADX INFO: renamed from: decodeColor-0d7_KjU, reason: not valid java name */
    public final long m59x7af8cd42() {
        long jM58x1a6c48ff = m58x1a6c48ff();
        int i = re0.j;
        return jM58x1a6c48ff;
    }

    /* JADX INFO: renamed from: decodeFontStyle-_-LCdwA, reason: not valid java name */
    public final int m60x636a9d0() {
        byte bDecodeByte = decodeByte();
        return (bDecodeByte != 0 && bDecodeByte == 1) ? 1 : 0;
    }

    /* JADX INFO: renamed from: decodeFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m61xbff5b732() {
        byte bDecodeByte = decodeByte();
        if (bDecodeByte == 0) {
            return 0;
        }
        if (bDecodeByte == 1) {
            return 65535;
        }
        if (bDecodeByte == 3) {
            return 2;
        }
        return bDecodeByte == 2 ? 1 : 0;
    }

    public final ic1 decodeFontWeight() {
        return new ic1(decodeInt());
    }

    public final em3 decodeSpanStyle() {
        MutableSpanStyle mutableSpanStyle = new MutableSpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.parcel.dataAvail() > 1) {
            byte bDecodeByte = decodeByte();
            if (bDecodeByte != 1) {
                if (bDecodeByte != 2) {
                    if (bDecodeByte != 3) {
                        if (bDecodeByte != 4) {
                            if (bDecodeByte != 5) {
                                if (bDecodeByte != 6) {
                                    if (bDecodeByte != 7) {
                                        if (bDecodeByte != 8) {
                                            if (bDecodeByte != 9) {
                                                if (bDecodeByte != 10) {
                                                    if (bDecodeByte != 11) {
                                                        if (bDecodeByte == 12) {
                                                            if (dataAvailable() < 20) {
                                                                break;
                                                            }
                                                            mutableSpanStyle.setShadow(decodeShadow());
                                                        } else {
                                                            continue;
                                                        }
                                                    } else {
                                                        if (dataAvailable() < 4) {
                                                            break;
                                                        }
                                                        mutableSpanStyle.setTextDecoration(decodeTextDecoration());
                                                    }
                                                } else {
                                                    if (dataAvailable() < 8) {
                                                        break;
                                                    }
                                                    mutableSpanStyle.m104x1a8274c4(m59x7af8cd42());
                                                }
                                            } else {
                                                if (dataAvailable() < 8) {
                                                    break;
                                                }
                                                mutableSpanStyle.setTextGeometricTransform(decodeTextGeometricTransform());
                                            }
                                        } else {
                                            if (dataAvailable() < 4) {
                                                break;
                                            }
                                            mutableSpanStyle.m105x516aed27(new zr(m57x7f1d95e2()));
                                        }
                                    } else {
                                        if (dataAvailable() < 5) {
                                            break;
                                        }
                                        mutableSpanStyle.m110x33b52cfb(m62x38444e83());
                                    }
                                } else {
                                    mutableSpanStyle.setFontFeatureSettings(decodeString());
                                }
                            } else {
                                if (dataAvailable() < 1) {
                                    break;
                                }
                                mutableSpanStyle.m109xcd8b72c7(new hc1(m61xbff5b732()));
                            }
                        } else {
                            if (dataAvailable() < 1) {
                                break;
                            }
                            mutableSpanStyle.m108x24d5b983(new gc1(m60x636a9d0()));
                        }
                    } else {
                        if (dataAvailable() < 4) {
                            break;
                        }
                        mutableSpanStyle.setFontWeight(decodeFontWeight());
                    }
                } else {
                    if (dataAvailable() < 5) {
                        break;
                    }
                    mutableSpanStyle.m107xdb0c6172(m62x38444e83());
                }
            } else {
                if (dataAvailable() < 8) {
                    break;
                }
                mutableSpanStyle.m106x1ff088b5(m59x7af8cd42());
            }
        }
        return mutableSpanStyle.toSpanStyle();
    }

    /* JADX INFO: renamed from: decodeTextUnit-XSAIIZE, reason: not valid java name */
    public final long m62x38444e83() {
        long j;
        byte bDecodeByte = decodeByte();
        if (bDecodeByte == 1) {
            j = 4294967296L;
        } else {
            j = bDecodeByte == 2 ? 8589934592L : 0L;
        }
        return zz3.a(j, 0L) ? yz3.c : gm4.L(decodeFloat(), j);
    }
}
