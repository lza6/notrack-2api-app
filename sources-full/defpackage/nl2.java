package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class nl2 extends bu1 {
    public static Long S(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // defpackage.bu1, defpackage.a71
    public final z61 L(mt2 mt2Var) {
        mt2 mt2Var2;
        mt2Var.getClass();
        Path path = Paths.get(mt2Var.c.p(), new String[0]);
        path.getClass();
        try {
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = mt2.d;
                mt2Var2 = Path$Companion.get(symbolicLink.toString());
            } else {
                mt2Var2 = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lS = fileTimeCreationTime != null ? S(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lS2 = fileTimeLastModifiedTime != null ? S(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new z61(zIsRegularFile, zIsDirectory, mt2Var2, lValueOf, lS, lS2, fileTimeLastAccessTime != null ? S(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // defpackage.bu1, defpackage.a71
    public final void c(mt2 mt2Var, mt2 mt2Var2) throws IOException {
        mt2Var.getClass();
        mt2Var2.getClass();
        try {
            Path path = Paths.get(mt2Var.c.p(), new String[0]);
            path.getClass();
            Path path2 = Paths.get(mt2Var2.c.p(), new String[0]);
            path2.getClass();
            Files.move(path, path2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            m51.l("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // defpackage.bu1
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
