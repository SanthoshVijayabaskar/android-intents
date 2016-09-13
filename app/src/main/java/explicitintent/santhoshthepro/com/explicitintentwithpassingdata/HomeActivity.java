package explicitintent.santhoshthepro.com.explicitintentwithpassingdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView txtWelcomeMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        txtWelcomeMsg =(TextView)findViewById(R.id.txtPlaceholder);
        StringBuilder msg = new StringBuilder("Welcome \n");


        Intent deliveredIntent = getIntent();

                //Method 1: Using putExtras Functionality - Using Bundle Indirectly
                //deliveredIntent.putExtra("name",txtWelcomeMsg.getText().toString());


                //Method 2: Sending data in Bundle directly
                Bundle receivedData = deliveredIntent.getExtras();

                    if(receivedData.containsKey("name")){
                        msg.append(receivedData.getString("name"));
                    }

        txtWelcomeMsg.setText(msg);
    }
}
