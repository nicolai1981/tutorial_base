package br.com.nicolaiito.loginexample.injection;

import android.app.Application;
import android.content.Context;

import br.com.nicolaiito.loginexample.model.LoginModel;
import br.com.nicolaiito.loginexample.viewmodel.LoginVM;

public class Dependency extends Application {
    private static LoginModel sLoginModel;
    private static LoginVM sLoginVM;

    @Override
    public void onCreate() {
        super.onCreate();
        Context context = getApplicationContext();

        sLoginModel = new LoginModel(context);

        sLoginVM = new LoginVM(context);
    }

    public static final Object get(Class type) {
        if (type == LoginModel.class) {
            return sLoginModel;
        }

        if (type == LoginVM.class) {
            return sLoginVM;
        }

        return null;
    }
}
