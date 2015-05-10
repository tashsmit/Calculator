package gmsyrimis.c4q.nyc.calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    Button multiply;
    Button plus;
    Button minus;
    Button divide;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button clear;
    Button equalsBtn;
    Button bksp;
    Button rightParenthesis;
    Button leftParenthesis;
    Button decimal;
    TextView calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculate = (TextView) findViewById(R.id.calculate);

        multiply = (Button) findViewById(R.id.multiply_btn);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate.append("*");
            }
        });
        divide =(Button) findViewById(R.id.division_btn);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate.append("/");
            }
        });
        plus = (Button) findViewById(R.id.plus_btn);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate.append("+");
            }
        });
        minus = (Button) findViewById(R.id.minus_btn);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate.append("-");
            }
        });
        one = (Button) findViewById(R.id.one_btn);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate.append("1");
            }
        });
        two = (Button) findViewById(R.id.two_btn);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate.append("2");
            }
        });
        three =  (Button) findViewById(R.id.three_btn);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate.append("3");
            }
        });
        four= (Button) findViewById(R.id.four_btn);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate.append("4");
            }
        });
        five = (Button) findViewById(R.id.five_btn);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate.append("5");
            }
        });
        six=(Button) findViewById(R.id.six_btn);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate.append("6");
            }
        });
        seven = (Button) findViewById(R.id.seven_btn);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate.append("7");
            }
        });
        eight = (Button) findViewById(R.id.eight_btn);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate.append("8");
            }
        });
        nine = (Button) findViewById(R.id.nine_btn);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate.append("9");
            }
        });
        zero =  (Button) findViewById(R.id.zero_btn);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate.append("0");
            }
        });
        clear = (Button) findViewById(R.id.clear_btn);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate.setText("");
            }
        });
        equalsBtn = (Button) findViewById(R.id.equals_btn);
        equalsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate.setText("TO ADD FUNCTIONALITY");
            }
        });
        bksp = (Button) findViewById(R.id.backspace_btn);
        bksp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calculate.getText().toString().length()>0){
                String past = calculate.getText().toString();
                String now = past.substring(0,past.length()-1);
                calculate.setText(now);
                }
            }
        });
        rightParenthesis = (Button) findViewById(R.id.right_parenthesis_btn);
        rightParenthesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate.append(")");
            }
        });
        leftParenthesis = (Button) findViewById(R.id.left_parenthesis_btn);
        leftParenthesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate.append("(");
            }
        });
        decimal = (Button) findViewById(R.id.decimal_btn);
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate.append(".");
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
