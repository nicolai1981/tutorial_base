package br.com.nicolaiito.loginexample.model;

import android.content.Context;

public class GoogleProvider extends ProviderBase {
    public GoogleProvider(Context context) {
        super(context);
        mType = TYPE.GOOGLE;
    }
}
