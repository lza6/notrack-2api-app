package kotlin.annotation;

import app.template.extension.BuildConfig;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({ElementType.ANNOTATION_TYPE})
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0012\u0012\u0010\b\u0002\u0010\u0002\u001a\u00020\u0003B\u0006\b\n0\u00038\u0004R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/annotation/Retention;", BuildConfig.VERSION_NAME, "value", "Lkotlin/annotation/AnnotationRetention;", "RUNTIME", "()Lkotlin/annotation/AnnotationRetention;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
@java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
public @interface Retention {
    AnnotationRetention value() default AnnotationRetention.RUNTIME;
}
