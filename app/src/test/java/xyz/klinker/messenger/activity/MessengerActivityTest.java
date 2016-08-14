/*
 * Copyright (C) 2016 Jacob Klinker
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package xyz.klinker.messenger.activity;

import android.content.Intent;

import org.junit.Before;
import org.junit.Test;
import org.robolectric.Robolectric;

import xyz.klinker.messenger.MessengerRobolectricSuite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.robolectric.Shadows.shadowOf;

public class MessengerActivityTest extends MessengerRobolectricSuite {

    private MessengerActivity activity;

    @Before
    public void setUp() {
        activity = Robolectric.setupActivity(MessengerActivity.class);
    }

    @Test
    public void startedCorrectly() {
        assertNotNull(activity);
    }

    @Test
    public void nextStartedActivity() {
        Intent intent = new Intent(activity, InitialLoadActivity.class);
        assertEquals(intent, shadowOf(activity).getNextStartedActivity());
    }

//    @Test
//    public void dontStartInitialLoad() {
//        Settings.getPrefs(RuntimeEnvironment.application).edit().putBoolean(Settings.FIRST_START, false).commit();
//        activity = Robolectric.setupActivity(MessengerActivity.class);
//        assertNull(shadowOf(activity).getNextStartedActivity());
//    }

}