package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import notrack.ai.data.api.ChatEvent;

/* JADX INFO: loaded from: classes.dex */
public final class fn2 implements qu1 {
    public final Object a;
    public final List b;
    public final ly1 c;

    public fn2(String str, Object obj) {
        obj.getClass();
        this.a = obj;
        this.b = z21.c;
        this.c = yo4.H(q22.c, new ye(str, 20, this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fn2(String str, ChatEvent chatEvent, Annotation[] annotationArr) {
        this(str, chatEvent);
        chatEvent.getClass();
        List listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.b = listAsList;
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 descriptor = getDescriptor();
        nk0 nk0VarB = hs0Var.B(descriptor);
        int iH = nk0VarB.h(getDescriptor());
        if (iH != -1) {
            throw new ag3(ud2.m(iH, "Unexpected index "));
        }
        nk0VarB.q(descriptor);
        return this.a;
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return (tf3) this.c.getValue();
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        obj.getClass();
        do3Var.a(getDescriptor()).v(getDescriptor());
    }
}
