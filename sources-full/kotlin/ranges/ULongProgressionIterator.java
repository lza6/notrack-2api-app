package kotlin.ranges;

import app.template.extension.BuildConfig;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000b\u001a\u00020\fH\u0096\u0002J\u0010\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0010\u0010\t\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0010\u0010\r\u001a\u00020\u0002X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0010"}, d2 = {"Lkotlin/ranges/ULongProgressionIterator;", BuildConfig.VERSION_NAME, "Lkotlin/ULong;", "first", "last", "step", BuildConfig.VERSION_NAME, "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "finalElement", "J", "hasNext", BuildConfig.VERSION_NAME, "next", "next-s-VKNKU", "()J", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class ULongProgressionIterator implements Iterator<ULong>, KMappedMarker {
    private final long finalElement;
    private boolean hasNext;
    private long next;
    private final long step;

    private ULongProgressionIterator(long j, long j2, long j3) {
        this.finalElement = j2;
        boolean z = true;
        if (j3 <= 0 ? Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) < 0 : Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) > 0) {
            z = false;
        }
        this.hasNext = z;
        this.step = ULong.m402xf1229813(j3);
        this.next = this.hasNext ? j : j2;
    }

    public /* synthetic */ ULongProgressionIterator(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ ULong next() {
        return ULong.m396boximpl(m1519x15a9a8af());
    }

    /* JADX INFO: renamed from: next-s-VKNKU, reason: not valid java name */
    public long m1519x15a9a8af() {
        long j = this.next;
        if (j != this.finalElement) {
            this.next = ULong.m402xf1229813(this.step + j);
            return j;
        }
        if (!this.hasNext) {
            throw new NoSuchElementException();
        }
        this.hasNext = false;
        return j;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
