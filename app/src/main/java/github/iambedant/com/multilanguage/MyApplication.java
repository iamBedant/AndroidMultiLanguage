package github.iambedant.com.multilanguage;

import android.app.Application;
import android.content.res.Configuration;

import java.util.Locale;

/**
 * Created by @iamBedant on 05/02/17.
 */

public class MyApplication extends Application {
    public void onCreate(){
        super.onCreate();

        LocaleUtils.setLocale(new Locale("en"));
        LocaleUtils.updateConfig(this, getBaseContext().getResources().getConfiguration());
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        LocaleUtils.updateConfig(this, newConfig);
    }
}