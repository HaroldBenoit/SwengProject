package ch.epfl.sweng.project;

import android.app.Application;
import android.content.Context;

import dagger.hilt.android.testing.HiltTestApplication;

public class AndroidJUnitRunner extends androidx.test.runner.AndroidJUnitRunner {

    @Override
    public Application newApplication(ClassLoader cl, String className, Context context)
            throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return super.newApplication(cl, HiltTestApplication.class.getName(), context);
    }

}
