package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9;

    private Button btn_point, btn_percent, btn_add, btn_minus, btn_equal;

    private ImageButton btn_clear, btn_multi, btn_divide, btn_delete;

    private TextView tv_current;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViewAndListener();


    }

    private void initViewAndListener() {
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_0.setOnClickListener((View.OnClickListener) this);

        btn_1 = (Button)findViewById(R.id.btn_1);
        btn_1.setOnClickListener((View.OnClickListener) this);

        btn_2 = (Button)findViewById(R.id.btn_2);
        btn_2.setOnClickListener((View.OnClickListener) this);

        btn_3 = (Button)findViewById(R.id.btn_3);
        btn_3.setOnClickListener((View.OnClickListener) this);

        btn_4 = (Button)findViewById(R.id.btn_4);
        btn_4.setOnClickListener((View.OnClickListener) this);

        btn_5 = (Button)findViewById(R.id.btn_5);
        btn_5.setOnClickListener((View.OnClickListener) this);

        btn_6 = (Button)findViewById(R.id.btn_6);
        btn_6.setOnClickListener((View.OnClickListener) this);

        btn_7 = (Button)findViewById(R.id.btn_7);
        btn_7.setOnClickListener((View.OnClickListener) this);

        btn_8 = (Button)findViewById(R.id.btn_8);
        btn_8.setOnClickListener((View.OnClickListener) this);

        btn_9 = (Button)findViewById(R.id.btn_9);
        btn_9.setOnClickListener((View.OnClickListener) this);

        btn_point = (Button)findViewById(R.id.btn_point);
        btn_point.setOnClickListener((View.OnClickListener) this);

        btn_percent = (Button)findViewById(R.id.btn_percent);
        btn_percent.setOnClickListener((View.OnClickListener) this);

        btn_add = (Button)findViewById(R.id.btn_add);
        btn_add.setOnClickListener((View.OnClickListener) this);

        btn_minus = (Button)findViewById(R.id.btn_minus);
        btn_minus.setOnClickListener((View.OnClickListener) this);

        btn_equal = (Button)findViewById(R.id.btn_equal);
        btn_equal.setOnClickListener((View.OnClickListener) this);

        btn_clear = (ImageButton) findViewById(R.id.btn_clean);
        btn_clear.setOnClickListener((View.OnClickListener) this);

        btn_multi = (ImageButton)findViewById(R.id.btn_multiply);
        btn_multi.setOnClickListener((View.OnClickListener) this);

        btn_divide = (ImageButton)findViewById(R.id.btn_divide);
        btn_divide.setOnClickListener((View.OnClickListener) this);

        btn_delete = (ImageButton)findViewById(R.id.btn_delete);
        btn_delete.setOnClickListener((View.OnClickListener) this);

        tv_current = (TextView) findViewById(R.id.tv_current);

    }

    private boolean lastIsOperator = false;         // 上一位输入的是否是符号
    private String lastOperators = "";      // 上一次输入的计算符

    private boolean IsPointExist = false;           // 是否存在小数点

    private double previousNum = 0D;        // 前一位操作数

    public void onClick(View v){

        String currentText = tv_current.getText().toString();

        String operatorNumber = currentText;     // 操作数

        // 如果上一次输入的是计算符， currentText去掉最后一位就为操作数
//        if (!lastOperators.equals("")) {
//            int index = currentText.lastIndexOf(lastOperators);
//            operatorNumber = currentText.substring( index - 1 );
//        }

//        if (lastIsOperator) {
//            tv_current.setText("");
//        }

        if (!currentText.equals("")){
            double tmp = Double.parseDouble(currentText);
            if (tmp != Math.floor(tmp)){
                IsPointExist = true;
                System.out.println("point");
            }
        }

//        if ((Double.parseDouble(currentText) != Math.floor(Double.parseDouble(currentText)))) {
//            IsPointExist = true;
//        }


        switch (v.getId()) {
            case R.id.btn_0:
                // 如果当前输入为0，则先删去0，再进行连接
                if (currentText.equals("0") || lastIsOperator) { tv_current.setText(""); IsPointExist = false; }
                tv_current.setText(tv_current.getText() + "0");
                lastIsOperator = false;
                break;
            case R.id.btn_1:
                if (currentText.equals("0") || lastIsOperator) { tv_current.setText(""); IsPointExist = false; }
                tv_current.setText(tv_current.getText() + "1");
                lastIsOperator = false;
                break;
            case R.id.btn_2:
                if (currentText.equals("0") || lastIsOperator) { tv_current.setText(""); IsPointExist = false; }
                tv_current.setText(tv_current.getText() + "2");
                lastIsOperator = false;
                break;
            case R.id.btn_3:
                if (currentText.equals("0") || lastIsOperator) { tv_current.setText(""); IsPointExist = false; }
                tv_current.setText(tv_current.getText() + "3");
                lastIsOperator = false;
                break;
            case R.id.btn_4:
                if (currentText.equals("0") || lastIsOperator) { tv_current.setText(""); IsPointExist = false; }
                tv_current.setText(tv_current.getText() + "4");
                lastIsOperator = false;
                break;
            case R.id.btn_5:
                if (currentText.equals("0") || lastIsOperator) { tv_current.setText(""); IsPointExist = false; }
                tv_current.setText(tv_current.getText() + "5");
                lastIsOperator = false;
                break;
            case R.id.btn_6:
                if (currentText.equals("0") || lastIsOperator) { tv_current.setText(""); IsPointExist = false; }
                tv_current.setText(tv_current.getText() + "6");
                lastIsOperator = false;
                break;
            case R.id.btn_7:
                if (currentText.equals("0") || lastIsOperator) { tv_current.setText(""); IsPointExist = false; }
                tv_current.setText(tv_current.getText() + "7");
                lastIsOperator = false;
                break;
            case R.id.btn_8:
                if (currentText.equals("0") || lastIsOperator) { tv_current.setText(""); IsPointExist = false; }
                tv_current.setText(tv_current.getText() + "8");
                lastIsOperator = false;
                break;
            case R.id.btn_9:
                if (currentText.equals("0") || lastIsOperator) { tv_current.setText(""); IsPointExist = false; }
                tv_current.setText(tv_current.getText() + "9");
                lastIsOperator = false;
                break;
            case R.id.btn_point:
                if (IsPointExist) { return; }
                if (TextUtils.isEmpty(currentText)) {
                    tv_current.setText("0");
                }
                tv_current.setText(tv_current.getText() + ".");
                IsPointExist = true;
                lastIsOperator = false;
                break;
            case R.id.btn_clean:
                tv_current.setText("");
                previousNum = 0;
                lastOperators = "";
                lastIsOperator = false;
                IsPointExist = false;
                break;
            case R.id.btn_percent:
                if (currentText.equals("0")) { return; }
                calculate(operatorNumber, "%");
//                lastIsOperator = true;
                break;
            case R.id.btn_delete:
                if (TextUtils.isEmpty(tv_current.getText())){ return; }     // 为空直接return
                tv_current.setText(currentText.substring(0,currentText.length() - 1).length() > 0 ? currentText.substring(0, currentText.length() - 1) : "0");
                currentText = tv_current.getText().toString();
                double tmp = Double.parseDouble(currentText);
                if (tmp == Math.floor(tmp)){
                    tv_current.setText(String.valueOf((int)tmp));
                    IsPointExist = false;
                }
                break;
            case R.id.btn_divide:
                if (TextUtils.isEmpty(tv_current.getText())){
                    return;
                }
                if (!lastIsOperator) {
                    calculate(operatorNumber, "/");
                }
                lastOperators = "/";
                lastIsOperator = true;
                break;
            case R.id.btn_multiply:
                if (TextUtils.isEmpty(tv_current.getText())){
                    return;
                }
                if (!lastIsOperator) {
                    calculate(operatorNumber, "*");
                }
                lastOperators = "*";
                lastIsOperator = true;
                break;
            case R.id.btn_add:
                if (TextUtils.isEmpty(tv_current.getText())){
                    return;
                }
                if (!lastIsOperator) {
                    calculate(operatorNumber, "+");
                }
                lastOperators = "+";
                lastIsOperator = true;
                break;
            case R.id.btn_minus:
                if (TextUtils.isEmpty(tv_current.getText())){
                    return;
                }
                if (!lastIsOperator) {
                    calculate(operatorNumber, "-");
                }
                lastOperators = "-";
                lastIsOperator = true;
                break;
            case R.id.btn_equal:
                if (TextUtils.isEmpty(tv_current.getText())){
                    tv_current.setText("0");
                    return;
                }
                if (!lastIsOperator) {
                    calculate(operatorNumber, "=");
                }
                lastIsOperator = true;
                lastOperators = "";
                IsPointExist = false;
                break;
            case R.id.default_activity_button:
                tv_current.setText("Error!");

        }





    }

    private void calculate(String operatorNumber, String operator) {
        if (operatorNumber.equals("")){
            return;
        }

        if (previousNum == 0D) {
            previousNum = Double.parseDouble(operatorNumber);
        }

        if (operator.equals("%")){
            tv_current.setText(String.valueOf(Double.parseDouble(operatorNumber) / 100));
            return;
        }

        if (TextUtils.isEmpty(lastOperators)) {
            previousNum = Double.parseDouble(operatorNumber);
        }
        else if (lastOperators.equals("+")){
            previousNum = previousNum + Double.parseDouble(operatorNumber);
            lastOperators = operator;
        }
        else if (lastOperators.equals("-")){
            previousNum = previousNum - Double.parseDouble(operatorNumber);
        }
        else if (lastOperators.equals("*")){
            previousNum = previousNum * Double.parseDouble(operatorNumber);
        }
        else if (lastOperators.equals("/")){
            if (Double.parseDouble(operatorNumber) == 0) {
                tv_current.setText("Zero divisor");
                lastIsOperator = true;
                 return;
            }
            previousNum = previousNum / Double.parseDouble(operatorNumber);
        }

        if (previousNum == Math.floor(previousNum)){
            tv_current.setText(String.valueOf((int)previousNum));
        }
        else {
            tv_current.setText(String.valueOf(previousNum));
        }

    }
}