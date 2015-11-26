package com.example.com.myapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.Objects;

public class AdapterMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_main);
        setTitle("그리드뷰 영화 포스터");

        final GridView gv = (GridView) findViewById(R.id.gridView1);
        MyGridAdapter gAdapter = new MyGridAdapter(this);
        gv.setAdapter(gAdapter);
    }
    public class MyGridAdapter extends BaseAdapter{
        Context context;
        public MyGridAdapter(Context c){
            context = c;
        }
        public int getCount() {
            return posterID.length;
        }
        public Object getItem(int arg0) {
            // TODO Auto-generated method stub
            return 0;
        }
        public long getItemId(int arg0){
            // TODO Auto-generated method stub
            return 0;
        }
        Integer[] posterID = {
                R.drawable.mov01 ,R.drawable.mov02,R.drawable.mov03,R.drawable.mov04,R.drawable.mov05,R.drawable.mov06,R.drawable.mov07,R.drawable.mov08,R.drawable.mov09,R.drawable.mov10,
                R.drawable.mov01 ,R.drawable.mov02,R.drawable.mov03,R.drawable.mov04,R.drawable.mov05,R.drawable.mov06,R.drawable.mov07,R.drawable.mov08,R.drawable.mov09,R.drawable.mov10,
                R.drawable.mov01 ,R.drawable.mov02,R.drawable.mov03,R.drawable.mov04,R.drawable.mov05,R.drawable.mov06,R.drawable.mov07,R.drawable.mov08,R.drawable.mov09,R.drawable.mov10,
                R.drawable.mov01 ,R.drawable.mov02,R.drawable.mov03,R.drawable.mov04,R.drawable.mov05,R.drawable.mov06,R.drawable.mov07,R.drawable.mov08,R.drawable.mov09,R.drawable.mov10
        };
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageview = new ImageView(context);
            imageview.setLayoutParams(new GridView.LayoutParams(100, 150));
            imageview.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageview.setPadding(5, 5, 5, 5);

            imageview.setImageResource(posterID[position]);

            final int pos = position;
            imageview.setOnClickListener(new View.OnClickListener() {
                public void onClick (View v) {
                    View dialogView = (View) View.inflate(AdapterMainActivity.this,
                            R.layout.dialog, null);
                    AlertDialog.Builder dlg = new AlertDialog.Builder(adapterMainActivity.this);
                    ImageView ivPoster = (ImageView) dialogView.findViewById(R.id.ivPoster);
                    ivPoster.setImageResource(posterID[pos]);
                    dlg.setTitle("큰 포스터");
                    dlg.setIcon(R.drawable.ic_launcher);
                    dlg.setView(dialogView);
                    dlg.setNegativeButton("닫기",null);
                    dlg.show();
                }
            });

            return imageview;
        }
    }

}
