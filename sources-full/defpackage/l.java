package defpackage;

import android.content.SharedPreferences;
import android.view.KeyEvent;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.CompositionLocalsKt;
import app.template.extension.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinVersion;
import notrack.ai.data.avatars.AvatarItem;
import notrack.ai.data.avatars.AvatarView;
import notrack.ai.data.chatmeta.ChatEntry;
import notrack.ai.data.chatmeta.ChatMetaDoc;
import notrack.ai.data.chatmeta.FolderMeta;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l extends we1 implements le1 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.c = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(hb0 hb0Var, int i) {
        super(1, 0, hb0.class, hb0Var, "setSecureMode", "setSecureMode(Z)V");
        this.c = i;
        switch (i) {
            case 2:
                super(1, 0, hb0.class, hb0Var, "setAppLockEnabled", "setAppLockEnabled(Z)V");
                break;
            case 3:
                super(1, 0, hb0.class, hb0Var, "chooseVoice", "chooseVoice(Ljava/lang/String;)V");
                break;
            case 4:
                super(1, 0, hb0.class, hb0Var, "switchAvatarSlot", "switchAvatarSlot(Ljava/lang/String;)V");
                break;
            case 5:
                super(1, 0, hb0.class, hb0Var, "pickAvatar", "pickAvatar(Lnotrack/ai/data/avatars/AvatarItem;)V");
                break;
            case 6:
                super(1, 0, hb0.class, hb0Var, "confirmAccountDeletion", "confirmAccountDeletion(Ljava/lang/String;)V");
                break;
            case 7:
                super(1, 0, hb0.class, hb0Var, "saveInstructions", "saveInstructions(Ljava/lang/String;)V");
                break;
            case 8:
                super(1, 0, hb0.class, hb0Var, "bgChange", "bgChange(Lnotrack/ai/data/chatbg/BgState;)V");
                break;
            case 9:
                super(1, 0, hb0.class, hb0Var, "carryEdit", "carryEdit(Ljava/lang/String;)V");
                break;
            case 10:
                super(1, 0, hb0.class, hb0Var, "carryKeep", "carryKeep(Z)V");
                break;
            default:
                break;
        }
    }

    private final Object a(Object obj) {
        String str = (String) obj;
        str.getClass();
        hb0 hb0Var = (hb0) this.receiver;
        hb0Var.getClass();
        bv0 bv0Var = hb0Var.b.f;
        bv0Var.getClass();
        ChatMetaDoc chatMetaDocB = bv0Var.B();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        List<FolderMeta> folders = chatMetaDocB.getFolders();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : folders) {
            if (!kr1.n(((FolderMeta) obj2).getId(), str)) {
                arrayList.add(obj2);
            }
        }
        Map<String, ChatEntry> chats = chatMetaDocB.getChats();
        LinkedHashMap linkedHashMap = new LinkedHashMap(y92.S(chats.size()));
        Iterator<T> it = chats.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            ChatEntry chatEntryCopy$default = (ChatEntry) entry.getValue();
            if (kr1.n(chatEntryCopy$default.getFolderId(), str)) {
                chatEntryCopy$default = ChatEntry.copy$default(chatEntryCopy$default, null, false, null, jCurrentTimeMillis, 30);
            }
            linkedHashMap.put(key, chatEntryCopy$default);
        }
        bv0Var.F(ChatMetaDoc.copy$default(chatMetaDocB, arrayList, linkedHashMap, 0L, 9));
        hb0Var.V();
        return w84.a;
    }

    private final Object c(Object obj) {
        Object value;
        String str = (String) obj;
        hb0 hb0Var = (hb0) this.receiver;
        jn3 jn3Var = hb0Var.c;
        do {
            value = jn3Var.getValue();
        } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, true, str != null ? py.R(str) : f31.c, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -1572865, KotlinVersion.MAX_COMPONENT_VALUE)));
        hb0Var.X(e50.a);
        return w84.a;
    }

    private final Object d(Object obj) {
        Object value;
        xa0 xa0Var;
        LinkedHashSet linkedHashSet;
        boolean z;
        String str = (String) obj;
        str.getClass();
        hb0 hb0Var = (hb0) this.receiver;
        hb0Var.getClass();
        jn3 jn3Var = hb0Var.c;
        do {
            value = jn3Var.getValue();
            xa0Var = (xa0) value;
            boolean zContains = xa0Var.a0.contains(str);
            Set set = xa0Var.a0;
            set.getClass();
            if (zContains) {
                linkedHashSet = new LinkedHashSet(y92.S(set.size()));
                boolean z2 = false;
                for (Object obj2 : set) {
                    if (z2 || !kr1.n(obj2, str)) {
                        z = true;
                    } else {
                        z2 = true;
                        z = false;
                    }
                    if (z) {
                        linkedHashSet.add(obj2);
                    }
                }
            } else {
                linkedHashSet = new LinkedHashSet(y92.S(set.size() + 1));
                linkedHashSet.addAll(set);
                linkedHashSet.add(str);
            }
        } while (!jn3Var.n(value, xa0.a(xa0Var, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, linkedHashSet, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -1048577, KotlinVersion.MAX_COMPONENT_VALUE)));
        return w84.a;
    }

    private final Object e(Object obj) {
        String str = (String) obj;
        hb0 hb0Var = (hb0) this.receiver;
        Set<String> set = ((xa0) hb0Var.d.c.getValue()).a0;
        if (!set.isEmpty()) {
            for (String str2 : set) {
                bv0 bv0Var = hb0Var.b.f;
                bv0Var.getClass();
                str2.getClass();
                bv0Var.x(str2, new ep(str, 3));
            }
            hb0Var.V();
            hb0Var.x();
            hb0Var.X(e50.a);
        }
        return w84.a;
    }

    private final Object f(Object obj) {
        String str = (String) obj;
        str.getClass();
        hb0 hb0Var = (hb0) this.receiver;
        e60 e60Var = hb0Var.b;
        if (!mo3.C0(str)) {
            Set<String> set = ((xa0) hb0Var.d.c.getValue()).a0;
            String strH = e60Var.f.h(str);
            for (String str2 : set) {
                bv0 bv0Var = e60Var.f;
                bv0Var.getClass();
                str2.getClass();
                bv0Var.x(str2, new ep(strH, 3));
            }
            hb0Var.V();
            hb0Var.x();
        }
        return w84.a;
    }

    private final Object g(Object obj) {
        String str = (String) obj;
        str.getClass();
        hb0 hb0Var = (hb0) this.receiver;
        hb0Var.getClass();
        hb0Var.X(e50.a);
        py.F(id4.a(hb0Var), null, null, new ya0(5, hb0Var, null, str), 3);
        return w84.a;
    }

    private final Object h(Object obj) {
        Object value;
        String str = (String) obj;
        str.getClass();
        hb0 hb0Var = (hb0) this.receiver;
        hb0Var.getClass();
        jn3 jn3Var = hb0Var.c;
        do {
            value = jn3Var.getValue();
        } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, str, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -65537, KotlinVersion.MAX_COMPONENT_VALUE)));
        return w84.a;
    }

    private final Object i(Object obj) {
        Object value;
        String str = (String) obj;
        str.getClass();
        hb0 hb0Var = (hb0) this.receiver;
        hb0Var.getClass();
        e60 e60Var = hb0Var.b;
        e60Var.f.x(str, new s80(1));
        jn3 jn3Var = hb0Var.c;
        do {
            value = jn3Var.getValue();
        } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, e60Var.f.B(), null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -131073, KotlinVersion.MAX_COMPONENT_VALUE)));
        hb0Var.X(e50.a);
        return w84.a;
    }

    private final Object j(Object obj) {
        Object value;
        xa0 xa0Var;
        ArrayList arrayList;
        hn hnVar = (hn) obj;
        hnVar.getClass();
        hb0 hb0Var = (hb0) this.receiver;
        hb0Var.getClass();
        jn3 jn3Var = hb0Var.c;
        do {
            value = jn3Var.getValue();
            xa0Var = (xa0) value;
            List list = xa0Var.s;
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!kr1.n((hn) obj2, hnVar)) {
                    arrayList.add(obj2);
                }
            }
        } while (!jn3Var.n(value, xa0.a(xa0Var, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, arrayList, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -262145, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
        return w84.a;
    }

    private final Object k(Object obj) {
        Object value;
        String str = (String) obj;
        str.getClass();
        hb0 hb0Var = (hb0) this.receiver;
        hb0Var.getClass();
        e60 e60Var = hb0Var.b;
        e60Var.getClass();
        SharedPreferences.Editor editorEdit = e60Var.j().edit();
        if (str.equals("normal") || !g60.a.contains(str)) {
            editorEdit.remove("persona");
        } else {
            editorEdit.putString("persona", str);
        }
        editorEdit.apply();
        jn3 jn3Var = hb0Var.c;
        do {
            value = jn3Var.getValue();
        } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, e60Var.m(), null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -4097, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
        return w84.a;
    }

    private final Object l(Object obj) {
        Object value;
        float fFloatValue = ((Number) obj).floatValue();
        hb0 hb0Var = (hb0) this.receiver;
        hb0Var.getClass();
        float fD = qz3.d(fFloatValue);
        SharedPreferences.Editor editorEdit = hb0Var.b.j().edit();
        if (fD == 1.0f) {
            editorEdit.remove("chatTextScale");
        } else {
            editorEdit.putFloat("chatTextScale", fD);
        }
        editorEdit.apply();
        jn3 jn3Var = hb0Var.c;
        do {
            value = jn3Var.getValue();
        } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, fD, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -2049, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
        return w84.a;
    }

    private final Object m(Object obj) {
        String str = (String) obj;
        str.getClass();
        ((hb0) this.receiver).P(str);
        return w84.a;
    }

    private final Object n(Object obj) {
        ((js1) this.receiver).r((Throwable) obj);
        return w84.a;
    }

    private final Object o(Object obj) {
        int i = ((en1) obj).a;
        nu3 nu3Var = ((nu3) this.receiver).B.a;
        if (i == 6) {
            ((va1) ((pa1) gm4.t(nu3Var, CompositionLocalsKt.getLocalFocusManager()))).f(1);
        } else if (i == 5) {
            ((va1) ((pa1) gm4.t(nu3Var, CompositionLocalsKt.getLocalFocusManager()))).f(2);
        } else if (i == 7) {
            nu3Var.C0().hide();
        }
        return w84.a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0050  */
    /* JADX WARN: Code duplicated, block: B:182:0x0b06  */
    /* JADX WARN: Code duplicated, block: B:217:0x0d15 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:218:0x0d17 A[LOOP:13: B:206:0x0cce->B:218:0x0d17, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:249:0x0d1b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        yd2 yd2Var;
        Object value;
        AvatarView avatarView;
        AvatarView avatarView2;
        xa0 xa0VarA;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        xa0 xa0Var;
        String str;
        Object value8;
        Integer numA;
        uu1 uu1VarS;
        int i = 7;
        int i2 = 4;
        boolean z = true;
        int i3 = 0;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (this.c) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                r rVar = (r) this.receiver;
                lh2 lh2Var = rVar.v;
                if (zBooleanValue) {
                    rVar.B0();
                } else {
                    if (rVar.h != null) {
                        Object[] objArr4 = lh2Var.c;
                        long[] jArr = lh2Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j = jArr[i4];
                                if ((((~j) << i) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8;
                                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                                    int i7 = 0;
                                    while (i7 < i6) {
                                        if ((255 & j) < 128) {
                                            py.F(rVar.getCoroutineScope(), null, null, new o(rVar, (ry2) objArr4[(i4 << 3) + i7], objArr == true ? 1 : 0, i3), 3);
                                        }
                                        j >>= i5;
                                        i7++;
                                        i5 = i5;
                                    }
                                    if (i6 == i5) {
                                        if (i4 != length) {
                                            i4++;
                                            i = 7;
                                        }
                                    }
                                } else if (i4 != length) {
                                    i4++;
                                    i = 7;
                                }
                            }
                        }
                    }
                    lh2Var.a();
                    rVar.C0();
                }
                return w84.a;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                hb0 hb0Var = (hb0) this.receiver;
                hb0Var.b.a.c("secure_mode", zBooleanValue2);
                jn3 jn3Var = hb0Var.c;
                while (true) {
                    Object value9 = jn3Var.getValue();
                    boolean z2 = zBooleanValue2;
                    if (jn3Var.n(value9, xa0.a((xa0) value9, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, z2, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -16385, -1, KotlinVersion.MAX_COMPONENT_VALUE))) {
                        return w84.a;
                    }
                    zBooleanValue2 = z2;
                }
                break;
            case 2:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                hb0 hb0Var2 = (hb0) this.receiver;
                hb0Var2.b.a.c("app_lock_enabled", zBooleanValue3);
                jn3 jn3Var2 = hb0Var2.c;
                while (true) {
                    Object value10 = jn3Var2.getValue();
                    boolean z3 = zBooleanValue3;
                    if (jn3Var2.n(value10, xa0.a((xa0) value10, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, z3, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -32769, -1, KotlinVersion.MAX_COMPONENT_VALUE))) {
                        return w84.a;
                    }
                    zBooleanValue3 = z3;
                }
                break;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                hb0 hb0Var3 = (hb0) this.receiver;
                hb0Var3.getClass();
                String str3 = ((xa0) hb0Var3.c.getValue()).c;
                hb0Var3.t();
                ef4 ef4VarH = hb0Var3.H();
                cb0 cb0Var = new cb0(str3, hb0Var3, (so0) null);
                ef4VarH.getClass();
                ef4VarH.o = str2;
                jn3 jn3Var3 = ef4VarH.d;
                while (true) {
                    Object value11 = jn3Var3.getValue();
                    String str4 = str2;
                    if (jn3Var3.n(value11, we4.a((we4) value11, false, false, 0.0d, 0.0d, 0.0f, str4, KotlinVersion.MAX_COMPONENT_VALUE))) {
                        yt0 yt0Var = ef4VarH.p;
                        if (yt0Var != null) {
                            yt0Var.c(null);
                        }
                        ef4VarH.p = null;
                        py.F(ef4VarH.c, null, null, new hl3((Object) cb0Var, (Object) str4, (so0) (objArr2 == true ? 1 : 0), i), 3);
                        if (!((xa0) hb0Var3.c.getValue()).m0.a) {
                            List list = ((xa0) hb0Var3.c.getValue()).a;
                            ListIterator listIterator = list.listIterator(list.size());
                            while (listIterator.hasPrevious()) {
                                Object objPrevious = listIterator.previous();
                                yd2 yd2Var2 = (yd2) objPrevious;
                                if (yd2Var2.c == mm3.d && !yd2Var2.e) {
                                    obj2 = objPrevious;
                                    yd2Var = (yd2) obj2;
                                    if (yd2Var != null) {
                                        hb0Var3.c0(yd2Var.a);
                                    }
                                }
                            }
                            yd2Var = (yd2) obj2;
                            if (yd2Var != null) {
                                hb0Var3.c0(yd2Var.a);
                            }
                        }
                        return w84.a;
                    }
                    str2 = str4;
                }
                break;
            case 4:
                String str5 = (String) obj;
                str5.getClass();
                hb0 hb0Var4 = (hb0) this.receiver;
                hb0Var4.getClass();
                jn3 jn3Var4 = hb0Var4.c;
                do {
                    value = jn3Var4.getValue();
                } while (!jn3Var4.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, str5, null, null, -1, -1, 223)));
                return w84.a;
            case 5:
                AvatarItem avatarItem = (AvatarItem) obj;
                avatarItem.getClass();
                hb0 hb0Var5 = (hb0) this.receiver;
                hb0Var5.getClass();
                jn3 jn3Var5 = hb0Var5.c;
                String str6 = ((xa0) jn3Var5.getValue()).r0;
                if (str6 != null) {
                    xa0 xa0Var2 = (xa0) jn3Var5.getValue();
                    String upperCase = null;
                    Object[] objArr5 = 0;
                    if (xa0Var2.c0.getSignedIn()) {
                        py.F(id4.a(hb0Var5), null, null, new q8((Object) hb0Var5, (Object) str6, (Object) avatarItem, (so0) (objArr5 == true ? 1 : 0), 12), 3);
                    } else if (avatarItem.isFree()) {
                        String nickname = xa0Var2.c0.getNickname();
                        if (nickname != null) {
                            upperCase = mo3.T0(1, nickname).toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                        }
                        if (upperCase == null) {
                            upperCase = BuildConfig.VERSION_NAME;
                        }
                        String str7 = upperCase;
                        yg1 yg1VarI = hb0Var5.b.i();
                        yg1VarI.getClass();
                        if (avatarItem.getTile() != null) {
                            avatarView = new AvatarView("tile", str6, avatarItem.getId(), null, null, avatarItem.getTile().getBg(), avatarItem.getTile().getFg(), str7, 280);
                        } else {
                            String url = avatarItem.getUrl();
                            avatarView = (url == null || mo3.C0(url)) ? new AvatarView(null, str6, null, null, null, null, null, str7, 381) : new AvatarView("preset", str6, avatarItem.getId(), avatarItem.getUrl(), avatarItem.getUrlSm(), null, null, str7, 352);
                        }
                        yg1VarI.a.edit().putString(str6, yg1VarI.b.c(AvatarView.Companion.serializer(), avatarView)).apply();
                        while (true) {
                            Object value12 = jn3Var5.getValue();
                            xa0 xa0Var3 = (xa0) value12;
                            if (str6.equals("ai")) {
                                AvatarView avatarView3 = avatarView;
                                xa0VarA = xa0.a(xa0Var3, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, avatarView3, -1, -1, 127);
                                avatarView2 = avatarView3;
                            } else {
                                avatarView2 = avatarView;
                                xa0VarA = xa0.a(xa0Var3, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, avatarView2, null, -1, -1, 191);
                            }
                            if (jn3Var5.n(value12, xa0VarA)) {
                                hb0Var5.X(e50.a);
                            } else {
                                avatarView = avatarView2;
                            }
                        }
                    } else {
                        hb0Var5.X(new a50("chat_avatar"));
                    }
                }
                return w84.a;
            case 6:
                String str8 = (String) obj;
                str8.getClass();
                hb0 hb0Var6 = (hb0) this.receiver;
                hb0Var6.getClass();
                if (mo3.C0(str8)) {
                    jn3 jn3Var6 = hb0Var6.c;
                    do {
                        value2 = jn3Var6.getValue();
                    } while (!jn3Var6.n(value2, xa0.a((xa0) value2, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, "fill_both", false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -16777217, KotlinVersion.MAX_COMPONENT_VALUE)));
                } else {
                    py.F(id4.a(hb0Var6), null, null, new ya0(i2, hb0Var6, objArr3 == true ? 1 : 0, str8), 3);
                }
                return w84.a;
            case 7:
                String str9 = (String) obj;
                str9.getClass();
                hb0 hb0Var7 = (hb0) this.receiver;
                jn3 jn3Var7 = hb0Var7.c;
                String string = mo3.U0(str9).toString();
                int length2 = string.length();
                s23 s23Var = hb0Var7.d;
                k50 k50Var = ((xa0) s23Var.c.getValue()).u;
                if (length2 > (k50Var != null ? k50Var.b : 2000)) {
                    do {
                        value5 = jn3Var7.getValue();
                    } while (!jn3Var7.n(value5, xa0.a((xa0) value5, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, "too_long", null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -32769, KotlinVersion.MAX_COMPONENT_VALUE)));
                } else {
                    String str10 = ((xa0) s23Var.c.getValue()).c;
                    if (str10 == null) {
                        do {
                            value4 = jn3Var7.getValue();
                        } while (!jn3Var7.n(value4, xa0.a((xa0) value4, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, string, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -6291457, -32769, KotlinVersion.MAX_COMPONENT_VALUE)));
                    } else {
                        do {
                            value3 = jn3Var7.getValue();
                        } while (!jn3Var7.n(value3, xa0.a((xa0) value3, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, true, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -8388609, -32769, KotlinVersion.MAX_COMPONENT_VALUE)));
                        py.F(id4.a(hb0Var7), null, null, new za0(hb0Var7, str10, string, null, 3), 3);
                    }
                }
                return w84.a;
            case 8:
                tt ttVar = (tt) obj;
                ttVar.getClass();
                hb0 hb0Var8 = (hb0) this.receiver;
                hb0Var8.getClass();
                jn3 jn3Var8 = hb0Var8.c;
                do {
                    value6 = jn3Var8.getValue();
                } while (!jn3Var8.n(value6, xa0.a((xa0) value6, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, ttVar, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -201326593, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
                return w84.a;
            case 9:
                String str11 = (String) obj;
                str11.getClass();
                hb0 hb0Var9 = (hb0) this.receiver;
                hb0Var9.getClass();
                jn3 jn3Var9 = hb0Var9.c;
                do {
                    value7 = jn3Var9.getValue();
                    xa0Var = (xa0) value7;
                    str = xa0Var.L;
                } while (!jn3Var9.n(value7, xa0.a(xa0Var, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, str11, false, 0L, (str == null || str.equals("too_long") || str.equals("refused")) ? null : str, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -37, KotlinVersion.MAX_COMPONENT_VALUE)));
                return w84.a;
            case 10:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                jn3 jn3Var10 = ((hb0) this.receiver).c;
                do {
                    value8 = jn3Var10.getValue();
                } while (!jn3Var10.n(value8, xa0.a((xa0) value8, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, zBooleanValue4, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -257, KotlinVersion.MAX_COMPONENT_VALUE)));
                return w84.a;
            case 11:
                String str12 = (String) obj;
                str12.getClass();
                ((hb0) this.receiver).W(str12);
                return w84.a;
            case 12:
                String str13 = (String) obj;
                str13.getClass();
                hb0 hb0Var10 = (hb0) this.receiver;
                hb0Var10.getClass();
                bv0 bv0Var = hb0Var10.b.f;
                bv0Var.getClass();
                SharedPreferences sharedPreferences = (SharedPreferences) bv0Var.d;
                Set<String> set = f31.c;
                Set<String> stringSet = sharedPreferences.getStringSet("collapsed", set);
                if (stringSet != null) {
                    set = stringSet;
                }
                Set<String> setR0 = ke0.R0(set);
                if (!setR0.add(str13)) {
                    setR0.remove(str13);
                }
                sharedPreferences.edit().putStringSet("collapsed", setR0).apply();
                hb0Var10.V();
                return w84.a;
            case 13:
                return a(obj);
            case 14:
                return c(obj);
            case 15:
                return d(obj);
            case 16:
                return e(obj);
            case 17:
                return f(obj);
            case 18:
                return g(obj);
            case 19:
                return h(obj);
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                return i(obj);
            case 21:
                return j(obj);
            case 22:
                return k(obj);
            case 23:
                String str14 = (String) obj;
                str14.getClass();
                ((hb0) this.receiver).O(str14);
                return w84.a;
            case 24:
                return l(obj);
            case 25:
                return m(obj);
            case 26:
                return n(obj);
            case 27:
                return o(obj);
            default:
                KeyEvent keyEvent = ((yu1) obj).a;
                qv3 qv3Var = (qv3) this.receiver;
                iz3 iz3Var = qv3Var.f;
                boolean z4 = qv3Var.d;
                wf0 wf0Var = (gm4.H(keyEvent) && (numA = qv3Var.i.a(keyEvent)) != null) ? new wf0(new StringBuilder().appendCodePoint(numA.intValue()).toString(), 1) : null;
                if (wf0Var != null) {
                    if (z4) {
                        qv3Var.a(kr1.T(wf0Var));
                        iz3Var.a = null;
                    } else {
                        z = false;
                    }
                } else if (av1.A(keyEvent) != 2 || (uu1VarS = qv3Var.j.s(keyEvent)) == null || (uu1VarS.c && !z4)) {
                    z = false;
                } else {
                    l43 l43Var = new l43();
                    l43Var.c = true;
                    ie ieVar = new ie(uu1VarS, qv3Var, l43Var, 24);
                    ey3 ey3Var = qv3Var.c;
                    jw3 jw3Var = new jw3(ey3Var, qv3Var.g, qv3Var.a.d(), iz3Var);
                    ieVar.invoke(jw3Var);
                    if (!jz3.b(jw3Var.f, ey3Var.b) || !kr1.n(jw3Var.g, ey3Var.a)) {
                        qv3Var.k.invoke(ey3.a(ey3Var, jw3Var.g, jw3Var.f, 4));
                    }
                    q84 q84Var = qv3Var.h;
                    if (q84Var != null) {
                        q84Var.e = true;
                    }
                    z = l43Var.c;
                }
                return Boolean.valueOf(z);
        }
    }
}
