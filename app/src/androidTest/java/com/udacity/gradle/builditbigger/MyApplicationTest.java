package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by Rim Gazzah on 11/02/19
 */

@RunWith(AndroidJUnit4.class)
public class MyApplicationTest  {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void testAsyncTask() throws InterruptedException, ExecutionException {
        // on the MainActivity execute the AsyncTask
        JokesAsyncTask endpointsAsyncTask = new JokesAsyncTask(new JokesAsyncTask.Callback() {
            @Override
            public void onFinished(String result) {

            }
        });
        endpointsAsyncTask.execute();

        // the String returned in the onPostExecute is being retrieved
        String randomJoke = endpointsAsyncTask.get();

        // If the string is not null, then we got a value, aka a joke
        assertNotNull(randomJoke);

    }}
