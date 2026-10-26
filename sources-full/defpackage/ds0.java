package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ds0 extends mq3 implements ne1 {
    public long A;
    public int B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ String D;
    public final /* synthetic */ long E;
    public final /* synthetic */ long F;
    public final /* synthetic */ mi2 G;
    public final /* synthetic */ Map H;
    public j23 c;
    public List d;
    public double[] h;
    public double[] l;
    public boolean[] m;
    public char[] n;
    public char[] o;
    public String p;
    public Map q;
    public mi2 r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public long y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds0(boolean z, String str, long j, long j2, mi2 mi2Var, Map map, so0 so0Var) {
        super(2, so0Var);
        this.C = z;
        this.D = str;
        this.E = j;
        this.F = j2;
        this.G = mi2Var;
        this.H = map;
    }

    public static final char a(Map map, String str, j23 j23Var, int i) {
        String str2 = (String) map.get(Character.valueOf(str.charAt(i)));
        if (str2 == null) {
            str2 = "!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz";
        }
        return str2.charAt(j23Var.d(str2.length()));
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        return new ds0(this.C, this.D, this.E, this.F, this.G, this.H, so0Var);
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return ((ds0) create((gq0) obj, (so0) obj2)).invokeSuspend(w84.a);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x020e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0240  */
    /* JADX WARN: Code duplicated, block: B:54:0x0251  */
    /* JADX WARN: Code duplicated, block: B:58:0x0265  */
    /* JADX WARN: Code duplicated, block: B:60:0x0273  */
    /* JADX WARN: Code duplicated, block: B:65:0x0292  */
    /* JADX WARN: Code duplicated, block: B:95:0x02ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0286 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v17, types: [boolean[], char[], double[], java.lang.String, java.util.Map, mi2] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0240 -> B:52:0x0247). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x034e -> B:77:0x0377). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x03eb -> B:8:0x006b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.wr
    public final java.lang.Object invokeSuspend(java.lang.Object r40) {
        /*
            Method dump skipped, instruction units count: 1064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
