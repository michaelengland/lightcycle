package com.soundcloud.lightcycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Lifts {
    public static <Source extends Activity, Target extends Source> ActivityLightCycle<Target> lift(final ActivityLightCycle<Source> lightCycle) {
        return new ActivityLightCycle<Target>() {

            @Override
            public void onCreate(Target activity, Bundle bundle) {
                lightCycle.onCreate(activity, bundle);
            }

            @Override
            public void onNewIntent(Target activity, Intent intent) {
                lightCycle.onNewIntent(activity, intent);
            }

            @Override
            public void onStart(Target activity) {
                lightCycle.onStart(activity);
            }

            @Override
            public void onResume(Target activity) {
                lightCycle.onResume(activity);
            }

            @Override
            public boolean onOptionsItemSelected(Target activity, MenuItem item) {
                return lightCycle.onOptionsItemSelected(activity, item);
            }

            @Override
            public void onPause(Target activity) {
                lightCycle.onPause(activity);
            }

            @Override
            public void onStop(Target activity) {
                lightCycle.onStop(activity);
            }

            @Override
            public void onSaveInstanceState(Target activity, Bundle bundle) {
                lightCycle.onSaveInstanceState(activity, bundle);
            }

            @Override
            public void onRestoreInstanceState(Target activity, Bundle bundle) {
                lightCycle.onRestoreInstanceState(activity, bundle);
            }

            @Override
            public void onDestroy(Target activity) {
                lightCycle.onDestroy(activity);
            }
        };
    }

    public static <Source extends android.app.Fragment, Target extends Source> FragmentLightCycle<Target> lift(final FragmentLightCycle<Source> lightCycle) {
        return new FragmentLightCycle<Target>() {

            @Override
            public void onAttach(Target fragment, Activity activity) {
                lightCycle.onAttach(fragment, activity);
            }

            @Override
            public void onCreate(Target fragment, Bundle bundle) {
                lightCycle.onCreate(fragment, bundle);
            }

            @Override
            public void onViewCreated(Target fragment, View view, Bundle savedInstanceState) {
                lightCycle.onViewCreated(fragment, view, savedInstanceState);
            }

            @Override
            public void onActivityCreated(Target fragment, Bundle bundle) {
                lightCycle.onActivityCreated(fragment, bundle);
            }

            @Override
            public void onStart(Target fragment) {
                lightCycle.onStart(fragment);
            }

            @Override
            public void onResume(Target fragment) {
                lightCycle.onResume(fragment);
            }

            @Override
            public boolean onOptionsItemSelected(Target fragment, MenuItem item) {
                return lightCycle.onOptionsItemSelected(fragment, item);
            }

            @Override
            public void onPause(Target fragment) {
                lightCycle.onPause(fragment);
            }

            @Override
            public void onStop(Target fragment) {
                lightCycle.onStop(fragment);
            }

            @Override
            public void onSaveInstanceState(Target fragment, Bundle bundle) {
                lightCycle.onSaveInstanceState(fragment, bundle);
            }

            @Override
            public void onDestroyView(Target fragment) {
                lightCycle.onDestroyView(fragment);
            }

            @Override
            public void onDestroy(Target fragment) {
                lightCycle.onDestroy(fragment);
            }

            @Override
            public void onDetach(Target fragment) {
                lightCycle.onDetach(fragment);
            }
        };
    }


    public static <Source extends android.support.v4.app.Fragment, Target extends Source> SupportFragmentLightCycle<Target> lift(final SupportFragmentLightCycle<Source> lightCycle) {
        return new SupportFragmentLightCycle<Target>() {

            @Override
            public void onAttach(Target fragment, Activity activity) {
                lightCycle.onAttach(fragment, activity);
            }

            @Override
            public void onCreate(Target fragment, Bundle bundle) {
                lightCycle.onCreate(fragment, bundle);
            }

            @Override
            public void onViewCreated(Target fragment, View view, Bundle savedInstanceState) {
                lightCycle.onViewCreated(fragment, view, savedInstanceState);
            }

            @Override
            public void onActivityCreated(Target fragment, Bundle bundle) {
                lightCycle.onActivityCreated(fragment, bundle);
            }

            @Override
            public void onStart(Target fragment) {
                lightCycle.onStart(fragment);
            }

            @Override
            public void onResume(Target fragment) {
                lightCycle.onResume(fragment);
            }

            @Override
            public boolean onOptionsItemSelected(Target fragment, MenuItem item) {
                return lightCycle.onOptionsItemSelected(fragment, item);
            }

            @Override
            public void onPause(Target fragment) {
                lightCycle.onPause(fragment);
            }

            @Override
            public void onStop(Target fragment) {
                lightCycle.onStop(fragment);
            }

            @Override
            public void onSaveInstanceState(Target fragment, Bundle bundle) {
                lightCycle.onSaveInstanceState(fragment, bundle);
            }

            @Override
            public void onDestroyView(Target fragment) {
                lightCycle.onDestroyView(fragment);
            }

            @Override
            public void onDestroy(Target fragment) {
                lightCycle.onDestroy(fragment);
            }

            @Override
            public void onDetach(Target fragment) {
                lightCycle.onDetach(fragment);
            }
        };
    }
}
