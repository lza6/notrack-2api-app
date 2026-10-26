package ru.noties.jlatexmath.swing;

import ru.noties.jlatexmath.awt.Component;
import ru.noties.jlatexmath.awt.Graphics;

/* JADX INFO: loaded from: classes.dex */
public interface Icon {
    int getIconHeight();

    int getIconWidth();

    void paintIcon(Component component, Graphics graphics, int i, int i2);
}
