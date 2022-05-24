package sg.edu.np.mad.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.button);

        // Issue: initialise it with values and use those values to initialise the textview
        User userObj = new User("Rick Astley", "Never gonna give you up.",
                1, true);

        if (userObj.Followed) {
            btn.setText("UNFOLLOW");
        }
        else {
            btn.setText("FOLLOW");
        }

        TextView usernameView = (TextView) findViewById(R.id.textView2);
        TextView desView = (TextView) findViewById(R.id.textView);

        usernameView.setText(userObj.Name);
        desView.setText(userObj.Description);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (userObj.Followed) {
                    userObj.Followed = false;
                    btn.setText("FOLLOW");
                }
                else {
                    userObj.Followed = true;
                    btn.setText("UNFOLLOW");

                }
            }
        });
    }
}