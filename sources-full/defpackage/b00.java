package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class b00 implements du1, Serializable {
    public static final Object NO_RECEIVER = a00.c;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient du1 reflected;
    private final String signature;

    public b00(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.du1
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.du1
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public du1 compute() {
        du1 du1Var = this.reflected;
        if (du1Var != null) {
            return du1Var;
        }
        du1 du1VarComputeReflected = computeReflected();
        this.reflected = du1VarComputeReflected;
        return du1VarComputeReflected;
    }

    public abstract du1 computeReflected();

    @Override // defpackage.cu1
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public eu1 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return r43.a(cls);
        }
        r43.a.getClass();
        return new cs2(cls);
    }

    @Override // defpackage.du1
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract du1 getReflected();

    @Override // defpackage.du1
    public ru1 getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.du1
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.du1
    public su1 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.du1
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.du1
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.du1
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // defpackage.du1
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
