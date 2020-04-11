/*Copyright (C) 2015 The ResurrectionRemix Project
     Licensed under the Apache License, Version 2.0 (the "License");
     you may not use this file except in compliance with the License.
     You may obtain a copy of the License at
          http://www.apache.org/licenses/LICENSE-2.0
     Unless required by applicable law or agreed to in writing, software
     distributed under the License is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     See the License for the specific language governing permissions and
     limitations under the License.
*/
package com.android.settings.rr;

import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.*;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.UserHandle;


import android.provider.Settings;
import android.net.Uri;

import com.android.settings.R;
import com.android.settings.rr.utils.RRUtils;
import com.android.settings.search.Indexable.SearchIndexProvider;
import com.android.settings.SettingsPreferenceFragment;
import com.android.settings.Utils;
import com.android.settings.rr.Preferences.CustomSeekBarPreference;

import com.android.internal.logging.nano.MetricsProto.MetricsEvent;

import com.android.settingslib.search.SearchIndexable;
@SearchIndexable
public class ChargeSettings extends SettingsPreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.smart_charging);
    }

    @Override
    public int getMetricsCategory() {
        return MetricsEvent.RESURRECTED;
    }

    public static final SearchIndexProvider SEARCH_INDEX_DATA_PROVIDER =
        RRUtils.addSearchIndexProvider(R.xml.smart_charging);
}
