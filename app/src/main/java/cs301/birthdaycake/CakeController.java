package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    private CakeView cakeView;
    private CakeModel cakeModel;

    public CakeController(CakeView cakeView){
        this.cakeView = cakeView;
        cakeModel = cakeView.getCakeModel();
    }

    public void onClick(View v){
        Log.d(null, "Clicked");
        cakeModel.candleLit = false;
        cakeView.invalidate();
    }

    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
        if (isChecked){
            cakeModel.hasCandles = true;
            cakeView.invalidate();
        } else {
            cakeModel.hasCandles = false;
            cakeView.invalidate();
        }
    }
}
