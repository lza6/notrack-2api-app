package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s94 {
    public static final yf f = new yf(0.0f);
    public final xb4 a;
    public long b = Long.MIN_VALUE;
    public yf c = f;
    public boolean d;
    public float e;

    public s94(tm3 tm3Var) {
        this.a = tm3Var.a(mb4.a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0087 A[Catch: all -> 0x00f4, PHI: r0 r1 r2 r3 r13
  0x0087: PHI (r0v8 le1) = (r0v1 le1), (r0v9 le1) binds: [B:31:0x007e, B:39:0x00b8] A[DONT_GENERATE, DONT_INLINE]
  0x0087: PHI (r1v13 s94) = (r1v8 s94), (r1v14 s94) binds: [B:31:0x007e, B:39:0x00b8] A[DONT_GENERATE, DONT_INLINE]
  0x0087: PHI (r2v7 je1) = (r2v3 je1), (r2v8 je1) binds: [B:31:0x007e, B:39:0x00b8] A[DONT_GENERATE, DONT_INLINE]
  0x0087: PHI (r3v7 float) = (r3v2 float), (r3v8 float) binds: [B:31:0x007e, B:39:0x00b8] A[DONT_GENERATE, DONT_INLINE]
  0x0087: PHI (r13v2 r94) = (r13v0 r94), (r13v3 r94) binds: [B:31:0x007e, B:39:0x00b8] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x00f4, blocks: (B:38:0x00b3, B:32:0x0087, B:35:0x0095, B:40:0x00ba, B:43:0x00c5), top: B:56:0x00b3 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095 A[Catch: all -> 0x00f4, TryCatch #0 {all -> 0x00f4, blocks: (B:38:0x00b3, B:32:0x0087, B:35:0x0095, B:40:0x00ba, B:43:0x00c5), top: B:56:0x00b3 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba A[Catch: all -> 0x00f4, PHI: r0 r1 r2 r13
  0x00ba: PHI (r0v3 le1) = (r0v8 le1), (r0v9 le1) binds: [B:34:0x0094, B:39:0x00b8] A[DONT_GENERATE, DONT_INLINE]
  0x00ba: PHI (r1v12 s94) = (r1v13 s94), (r1v14 s94) binds: [B:34:0x0094, B:39:0x00b8] A[DONT_GENERATE, DONT_INLINE]
  0x00ba: PHI (r2v5 je1) = (r2v7 je1), (r2v8 je1) binds: [B:34:0x0094, B:39:0x00b8] A[DONT_GENERATE, DONT_INLINE]
  0x00ba: PHI (r13v1 r94) = (r13v2 r94), (r13v3 r94) binds: [B:34:0x0094, B:39:0x00b8] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x00f4, blocks: (B:38:0x00b3, B:32:0x0087, B:35:0x0095, B:40:0x00ba, B:43:0x00c5), top: B:56:0x00b3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c5 A[Catch: all -> 0x00f4, TRY_LEAVE, TryCatch #0 {all -> 0x00f4, blocks: (B:38:0x00b3, B:32:0x0087, B:35:0x0095, B:40:0x00ba, B:43:0x00c5), top: B:56:0x00b3 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b3 A[EXC_TOP_SPLITTER, PHI: r0 r1 r2 r3 r13
  0x00b3: PHI (r0v9 le1) = (r0v8 le1), (r0v16 le1) binds: [B:36:0x00b0, B:21:0x0052] A[DONT_GENERATE, DONT_INLINE]
  0x00b3: PHI (r1v14 s94) = (r1v13 s94), (r1v18 s94) binds: [B:36:0x00b0, B:21:0x0052] A[DONT_GENERATE, DONT_INLINE]
  0x00b3: PHI (r2v8 je1) = (r2v7 je1), (r2v13 je1) binds: [B:36:0x00b0, B:21:0x0052] A[DONT_GENERATE, DONT_INLINE]
  0x00b3: PHI (r3v8 float) = (r3v7 float), (r3v10 float) binds: [B:36:0x00b0, B:21:0x0052] A[DONT_GENERATE, DONT_INLINE]
  0x00b3: PHI (r13v3 r94) = (r13v2 r94), (r13v6 r94) binds: [B:36:0x00b0, B:21:0x0052] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b0 -> B:56:0x00b3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(defpackage.ie r17, defpackage.oh r18, defpackage.uo0 r19) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s94.a(ie, oh, uo0):java.lang.Object");
    }
}
