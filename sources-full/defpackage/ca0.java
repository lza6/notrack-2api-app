package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import notrack.ai.data.chatmeta.ChatMetaDoc;
import notrack.ai.data.chatmeta.FolderMeta;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ca0 extends we1 implements ne1 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ca0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.c = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca0(hb0 hb0Var, int i) {
        super(2, 0, hb0.class, hb0Var, "uploadAvatar", "uploadAvatar([BLkotlin/jvm/functions/Function1;)V");
        this.c = i;
        switch (i) {
            case 1:
                super(2, 0, hb0.class, hb0Var, "signIn", "signIn(Ljava/lang/String;Ljava/lang/String;)V");
                break;
            case 2:
                super(2, 0, hb0.class, hb0Var, "signUp", "signUp(Ljava/lang/String;Ljava/lang/String;)V");
                break;
            default:
                break;
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        Object value2;
        Object value3;
        boolean zB;
        hb1 hb1VarZ0;
        int i = this.c;
        int i2 = 10;
        so0 so0Var = null;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                byte[] bArr = (byte[]) obj;
                le1 le1Var = (le1) obj2;
                bArr.getClass();
                le1Var.getClass();
                hb0 hb0Var = (hb0) this.receiver;
                hb0Var.getClass();
                String str = ((xa0) hb0Var.c.getValue()).r0;
                if (str != null) {
                    py.F(id4.a(hb0Var), null, null, new qb(hb0Var, str, bArr, le1Var, (so0) null), 3);
                }
                return w84Var;
            case 1:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                str2.getClass();
                str3.getClass();
                hb0 hb0Var2 = (hb0) this.receiver;
                hb0Var2.getClass();
                if (mo3.C0(str2) || mo3.C0(str3)) {
                    jn3 jn3Var = hb0Var2.c;
                    do {
                        value = jn3Var.getValue();
                    } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, "fill_both", false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -16777217, KotlinVersion.MAX_COMPONENT_VALUE)));
                } else {
                    py.F(id4.a(hb0Var2), null, null, new za0(hb0Var2, str2, str3, null, 4), 3);
                }
                return w84Var;
            case 2:
                String str4 = (String) obj;
                String str5 = (String) obj2;
                str4.getClass();
                str5.getClass();
                hb0 hb0Var3 = (hb0) this.receiver;
                hb0Var3.getClass();
                if (mo3.C0(str4) || mo3.C0(str5)) {
                    jn3 jn3Var2 = hb0Var3.c;
                    do {
                        value2 = jn3Var2.getValue();
                    } while (!jn3Var2.n(value2, xa0.a((xa0) value2, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, "fill_both", false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -16777217, KotlinVersion.MAX_COMPONENT_VALUE)));
                } else {
                    py.F(id4.a(hb0Var3), null, null, new za0(hb0Var3, str4, str5, null, 5), 3);
                }
                return w84Var;
            case 3:
                String str6 = (String) obj;
                String str7 = (String) obj2;
                str6.getClass();
                str7.getClass();
                hb0 hb0Var4 = (hb0) this.receiver;
                hb0Var4.getClass();
                if (!mo3.C0(str7)) {
                    bv0 bv0Var = hb0Var4.b.f;
                    bv0Var.getClass();
                    ChatMetaDoc chatMetaDocB = bv0Var.B();
                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    List<FolderMeta> folders = chatMetaDocB.getFolders();
                    ArrayList arrayList = new ArrayList(le0.q0(folders, 10));
                    for (FolderMeta folderMetaCopy$default : folders) {
                        if (kr1.n(folderMetaCopy$default.getId(), str6)) {
                            folderMetaCopy$default = FolderMeta.copy$default(folderMetaCopy$default, mo3.T0(60, mo3.U0(str7).toString()), jCurrentTimeMillis);
                        }
                        arrayList.add(folderMetaCopy$default);
                    }
                    bv0Var.F(ChatMetaDoc.copy$default(chatMetaDocB, arrayList, null, 0L, 13));
                    hb0Var4.V();
                }
                return w84Var;
            case 4:
                String str8 = (String) obj;
                String str9 = (String) obj2;
                str8.getClass();
                hb0 hb0Var5 = (hb0) this.receiver;
                e60 e60Var = hb0Var5.b;
                if (!mo3.C0(str8)) {
                    String strH = e60Var.f.h(str8);
                    if (str9 != null) {
                        bv0 bv0Var2 = e60Var.f;
                        bv0Var2.getClass();
                        bv0Var2.x(str9, new ep(strH, 3));
                    }
                    hb0Var5.V();
                }
                return w84Var;
            case 5:
                String str10 = (String) obj;
                str10.getClass();
                hb0 hb0Var6 = (hb0) this.receiver;
                hb0Var6.getClass();
                bv0 bv0Var3 = hb0Var6.b.f;
                bv0Var3.getClass();
                bv0Var3.x(str10, new ep((String) obj2, 3));
                hb0Var6.V();
                hb0Var6.X(e50.a);
                return w84Var;
            case 6:
                String str11 = (String) obj;
                String str12 = (String) obj2;
                str11.getClass();
                str12.getClass();
                hb0 hb0Var7 = (hb0) this.receiver;
                hb0Var7.getClass();
                String strT0 = mo3.T0(120, mo3.U0(str12).toString());
                e60 e60Var2 = hb0Var7.b;
                e60Var2.f.x(str11, new ep(strT0, 5));
                jn3 jn3Var3 = hb0Var7.c;
                do {
                    value3 = jn3Var3.getValue();
                } while (!jn3Var3.n(value3, xa0.a((xa0) value3, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, e60Var2.f.B(), null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -131073, KotlinVersion.MAX_COMPONENT_VALUE)));
                return w84Var;
            case 7:
                cb1 cb1Var = (cb1) obj;
                cb1 cb1Var2 = (cb1) obj2;
                gb1 gb1Var = (gb1) this.receiver;
                if (gb1Var.isAttached() && (zB = cb1Var2.b()) != cb1Var.b()) {
                    le1 le1Var2 = gb1Var.l;
                    if (le1Var2 != null) {
                        le1Var2.invoke(Boolean.valueOf(zB));
                    }
                    if (zB) {
                        py.F(gb1Var.getCoroutineScope(), null, null, new f60(gb1Var, so0Var, 6), 3);
                        q43 q43Var = new q43();
                        p23.M(gb1Var, new c9(q43Var, i2, gb1Var));
                        w02 w02Var = (w02) q43Var.c;
                        if (w02Var != null) {
                            w02Var.a();
                        } else {
                            w02Var = null;
                        }
                        gb1Var.n = w02Var;
                        wl2 wl2Var = gb1Var.o;
                        if (wl2Var != null && wl2Var.z() && (hb1VarZ0 = gb1Var.z0()) != null) {
                            hb1VarZ0.v0(gb1Var.o);
                        }
                    } else {
                        w02 w02Var2 = gb1Var.n;
                        if (w02Var2 != null) {
                            w02Var2.b();
                        }
                        gb1Var.n = null;
                        hb1 hb1VarZ1 = gb1Var.z0();
                        if (hb1VarZ1 != null) {
                            hb1VarZ1.v0(null);
                        }
                    }
                    y64.M(gb1Var).D();
                    gh2 gh2Var = gb1Var.h;
                    if (gh2Var != null) {
                        ja1 ja1Var = gb1Var.m;
                        if (zB) {
                            if (ja1Var != null) {
                                gb1Var.y0(gh2Var, new ka1(ja1Var));
                                gb1Var.m = null;
                            }
                            ja1 ja1Var2 = new ja1();
                            gb1Var.y0(gh2Var, ja1Var2);
                            gb1Var.m = ja1Var2;
                        } else if (ja1Var != null) {
                            gb1Var.y0(gh2Var, new ka1(ja1Var));
                            gb1Var.m = null;
                        }
                    }
                }
                return w84Var;
            default:
                tf3 tf3Var = (tf3) obj;
                int iIntValue = ((Number) obj2).intValue();
                tf3Var.getClass();
                ft1 ft1Var = (ft1) this.receiver;
                ft1Var.getClass();
                boolean z = !tf3Var.j(iIntValue) && tf3Var.i(iIntValue).g();
                ft1Var.b = z;
                return Boolean.valueOf(z);
        }
    }
}
