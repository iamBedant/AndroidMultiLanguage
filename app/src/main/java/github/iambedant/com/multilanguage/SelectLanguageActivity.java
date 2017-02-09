package github.iambedant.com.multilanguage;

import android.content.Intent;
import github.iambedant.com.multilanguage.R;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;

import java.util.Locale;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class SelectLanguageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_language);
        ButterKnife.bind(this);
    }



    @OnClick(R.id.btn_proceed) public void proceed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @OnClick({ R.id.rb_english, R.id.rb_hindi, R.id.rb_assamese }) public void onRadioButtonClicked(RadioButton radioButton) {
        // Is the button now checked?
        boolean checked = radioButton.isChecked();

        // Check which radio button was clicked
        switch (radioButton.getId()) {
            case R.id.rb_english:
                if (checked) {

                }
                break;
            case R.id.rb_hindi:
                if (checked) {
                    LocaleUtils.setLocale(new Locale("hi"));
                }
                break;
            case R.id.rb_assamese:
                if (checked) {
                    LocaleUtils.setLocale(new Locale("as"));
                }
                break;
        }
    }
}
