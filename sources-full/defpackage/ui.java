package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class ui extends wi {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ zi d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui(zi ziVar, Context context) {
        super(ziVar);
        this.d = ziVar;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui(zi ziVar, iy2 iy2Var) {
        super(ziVar);
        this.d = ziVar;
        this.e = iy2Var;
    }

    @Override // defpackage.wi
    public final IntentFilter d() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // defpackage.wi
    public final int g() {
        Location location;
        boolean z;
        long j;
        Location lastKnownLocation;
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                return pi.a((PowerManager) obj) ? 2 : 1;
            default:
                iy2 iy2Var = (iy2) obj;
                v64 v64Var = (v64) iy2Var.l;
                LocationManager locationManager = (LocationManager) iy2Var.h;
                if (v64Var.b <= System.currentTimeMillis()) {
                    Context context = (Context) iy2Var.d;
                    Location lastKnownLocation2 = null;
                    if (yh4.p(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                            lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        location = lastKnownLocation;
                    } else {
                        location = null;
                    }
                    if (yh4.p(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                        location = lastKnownLocation2;
                    }
                    z = false;
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (u64.d == null) {
                            u64.d = new u64();
                        }
                        u64 u64Var = u64.d;
                        u64Var.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        u64Var.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                        z = u64Var.c == 1;
                        long j2 = u64Var.b;
                        long j3 = u64Var.a;
                        u64Var.a(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                        long j4 = u64Var.b;
                        if (j2 == -1 || j3 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j3) {
                                j2 = j4;
                            } else if (jCurrentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        }
                        v64Var.a = z;
                        v64Var.b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z = true;
                        }
                    }
                    break;
                } else {
                    z = v64Var.a;
                }
                return z ? 2 : 1;
        }
    }

    @Override // defpackage.wi
    public final void k() {
        int i = this.c;
        zi ziVar = this.d;
        switch (i) {
            case 0:
                ziVar.q(true, true);
                break;
            default:
                ziVar.q(true, true);
                break;
        }
    }
}
