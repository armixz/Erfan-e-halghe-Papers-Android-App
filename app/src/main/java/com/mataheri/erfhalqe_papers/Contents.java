package com.mataheri.erfhalqe_papers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Contents extends AppCompatActivity {

    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contents);

        click = (Button)findViewById(R.id.p1);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp = new Intent(Contents.this, one_asleVahdateRah.class);
                startActivity(temp);
            }
        });



        click = (Button)findViewById(R.id.p3);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp = new Intent(Contents.this, three_ensan_bimari_tahavvol.class);
                startActivity(temp);
            }
        });

        click = (Button)findViewById(R.id.p4);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp = new Intent(Contents.this, four_ashoora.class);
                startActivity(temp);
            }
        });

        click = (Button)findViewById(R.id.p5);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp = new Intent(Contents.this, five_trova.class);
                startActivity(temp);
            }
        });

        click = (Button)findViewById(R.id.p6);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp = new Intent(Contents.this, six_one_demention_word.class);
                startActivity(temp);
            }
        });

        click = (Button)findViewById(R.id.p7);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp = new Intent(Contents.this, seven_secret_one.class);
                startActivity(temp);
            }
        });

        click = (Button)findViewById(R.id.p8);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp = new Intent(Contents.this, eight_secret_two.class);
                startActivity(temp);
            }
        });

        click = (Button)findViewById(R.id.p9);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp = new Intent(Contents.this, nine_ramazan.class);
                startActivity(temp);
            }
        });

        click = (Button)findViewById(R.id.p10);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp = new Intent(Contents.this, ten_fetr.class);
                startActivity(temp);
            }
        });

        click = (Button)findViewById(R.id.p11);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp = new Intent(Contents.this, eleven_tanasokh.class);
                startActivity(temp);
            }
        });

        click = (Button)findViewById(R.id.p12);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp = new Intent(Contents.this, twelve_haj.class);
                startActivity(temp);
            }
        });

        click = (Button)findViewById(R.id.p13);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp = new Intent(Contents.this, thirteen_god_love.class);
                startActivity(temp);
            }
        });

        click = (Button)findViewById(R.id.p14);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp = new Intent(Contents.this, fourteen_qadir.class);
                startActivity(temp);
            }
        });

        click = (Button)findViewById(R.id.p15);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp = new Intent(Contents.this, fifteen_erfan_behavior.class);
                startActivity(temp);
            }
        });

        click = (Button)findViewById(R.id.p16);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp = new Intent(Contents.this, sixteen_shame.class);
                startActivity(temp);
            }
        });

        click = (Button)findViewById(R.id.p17);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp = new Intent(Contents.this, seventeen_dajal.class);
                startActivity(temp);
            }
        });

        click = (Button)findViewById(R.id.p18);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp = new Intent(Contents.this, eighteen_final_exam.class);
                startActivity(temp);
            }
        });

        click = (Button)findViewById(R.id.p19);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp = new Intent(Contents.this, nineteen_light.class);
                startActivity(temp);
            }
        });

        click = (Button)findViewById(R.id.p20);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp = new Intent(Contents.this, twenty_evil.class);
                startActivity(temp);
            }
        });

        click = (Button)findViewById(R.id.p21);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp = new Intent(Contents.this, twenty_one_hight_performance_humanity.class);
                startActivity(temp);
            }
        });

        click = (Button)findViewById(R.id.p22);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp = new Intent(Contents.this, twenty_two_real_erfan.class);
                startActivity(temp);
            }
        });

        click = (Button)findViewById(R.id.p23);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp = new Intent(Contents.this, twenty_three_salat.class);
                startActivity(temp);
            }
        });

        click = (Button)findViewById(R.id.p24);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp = new Intent(Contents.this, twenty_four_hijab_philosophy.class);
                startActivity(temp);
            }
        });

        click = (Button)findViewById(R.id.p25);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp = new Intent(Contents.this, twenty_five_family_therapy.class);
                startActivity(temp);
            }
        });
    }
}
