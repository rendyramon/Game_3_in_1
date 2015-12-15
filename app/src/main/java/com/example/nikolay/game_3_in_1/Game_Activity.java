package com.example.nikolay.game_3_in_1;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by Nikolay on 26.10.2015.
 */
public class Game_Activity extends Activity {
    public Integer firstclick,secondclick,s;
    Drawable drawable1,drawable2;
    public Drawable ananas,apelsin,arbuz,banana,klubnika,persik,vinograd,vzriv_1;

    private ImageView imageView_11;
    private ImageView imageView_12;
    private ImageView imageView_13;
    private ImageView imageView_14;
    private ImageView imageView_15;
    private ImageView imageView_16;

    private ImageView imageView_21;
    private ImageView imageView_22;
    private ImageView imageView_23;
    private ImageView imageView_24;
    private ImageView imageView_25;
    private ImageView imageView_26;

    private ImageView imageView_31;
    private ImageView imageView_32;
    private ImageView imageView_33;
    private ImageView imageView_34;
    private ImageView imageView_35;
    private ImageView imageView_36;

    private ImageView imageView_41;
    private ImageView imageView_42;
    private ImageView imageView_43;
    private ImageView imageView_44;
    private ImageView imageView_45;
    private ImageView imageView_46;

    private ImageView imageView_51;
    private ImageView imageView_52;
    private ImageView imageView_53;
    private ImageView imageView_54;
    private ImageView imageView_55;
    private ImageView imageView_56;

    private ImageView imageView_61;
    private ImageView imageView_62;
    private ImageView imageView_63;
    private ImageView imageView_64;
    private ImageView imageView_65;
    private ImageView imageView_66;

    private ImageView imageView_71;
    private ImageView imageView_72;
    private ImageView imageView_73;
    private ImageView imageView_74;
    private ImageView imageView_75;
    private ImageView imageView_76;

    private ImageView imageView_81;
    private ImageView imageView_82;
    private ImageView imageView_83;
    private ImageView imageView_84;
    private ImageView imageView_85;
    private ImageView imageView_86;

    private ImageView imageView_91;
    private ImageView imageView_92;
    private ImageView imageView_93;
    private ImageView imageView_94;
    private ImageView imageView_95;
    private ImageView imageView_96;

    public ImageView imageView_00,imageView_01;
//    public MyTask mt;

