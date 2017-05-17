package lt.pawil.kasmdcvalgyklosuzsakymusistema;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /** Main activity tikrinam, ar naudotojas prisiloginęs;
         * jei ne - rodom auklėtojos arba valgyklos pasirinkimo valdiklį,
         * kurį spustelėjus perkeliam į prisijungimo activity (perkeldami nurodom, norimą režimą prisijungus)
         * jei taip - perkeliam į atitinkamo režimo activity
         */

    }
}
