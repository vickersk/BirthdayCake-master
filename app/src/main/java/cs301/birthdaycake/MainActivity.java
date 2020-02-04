package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    private CakeView cakeView;
    private CakeController cakeController;
    private Button blowOutButton;
    private CompoundButton buttonSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        cakeView = findViewById(R.id.cakeview);
        cakeController = new CakeController(cakeView);
        blowOutButton = findViewById(R.id.blowout_button);
        buttonSwitch = findViewById(R.id.candle_switch);

        blowOutButton.setOnClickListener(cakeController);
        buttonSwitch.setOnCheckedChangeListener(cakeController);
    }

    public void goodbye(View button) {
        System.out.println("Goodbye");
        finishAffinity();
    }
}
