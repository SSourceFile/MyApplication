package com.example.tinkerfix;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Created by hmh on 2017/2/15.
 */

public class SampleApplication extends TinkerApplication {
//    private static final int TINKER_ENABLE_ALL = 100;

    public SampleApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.example.tinkerfix.SampleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
