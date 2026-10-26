package defpackage;

import android.app.job.JobParameters;
import android.graphics.Typeface;
import android.util.LongSparseArray;
import android.view.ViewGroup;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ba implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;

    public /* synthetic */ ba(Object obj, int i, Object obj2) {
        this.c = i;
        this.d = obj;
        this.h = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                y64.r((fa) this.d, (LongSparseArray) this.h);
                return;
            case 1:
                wf3 wf3Var = (wf3) this.d;
                try {
                    ((Runnable) this.h).run();
                    return;
                } finally {
                    wf3Var.a();
                }
            case 2:
                qu quVar = (qu) this.d;
                uu uuVar = (uu) this.h;
                av avVar = quVar.c0;
                if (avVar.c == null) {
                    avVar.c = new xu();
                }
                avVar.c.N(uuVar);
                return;
            case 3:
                wh4 wh4Var = (wh4) this.d;
                String string = ((UUID) this.h).toString();
                string.getClass();
                av1.e(wh4Var, string);
                return;
            case 4:
                qg0 qg0Var = (qg0) this.d;
                go2 go2Var = (go2) this.h;
                int i = qg0.B;
                qg0Var.c.a(new jg0(go2Var, qg0Var));
                return;
            case 5:
                List<ur> list = (List) this.d;
                im0 im0Var = (im0) this.h;
                for (ur urVar : list) {
                    Object obj = im0Var.e;
                    vr vrVar = urVar.a;
                    Object an0Var = vrVar.e(obj) ? new an0(vrVar.d()) : zm0.a;
                    wz2 wz2Var = urVar.b;
                    wz2Var.getClass();
                    wz2Var.i(an0Var);
                }
                return;
            case 6:
                ViewGroup viewGroup = (ViewGroup) this.d;
                viewGroup.getClass();
                viewGroup.endViewTransition(null);
                throw null;
            case 7:
                ((t00) this.d).E((eh1) this.h);
                return;
            case 8:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.d;
                JobParameters jobParameters = (JobParameters) this.h;
                int i2 = JobInfoSchedulerService.c;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 9:
                le1 le1Var = (le1) this.d;
                jr0 jr0Var = (jr0) this.h;
                jr0Var.getClass();
                le1Var.invoke(Integer.valueOf(jr0Var.getLineCount()));
                return;
            case 10:
                tz2 tz2Var = (tz2) this.d;
                vh4 vh4Var = (vh4) this.h;
                synchronized (tz2Var.k) {
                    try {
                        ArrayList arrayList = tz2Var.j;
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj2 = arrayList.get(i3);
                            i3++;
                            ((h51) obj2).d(vh4Var, false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 11:
                ((bk) this.d).p((Typeface) this.h);
                return;
            case 12:
                ((fp1) ((ir3) this.d).d).p((dn3) this.h, 3);
                return;
            default:
                Runnable runnable = (Runnable) this.d;
                wf3 wf3Var2 = (wf3) this.h;
                try {
                    runnable.run();
                    return;
                } finally {
                    wf3Var2.a();
                }
        }
    }
}
