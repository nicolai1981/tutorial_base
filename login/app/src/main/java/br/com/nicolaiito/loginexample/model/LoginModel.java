package br.com.nicolaiito.loginexample.model;

import android.content.Context;

public class LoginModel {
    private final Context mContext;
    private ProviderBase mProvider;
    private ProviderBase.TYPE mCurType = ProviderBase.TYPE.NONE;

    public LoginModel(Context context) {
        mContext = context;
    }

    public ProviderBase.TYPE getConnectionType() {
        return mCurType;
    }

    public void login(ProviderBase.TYPE type, ProviderBase.LoginCallback cb) {
        if (mProvider == null || mProvider.getType() == type) {
            switch (type) {
                case GOOGLE:
                    mProvider = new GoogleProvider(mContext);
                    break;
                case FACEBOOK:
                    mProvider = new FacebookProvider(mContext);
                    break;
            }
        }
        mProvider.login(cb);
    }
}
