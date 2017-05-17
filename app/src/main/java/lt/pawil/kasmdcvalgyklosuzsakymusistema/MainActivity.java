package lt.pawil.kasmdcvalgyklosuzsakymusistema;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static final int USER_TEACHER = 100;
    public static final int USER_KITCHEN = 101;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /* Main activity tikrinam, ar naudotojas prisiloginęs;
         * jei ne - rodom auklėtojos arba valgyklos pasirinkimo valdiklį,
         * kurį spustelėjus perkeliam į prisijungimo activity (perkeldami nurodom, norimą režimą prisijungus)
         * jei taip - perkeliam į atitinkamo režimo activity
         */


        if (userIsConnected()) {

            // Get user type
            int userType = getUserType("STUB ID");

            // Empty intent
            Intent intent = new Intent();

            // Goto to appropriate activivity
            switch (userType) {

                // Teacher is logged in
                case USER_TEACHER: {

                    // Create activity intent
                    intent = new Intent(); // STUB; įdomu, ar galima dar kartą inicijuoti? :)

                    break;
                }

                // Kitchen staff is logged in
                case USER_KITCHEN: {

                    // Create activity intent
                    intent = new Intent(); // STUB

                    break;
                }
            }

            // Store user type
            intent.putExtra("UserType", userType);

            // Launch activity
            startActivity(intent);

        } else {

            // Create login activity intent
            Intent intent = new Intent(); // STUB

            // Store user type
            //o gal cia nereikia jokio userType perduot? userType butu grazintas kaip activityResult is loginActivity
            intent.putExtra("UserType", USER_TEACHER);

            // Launch activity
            startActivity(intent);

        }

    }


    /* Checks if user is connected */
    boolean userIsConnected() {

        // STUB method

        return true;

    }

    /* Returns user type */
    int getUserType(String userId) {

        // STUB

        /* Tikriausiai reikės po prisiloginimo įrašyti naudotojo tipą į telefono shared preferences,
         * kad būtų galima greitai nuskaityti, o ne iš Firebase
         */

        return USER_KITCHEN;

    }

}
