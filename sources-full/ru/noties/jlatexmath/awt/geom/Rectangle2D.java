package ru.noties.jlatexmath.awt.geom;

import defpackage.fq2;

/* JADX INFO: loaded from: classes.dex */
public abstract class Rectangle2D {

    public static class Float extends Rectangle2D {
        public float h;
        public float w;
        public float x;
        public float y;

        public Float(float f, float f2, float f3, float f4) {
            this.x = f;
            this.y = f2;
            this.w = f3;
            this.h = f4;
        }

        @Override // ru.noties.jlatexmath.awt.geom.Rectangle2D
        public float getHeight() {
            return this.h;
        }

        @Override // ru.noties.jlatexmath.awt.geom.Rectangle2D
        public float getWidth() {
            return this.w;
        }

        @Override // ru.noties.jlatexmath.awt.geom.Rectangle2D
        public float getX() {
            return this.x;
        }

        @Override // ru.noties.jlatexmath.awt.geom.Rectangle2D
        public float getY() {
            return this.y;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Float{x=");
            sb.append(this.x);
            sb.append(", y=");
            sb.append(this.y);
            sb.append(", w=");
            sb.append(this.w);
            sb.append(", h=");
            return fq2.o(sb, this.h, '}');
        }
    }

    public abstract float getHeight();

    public abstract float getWidth();

    public abstract float getX();

    public abstract float getY();
}