    Integer i11,i12,i13,i14,i15,i16;
    Integer i21,i22,i23,i24,i25,i26;
    Integer i31,i32,i33,i34,i35,i36;
    Integer i41,i42,i43,i44,i45,i46;
    Integer i51,i52,i53,i54,i55,i56;
    Integer i61,i62,i63,i64,i65,i66;
    Integer i71,i72,i73,i74,i75,i76;
    Integer i81,i82,i83,i84,i85,i86;
    Integer i91,i92,i93,i94,i95,i96;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);

        imageView_11=(ImageView) findViewById(R.id.imageView_11);
        imageView_12=(ImageView) findViewById(R.id.imageView_12);
        imageView_13=(ImageView) findViewById(R.id.imageView_13);
        imageView_14=(ImageView) findViewById(R.id.imageView_14);
        imageView_15=(ImageView) findViewById(R.id.imageView_15);
        imageView_16=(ImageView) findViewById(R.id.imageView_16);

        imageView_21=(ImageView) findViewById(R.id.imageView_21);
        imageView_22=(ImageView) findViewById(R.id.imageView_22);
        imageView_23=(ImageView) findViewById(R.id.imageView_23);
        imageView_24=(ImageView) findViewById(R.id.imageView_24);
        imageView_25=(ImageView) findViewById(R.id.imageView_25);
        imageView_26=(ImageView) findViewById(R.id.imageView_26);

        imageView_31=(ImageView) findViewById(R.id.imageView_31);
        imageView_32=(ImageView) findViewById(R.id.imageView_32);
        imageView_33=(ImageView) findViewById(R.id.imageView_33);
        imageView_34=(ImageView) findViewById(R.id.imageView_34);
        imageView_35=(ImageView) findViewById(R.id.imageView_35);
        imageView_36=(ImageView) findViewById(R.id.imageView_36);

        imageView_41=(ImageView) findViewById(R.id.imageView_41);
        imageView_42=(ImageView) findViewById(R.id.imageView_42);
        imageView_43=(ImageView) findViewById(R.id.imageView_43);
        imageView_44=(ImageView) findViewById(R.id.imageView_44);
        imageView_45=(ImageView) findViewById(R.id.imageView_45);
        imageView_46=(ImageView) findViewById(R.id.imageView_46);

        imageView_51=(ImageView) findViewById(R.id.imageView_51);
        imageView_52=(ImageView) findViewById(R.id.imageView_52);
        imageView_53=(ImageView) findViewById(R.id.imageView_53);
        imageView_54=(ImageView) findViewById(R.id.imageView_54);
        imageView_55=(ImageView) findViewById(R.id.imageView_55);
        imageView_56=(ImageView) findViewById(R.id.imageView_56);

        imageView_61=(ImageView) findViewById(R.id.imageView_61);
        imageView_62=(ImageView) findViewById(R.id.imageView_62);
        imageView_63=(ImageView) findViewById(R.id.imageView_63);
        imageView_64=(ImageView) findViewById(R.id.imageView_64);
        imageView_65=(ImageView) findViewById(R.id.imageView_65);
        imageView_66=(ImageView) findViewById(R.id.imageView_66);

        imageView_71=(ImageView) findViewById(R.id.imageView_71);
        imageView_72=(ImageView) findViewById(R.id.imageView_72);
        imageView_73=(ImageView) findViewById(R.id.imageView_73);
        imageView_74=(ImageView) findViewById(R.id.imageView_74);
        imageView_75=(ImageView) findViewById(R.id.imageView_75);
        imageView_76=(ImageView) findViewById(R.id.imageView_76);

        imageView_81=(ImageView) findViewById(R.id.imageView_81);
        imageView_82=(ImageView) findViewById(R.id.imageView_82);
        imageView_83=(ImageView) findViewById(R.id.imageView_83);
        imageView_84=(ImageView) findViewById(R.id.imageView_84);
        imageView_85=(ImageView) findViewById(R.id.imageView_85);
        imageView_86=(ImageView) findViewById(R.id.imageView_86);

        imageView_91=(ImageView) findViewById(R.id.imageView_91);
        imageView_92=(ImageView) findViewById(R.id.imageView_92);
        imageView_93=(ImageView) findViewById(R.id.imageView_93);
        imageView_94=(ImageView) findViewById(R.id.imageView_94);
        imageView_95=(ImageView) findViewById(R.id.imageView_95);
        imageView_96=(ImageView) findViewById(R.id.imageView_96);


        ananas=getResources().getDrawable(R.drawable.ananas);
        apelsin=getResources().getDrawable(R.drawable.apelsin);
        arbuz=getResources().getDrawable(R.drawable.arbuz);
        banana=getResources().getDrawable(R.drawable.banana);
        klubnika=getResources().getDrawable(R.drawable.klubnika);
        persik=getResources().getDrawable(R.drawable.persik);
        vinograd=getResources().getDrawable(R.drawable.vinograd);
        vzriv_1=getResources().getDrawable(R.drawable.vzriv_1);



        Random rand=new Random();

        i11=rand.nextInt(6);
        switch (i11){
            case 0:imageView_11.setBackground(ananas);break;
            case 1:imageView_11.setBackground(apelsin);break;
            case 2:imageView_11.setBackground(arbuz);break;
            case 3:imageView_11.setBackground(banana);break;
            case 4:imageView_11.setBackground(klubnika);break;
            case 5:imageView_11.setBackground(persik);break;
            case 6:imageView_11.setBackground(vinograd);break;
        }
        i12=rand.nextInt(6);
        switch (i12){
            case 0:imageView_12.setBackground(ananas);break;
            case 1:imageView_12.setBackground(apelsin);break;
            case 2:imageView_12.setBackground(arbuz);break;
            case 3:imageView_12.setBackground(banana);break;
            case 4:imageView_12.setBackground(klubnika);break;
            case 5:imageView_12.setBackground(persik);break;
            case 6:imageView_12.setBackground(vinograd);break;
        }
        i13=rand.nextInt(6);
        switch (i13){
            case 0:imageView_13.setBackground(ananas);break;
            case 1:imageView_13.setBackground(apelsin);break;
            case 2:imageView_13.setBackground(arbuz);break;
            case 3:imageView_13.setBackground(banana);break;
            case 4:imageView_13.setBackground(klubnika);break;
            case 5:imageView_13.setBackground(persik);break;
            case 6:imageView_13.setBackground(vinograd);break;
        }
        i14=rand.nextInt(6);
        switch (i14){
            case 0:imageView_14.setBackground(ananas);break;
            case 1:imageView_14.setBackground(apelsin);break;
            case 2:imageView_14.setBackground(arbuz);break;
            case 3:imageView_14.setBackground(banana);break;
            case 4:imageView_14.setBackground(klubnika);break;
            case 5:imageView_14.setBackground(persik);break;
            case 6:imageView_14.setBackground(vinograd);break;
        }
        i15=rand.nextInt(6);
        switch (i15){
            case 0:imageView_15.setBackground(ananas);break;
            case 1:imageView_15.setBackground(apelsin);break;
            case 2:imageView_15.setBackground(arbuz);break;
            case 3:imageView_15.setBackground(banana);break;
            case 4:imageView_15.setBackground(klubnika);break;
            case 5:imageView_15.setBackground(persik);break;
            case 6:imageView_15.setBackground(vinograd);break;
        }
        i16=rand.nextInt(6);
        switch (i16){
            case 0:imageView_16.setBackground(ananas);break;
            case 1:imageView_16.setBackground(apelsin);break;
            case 2:imageView_16.setBackground(arbuz);break;
            case 3:imageView_16.setBackground(banana);break;
            case 4:imageView_16.setBackground(klubnika);break;
            case 5:imageView_16.setBackground(persik);break;
            case 6:imageView_16.setBackground(vinograd);break;
        }


        i21=rand.nextInt(6);
        switch (i21){
            case 0:imageView_21.setBackground(ananas);break;
            case 1:imageView_21.setBackground(apelsin);break;
            case 2:imageView_21.setBackground(arbuz);break;
            case 3:imageView_21.setBackground(banana);break;
            case 4:imageView_21.setBackground(klubnika);break;
            case 5:imageView_21.setBackground(persik);break;
            case 6:imageView_21.setBackground(vinograd);break;
        }
        i22=rand.nextInt(6);
        switch (i22){
            case 0:imageView_22.setBackground(ananas);break;
            case 1:imageView_22.setBackground(apelsin);break;
            case 2:imageView_22.setBackground(arbuz);break;
            case 3:imageView_22.setBackground(banana);break;
            case 4:imageView_22.setBackground(klubnika);break;
            case 5:imageView_22.setBackground(persik);break;
            case 6:imageView_22.setBackground(vinograd);break;
        }
        i23=rand.nextInt(6);
        switch (i23){
            case 0:imageView_23.setBackground(ananas);break;
            case 1:imageView_23.setBackground(apelsin);break;
            case 2:imageView_23.setBackground(arbuz);break;
            case 3:imageView_23.setBackground(banana);break;
            case 4:imageView_23.setBackground(klubnika);break;
            case 5:imageView_23.setBackground(persik);break;
            case 6:imageView_23.setBackground(vinograd);break;
        }
        i24=rand.nextInt(6);
        switch (i24){
            case 0:imageView_24.setBackground(ananas);break;
            case 1:imageView_24.setBackground(apelsin);break;
            case 2:imageView_24.setBackground(arbuz);break;
            case 3:imageView_24.setBackground(banana);break;
            case 4:imageView_24.setBackground(klubnika);break;
            case 5:imageView_24.setBackground(persik);break;
            case 6:imageView_24.setBackground(vinograd);break;
        }
        i25=rand.nextInt(6);
        switch (i25){
            case 0:imageView_25.setBackground(ananas);break;
            case 1:imageView_25.setBackground(apelsin);break;
            case 2:imageView_25.setBackground(arbuz);break;
            case 3:imageView_25.setBackground(banana);break;
            case 4:imageView_25.setBackground(klubnika);break;
            case 5:imageView_25.setBackground(persik);break;
            case 6:imageView_25.setBackground(vinograd);break;
        }
        i26=rand.nextInt(6);
        switch (i26){
            case 0:imageView_26.setBackground(ananas);break;
            case 1:imageView_26.setBackground(apelsin);break;
            case 2:imageView_26.setBackground(arbuz);break;
            case 3:imageView_26.setBackground(banana);break;
            case 4:imageView_26.setBackground(klubnika);break;
            case 5:imageView_26.setBackground(persik);break;
            case 6:imageView_26.setBackground(vinograd);break;
        }

        i31=rand.nextInt(6);
        switch (i31){
            case 0:imageView_31.setBackground(ananas);break;
            case 1:imageView_31.setBackground(apelsin);break;
            case 2:imageView_31.setBackground(arbuz);break;
            case 3:imageView_31.setBackground(banana);break;
            case 4:imageView_31.setBackground(klubnika);break;
            case 5:imageView_31.setBackground(persik);break;
            case 6:imageView_31.setBackground(vinograd);break;
        }
        i32=rand.nextInt(6);
        switch (i32){
            case 0:imageView_32.setBackground(ananas);break;
            case 1:imageView_32.setBackground(apelsin);break;
            case 2:imageView_32.setBackground(arbuz);break;
            case 3:imageView_32.setBackground(banana);break;
            case 4:imageView_32.setBackground(klubnika);break;
            case 5:imageView_32.setBackground(persik);break;
            case 6:imageView_32.setBackground(vinograd);break;
        }
        i33=rand.nextInt(6);
        switch (i33){
            case 0:imageView_33.setBackground(ananas);break;
            case 1:imageView_33.setBackground(apelsin);break;
            case 2:imageView_33.setBackground(arbuz);break;
            case 3:imageView_33.setBackground(banana);break;
            case 4:imageView_33.setBackground(klubnika);break;
            case 5:imageView_33.setBackground(persik);break;
            case 6:imageView_33.setBackground(vinograd);break;
        }
        i34=rand.nextInt(6);
        switch (i34){
            case 0:imageView_34.setBackground(ananas);break;
            case 1:imageView_34.setBackground(apelsin);break;
            case 2:imageView_34.setBackground(arbuz);break;
            case 3:imageView_34.setBackground(banana);break;
            case 4:imageView_34.setBackground(klubnika);break;
            case 5:imageView_34.setBackground(persik);break;
            case 6:imageView_34.setBackground(vinograd);break;
        }
        i35=rand.nextInt(6);
        switch (i35){
            case 0:imageView_35.setBackground(ananas);break;
            case 1:imageView_35.setBackground(apelsin);break;
            case 2:imageView_35.setBackground(arbuz);break;
            case 3:imageView_35.setBackground(banana);break;
            case 4:imageView_35.setBackground(klubnika);break;
            case 5:imageView_35.setBackground(persik);break;
            case 6:imageView_35.setBackground(vinograd);break;
        }
        i36=rand.nextInt(6);
        switch (i36){
            case 0:imageView_36.setBackground(ananas);break;
            case 1:imageView_36.setBackground(apelsin);break;
            case 2:imageView_36.setBackground(arbuz);break;
            case 3:imageView_36.setBackground(banana);break;
            case 4:imageView_36.setBackground(klubnika);break;
            case 5:imageView_36.setBackground(persik);break;
            case 6:imageView_36.setBackground(vinograd);break;
        }

        i41=rand.nextInt(6);
        switch (i41){
            case 0:imageView_41.setBackground(ananas);break;
            case 1:imageView_41.setBackground(apelsin);break;
            case 2:imageView_41.setBackground(arbuz);break;
            case 3:imageView_41.setBackground(banana);break;
            case 4:imageView_41.setBackground(klubnika);break;
            case 5:imageView_41.setBackground(persik);break;
            case 6:imageView_41.setBackground(vinograd);break;
        }
        i42=rand.nextInt(6);
        switch (i42){
            case 0:imageView_42.setBackground(ananas);break;
            case 1:imageView_42.setBackground(apelsin);break;
            case 2:imageView_42.setBackground(arbuz);break;
            case 3:imageView_42.setBackground(banana);break;
            case 4:imageView_42.setBackground(klubnika);break;
            case 5:imageView_42.setBackground(persik);break;
            case 6:imageView_42.setBackground(vinograd);break;
        }
        i43=rand.nextInt(6);
        switch (i43){
            case 0:imageView_43.setBackground(ananas);break;
            case 1:imageView_43.setBackground(apelsin);break;
            case 2:imageView_43.setBackground(arbuz);break;
            case 3:imageView_43.setBackground(banana);break;
            case 4:imageView_43.setBackground(klubnika);break;
            case 5:imageView_43.setBackground(persik);break;
            case 6:imageView_43.setBackground(vinograd);break;
        }
        i44=rand.nextInt(6);
        switch (i44){
            case 0:imageView_44.setBackground(ananas);break;
            case 1:imageView_44.setBackground(apelsin);break;
            case 2:imageView_44.setBackground(arbuz);break;
            case 3:imageView_44.setBackground(banana);break;
            case 4:imageView_44.setBackground(klubnika);break;
            case 5:imageView_44.setBackground(persik);break;
            case 6:imageView_44.setBackground(vinograd);break;
        }
        i45=rand.nextInt(6);
        switch (i45){
            case 0:imageView_45.setBackground(ananas);break;
            case 1:imageView_45.setBackground(apelsin);break;
            case 2:imageView_45.setBackground(arbuz);break;
            case 3:imageView_45.setBackground(banana);break;
            case 4:imageView_45.setBackground(klubnika);break;
            case 5:imageView_45.setBackground(persik);break;
            case 6:imageView_45.setBackground(vinograd);break;
        }
        i46=rand.nextInt(6);
        switch (i46){
            case 0:imageView_46.setBackground(ananas);break;
            case 1:imageView_46.setBackground(apelsin);break;
            case 2:imageView_46.setBackground(arbuz);break;
            case 3:imageView_46.setBackground(banana);break;
            case 4:imageView_46.setBackground(klubnika);break;
            case 5:imageView_46.setBackground(persik);break;
            case 6:imageView_46.setBackground(vinograd);break;
        }

        i51=rand.nextInt(6);
        switch (i51){
            case 0:imageView_51.setBackground(ananas);break;
            case 1:imageView_51.setBackground(apelsin);break;
            case 2:imageView_51.setBackground(arbuz);break;
            case 3:imageView_51.setBackground(banana);break;
            case 4:imageView_51.setBackground(klubnika);break;
            case 5:imageView_51.setBackground(persik);break;
            case 6:imageView_51.setBackground(vinograd);break;
        }
        i52=rand.nextInt(6);
        switch (i52){
            case 0:imageView_52.setBackground(ananas);break;
            case 1:imageView_52.setBackground(apelsin);break;
            case 2:imageView_52.setBackground(arbuz);break;
            case 3:imageView_52.setBackground(banana);break;
            case 4:imageView_52.setBackground(klubnika);break;
            case 5:imageView_52.setBackground(persik);break;
            case 6:imageView_52.setBackground(vinograd);break;
        }
        i53=rand.nextInt(6);
        switch (i53){
            case 0:imageView_53.setBackground(ananas);break;
            case 1:imageView_53.setBackground(apelsin);break;
            case 2:imageView_53.setBackground(arbuz);break;
            case 3:imageView_53.setBackground(banana);break;
            case 4:imageView_53.setBackground(klubnika);break;
            case 5:imageView_53.setBackground(persik);break;
            case 6:imageView_53.setBackground(vinograd);break;
        }
        i54=rand.nextInt(6);
        switch (i54){
            case 0:imageView_54.setBackground(ananas);break;
            case 1:imageView_54.setBackground(apelsin);break;
            case 2:imageView_54.setBackground(arbuz);break;
            case 3:imageView_54.setBackground(banana);break;
            case 4:imageView_54.setBackground(klubnika);break;
            case 5:imageView_54.setBackground(persik);break;
            case 6:imageView_54.setBackground(vinograd);break;
        }
        i55=rand.nextInt(6);
        switch (i55){
            case 0:imageView_55.setBackground(ananas);break;
            case 1:imageView_55.setBackground(apelsin);break;
            case 2:imageView_55.setBackground(arbuz);break;
            case 3:imageView_55.setBackground(banana);break;
            case 4:imageView_55.setBackground(klubnika);break;
            case 5:imageView_55.setBackground(persik);break;
            case 6:imageView_55.setBackground(vinograd);break;
        }
        i56=rand.nextInt(6);
        switch (i56){
            case 0:imageView_56.setBackground(ananas);break;
            case 1:imageView_56.setBackground(apelsin);break;
            case 2:imageView_56.setBackground(arbuz);break;
            case 3:imageView_56.setBackground(banana);break;
            case 4:imageView_56.setBackground(klubnika);break;
            case 5:imageView_56.setBackground(persik);break;
            case 6:imageView_56.setBackground(vinograd);break;
        }

        i61=rand.nextInt(6);
        switch (i61){
            case 0:imageView_61.setBackground(ananas);break;
            case 1:imageView_61.setBackground(apelsin);break;
            case 2:imageView_61.setBackground(arbuz);break;
            case 3:imageView_61.setBackground(banana);break;
            case 4:imageView_61.setBackground(klubnika);break;
            case 5:imageView_61.setBackground(persik);break;
            case 6:imageView_61.setBackground(vinograd);break;
        }
        i62=rand.nextInt(6);
        switch (i62){
            case 0:imageView_62.setBackground(ananas);break;
            case 1:imageView_62.setBackground(apelsin);break;
            case 2:imageView_62.setBackground(arbuz);break;
            case 3:imageView_62.setBackground(banana);break;
            case 4:imageView_62.setBackground(klubnika);break;
            case 5:imageView_62.setBackground(persik);break;
            case 6:imageView_62.setBackground(vinograd);break;
        }
        i63=rand.nextInt(6);
        switch (i63){
            case 0:imageView_63.setBackground(ananas);break;
            case 1:imageView_63.setBackground(apelsin);break;
            case 2:imageView_63.setBackground(arbuz);break;
            case 3:imageView_63.setBackground(banana);break;
            case 4:imageView_63.setBackground(klubnika);break;
            case 5:imageView_63.setBackground(persik);break;
            case 6:imageView_63.setBackground(vinograd);break;
        }
        i64=rand.nextInt(6);
        switch (i64){
            case 0:imageView_64.setBackground(ananas);break;
            case 1:imageView_64.setBackground(apelsin);break;
            case 2:imageView_64.setBackground(arbuz);break;
            case 3:imageView_64.setBackground(banana);break;
            case 4:imageView_64.setBackground(klubnika);break;
            case 5:imageView_64.setBackground(persik);break;
            case 6:imageView_64.setBackground(vinograd);break;
        }
        i65=rand.nextInt(6);
        switch (i65){
            case 0:imageView_65.setBackground(ananas);break;
            case 1:imageView_65.setBackground(apelsin);break;
            case 2:imageView_65.setBackground(arbuz);break;
            case 3:imageView_65.setBackground(banana);break;
            case 4:imageView_65.setBackground(klubnika);break;
            case 5:imageView_65.setBackground(persik);break;
            case 6:imageView_65.setBackground(vinograd);break;
        }
        i66=rand.nextInt(6);
        switch (i66){
            case 0:imageView_66.setBackground(ananas);break;
            case 1:imageView_66.setBackground(apelsin);break;
            case 2:imageView_66.setBackground(arbuz);break;
            case 3:imageView_66.setBackground(banana);break;
            case 4:imageView_66.setBackground(klubnika);break;
            case 5:imageView_66.setBackground(persik);break;
            case 6:imageView_66.setBackground(vinograd);break;
        }

        i71=rand.nextInt(6);
        switch (i71){
            case 0:imageView_71.setBackground(ananas);break;
            case 1:imageView_71.setBackground(apelsin);break;
            case 2:imageView_71.setBackground(arbuz);break;
            case 3:imageView_71.setBackground(banana);break;
            case 4:imageView_71.setBackground(klubnika);break;
            case 5:imageView_71.setBackground(persik);break;
            case 6:imageView_71.setBackground(vinograd);break;
        }
        i72=rand.nextInt(6);
        switch (i72){
            case 0:imageView_72.setBackground(ananas);break;
            case 1:imageView_72.setBackground(apelsin);break;
            case 2:imageView_72.setBackground(arbuz);break;
            case 3:imageView_72.setBackground(banana);break;
            case 4:imageView_72.setBackground(klubnika);break;
            case 5:imageView_72.setBackground(persik);break;
            case 6:imageView_72.setBackground(vinograd);break;
        }
        i73=rand.nextInt(6);
        switch (i73){
            case 0:imageView_73.setBackground(ananas);break;
            case 1:imageView_73.setBackground(apelsin);break;
            case 2:imageView_73.setBackground(arbuz);break;
            case 3:imageView_73.setBackground(banana);break;
            case 4:imageView_73.setBackground(klubnika);break;
            case 5:imageView_73.setBackground(persik);break;
            case 6:imageView_73.setBackground(vinograd);break;
        }
        i74=rand.nextInt(6);
        switch (i74){
            case 0:imageView_74.setBackground(ananas);break;
            case 1:imageView_74.setBackground(apelsin);break;
            case 2:imageView_74.setBackground(arbuz);break;
            case 3:imageView_74.setBackground(banana);break;
            case 4:imageView_74.setBackground(klubnika);break;
            case 5:imageView_74.setBackground(persik);break;
            case 6:imageView_74.setBackground(vinograd);break;
        }
        i75=rand.nextInt(6);
        switch (i75){
            case 0:imageView_75.setBackground(ananas);break;
            case 1:imageView_75.setBackground(apelsin);break;
            case 2:imageView_75.setBackground(arbuz);break;
            case 3:imageView_75.setBackground(banana);break;
            case 4:imageView_75.setBackground(klubnika);break;
            case 5:imageView_75.setBackground(persik);break;
            case 6:imageView_75.setBackground(vinograd);break;
        }
        i76=rand.nextInt(6);
        switch (i76){
            case 0:imageView_76.setBackground(ananas);break;
            case 1:imageView_76.setBackground(apelsin);break;
            case 2:imageView_76.setBackground(arbuz);break;
            case 3:imageView_76.setBackground(banana);break;
            case 4:imageView_76.setBackground(klubnika);break;
            case 5:imageView_76.setBackground(persik);break;
            case 6:imageView_76.setBackground(vinograd);break;
        }

        i81=rand.nextInt(6);
        switch (i81){
            case 0:imageView_81.setBackground(ananas);break;
            case 1:imageView_81.setBackground(apelsin);break;
            case 2:imageView_81.setBackground(arbuz);break;
            case 3:imageView_81.setBackground(banana);break;
            case 4:imageView_81.setBackground(klubnika);break;
            case 5:imageView_81.setBackground(persik);break;
            case 6:imageView_81.setBackground(vinograd);break;
        }
        i82=rand.nextInt(6);
        switch (i82){
            case 0:imageView_82.setBackground(ananas);break;
            case 1:imageView_82.setBackground(apelsin);break;
            case 2:imageView_82.setBackground(arbuz);break;
            case 3:imageView_82.setBackground(banana);break;
            case 4:imageView_82.setBackground(klubnika);break;
            case 5:imageView_82.setBackground(persik);break;
            case 6:imageView_82.setBackground(vinograd);break;
        }
        i83=rand.nextInt(6);
        switch (i83){
            case 0:imageView_83.setBackground(ananas);break;
            case 1:imageView_83.setBackground(apelsin);break;
            case 2:imageView_83.setBackground(arbuz);break;
            case 3:imageView_83.setBackground(banana);break;
            case 4:imageView_83.setBackground(klubnika);break;
            case 5:imageView_83.setBackground(persik);break;
            case 6:imageView_83.setBackground(vinograd);break;
        }
        i84=rand.nextInt(6);
        switch (i84){
            case 0:imageView_84.setBackground(ananas);break;
            case 1:imageView_84.setBackground(apelsin);break;
            case 2:imageView_84.setBackground(arbuz);break;
            case 3:imageView_84.setBackground(banana);break;
            case 4:imageView_84.setBackground(klubnika);break;
            case 5:imageView_84.setBackground(persik);break;
            case 6:imageView_84.setBackground(vinograd);break;
        }
        i85=rand.nextInt(6);
        switch (i85){
            case 0:imageView_85.setBackground(ananas);break;
            case 1:imageView_85.setBackground(apelsin);break;
            case 2:imageView_85.setBackground(arbuz);break;
            case 3:imageView_85.setBackground(banana);break;
            case 4:imageView_85.setBackground(klubnika);break;
            case 5:imageView_85.setBackground(persik);break;
            case 6:imageView_85.setBackground(vinograd);break;
        }
        i86=rand.nextInt(6);
        switch (i86){
            case 0:imageView_86.setBackground(ananas);break;
            case 1:imageView_86.setBackground(apelsin);break;
            case 2:imageView_86.setBackground(arbuz);break;
            case 3:imageView_86.setBackground(banana);break;
            case 4:imageView_86.setBackground(klubnika);break;
            case 5:imageView_86.setBackground(persik);break;
            case 6:imageView_86.setBackground(vinograd);break;
        }

        i91=rand.nextInt(6);
        switch (i91){
            case 0:imageView_91.setBackground(ananas);break;
            case 1:imageView_91.setBackground(apelsin);break;
            case 2:imageView_91.setBackground(arbuz);break;
            case 3:imageView_91.setBackground(banana);break;
            case 4:imageView_91.setBackground(klubnika);break;
            case 5:imageView_91.setBackground(persik);break;
            case 6:imageView_91.setBackground(vinograd);break;
        }
        i92=rand.nextInt(6);
        switch (i92){
            case 0:imageView_92.setBackground(ananas);break;
            case 1:imageView_92.setBackground(apelsin);break;
            case 2:imageView_92.setBackground(arbuz);break;
            case 3:imageView_92.setBackground(banana);break;
            case 4:imageView_92.setBackground(klubnika);break;
            case 5:imageView_92.setBackground(persik);break;
            case 6:imageView_92.setBackground(vinograd);break;
        }
        i93=rand.nextInt(6);
        switch (i93){
            case 0:imageView_93.setBackground(ananas);break;
            case 1:imageView_93.setBackground(apelsin);break;
            case 2:imageView_93.setBackground(arbuz);break;
            case 3:imageView_93.setBackground(banana);break;
            case 4:imageView_93.setBackground(klubnika);break;
            case 5:imageView_93.setBackground(persik);break;
            case 6:imageView_93.setBackground(vinograd);break;
        }
        i94=rand.nextInt(6);
        switch (i94){
            case 0:imageView_94.setBackground(ananas);break;
            case 1:imageView_94.setBackground(apelsin);break;
            case 2:imageView_94.setBackground(arbuz);break;
            case 3:imageView_94.setBackground(banana);break;
            case 4:imageView_94.setBackground(klubnika);break;
            case 5:imageView_94.setBackground(persik);break;
            case 6:imageView_94.setBackground(vinograd);break;
        }
        i95=rand.nextInt(6);
        switch (i95){
            case 0:imageView_95.setBackground(ananas);break;
            case 1:imageView_95.setBackground(apelsin);break;
            case 2:imageView_95.setBackground(arbuz);break;
            case 3:imageView_95.setBackground(banana);break;
            case 4:imageView_95.setBackground(klubnika);break;
            case 5:imageView_95.setBackground(persik);break;
            case 6:imageView_95.setBackground(vinograd);break;
        }
        i96=rand.nextInt(6);
        switch (i96){
            case 0:imageView_96.setBackground(ananas);break;
            case 1:imageView_96.setBackground(apelsin);break;
            case 2:imageView_96.setBackground(arbuz);break;
            case 3:imageView_96.setBackground(banana);break;
            case 4:imageView_96.setBackground(klubnika);break;
            case 5:imageView_96.setBackground(persik);break;
            case 6:imageView_96.setBackground(vinograd);break;
        }

        // Горизонтальная проверка

        if (i11==i12&&i12==i13){
            imageView_11.setBackground(vzriv_1);
            imageView_12.setBackground(vzriv_1);
        imageView_13.setBackground(vzriv_1);}

        if (i12==i13&&i13==i14){
            imageView_12.setBackground(vzriv_1);
            imageView_13.setBackground(vzriv_1);
            imageView_14.setBackground(vzriv_1);}

        if (i13==i14&&i14==i15){
            imageView_13.setBackground(vzriv_1);
            imageView_14.setBackground(vzriv_1);
            imageView_15.setBackground(vzriv_1);}

        if (i14==i15&&i15==i16){
            imageView_14.setBackground(vzriv_1);
            imageView_15.setBackground(vzriv_1);
            imageView_16.setBackground(vzriv_1);}




        if (i21==i22&&i22==i23){
            imageView_21.setBackground(vzriv_1);
            imageView_22.setBackground(vzriv_1);
            imageView_23.setBackground(vzriv_1);}

        if (i22==i23&&i23==i24){
            imageView_22.setBackground(vzriv_1);
            imageView_23.setBackground(vzriv_1);
            imageView_24.setBackground(vzriv_1);}

        if (i23==i24&&i24==i25){
            imageView_23.setBackground(vzriv_1);
            imageView_24.setBackground(vzriv_1);
            imageView_25.setBackground(vzriv_1);}

        if (i24==i25&&i25==i26){
            imageView_24.setBackground(vzriv_1);
            imageView_25.setBackground(vzriv_1);
            imageView_26.setBackground(vzriv_1);}




        if (i31==i32&&i32==i33){
            imageView_31.setBackground(vzriv_1);
            imageView_32.setBackground(vzriv_1);
            imageView_33.setBackground(vzriv_1);}

        if (i32==i33&&i33==i34){
            imageView_32.setBackground(vzriv_1);
            imageView_33.setBackground(vzriv_1);
            imageView_34.setBackground(vzriv_1);}

        if (i33==i34&&i34==i35){
            imageView_33.setBackground(vzriv_1);
            imageView_34.setBackground(vzriv_1);
            imageView_35.setBackground(vzriv_1);}


        if (i34==i35&&i35==i36){
            imageView_34.setBackground(vzriv_1);
            imageView_35.setBackground(vzriv_1);
            imageView_36.setBackground(vzriv_1);}



        if (i41==i42&&i42==i43){
            imageView_41.setBackground(vzriv_1);
            imageView_42.setBackground(vzriv_1);
            imageView_43.setBackground(vzriv_1);}

        if (i42==i43&&i43==i44){
            imageView_42.setBackground(vzriv_1);
            imageView_43.setBackground(vzriv_1);
            imageView_44.setBackground(vzriv_1);}

        if (i43==i44&&i44==i45){
            imageView_43.setBackground(vzriv_1);
            imageView_44.setBackground(vzriv_1);
            imageView_45.setBackground(vzriv_1);}


        if (i44==i45&&i45==i46){
            imageView_44.setBackground(vzriv_1);
            imageView_45.setBackground(vzriv_1);
            imageView_46.setBackground(vzriv_1);}


        if (i51==i52&&i52==i53){
            imageView_51.setBackground(vzriv_1);
            imageView_52.setBackground(vzriv_1);
            imageView_53.setBackground(vzriv_1);}

        if (i52==i53&&i53==i54){
            imageView_52.setBackground(vzriv_1);
            imageView_53.setBackground(vzriv_1);
            imageView_54.setBackground(vzriv_1);}

        if (i53==i54&&i54==i55){
            imageView_53.setBackground(vzriv_1);
            imageView_54.setBackground(vzriv_1);
            imageView_55.setBackground(vzriv_1);}

        if (i54==i55&&i55==i56){
            imageView_54.setBackground(vzriv_1);
            imageView_55.setBackground(vzriv_1);
            imageView_56.setBackground(vzriv_1);}


        if (i61==i62&&i62==i63){
            imageView_61.setBackground(vzriv_1);
            imageView_62.setBackground(vzriv_1);
            imageView_63.setBackground(vzriv_1);}

        if (i62==i63&&i63==i64){
            imageView_62.setBackground(vzriv_1);
            imageView_63.setBackground(vzriv_1);
            imageView_64.setBackground(vzriv_1);}

        if (i63==i64&&i64==i65){
            imageView_63.setBackground(vzriv_1);
            imageView_64.setBackground(vzriv_1);
            imageView_65.setBackground(vzriv_1);}

        if (i64==i65&&i65==i66){
            imageView_64.setBackground(vzriv_1);
            imageView_64.setBackground(vzriv_1);
            imageView_66.setBackground(vzriv_1);}


        if (i71==i72&&i72==i73){
            imageView_71.setBackground(vzriv_1);
            imageView_72.setBackground(vzriv_1);
            imageView_73.setBackground(vzriv_1);}

        if (i72==i73&&i73==i74){
            imageView_72.setBackground(vzriv_1);
            imageView_73.setBackground(vzriv_1);
            imageView_74.setBackground(vzriv_1);}

        if (i73==i74&&i74==i75){
            imageView_73.setBackground(vzriv_1);
            imageView_74.setBackground(vzriv_1);
            imageView_75.setBackground(vzriv_1);}

        if (i74==i75&&i75==i76){
            imageView_74.setBackground(vzriv_1);
            imageView_74.setBackground(vzriv_1);
            imageView_76.setBackground(vzriv_1);}


        if (i81==i82&&i82==i83){
            imageView_81.setBackground(vzriv_1);
            imageView_82.setBackground(vzriv_1);
            imageView_83.setBackground(vzriv_1);}

        if (i82==i83&&i83==i84){
            imageView_82.setBackground(vzriv_1);
            imageView_83.setBackground(vzriv_1);
            imageView_84.setBackground(vzriv_1);}

        if (i83==i84&&i84==i85){
            imageView_83.setBackground(vzriv_1);
            imageView_84.setBackground(vzriv_1);
            imageView_85.setBackground(vzriv_1);}

        if (i84==i85&&i85==i86){
            imageView_84.setBackground(vzriv_1);
            imageView_84.setBackground(vzriv_1);
            imageView_86.setBackground(vzriv_1);}


        if (i91==i92&&i92==i93){
            imageView_91.setBackground(vzriv_1);
            imageView_92.setBackground(vzriv_1);
            imageView_93.setBackground(vzriv_1);}

        if (i92==i93&&i93==i94){
            imageView_92.setBackground(vzriv_1);
            imageView_93.setBackground(vzriv_1);
            imageView_94.setBackground(vzriv_1);}

        if (i93==i94&&i94==i95){
            imageView_93.setBackground(vzriv_1);
            imageView_94.setBackground(vzriv_1);
            imageView_95.setBackground(vzriv_1);}

        if (i94==i95&&i95==i96){
            imageView_94.setBackground(vzriv_1);
            imageView_94.setBackground(vzriv_1);
            imageView_96.setBackground(vzriv_1);}

        //Веритикальная проверка

        if (i11==i21&&i21==i31){
            imageView_11.setBackground(vzriv_1);
            imageView_21.setBackground(vzriv_1);
            imageView_31.setBackground(vzriv_1);}

        if (i21==i31&&i31==i41){
            imageView_21.setBackground(vzriv_1);
            imageView_31.setBackground(vzriv_1);
            imageView_41.setBackground(vzriv_1);}

        if (i31==i41&&i41==i51){
            imageView_31.setBackground(vzriv_1);
            imageView_41.setBackground(vzriv_1);
            imageView_51.setBackground(vzriv_1);}

        if (i41==i51&&i51==i61){
            imageView_41.setBackground(vzriv_1);
            imageView_51.setBackground(vzriv_1);
            imageView_61.setBackground(vzriv_1);}

        if (i51==i61&&i61==i71){
            imageView_51.setBackground(vzriv_1);
            imageView_61.setBackground(vzriv_1);
            imageView_71.setBackground(vzriv_1);}

        if (i61==i71&&i71==i81){
            imageView_61.setBackground(vzriv_1);
            imageView_71.setBackground(vzriv_1);
            imageView_81.setBackground(vzriv_1);}

        if (i71==i81&&i81==i91){
            imageView_71.setBackground(vzriv_1);
            imageView_81.setBackground(vzriv_1);
            imageView_91.setBackground(vzriv_1);}

        ///////////////////////////////////////////////////////////////


        if (i12==i22&&i22==i32){
            imageView_12.setBackground(vzriv_1);
            imageView_22.setBackground(vzriv_1);
            imageView_32.setBackground(vzriv_1);}

        if (i22==i32&&i32==i42){
            imageView_22.setBackground(vzriv_1);
            imageView_32.setBackground(vzriv_1);
            imageView_42.setBackground(vzriv_1);}

        if (i32==i42&&i42==i52){
            imageView_32.setBackground(vzriv_1);
            imageView_42.setBackground(vzriv_1);
            imageView_52.setBackground(vzriv_1);}

        if (i42==i52&&i52==i62){
            imageView_42.setBackground(vzriv_1);
            imageView_52.setBackground(vzriv_1);
            imageView_62.setBackground(vzriv_1);}

        if (i52==i62&&i62==i72){
            imageView_52.setBackground(vzriv_1);
            imageView_62.setBackground(vzriv_1);
            imageView_72.setBackground(vzriv_1);}

        if (i62==i72&&i72==i82){
            imageView_62.setBackground(vzriv_1);
            imageView_72.setBackground(vzriv_1);
            imageView_82.setBackground(vzriv_1);}

        if (i72==i82&&i82==i92){
            imageView_72.setBackground(vzriv_1);
            imageView_82.setBackground(vzriv_1);
            imageView_92.setBackground(vzriv_1);}

        ///////////////////////////////////////////////////////////////

        if (i13==i23&&i23==i33){
            imageView_13.setBackground(vzriv_1);
            imageView_23.setBackground(vzriv_1);
            imageView_33.setBackground(vzriv_1);}

        if (i23==i33&&i33==i43){
            imageView_23.setBackground(vzriv_1);
            imageView_33.setBackground(vzriv_1);
            imageView_43.setBackground(vzriv_1);}

        if (i33==i43&&i43==i53){
            imageView_33.setBackground(vzriv_1);
            imageView_43.setBackground(vzriv_1);
            imageView_53.setBackground(vzriv_1);}

        if (i43==i53&&i53==i63){
            imageView_43.setBackground(vzriv_1);
            imageView_53.setBackground(vzriv_1);
            imageView_63.setBackground(vzriv_1);}

        if (i53==i63&&i63==i73){
            imageView_53.setBackground(vzriv_1);
            imageView_63.setBackground(vzriv_1);
            imageView_73.setBackground(vzriv_1);}

        if (i63==i73&&i73==i83){
            imageView_63.setBackground(vzriv_1);
            imageView_73.setBackground(vzriv_1);
            imageView_83.setBackground(vzriv_1);}

        if (i73==i83&&i83==i93){
            imageView_73.setBackground(vzriv_1);
            imageView_83.setBackground(vzriv_1);
            imageView_93.setBackground(vzriv_1);}

        ///////////////////////////////////////////////////////////////

        if (i14==i24&&i24==i34){
            imageView_14.setBackground(vzriv_1);
            imageView_24.setBackground(vzriv_1);
            imageView_34.setBackground(vzriv_1);}

        if (i24==i34&&i34==i44){
            imageView_24.setBackground(vzriv_1);
            imageView_34.setBackground(vzriv_1);
            imageView_44.setBackground(vzriv_1);}

        if (i34==i44&&i44==i54){
            imageView_34.setBackground(vzriv_1);
            imageView_44.setBackground(vzriv_1);
            imageView_54.setBackground(vzriv_1);}

        if (i44==i54&&i54==i64){
            imageView_44.setBackground(vzriv_1);
            imageView_54.setBackground(vzriv_1);
            imageView_64.setBackground(vzriv_1);}

        if (i54==i64&&i64==i74){
            imageView_54.setBackground(vzriv_1);
            imageView_64.setBackground(vzriv_1);
            imageView_74.setBackground(vzriv_1);}

        if (i64==i74&&i74==i84){
            imageView_64.setBackground(vzriv_1);
            imageView_74.setBackground(vzriv_1);
            imageView_84.setBackground(vzriv_1);}

        if (i74==i84&&i84==i94){
            imageView_74.setBackground(vzriv_1);
            imageView_84.setBackground(vzriv_1);
            imageView_94.setBackground(vzriv_1);}

        ///////////////////////////////////////////////////////////////


        if (i15==i25&&i25==i35){
            imageView_15.setBackground(vzriv_1);
            imageView_25.setBackground(vzriv_1);
            imageView_35.setBackground(vzriv_1);}

        if (i25==i35&&i35==i45){
            imageView_25.setBackground(vzriv_1);
            imageView_35.setBackground(vzriv_1);
            imageView_45.setBackground(vzriv_1);}

        if (i35==i45&&i45==i55){
            imageView_35.setBackground(vzriv_1);
            imageView_45.setBackground(vzriv_1);
            imageView_55.setBackground(vzriv_1);}

        if (i45==i55&&i55==i65){
            imageView_45.setBackground(vzriv_1);
            imageView_55.setBackground(vzriv_1);
            imageView_65.setBackground(vzriv_1);}

        if (i55==i65&&i65==i75){
            imageView_55.setBackground(vzriv_1);
            imageView_65.setBackground(vzriv_1);
            imageView_75.setBackground(vzriv_1);}

        if (i65==i75&&i75==i85){
            imageView_65.setBackground(vzriv_1);
            imageView_75.setBackground(vzriv_1);
            imageView_85.setBackground(vzriv_1);}

        if (i75==i85&&i85==i95){
            imageView_75.setBackground(vzriv_1);
            imageView_85.setBackground(vzriv_1);
            imageView_95.setBackground(vzriv_1);}

        ///////////////////////////////////////////////////////////////


        if (i16==i26&&i26==i36){
            imageView_16.setBackground(vzriv_1);
            imageView_26.setBackground(vzriv_1);
            imageView_36.setBackground(vzriv_1);}

        if (i26==i36&&i36==i46){
            imageView_26.setBackground(vzriv_1);
            imageView_36.setBackground(vzriv_1);
            imageView_46.setBackground(vzriv_1);}

        if (i36==i46&&i46==i56){
            imageView_36.setBackground(vzriv_1);
            imageView_46.setBackground(vzriv_1);
            imageView_56.setBackground(vzriv_1);}

        if (i46==i56&&i56==i66){
            imageView_46.setBackground(vzriv_1);
            imageView_56.setBackground(vzriv_1);
            imageView_66.setBackground(vzriv_1);}

        if (i56==i66&&i66==i76){
            imageView_56.setBackground(vzriv_1);
            imageView_66.setBackground(vzriv_1);
            imageView_76.setBackground(vzriv_1);}

        if (i66==i76&&i76==i86){
            imageView_66.setBackground(vzriv_1);
            imageView_76.setBackground(vzriv_1);
            imageView_86.setBackground(vzriv_1);}

        if (i76==i86&&i86==i96){
            imageView_76.setBackground(vzriv_1);
            imageView_86.setBackground(vzriv_1);
            imageView_96.setBackground(vzriv_1);}

        ///////////////////////////////////////////////////////////////

        s=0;

        imageView_11.setOnTouchListener(listener);
        imageView_12.setOnTouchListener(listener);
        imageView_13.setOnTouchListener(listener);
        imageView_14.setOnTouchListener(listener);
        imageView_15.setOnTouchListener(listener);
        imageView_16.setOnTouchListener(listener);
        imageView_21.setOnTouchListener(listener);
        imageView_22.setOnTouchListener(listener);
        imageView_23.setOnTouchListener(listener);
        imageView_24.setOnTouchListener(listener);
        imageView_25.setOnTouchListener(listener);
        imageView_26.setOnTouchListener(listener);
        imageView_31.setOnTouchListener(listener);
        imageView_32.setOnTouchListener(listener);
        imageView_33.setOnTouchListener(listener);
        imageView_34.setOnTouchListener(listener);
        imageView_35.setOnTouchListener(listener);
        imageView_36.setOnTouchListener(listener);
        imageView_41.setOnTouchListener(listener);
        imageView_42.setOnTouchListener(listener);
        imageView_43.setOnTouchListener(listener);
        imageView_44.setOnTouchListener(listener);
        imageView_45.setOnTouchListener(listener);
        imageView_46.setOnTouchListener(listener);
        imageView_51.setOnTouchListener(listener);
        imageView_52.setOnTouchListener(listener);
        imageView_53.setOnTouchListener(listener);
        imageView_54.setOnTouchListener(listener);
        imageView_55.setOnTouchListener(listener);
        imageView_56.setOnTouchListener(listener);
        imageView_61.setOnTouchListener(listener);
        imageView_62.setOnTouchListener(listener);
        imageView_63.setOnTouchListener(listener);
        imageView_64.setOnTouchListener(listener);
        imageView_65.setOnTouchListener(listener);
        imageView_66.setOnTouchListener(listener);
        imageView_71.setOnTouchListener(listener);
        imageView_72.setOnTouchListener(listener);
        imageView_73.setOnTouchListener(listener);
        imageView_74.setOnTouchListener(listener);
        imageView_75.setOnTouchListener(listener);
        imageView_76.setOnTouchListener(listener);
        imageView_81.setOnTouchListener(listener);
        imageView_82.setOnTouchListener(listener);
        imageView_83.setOnTouchListener(listener);
        imageView_84.setOnTouchListener(listener);
        imageView_85.setOnTouchListener(listener);
        imageView_86.setOnTouchListener(listener);
        imageView_91.setOnTouchListener(listener);
        imageView_92.setOnTouchListener(listener);
        imageView_93.setOnTouchListener(listener);
        imageView_94.setOnTouchListener(listener);
        imageView_95.setOnTouchListener(listener);
        imageView_96.setOnTouchListener(listener);


