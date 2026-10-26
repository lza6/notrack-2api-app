package defpackage;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.of2;
import java.util.ArrayList;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public final class va1 implements qa1 {
    public final ne1 a;
    public final le1 b;
    public final je1 c;
    public final je1 d;
    public final je1 e;
    public final db1 f = new db1(2, 6, null);
    public final oa1 g;
    public final qn0 h;
    public final FocusOwnerImpl$modifier$1 i;
    public mh2 j;
    public final vh2 k;
    public db1 l;

    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public va1(le1 le1Var, ne1 ne1Var, le1 le1Var2, je1 je1Var, je1 je1Var2, je1 je1Var3) {
        this.a = ne1Var;
        this.b = le1Var2;
        this.c = je1Var;
        this.d = je1Var2;
        this.e = je1Var3;
        int i = 0;
        this.g = new oa1(le1Var, new ia0(i, this, va1.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0, 8), new ra1(0, 0, va1.class, this, "rootState", "getRootState()Landroidx/compose/ui/focus/FocusState;"), new sa1(i, 0, va1.class, this, "activeFocusTargetNode", "getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;"));
        qn0 qn0Var = new qn0(10);
        long[] jArr = qa3.a;
        new fi2();
        this.h = qn0Var;
        this.i = new tf2() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
            @Override // defpackage.tf2
            public final of2 create() {
                return this.c.f;
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return this.c.f.hashCode();
            }

            @Override // defpackage.tf2
            public final void inspectableProperties(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("RootFocusTarget");
            }

            @Override // defpackage.tf2
            public final /* bridge */ /* synthetic */ void update(of2 of2Var) {
            }
        };
        this.k = new vh2(1);
    }

    public final boolean a(boolean z) {
        yd ydVar;
        db1 db1Var = this.l;
        if (db1Var != null) {
            g(null);
            cb1 cb1Var = cb1.c;
            cb1 cb1Var2 = cb1.l;
            db1Var.v0(cb1Var, cb1Var2);
            if (!db1Var.getNode().isAttached()) {
                po1.b("visitAncestors called on an unattached node");
            }
            of2 parent$ui_release = db1Var.getNode().getParent$ui_release();
            ux1 ux1VarM = y64.M(db1Var);
            while (ux1VarM != null) {
                if ((((of2) ux1VarM.N.f).getAggregateChildKindSet$ui_release() & 1024) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & 1024) != 0) {
                            of2 of2VarE = parent$ui_release;
                            oi2 oi2Var = null;
                            while (of2VarE != null) {
                                if (of2VarE instanceof db1) {
                                    ((db1) of2VarE).v0(cb1.d, cb1Var2);
                                } else if ((of2VarE.getKindSet$ui_release() & 1024) != 0 && (of2VarE instanceof ju0)) {
                                    int i = 0;
                                    for (of2 child$ui_release = ((ju0) of2VarE).d; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                                        if ((child$ui_release.getKindSet$ui_release() & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                of2VarE = child$ui_release;
                                            } else {
                                                if (oi2Var == null) {
                                                    oi2Var = new oi2(0, new of2[16]);
                                                }
                                                if (of2VarE != null) {
                                                    oi2Var.c(of2VarE);
                                                    of2VarE = null;
                                                }
                                                oi2Var.c(child$ui_release);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                of2VarE = y64.e(oi2Var);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                ux1VarM = ux1VarM.t();
                parent$ui_release = (ux1VarM == null || (ydVar = ux1VarM.N) == null) ? null : (es3) ydVar.e;
            }
        }
        return true;
    }

    public final boolean b(int i, boolean z, boolean z2) {
        int iOrdinal;
        boolean z3 = true;
        if (z || (iOrdinal = kr1.Y(this.f, i).ordinal()) == 0) {
            a(z);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                u41.e();
                return false;
            }
            z3 = false;
        }
        if (z3 && z2) {
            this.c.invoke();
        }
        return z3;
    }

    public final void c() {
        yd ydVar;
        if (this.g.f) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return;
        }
        db1 db1VarQ = av1.q(this.f);
        if (db1VarQ != null) {
            if (!db1VarQ.getNode().isAttached()) {
                po1.b("visitAncestors called on an unattached node");
            }
            of2 node = db1VarQ.getNode();
            ux1 ux1VarM = y64.M(db1VarQ);
            while (ux1VarM != null) {
                if ((((of2) ux1VarM.N.f).getAggregateChildKindSet$ui_release() & 131072) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui_release() & 131072) != 0) {
                            of2 of2VarE = node;
                            oi2 oi2Var = null;
                            while (of2VarE != null) {
                                if ((of2VarE.getKindSet$ui_release() & 131072) != 0 && (of2VarE instanceof ju0)) {
                                    int i = 0;
                                    for (of2 child$ui_release = ((ju0) of2VarE).d; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                                        if ((child$ui_release.getKindSet$ui_release() & 131072) != 0) {
                                            i++;
                                            if (i == 1) {
                                                of2VarE = child$ui_release;
                                            } else {
                                                if (oi2Var == null) {
                                                    oi2Var = new oi2(0, new of2[16]);
                                                }
                                                if (of2VarE != null) {
                                                    oi2Var.c(of2VarE);
                                                    of2VarE = null;
                                                }
                                                oi2Var.c(child$ui_release);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                of2VarE = y64.e(oi2Var);
                            }
                        }
                        node = node.getParent$ui_release();
                    }
                }
                ux1VarM = ux1VarM.t();
                node = (ux1VarM == null || (ydVar = ux1VarM.N) == null) ? null : (es3) ydVar.e;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0165  */
    /* JADX WARN: Code duplicated, block: B:103:0x0169 A[Catch: all -> 0x0375, TryCatch #0 {all -> 0x0375, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x0062, B:31:0x0067, B:33:0x0073, B:35:0x007a, B:37:0x0082, B:41:0x008c, B:139:0x01d4, B:141:0x01de, B:142:0x01e1, B:144:0x01f0, B:147:0x0200, B:151:0x020c, B:154:0x0212, B:155:0x0217, B:175:0x0257, B:156:0x021b, B:158:0x0223, B:160:0x0227, B:162:0x022f, B:164:0x0237, B:168:0x023f, B:170:0x0248, B:171:0x024c, B:172:0x024f, B:176:0x025c, B:177:0x0261, B:179:0x0267, B:181:0x026b, B:184:0x0276, B:186:0x027e, B:193:0x0295, B:195:0x029c, B:197:0x02a0, B:220:0x02e8, B:201:0x02ac, B:203:0x02b4, B:205:0x02b8, B:207:0x02c0, B:209:0x02c8, B:213:0x02d0, B:215:0x02d9, B:216:0x02dd, B:217:0x02e0, B:221:0x02ed, B:225:0x02fd, B:227:0x0304, B:229:0x0308, B:252:0x0350, B:233:0x0314, B:235:0x031c, B:237:0x0320, B:239:0x0328, B:241:0x0330, B:245:0x0338, B:247:0x0341, B:248:0x0345, B:249:0x0348, B:254:0x0357, B:256:0x035e, B:45:0x0096, B:47:0x00a0, B:48:0x00a3, B:50:0x00ad, B:53:0x00bd, B:57:0x00c9, B:88:0x0126, B:90:0x012a, B:60:0x00ce, B:62:0x00d6, B:64:0x00da, B:66:0x00e2, B:68:0x00ea, B:72:0x00f2, B:74:0x00fb, B:75:0x00ff, B:76:0x0102, B:79:0x010a, B:80:0x010f, B:81:0x0114, B:83:0x011a, B:85:0x011e, B:91:0x0132, B:93:0x013c, B:94:0x013f, B:96:0x014d, B:99:0x015d, B:103:0x0169, B:134:0x01c6, B:136:0x01ca, B:106:0x016e, B:108:0x0176, B:110:0x017a, B:112:0x0182, B:114:0x018a, B:118:0x0192, B:120:0x019b, B:121:0x019f, B:122:0x01a2, B:125:0x01aa, B:126:0x01af, B:127:0x01b4, B:129:0x01ba, B:131:0x01be, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x016e A[Catch: all -> 0x0375, TryCatch #0 {all -> 0x0375, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x0062, B:31:0x0067, B:33:0x0073, B:35:0x007a, B:37:0x0082, B:41:0x008c, B:139:0x01d4, B:141:0x01de, B:142:0x01e1, B:144:0x01f0, B:147:0x0200, B:151:0x020c, B:154:0x0212, B:155:0x0217, B:175:0x0257, B:156:0x021b, B:158:0x0223, B:160:0x0227, B:162:0x022f, B:164:0x0237, B:168:0x023f, B:170:0x0248, B:171:0x024c, B:172:0x024f, B:176:0x025c, B:177:0x0261, B:179:0x0267, B:181:0x026b, B:184:0x0276, B:186:0x027e, B:193:0x0295, B:195:0x029c, B:197:0x02a0, B:220:0x02e8, B:201:0x02ac, B:203:0x02b4, B:205:0x02b8, B:207:0x02c0, B:209:0x02c8, B:213:0x02d0, B:215:0x02d9, B:216:0x02dd, B:217:0x02e0, B:221:0x02ed, B:225:0x02fd, B:227:0x0304, B:229:0x0308, B:252:0x0350, B:233:0x0314, B:235:0x031c, B:237:0x0320, B:239:0x0328, B:241:0x0330, B:245:0x0338, B:247:0x0341, B:248:0x0345, B:249:0x0348, B:254:0x0357, B:256:0x035e, B:45:0x0096, B:47:0x00a0, B:48:0x00a3, B:50:0x00ad, B:53:0x00bd, B:57:0x00c9, B:88:0x0126, B:90:0x012a, B:60:0x00ce, B:62:0x00d6, B:64:0x00da, B:66:0x00e2, B:68:0x00ea, B:72:0x00f2, B:74:0x00fb, B:75:0x00ff, B:76:0x0102, B:79:0x010a, B:80:0x010f, B:81:0x0114, B:83:0x011a, B:85:0x011e, B:91:0x0132, B:93:0x013c, B:94:0x013f, B:96:0x014d, B:99:0x015d, B:103:0x0169, B:134:0x01c6, B:136:0x01ca, B:106:0x016e, B:108:0x0176, B:110:0x017a, B:112:0x0182, B:114:0x018a, B:118:0x0192, B:120:0x019b, B:121:0x019f, B:122:0x01a2, B:125:0x01aa, B:126:0x01af, B:127:0x01b4, B:129:0x01ba, B:131:0x01be, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0176 A[Catch: all -> 0x0375, TryCatch #0 {all -> 0x0375, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x0062, B:31:0x0067, B:33:0x0073, B:35:0x007a, B:37:0x0082, B:41:0x008c, B:139:0x01d4, B:141:0x01de, B:142:0x01e1, B:144:0x01f0, B:147:0x0200, B:151:0x020c, B:154:0x0212, B:155:0x0217, B:175:0x0257, B:156:0x021b, B:158:0x0223, B:160:0x0227, B:162:0x022f, B:164:0x0237, B:168:0x023f, B:170:0x0248, B:171:0x024c, B:172:0x024f, B:176:0x025c, B:177:0x0261, B:179:0x0267, B:181:0x026b, B:184:0x0276, B:186:0x027e, B:193:0x0295, B:195:0x029c, B:197:0x02a0, B:220:0x02e8, B:201:0x02ac, B:203:0x02b4, B:205:0x02b8, B:207:0x02c0, B:209:0x02c8, B:213:0x02d0, B:215:0x02d9, B:216:0x02dd, B:217:0x02e0, B:221:0x02ed, B:225:0x02fd, B:227:0x0304, B:229:0x0308, B:252:0x0350, B:233:0x0314, B:235:0x031c, B:237:0x0320, B:239:0x0328, B:241:0x0330, B:245:0x0338, B:247:0x0341, B:248:0x0345, B:249:0x0348, B:254:0x0357, B:256:0x035e, B:45:0x0096, B:47:0x00a0, B:48:0x00a3, B:50:0x00ad, B:53:0x00bd, B:57:0x00c9, B:88:0x0126, B:90:0x012a, B:60:0x00ce, B:62:0x00d6, B:64:0x00da, B:66:0x00e2, B:68:0x00ea, B:72:0x00f2, B:74:0x00fb, B:75:0x00ff, B:76:0x0102, B:79:0x010a, B:80:0x010f, B:81:0x0114, B:83:0x011a, B:85:0x011e, B:91:0x0132, B:93:0x013c, B:94:0x013f, B:96:0x014d, B:99:0x015d, B:103:0x0169, B:134:0x01c6, B:136:0x01ca, B:106:0x016e, B:108:0x0176, B:110:0x017a, B:112:0x0182, B:114:0x018a, B:118:0x0192, B:120:0x019b, B:121:0x019f, B:122:0x01a2, B:125:0x01aa, B:126:0x01af, B:127:0x01b4, B:129:0x01ba, B:131:0x01be, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x01ba A[Catch: all -> 0x0375, TryCatch #0 {all -> 0x0375, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x0062, B:31:0x0067, B:33:0x0073, B:35:0x007a, B:37:0x0082, B:41:0x008c, B:139:0x01d4, B:141:0x01de, B:142:0x01e1, B:144:0x01f0, B:147:0x0200, B:151:0x020c, B:154:0x0212, B:155:0x0217, B:175:0x0257, B:156:0x021b, B:158:0x0223, B:160:0x0227, B:162:0x022f, B:164:0x0237, B:168:0x023f, B:170:0x0248, B:171:0x024c, B:172:0x024f, B:176:0x025c, B:177:0x0261, B:179:0x0267, B:181:0x026b, B:184:0x0276, B:186:0x027e, B:193:0x0295, B:195:0x029c, B:197:0x02a0, B:220:0x02e8, B:201:0x02ac, B:203:0x02b4, B:205:0x02b8, B:207:0x02c0, B:209:0x02c8, B:213:0x02d0, B:215:0x02d9, B:216:0x02dd, B:217:0x02e0, B:221:0x02ed, B:225:0x02fd, B:227:0x0304, B:229:0x0308, B:252:0x0350, B:233:0x0314, B:235:0x031c, B:237:0x0320, B:239:0x0328, B:241:0x0330, B:245:0x0338, B:247:0x0341, B:248:0x0345, B:249:0x0348, B:254:0x0357, B:256:0x035e, B:45:0x0096, B:47:0x00a0, B:48:0x00a3, B:50:0x00ad, B:53:0x00bd, B:57:0x00c9, B:88:0x0126, B:90:0x012a, B:60:0x00ce, B:62:0x00d6, B:64:0x00da, B:66:0x00e2, B:68:0x00ea, B:72:0x00f2, B:74:0x00fb, B:75:0x00ff, B:76:0x0102, B:79:0x010a, B:80:0x010f, B:81:0x0114, B:83:0x011a, B:85:0x011e, B:91:0x0132, B:93:0x013c, B:94:0x013f, B:96:0x014d, B:99:0x015d, B:103:0x0169, B:134:0x01c6, B:136:0x01ca, B:106:0x016e, B:108:0x0176, B:110:0x017a, B:112:0x0182, B:114:0x018a, B:118:0x0192, B:120:0x019b, B:121:0x019f, B:122:0x01a2, B:125:0x01aa, B:126:0x01af, B:127:0x01b4, B:129:0x01ba, B:131:0x01be, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x01ca A[Catch: all -> 0x0375, TryCatch #0 {all -> 0x0375, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x0062, B:31:0x0067, B:33:0x0073, B:35:0x007a, B:37:0x0082, B:41:0x008c, B:139:0x01d4, B:141:0x01de, B:142:0x01e1, B:144:0x01f0, B:147:0x0200, B:151:0x020c, B:154:0x0212, B:155:0x0217, B:175:0x0257, B:156:0x021b, B:158:0x0223, B:160:0x0227, B:162:0x022f, B:164:0x0237, B:168:0x023f, B:170:0x0248, B:171:0x024c, B:172:0x024f, B:176:0x025c, B:177:0x0261, B:179:0x0267, B:181:0x026b, B:184:0x0276, B:186:0x027e, B:193:0x0295, B:195:0x029c, B:197:0x02a0, B:220:0x02e8, B:201:0x02ac, B:203:0x02b4, B:205:0x02b8, B:207:0x02c0, B:209:0x02c8, B:213:0x02d0, B:215:0x02d9, B:216:0x02dd, B:217:0x02e0, B:221:0x02ed, B:225:0x02fd, B:227:0x0304, B:229:0x0308, B:252:0x0350, B:233:0x0314, B:235:0x031c, B:237:0x0320, B:239:0x0328, B:241:0x0330, B:245:0x0338, B:247:0x0341, B:248:0x0345, B:249:0x0348, B:254:0x0357, B:256:0x035e, B:45:0x0096, B:47:0x00a0, B:48:0x00a3, B:50:0x00ad, B:53:0x00bd, B:57:0x00c9, B:88:0x0126, B:90:0x012a, B:60:0x00ce, B:62:0x00d6, B:64:0x00da, B:66:0x00e2, B:68:0x00ea, B:72:0x00f2, B:74:0x00fb, B:75:0x00ff, B:76:0x0102, B:79:0x010a, B:80:0x010f, B:81:0x0114, B:83:0x011a, B:85:0x011e, B:91:0x0132, B:93:0x013c, B:94:0x013f, B:96:0x014d, B:99:0x015d, B:103:0x0169, B:134:0x01c6, B:136:0x01ca, B:106:0x016e, B:108:0x0176, B:110:0x017a, B:112:0x0182, B:114:0x018a, B:118:0x0192, B:120:0x019b, B:121:0x019f, B:122:0x01a2, B:125:0x01aa, B:126:0x01af, B:127:0x01b4, B:129:0x01ba, B:131:0x01be, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:327:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:0x01c3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x01aa A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0094  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096 A[Catch: all -> 0x0375, TryCatch #0 {all -> 0x0375, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x0062, B:31:0x0067, B:33:0x0073, B:35:0x007a, B:37:0x0082, B:41:0x008c, B:139:0x01d4, B:141:0x01de, B:142:0x01e1, B:144:0x01f0, B:147:0x0200, B:151:0x020c, B:154:0x0212, B:155:0x0217, B:175:0x0257, B:156:0x021b, B:158:0x0223, B:160:0x0227, B:162:0x022f, B:164:0x0237, B:168:0x023f, B:170:0x0248, B:171:0x024c, B:172:0x024f, B:176:0x025c, B:177:0x0261, B:179:0x0267, B:181:0x026b, B:184:0x0276, B:186:0x027e, B:193:0x0295, B:195:0x029c, B:197:0x02a0, B:220:0x02e8, B:201:0x02ac, B:203:0x02b4, B:205:0x02b8, B:207:0x02c0, B:209:0x02c8, B:213:0x02d0, B:215:0x02d9, B:216:0x02dd, B:217:0x02e0, B:221:0x02ed, B:225:0x02fd, B:227:0x0304, B:229:0x0308, B:252:0x0350, B:233:0x0314, B:235:0x031c, B:237:0x0320, B:239:0x0328, B:241:0x0330, B:245:0x0338, B:247:0x0341, B:248:0x0345, B:249:0x0348, B:254:0x0357, B:256:0x035e, B:45:0x0096, B:47:0x00a0, B:48:0x00a3, B:50:0x00ad, B:53:0x00bd, B:57:0x00c9, B:88:0x0126, B:90:0x012a, B:60:0x00ce, B:62:0x00d6, B:64:0x00da, B:66:0x00e2, B:68:0x00ea, B:72:0x00f2, B:74:0x00fb, B:75:0x00ff, B:76:0x0102, B:79:0x010a, B:80:0x010f, B:81:0x0114, B:83:0x011a, B:85:0x011e, B:91:0x0132, B:93:0x013c, B:94:0x013f, B:96:0x014d, B:99:0x015d, B:103:0x0169, B:134:0x01c6, B:136:0x01ca, B:106:0x016e, B:108:0x0176, B:110:0x017a, B:112:0x0182, B:114:0x018a, B:118:0x0192, B:120:0x019b, B:121:0x019f, B:122:0x01a2, B:125:0x01aa, B:126:0x01af, B:127:0x01b4, B:129:0x01ba, B:131:0x01be, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a0 A[Catch: all -> 0x0375, TryCatch #0 {all -> 0x0375, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x0062, B:31:0x0067, B:33:0x0073, B:35:0x007a, B:37:0x0082, B:41:0x008c, B:139:0x01d4, B:141:0x01de, B:142:0x01e1, B:144:0x01f0, B:147:0x0200, B:151:0x020c, B:154:0x0212, B:155:0x0217, B:175:0x0257, B:156:0x021b, B:158:0x0223, B:160:0x0227, B:162:0x022f, B:164:0x0237, B:168:0x023f, B:170:0x0248, B:171:0x024c, B:172:0x024f, B:176:0x025c, B:177:0x0261, B:179:0x0267, B:181:0x026b, B:184:0x0276, B:186:0x027e, B:193:0x0295, B:195:0x029c, B:197:0x02a0, B:220:0x02e8, B:201:0x02ac, B:203:0x02b4, B:205:0x02b8, B:207:0x02c0, B:209:0x02c8, B:213:0x02d0, B:215:0x02d9, B:216:0x02dd, B:217:0x02e0, B:221:0x02ed, B:225:0x02fd, B:227:0x0304, B:229:0x0308, B:252:0x0350, B:233:0x0314, B:235:0x031c, B:237:0x0320, B:239:0x0328, B:241:0x0330, B:245:0x0338, B:247:0x0341, B:248:0x0345, B:249:0x0348, B:254:0x0357, B:256:0x035e, B:45:0x0096, B:47:0x00a0, B:48:0x00a3, B:50:0x00ad, B:53:0x00bd, B:57:0x00c9, B:88:0x0126, B:90:0x012a, B:60:0x00ce, B:62:0x00d6, B:64:0x00da, B:66:0x00e2, B:68:0x00ea, B:72:0x00f2, B:74:0x00fb, B:75:0x00ff, B:76:0x0102, B:79:0x010a, B:80:0x010f, B:81:0x0114, B:83:0x011a, B:85:0x011e, B:91:0x0132, B:93:0x013c, B:94:0x013f, B:96:0x014d, B:99:0x015d, B:103:0x0169, B:134:0x01c6, B:136:0x01ca, B:106:0x016e, B:108:0x0176, B:110:0x017a, B:112:0x0182, B:114:0x018a, B:118:0x0192, B:120:0x019b, B:121:0x019f, B:122:0x01a2, B:125:0x01aa, B:126:0x01af, B:127:0x01b4, B:129:0x01ba, B:131:0x01be, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ad A[Catch: all -> 0x0375, TryCatch #0 {all -> 0x0375, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x0062, B:31:0x0067, B:33:0x0073, B:35:0x007a, B:37:0x0082, B:41:0x008c, B:139:0x01d4, B:141:0x01de, B:142:0x01e1, B:144:0x01f0, B:147:0x0200, B:151:0x020c, B:154:0x0212, B:155:0x0217, B:175:0x0257, B:156:0x021b, B:158:0x0223, B:160:0x0227, B:162:0x022f, B:164:0x0237, B:168:0x023f, B:170:0x0248, B:171:0x024c, B:172:0x024f, B:176:0x025c, B:177:0x0261, B:179:0x0267, B:181:0x026b, B:184:0x0276, B:186:0x027e, B:193:0x0295, B:195:0x029c, B:197:0x02a0, B:220:0x02e8, B:201:0x02ac, B:203:0x02b4, B:205:0x02b8, B:207:0x02c0, B:209:0x02c8, B:213:0x02d0, B:215:0x02d9, B:216:0x02dd, B:217:0x02e0, B:221:0x02ed, B:225:0x02fd, B:227:0x0304, B:229:0x0308, B:252:0x0350, B:233:0x0314, B:235:0x031c, B:237:0x0320, B:239:0x0328, B:241:0x0330, B:245:0x0338, B:247:0x0341, B:248:0x0345, B:249:0x0348, B:254:0x0357, B:256:0x035e, B:45:0x0096, B:47:0x00a0, B:48:0x00a3, B:50:0x00ad, B:53:0x00bd, B:57:0x00c9, B:88:0x0126, B:90:0x012a, B:60:0x00ce, B:62:0x00d6, B:64:0x00da, B:66:0x00e2, B:68:0x00ea, B:72:0x00f2, B:74:0x00fb, B:75:0x00ff, B:76:0x0102, B:79:0x010a, B:80:0x010f, B:81:0x0114, B:83:0x011a, B:85:0x011e, B:91:0x0132, B:93:0x013c, B:94:0x013f, B:96:0x014d, B:99:0x015d, B:103:0x0169, B:134:0x01c6, B:136:0x01ca, B:106:0x016e, B:108:0x0176, B:110:0x017a, B:112:0x0182, B:114:0x018a, B:118:0x0192, B:120:0x019b, B:121:0x019f, B:122:0x01a2, B:125:0x01aa, B:126:0x01af, B:127:0x01b4, B:129:0x01ba, B:131:0x01be, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00bb A[ADDED_TO_REGION, LOOP:12: B:52:0x00bb->B:80:0x010f, LOOP_START, PHI: r5
  0x00bb: PHI (r5v30 of2) = (r5v24 of2), (r5v31 of2) binds: [B:51:0x00b9, B:80:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00bd A[Catch: all -> 0x0375, TryCatch #0 {all -> 0x0375, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x0062, B:31:0x0067, B:33:0x0073, B:35:0x007a, B:37:0x0082, B:41:0x008c, B:139:0x01d4, B:141:0x01de, B:142:0x01e1, B:144:0x01f0, B:147:0x0200, B:151:0x020c, B:154:0x0212, B:155:0x0217, B:175:0x0257, B:156:0x021b, B:158:0x0223, B:160:0x0227, B:162:0x022f, B:164:0x0237, B:168:0x023f, B:170:0x0248, B:171:0x024c, B:172:0x024f, B:176:0x025c, B:177:0x0261, B:179:0x0267, B:181:0x026b, B:184:0x0276, B:186:0x027e, B:193:0x0295, B:195:0x029c, B:197:0x02a0, B:220:0x02e8, B:201:0x02ac, B:203:0x02b4, B:205:0x02b8, B:207:0x02c0, B:209:0x02c8, B:213:0x02d0, B:215:0x02d9, B:216:0x02dd, B:217:0x02e0, B:221:0x02ed, B:225:0x02fd, B:227:0x0304, B:229:0x0308, B:252:0x0350, B:233:0x0314, B:235:0x031c, B:237:0x0320, B:239:0x0328, B:241:0x0330, B:245:0x0338, B:247:0x0341, B:248:0x0345, B:249:0x0348, B:254:0x0357, B:256:0x035e, B:45:0x0096, B:47:0x00a0, B:48:0x00a3, B:50:0x00ad, B:53:0x00bd, B:57:0x00c9, B:88:0x0126, B:90:0x012a, B:60:0x00ce, B:62:0x00d6, B:64:0x00da, B:66:0x00e2, B:68:0x00ea, B:72:0x00f2, B:74:0x00fb, B:75:0x00ff, B:76:0x0102, B:79:0x010a, B:80:0x010f, B:81:0x0114, B:83:0x011a, B:85:0x011e, B:91:0x0132, B:93:0x013c, B:94:0x013f, B:96:0x014d, B:99:0x015d, B:103:0x0169, B:134:0x01c6, B:136:0x01ca, B:106:0x016e, B:108:0x0176, B:110:0x017a, B:112:0x0182, B:114:0x018a, B:118:0x0192, B:120:0x019b, B:121:0x019f, B:122:0x01a2, B:125:0x01aa, B:126:0x01af, B:127:0x01b4, B:129:0x01ba, B:131:0x01be, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c9 A[Catch: all -> 0x0375, TryCatch #0 {all -> 0x0375, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x0062, B:31:0x0067, B:33:0x0073, B:35:0x007a, B:37:0x0082, B:41:0x008c, B:139:0x01d4, B:141:0x01de, B:142:0x01e1, B:144:0x01f0, B:147:0x0200, B:151:0x020c, B:154:0x0212, B:155:0x0217, B:175:0x0257, B:156:0x021b, B:158:0x0223, B:160:0x0227, B:162:0x022f, B:164:0x0237, B:168:0x023f, B:170:0x0248, B:171:0x024c, B:172:0x024f, B:176:0x025c, B:177:0x0261, B:179:0x0267, B:181:0x026b, B:184:0x0276, B:186:0x027e, B:193:0x0295, B:195:0x029c, B:197:0x02a0, B:220:0x02e8, B:201:0x02ac, B:203:0x02b4, B:205:0x02b8, B:207:0x02c0, B:209:0x02c8, B:213:0x02d0, B:215:0x02d9, B:216:0x02dd, B:217:0x02e0, B:221:0x02ed, B:225:0x02fd, B:227:0x0304, B:229:0x0308, B:252:0x0350, B:233:0x0314, B:235:0x031c, B:237:0x0320, B:239:0x0328, B:241:0x0330, B:245:0x0338, B:247:0x0341, B:248:0x0345, B:249:0x0348, B:254:0x0357, B:256:0x035e, B:45:0x0096, B:47:0x00a0, B:48:0x00a3, B:50:0x00ad, B:53:0x00bd, B:57:0x00c9, B:88:0x0126, B:90:0x012a, B:60:0x00ce, B:62:0x00d6, B:64:0x00da, B:66:0x00e2, B:68:0x00ea, B:72:0x00f2, B:74:0x00fb, B:75:0x00ff, B:76:0x0102, B:79:0x010a, B:80:0x010f, B:81:0x0114, B:83:0x011a, B:85:0x011e, B:91:0x0132, B:93:0x013c, B:94:0x013f, B:96:0x014d, B:99:0x015d, B:103:0x0169, B:134:0x01c6, B:136:0x01ca, B:106:0x016e, B:108:0x0176, B:110:0x017a, B:112:0x0182, B:114:0x018a, B:118:0x0192, B:120:0x019b, B:121:0x019f, B:122:0x01a2, B:125:0x01aa, B:126:0x01af, B:127:0x01b4, B:129:0x01ba, B:131:0x01be, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ce A[Catch: all -> 0x0375, TryCatch #0 {all -> 0x0375, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x0062, B:31:0x0067, B:33:0x0073, B:35:0x007a, B:37:0x0082, B:41:0x008c, B:139:0x01d4, B:141:0x01de, B:142:0x01e1, B:144:0x01f0, B:147:0x0200, B:151:0x020c, B:154:0x0212, B:155:0x0217, B:175:0x0257, B:156:0x021b, B:158:0x0223, B:160:0x0227, B:162:0x022f, B:164:0x0237, B:168:0x023f, B:170:0x0248, B:171:0x024c, B:172:0x024f, B:176:0x025c, B:177:0x0261, B:179:0x0267, B:181:0x026b, B:184:0x0276, B:186:0x027e, B:193:0x0295, B:195:0x029c, B:197:0x02a0, B:220:0x02e8, B:201:0x02ac, B:203:0x02b4, B:205:0x02b8, B:207:0x02c0, B:209:0x02c8, B:213:0x02d0, B:215:0x02d9, B:216:0x02dd, B:217:0x02e0, B:221:0x02ed, B:225:0x02fd, B:227:0x0304, B:229:0x0308, B:252:0x0350, B:233:0x0314, B:235:0x031c, B:237:0x0320, B:239:0x0328, B:241:0x0330, B:245:0x0338, B:247:0x0341, B:248:0x0345, B:249:0x0348, B:254:0x0357, B:256:0x035e, B:45:0x0096, B:47:0x00a0, B:48:0x00a3, B:50:0x00ad, B:53:0x00bd, B:57:0x00c9, B:88:0x0126, B:90:0x012a, B:60:0x00ce, B:62:0x00d6, B:64:0x00da, B:66:0x00e2, B:68:0x00ea, B:72:0x00f2, B:74:0x00fb, B:75:0x00ff, B:76:0x0102, B:79:0x010a, B:80:0x010f, B:81:0x0114, B:83:0x011a, B:85:0x011e, B:91:0x0132, B:93:0x013c, B:94:0x013f, B:96:0x014d, B:99:0x015d, B:103:0x0169, B:134:0x01c6, B:136:0x01ca, B:106:0x016e, B:108:0x0176, B:110:0x017a, B:112:0x0182, B:114:0x018a, B:118:0x0192, B:120:0x019b, B:121:0x019f, B:122:0x01a2, B:125:0x01aa, B:126:0x01af, B:127:0x01b4, B:129:0x01ba, B:131:0x01be, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x012a A[Catch: all -> 0x0375, TryCatch #0 {all -> 0x0375, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x0062, B:31:0x0067, B:33:0x0073, B:35:0x007a, B:37:0x0082, B:41:0x008c, B:139:0x01d4, B:141:0x01de, B:142:0x01e1, B:144:0x01f0, B:147:0x0200, B:151:0x020c, B:154:0x0212, B:155:0x0217, B:175:0x0257, B:156:0x021b, B:158:0x0223, B:160:0x0227, B:162:0x022f, B:164:0x0237, B:168:0x023f, B:170:0x0248, B:171:0x024c, B:172:0x024f, B:176:0x025c, B:177:0x0261, B:179:0x0267, B:181:0x026b, B:184:0x0276, B:186:0x027e, B:193:0x0295, B:195:0x029c, B:197:0x02a0, B:220:0x02e8, B:201:0x02ac, B:203:0x02b4, B:205:0x02b8, B:207:0x02c0, B:209:0x02c8, B:213:0x02d0, B:215:0x02d9, B:216:0x02dd, B:217:0x02e0, B:221:0x02ed, B:225:0x02fd, B:227:0x0304, B:229:0x0308, B:252:0x0350, B:233:0x0314, B:235:0x031c, B:237:0x0320, B:239:0x0328, B:241:0x0330, B:245:0x0338, B:247:0x0341, B:248:0x0345, B:249:0x0348, B:254:0x0357, B:256:0x035e, B:45:0x0096, B:47:0x00a0, B:48:0x00a3, B:50:0x00ad, B:53:0x00bd, B:57:0x00c9, B:88:0x0126, B:90:0x012a, B:60:0x00ce, B:62:0x00d6, B:64:0x00da, B:66:0x00e2, B:68:0x00ea, B:72:0x00f2, B:74:0x00fb, B:75:0x00ff, B:76:0x0102, B:79:0x010a, B:80:0x010f, B:81:0x0114, B:83:0x011a, B:85:0x011e, B:91:0x0132, B:93:0x013c, B:94:0x013f, B:96:0x014d, B:99:0x015d, B:103:0x0169, B:134:0x01c6, B:136:0x01ca, B:106:0x016e, B:108:0x0176, B:110:0x017a, B:112:0x0182, B:114:0x018a, B:118:0x0192, B:120:0x019b, B:121:0x019f, B:122:0x01a2, B:125:0x01aa, B:126:0x01af, B:127:0x01b4, B:129:0x01ba, B:131:0x01be, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0132 A[Catch: all -> 0x0375, TryCatch #0 {all -> 0x0375, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x0062, B:31:0x0067, B:33:0x0073, B:35:0x007a, B:37:0x0082, B:41:0x008c, B:139:0x01d4, B:141:0x01de, B:142:0x01e1, B:144:0x01f0, B:147:0x0200, B:151:0x020c, B:154:0x0212, B:155:0x0217, B:175:0x0257, B:156:0x021b, B:158:0x0223, B:160:0x0227, B:162:0x022f, B:164:0x0237, B:168:0x023f, B:170:0x0248, B:171:0x024c, B:172:0x024f, B:176:0x025c, B:177:0x0261, B:179:0x0267, B:181:0x026b, B:184:0x0276, B:186:0x027e, B:193:0x0295, B:195:0x029c, B:197:0x02a0, B:220:0x02e8, B:201:0x02ac, B:203:0x02b4, B:205:0x02b8, B:207:0x02c0, B:209:0x02c8, B:213:0x02d0, B:215:0x02d9, B:216:0x02dd, B:217:0x02e0, B:221:0x02ed, B:225:0x02fd, B:227:0x0304, B:229:0x0308, B:252:0x0350, B:233:0x0314, B:235:0x031c, B:237:0x0320, B:239:0x0328, B:241:0x0330, B:245:0x0338, B:247:0x0341, B:248:0x0345, B:249:0x0348, B:254:0x0357, B:256:0x035e, B:45:0x0096, B:47:0x00a0, B:48:0x00a3, B:50:0x00ad, B:53:0x00bd, B:57:0x00c9, B:88:0x0126, B:90:0x012a, B:60:0x00ce, B:62:0x00d6, B:64:0x00da, B:66:0x00e2, B:68:0x00ea, B:72:0x00f2, B:74:0x00fb, B:75:0x00ff, B:76:0x0102, B:79:0x010a, B:80:0x010f, B:81:0x0114, B:83:0x011a, B:85:0x011e, B:91:0x0132, B:93:0x013c, B:94:0x013f, B:96:0x014d, B:99:0x015d, B:103:0x0169, B:134:0x01c6, B:136:0x01ca, B:106:0x016e, B:108:0x0176, B:110:0x017a, B:112:0x0182, B:114:0x018a, B:118:0x0192, B:120:0x019b, B:121:0x019f, B:122:0x01a2, B:125:0x01aa, B:126:0x01af, B:127:0x01b4, B:129:0x01ba, B:131:0x01be, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x013c A[Catch: all -> 0x0375, TryCatch #0 {all -> 0x0375, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x0062, B:31:0x0067, B:33:0x0073, B:35:0x007a, B:37:0x0082, B:41:0x008c, B:139:0x01d4, B:141:0x01de, B:142:0x01e1, B:144:0x01f0, B:147:0x0200, B:151:0x020c, B:154:0x0212, B:155:0x0217, B:175:0x0257, B:156:0x021b, B:158:0x0223, B:160:0x0227, B:162:0x022f, B:164:0x0237, B:168:0x023f, B:170:0x0248, B:171:0x024c, B:172:0x024f, B:176:0x025c, B:177:0x0261, B:179:0x0267, B:181:0x026b, B:184:0x0276, B:186:0x027e, B:193:0x0295, B:195:0x029c, B:197:0x02a0, B:220:0x02e8, B:201:0x02ac, B:203:0x02b4, B:205:0x02b8, B:207:0x02c0, B:209:0x02c8, B:213:0x02d0, B:215:0x02d9, B:216:0x02dd, B:217:0x02e0, B:221:0x02ed, B:225:0x02fd, B:227:0x0304, B:229:0x0308, B:252:0x0350, B:233:0x0314, B:235:0x031c, B:237:0x0320, B:239:0x0328, B:241:0x0330, B:245:0x0338, B:247:0x0341, B:248:0x0345, B:249:0x0348, B:254:0x0357, B:256:0x035e, B:45:0x0096, B:47:0x00a0, B:48:0x00a3, B:50:0x00ad, B:53:0x00bd, B:57:0x00c9, B:88:0x0126, B:90:0x012a, B:60:0x00ce, B:62:0x00d6, B:64:0x00da, B:66:0x00e2, B:68:0x00ea, B:72:0x00f2, B:74:0x00fb, B:75:0x00ff, B:76:0x0102, B:79:0x010a, B:80:0x010f, B:81:0x0114, B:83:0x011a, B:85:0x011e, B:91:0x0132, B:93:0x013c, B:94:0x013f, B:96:0x014d, B:99:0x015d, B:103:0x0169, B:134:0x01c6, B:136:0x01ca, B:106:0x016e, B:108:0x0176, B:110:0x017a, B:112:0x0182, B:114:0x018a, B:118:0x0192, B:120:0x019b, B:121:0x019f, B:122:0x01a2, B:125:0x01aa, B:126:0x01af, B:127:0x01b4, B:129:0x01ba, B:131:0x01be, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x014d A[Catch: all -> 0x0375, TryCatch #0 {all -> 0x0375, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x0062, B:31:0x0067, B:33:0x0073, B:35:0x007a, B:37:0x0082, B:41:0x008c, B:139:0x01d4, B:141:0x01de, B:142:0x01e1, B:144:0x01f0, B:147:0x0200, B:151:0x020c, B:154:0x0212, B:155:0x0217, B:175:0x0257, B:156:0x021b, B:158:0x0223, B:160:0x0227, B:162:0x022f, B:164:0x0237, B:168:0x023f, B:170:0x0248, B:171:0x024c, B:172:0x024f, B:176:0x025c, B:177:0x0261, B:179:0x0267, B:181:0x026b, B:184:0x0276, B:186:0x027e, B:193:0x0295, B:195:0x029c, B:197:0x02a0, B:220:0x02e8, B:201:0x02ac, B:203:0x02b4, B:205:0x02b8, B:207:0x02c0, B:209:0x02c8, B:213:0x02d0, B:215:0x02d9, B:216:0x02dd, B:217:0x02e0, B:221:0x02ed, B:225:0x02fd, B:227:0x0304, B:229:0x0308, B:252:0x0350, B:233:0x0314, B:235:0x031c, B:237:0x0320, B:239:0x0328, B:241:0x0330, B:245:0x0338, B:247:0x0341, B:248:0x0345, B:249:0x0348, B:254:0x0357, B:256:0x035e, B:45:0x0096, B:47:0x00a0, B:48:0x00a3, B:50:0x00ad, B:53:0x00bd, B:57:0x00c9, B:88:0x0126, B:90:0x012a, B:60:0x00ce, B:62:0x00d6, B:64:0x00da, B:66:0x00e2, B:68:0x00ea, B:72:0x00f2, B:74:0x00fb, B:75:0x00ff, B:76:0x0102, B:79:0x010a, B:80:0x010f, B:81:0x0114, B:83:0x011a, B:85:0x011e, B:91:0x0132, B:93:0x013c, B:94:0x013f, B:96:0x014d, B:99:0x015d, B:103:0x0169, B:134:0x01c6, B:136:0x01ca, B:106:0x016e, B:108:0x0176, B:110:0x017a, B:112:0x0182, B:114:0x018a, B:118:0x0192, B:120:0x019b, B:121:0x019f, B:122:0x01a2, B:125:0x01aa, B:126:0x01af, B:127:0x01b4, B:129:0x01ba, B:131:0x01be, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x015b A[ADDED_TO_REGION, LOOP:16: B:98:0x015b->B:126:0x01af, LOOP_START, PHI: r12
  0x015b: PHI (r12v14 of2) = (r12v8 of2), (r12v15 of2) binds: [B:97:0x0159, B:126:0x01af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x015d A[Catch: all -> 0x0375, TryCatch #0 {all -> 0x0375, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x0062, B:31:0x0067, B:33:0x0073, B:35:0x007a, B:37:0x0082, B:41:0x008c, B:139:0x01d4, B:141:0x01de, B:142:0x01e1, B:144:0x01f0, B:147:0x0200, B:151:0x020c, B:154:0x0212, B:155:0x0217, B:175:0x0257, B:156:0x021b, B:158:0x0223, B:160:0x0227, B:162:0x022f, B:164:0x0237, B:168:0x023f, B:170:0x0248, B:171:0x024c, B:172:0x024f, B:176:0x025c, B:177:0x0261, B:179:0x0267, B:181:0x026b, B:184:0x0276, B:186:0x027e, B:193:0x0295, B:195:0x029c, B:197:0x02a0, B:220:0x02e8, B:201:0x02ac, B:203:0x02b4, B:205:0x02b8, B:207:0x02c0, B:209:0x02c8, B:213:0x02d0, B:215:0x02d9, B:216:0x02dd, B:217:0x02e0, B:221:0x02ed, B:225:0x02fd, B:227:0x0304, B:229:0x0308, B:252:0x0350, B:233:0x0314, B:235:0x031c, B:237:0x0320, B:239:0x0328, B:241:0x0330, B:245:0x0338, B:247:0x0341, B:248:0x0345, B:249:0x0348, B:254:0x0357, B:256:0x035e, B:45:0x0096, B:47:0x00a0, B:48:0x00a3, B:50:0x00ad, B:53:0x00bd, B:57:0x00c9, B:88:0x0126, B:90:0x012a, B:60:0x00ce, B:62:0x00d6, B:64:0x00da, B:66:0x00e2, B:68:0x00ea, B:72:0x00f2, B:74:0x00fb, B:75:0x00ff, B:76:0x0102, B:79:0x010a, B:80:0x010f, B:81:0x0114, B:83:0x011a, B:85:0x011e, B:91:0x0132, B:93:0x013c, B:94:0x013f, B:96:0x014d, B:99:0x015d, B:103:0x0169, B:134:0x01c6, B:136:0x01ca, B:106:0x016e, B:108:0x0176, B:110:0x017a, B:112:0x0182, B:114:0x018a, B:118:0x0192, B:120:0x019b, B:121:0x019f, B:122:0x01a2, B:125:0x01aa, B:126:0x01af, B:127:0x01b4, B:129:0x01ba, B:131:0x01be, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:266:0x0007 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v20, types: [oi2] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [oi2] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v24, types: [of2] */
    /* JADX WARN: Type inference failed for: r12v25, types: [of2] */
    /* JADX WARN: Type inference failed for: r12v29, types: [of2] */
    /* JADX WARN: Type inference failed for: r12v30, types: [of2] */
    /* JADX WARN: Type inference failed for: r12v34, types: [of2] */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v43, types: [of2] */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [oi2] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [oi2] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r5v40 */
    public final boolean d(KeyEvent keyEvent, je1 je1Var) {
        of2 parent$ui_release;
        ux1 ux1VarM;
        iu0 iu0Var;
        iu0 iu0Var2;
        of2 node;
        yd ydVar;
        of2 of2VarE;
        oi2 oi2Var;
        of2 node2;
        ux1 ux1VarM2;
        iu0 iu0Var3;
        iu0 iu0Var4;
        yd ydVar2;
        oi2 oi2Var2;
        of2 of2VarE2;
        int size;
        yd ydVar3;
        db1 db1Var = this.f;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.g.f) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                Trace.endSection();
                return false;
            }
            long jY = av1.y(keyEvent);
            int iA = av1.A(keyEvent);
            if (iA == 2) {
                mh2 mh2Var = this.j;
                if (mh2Var == null) {
                    mh2Var = new mh2(3);
                    this.j = mh2Var;
                }
                mh2Var.d(jY);
            } else if (iA == 1) {
                mh2 mh2Var2 = this.j;
                if (mh2Var2 == null || !mh2Var2.a(jY)) {
                    Trace.endSection();
                    return false;
                }
                mh2 mh2Var3 = this.j;
                if (mh2Var3 != null) {
                    mh2Var3.e(jY);
                }
            }
            db1 db1VarQ = av1.q(db1Var);
            if (db1VarQ != null) {
                if (!db1VarQ.getNode().isAttached()) {
                    po1.b("visitLocalDescendants called on an unattached node");
                }
                of2 node3 = db1VarQ.getNode();
                if ((node3.getAggregateChildKindSet$ui_release() & 9216) != 0) {
                    node = null;
                    for (of2 child$ui_release = node3.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                        if ((child$ui_release.getKindSet$ui_release() & 9216) != 0) {
                            if ((child$ui_release.getKindSet$ui_release() & 1024) != 0) {
                                break;
                            }
                            node = child$ui_release;
                        }
                    }
                } else {
                    node = null;
                }
                if (node == null) {
                    if (db1VarQ == null) {
                        if (!db1Var.getNode().isAttached()) {
                            po1.b("visitAncestors called on an unattached node");
                        }
                        parent$ui_release = db1Var.getNode().getParent$ui_release();
                        ux1VarM = y64.M(db1Var);
                        loop15: while (true) {
                            if (ux1VarM != null) {
                                iu0Var = null;
                                break;
                            }
                            if ((((of2) ux1VarM.N.f).getAggregateChildKindSet$ui_release() & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                                while (parent$ui_release != null) {
                                    if ((parent$ui_release.getKindSet$ui_release() & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                                        of2VarE = parent$ui_release;
                                        oi2Var = null;
                                        while (of2VarE != null) {
                                            if (of2VarE instanceof cv1) {
                                                iu0Var = of2VarE;
                                                break loop15;
                                            }
                                            if ((of2VarE.getKindSet$ui_release() & ConstantsKt.DEFAULT_BUFFER_SIZE) == 0) {
                                            }
                                            of2VarE = y64.e(oi2Var);
                                        }
                                    }
                                    parent$ui_release = parent$ui_release.getParent$ui_release();
                                }
                            }
                            ux1VarM = ux1VarM.t();
                            if (ux1VarM != null) {
                            }
                        }
                        iu0Var2 = (cv1) iu0Var;
                        if (iu0Var2 != null) {
                            node = ((of2) iu0Var2).getNode();
                        } else {
                            node = null;
                        }
                    } else {
                        if (!db1VarQ.getNode().isAttached()) {
                            po1.b("visitAncestors called on an unattached node");
                        }
                        node2 = db1VarQ.getNode();
                        ux1VarM2 = y64.M(db1VarQ);
                        loop11: while (true) {
                            if (ux1VarM2 != null) {
                                iu0Var3 = null;
                                break;
                            }
                            if ((((of2) ux1VarM2.N.f).getAggregateChildKindSet$ui_release() & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                                while (node2 != null) {
                                    if ((node2.getKindSet$ui_release() & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                                        oi2Var2 = null;
                                        of2VarE2 = node2;
                                        while (of2VarE2 != null) {
                                            if (of2VarE2 instanceof cv1) {
                                                iu0Var3 = of2VarE2;
                                                break loop11;
                                            }
                                            if ((of2VarE2.getKindSet$ui_release() & ConstantsKt.DEFAULT_BUFFER_SIZE) == 0) {
                                            }
                                            of2VarE2 = y64.e(oi2Var2);
                                        }
                                    }
                                    node2 = node2.getParent$ui_release();
                                }
                            }
                            ux1VarM2 = ux1VarM2.t();
                            if (ux1VarM2 != null) {
                            }
                        }
                        iu0Var4 = (cv1) iu0Var3;
                        if (iu0Var4 != null) {
                            node = ((of2) iu0Var4).getNode();
                        } else {
                            if (!db1Var.getNode().isAttached()) {
                                po1.b("visitAncestors called on an unattached node");
                            }
                            parent$ui_release = db1Var.getNode().getParent$ui_release();
                            ux1VarM = y64.M(db1Var);
                            loop15: while (true) {
                                if (ux1VarM != null) {
                                    iu0Var = null;
                                    break;
                                }
                                if ((((of2) ux1VarM.N.f).getAggregateChildKindSet$ui_release() & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                                    while (parent$ui_release != null) {
                                        if ((parent$ui_release.getKindSet$ui_release() & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                                            of2VarE = parent$ui_release;
                                            oi2Var = null;
                                            while (of2VarE != null) {
                                                if (of2VarE instanceof cv1) {
                                                    iu0Var = of2VarE;
                                                    break loop15;
                                                }
                                                if ((of2VarE.getKindSet$ui_release() & ConstantsKt.DEFAULT_BUFFER_SIZE) == 0) {
                                                }
                                                of2VarE = y64.e(oi2Var);
                                            }
                                        }
                                        parent$ui_release = parent$ui_release.getParent$ui_release();
                                    }
                                }
                                ux1VarM = ux1VarM.t();
                                if (ux1VarM != null) {
                                }
                            }
                            iu0Var2 = (cv1) iu0Var;
                            if (iu0Var2 != null) {
                                node = ((of2) iu0Var2).getNode();
                            } else {
                                node = null;
                            }
                        }
                    }
                }
            } else if (db1VarQ == null) {
                if (!db1Var.getNode().isAttached()) {
                    po1.b("visitAncestors called on an unattached node");
                }
                parent$ui_release = db1Var.getNode().getParent$ui_release();
                ux1VarM = y64.M(db1Var);
                loop15: while (true) {
                    if (ux1VarM != null) {
                        iu0Var = null;
                        break;
                    }
                    if ((((of2) ux1VarM.N.f).getAggregateChildKindSet$ui_release() & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                        while (parent$ui_release != null) {
                            if ((parent$ui_release.getKindSet$ui_release() & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                                of2VarE = parent$ui_release;
                                oi2Var = null;
                                while (of2VarE != null) {
                                    if (of2VarE instanceof cv1) {
                                        iu0Var = of2VarE;
                                        break loop15;
                                    }
                                    if ((of2VarE.getKindSet$ui_release() & ConstantsKt.DEFAULT_BUFFER_SIZE) == 0 && (of2VarE instanceof ju0)) {
                                        of2 child$ui_release2 = ((ju0) of2VarE).d;
                                        int i = 0;
                                        while (child$ui_release2 != null) {
                                            if ((child$ui_release2.getKindSet$ui_release() & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    of2VarE = of2VarE;
                                                    oi2Var = oi2Var;
                                                    oi2Var = oi2Var;
                                                    of2VarE = child$ui_release2;
                                                } else {
                                                    if (oi2Var == null) {
                                                        oi2Var = new oi2(0, new of2[16]);
                                                    }
                                                    if (of2VarE != null) {
                                                        oi2Var.c(of2VarE);
                                                        of2VarE = null;
                                                    }
                                                    oi2Var.c(child$ui_release2);
                                                }
                                            } else {
                                                of2VarE = of2VarE;
                                                oi2Var = oi2Var;
                                            }
                                            child$ui_release2 = child$ui_release2.getChild$ui_release();
                                            of2VarE = of2VarE;
                                            oi2Var = oi2Var;
                                        }
                                        if (i == 1) {
                                            of2VarE = of2VarE;
                                            oi2Var = oi2Var;
                                        } else {
                                            of2VarE = of2VarE;
                                            oi2Var = oi2Var;
                                        }
                                    }
                                    of2VarE = y64.e(oi2Var);
                                }
                            }
                            parent$ui_release = parent$ui_release.getParent$ui_release();
                        }
                    }
                    ux1VarM = ux1VarM.t();
                    parent$ui_release = (ux1VarM != null || (ydVar = ux1VarM.N) == null) ? null : (es3) ydVar.e;
                }
                iu0Var2 = (cv1) iu0Var;
                if (iu0Var2 != null) {
                    node = ((of2) iu0Var2).getNode();
                } else {
                    node = null;
                }
            } else {
                if (!db1VarQ.getNode().isAttached()) {
                    po1.b("visitAncestors called on an unattached node");
                }
                node2 = db1VarQ.getNode();
                ux1VarM2 = y64.M(db1VarQ);
                loop11: while (true) {
                    if (ux1VarM2 != null) {
                        iu0Var3 = null;
                        break;
                    }
                    if ((((of2) ux1VarM2.N.f).getAggregateChildKindSet$ui_release() & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                        while (node2 != null) {
                            if ((node2.getKindSet$ui_release() & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                                oi2Var2 = null;
                                of2VarE2 = node2;
                                while (of2VarE2 != null) {
                                    if (of2VarE2 instanceof cv1) {
                                        iu0Var3 = of2VarE2;
                                        break loop11;
                                    }
                                    if ((of2VarE2.getKindSet$ui_release() & ConstantsKt.DEFAULT_BUFFER_SIZE) == 0 && (of2VarE2 instanceof ju0)) {
                                        of2 child$ui_release3 = ((ju0) of2VarE2).d;
                                        int i2 = 0;
                                        while (child$ui_release3 != null) {
                                            if ((child$ui_release3.getKindSet$ui_release() & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    of2VarE2 = of2VarE2;
                                                    oi2Var2 = oi2Var2;
                                                    oi2Var2 = oi2Var2;
                                                    of2VarE2 = child$ui_release3;
                                                } else {
                                                    if (oi2Var2 == null) {
                                                        oi2Var2 = new oi2(0, new of2[16]);
                                                    }
                                                    if (of2VarE2 != null) {
                                                        oi2Var2.c(of2VarE2);
                                                        of2VarE2 = null;
                                                    }
                                                    oi2Var2.c(child$ui_release3);
                                                }
                                            } else {
                                                of2VarE2 = of2VarE2;
                                                oi2Var2 = oi2Var2;
                                            }
                                            child$ui_release3 = child$ui_release3.getChild$ui_release();
                                            of2VarE2 = of2VarE2;
                                            oi2Var2 = oi2Var2;
                                        }
                                        if (i2 == 1) {
                                            of2VarE2 = of2VarE2;
                                            oi2Var2 = oi2Var2;
                                        } else {
                                            of2VarE2 = of2VarE2;
                                            oi2Var2 = oi2Var2;
                                        }
                                    }
                                    of2VarE2 = y64.e(oi2Var2);
                                }
                            }
                            node2 = node2.getParent$ui_release();
                        }
                    }
                    ux1VarM2 = ux1VarM2.t();
                    node2 = (ux1VarM2 != null || (ydVar2 = ux1VarM2.N) == null) ? null : (es3) ydVar2.e;
                }
                iu0Var4 = (cv1) iu0Var3;
                if (iu0Var4 != null) {
                    node = ((of2) iu0Var4).getNode();
                } else {
                    if (!db1Var.getNode().isAttached()) {
                        po1.b("visitAncestors called on an unattached node");
                    }
                    parent$ui_release = db1Var.getNode().getParent$ui_release();
                    ux1VarM = y64.M(db1Var);
                    loop15: while (true) {
                        if (ux1VarM != null) {
                            iu0Var = null;
                            break;
                        }
                        if ((((of2) ux1VarM.N.f).getAggregateChildKindSet$ui_release() & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                            while (parent$ui_release != null) {
                                if ((parent$ui_release.getKindSet$ui_release() & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                                    of2VarE = parent$ui_release;
                                    oi2Var = null;
                                    while (of2VarE != null) {
                                        if (of2VarE instanceof cv1) {
                                            iu0Var = of2VarE;
                                            break loop15;
                                        }
                                        if ((of2VarE.getKindSet$ui_release() & ConstantsKt.DEFAULT_BUFFER_SIZE) == 0) {
                                        }
                                        of2VarE = y64.e(oi2Var);
                                    }
                                }
                                parent$ui_release = parent$ui_release.getParent$ui_release();
                            }
                        }
                        ux1VarM = ux1VarM.t();
                        if (ux1VarM != null) {
                        }
                    }
                    iu0Var2 = (cv1) iu0Var;
                    if (iu0Var2 != null) {
                        node = ((of2) iu0Var2).getNode();
                    } else {
                        node = null;
                    }
                }
            }
            if (node != null) {
                if (!node.getNode().isAttached()) {
                    po1.b("visitAncestors called on an unattached node");
                }
                of2 parent$ui_release2 = node.getNode().getParent$ui_release();
                ux1 ux1VarM3 = y64.M(node);
                ArrayList arrayList = null;
                while (ux1VarM3 != null) {
                    if ((((of2) ux1VarM3.N.f).getAggregateChildKindSet$ui_release() & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                        while (parent$ui_release2 != null) {
                            if ((parent$ui_release2.getKindSet$ui_release() & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                                of2 of2VarE3 = parent$ui_release2;
                                oi2 oi2Var3 = null;
                                while (of2VarE3 != null) {
                                    if (of2VarE3 instanceof cv1) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(of2VarE3);
                                    } else if ((of2VarE3.getKindSet$ui_release() & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 && (of2VarE3 instanceof ju0)) {
                                        int i3 = 0;
                                        for (of2 child$ui_release4 = ((ju0) of2VarE3).d; child$ui_release4 != null; child$ui_release4 = child$ui_release4.getChild$ui_release()) {
                                            if ((child$ui_release4.getKindSet$ui_release() & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    of2VarE3 = child$ui_release4;
                                                } else {
                                                    if (oi2Var3 == null) {
                                                        oi2Var3 = new oi2(0, new of2[16]);
                                                    }
                                                    if (of2VarE3 != null) {
                                                        oi2Var3.c(of2VarE3);
                                                        of2VarE3 = null;
                                                    }
                                                    oi2Var3.c(child$ui_release4);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    of2VarE3 = y64.e(oi2Var3);
                                }
                            }
                            parent$ui_release2 = parent$ui_release2.getParent$ui_release();
                        }
                    }
                    ux1VarM3 = ux1VarM3.t();
                    parent$ui_release2 = (ux1VarM3 == null || (ydVar3 = ux1VarM3.N) == null) ? null : (es3) ydVar3.e;
                }
                if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                    while (true) {
                        int i4 = size - 1;
                        if (((cv1) arrayList.get(size)).j(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                        if (i4 < 0) {
                            break;
                        }
                        size = i4;
                    }
                }
                ?? node4 = node.getNode();
                ?? oi2Var4 = 0;
                while (node4 != 0) {
                    if (node4 instanceof cv1) {
                        if (((cv1) node4).j(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((node4.getKindSet$ui_release() & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 && (node4 instanceof ju0)) {
                        of2 child$ui_release5 = ((ju0) node4).d;
                        int i5 = 0;
                        while (child$ui_release5 != null) {
                            if ((child$ui_release5.getKindSet$ui_release() & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                                i5++;
                                if (i5 == 1) {
                                    oi2Var4 = oi2Var4;
                                    node4 = node4;
                                    oi2Var4 = oi2Var4;
                                    node4 = child$ui_release5;
                                } else {
                                    if (oi2Var4 == 0) {
                                        oi2Var4 = new oi2(0, new of2[16]);
                                    }
                                    if (node4 != 0) {
                                        oi2Var4.c(node4);
                                        node4 = 0;
                                    }
                                    oi2Var4.c(child$ui_release5);
                                }
                            } else {
                                oi2Var4 = oi2Var4;
                                node4 = node4;
                            }
                            child$ui_release5 = child$ui_release5.getChild$ui_release();
                            oi2Var4 = oi2Var4;
                            node4 = node4;
                        }
                        if (i5 == 1) {
                            oi2Var4 = oi2Var4;
                            node4 = node4;
                        } else {
                            oi2Var4 = oi2Var4;
                            node4 = node4;
                        }
                    }
                    node4 = y64.e(oi2Var4);
                }
                if (((Boolean) je1Var.invoke()).booleanValue()) {
                    Trace.endSection();
                    return true;
                }
                ?? node5 = node.getNode();
                ?? oi2Var5 = 0;
                while (node5 != 0) {
                    if (node5 instanceof cv1) {
                        if (((cv1) node5).R(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((node5.getKindSet$ui_release() & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 && (node5 instanceof ju0)) {
                        of2 child$ui_release6 = ((ju0) node5).d;
                        int i6 = 0;
                        while (child$ui_release6 != null) {
                            if ((child$ui_release6.getKindSet$ui_release() & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    node5 = node5;
                                    oi2Var5 = oi2Var5;
                                    oi2Var5 = oi2Var5;
                                    node5 = child$ui_release6;
                                } else {
                                    if (oi2Var5 == 0) {
                                        oi2Var5 = new oi2(0, new of2[16]);
                                    }
                                    if (node5 != 0) {
                                        oi2Var5.c(node5);
                                        node5 = 0;
                                    }
                                    oi2Var5.c(child$ui_release6);
                                }
                            } else {
                                node5 = node5;
                                oi2Var5 = oi2Var5;
                            }
                            child$ui_release6 = child$ui_release6.getChild$ui_release();
                            node5 = node5;
                            oi2Var5 = oi2Var5;
                        }
                        if (i6 == 1) {
                            node5 = node5;
                            oi2Var5 = oi2Var5;
                        } else {
                            node5 = node5;
                            oi2Var5 = oi2Var5;
                        }
                    }
                    node5 = y64.e(oi2Var5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        if (((cv1) arrayList.get(i7)).R(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    }
                }
            }
            Trace.endSection();
            return false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [of2] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r3v10, types: [of2] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [of2] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [oi2] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [oi2] */
    /* JADX WARN: Type inference failed for: r6v8 */
    public final Boolean e(int i, h43 h43Var, le1 le1Var) {
        Boolean bool;
        boolean zF;
        Object obj;
        yd ydVar;
        ?? parent$ui_release;
        db1 db1Var = this.f;
        db1 db1VarQ = av1.q(db1Var);
        int i2 = 4;
        je1 je1Var = this.e;
        if (db1VarQ != null) {
            dx1 dx1Var = (dx1) je1Var.invoke();
            bool = null;
            xa1 xa1VarW0 = db1VarQ.w0();
            za1 za1Var = xa1VarW0.h;
            za1 za1Var2 = xa1VarW0.i;
            if (i == 1) {
                za1Var = xa1VarW0.b;
            } else if (i == 2) {
                za1Var = xa1VarW0.c;
            } else if (i == 5) {
                za1Var = xa1VarW0.d;
            } else if (i == 6) {
                za1Var = xa1VarW0.e;
            } else if (i == 3) {
                int iOrdinal = dx1Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        u41.e();
                        return null;
                    }
                    za1Var = za1Var2;
                }
                if (za1Var == za1.b) {
                    za1Var = null;
                }
                if (za1Var == null) {
                    za1Var = xa1VarW0.f;
                }
            } else if (i == 4) {
                int iOrdinal2 = dx1Var.ordinal();
                if (iOrdinal2 == 0) {
                    za1Var = za1Var2;
                } else if (iOrdinal2 != 1) {
                    u41.e();
                    return null;
                }
                if (za1Var == za1.b) {
                    za1Var = null;
                }
                if (za1Var == null) {
                    za1Var = xa1VarW0.g;
                }
            } else {
                if (i != 7 && i != 8) {
                    u41.r("invalid FocusDirection");
                    return null;
                }
                n00 n00Var = new n00(i);
                jr1.t(db1VarQ);
                qa1 focusOwner = y64.N(db1VarQ).getFocusOwner();
                db1 db1Var2 = ((va1) focusOwner).l;
                if (i == 7) {
                    xa1VarW0.j.invoke(n00Var);
                } else {
                    xa1VarW0.k.invoke(n00Var);
                }
                if (n00Var.b) {
                    za1Var = za1.c;
                } else {
                    za1Var = db1Var2 != ((va1) focusOwner).l ? za1.d : za1.b;
                }
            }
            if (!kr1.n(za1Var, za1.c)) {
                if (kr1.n(za1Var, za1.d)) {
                    db1 db1VarQ2 = av1.q(db1Var);
                    if (db1VarQ2 != null) {
                        return (Boolean) le1Var.invoke(db1VarQ2);
                    }
                } else if (!kr1.n(za1Var, za1.b)) {
                    return Boolean.valueOf(za1Var.a(le1Var));
                }
            }
            return bool;
        }
        bool = null;
        db1VarQ = null;
        dx1 dx1Var2 = (dx1) je1Var.invoke();
        ie ieVar = new ie(db1VarQ, this, le1Var, 15);
        if (i == 1 || i == 2) {
            if (i == 1) {
                zF = gm4.x(db1Var, ieVar);
            } else {
                if (i != 2) {
                    u41.r("This function should only be used for 1-D focus search");
                    return bool;
                }
                zF = gm4.f(db1Var, ieVar);
            }
            return Boolean.valueOf(zF);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return yh4.c0(i, ieVar, db1Var, h43Var);
        }
        if (i == 7) {
            int iOrdinal3 = dx1Var2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    u41.e();
                    return bool;
                }
                i2 = 3;
            }
            db1 db1VarQ3 = av1.q(db1Var);
            if (db1VarQ3 != null) {
                return yh4.c0(i2, ieVar, db1VarQ3, h43Var);
            }
            return bool;
        }
        if (i != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) fa1.a(i))).toString());
        }
        db1 db1VarQ4 = av1.q(db1Var);
        boolean zBooleanValue = false;
        if (db1VarQ4 != null) {
            if (!db1VarQ4.getNode().isAttached()) {
                po1.b("visitAncestors called on an unattached node");
            }
            Object parent$ui_release2 = db1VarQ4.getNode().getParent$ui_release();
            ux1 ux1VarM = y64.M(db1VarQ4);
            loop0: while (true) {
                if (ux1VarM == null) {
                    obj = bool;
                    break;
                }
                if ((((of2) ux1VarM.N.f).getAggregateChildKindSet$ui_release() & 1024) != 0) {
                    while (parent$ui_release != 0) {
                        if ((parent$ui_release.getKindSet$ui_release() & 1024) != 0) {
                            ?? E = parent$ui_release;
                            ?? oi2Var = bool;
                            while (E != 0) {
                                if (E instanceof db1) {
                                    db1 db1Var3 = (db1) E;
                                    if (db1Var3.w0().a) {
                                        obj = db1Var3;
                                        break loop0;
                                    }
                                } else if ((E.getKindSet$ui_release() & 1024) != 0 && (E instanceof ju0)) {
                                    of2 child$ui_release = ((ju0) E).d;
                                    int i3 = 0;
                                    while (child$ui_release != null) {
                                        if ((child$ui_release.getKindSet$ui_release() & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                E = E;
                                                oi2Var = oi2Var;
                                                oi2Var = oi2Var;
                                                E = child$ui_release;
                                            } else {
                                                if (oi2Var == 0) {
                                                    oi2Var = new oi2(0, new of2[16]);
                                                }
                                                if (E != 0) {
                                                    oi2Var.c(E);
                                                    E = bool;
                                                }
                                                oi2Var.c(child$ui_release);
                                            }
                                        } else {
                                            E = E;
                                            oi2Var = oi2Var;
                                        }
                                        child$ui_release = child$ui_release.getChild$ui_release();
                                        E = E;
                                        oi2Var = oi2Var;
                                    }
                                    if (i3 == 1) {
                                        E = E;
                                        oi2Var = oi2Var;
                                    } else {
                                        E = E;
                                        oi2Var = oi2Var;
                                    }
                                }
                                E = y64.e(oi2Var);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                parent$ui_release = parent$ui_release2;
                ux1VarM = ux1VarM.t();
                parent$ui_release2 = (ux1VarM == null || (ydVar = ux1VarM.N) == null) ? bool : (es3) ydVar.e;
            }
        } else {
            obj = bool;
            break;
        }
        if (obj != null && obj != db1Var) {
            zBooleanValue = ((Boolean) ieVar.invoke(obj)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public final boolean f(int i) {
        q43 q43Var = new q43();
        q43Var.c = Boolean.FALSE;
        this.h.getClass();
        db1 db1Var = this.l;
        Boolean boolE = e(i, (h43) this.d.invoke(), new ta1(i, 0, q43Var));
        Boolean bool = Boolean.TRUE;
        if (!kr1.n(boolE, bool) || db1Var == this.l) {
            if (boolE != null && q43Var.c != null) {
                if (!boolE.equals(bool) || !kr1.n(q43Var.c, bool)) {
                    if (i != 1 && i != 2) {
                        if (((Boolean) this.b.invoke(new fa1(i))).booleanValue()) {
                        }
                    } else if (b(i, false, false)) {
                        Boolean boolE2 = e(i, null, new ua1(i));
                        if (boolE2 != null ? boolE2.booleanValue() : false) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void g(db1 db1Var) {
        ux1 ux1VarM;
        ue3 ue3VarV;
        ux1 ux1VarM2;
        ue3 ue3VarV2;
        db1 db1Var2 = this.l;
        this.l = db1Var;
        vh2 vh2Var = this.k;
        Object[] objArr = vh2Var.a;
        int i = vh2Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            m9 m9Var = (m9) objArr[i2];
            m9Var.getClass();
            if (db1Var2 != null && (ux1VarM2 = y64.M(db1Var2)) != null && (ue3VarV2 = ux1VarM2.v()) != null && ue3VarV2.c.b(te3.g)) {
                ((AutofillManager) m9Var.a.c).notifyViewExited(m9Var.c, ux1VarM2.d);
            }
            if (db1Var != null && (ux1VarM = y64.M(db1Var)) != null && (ue3VarV = ux1VarM.v()) != null && ue3VarV.c.b(te3.g)) {
                int i3 = ux1VarM.d;
                m9Var.d.a.r(i3, new k9(m9Var, i3));
            }
        }
    }
}
