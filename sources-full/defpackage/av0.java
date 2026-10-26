package defpackage;

import android.net.NetworkRequest;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Set;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class av0 extends sv1 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av0(WorkDatabase workDatabase) {
        super(workDatabase);
        this.d = 1;
        workDatabase.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ av0(WorkDatabase workDatabase, int i) {
        super(workDatabase);
        this.d = i;
    }

    @Override // defpackage.sv1
    public final String d() {
        switch (this.d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public final void l(he1 he1Var, Object obj) throws IOException {
        int i;
        int i2;
        int[] iArrN0;
        int[] iArrN1;
        byte[] byteArray;
        byte[] byteArray2;
        int i3 = 3;
        switch (this.d) {
            case 0:
                zu0 zu0Var = (zu0) obj;
                he1Var.i(1, zu0Var.a);
                he1Var.i(2, zu0Var.b);
                return;
            case 1:
                ey2 ey2Var = (ey2) obj;
                he1Var.i(1, ey2Var.a);
                he1Var.s(ey2Var.b.longValue(), 2);
                return;
            case 2:
                gr3 gr3Var = (gr3) obj;
                he1Var.i(1, gr3Var.a);
                he1Var.s(gr3Var.b, 2);
                he1Var.s(gr3Var.c, 3);
                return;
            case 3:
                ai4 ai4Var = (ai4) obj;
                he1Var.i(1, ai4Var.a);
                he1Var.i(2, ai4Var.b);
                return;
            case 4:
                throw new ClassCastException();
            case 5:
                hi4 hi4Var = (hi4) obj;
                he1Var.i(1, hi4Var.a);
                he1Var.s(pi4.f(hi4Var.b), 2);
                he1Var.i(3, hi4Var.c);
                he1Var.i(4, hi4Var.d);
                or0 or0Var = hi4Var.e;
                or0 or0Var2 = or0.b;
                he1Var.C(5, Options$Companion.toByteArrayInternalV1(or0Var));
                he1Var.C(6, Options$Companion.toByteArrayInternalV1(hi4Var.f));
                he1Var.s(hi4Var.g, 7);
                he1Var.s(hi4Var.h, 8);
                he1Var.s(hi4Var.i, 9);
                he1Var.s(hi4Var.k, 10);
                int i4 = hi4Var.l;
                if (i4 == 0) {
                    throw null;
                }
                int iZ = fq2.z(i4);
                if (iZ == 0) {
                    i = 0;
                } else {
                    if (iZ != 1) {
                        u41.e();
                        return;
                    }
                    i = 1;
                }
                he1Var.s(i, 11);
                he1Var.s(hi4Var.m, 12);
                he1Var.s(hi4Var.n, 13);
                he1Var.s(hi4Var.o, 14);
                he1Var.s(hi4Var.p, 15);
                he1Var.s(hi4Var.q ? 1L : 0L, 16);
                int i5 = hi4Var.r;
                if (i5 == 0) {
                    throw null;
                }
                int iZ2 = fq2.z(i5);
                if (iZ2 == 0) {
                    i2 = 0;
                } else {
                    if (iZ2 != 1) {
                        u41.e();
                        return;
                    }
                    i2 = 1;
                }
                he1Var.s(i2, 17);
                he1Var.s(hi4Var.s, 18);
                he1Var.s(hi4Var.t, 19);
                he1Var.s(hi4Var.u, 20);
                he1Var.s(hi4Var.v, 21);
                he1Var.s(hi4Var.w, 22);
                String str = hi4Var.x;
                if (str == null) {
                    he1Var.m(23);
                } else {
                    he1Var.i(23, str);
                }
                tm0 tm0Var = hi4Var.j;
                int i6 = tm0Var.a;
                if (i6 == 0) {
                    throw null;
                }
                int iZ3 = fq2.z(i6);
                if (iZ3 == 0) {
                    i3 = 0;
                } else if (iZ3 == 1) {
                    i3 = 1;
                } else if (iZ3 == 2) {
                    i3 = 2;
                } else if (iZ3 != 3) {
                    if (iZ3 == 4) {
                        i3 = 4;
                    } else if (Build.VERSION.SDK_INT < 30 || i6 != 6) {
                        j93.e(ud2.y(i6), " to int", "Could not convert ");
                        i3 = 0;
                    } else {
                        i3 = 5;
                    }
                }
                he1Var.s(i3, 24);
                dl2 dl2Var = tm0Var.b;
                dl2Var.getClass();
                int i7 = Build.VERSION.SDK_INT;
                if (i7 < 28) {
                    byteArray = new byte[0];
                } else {
                    NetworkRequest networkRequest = (NetworkRequest) dl2Var.a;
                    if (networkRequest == null) {
                        byteArray = new byte[0];
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                            try {
                                if (i7 >= 31) {
                                    iArrN0 = networkRequest.getTransportTypes();
                                    iArrN0.getClass();
                                } else {
                                    int[] iArr = {2, 0, 3, 6, 9, 8, 4, 1, 5};
                                    ArrayList arrayList = new ArrayList();
                                    for (int i8 = 0; i8 < 9; i8++) {
                                        int i9 = iArr[i8];
                                        if (networkRequest.hasTransport(i9)) {
                                            arrayList.add(Integer.valueOf(i9));
                                        }
                                    }
                                    iArrN0 = ke0.N0(arrayList);
                                }
                                if (Build.VERSION.SDK_INT >= 31) {
                                    iArrN1 = networkRequest.getCapabilities();
                                    iArrN1.getClass();
                                } else {
                                    int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                                    ArrayList arrayList2 = new ArrayList();
                                    for (int i10 = 0; i10 < 29; i10++) {
                                        int i11 = iArr2[i10];
                                        if (networkRequest.hasCapability(i11)) {
                                            arrayList2.add(Integer.valueOf(i11));
                                        }
                                    }
                                    iArrN1 = ke0.N0(arrayList2);
                                }
                                objectOutputStream.writeInt(iArrN0.length);
                                for (int i12 : iArrN0) {
                                    objectOutputStream.writeInt(i12);
                                }
                                objectOutputStream.writeInt(iArrN1.length);
                                for (int i13 : iArrN1) {
                                    objectOutputStream.writeInt(i13);
                                }
                                objectOutputStream.close();
                                byteArrayOutputStream.close();
                                byteArray = byteArrayOutputStream.toByteArray();
                                byteArray.getClass();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    jr1.i(objectOutputStream, th);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                jr1.i(byteArrayOutputStream, th3);
                                throw th4;
                            }
                        }
                    }
                }
                he1Var.C(25, byteArray);
                he1Var.s(tm0Var.c ? 1L : 0L, 26);
                he1Var.s(tm0Var.d ? 1L : 0L, 27);
                he1Var.s(tm0Var.e ? 1L : 0L, 28);
                he1Var.s(tm0Var.f ? 1L : 0L, 29);
                he1Var.s(tm0Var.g, 30);
                he1Var.s(tm0Var.h, 31);
                Set<sm0> set = tm0Var.i;
                set.getClass();
                if (set.isEmpty()) {
                    byteArray2 = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                        try {
                            objectOutputStream2.writeInt(set.size());
                            for (sm0 sm0Var : set) {
                                objectOutputStream2.writeUTF(sm0Var.a.toString());
                                objectOutputStream2.writeBoolean(sm0Var.b);
                            }
                            objectOutputStream2.close();
                            byteArrayOutputStream2.close();
                            byteArray2 = byteArrayOutputStream2.toByteArray();
                            byteArray2.getClass();
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                jr1.i(objectOutputStream2, th5);
                                throw th6;
                            }
                        }
                    } catch (Throwable th7) {
                        try {
                            throw th7;
                        } catch (Throwable th8) {
                            jr1.i(byteArrayOutputStream2, th7);
                            throw th8;
                        }
                    }
                }
                he1Var.C(32, byteArray2);
                return;
            default:
                li4 li4Var = (li4) obj;
                he1Var.i(1, li4Var.a);
                he1Var.i(2, li4Var.b);
                return;
        }
    }

    public final void m(Object obj) {
        he1 he1VarA = a();
        try {
            l(he1VarA, obj);
            he1VarA.d.executeInsert();
        } finally {
            j(he1VarA);
        }
    }
}