//        mt=new MyTask();


    }

//    class MyTask extends AsyncTask<Void,Void,Void>{
//
//        protected void onPreExecute() {
//            super.onPreExecute();
//
//            // Востановление всех взорванных ячеек
//
//            if (imageView_91.getBackground()==vzriv_1) {
//                imageView_91.setBackground(imageView_81.getBackground());
//                imageView_81.setBackground(imageView_71.getBackground());
//                imageView_71.setBackground(imageView_61.getBackground());
//                imageView_61.setBackground(imageView_51.getBackground());
//                imageView_51.setBackground(imageView_41.getBackground());
//                imageView_41.setBackground(imageView_31.getBackground());
//                imageView_31.setBackground(imageView_21.getBackground());
//                imageView_21.setBackground(imageView_11.getBackground());
//
//                        if (imageView_11.getBackground() == vzriv_1) {
//                            Random random = new Random();
//                            i11 = random.nextInt(6);
//                            switch (i11) {
//                                case 0:
//                                    imageView_11.setBackground(ananas);
//                                    break;
//                                case 1:
//                                    imageView_11.setBackground(apelsin);
//                                    break;
//                                case 2:
//                                    imageView_11.setBackground(arbuz);
//                                    break;
//                                case 3:
//                                    imageView_11.setBackground(banana);
//                                    break;
//                                case 4:
//                                    imageView_11.setBackground(klubnika);
//                                    break;
//                                case 5:
//                                    imageView_11.setBackground(persik);
//                                    break;
//                                case 6:
//                                    imageView_11.setBackground(vinograd);
//                                    break;
//                            }
//                                        }
//            }
//        }
//
//        @Override
//        protected Void doInBackground(Void... params) {
//            try {
//                TimeUnit.SECONDS.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            return null;
//        }
//    }


    public View.OnTouchListener listener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                s=s+1;
                if (s==1) {
                    firstclick=v.getId();
                    Log.v("FirstCLICK=",firstclick.toString());
                    imageView_00=(ImageView)findViewById(firstclick);
                    drawable1 = imageView_00.getBackground();
                } else
                if (s==2) {
                    secondclick=v.getId();
                    Log.v("SecondCLICK=",secondclick.toString());
                    imageView_01=(ImageView)findViewById(secondclick);
                    drawable2=imageView_01.getBackground();


                    if ((Math.abs(firstclick.intValue()-secondclick.intValue())>=2)^(Math.abs(firstclick.intValue()-secondclick.intValue())==6)){
                        imageView_01.setBackground(drawable2);
                        imageView_00.setBackground(drawable1);
                        s=0;}
                    else {imageView_01.setBackground(drawable1);
                        imageView_00.setBackground(drawable2);
                        s=0;}



                    // Проверка на три в ряд горизонтальная

                    if (imageView_11.getBackground()==imageView_12.getBackground()&&imageView_12.getBackground()==imageView_13.getBackground()){
                        imageView_11.setBackground(vzriv_1);
                        imageView_12.setBackground(vzriv_1);
                        imageView_13.setBackground(vzriv_1);
                    }

                    if (imageView_12.getBackground()==imageView_13.getBackground()&&imageView_13.getBackground()==imageView_14.getBackground()){
                        imageView_12.setBackground(vzriv_1);
                        imageView_13.setBackground(vzriv_1);
                        imageView_14.setBackground(vzriv_1);
                    }

                    if (imageView_13.getBackground()==imageView_14.getBackground()&&imageView_14.getBackground()==imageView_15.getBackground()){
                        imageView_13.setBackground(vzriv_1);
                        imageView_14.setBackground(vzriv_1);
                        imageView_15.setBackground(vzriv_1);
                    }
                    if (imageView_14.getBackground()==imageView_15.getBackground()&&imageView_15.getBackground()==imageView_16.getBackground()){
                        imageView_14.setBackground(vzriv_1);
                        imageView_15.setBackground(vzriv_1);
                        imageView_16.setBackground(vzriv_1);
                    }



                    if (imageView_21.getBackground()==imageView_22.getBackground()&&imageView_22.getBackground()==imageView_23.getBackground()){
                        imageView_21.setBackground(vzriv_1);
                        imageView_22.setBackground(vzriv_1);
                        imageView_23.setBackground(vzriv_1);
                    }

                    if (imageView_22.getBackground()==imageView_23.getBackground()&&imageView_23.getBackground()==imageView_24.getBackground()){
                        imageView_22.setBackground(vzriv_1);
                        imageView_23.setBackground(vzriv_1);
                        imageView_24.setBackground(vzriv_1);
                    }

                    if (imageView_23.getBackground()==imageView_24.getBackground()&&imageView_24.getBackground()==imageView_25.getBackground()){
                        imageView_23.setBackground(vzriv_1);
                        imageView_24.setBackground(vzriv_1);
                        imageView_25.setBackground(vzriv_1);
                    }
                    if (imageView_24.getBackground()==imageView_25.getBackground()&&imageView_25.getBackground()==imageView_26.getBackground()){
                        imageView_24.setBackground(vzriv_1);
                        imageView_25.setBackground(vzriv_1);
                        imageView_26.setBackground(vzriv_1);
                    }


                    if (imageView_31.getBackground()==imageView_32.getBackground()&&imageView_32.getBackground()==imageView_33.getBackground()){
                        imageView_31.setBackground(vzriv_1);
                        imageView_32.setBackground(vzriv_1);
                        imageView_33.setBackground(vzriv_1);
                    }

                    if (imageView_32.getBackground()==imageView_33.getBackground()&&imageView_33.getBackground()==imageView_34.getBackground()){
                        imageView_32.setBackground(vzriv_1);
                        imageView_33.setBackground(vzriv_1);
                        imageView_34.setBackground(vzriv_1);
                    }

                    if (imageView_33.getBackground()==imageView_34.getBackground()&&imageView_34.getBackground()==imageView_35.getBackground()){
                        imageView_33.setBackground(vzriv_1);
                        imageView_34.setBackground(vzriv_1);
                        imageView_35.setBackground(vzriv_1);
                    }
                    if (imageView_34.getBackground()==imageView_35.getBackground()&&imageView_35.getBackground()==imageView_36.getBackground()){
                        imageView_34.setBackground(vzriv_1);
                        imageView_35.setBackground(vzriv_1);
                        imageView_36.setBackground(vzriv_1);
                    }


                    if (imageView_41.getBackground()==imageView_42.getBackground()&&imageView_42.getBackground()==imageView_43.getBackground()){
                        imageView_41.setBackground(vzriv_1);
                        imageView_42.setBackground(vzriv_1);
                        imageView_43.setBackground(vzriv_1);
                    }

                    if (imageView_42.getBackground()==imageView_43.getBackground()&&imageView_43.getBackground()==imageView_44.getBackground()){
                        imageView_42.setBackground(vzriv_1);
                        imageView_43.setBackground(vzriv_1);
                        imageView_44.setBackground(vzriv_1);
                    }

                    if (imageView_43.getBackground()==imageView_44.getBackground()&&imageView_44.getBackground()==imageView_45.getBackground()){
                        imageView_43.setBackground(vzriv_1);
                        imageView_44.setBackground(vzriv_1);
                        imageView_45.setBackground(vzriv_1);
                    }
                    if (imageView_44.getBackground()==imageView_45.getBackground()&&imageView_45.getBackground()==imageView_46.getBackground()){
                        imageView_44.setBackground(vzriv_1);
                        imageView_45.setBackground(vzriv_1);
                        imageView_46.setBackground(vzriv_1);
                    }

                    if (imageView_51.getBackground()==imageView_52.getBackground()&&imageView_52.getBackground()==imageView_53.getBackground()){
                        imageView_51.setBackground(vzriv_1);
                        imageView_52.setBackground(vzriv_1);
                        imageView_53.setBackground(vzriv_1);
                    }

                    if (imageView_52.getBackground()==imageView_53.getBackground()&&imageView_53.getBackground()==imageView_54.getBackground()){
                        imageView_52.setBackground(vzriv_1);
                        imageView_53.setBackground(vzriv_1);
                        imageView_54.setBackground(vzriv_1);
                    }

                    if (imageView_53.getBackground()==imageView_54.getBackground()&&imageView_54.getBackground()==imageView_55.getBackground()){
                        imageView_53.setBackground(vzriv_1);
                        imageView_54.setBackground(vzriv_1);
                        imageView_55.setBackground(vzriv_1);
                    }
                    if (imageView_54.getBackground()==imageView_55.getBackground()&&imageView_55.getBackground()==imageView_56.getBackground()){
                        imageView_54.setBackground(vzriv_1);
                        imageView_55.setBackground(vzriv_1);
                        imageView_56.setBackground(vzriv_1);
                    }

                    if (imageView_61.getBackground()==imageView_62.getBackground()&&imageView_62.getBackground()==imageView_63.getBackground()){
                        imageView_61.setBackground(vzriv_1);
                        imageView_62.setBackground(vzriv_1);
                        imageView_63.setBackground(vzriv_1);
                    }

                    if (imageView_62.getBackground()==imageView_63.getBackground()&&imageView_63.getBackground()==imageView_64.getBackground()){
                        imageView_62.setBackground(vzriv_1);
                        imageView_63.setBackground(vzriv_1);
                        imageView_64.setBackground(vzriv_1);
                    }

                    if (imageView_63.getBackground()==imageView_64.getBackground()&&imageView_64.getBackground()==imageView_65.getBackground()){
                        imageView_63.setBackground(vzriv_1);
                        imageView_64.setBackground(vzriv_1);
                        imageView_65.setBackground(vzriv_1);
                    }
                    if (imageView_64.getBackground()==imageView_65.getBackground()&&imageView_65.getBackground()==imageView_66.getBackground()){
                        imageView_64.setBackground(vzriv_1);
                        imageView_65.setBackground(vzriv_1);
                        imageView_66.setBackground(vzriv_1);
                    }

                    if (imageView_71.getBackground()==imageView_72.getBackground()&&imageView_72.getBackground()==imageView_73.getBackground()){
                        imageView_71.setBackground(vzriv_1);
                        imageView_72.setBackground(vzriv_1);
                        imageView_73.setBackground(vzriv_1);
                    }

                    if (imageView_72.getBackground()==imageView_73.getBackground()&&imageView_73.getBackground()==imageView_74.getBackground()){
                        imageView_72.setBackground(vzriv_1);
                        imageView_73.setBackground(vzriv_1);
                        imageView_74.setBackground(vzriv_1);
                    }

                    if (imageView_73.getBackground()==imageView_74.getBackground()&&imageView_74.getBackground()==imageView_75.getBackground()){
                        imageView_73.setBackground(vzriv_1);
                        imageView_74.setBackground(vzriv_1);
                        imageView_75.setBackground(vzriv_1);
                    }
                    if (imageView_74.getBackground()==imageView_75.getBackground()&&imageView_75.getBackground()==imageView_76.getBackground()){
                        imageView_74.setBackground(vzriv_1);
                        imageView_75.setBackground(vzriv_1);
                        imageView_76.setBackground(vzriv_1);
                    }

                    if (imageView_81.getBackground()==imageView_82.getBackground()&&imageView_82.getBackground()==imageView_83.getBackground()){
                        imageView_81.setBackground(vzriv_1);
                        imageView_82.setBackground(vzriv_1);
                        imageView_83.setBackground(vzriv_1);
                    }

                    if (imageView_82.getBackground()==imageView_83.getBackground()&&imageView_83.getBackground()==imageView_84.getBackground()){
                        imageView_82.setBackground(vzriv_1);
                        imageView_83.setBackground(vzriv_1);
                        imageView_84.setBackground(vzriv_1);
                    }

                    if (imageView_83.getBackground()==imageView_84.getBackground()&&imageView_84.getBackground()==imageView_85.getBackground()){
                        imageView_83.setBackground(vzriv_1);
                        imageView_84.setBackground(vzriv_1);
                        imageView_85.setBackground(vzriv_1);
                    }
                    if (imageView_84.getBackground()==imageView_85.getBackground()&&imageView_85.getBackground()==imageView_86.getBackground()){
                        imageView_84.setBackground(vzriv_1);
                        imageView_85.setBackground(vzriv_1);
                        imageView_86.setBackground(vzriv_1);
                    }

                    if (imageView_91.getBackground()==imageView_92.getBackground()&&imageView_92.getBackground()==imageView_93.getBackground()){
                        imageView_91.setBackground(vzriv_1);
                        imageView_92.setBackground(vzriv_1);
                        imageView_93.setBackground(vzriv_1);
                    }

                    if (imageView_92.getBackground()==imageView_93.getBackground()&&imageView_93.getBackground()==imageView_94.getBackground()){
                        imageView_92.setBackground(vzriv_1);
                        imageView_93.setBackground(vzriv_1);
                        imageView_94.setBackground(vzriv_1);
                    }

                    if (imageView_93.getBackground()==imageView_94.getBackground()&&imageView_94.getBackground()==imageView_95.getBackground()){
                        imageView_93.setBackground(vzriv_1);
                        imageView_94.setBackground(vzriv_1);
                        imageView_95.setBackground(vzriv_1);
                    }
                    if (imageView_94.getBackground()==imageView_95.getBackground()&&imageView_95.getBackground()==imageView_96.getBackground()){
                        imageView_94.setBackground(vzriv_1);
                        imageView_95.setBackground(vzriv_1);
                        imageView_96.setBackground(vzriv_1);
                    }

                    // Проверка на три в ряд (вертикальная)

                    if (imageView_11.getBackground()==imageView_21.getBackground()&&imageView_21.getBackground()==imageView_31.getBackground()){
                        imageView_11.setBackground(vzriv_1);
                        imageView_21.setBackground(vzriv_1);
                        imageView_31.setBackground(vzriv_1);
                    }
                    if (imageView_21.getBackground()==imageView_31.getBackground()&&imageView_31.getBackground()==imageView_41.getBackground()){
                        imageView_21.setBackground(vzriv_1);
                        imageView_31.setBackground(vzriv_1);
                        imageView_41.setBackground(vzriv_1);
                    }
                    if (imageView_31.getBackground()==imageView_41.getBackground()&&imageView_41.getBackground()==imageView_51.getBackground()){
                        imageView_31.setBackground(vzriv_1);
                        imageView_41.setBackground(vzriv_1);
                        imageView_51.setBackground(vzriv_1);
                    }
                    if (imageView_41.getBackground()==imageView_51.getBackground()&&imageView_51.getBackground()==imageView_61.getBackground()){
                        imageView_41.setBackground(vzriv_1);
                        imageView_51.setBackground(vzriv_1);
                        imageView_61.setBackground(vzriv_1);
                    }
                    if (imageView_51.getBackground()==imageView_61.getBackground()&&imageView_61.getBackground()==imageView_71.getBackground()){
                        imageView_51.setBackground(vzriv_1);
                        imageView_61.setBackground(vzriv_1);
                        imageView_71.setBackground(vzriv_1);
                    }
                    if (imageView_61.getBackground()==imageView_71.getBackground()&&imageView_71.getBackground()==imageView_81.getBackground()){
                        imageView_61.setBackground(vzriv_1);
                        imageView_71.setBackground(vzriv_1);
                        imageView_81.setBackground(vzriv_1);
                    }
                    if (imageView_71.getBackground()==imageView_81.getBackground()&&imageView_81.getBackground()==imageView_91.getBackground()){
                        imageView_71.setBackground(vzriv_1);
                        imageView_81.setBackground(vzriv_1);
                        imageView_91.setBackground(vzriv_1);
                    }



                    if (imageView_12.getBackground()==imageView_22.getBackground()&&imageView_22.getBackground()==imageView_32.getBackground()){
                        imageView_12.setBackground(vzriv_1);
                        imageView_22.setBackground(vzriv_1);
                        imageView_32.setBackground(vzriv_1);
                    }
                    if (imageView_22.getBackground()==imageView_32.getBackground()&&imageView_32.getBackground()==imageView_42.getBackground()){
                        imageView_22.setBackground(vzriv_1);
                        imageView_32.setBackground(vzriv_1);
                        imageView_42.setBackground(vzriv_1);
                    }
                    if (imageView_32.getBackground()==imageView_42.getBackground()&&imageView_42.getBackground()==imageView_52.getBackground()){
                        imageView_32.setBackground(vzriv_1);
                        imageView_42.setBackground(vzriv_1);
                        imageView_52.setBackground(vzriv_1);
                    }
                    if (imageView_42.getBackground()==imageView_52.getBackground()&&imageView_52.getBackground()==imageView_62.getBackground()){
                        imageView_42.setBackground(vzriv_1);
                        imageView_52.setBackground(vzriv_1);
                        imageView_62.setBackground(vzriv_1);
                    }
                    if (imageView_52.getBackground()==imageView_62.getBackground()&&imageView_62.getBackground()==imageView_72.getBackground()){
                        imageView_52.setBackground(vzriv_1);
                        imageView_62.setBackground(vzriv_1);
                        imageView_72.setBackground(vzriv_1);
                    }
                    if (imageView_62.getBackground()==imageView_72.getBackground()&&imageView_72.getBackground()==imageView_82.getBackground()){
                        imageView_62.setBackground(vzriv_1);
                        imageView_72.setBackground(vzriv_1);
                        imageView_82.setBackground(vzriv_1);
                    }
                    if (imageView_72.getBackground()==imageView_82.getBackground()&&imageView_82.getBackground()==imageView_92.getBackground()){
                        imageView_72.setBackground(vzriv_1);
                        imageView_82.setBackground(vzriv_1);
                        imageView_92.setBackground(vzriv_1);
                    }

                    if (imageView_13.getBackground()==imageView_23.getBackground()&&imageView_23.getBackground()==imageView_33.getBackground()){
                        imageView_13.setBackground(vzriv_1);
                        imageView_23.setBackground(vzriv_1);
                        imageView_33.setBackground(vzriv_1);
                    }
                    if (imageView_23.getBackground()==imageView_33.getBackground()&&imageView_33.getBackground()==imageView_43.getBackground()){
                        imageView_23.setBackground(vzriv_1);
                        imageView_33.setBackground(vzriv_1);
                        imageView_43.setBackground(vzriv_1);
                    }
                    if (imageView_33.getBackground()==imageView_43.getBackground()&&imageView_43.getBackground()==imageView_53.getBackground()){
                        imageView_33.setBackground(vzriv_1);
                        imageView_43.setBackground(vzriv_1);
                        imageView_53.setBackground(vzriv_1);
                    }
                    if (imageView_43.getBackground()==imageView_53.getBackground()&&imageView_53.getBackground()==imageView_63.getBackground()){
                        imageView_43.setBackground(vzriv_1);
                        imageView_53.setBackground(vzriv_1);
                        imageView_63.setBackground(vzriv_1);
                    }
                    if (imageView_53.getBackground()==imageView_63.getBackground()&&imageView_63.getBackground()==imageView_73.getBackground()){
                        imageView_53.setBackground(vzriv_1);
                        imageView_63.setBackground(vzriv_1);
                        imageView_73.setBackground(vzriv_1);
                    }
                    if (imageView_63.getBackground()==imageView_73.getBackground()&&imageView_73.getBackground()==imageView_83.getBackground()){
                        imageView_63.setBackground(vzriv_1);
                        imageView_73.setBackground(vzriv_1);
                        imageView_83.setBackground(vzriv_1);
                    }
                    if (imageView_73.getBackground()==imageView_83.getBackground()&&imageView_83.getBackground()==imageView_93.getBackground()){
                        imageView_73.setBackground(vzriv_1);
                        imageView_83.setBackground(vzriv_1);
                        imageView_93.setBackground(vzriv_1);
                    }

                    if (imageView_14.getBackground()==imageView_24.getBackground()&&imageView_24.getBackground()==imageView_34.getBackground()){
                        imageView_14.setBackground(vzriv_1);
                        imageView_24.setBackground(vzriv_1);
                        imageView_34.setBackground(vzriv_1);
                    }
                    if (imageView_24.getBackground()==imageView_34.getBackground()&&imageView_34.getBackground()==imageView_44.getBackground()){
                        imageView_24.setBackground(vzriv_1);
                        imageView_34.setBackground(vzriv_1);
                        imageView_44.setBackground(vzriv_1);
                    }
                    if (imageView_34.getBackground()==imageView_44.getBackground()&&imageView_44.getBackground()==imageView_54.getBackground()){
                        imageView_34.setBackground(vzriv_1);
                        imageView_44.setBackground(vzriv_1);
                        imageView_54.setBackground(vzriv_1);
                    }
                    if (imageView_44.getBackground()==imageView_54.getBackground()&&imageView_54.getBackground()==imageView_64.getBackground()){
                        imageView_44.setBackground(vzriv_1);
                        imageView_54.setBackground(vzriv_1);
                        imageView_64.setBackground(vzriv_1);
                    }
                    if (imageView_54.getBackground()==imageView_64.getBackground()&&imageView_64.getBackground()==imageView_74.getBackground()){
                        imageView_54.setBackground(vzriv_1);
                        imageView_64.setBackground(vzriv_1);
                        imageView_74.setBackground(vzriv_1);
                    }
                    if (imageView_64.getBackground()==imageView_74.getBackground()&&imageView_74.getBackground()==imageView_84.getBackground()){
                        imageView_64.setBackground(vzriv_1);
                        imageView_74.setBackground(vzriv_1);
                        imageView_84.setBackground(vzriv_1);
                    }
                    if (imageView_74.getBackground()==imageView_84.getBackground()&&imageView_84.getBackground()==imageView_94.getBackground()){
                        imageView_74.setBackground(vzriv_1);
                        imageView_84.setBackground(vzriv_1);
                        imageView_94.setBackground(vzriv_1);
                    }

                    if (imageView_15.getBackground()==imageView_25.getBackground()&&imageView_25.getBackground()==imageView_35.getBackground()){
                        imageView_15.setBackground(vzriv_1);
                        imageView_25.setBackground(vzriv_1);
                        imageView_35.setBackground(vzriv_1);
                    }
                    if (imageView_25.getBackground()==imageView_35.getBackground()&&imageView_35.getBackground()==imageView_45.getBackground()){
                        imageView_25.setBackground(vzriv_1);
                        imageView_35.setBackground(vzriv_1);
                        imageView_45.setBackground(vzriv_1);
                    }
                    if (imageView_35.getBackground()==imageView_45.getBackground()&&imageView_45.getBackground()==imageView_55.getBackground()){
                        imageView_35.setBackground(vzriv_1);
                        imageView_45.setBackground(vzriv_1);
                        imageView_55.setBackground(vzriv_1);
                    }
                    if (imageView_45.getBackground()==imageView_55.getBackground()&&imageView_55.getBackground()==imageView_65.getBackground()){
                        imageView_45.setBackground(vzriv_1);
                        imageView_55.setBackground(vzriv_1);
                        imageView_65.setBackground(vzriv_1);
                    }
                    if (imageView_55.getBackground()==imageView_65.getBackground()&&imageView_65.getBackground()==imageView_75.getBackground()){
                        imageView_55.setBackground(vzriv_1);
                        imageView_65.setBackground(vzriv_1);
                        imageView_75.setBackground(vzriv_1);
                    }
                    if (imageView_65.getBackground()==imageView_75.getBackground()&&imageView_75.getBackground()==imageView_85.getBackground()){
                        imageView_65.setBackground(vzriv_1);
                        imageView_75.setBackground(vzriv_1);
                        imageView_85.setBackground(vzriv_1);
                    }
                    if (imageView_75.getBackground()==imageView_85.getBackground()&&imageView_85.getBackground()==imageView_95.getBackground()){
                        imageView_75.setBackground(vzriv_1);
                        imageView_85.setBackground(vzriv_1);
                        imageView_95.setBackground(vzriv_1);
                    }

                    if (imageView_16.getBackground()==imageView_26.getBackground()&&imageView_26.getBackground()==imageView_36.getBackground()){
                        imageView_16.setBackground(vzriv_1);
                        imageView_26.setBackground(vzriv_1);
                        imageView_36.setBackground(vzriv_1);
                    }
                    if (imageView_26.getBackground()==imageView_36.getBackground()&&imageView_36.getBackground()==imageView_46.getBackground()){
                        imageView_26.setBackground(vzriv_1);
                        imageView_36.setBackground(vzriv_1);
                        imageView_46.setBackground(vzriv_1);
                    }
                    if (imageView_36.getBackground()==imageView_46.getBackground()&&imageView_46.getBackground()==imageView_56.getBackground()){
                        imageView_36.setBackground(vzriv_1);
                        imageView_46.setBackground(vzriv_1);
                        imageView_56.setBackground(vzriv_1);
                    }
                    if (imageView_46.getBackground()==imageView_56.getBackground()&&imageView_56.getBackground()==imageView_66.getBackground()){
                        imageView_46.setBackground(vzriv_1);
                        imageView_56.setBackground(vzriv_1);
                        imageView_66.setBackground(vzriv_1);
                    }
                    if (imageView_56.getBackground()==imageView_66.getBackground()&&imageView_66.getBackground()==imageView_76.getBackground()){
                        imageView_56.setBackground(vzriv_1);
                        imageView_66.setBackground(vzriv_1);
                        imageView_76.setBackground(vzriv_1);
                    }
                    if (imageView_66.getBackground()==imageView_76.getBackground()&&imageView_76.getBackground()==imageView_86.getBackground()){
                        imageView_66.setBackground(vzriv_1);
                        imageView_76.setBackground(vzriv_1);
                        imageView_86.setBackground(vzriv_1);
                    }
                    if (imageView_76.getBackground()==imageView_86.getBackground()&&imageView_86.getBackground()==imageView_96.getBackground()){
                        imageView_76.setBackground(vzriv_1);
                        imageView_86.setBackground(vzriv_1);
                        imageView_96.setBackground(vzriv_1);
                    }


                    // Востановление всех взорванных ячеек

                    if (imageView_91.getBackground()==vzriv_1) {
                        imageView_91.setBackground(imageView_81.getBackground());
                        imageView_81.setBackground(imageView_71.getBackground());
                        imageView_71.setBackground(imageView_61.getBackground());
                        imageView_61.setBackground(imageView_51.getBackground());
                        imageView_51.setBackground(imageView_41.getBackground());
                        imageView_41.setBackground(imageView_31.getBackground());
                        imageView_31.setBackground(imageView_21.getBackground());
                        imageView_21.setBackground(imageView_11.getBackground());

                        if (imageView_11.getBackground() == vzriv_1) {
                            Random random = new Random();
                            i11 = random.nextInt(6);
                            switch (i11) {
                                case 0:
                                    imageView_11.setBackground(ananas);
                                    break;
                                case 1:
                                    imageView_11.setBackground(apelsin);
                                    break;
                                case 2:
                                    imageView_11.setBackground(arbuz);
                                    break;
                                case 3:
                                    imageView_11.setBackground(banana);
                                    break;
                                case 4:
                                    imageView_11.setBackground(klubnika);
                                    break;
                                case 5:
                                    imageView_11.setBackground(persik);
                                    break;
                                case 6:
                                    imageView_11.setBackground(vinograd);
                                    break;
                            }
                        }
                    }





                }

            }
            return false;
        }


    };


    }

