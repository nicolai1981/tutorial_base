package br.com.nicolaiito.loginexample.model;

import android.content.Context;

public class FacebookProvider extends ProviderBase {
    public FacebookProvider(Context context) {
        super(context);
        mType = TYPE.FACEBOOK;
    }
}
