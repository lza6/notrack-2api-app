package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p3 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public static void a(if1 if1Var, Parcel parcel, int i) {
        int iE0 = py.e0(parcel, 20293);
        int i2 = if1Var.c;
        py.d0(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = if1Var.d;
        py.d0(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = if1Var.h;
        py.d0(parcel, 3, 4);
        parcel.writeInt(i4);
        py.a0(parcel, 4, if1Var.l);
        IBinder iBinder = if1Var.m;
        if (iBinder != null) {
            int iE1 = py.e0(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            py.f0(parcel, iE1);
        }
        py.b0(parcel, 6, if1Var.n, i);
        Bundle bundle = if1Var.o;
        if (bundle != null) {
            int iE2 = py.e0(parcel, 7);
            parcel.writeBundle(bundle);
            py.f0(parcel, iE2);
        }
        py.Z(parcel, 8, if1Var.p, i);
        py.b0(parcel, 10, if1Var.q, i);
        py.b0(parcel, 11, if1Var.r, i);
        boolean z = if1Var.s;
        py.d0(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = if1Var.t;
        py.d0(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = if1Var.u;
        py.d0(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        py.a0(parcel, 15, if1Var.v);
        py.f0(parcel, iE0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iQ = 0;
        String strS = null;
        String strS2 = null;
        Account account = null;
        ml0 ml0Var = null;
        Intent intent = null;
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new q3(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 1:
                xj xjVar = new xj(parcel);
                xjVar.c = parcel.readByte() != 0;
                return xjVar;
            case 2:
                return new fr(parcel);
            case 3:
                return new gr(parcel);
            case 4:
                return new ct0(parcel.readInt());
            case 5:
                jd1 jd1Var = new jd1();
                jd1Var.c = parcel.readString();
                jd1Var.d = parcel.readInt();
                return jd1Var;
            case 6:
                od1 od1Var = new od1();
                od1Var.m = null;
                od1Var.n = new ArrayList();
                od1Var.o = new ArrayList();
                od1Var.c = parcel.createStringArrayList();
                od1Var.d = parcel.createStringArrayList();
                od1Var.h = (fr[]) parcel.createTypedArray(fr.CREATOR);
                od1Var.l = parcel.readInt();
                od1Var.m = parcel.readString();
                od1Var.n = parcel.createStringArrayList();
                od1Var.o = parcel.createTypedArrayList(gr.CREATOR);
                od1Var.p = parcel.createTypedArrayList(jd1.CREATOR);
                return od1Var;
            case 7:
                return new td1(parcel);
            case 8:
                parcel.getClass();
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                parcelable.getClass();
                return new sq1((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 9:
                lk2 lk2Var = new lk2(parcel);
                lk2Var.c = parcel.readInt();
                return lk2Var;
            case 10:
                return new ParcelImpl(parcel);
            case 11:
                return new bt2(parcel.readFloat());
            case 12:
                return new ct2(parcel.readInt());
            case 13:
                return new dt2(parcel.readLong());
            case 14:
                int iB0 = yo4.b0(parcel);
                while (true) {
                    ArrayList arrayListCreateTypedArrayList = null;
                    while (true) {
                        if (parcel.dataPosition() >= iB0) {
                            yo4.w(parcel, iB0);
                            return new gt3(iQ, arrayListCreateTypedArrayList);
                        }
                        int i = parcel.readInt();
                        char c = (char) i;
                        if (c == 1) {
                            iQ = yo4.Q(parcel, i);
                        } else if (c != 2) {
                            yo4.X(parcel, i);
                        } else {
                            Parcelable.Creator<de2> creator = de2.CREATOR;
                            int iR = yo4.R(parcel, i);
                            int iDataPosition = parcel.dataPosition();
                            if (iR == 0) {
                            }
                            arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
                            parcel.setDataPosition(iDataPosition + iR);
                        }
                        break;
                    }
                }
                break;
            case 15:
                int iB1 = yo4.b0(parcel);
                int iQ2 = 0;
                while (parcel.dataPosition() < iB1) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        iQ = yo4.Q(parcel, i2);
                    } else if (c2 == 2) {
                        iQ2 = yo4.Q(parcel, i2);
                    } else if (c2 != 3) {
                        yo4.X(parcel, i2);
                    } else {
                        intent = (Intent) yo4.r(parcel, i2, Intent.CREATOR);
                    }
                }
                yo4.w(parcel, iB1);
                return new zj4(iQ, iQ2, intent);
            case 16:
                int iB2 = yo4.b0(parcel);
                long j = 0;
                int iQ3 = 0;
                String strS3 = null;
                String strS4 = null;
                String strS5 = null;
                String strS6 = null;
                Uri uri = null;
                String strS7 = null;
                String strS8 = null;
                ArrayList arrayList = null;
                String strS9 = null;
                String strS10 = null;
                while (parcel.dataPosition() < iB2) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 1:
                            iQ3 = yo4.Q(parcel, i3);
                            break;
                        case 2:
                            strS3 = yo4.s(parcel, i3);
                            break;
                        case 3:
                            strS4 = yo4.s(parcel, i3);
                            break;
                        case 4:
                            strS5 = yo4.s(parcel, i3);
                            break;
                        case 5:
                            strS6 = yo4.s(parcel, i3);
                            break;
                        case 6:
                            uri = (Uri) yo4.r(parcel, i3, Uri.CREATOR);
                            break;
                        case 7:
                            strS7 = yo4.s(parcel, i3);
                            break;
                        case '\b':
                            yo4.d0(parcel, i3, 8);
                            j = parcel.readLong();
                            break;
                        case '\t':
                            strS8 = yo4.s(parcel, i3);
                            break;
                        case '\n':
                            Parcelable.Creator<Scope> creator2 = Scope.CREATOR;
                            int iR2 = yo4.R(parcel, i3);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iR2 != 0) {
                                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(creator2);
                                parcel.setDataPosition(iDataPosition2 + iR2);
                                arrayList = arrayListCreateTypedArrayList2;
                            } else {
                                arrayList = null;
                            }
                            break;
                        case 11:
                            strS9 = yo4.s(parcel, i3);
                            break;
                        case '\f':
                            strS10 = yo4.s(parcel, i3);
                            break;
                        default:
                            yo4.X(parcel, i3);
                            break;
                    }
                }
                yo4.w(parcel, iB2);
                return new GoogleSignInAccount(iQ3, strS3, strS4, strS5, strS6, uri, strS7, j, strS8, arrayList, strS9, strS10);
            case 17:
                int iB3 = yo4.b0(parcel);
                ArrayList<String> arrayList2 = null;
                String strS11 = null;
                while (parcel.dataPosition() < iB3) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 1) {
                        int iR3 = yo4.R(parcel, i4);
                        int iDataPosition3 = parcel.dataPosition();
                        if (iR3 == 0) {
                            arrayList2 = null;
                        } else {
                            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(iDataPosition3 + iR3);
                            arrayList2 = arrayListCreateStringArrayList;
                        }
                    } else if (c3 != 2) {
                        yo4.X(parcel, i4);
                    } else {
                        strS11 = yo4.s(parcel, i4);
                    }
                }
                yo4.w(parcel, iB3);
                return new vk4(strS11, arrayList2);
            case 18:
                int iB4 = yo4.b0(parcel);
                fl4 fl4Var = null;
                while (parcel.dataPosition() < iB4) {
                    int i5 = parcel.readInt();
                    char c4 = (char) i5;
                    if (c4 == 1) {
                        iQ = yo4.Q(parcel, i5);
                    } else if (c4 == 2) {
                        ml0Var = (ml0) yo4.r(parcel, i5, ml0.CREATOR);
                    } else if (c4 != 3) {
                        yo4.X(parcel, i5);
                    } else {
                        fl4Var = (fl4) yo4.r(parcel, i5, fl4.CREATOR);
                    }
                }
                yo4.w(parcel, iB4);
                return new zk4(iQ, ml0Var, fl4Var);
            case 19:
                int iB5 = yo4.b0(parcel);
                long j2 = 0;
                long j3 = 0;
                int iQ4 = -1;
                int iQ5 = 0;
                int iQ6 = 0;
                int iQ7 = 0;
                int iQ8 = 0;
                String strS12 = null;
                String strS13 = null;
                while (parcel.dataPosition() < iB5) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 1:
                            iQ5 = yo4.Q(parcel, i6);
                            break;
                        case 2:
                            iQ6 = yo4.Q(parcel, i6);
                            break;
                        case 3:
                            iQ7 = yo4.Q(parcel, i6);
                            break;
                        case 4:
                            yo4.d0(parcel, i6, 8);
                            j2 = parcel.readLong();
                            break;
                        case 5:
                            yo4.d0(parcel, i6, 8);
                            j3 = parcel.readLong();
                            break;
                        case 6:
                            strS12 = yo4.s(parcel, i6);
                            break;
                        case 7:
                            strS13 = yo4.s(parcel, i6);
                            break;
                        case '\b':
                            iQ8 = yo4.Q(parcel, i6);
                            break;
                        case '\t':
                            iQ4 = yo4.Q(parcel, i6);
                            break;
                        default:
                            yo4.X(parcel, i6);
                            break;
                    }
                }
                yo4.w(parcel, iB5);
                return new de2(iQ5, iQ6, iQ7, j2, j3, strS12, strS13, iQ8, iQ4);
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                int iB6 = yo4.b0(parcel);
                int iQ9 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iB6) {
                    int i7 = parcel.readInt();
                    char c5 = (char) i7;
                    if (c5 == 1) {
                        iQ = yo4.Q(parcel, i7);
                    } else if (c5 == 2) {
                        account = (Account) yo4.r(parcel, i7, Account.CREATOR);
                    } else if (c5 == 3) {
                        iQ9 = yo4.Q(parcel, i7);
                    } else if (c5 != 4) {
                        yo4.X(parcel, i7);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) yo4.r(parcel, i7, GoogleSignInAccount.CREATOR);
                    }
                }
                yo4.w(parcel, iB6);
                return new dl4(iQ, account, iQ9, googleSignInAccount);
            case 21:
                int iB7 = yo4.b0(parcel);
                int iQ10 = 0;
                boolean zP = false;
                boolean zP2 = false;
                IBinder iBinder = null;
                ml0 ml0Var2 = null;
                while (parcel.dataPosition() < iB7) {
                    int i8 = parcel.readInt();
                    char c6 = (char) i8;
                    if (c6 == 1) {
                        iQ10 = yo4.Q(parcel, i8);
                    } else if (c6 == 2) {
                        int iR4 = yo4.R(parcel, i8);
                        int iDataPosition4 = parcel.dataPosition();
                        if (iR4 == 0) {
                            iBinder = null;
                        } else {
                            IBinder strongBinder = parcel.readStrongBinder();
                            parcel.setDataPosition(iDataPosition4 + iR4);
                            iBinder = strongBinder;
                        }
                    } else if (c6 == 3) {
                        ml0Var2 = (ml0) yo4.r(parcel, i8, ml0.CREATOR);
                    } else if (c6 == 4) {
                        zP = yo4.P(parcel, i8);
                    } else if (c6 != 5) {
                        yo4.X(parcel, i8);
                    } else {
                        zP2 = yo4.P(parcel, i8);
                    }
                }
                yo4.w(parcel, iB7);
                return new fl4(iQ10, iBinder, ml0Var2, zP, zP2);
            case 22:
                int iB8 = yo4.b0(parcel);
                int iQ11 = 0;
                int iQ12 = 0;
                PendingIntent pendingIntent = null;
                String strS14 = null;
                Integer numValueOf = null;
                while (parcel.dataPosition() < iB8) {
                    int i9 = parcel.readInt();
                    char c7 = (char) i9;
                    if (c7 == 1) {
                        iQ11 = yo4.Q(parcel, i9);
                    } else if (c7 == 2) {
                        iQ12 = yo4.Q(parcel, i9);
                    } else if (c7 == 3) {
                        pendingIntent = (PendingIntent) yo4.r(parcel, i9, PendingIntent.CREATOR);
                    } else if (c7 == 4) {
                        strS14 = yo4.s(parcel, i9);
                    } else if (c7 != 5) {
                        yo4.X(parcel, i9);
                    } else {
                        int iR5 = yo4.R(parcel, i9);
                        if (iR5 == 0) {
                            numValueOf = null;
                        } else {
                            if (iR5 != 4) {
                                String hexString = Integer.toHexString(iR5);
                                StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + String.valueOf(4).length() + 19 + String.valueOf(iR5).length() + 4 + 1);
                                sb.append("Expected size 4 got ");
                                sb.append(iR5);
                                sb.append(" (0x");
                                sb.append(hexString);
                                sb.append(")");
                                throw new eg0(sb.toString(), parcel);
                            }
                            numValueOf = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                yo4.w(parcel, iB8);
                return new ml0(iQ11, iQ12, pendingIntent, strS14, numValueOf);
            case 23:
                int iB9 = yo4.b0(parcel);
                int iQ13 = 0;
                int iQ14 = 0;
                int iQ15 = 0;
                boolean zP3 = false;
                boolean zP4 = false;
                while (parcel.dataPosition() < iB9) {
                    int i10 = parcel.readInt();
                    char c8 = (char) i10;
                    if (c8 == 1) {
                        iQ13 = yo4.Q(parcel, i10);
                    } else if (c8 == 2) {
                        zP3 = yo4.P(parcel, i10);
                    } else if (c8 == 3) {
                        zP4 = yo4.P(parcel, i10);
                    } else if (c8 == 4) {
                        iQ14 = yo4.Q(parcel, i10);
                    } else if (c8 != 5) {
                        yo4.X(parcel, i10);
                    } else {
                        iQ15 = yo4.Q(parcel, i10);
                    }
                }
                yo4.w(parcel, iB9);
                return new u73(iQ13, iQ14, iQ15, zP3, zP4);
            case 24:
                int iB10 = yo4.b0(parcel);
                long j4 = -1;
                int iQ16 = 0;
                boolean zP5 = false;
                String strS15 = null;
                while (parcel.dataPosition() < iB10) {
                    int i11 = parcel.readInt();
                    char c9 = (char) i11;
                    if (c9 == 1) {
                        strS15 = yo4.s(parcel, i11);
                    } else if (c9 == 2) {
                        iQ16 = yo4.Q(parcel, i11);
                    } else if (c9 == 3) {
                        yo4.d0(parcel, i11, 8);
                        j4 = parcel.readLong();
                    } else if (c9 != 4) {
                        yo4.X(parcel, i11);
                    } else {
                        zP5 = yo4.P(parcel, i11);
                    }
                }
                yo4.w(parcel, iB10);
                return new o61(strS15, iQ16, j4, zP5);
            case 25:
                int iB11 = yo4.b0(parcel);
                while (parcel.dataPosition() < iB11) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 1) {
                        iQ = yo4.Q(parcel, i12);
                    } else if (c10 != 2) {
                        yo4.X(parcel, i12);
                    } else {
                        strS2 = yo4.s(parcel, i12);
                    }
                }
                yo4.w(parcel, iB11);
                return new Scope(iQ, strS2);
            case 26:
                int iB12 = yo4.b0(parcel);
                PendingIntent pendingIntent2 = null;
                ml0 ml0Var3 = null;
                while (parcel.dataPosition() < iB12) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 1) {
                        iQ = yo4.Q(parcel, i13);
                    } else if (c11 == 2) {
                        strS = yo4.s(parcel, i13);
                    } else if (c11 == 3) {
                        pendingIntent2 = (PendingIntent) yo4.r(parcel, i13, PendingIntent.CREATOR);
                    } else if (c11 != 4) {
                        yo4.X(parcel, i13);
                    } else {
                        ml0Var3 = (ml0) yo4.r(parcel, i13, ml0.CREATOR);
                    }
                }
                yo4.w(parcel, iB12);
                return new Status(iQ, strS, pendingIntent2, ml0Var3);
            case 27:
                int iB13 = yo4.b0(parcel);
                Bundle bundle = null;
                o61[] o61VarArr = null;
                rl0 rl0Var = null;
                while (parcel.dataPosition() < iB13) {
                    int i14 = parcel.readInt();
                    char c12 = (char) i14;
                    if (c12 == 1) {
                        int iR6 = yo4.R(parcel, i14);
                        int iDataPosition5 = parcel.dataPosition();
                        if (iR6 == 0) {
                            bundle = null;
                        } else {
                            Bundle bundle2 = parcel.readBundle();
                            parcel.setDataPosition(iDataPosition5 + iR6);
                            bundle = bundle2;
                        }
                    } else if (c12 == 2) {
                        o61VarArr = (o61[]) yo4.t(parcel, i14, o61.CREATOR);
                    } else if (c12 == 3) {
                        iQ = yo4.Q(parcel, i14);
                    } else if (c12 != 4) {
                        yo4.X(parcel, i14);
                    } else {
                        rl0Var = (rl0) yo4.r(parcel, i14, rl0.CREATOR);
                    }
                }
                yo4.w(parcel, iB13);
                sq4 sq4Var = new sq4();
                sq4Var.c = bundle;
                sq4Var.d = o61VarArr;
                sq4Var.h = iQ;
                sq4Var.l = rl0Var;
                return sq4Var;
            case 28:
                int iB14 = yo4.b0(parcel);
                boolean zP6 = false;
                boolean zP7 = false;
                int iQ17 = 0;
                u73 u73Var = null;
                int[] iArr = null;
                int[] iArr2 = null;
                while (parcel.dataPosition() < iB14) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            u73Var = (u73) yo4.r(parcel, i15, u73.CREATOR);
                            break;
                        case 2:
                            zP6 = yo4.P(parcel, i15);
                            break;
                        case 3:
                            zP7 = yo4.P(parcel, i15);
                            break;
                        case 4:
                            int iR7 = yo4.R(parcel, i15);
                            int iDataPosition6 = parcel.dataPosition();
                            if (iR7 != 0) {
                                int[] iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition6 + iR7);
                                iArr = iArrCreateIntArray;
                            } else {
                                iArr = null;
                            }
                            break;
                        case 5:
                            iQ17 = yo4.Q(parcel, i15);
                            break;
                        case 6:
                            int iR8 = yo4.R(parcel, i15);
                            int iDataPosition7 = parcel.dataPosition();
                            if (iR8 != 0) {
                                int[] iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition7 + iR8);
                                iArr2 = iArrCreateIntArray2;
                            } else {
                                iArr2 = null;
                            }
                            break;
                        default:
                            yo4.X(parcel, i15);
                            break;
                    }
                }
                yo4.w(parcel, iB14);
                return new rl0(u73Var, zP6, zP7, iArr, iQ17, iArr2);
            default:
                int iB15 = yo4.b0(parcel);
                Bundle bundle3 = new Bundle();
                Scope[] scopeArr = if1.w;
                o61[] o61VarArr2 = if1.x;
                o61[] o61VarArr3 = o61VarArr2;
                int iQ18 = 0;
                int iQ19 = 0;
                int iQ20 = 0;
                boolean zP8 = false;
                int iQ21 = 0;
                boolean zP9 = false;
                String strS16 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String strS17 = null;
                while (parcel.dataPosition() < iB15) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            iQ18 = yo4.Q(parcel, i16);
                            break;
                        case 2:
                            iQ19 = yo4.Q(parcel, i16);
                            break;
                        case 3:
                            iQ20 = yo4.Q(parcel, i16);
                            break;
                        case 4:
                            strS16 = yo4.s(parcel, i16);
                            break;
                        case 5:
                            int iR9 = yo4.R(parcel, i16);
                            int iDataPosition8 = parcel.dataPosition();
                            if (iR9 != 0) {
                                IBinder strongBinder2 = parcel.readStrongBinder();
                                parcel.setDataPosition(iDataPosition8 + iR9);
                                iBinder2 = strongBinder2;
                            } else {
                                iBinder2 = null;
                            }
                            break;
                        case 6:
                            scopeArr = (Scope[]) yo4.t(parcel, i16, Scope.CREATOR);
                            break;
                        case 7:
                            int iR10 = yo4.R(parcel, i16);
                            int iDataPosition9 = parcel.dataPosition();
                            if (iR10 != 0) {
                                Bundle bundle4 = parcel.readBundle();
                                parcel.setDataPosition(iDataPosition9 + iR10);
                                bundle3 = bundle4;
                            } else {
                                bundle3 = null;
                            }
                            break;
                        case '\b':
                            account2 = (Account) yo4.r(parcel, i16, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            yo4.X(parcel, i16);
                            break;
                        case '\n':
                            o61VarArr2 = (o61[]) yo4.t(parcel, i16, o61.CREATOR);
                            break;
                        case 11:
                            o61VarArr3 = (o61[]) yo4.t(parcel, i16, o61.CREATOR);
                            break;
                        case '\f':
                            zP8 = yo4.P(parcel, i16);
                            break;
                        case '\r':
                            iQ21 = yo4.Q(parcel, i16);
                            break;
                        case 14:
                            zP9 = yo4.P(parcel, i16);
                            break;
                        case 15:
                            strS17 = yo4.s(parcel, i16);
                            break;
                    }
                }
                yo4.w(parcel, iB15);
                return new if1(iQ18, iQ19, iQ20, strS16, iBinder2, scopeArr, bundle3, account2, o61VarArr2, o61VarArr3, zP8, iQ21, zP9, strS17);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new q3[i];
            case 1:
                return new xj[i];
            case 2:
                return new fr[i];
            case 3:
                return new gr[i];
            case 4:
                return new ct0[i];
            case 5:
                return new jd1[i];
            case 6:
                return new od1[i];
            case 7:
                return new td1[i];
            case 8:
                return new sq1[i];
            case 9:
                return new lk2[i];
            case 10:
                return new ParcelImpl[i];
            case 11:
                return new bt2[i];
            case 12:
                return new ct2[i];
            case 13:
                return new dt2[i];
            case 14:
                return new gt3[i];
            case 15:
                return new zj4[i];
            case 16:
                return new GoogleSignInAccount[i];
            case 17:
                return new vk4[i];
            case 18:
                return new zk4[i];
            case 19:
                return new de2[i];
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                return new dl4[i];
            case 21:
                return new fl4[i];
            case 22:
                return new ml0[i];
            case 23:
                return new u73[i];
            case 24:
                return new o61[i];
            case 25:
                return new Scope[i];
            case 26:
                return new Status[i];
            case 27:
                return new sq4[i];
            case 28:
                return new rl0[i];
            default:
                return new if1[i];
        }
    }
}
