package br.com.nicolaiito.loginexample.model;

import android.content.Context;

public abstract class ProviderBase {
    public enum TYPE {
        GOOGLE,
        FACEBOOK,
        NONE
    }

    protected final Context mContext;
    protected TYPE mType = TYPE.NONE;
    protected LoginCallback mLoginCB = null;


    public ProviderBase(Context context) {
        mContext = context;
    }

    public TYPE getType() {
        return mType;
    }

    public void login(LoginCallback cb) {
        if (mLoginCB != null) {
            mLoginCB.onError(mType);
        }
        mLoginCB = cb;
    }

    public interface LoginCallback {
        public void onFinish(TYPE type);
        public void onError(TYPE type);
    }
}
