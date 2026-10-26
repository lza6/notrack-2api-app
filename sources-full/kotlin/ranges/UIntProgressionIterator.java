package kotlin.ranges;

import app.template.extension.BuildConfig;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000b\u001a\u00020\fH\u0096\u0002J\u0010\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0010\u0010\t\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0010\u0010\r\u001a\u00020\u0002X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0010"}, d2 = {"Lkotlin/ranges/UIntProgressionIterator;", BuildConfig.VERSION_NAME, "Lkotlin/UInt;", "first", "last", "step", BuildConfig.VERSION_NAME, "<init>", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "finalElement", "I", "hasNext", BuildConfig.VERSION_NAME, "next", "next-pVg5ArA", "()I", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class UIntProgressionIterator implements Iterator<UInt>, KMappedMarker {
    private final int finalElement;
    private boolean hasNext;
    private int next;
    private final int step;

    private UIntProgressionIterator(int i, int i2, int i3) {
        this.finalElement = i2;
        boolean z = true;
        if (i3 <= 0 ? Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) < 0 : Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) > 0) {
            z = false;
        }
        this.hasNext = z;
        this.step = UInt.m323xf1229813(i3);
        this.next = this.hasNext ? i : i2;
    }

    public /* synthetic */ UIntProgressionIterator(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ UInt next() {
        return UInt.m317boximpl(m1510xbdd30ba2());
    }

    /* JADX INFO: renamed from: next-pVg5ArA, reason: not valid java name */
    public int m1510xbdd30ba2() {
        int i = this.next;
        if (i != this.finalElement) {
            this.next = UInt.m323xf1229813(this.step + i);
            return i;
        }
        if (!this.hasNext) {
            throw new NoSuchElementException();
        }
        this.hasNext = false;
        return i;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
