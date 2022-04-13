package net.nullschool.grib2json;

import org.junit.Test;


/**
 * 2013-10-24<p/>
 *
 * @author Cameron Beccario
 */
public class LauncherTest {

    @Test
    public void test_1() {
//        Launcher.main(new String[] {"c:/users/cambecc/desktop/gfs/gfs.t18z.pgrb2f00", "out.txt", "true"});
//        Launcher.main(new String[] {"c:/users/cambecc/desktop/gfs/gfs.t18z.pgrbf00.2p5deg.grib2", "out.txt", "false"});

//        String args = "--fc 2 --fs 103 --fv 80 --names c:/users/cambecc/desktop/gfs/gfs.t18z.pgrbf00.2p5deg.grib2";
//        Launcher.main(args.split(" "));

        String argssub = "-d -n -o current-wind-surface-level-gfs-1.0-china-sub.json --fc 2 --fp 2 --fs 103 --fv 10 --flo1 70 --fla1 0 --flo2 140 --fla2 60 --names C:\\Users\\shijq\\Desktop\\gfs.t00z.pgrb2.0p25.f060";
        Launcher.main(argssub.split(" "));
    }
}
