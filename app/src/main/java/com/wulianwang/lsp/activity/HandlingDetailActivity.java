package com.wulianwang.lsp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.wulianwang.lsp.R;

/**
 * 5.14.1 丁亚茹 聂艳艳
 */
public class HandlingDetailActivity extends AppCompatActivity {
    private ImageView button1,dianhua;
    private TextView rwxq,gzxq,zzmc,gzsj,gxnr,gzdd,lxfs,xxn,xq,jdrxx;
    private Button button;
    private EditText dd,wt,sj,wx,gh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handling_detail);
        button1=(ImageView)findViewById(R.id.button1);
        dianhua=(ImageView)findViewById(R.id.button2);
        rwxq=(TextView)findViewById(R.id.rwxq);
        gzxq=(TextView)findViewById(R.id.gzxq);
        zzmc=(TextView)findViewById(R.id.zzmc);
        gzsj=(TextView)findViewById(R.id.gzsj);
        gxnr=(TextView)findViewById(R.id.gxnr);
        gzdd=(TextView)findViewById(R.id.gzdd);
        lxfs=(TextView)findViewById(R.id.lxfs);
        xxn=(TextView)findViewById(R.id.xxn);
        xq=(TextView)findViewById(R.id.xq);
        jdrxx=(TextView)findViewById(R.id.jdrxx);
        button=(Button)findViewById(R.id.button);
        dd=(EditText)findViewById(R.id.dd);
        wt=(EditText)findViewById(R.id.wt);
        sj=(EditText)findViewById(R.id.sj);
        wx=(EditText)findViewById(R.id.wx);
        gh=(EditText)findViewById(R.id.gh);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        ImageView dianhua=findViewById(R.id.button2);
        dianhua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:17637663098"));
                startActivity(intent);
            }
        });

        xq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HandlingDetailActivity.this, PersonDetailActivity.class);
                intent.putExtra("phone", "13111111111");
                startActivity(intent);
            }
        });





    }








}

