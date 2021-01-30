package com.snr.calc2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    TextView his;
    Button N0;
    Button N1;
    Button N2;
    Button N3;
    Button N4;
    Button N5;
    Button N6;
    Button N7;
    Button N8;
    Button N9;
    Button add;
    Button sub;
    Button div;
    Button mul;
    Button res;
    Button dot;
    Button pc;
    Button clear;
    Button back;
    String no1=null;
    String no2;
    float result;
    char p='0';
    final String TAG="ccsl";


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=findViewById(R.id.dis);
        his=findViewById(R.id.his);
        N0=findViewById(R.id.nzero);
        N1=findViewById(R.id.n1);
        N2=findViewById(R.id.n2);
        N3=findViewById(R.id.n3);
        N4=findViewById(R.id.n4);
        N5=findViewById(R.id.n5);
        N6=findViewById(R.id.n6);
        N7=findViewById(R.id.n7);
        N8=findViewById(R.id.n8);
        N9=findViewById(R.id.n9);
        add=findViewById(R.id.plus);
        sub=findViewById(R.id.mine);
        mul=findViewById(R.id.multiply);
        div=findViewById(R.id.divide);
        res=findViewById(R.id.assign);
        dot=findViewById(R.id.dot);
        pc=findViewById(R.id.precent);
        clear=findViewById(R.id.clear);
        back=findViewById(R.id.back);




        N0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text= (String) txt.getText();
                if(text.equals("0")){
                    text="0";
                }else{
                    text+="0";
                }
                txt.setText(text);

            }
        });

        N1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text= (String) txt.getText();
                if(text.equals("0")){
                    text="1";
                }else{
                    text+="1";
                }
                txt.setText(text);

            }
        });

        N2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text= (String) txt.getText();
                if(text.equals("0")){
                    text="2";
                }else{
                    text+="2";
                }
                txt.setText(text);

            }
        });

        N3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text= (String) txt.getText();
                if(text.equals("0")){
                    text="3";
                }else{
                    text+="3";
                }
                txt.setText(text);

            }
        });

        N4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text= (String) txt.getText();
                if(text.equals("0")){
                    text="4";
                }else{
                    text+="4";
                }
                txt.setText(text);

            }
        });

        N5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text= (String) txt.getText();
                if(text.equals("0")){
                    text="5";
                }else{
                    text+="5";
                }
                txt.setText(text);

            }
        });

        N6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text= (String) txt.getText();
                if(text.equals("0")){
                    text="6";
                }else{
                    text+="6";
                }
                txt.setText(text);

            }
        });

        N7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text= (String) txt.getText();
                if(text.equals("0")){
                    text="7";
                }else{
                    text+="7";
                }
                txt.setText(text);

            }
        });

        N8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text= (String) txt.getText();
                if(text.equals("0")){
                    text="8";
                }else{
                    text+="8";
                }
                txt.setText(text);

            }
        });

        N9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text= (String) txt.getText();
                if(text.equals("0")){
                    text="9";
                }else{
                    text+="9";
                }
                txt.setText(text);

            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text= (String) txt.getText();

                    text+=".";

                txt.setText(text);

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt.setText("0");
                his.setText(" ");
                no1=null;


            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                    String s= (String) his.getText();
                    String check= (String) txt.getText();
                        Log.i(TAG,"+");
                        float tempf;
                        int tempi;
                        if(s.equals(" ")){

                            no1= (String) txt.getText();
                            his.setText(no1+" + ");
                            p='+';
                            txt.setText("0");
                        }else {
                            if(p=='+'){
                                String ts = (String) txt.getText();
                                if ((no1.indexOf('.') == -1) && (ts.indexOf('.') == -1)) {
                                    tempi = Integer.valueOf(no1) + Integer.valueOf(ts);
                                    no1 = String.valueOf(tempi);
                                    his.setText(no1 + " + ");
                                } else {
                                    tempf = Float.valueOf(no1) + Float.valueOf(ts);
                                    no1 = String.valueOf(tempf);
                                    his.setText(no1 + " + ");
                                }
                                txt.setText("0");
                            }else if (p=='-'){
                                String ts = (String) txt.getText();
                                if ((no1.indexOf('.') == -1) && (ts.indexOf('.') == -1)) {
                                    tempi = Integer.valueOf(no1) - Integer.valueOf(ts);
                                    no1 = String.valueOf(tempi);
                                    his.setText(no1 + " + ");
                                } else {
                                    tempf = Float.valueOf(no1) - Float.valueOf(ts);
                                    no1 = String.valueOf(tempf);
                                    his.setText(no1 + " + ");
                                }
                                txt.setText("0");
                                p='+';

                            }else if(p=='/'){
                                String ts = (String) txt.getText();

                                    tempf = Float.valueOf(no1) / Float.valueOf(ts);
                                    no1 = String.valueOf(tempf);
                                    his.setText(no1 + " + ");

                                txt.setText("0");
                                p='+';

                            }else if(p=='*'){
                                String ts = (String) txt.getText();
                                if ((no1.indexOf('.') == -1) && (ts.indexOf('.') == -1)) {
                                    tempi = Integer.valueOf(no1) * Integer.valueOf(ts);
                                    no1 = String.valueOf(tempi);
                                    his.setText(no1 + " + ");
                                } else {
                                    tempf = Float.valueOf(no1) * Float.valueOf(ts);
                                    no1 = String.valueOf(tempf);
                                    his.setText(no1 + " + ");
                                }
                                txt.setText("0");
                                p='+';
                            }else if (p == '%'){
                                String ts = (String) txt.getText();

                                tempf = Float.valueOf(no1) * (Float.valueOf(ts)/100);
                                no1 = String.valueOf(tempf);
                                his.setText(no1 + " - ");

                                txt.setText("0");
                                p='+';
                            }else{

                            }

                        }
                    }





        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    String s= (String) his.getText();
                    float tempf;
                    int tempi;
                    if(s.equals(" ")){

                        no1= (String) txt.getText();
                        his.setText(no1+" - ");
                        txt.setText("0");
                        p='-';
                    }else{
                        if(p=='+'){
                            String ts = (String) txt.getText();
                            if ((no1.indexOf('.') == -1) && (ts.indexOf('.') == -1)) {
                                tempi = Integer.valueOf(no1) + Integer.valueOf(ts);
                                no1 = String.valueOf(tempi);
                                his.setText(no1 + " - ");
                            } else {
                                tempf = Float.valueOf(no1) + Float.valueOf(ts);
                                no1 = String.valueOf(tempf);
                                his.setText(no1 + " - ");
                            }
                            txt.setText("0");
                            p='-';
                        }else if (p=='-'){
                            String ts = (String) txt.getText();
                            if ((no1.indexOf('.') == -1) && (ts.indexOf('.') == -1)) {
                                tempi = Integer.valueOf(no1) - Integer.valueOf(ts);
                                no1 = String.valueOf(tempi);
                                his.setText(no1 + " - ");
                            } else {
                                tempf = Float.valueOf(no1) - Float.valueOf(ts);
                                no1 = String.valueOf(tempf);
                                his.setText(no1 + " - ");
                            }
                            txt.setText("0");
                            p='-';

                        }else if(p=='/'){
                            String ts = (String) txt.getText();
                            if ((no1.indexOf('.') == -1) && (ts.indexOf('.') == -1)) {
                                tempi = Integer.valueOf(no1) / Integer.valueOf(ts);
                                no1 = String.valueOf(tempi);
                                his.setText(no1 + " - ");
                            } else {
                                tempf = Float.valueOf(no1) / Float.valueOf(ts);
                                no1 = String.valueOf(tempf);
                                his.setText(no1 + " - ");
                            }
                            txt.setText("0");
                            p='-';

                        }else if(p=='*'){
                            String ts = (String) txt.getText();
                            if ((no1.indexOf('.') == -1) && (ts.indexOf('.') == -1)) {
                                tempi = Integer.valueOf(no1) * Integer.valueOf(ts);
                                no1 = String.valueOf(tempi);
                                his.setText(no1 + " - ");
                            } else {
                                tempf = Float.valueOf(no1) * Float.valueOf(ts);
                                no1 = String.valueOf(tempf);
                                his.setText(no1 + " - ");
                            }
                            txt.setText("0");
                            p='-';
                        }else if (p == '%'){
                            String ts = (String) txt.getText();

                            tempf = Float.valueOf(no1) * (Float.valueOf(ts)/100);
                            no1 = String.valueOf(tempf);
                            his.setText(no1 + " - ");

                            txt.setText("0");
                            p='-';
                        }else{

                        }

                    }


                }



        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s= (String) his.getText();
                float tempf;
                int tempi;
                if(s.equals(" ")){

                    no1= (String) txt.getText();
                    his.setText(no1+" x ");
                    txt.setText("0");
                    p='*';
                }else{
                    if(p=='+'){
                        String ts = (String) txt.getText();
                        if ((no1.indexOf('.') == -1) && (ts.indexOf('.') == -1)) {
                            tempi = Integer.valueOf(no1) + Integer.valueOf(ts);
                            no1 = String.valueOf(tempi);
                            his.setText(no1 + " x ");
                        } else {
                            tempf = Float.valueOf(no1) + Float.valueOf(ts);
                            no1 = String.valueOf(tempf);
                            his.setText(no1 + " x ");
                        }
                        txt.setText("0");
                        p='*';
                    }else if (p=='-'){
                        String ts = (String) txt.getText();
                        if ((no1.indexOf('.') == -1) && (ts.indexOf('.') == -1)) {
                            tempi = Integer.valueOf(no1) - Integer.valueOf(ts);
                            no1 = String.valueOf(tempi);
                            his.setText(no1 + " x ");
                        } else {
                            tempf = Float.valueOf(no1) - Float.valueOf(ts);
                            no1 = String.valueOf(tempf);
                            his.setText(no1 + " x ");
                        }
                        txt.setText("0");
                        p='*';

                    }else if(p=='/'){
                        String ts = (String) txt.getText();
                            tempf = Float.valueOf(no1) / Float.valueOf(ts);
                            no1 = String.valueOf(tempf);
                            his.setText(no1 + " x ");

                        txt.setText("0");
                        p='*';

                    }else if(p=='*'){
                        String ts = (String) txt.getText();
                        if ((no1.indexOf('.') == -1) && (ts.indexOf('.') == -1)) {
                            tempi = Integer.valueOf(no1) * Integer.valueOf(ts);
                            no1 = String.valueOf(tempi);
                            his.setText(no1 + " x ");
                        } else {
                            tempf = Float.valueOf(no1) * Float.valueOf(ts);
                            no1 = String.valueOf(tempf);
                            his.setText(no1 + " x ");
                        }
                        txt.setText("0");
                        p='*';
                    }else if (p == '%'){
                        String ts = (String) txt.getText();

                        tempf = Float.valueOf(no1) * (Float.valueOf(ts)/100);
                        no1 = String.valueOf(tempf);
                        his.setText(no1 + " x ");

                        txt.setText("0");
                        p='*';
                    }else{

                    }

                }


            }



        });


        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s= (String) his.getText();
                float tempf;
                int tempi;
                if(s.equals(" ")){

                    no1= (String) txt.getText();
                    his.setText(no1+" / ");
                    txt.setText("0");
                    p='/';
                }else{
                    if(p=='+'){
                        String ts = (String) txt.getText();
                        if ((no1.indexOf('.') == -1) && (ts.indexOf('.') == -1)) {
                            tempi = Integer.valueOf(no1) + Integer.valueOf(ts);
                            no1 = String.valueOf(tempi);
                            his.setText(no1 + " / ");
                        } else {
                            tempf = Float.valueOf(no1) + Float.valueOf(ts);
                            no1 = String.valueOf(tempf);
                            his.setText(no1 + " / ");
                        }
                        txt.setText("0");
                        p='/';
                    }else if (p=='-'){
                        String ts = (String) txt.getText();
                        if ((no1.indexOf('.') == -1) && (ts.indexOf('.') == -1)) {
                            tempi = Integer.valueOf(no1) - Integer.valueOf(ts);
                            no1 = String.valueOf(tempi);
                            his.setText(no1 + " / ");
                        } else {
                            tempf = Float.valueOf(no1) - Float.valueOf(ts);
                            no1 = String.valueOf(tempf);
                            his.setText(no1 + " / ");
                        }
                        txt.setText("0");
                        p='/';

                    }else if(p=='/'){
                        String ts = (String) txt.getText();

                            tempf = Float.valueOf(no1) / Float.valueOf(ts);
                            no1 = String.valueOf(tempf);
                            his.setText(no1 + " / ");

                        txt.setText("0");
                        p='/';

                    }else if(p=='*'){
                        String ts = (String) txt.getText();
                        if ((no1.indexOf('.') == -1) && (ts.indexOf('.') == -1)) {
                            tempi = Integer.valueOf(no1) * Integer.valueOf(ts);
                            no1 = String.valueOf(tempi);
                            his.setText(no1 + " / ");
                        } else {
                            tempf = Float.valueOf(no1) * Float.valueOf(ts);
                            no1 = String.valueOf(tempf);
                            his.setText(no1 + " / ");
                        }
                        txt.setText("0");
                        p='/';
                    }else if (p == '%'){
                        String ts = (String) txt.getText();

                        tempf = Float.valueOf(no1) * (Float.valueOf(ts)/100);
                        no1 = String.valueOf(tempf);
                        his.setText(no1 + " - ");

                        txt.setText("0");
                        p='/';
                    }else{

                    }

                }


            }



        });

        pc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s= (String) his.getText();
                float tempf;
                int tempi;
                if(s.equals(" ")){

                    no1= (String) txt.getText();
                    his.setText(no1+" % ");
                    txt.setText("0");
                    p='%';
                }else{
                    if(p=='+'){
                        String ts = (String) txt.getText();
                        if ((no1.indexOf('.') == -1) && (ts.indexOf('.') == -1)) {
                            tempi = Integer.valueOf(no1) + Integer.valueOf(ts);
                            no1 = String.valueOf(tempi);
                            his.setText(no1 + " % ");
                        } else {
                            tempf = Float.valueOf(no1) + Float.valueOf(ts);
                            no1 = String.valueOf(tempf);
                            his.setText(no1 + " % ");
                        }
                        txt.setText("0");
                        p='%';
                    }else if (p=='-'){
                        String ts = (String) txt.getText();
                        if ((no1.indexOf('.') == -1) && (ts.indexOf('.') == -1)) {
                            tempi = Integer.valueOf(no1) - Integer.valueOf(ts);
                            no1 = String.valueOf(tempi);
                            his.setText(no1 + " % ");
                        } else {
                            tempf = Float.valueOf(no1) - Float.valueOf(ts);
                            no1 = String.valueOf(tempf);
                            his.setText(no1 + " % ");
                        }
                        txt.setText("0");
                        p='%';

                    }else if(p=='/'){
                        String ts = (String) txt.getText();
                            tempf = Float.valueOf(no1) / Float.valueOf(ts);
                            no1 = String.valueOf(tempf);
                            his.setText(no1 + " % ");

                        txt.setText("0");
                        p='%';

                    }else if(p=='*'){
                        String ts = (String) txt.getText();
                        if ((no1.indexOf('.') == -1) && (ts.indexOf('.') == -1)) {
                            tempi = Integer.valueOf(no1) * Integer.valueOf(ts);
                            no1 = String.valueOf(tempi);
                            his.setText(no1 + " % ");
                        } else {
                            tempf = Float.valueOf(no1) * Float.valueOf(ts);
                            no1 = String.valueOf(tempf);
                            his.setText(no1 + " % ");
                        }
                        txt.setText("0");
                        p='%';

                    }else if (p == '%'){
                        String ts = (String) txt.getText();

                            tempf = Float.valueOf(no1) * (Float.valueOf(ts)/100);
                            no1 = String.valueOf(tempf);
                            his.setText(no1 + " % ");

                        txt.setText("0");
                        p='%';
                    }else{

                    }

                }


            }



        });

            res.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String s= (String) his.getText();
                    float tempf;
                    int tempi;
                    if(s.equals(" ")){

                        no1= (String) txt.getText();
                        his.setText(" ");
                        txt.setText(no1);
                        p='0';
                    }else{
                        if(p=='+'){
                            String ts = (String) txt.getText();
                            if ((no1.indexOf('.') == -1) && (ts.indexOf('.') == -1)) {
                                tempi = Integer.valueOf(no1) + Integer.valueOf(ts);
                                no1 = String.valueOf(tempi);
                                his.setText(" ");
                            } else {
                                tempf = Float.valueOf(no1) + Float.valueOf(ts);
                                no1 = String.valueOf(tempf);
                                his.setText(" ");
                            }
                            txt.setText(no1);
                            p='0';
                        }else if (p=='-'){
                            String ts = (String) txt.getText();
                            if ((no1.indexOf('.') == -1) && (ts.indexOf('.') == -1)) {
                                tempi = Integer.valueOf(no1) - Integer.valueOf(ts);
                                no1 = String.valueOf(tempi);
                                his.setText(" ");
                            } else {
                                tempf = Float.valueOf(no1) - Float.valueOf(ts);
                                no1 = String.valueOf(tempf);
                                his.setText(" ");
                            }
                            txt.setText(no1);
                            p='0';

                        }else if(p=='/'){
                            String ts = (String) txt.getText();

                                tempf = Float.valueOf(no1) / Float.valueOf(ts);
                                no1 = String.valueOf(tempf);
                                his.setText(" ");

                            txt.setText(no1);
                            p='0';

                        }else if(p=='*'){
                            String ts = (String) txt.getText();
                            if ((no1.indexOf('.') == -1) && (ts.indexOf('.') == -1)) {
                                tempi = Integer.valueOf(no1) * Integer.valueOf(ts);
                                no1 = String.valueOf(tempi);
                                his.setText(" ");
                            } else {
                                tempf = Float.valueOf(no1) * Float.valueOf(ts);
                                no1 = String.valueOf(tempf);
                                his.setText(" ");
                            }
                            txt.setText(no1);
                            p='0';

                        }else if (p == '%'){
                            String ts = (String) txt.getText();

                            tempf = Float.valueOf(no1) * (Float.valueOf(ts)/100);
                            no1 = String.valueOf(tempf);
                            his.setText(" ");

                            txt.setText(no1);
                            p='0';
                        }else{

                        }

                    }


                }



            });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=(String) txt.getText();
                int c=str.length();
                if (c<=1){
                    txt.setText("0");
                }else {
                   String n= str.substring(0, str.length()-1);
                    txt.setText(n);
            }
            }
        });

    }
}