package truckstationsa.truckstation;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by manal on 2/9/2018.
 */

public class CustomerLogInPage extends AppCompatActivity {
Button login  ;
Button rigister ;
EditText username ,password ;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        rigister = (Button) findViewById(R.id.signup);


    }
    public void goTOCustomerRegisterPage (View view ){
        Intent intent = new Intent(CustomerLogInPage.this , GoTOCustomerRegisterPage.class );
        startActivity(intent);

    }
}
