package defpackage;

import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import app.template.extension.BuildConfig;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import kotlin.KotlinVersion;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class t51 {
    public static final byte[] A;
    public static final String[] B;
    public static final int[] C;
    public static final byte[] D;
    public static final q51 E;
    public static final q51[][] F;
    public static final q51[] G;
    public static final HashMap[] H;
    public static final HashMap[] I;
    public static final Set J;
    public static final HashMap K;
    public static final Charset L;
    public static final byte[] M;
    public static final byte[] N;
    public static final boolean l = Log.isLoggable("ExifInterface", 3);
    public static final int[] m;
    public static final int[] n;
    public static final byte[] o;
    public static final byte[] p;
    public static final byte[] q;
    public static final byte[] r;
    public static final byte[] s;
    public static final byte[] t;
    public static final byte[] u;
    public static final byte[] v;
    public static final byte[] w;
    public static final byte[] x;
    public static final byte[] y;
    public static final byte[] z;
    public final FileDescriptor a;
    public int b;
    public final HashMap[] c;
    public final HashSet d;
    public ByteOrder e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public p51 k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        m = new int[]{8, 8, 8};
        n = new int[]{8};
        o = new byte[]{-1, -40, -1};
        p = new byte[]{102, 116, 121, 112};
        q = new byte[]{109, 105, 102, 49};
        r = new byte[]{104, 101, 105, 99};
        s = new byte[]{97, 118, 105, 102};
        t = new byte[]{97, 118, 105, 115};
        u = new byte[]{79, 76, 89, 77, 80, 0};
        v = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        w = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        x = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        y = new byte[]{82, 73, 70, 70};
        z = new byte[]{87, 69, 66, 80};
        A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        B = new String[]{BuildConfig.VERSION_NAME, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        q51[] q51VarArr = {new q51("NewSubfileType", 254, 4), new q51("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new q51(FontInfo.NUMBER_OF_CHAR_CODES, 3, 4, "ImageWidth"), new q51(257, 3, 4, "ImageLength"), new q51("BitsPerSample", 258, 3), new q51("Compression", 259, 3), new q51("PhotometricInterpretation", 262, 3), new q51("ImageDescription", 270, 2), new q51("Make", 271, 2), new q51("Model", 272, 2), new q51(273, 3, 4, "StripOffsets"), new q51("Orientation", 274, 3), new q51("SamplesPerPixel", 277, 3), new q51(278, 3, 4, "RowsPerStrip"), new q51(279, 3, 4, "StripByteCounts"), new q51("XResolution", 282, 5), new q51("YResolution", 283, 5), new q51("PlanarConfiguration", 284, 3), new q51("ResolutionUnit", 296, 3), new q51("TransferFunction", 301, 3), new q51("Software", 305, 2), new q51("DateTime", 306, 2), new q51("Artist", 315, 2), new q51("WhitePoint", 318, 5), new q51("PrimaryChromaticities", 319, 5), new q51("SubIFDPointer", 330, 4), new q51("JPEGInterchangeFormat", 513, 4), new q51("JPEGInterchangeFormatLength", 514, 4), new q51("YCbCrCoefficients", 529, 5), new q51("YCbCrSubSampling", 530, 3), new q51("YCbCrPositioning", 531, 3), new q51("ReferenceBlackWhite", 532, 5), new q51("Copyright", 33432, 2), new q51("ExifIFDPointer", 34665, 4), new q51("GPSInfoIFDPointer", 34853, 4), new q51("SensorTopBorder", 4, 4), new q51("SensorLeftBorder", 5, 4), new q51("SensorBottomBorder", 6, 4), new q51("SensorRightBorder", 7, 4), new q51("ISO", 23, 3), new q51("JpgFromRaw", 46, 7), new q51("Xmp", 700, 1)};
        q51[] q51VarArr2 = {new q51("ExposureTime", 33434, 5), new q51("FNumber", 33437, 5), new q51("ExposureProgram", 34850, 3), new q51("SpectralSensitivity", 34852, 2), new q51("PhotographicSensitivity", 34855, 3), new q51("OECF", 34856, 7), new q51("SensitivityType", 34864, 3), new q51("StandardOutputSensitivity", 34865, 4), new q51("RecommendedExposureIndex", 34866, 4), new q51("ISOSpeed", 34867, 4), new q51("ISOSpeedLatitudeyyy", 34868, 4), new q51("ISOSpeedLatitudezzz", 34869, 4), new q51("ExifVersion", 36864, 2), new q51("DateTimeOriginal", 36867, 2), new q51("DateTimeDigitized", 36868, 2), new q51("OffsetTime", 36880, 2), new q51("OffsetTimeOriginal", 36881, 2), new q51("OffsetTimeDigitized", 36882, 2), new q51("ComponentsConfiguration", 37121, 7), new q51("CompressedBitsPerPixel", 37122, 5), new q51("ShutterSpeedValue", 37377, 10), new q51("ApertureValue", 37378, 5), new q51("BrightnessValue", 37379, 10), new q51("ExposureBiasValue", 37380, 10), new q51("MaxApertureValue", 37381, 5), new q51("SubjectDistance", 37382, 5), new q51("MeteringMode", 37383, 3), new q51("LightSource", 37384, 3), new q51("Flash", 37385, 3), new q51("FocalLength", 37386, 5), new q51("SubjectArea", 37396, 3), new q51("MakerNote", 37500, 7), new q51("UserComment", 37510, 7), new q51("SubSecTime", 37520, 2), new q51("SubSecTimeOriginal", 37521, 2), new q51("SubSecTimeDigitized", 37522, 2), new q51("FlashpixVersion", 40960, 7), new q51("ColorSpace", 40961, 3), new q51(40962, 3, 4, "PixelXDimension"), new q51(40963, 3, 4, "PixelYDimension"), new q51("RelatedSoundFile", 40964, 2), new q51("InteroperabilityIFDPointer", 40965, 4), new q51("FlashEnergy", 41483, 5), new q51("SpatialFrequencyResponse", 41484, 7), new q51("FocalPlaneXResolution", 41486, 5), new q51("FocalPlaneYResolution", 41487, 5), new q51("FocalPlaneResolutionUnit", 41488, 3), new q51("SubjectLocation", 41492, 3), new q51("ExposureIndex", 41493, 5), new q51("SensingMethod", 41495, 3), new q51("FileSource", 41728, 7), new q51("SceneType", 41729, 7), new q51("CFAPattern", 41730, 7), new q51("CustomRendered", 41985, 3), new q51("ExposureMode", 41986, 3), new q51("WhiteBalance", 41987, 3), new q51("DigitalZoomRatio", 41988, 5), new q51("FocalLengthIn35mmFilm", 41989, 3), new q51("SceneCaptureType", 41990, 3), new q51("GainControl", 41991, 3), new q51("Contrast", 41992, 3), new q51("Saturation", 41993, 3), new q51("Sharpness", 41994, 3), new q51("DeviceSettingDescription", 41995, 7), new q51("SubjectDistanceRange", 41996, 3), new q51("ImageUniqueID", 42016, 2), new q51("CameraOwnerName", 42032, 2), new q51("BodySerialNumber", 42033, 2), new q51("LensSpecification", 42034, 5), new q51("LensMake", 42035, 2), new q51("LensModel", 42036, 2), new q51("Gamma", 42240, 5), new q51("DNGVersion", 50706, 1), new q51(50720, 3, 4, "DefaultCropSize")};
        q51[] q51VarArr3 = {new q51("GPSVersionID", 0, 1), new q51("GPSLatitudeRef", 1, 2), new q51(2, 5, 10, "GPSLatitude"), new q51("GPSLongitudeRef", 3, 2), new q51(4, 5, 10, "GPSLongitude"), new q51("GPSAltitudeRef", 5, 1), new q51("GPSAltitude", 6, 5), new q51("GPSTimeStamp", 7, 5), new q51("GPSSatellites", 8, 2), new q51("GPSStatus", 9, 2), new q51("GPSMeasureMode", 10, 2), new q51("GPSDOP", 11, 5), new q51("GPSSpeedRef", 12, 2), new q51("GPSSpeed", 13, 5), new q51("GPSTrackRef", 14, 2), new q51("GPSTrack", 15, 5), new q51("GPSImgDirectionRef", 16, 2), new q51("GPSImgDirection", 17, 5), new q51("GPSMapDatum", 18, 2), new q51("GPSDestLatitudeRef", 19, 2), new q51("GPSDestLatitude", 20, 5), new q51("GPSDestLongitudeRef", 21, 2), new q51("GPSDestLongitude", 22, 5), new q51("GPSDestBearingRef", 23, 2), new q51("GPSDestBearing", 24, 5), new q51("GPSDestDistanceRef", 25, 2), new q51("GPSDestDistance", 26, 5), new q51("GPSProcessingMethod", 27, 7), new q51("GPSAreaInformation", 28, 7), new q51("GPSDateStamp", 29, 2), new q51("GPSDifferential", 30, 3), new q51("GPSHPositioningError", 31, 5)};
        q51[] q51VarArr4 = {new q51("InteroperabilityIndex", 1, 2)};
        q51[] q51VarArr5 = {new q51("NewSubfileType", 254, 4), new q51("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new q51(FontInfo.NUMBER_OF_CHAR_CODES, 3, 4, "ThumbnailImageWidth"), new q51(257, 3, 4, "ThumbnailImageLength"), new q51("BitsPerSample", 258, 3), new q51("Compression", 259, 3), new q51("PhotometricInterpretation", 262, 3), new q51("ImageDescription", 270, 2), new q51("Make", 271, 2), new q51("Model", 272, 2), new q51(273, 3, 4, "StripOffsets"), new q51("ThumbnailOrientation", 274, 3), new q51("SamplesPerPixel", 277, 3), new q51(278, 3, 4, "RowsPerStrip"), new q51(279, 3, 4, "StripByteCounts"), new q51("XResolution", 282, 5), new q51("YResolution", 283, 5), new q51("PlanarConfiguration", 284, 3), new q51("ResolutionUnit", 296, 3), new q51("TransferFunction", 301, 3), new q51("Software", 305, 2), new q51("DateTime", 306, 2), new q51("Artist", 315, 2), new q51("WhitePoint", 318, 5), new q51("PrimaryChromaticities", 319, 5), new q51("SubIFDPointer", 330, 4), new q51("JPEGInterchangeFormat", 513, 4), new q51("JPEGInterchangeFormatLength", 514, 4), new q51("YCbCrCoefficients", 529, 5), new q51("YCbCrSubSampling", 530, 3), new q51("YCbCrPositioning", 531, 3), new q51("ReferenceBlackWhite", 532, 5), new q51("Copyright", 33432, 2), new q51("ExifIFDPointer", 34665, 4), new q51("GPSInfoIFDPointer", 34853, 4), new q51("DNGVersion", 50706, 1), new q51(50720, 3, 4, "DefaultCropSize")};
        E = new q51("StripOffsets", 273, 3);
        F = new q51[][]{q51VarArr, q51VarArr2, q51VarArr3, q51VarArr4, q51VarArr5, q51VarArr, new q51[]{new q51("ThumbnailImage", FontInfo.NUMBER_OF_CHAR_CODES, 7), new q51("CameraSettingsIFDPointer", 8224, 4), new q51("ImageProcessingIFDPointer", 8256, 4)}, new q51[]{new q51("PreviewImageStart", 257, 4), new q51("PreviewImageLength", 258, 4)}, new q51[]{new q51("AspectFrame", 4371, 3)}, new q51[]{new q51("ColorSpace", 55, 3)}};
        G = new q51[]{new q51("SubIFDPointer", 330, 4), new q51("ExifIFDPointer", 34665, 4), new q51("GPSInfoIFDPointer", 34853, 4), new q51("InteroperabilityIFDPointer", 40965, 4), new q51("CameraSettingsIFDPointer", 8224, 1), new q51("ImageProcessingIFDPointer", 8256, 1)};
        H = new HashMap[10];
        I = new HashMap[10];
        J = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        K = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        L = charsetForName;
        M = "Exif\u0000\u0000".getBytes(charsetForName);
        N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            q51[][] q51VarArr6 = F;
            if (i >= q51VarArr6.length) {
                HashMap map = K;
                q51[] q51VarArr7 = G;
                map.put(Integer.valueOf(q51VarArr7[0].a), 5);
                map.put(Integer.valueOf(q51VarArr7[1].a), 1);
                map.put(Integer.valueOf(q51VarArr7[2].a), 2);
                map.put(Integer.valueOf(q51VarArr7[3].a), 3);
                map.put(Integer.valueOf(q51VarArr7[4].a), 7);
                map.put(Integer.valueOf(q51VarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            H[i] = new HashMap();
            I[i] = new HashMap();
            for (q51 q51Var : q51VarArr6[i]) {
                H[i].put(Integer.valueOf(q51Var.a), q51Var);
                I[i].put(q51Var.b, q51Var);
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ad A[Catch: all -> 0x002e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x002e, blocks: (B:3:0x001f, B:5:0x0022, B:12:0x0037, B:18:0x0054, B:25:0x0067, B:31:0x007a, B:28:0x006f, B:29:0x0073, B:30:0x0077, B:32:0x0084, B:34:0x008d, B:36:0x0093, B:38:0x0099, B:40:0x009f, B:45:0x00ad), top: B:55:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public t51(u51 u51Var) {
        q51[][] q51VarArr = F;
        this.c = new HashMap[q51VarArr.length];
        this.d = new HashSet(q51VarArr.length);
        this.e = ByteOrder.BIG_ENDIAN;
        boolean z2 = l;
        this.a = null;
        for (int i = 0; i < q51VarArr.length; i++) {
            try {
                try {
                    this.c[i] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (z2) {
                        p();
                    }
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                if (z2) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z2) {
                    return;
                }
            } catch (UnsupportedOperationException e2) {
                e = e2;
                if (z2) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z2) {
                    return;
                }
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(u51Var, 5000);
        int iF = f(bufferedInputStream);
        this.b = iF;
        if (iF == 4 || iF == 9 || iF == 13 || iF == 14) {
            o51 o51Var = new o51(bufferedInputStream);
            int i2 = this.b;
            if (i2 == 4) {
                e(o51Var, 0, 0);
            } else if (i2 == 13) {
                h(o51Var);
            } else if (i2 == 9) {
                i(o51Var);
            } else if (i2 == 14) {
                l(o51Var);
            }
        } else {
            s51 s51Var = new s51(bufferedInputStream);
            int i3 = this.b;
            if (i3 == 12 || i3 == 15) {
                d(s51Var, i3);
            } else if (i3 == 7) {
                g(s51Var);
            } else if (i3 == 10) {
                k(s51Var);
            } else {
                j(s51Var);
            }
            s51Var.c(this.g);
            u(s51Var);
        }
        a();
        if (!z2) {
            return;
        }
        p();
    }

    public static ByteOrder q(o51 o51Var) throws IOException {
        short s2 = o51Var.readShort();
        boolean z2 = l;
        if (s2 == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s2 != 19789) {
            m51.k(Integer.toHexString(s2), "Invalid byte order: ");
            return null;
        }
        if (z2) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.c;
        if (strB != null && b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strB.concat("\u0000").getBytes(L);
            map.put("DateTime", new p51(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", p51.a(0L, this.e));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", p51.a(0L, this.e));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", p51.a(0L, this.e));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", p51.a(0L, this.e));
        }
    }

    public final String b(String str) {
        p51 p51VarC = c(str);
        if (p51VarC != null) {
            int i = p51VarC.a;
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                r51[] r51VarArr = (r51[]) p51VarC.g(this.e);
                if (r51VarArr == null || r51VarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(r51VarArr));
                    return null;
                }
                r51 r51Var = r51VarArr[0];
                Integer numValueOf = Integer.valueOf((int) (r51Var.a / r51Var.b));
                r51 r51Var2 = r51VarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (r51Var2.a / r51Var2.b));
                r51 r51Var3 = r51VarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (r51Var3.a / r51Var3.b)));
            }
            boolean zContains = J.contains(str);
            ByteOrder byteOrder = this.e;
            if (!zContains) {
                return p51VarC.f(byteOrder);
            }
            try {
                return Double.toString(p51VarC.d(byteOrder));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final p51 c(String str) {
        p51 p51Var;
        int i;
        p51 p51Var2;
        if ("ISOSpeedRatings".equals(str)) {
            if (l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i = this.b) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (p51Var2 = this.k) != null)) {
            return p51Var2;
        }
        for (int i2 = 0; i2 < F.length; i2++) {
            p51 p51Var3 = (p51) this.c[i2].get(str);
            if (p51Var3 != null) {
                return p51Var3;
            }
        }
        if (!"Xmp".equals(str) || (p51Var = this.k) == null) {
            return null;
        }
        return p51Var;
    }

    public final void d(s51 s51Var, int i) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28) {
            j93.k("Reading EXIF from HEIC files is supported from SDK 28 and above");
            return;
        }
        if (i == 15 && i3 < 31) {
            j93.k("Reading EXIF from AVIF files is supported from SDK 31 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new n51(s51Var));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.c;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", p51.c(Integer.parseInt(strExtractMetadata), this.e));
                }
                if (strExtractMetadata3 != null) {
                    mapArr[0].put("ImageLength", p51.c(Integer.parseInt(strExtractMetadata3), this.e));
                }
                if (strExtractMetadata2 != null) {
                    int i4 = Integer.parseInt(strExtractMetadata2);
                    if (i4 == 90) {
                        i2 = 6;
                    } else if (i4 != 180) {
                        i2 = i4 != 270 ? 1 : 8;
                    } else {
                        i2 = 3;
                    }
                    mapArr[0].put("Orientation", p51.c(i2, this.e));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i5 = Integer.parseInt(strExtractMetadata4);
                    int i6 = Integer.parseInt(strExtractMetadata5);
                    if (i6 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    s51Var.c(i5);
                    byte[] bArr = new byte[6];
                    s51Var.readFully(bArr);
                    int i7 = i5 + 6;
                    int i8 = i6 - 6;
                    if (!Arrays.equals(bArr, M)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i8];
                    s51Var.readFully(bArr2);
                    this.g = i7;
                    r(0, bArr2);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i9 = Integer.parseInt(strExtractMetadata8);
                    int i10 = Integer.parseInt(strExtractMetadata9);
                    long j = i9;
                    s51Var.c(j);
                    byte[] bArr3 = new byte[i10];
                    s51Var.readFully(bArr3);
                    this.k = new p51(j, bArr3, 1, i10);
                }
                if (l) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata3 + ", rotation " + strExtractMetadata2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                try {
                    mediaMetadataRetriever.release();
                    throw th;
                } catch (IOException unused2) {
                    throw th;
                }
            }
        } catch (RuntimeException e) {
            throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ac A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:55:0x0158 A[LOOP:0: B:10:0x0034->B:55:0x0158, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x015f A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x009e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00a1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00a4. Please report as an issue. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1067)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void e(defpackage.o51 r23, int r24, int r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t51.e(o51, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:146:0x01a5  */
    public final int f(BufferedInputStream bufferedInputStream) throws Throwable {
        int i;
        o51 o51Var;
        int i2;
        o51 o51Var2;
        int i3;
        int i4;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i5 = 0;
        while (true) {
            byte[] bArr2 = o;
            if (i5 >= bArr2.length) {
                return 4;
            }
            if (bArr[i5] != bArr2[i5]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i6 = 0; i6 < bytes.length; i6++) {
                    if (bArr[i6] != bytes[i6]) {
                        o51 o51Var3 = null;
                        try {
                            o51Var = new o51(bArr);
                            try {
                                try {
                                    long j2 = o51Var.readInt();
                                    byte[] bArr3 = new byte[4];
                                    o51Var.readFully(bArr3);
                                    if (Arrays.equals(bArr3, p)) {
                                        if (j2 == 1) {
                                            j2 = o51Var.readLong();
                                            j = 16;
                                            if (j2 < 16) {
                                            }
                                            o51Var.close();
                                            i = 0;
                                            i2 = 0;
                                        } else {
                                            j = 8;
                                        }
                                        if (j2 > 5000) {
                                            j2 = 5000;
                                        }
                                        long j3 = j2 - j;
                                        if (j3 < 8) {
                                            o51Var.close();
                                            i = 0;
                                            i2 = 0;
                                        } else {
                                            byte[] bArr4 = new byte[4];
                                            long j4 = 0;
                                            boolean z2 = false;
                                            boolean z3 = false;
                                            boolean z4 = false;
                                            while (true) {
                                                if (j4 < j3 / 4) {
                                                    try {
                                                        o51Var.readFully(bArr4);
                                                        if (j4 != 1) {
                                                            i = 0;
                                                            try {
                                                                if (Arrays.equals(bArr4, q)) {
                                                                    z2 = true;
                                                                } else if (Arrays.equals(bArr4, r)) {
                                                                    z3 = true;
                                                                } else if (Arrays.equals(bArr4, s) || Arrays.equals(bArr4, t)) {
                                                                    z4 = true;
                                                                }
                                                                if (!z2) {
                                                                    continue;
                                                                } else if (z3) {
                                                                    o51Var.close();
                                                                    i2 = 12;
                                                                } else if (z4) {
                                                                    o51Var.close();
                                                                    i2 = 15;
                                                                }
                                                            } catch (Exception e) {
                                                                e = e;
                                                                if (l) {
                                                                    Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                                }
                                                                if (o51Var != null) {
                                                                    o51Var.close();
                                                                }
                                                                i2 = i;
                                                            }
                                                        }
                                                        j4++;
                                                    } catch (EOFException unused) {
                                                        i = 0;
                                                        o51Var.close();
                                                        i2 = i;
                                                    }
                                                } else {
                                                    i = 0;
                                                }
                                                o51Var.close();
                                                i2 = i;
                                            }
                                        }
                                    } else {
                                        o51Var.close();
                                        i = 0;
                                        i2 = 0;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    i = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                o51Var3 = o51Var;
                                if (o51Var3 != null) {
                                    o51Var3.close();
                                }
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            i = 0;
                            o51Var = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (o51Var3 != null) {
                                o51Var3.close();
                            }
                            throw th;
                        }
                        if (i2 != 0) {
                            return i2;
                        }
                        try {
                            o51Var2 = new o51(bArr);
                            try {
                                ByteOrder byteOrderQ = q(o51Var2);
                                this.e = byteOrderQ;
                                o51Var2.h = byteOrderQ;
                                short s2 = o51Var2.readShort();
                                i3 = (s2 == 20306 || s2 == 21330) ? 1 : i;
                                o51Var2.close();
                            } catch (Exception unused2) {
                                if (o51Var2 != null) {
                                    o51Var2.close();
                                }
                                i3 = i;
                            } catch (Throwable th3) {
                                th = th3;
                                o51Var3 = o51Var2;
                                if (o51Var3 != null) {
                                    o51Var3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused3) {
                            o51Var2 = null;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        if (i3 != 0) {
                            return 7;
                        }
                        try {
                            o51 o51Var4 = new o51(bArr);
                            try {
                                ByteOrder byteOrderQ2 = q(o51Var4);
                                this.e = byteOrderQ2;
                                o51Var4.h = byteOrderQ2;
                                i4 = o51Var4.readShort() != 85 ? i : 1;
                                o51Var4.close();
                            } catch (Exception unused4) {
                                o51Var3 = o51Var4;
                                if (o51Var3 != null) {
                                    o51Var3.close();
                                }
                                i4 = i;
                            } catch (Throwable th5) {
                                th = th5;
                                o51Var3 = o51Var4;
                                if (o51Var3 != null) {
                                    o51Var3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused5) {
                        } catch (Throwable th6) {
                            th = th6;
                        }
                        if (i4 != 0) {
                            return 10;
                        }
                        int i7 = i;
                        while (true) {
                            byte[] bArr5 = w;
                            if (i7 >= bArr5.length) {
                                return 13;
                            }
                            if (bArr[i7] != bArr5[i7]) {
                                int i8 = i;
                                while (true) {
                                    byte[] bArr6 = y;
                                    if (i8 >= bArr6.length) {
                                        int i9 = i;
                                        while (true) {
                                            byte[] bArr7 = z;
                                            if (i9 >= bArr7.length) {
                                                return 14;
                                            }
                                            if (bArr[bArr6.length + i9 + 4] != bArr7[i9]) {
                                                break;
                                            }
                                            i9++;
                                        }
                                    } else {
                                        if (bArr[i8] != bArr6[i8]) {
                                            break;
                                        }
                                        i8++;
                                    }
                                }
                                return i;
                            }
                            i7++;
                        }
                    }
                }
                return 9;
            }
            i5++;
        }
    }

    public final void g(s51 s51Var) throws IOException {
        int i;
        int i2;
        j(s51Var);
        HashMap[] mapArr = this.c;
        p51 p51Var = (p51) mapArr[1].get("MakerNote");
        if (p51Var != null) {
            s51 s51Var2 = new s51(p51Var.d);
            s51Var2.h = this.e;
            byte[] bArr = u;
            byte[] bArr2 = new byte[bArr.length];
            s51Var2.readFully(bArr2);
            s51Var2.c(0L);
            byte[] bArr3 = v;
            byte[] bArr4 = new byte[bArr3.length];
            s51Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                s51Var2.c(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                s51Var2.c(12L);
            }
            s(s51Var2, 6);
            p51 p51Var2 = (p51) mapArr[7].get("PreviewImageStart");
            p51 p51Var3 = (p51) mapArr[7].get("PreviewImageLength");
            if (p51Var2 != null && p51Var3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", p51Var2);
                mapArr[5].put("JPEGInterchangeFormatLength", p51Var3);
            }
            p51 p51Var4 = (p51) mapArr[8].get("AspectFrame");
            if (p51Var4 != null) {
                int[] iArr = (int[]) p51Var4.g(this.e);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                p51 p51VarC = p51.c(i5, this.e);
                p51 p51VarC2 = p51.c(i6, this.e);
                mapArr[0].put("ImageWidth", p51VarC);
                mapArr[0].put("ImageLength", p51VarC2);
            }
        }
    }

    public final void h(o51 o51Var) throws IOException {
        if (l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + o51Var);
        }
        o51Var.h = ByteOrder.BIG_ENDIAN;
        int i = o51Var.d;
        o51Var.a(w.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (z2 && z3) {
                return;
            }
            try {
                int i2 = o51Var.readInt();
                int i3 = o51Var.readInt();
                int i4 = o51Var.d;
                int i5 = i4 + i2 + 4;
                int i6 = i4 - i;
                if (i6 == 16 && i3 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i3 == 1229278788) {
                    return;
                }
                if (i3 == 1700284774 && !z2) {
                    this.g = i6;
                    byte[] bArr = new byte[i2];
                    o51Var.readFully(bArr);
                    int i7 = o51Var.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(i3 >>> 24);
                    crc32.update(i3 >>> 16);
                    crc32.update(i3 >>> 8);
                    crc32.update(i3);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i7) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i7 + ", calculated CRC value: " + crc32.getValue());
                    }
                    r(0, bArr);
                    x();
                    u(new o51(bArr));
                    z2 = true;
                } else if (i3 == 1767135348 && !z3) {
                    byte[] bArr2 = x;
                    if (i2 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        o51Var.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i8 = o51Var.d - i;
                            int i9 = i2 - length;
                            byte[] bArr4 = new byte[i9];
                            o51Var.readFully(bArr4);
                            this.k = new p51(i8, bArr4, 1, i9);
                            z3 = true;
                        }
                    }
                }
                o51Var.a(i5 - o51Var.d);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt PNG file.", e);
            }
        }
    }

    public final void i(o51 o51Var) throws IOException {
        boolean z2 = l;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + o51Var);
        }
        o51Var.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        o51Var.readFully(bArr);
        o51Var.readFully(bArr2);
        o51Var.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        o51Var.a(i - o51Var.d);
        o51Var.readFully(bArr4);
        e(new o51(bArr4), i, 5);
        o51Var.a(i3 - o51Var.d);
        o51Var.h = ByteOrder.BIG_ENDIAN;
        int i4 = o51Var.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = o51Var.readUnsignedShort();
            int unsignedShort2 = o51Var.readUnsignedShort();
            if (unsignedShort == E.a) {
                short s2 = o51Var.readShort();
                short s3 = o51Var.readShort();
                p51 p51VarC = p51.c(s2, this.e);
                p51 p51VarC2 = p51.c(s3, this.e);
                HashMap[] mapArr = this.c;
                mapArr[0].put("ImageLength", p51VarC);
                mapArr[0].put("ImageWidth", p51VarC2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s2) + ", width: " + ((int) s3));
                    return;
                }
                return;
            }
            o51Var.a(unsignedShort2);
        }
    }

    public final void j(s51 s51Var) throws IOException {
        o(s51Var);
        s(s51Var, 0);
        w(s51Var, 0);
        w(s51Var, 5);
        w(s51Var, 4);
        x();
        if (this.b == 8) {
            HashMap[] mapArr = this.c;
            p51 p51Var = (p51) mapArr[1].get("MakerNote");
            if (p51Var != null) {
                s51 s51Var2 = new s51(p51Var.d);
                s51Var2.h = this.e;
                s51Var2.a(6);
                s(s51Var2, 9);
                p51 p51Var2 = (p51) mapArr[9].get("ColorSpace");
                if (p51Var2 != null) {
                    mapArr[1].put("ColorSpace", p51Var2);
                }
            }
        }
    }

    public final void k(s51 s51Var) throws IOException {
        if (l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + s51Var);
        }
        j(s51Var);
        HashMap[] mapArr = this.c;
        p51 p51Var = (p51) mapArr[0].get("JpgFromRaw");
        if (p51Var != null) {
            e(new o51(p51Var.d), (int) p51Var.c, 5);
        }
        p51 p51Var2 = (p51) mapArr[0].get("ISO");
        p51 p51Var3 = (p51) mapArr[1].get("PhotographicSensitivity");
        if (p51Var2 == null || p51Var3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", p51Var2);
    }

    public final void l(o51 o51Var) throws IOException {
        if (l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + o51Var);
        }
        o51Var.h = ByteOrder.LITTLE_ENDIAN;
        o51Var.a(y.length);
        int i = o51Var.readInt() + 8;
        byte[] bArr = z;
        o51Var.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                o51Var.readFully(bArr2);
                int i2 = o51Var.readInt();
                int i3 = length + 8;
                if (Arrays.equals(A, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i2];
                    o51Var.readFully(bArrCopyOfRange);
                    byte[] bArr3 = M;
                    if (p23.a0(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i2);
                    }
                    this.g = i3;
                    r(0, bArrCopyOfRange);
                    u(new o51(bArrCopyOfRange));
                    return;
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                o51Var.a(i2);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.", e);
            }
        }
    }

    public final void m(o51 o51Var, HashMap map) throws IOException {
        p51 p51Var = (p51) map.get("JPEGInterchangeFormat");
        p51 p51Var2 = (p51) map.get("JPEGInterchangeFormatLength");
        if (p51Var == null || p51Var2 == null) {
            return;
        }
        int iE = p51Var.e(this.e);
        int iE2 = p51Var2.e(this.e);
        if (this.b == 7) {
            iE += this.h;
        }
        if (iE > 0 && iE2 > 0 && this.a == null) {
            o51Var.a(iE);
            o51Var.readFully(new byte[iE2]);
        }
        if (l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iE + ", length: " + iE2);
        }
    }

    public final boolean n(HashMap map) {
        p51 p51Var = (p51) map.get("ImageLength");
        p51 p51Var2 = (p51) map.get("ImageWidth");
        if (p51Var == null || p51Var2 == null) {
            return false;
        }
        return p51Var.e(this.e) <= 512 && p51Var2.e(this.e) <= 512;
    }

    public final void o(s51 s51Var) throws IOException {
        ByteOrder byteOrderQ = q(s51Var);
        this.e = byteOrderQ;
        s51Var.h = byteOrderQ;
        int unsignedShort = s51Var.readUnsignedShort();
        int i = this.b;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            m51.k(Integer.toHexString(unsignedShort), "Invalid start code: ");
            return;
        }
        int i2 = s51Var.readInt();
        if (i2 < 8) {
            m51.l(ud2.m(i2, "Invalid first Ifd offset: "));
            return;
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            s51Var.a(i3);
        }
    }

    public final void p() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.c;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbS = ud2.s("The size of tag group[", "]: ", i);
            sbS.append(mapArr[i].size());
            Log.d("ExifInterface", sbS.toString());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                p51 p51Var = (p51) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + p51Var.toString() + ", tagValue: '" + p51Var.f(this.e) + "'");
            }
            i++;
        }
    }

    public final void r(int i, byte[] bArr) throws IOException {
        s51 s51Var = new s51(bArr);
        o(s51Var);
        s(s51Var, i);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0210  */
    /* JADX WARN: Code duplicated, block: B:103:0x0214  */
    /* JADX WARN: Code duplicated, block: B:108:0x0221  */
    /* JADX WARN: Code duplicated, block: B:109:0x0226  */
    /* JADX WARN: Code duplicated, block: B:110:0x0232  */
    /* JADX WARN: Code duplicated, block: B:112:0x0239  */
    /* JADX WARN: Code duplicated, block: B:115:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x025b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0299  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:132:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:137:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:139:0x0301  */
    /* JADX WARN: Code duplicated, block: B:148:0x032b  */
    /* JADX WARN: Code duplicated, block: B:175:0x032e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x014f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0158  */
    /* JADX WARN: Code duplicated, block: B:74:0x0160  */
    /* JADX WARN: Code duplicated, block: B:76:0x0166  */
    /* JADX WARN: Code duplicated, block: B:77:0x017a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0181  */
    /* JADX WARN: Code duplicated, block: B:82:0x018b  */
    /* JADX WARN: Code duplicated, block: B:83:0x018d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0191  */
    /* JADX WARN: Code duplicated, block: B:86:0x0194  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:95:0x0206  */
    /* JADX WARN: Code duplicated, block: B:97:0x0209  */
    /* JADX WARN: Code duplicated, block: B:99:0x020c  */
    /* JADX WARN: Instruction removed from duplicated block: B:129:0x02a1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0166, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x01eb, please report this as an issue */
    public final void s(s51 s51Var, int i) throws IOException {
        HashMap[] mapArr;
        long j;
        long j2;
        boolean z2;
        int i2;
        long j3;
        Integer num;
        HashSet hashSet;
        long j4;
        String str;
        int unsignedShort;
        long j5;
        String strO;
        int i3;
        int i4 = s51Var.d;
        int i5 = s51Var.m;
        Integer numValueOf = Integer.valueOf(i4);
        HashSet hashSet2 = this.d;
        hashSet2.add(numValueOf);
        short s2 = s51Var.readShort();
        boolean z3 = l;
        if (z3) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s2));
        }
        if (s2 <= 0) {
            return;
        }
        short s3 = 0;
        while (true) {
            mapArr = this.c;
            if (s3 >= s2) {
                break;
            }
            int unsignedShort2 = s51Var.readUnsignedShort();
            int unsignedShort3 = s51Var.readUnsignedShort();
            int i6 = s51Var.readInt();
            long j6 = ((long) s51Var.d) + 4;
            short s4 = s2;
            q51 q51Var = (q51) H[i].get(Integer.valueOf(unsignedShort2));
            if (z3) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), q51Var != null ? q51Var.b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i6)));
            }
            if (q51Var != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = C;
                    if (unsignedShort3 < iArr.length) {
                        int i7 = q51Var.c;
                        if (i7 == 7 || unsignedShort3 == 7 || i7 == unsignedShort3 || (i2 = q51Var.d) == unsignedShort3 || (((i7 == 4 || i2 == 4) && unsignedShort3 == 3) || (((i7 == 9 || i2 == 9) && unsignedShort3 == 8) || ((i7 == 12 || i2 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i7;
                            }
                            j = j6;
                            j2 = ((long) i6) * ((long) iArr[unsignedShort3]);
                            if (j2 < 0 || j2 > 2147483647L) {
                                if (z3 != 0) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i6);
                                }
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        } else if (z3 != 0) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + B[unsignedShort3] + ") is unexpected for tag: " + q51Var.b);
                        }
                    }
                    if (z2) {
                        j3 = j;
                        if (j2 > 4) {
                            i3 = s51Var.readInt();
                            if (z3 != 0) {
                                Log.d("ExifInterface", "seek to data offset: " + i3);
                            }
                            if (this.b == 7) {
                                if ("MakerNote".equals(q51Var.b)) {
                                    this.h = i3;
                                } else if (i != 6 && "ThumbnailImage".equals(q51Var.b)) {
                                    this.i = i3;
                                    this.j = i6;
                                    p51 p51VarC = p51.c(6, this.e);
                                    p51 p51VarA = p51.a(this.i, this.e);
                                    p51 p51VarA2 = p51.a(this.j, this.e);
                                    mapArr[4].put("Compression", p51VarC);
                                    mapArr[4].put("JPEGInterchangeFormat", p51VarA);
                                    mapArr[4].put("JPEGInterchangeFormatLength", p51VarA2);
                                }
                            }
                            s51Var.c(i3);
                        } else {
                            j3 = j3;
                            unsignedShort2 = unsignedShort2;
                            q51Var = q51Var;
                        }
                        num = (Integer) K.get(Integer.valueOf(unsignedShort2));
                        if (z3 != 0) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == 4) {
                                    j5 = ((long) s51Var.readInt()) & 4294967295L;
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = s51Var.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = s51Var.readInt();
                                } else {
                                    j5 = -1;
                                }
                                if (z3 != 0) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), q51Var.b));
                                }
                                if (j5 > 0 || (i5 != -1 && j5 >= i5)) {
                                    hashSet = hashSet2;
                                    if (z3 != 0) {
                                        strO = ud2.o("Skip jump into the IFD since its offset is invalid: ", j5);
                                        if (i5 != -1) {
                                            strO = strO + " (total length: " + i5 + ")";
                                        }
                                        Log.d("ExifInterface", strO);
                                    }
                                } else {
                                    hashSet = hashSet2;
                                    if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                        s51Var.c(j5);
                                        s(s51Var, num.intValue());
                                    } else if (z3 != 0) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                    }
                                }
                                s51Var.c(j3);
                            } else {
                                unsignedShort = s51Var.readUnsignedShort();
                            }
                            j5 = unsignedShort;
                            if (z3 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), q51Var.b));
                            }
                            if (j5 > 0) {
                                hashSet = hashSet2;
                                if (z3 != 0) {
                                    strO = ud2.o("Skip jump into the IFD since its offset is invalid: ", j5);
                                    if (i5 != -1) {
                                        strO = strO + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strO);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z3 != 0) {
                                    strO = ud2.o("Skip jump into the IFD since its offset is invalid: ", j5);
                                    if (i5 != -1) {
                                        strO = strO + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strO);
                                }
                            }
                            s51Var.c(j3);
                        } else {
                            hashSet = hashSet2;
                            j4 = j3;
                            int i8 = s51Var.d + this.g;
                            byte[] bArr = new byte[(int) j2];
                            s51Var.readFully(bArr);
                            p51 p51Var = new p51(i8, bArr, unsignedShort3, i6);
                            HashMap map = mapArr[i];
                            str = q51Var.b;
                            map.put(str, p51Var);
                            if ("DNGVersion".equals(str)) {
                                this.b = 3;
                            }
                            if (((!"Make".equals(str) || "Model".equals(str)) && p51Var.f(this.e).contains("PENTAX")) || ("Compression".equals(str) && p51Var.e(this.e) == 65535)) {
                                this.b = 8;
                            }
                            if (s51Var.d != j4) {
                                s51Var.c(j4);
                            }
                        }
                    } else {
                        s51Var.c(j);
                        hashSet = hashSet2;
                    }
                    s3 = (short) (s3 + 1);
                    hashSet2 = hashSet;
                    s2 = s4;
                    z3 = z3;
                }
                j = j6;
                if (z3 != 0) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j2 = 0;
                z2 = false;
                if (z2) {
                    s51Var.c(j);
                    hashSet = hashSet2;
                } else {
                    j3 = j;
                    if (j2 > 4) {
                        i3 = s51Var.readInt();
                        if (z3 != 0) {
                            Log.d("ExifInterface", "seek to data offset: " + i3);
                        }
                        if (this.b == 7) {
                            if ("MakerNote".equals(q51Var.b)) {
                                this.h = i3;
                            } else if (i != 6) {
                            }
                        }
                        s51Var.c(i3);
                    } else {
                        j3 = j3;
                        unsignedShort2 = unsignedShort2;
                        q51Var = q51Var;
                    }
                    num = (Integer) K.get(Integer.valueOf(unsignedShort2));
                    if (z3 != 0) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == 4) {
                                j5 = ((long) s51Var.readInt()) & 4294967295L;
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = s51Var.readInt();
                            } else {
                                unsignedShort = s51Var.readShort();
                            }
                            if (z3 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), q51Var.b));
                            }
                            if (j5 > 0) {
                                hashSet = hashSet2;
                                if (z3 != 0) {
                                    strO = ud2.o("Skip jump into the IFD since its offset is invalid: ", j5);
                                    if (i5 != -1) {
                                        strO = strO + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strO);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z3 != 0) {
                                    strO = ud2.o("Skip jump into the IFD since its offset is invalid: ", j5);
                                    if (i5 != -1) {
                                        strO = strO + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strO);
                                }
                            }
                            s51Var.c(j3);
                        } else {
                            unsignedShort = s51Var.readUnsignedShort();
                        }
                        j5 = unsignedShort;
                        if (z3 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), q51Var.b));
                        }
                        if (j5 > 0) {
                            hashSet = hashSet2;
                            if (z3 != 0) {
                                strO = ud2.o("Skip jump into the IFD since its offset is invalid: ", j5);
                                if (i5 != -1) {
                                    strO = strO + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strO);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z3 != 0) {
                                strO = ud2.o("Skip jump into the IFD since its offset is invalid: ", j5);
                                if (i5 != -1) {
                                    strO = strO + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strO);
                            }
                        }
                        s51Var.c(j3);
                    } else {
                        hashSet = hashSet2;
                        j4 = j3;
                        int i9 = s51Var.d + this.g;
                        byte[] bArr2 = new byte[(int) j2];
                        s51Var.readFully(bArr2);
                        p51 p51Var2 = new p51(i9, bArr2, unsignedShort3, i6);
                        HashMap map2 = mapArr[i];
                        str = q51Var.b;
                        map2.put(str, p51Var2);
                        if ("DNGVersion".equals(str)) {
                            this.b = 3;
                        }
                        if (!"Make".equals(str)) {
                        }
                        this.b = 8;
                        if (s51Var.d != j4) {
                            s51Var.c(j4);
                        }
                    }
                }
                s3 = (short) (s3 + 1);
                hashSet2 = hashSet;
                s2 = s4;
                z3 = z3;
            } else if (z3) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            j = j6;
            j2 = 0;
            z2 = false;
            if (z2) {
                s51Var.c(j);
                hashSet = hashSet2;
            } else {
                j3 = j;
                if (j2 > 4) {
                    i3 = s51Var.readInt();
                    if (z3 != 0) {
                        Log.d("ExifInterface", "seek to data offset: " + i3);
                    }
                    if (this.b == 7) {
                        if ("MakerNote".equals(q51Var.b)) {
                            this.h = i3;
                        } else if (i != 6) {
                        }
                    }
                    s51Var.c(i3);
                } else {
                    j3 = j3;
                    unsignedShort2 = unsignedShort2;
                    q51Var = q51Var;
                }
                num = (Integer) K.get(Integer.valueOf(unsignedShort2));
                if (z3 != 0) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j5 = ((long) s51Var.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = s51Var.readInt();
                        } else {
                            unsignedShort = s51Var.readShort();
                        }
                        if (z3 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), q51Var.b));
                        }
                        if (j5 > 0) {
                            hashSet = hashSet2;
                            if (z3 != 0) {
                                strO = ud2.o("Skip jump into the IFD since its offset is invalid: ", j5);
                                if (i5 != -1) {
                                    strO = strO + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strO);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z3 != 0) {
                                strO = ud2.o("Skip jump into the IFD since its offset is invalid: ", j5);
                                if (i5 != -1) {
                                    strO = strO + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strO);
                            }
                        }
                        s51Var.c(j3);
                    } else {
                        unsignedShort = s51Var.readUnsignedShort();
                    }
                    j5 = unsignedShort;
                    if (z3 != 0) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), q51Var.b));
                    }
                    if (j5 > 0) {
                        hashSet = hashSet2;
                        if (z3 != 0) {
                            strO = ud2.o("Skip jump into the IFD since its offset is invalid: ", j5);
                            if (i5 != -1) {
                                strO = strO + " (total length: " + i5 + ")";
                            }
                            Log.d("ExifInterface", strO);
                        }
                    } else {
                        hashSet = hashSet2;
                        if (z3 != 0) {
                            strO = ud2.o("Skip jump into the IFD since its offset is invalid: ", j5);
                            if (i5 != -1) {
                                strO = strO + " (total length: " + i5 + ")";
                            }
                            Log.d("ExifInterface", strO);
                        }
                    }
                    s51Var.c(j3);
                } else {
                    hashSet = hashSet2;
                    j4 = j3;
                    int i10 = s51Var.d + this.g;
                    byte[] bArr3 = new byte[(int) j2];
                    s51Var.readFully(bArr3);
                    p51 p51Var3 = new p51(i10, bArr3, unsignedShort3, i6);
                    HashMap map3 = mapArr[i];
                    str = q51Var.b;
                    map3.put(str, p51Var3);
                    if ("DNGVersion".equals(str)) {
                        this.b = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.b = 8;
                    if (s51Var.d != j4) {
                        s51Var.c(j4);
                    }
                }
            }
            s3 = (short) (s3 + 1);
            hashSet2 = hashSet;
            s2 = s4;
            z3 = z3;
        }
        HashSet hashSet3 = hashSet2;
        boolean z4 = z3;
        int i11 = s51Var.readInt();
        if (z4) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i11)));
        }
        long j7 = i11;
        if (j7 <= 0) {
            if (z4) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i11);
                return;
            }
            return;
        }
        if (hashSet3.contains(Integer.valueOf(i11))) {
            if (z4) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i11);
                return;
            }
            return;
        }
        s51Var.c(j7);
        if (mapArr[4].isEmpty()) {
            s(s51Var, 4);
        } else if (mapArr[5].isEmpty()) {
            s(s51Var, 5);
        }
    }

    public final void t(String str, String str2, int i) {
        HashMap[] mapArr = this.c;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, (p51) map.get(str));
        mapArr[i].remove(str);
    }

    public final void u(o51 o51Var) throws IOException {
        p51 p51Var;
        int iE;
        HashMap map = this.c[4];
        p51 p51Var2 = (p51) map.get("Compression");
        if (p51Var2 == null) {
            m(o51Var, map);
            return;
        }
        int iE2 = p51Var2.e(this.e);
        if (iE2 != 1) {
            if (iE2 == 6) {
                m(o51Var, map);
                return;
            } else if (iE2 != 7) {
                return;
            }
        }
        p51 p51Var3 = (p51) map.get("BitsPerSample");
        if (p51Var3 != null) {
            int[] iArr = (int[]) p51Var3.g(this.e);
            int[] iArr2 = m;
            if (Arrays.equals(iArr2, iArr) || (this.b == 3 && (p51Var = (p51) map.get("PhotometricInterpretation")) != null && (((iE = p51Var.e(this.e)) == 1 && Arrays.equals(iArr, n)) || (iE == 6 && Arrays.equals(iArr, iArr2))))) {
                p51 p51Var4 = (p51) map.get("StripOffsets");
                p51 p51Var5 = (p51) map.get("StripByteCounts");
                if (p51Var4 == null || p51Var5 == null) {
                    return;
                }
                long[] jArrR = p23.r(p51Var4.g(this.e));
                long[] jArrR2 = p23.r(p51Var5.g(this.e));
                if (jArrR == null || jArrR.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrR2 == null || jArrR2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrR.length != jArrR2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrR2) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.f = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrR.length; i3++) {
                    int i4 = (int) jArrR[i3];
                    int i5 = (int) jArrR2[i3];
                    if (i3 < jArrR.length - 1 && i4 + i5 != jArrR[i3 + 1]) {
                        this.f = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        o51Var.a(i6);
                        int i7 = i + i6;
                        byte[] bArr2 = new byte[i5];
                        try {
                            o51Var.readFully(bArr2);
                            i = i7 + i5;
                            System.arraycopy(bArr2, 0, bArr, i2, i5);
                            i2 += i5;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                }
                if (this.f) {
                    long j3 = jArrR[0];
                    return;
                }
                return;
            }
        }
        if (l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i, int i2) {
        HashMap[] mapArr = this.c;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z2 = l;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z2) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        p51 p51Var = (p51) mapArr[i].get("ImageLength");
        p51 p51Var2 = (p51) mapArr[i].get("ImageWidth");
        p51 p51Var3 = (p51) mapArr[i2].get("ImageLength");
        p51 p51Var4 = (p51) mapArr[i2].get("ImageWidth");
        if (p51Var == null || p51Var2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (p51Var3 == null || p51Var4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iE = p51Var.e(this.e);
        int iE2 = p51Var2.e(this.e);
        int iE3 = p51Var3.e(this.e);
        int iE4 = p51Var4.e(this.e);
        if (iE >= iE3 || iE2 >= iE4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public final void w(s51 s51Var, int i) throws IOException {
        p51 p51VarC;
        p51 p51VarC2;
        HashMap[] mapArr = this.c;
        p51 p51Var = (p51) mapArr[i].get("DefaultCropSize");
        p51 p51Var2 = (p51) mapArr[i].get("SensorTopBorder");
        p51 p51Var3 = (p51) mapArr[i].get("SensorLeftBorder");
        p51 p51Var4 = (p51) mapArr[i].get("SensorBottomBorder");
        p51 p51Var5 = (p51) mapArr[i].get("SensorRightBorder");
        if (p51Var != null) {
            int i2 = p51Var.a;
            ByteOrder byteOrder = this.e;
            if (i2 == 5) {
                r51[] r51VarArr = (r51[]) p51Var.g(byteOrder);
                if (r51VarArr == null || r51VarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(r51VarArr));
                    return;
                }
                p51VarC = p51.b(r51VarArr[0], this.e);
                p51VarC2 = p51.b(r51VarArr[1], this.e);
            } else {
                int[] iArr = (int[]) p51Var.g(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                p51VarC = p51.c(iArr[0], this.e);
                p51VarC2 = p51.c(iArr[1], this.e);
            }
            mapArr[i].put("ImageWidth", p51VarC);
            mapArr[i].put("ImageLength", p51VarC2);
            return;
        }
        if (p51Var2 != null && p51Var3 != null && p51Var4 != null && p51Var5 != null) {
            int iE = p51Var2.e(this.e);
            int iE2 = p51Var4.e(this.e);
            int iE3 = p51Var5.e(this.e);
            int iE4 = p51Var3.e(this.e);
            if (iE2 <= iE || iE3 <= iE4) {
                return;
            }
            p51 p51VarC3 = p51.c(iE2 - iE, this.e);
            p51 p51VarC4 = p51.c(iE3 - iE4, this.e);
            mapArr[i].put("ImageLength", p51VarC3);
            mapArr[i].put("ImageWidth", p51VarC4);
            return;
        }
        p51 p51Var6 = (p51) mapArr[i].get("ImageLength");
        p51 p51Var7 = (p51) mapArr[i].get("ImageWidth");
        if (p51Var6 == null || p51Var7 == null) {
            p51 p51Var8 = (p51) mapArr[i].get("JPEGInterchangeFormat");
            p51 p51Var9 = (p51) mapArr[i].get("JPEGInterchangeFormatLength");
            if (p51Var8 == null || p51Var9 == null) {
                return;
            }
            int iE5 = p51Var8.e(this.e);
            int iE6 = p51Var8.e(this.e);
            s51Var.c(iE5);
            byte[] bArr = new byte[iE6];
            s51Var.readFully(bArr);
            e(new o51(bArr), iE5, i);
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] mapArr = this.c;
        p51 p51Var = (p51) mapArr[1].get("PixelXDimension");
        p51 p51Var2 = (p51) mapArr[1].get("PixelYDimension");
        if (p51Var != null && p51Var2 != null) {
            mapArr[0].put("ImageWidth", p51Var);
            mapArr[0].put("ImageLength", p51Var2);
        }
        if (mapArr[4].isEmpty() && n(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!n(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t("ThumbnailOrientation", "Orientation", 0);
        t("ThumbnailImageLength", "ImageLength", 0);
        t("ThumbnailImageWidth", "ImageWidth", 0);
        t("ThumbnailOrientation", "Orientation", 5);
        t("ThumbnailImageLength", "ImageLength", 5);
        t("ThumbnailImageWidth", "ImageWidth", 5);
        t("Orientation", "ThumbnailOrientation", 4);
        t("ImageLength", "ThumbnailImageLength", 4);
        t("ImageWidth", "ThumbnailImageWidth", 4);
    }
}
