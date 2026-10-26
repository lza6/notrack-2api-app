package ru.noties.jlatexmath.awt.geom;

import defpackage.fq2;

/* JADX INFO: loaded from: classes.dex */
public class RoundRectangle2D {

    public static class Float {
        public float archeight;
        public float arcwidth;
        public float height;
        public float width;
        public float x;
        public float y;

        public Float(float f, float f2, float f3, float f4, float f5, float f6) {
            this.x = f;
            this.y = f2;
            this.width = f3;
            this.height = f4;
            this.arcwidth = f5;
            this.archeight = f6;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Float{x=");
            sb.append(this.x);
            sb.append(", y=");
            sb.append(this.y);
            sb.append(", width=");
            sb.append(this.width);
            sb.append(", height=");
            sb.append(this.height);
            sb.append(", arcwidth=");
            sb.append(this.arcwidth);
            sb.append(", archeight=");
            return fq2.o(sb, this.archeight, '}');
        }
    }
}
