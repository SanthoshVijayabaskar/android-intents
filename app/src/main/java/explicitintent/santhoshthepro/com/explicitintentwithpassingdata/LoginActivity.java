package explicitintent.santhoshthepro.com.explicitintentwithpassingdata;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    Button btnSubmit,btnWeb;
    EditText edtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnSubmit=(Button)findViewById(R.id.btnSubmit);
        btnWeb=(Button)findViewById(R.id.btnOpenWeb);
        edtName =(EditText)findViewById(R.id.edtName);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Explicit Intent
                Intent myIntent = new Intent(LoginActivity.this,HomeActivity.class);

                //Passing data using Bundle object
                Bundle data = new Bundle();
                data.putString("name",edtName.getText().toString());
                myIntent.putExtras(data);


                startActivity(myIntent);
            }
        });

        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Implicit Intent
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.santhoshvijay.com"));
                startActivity(myIntent);
            }
        });
    }
}
