package app.template.extension.extension;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsProvider;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes.dex */
public final class InternalDataDocumentsProvider extends DocumentsProvider {
    private static final String ROOT_DOCUMENT_ID = "/";
    private static final String ROOT_ID = "internal-data-root";

    private File baseDir() throws FileNotFoundException {
        File filesDir = getContext() == null ? null : getContext().getFilesDir();
        File parentFile = filesDir != null ? filesDir.getParentFile() : null;
        if (parentFile != null) {
            return parentFile;
        }
        throw new FileNotFoundException("Internal data directory unavailable");
    }

    private static String[] documentProjection() {
        return new String[]{"document_id", "_display_name", "_size", "last_modified", "mime_type", "flags"};
    }

    private void includeFile(MatrixCursor matrixCursor, File file, String str) {
        MatrixCursor.RowBuilder rowBuilderNewRow = matrixCursor.newRow();
        rowBuilderNewRow.add("document_id", str);
        rowBuilderNewRow.add("_display_name", file.getName().isEmpty() ? "data" : file.getName());
        rowBuilderNewRow.add("_size", Long.valueOf(file.isFile() ? file.length() : 0L));
        rowBuilderNewRow.add("last_modified", Long.valueOf(file.lastModified()));
        rowBuilderNewRow.add("mime_type", file.isDirectory() ? "vnd.android.document/directory" : "application/octet-stream");
        rowBuilderNewRow.add("flags", 70);
    }

    private static String[] projectionOrDefault(String[] strArr, String[] strArr2) {
        return strArr == null ? strArr2 : strArr;
    }

    private File resolve(String str) throws FileNotFoundException {
        File fileBaseDir = baseDir();
        File file = ROOT_DOCUMENT_ID.equals(str) ? fileBaseDir : new File(fileBaseDir, str);
        String absolutePath = fileBaseDir.getAbsolutePath();
        String absolutePath2 = file.getAbsolutePath();
        if (!absolutePath2.equals(absolutePath)) {
            if (!absolutePath2.startsWith(absolutePath + File.separator)) {
                throw new FileNotFoundException(str);
            }
        }
        return file;
    }

    private String toDocumentId(File file) throws FileNotFoundException {
        String absolutePath = baseDir().getAbsolutePath();
        String absolutePath2 = file.getAbsolutePath();
        return absolutePath2.equals(absolutePath) ? ROOT_DOCUMENT_ID : absolutePath2.substring(absolutePath.length() + 1);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.provider.DocumentsProvider
    public ParcelFileDescriptor openDocument(String str, String str2, CancellationSignal cancellationSignal) throws FileNotFoundException {
        return ParcelFileDescriptor.open(resolve(str), ParcelFileDescriptor.parseMode(str2));
    }

    @Override // android.provider.DocumentsProvider
    public Cursor queryChildDocuments(String str, String[] strArr, String str2) throws FileNotFoundException {
        MatrixCursor matrixCursor = new MatrixCursor(projectionOrDefault(strArr, documentProjection()));
        File[] fileArrListFiles = resolve(str).listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                includeFile(matrixCursor, file, toDocumentId(file));
            }
        }
        return matrixCursor;
    }

    @Override // android.provider.DocumentsProvider
    public Cursor queryDocument(String str, String[] strArr) throws FileNotFoundException {
        MatrixCursor matrixCursor = new MatrixCursor(projectionOrDefault(strArr, documentProjection()));
        includeFile(matrixCursor, resolve(str), str);
        return matrixCursor;
    }

    @Override // android.provider.DocumentsProvider
    public Cursor queryRoots(String[] strArr) throws FileNotFoundException {
        MatrixCursor matrixCursor = new MatrixCursor(projectionOrDefault(strArr, new String[]{"root_id", "document_id", "title", "flags", "mime_types"}));
        MatrixCursor.RowBuilder rowBuilderNewRow = matrixCursor.newRow();
        rowBuilderNewRow.add("root_id", ROOT_ID);
        rowBuilderNewRow.add("document_id", ROOT_DOCUMENT_ID);
        rowBuilderNewRow.add("title", "Internal data");
        rowBuilderNewRow.add("flags", 25);
        rowBuilderNewRow.add("mime_types", "*/*");
        return matrixCursor;
    }
}
