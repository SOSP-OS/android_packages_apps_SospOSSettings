package com.sospos.settings.fragments;

import com.android.internal.logging.nano.MetricsProto;

import android.os.Bundle;
import com.android.settings.R;

import com.android.settings.SettingsPreferenceFragment;

public class LockScreenSettings extends SettingsPreferenceFragment {
        
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        addPreferencesFromResource(R.xml.sospos_lockscreen);

    }

    @Override
    public int getMetricsCategory() {
        return MetricsProto.MetricsEvent.SOSP_Metric;
    }
}
