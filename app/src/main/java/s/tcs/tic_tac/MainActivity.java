package s.tcs.tic_tac;

import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int click=1;
    Button mainbutton;

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    public static int SPLASH_DISPLAY_LENGTH=1000;
    public int Player1=0,Player2=0;
    TextView score1,score2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.btn1);
        b2=(Button)findViewById(R.id.btn2);
        b3=(Button)findViewById(R.id.btn3);
        b4=(Button)findViewById(R.id.btn4);
        b5=(Button)findViewById(R.id.btn5);
        b6=(Button)findViewById(R.id.btn6);
        b7=(Button)findViewById(R.id.btn7);
        b8=(Button)findViewById(R.id.btn8);
        b9=(Button)findViewById(R.id.btn9);



        score1=(TextView)findViewById(R.id.textView2);
        score2=(TextView)findViewById(R.id.textView3);

    }
    public void btnClicked(View v) {

        mainbutton = (Button) v;
        String buttonText = mainbutton.getText().toString();

        if (click % 2 == 0) {
            SystemChance(buttonText);
            click++;
        } else {
            playerChance(buttonText);
            click++;
        }
    }

    private void SystemChance(String buttonText) {
        switch (buttonText) {
            case "1":
                mainbutton.setText("O");
                check("O");
                mainbutton.setEnabled(false);
                break;
            case "2":
                mainbutton.setText("O");check("O");
                mainbutton.setEnabled(false);
                break;
            case "3":
                mainbutton.setText("O");check("O");
                mainbutton.setEnabled(false);
                break;
            case "4":
                mainbutton.setText("O");check("O");
                mainbutton.setEnabled(false);
                break;
            case "5":
                mainbutton.setText("O");check("O");
                mainbutton.setEnabled(false);
                break;
            case "6":
                mainbutton.setText("O");check("O");
                mainbutton.setEnabled(false);
                break;
            case "7":
                mainbutton.setText("O");check("O");
                mainbutton.setEnabled(false);
                break;
            case "8":
                mainbutton.setText("O");check("O");
                mainbutton.setEnabled(false);
                break;
            case "9":
                mainbutton.setText("O");check("O");
                mainbutton.setEnabled(false);
                break;
        }
    }

    private void check(String Sign) {
        
        if(b1.getText()==Sign && b2.getText()==Sign && b3.getText()==Sign)
        {
            b1.setBackgroundColor(Color.GREEN);
            b2.setBackgroundColor(Color.GREEN);
            b3.setBackgroundColor(Color.GREEN);
            checkingWinner(Sign);
        }
        if(b4.getText()==Sign && b5.getText()==Sign && b6.getText()==Sign)
        {
            b4.setBackgroundColor(Color.GREEN);
            b5.setBackgroundColor(Color.GREEN);
            b6.setBackgroundColor(Color.GREEN);
            checkingWinner(Sign);
        }
        if(b7.getText()==Sign && b8.getText()==Sign && b9.getText()==Sign)
        {
            b7.setBackgroundColor(Color.GREEN);
            b8.setBackgroundColor(Color.GREEN);
            b9.setBackgroundColor(Color.GREEN);
            checkingWinner(Sign);
        }

        if(b1.getText()==Sign && b5.getText()==Sign && b9.getText()==Sign)
        {
            b1.setBackgroundColor(Color.GREEN);
            b5.setBackgroundColor(Color.GREEN);
            b9.setBackgroundColor(Color.GREEN);
            checkingWinner(Sign);
        }
        if(b3.getText()==Sign && b5.getText()==Sign && b7.getText()==Sign)
        {
            b3.setBackgroundColor(Color.GREEN);
            b5.setBackgroundColor(Color.GREEN);
            b7.setBackgroundColor(Color.GREEN);
            checkingWinner(Sign);
        }


        if(b1.getText()==Sign && b4.getText()==Sign && b7.getText()==Sign)
        {
            b1.setBackgroundColor(Color.GREEN);
            b4.setBackgroundColor(Color.GREEN);
            b7.setBackgroundColor(Color.GREEN);
            checkingWinner(Sign);
        }

        if(b2.getText()==Sign && b5.getText()==Sign && b8.getText()==Sign)
        {
            b2.setBackgroundColor(Color.GREEN);
            b5.setBackgroundColor(Color.GREEN);
            b8.setBackgroundColor(Color.GREEN);
            checkingWinner(Sign);
        }
        if(b3.getText()==Sign && b6.getText()==Sign && b9.getText()==Sign)
        {
            b3.setBackgroundColor(Color.GREEN);
            b6.setBackgroundColor(Color.GREEN);
            b9.setBackgroundColor(Color.GREEN);
            checkingWinner(Sign);
        }


    }

    private void checkingWinner(String Above_text) {


            if (Above_text == "X") {
                Player1 += 10;
                score1.setText("Player1 :" + Player1);
                Toast.makeText(getApplicationContext(), "Winner is X", Toast.LENGTH_SHORT).show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        clear();
                    }
                }, SPLASH_DISPLAY_LENGTH);


            }if(Above_text=="O"){
                Player2 += 10;
                score2.setText("Player2 :" + Player2);
                Toast.makeText(getApplicationContext(), "Winner is O", Toast.LENGTH_SHORT).show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        clear();
                    }
                }, SPLASH_DISPLAY_LENGTH);
            }
           else {
                Toast.makeText(getApplicationContext(), "Game is Draw", Toast.LENGTH_SHORT).show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        clear();
                    }
                }, SPLASH_DISPLAY_LENGTH);
            }


    }

    private void clear() {
        click=1;
        b1.setText("1");b2.setText("2");b3.setText("3");b4.setText("4");b5.setText("5");b6.setText("6");b7.setText("7");b8.setText("8");b9.setText("9");


        b1.setEnabled(true);b2.setEnabled(true);b3.setEnabled(true);
        b4.setEnabled(true);b5.setEnabled(true);b6.setEnabled(true);
        b7.setEnabled(true);b8.setEnabled(true);b9.setEnabled(true);

        b1.setBackgroundResource(android.R.drawable.btn_default);
        b2.setBackgroundResource(android.R.drawable.btn_default);
        b3.setBackgroundResource(android.R.drawable.btn_default);

        b4.setBackgroundResource(android.R.drawable.btn_default);
        b5.setBackgroundResource(android.R.drawable.btn_default);
        b6.setBackgroundResource(android.R.drawable.btn_default);


        b7.setBackgroundResource(android.R.drawable.btn_default);
        b8.setBackgroundResource(android.R.drawable.btn_default);
        b9.setBackgroundResource(android.R.drawable.btn_default);
    }

    public void playerChance(String buttonText)
    {
        switch (buttonText) {
            case "1":
                mainbutton.setText("X");check("X");
                mainbutton.setEnabled(false);
                break;
            case "2":
                mainbutton.setText("X");check("X");
                mainbutton.setEnabled(false);
                break;
            case "3":
                mainbutton.setText("X");check("X");
                mainbutton.setEnabled(false);
                break;
            case "4":
                mainbutton.setText("X");check("X");
                mainbutton.setEnabled(false);
                break;
            case "5":
                mainbutton.setText("X");check("X");
                mainbutton.setEnabled(false);
                break;
            case "6":
                mainbutton.setText("X");check("X");
                mainbutton.setEnabled(false);
                break;
            case "7":
                mainbutton.setText("X");check("X");
                mainbutton.setEnabled(false);
                break;
            case "8":
                mainbutton.setText("X");check("X");
                mainbutton.setEnabled(false);
                break;
            case "9":
                mainbutton.setText("X");check("X");
                mainbutton.setEnabled(false);
                break;
        }
    }
}
