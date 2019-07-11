package com.vishnu.countdemo;

import android.content.SharedPreferences;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.when;

/**
 * Created by Vishnu Saini On 11-07-2019.
 * Unit tests for the {@link Config} that mocks {@link SharedPreferences}.
 */

@RunWith(MockitoJUnitRunner.class)
public class ConfigTest {


    private static final int TEST_COUNT = 5;

    private Config mMockSharedPreferencesHelper;
    private Config mMockBrokenSharedPreferencesHelper;


    @Mock
    SharedPreferences mMockSharedPreferences;
    @Mock
    SharedPreferences mMockBrokenSharedPreferences;
    @Mock
    SharedPreferences.Editor mMockEditor;
    @Mock
    SharedPreferences.Editor mMockBrokenEditor;


    @Before
    public void initMocks() {

        // Create a mocked SharedPreferences.
        mMockSharedPreferencesHelper = createMockSharedPreference();
        // Create a mocked SharedPreferences that fails at saving data.
        mMockBrokenSharedPreferencesHelper = createBrokenMockSharedPreference();
    }

    private Config createMockSharedPreference() {
        // Mocking reading the SharedPreferences as if mMockSharedPreferences was previously written
        // correctly.
        when(mMockSharedPreferences.getInt(eq(Config.TOUCH_COUNT), anyInt()))
                .thenReturn(Config.getTouchCount());

        // Mocking a successful commit.
        when(mMockEditor.commit()).thenReturn(true);
        // Return the MockEditor when requesting it.
        when(mMockSharedPreferences.edit()).thenReturn(mMockEditor);
        return new Config(mMockSharedPreferences);
    }

    private Config createBrokenMockSharedPreference() {
        // Mocking a commit that fails.
        when(mMockBrokenEditor.commit()).thenReturn(false);
        // Return the broken MockEditor when requesting it.
        when(mMockBrokenSharedPreferences.edit()).thenReturn(mMockBrokenEditor);
        return new Config(mMockBrokenSharedPreferences);
    }

    @Test
    public void sharedPreferencesHelper_SaveAndReadPersonalInformation() {
        // Save the Count to SharedPreferences
        boolean success = mMockSharedPreferencesHelper.setTouchCount(TEST_COUNT);
        assertThat("Checking that SharedPreferenceEntry.save... returns true",
                success, is(true));
        // Read Count from SharedPreferences
        int savedSharedPreferenceEntry = mMockSharedPreferencesHelper.getTouchCount();

        // Make sure both written and retrieved personal information are equal.
        assertThat("Checking that Config.getCount has been persisted and read correctly",savedSharedPreferenceEntry,
                is(equalTo(mMockSharedPreferencesHelper.getTouchCount())));

    }

    @Test
    public void sharedPreferencesHelper_SavePersonalInformationFailed_ReturnsFalse() {
        // Read Count from a broken SharedPreferencesHelper
        boolean success =
                mMockBrokenSharedPreferencesHelper.setTouchCount(TEST_COUNT);
        assertThat("Makes sure writing to a broken SharedPreferencesHelper returns false", success,
                is(false));
    }

}
