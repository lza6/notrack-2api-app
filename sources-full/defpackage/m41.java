package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m41 extends h63 implements ne1 {
    public final /* synthetic */ int d;
    public long[] h;
    public int l;
    public int m;
    public int n;
    public int o;
    public long p;
    public int q;
    public /* synthetic */ Object r;
    public Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m41(Object obj, so0 so0Var, int i) {
        super(2, so0Var);
        this.d = i;
        this.t = obj;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.d;
        Object obj2 = this.t;
        switch (i) {
            case 0:
                m41 m41Var = new m41((n41) obj2, so0Var, 0);
                m41Var.r = obj;
                return m41Var;
            case 1:
                m41 m41Var2 = new m41((n41) obj2, so0Var, 1);
                m41Var2.r = obj;
                return m41Var2;
            case 2:
                m41 m41Var3 = new m41((ta3) obj2, so0Var, 2);
                m41Var3.r = obj;
                return m41Var3;
            default:
                m41 m41Var4 = new m41((kp3) obj2, so0Var, 3);
                m41Var4.r = obj;
                return m41Var4;
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w84 w84Var = w84.a;
        qf3 qf3Var = (qf3) obj;
        so0 so0Var = (so0) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((m41) create(qf3Var, so0Var)).invokeSuspend(w84Var);
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0223  */
    /* JADX WARN: Code duplicated, block: B:85:0x0270 A[DONT_INVERT, PHI: r1 r4 r5 r6 r8
  0x0270: PHI (r1v6 qf3) = (r1v4 qf3), (r1v8 qf3) binds: [B:76:0x0221, B:84:0x026b] A[DONT_GENERATE, DONT_INLINE]
  0x0270: PHI (r4v4 long[]) = (r4v2 long[]), (r4v6 long[]) binds: [B:76:0x0221, B:84:0x026b] A[DONT_GENERATE, DONT_INLINE]
  0x0270: PHI (r5v4 int) = (r5v2 int), (r5v6 int) binds: [B:76:0x0221, B:84:0x026b] A[DONT_GENERATE, DONT_INLINE]
  0x0270: PHI (r6v2 int) = (r6v1 int), (r6v4 int) binds: [B:76:0x0221, B:84:0x026b] A[DONT_GENERATE, DONT_INLINE]
  0x0270: PHI (r8v4 n41) = (r8v2 n41), (r8v6 n41) binds: [B:76:0x0221, B:84:0x026b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0272  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x006d -> B:22:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x006f -> B:15:0x007e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0084 -> B:19:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00fe -> B:43:0x013e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0100 -> B:36:0x0111). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0117 -> B:40:0x0135). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0190 -> B:64:0x01d0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0192 -> B:57:0x01a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01a9 -> B:61:0x01c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0221 -> B:85:0x0270). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0223 -> B:78:0x0235). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x023b -> B:82:0x0266). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.wr
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m41.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
