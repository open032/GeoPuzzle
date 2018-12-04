package xyz.open032.multipazzl.dragNdrop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import xyz.open032.multipazzl.R;

public class DandDMultiPazl extends AppCompatActivity {
    private ImageView imageview;
    private ImageView imgTwo;
    private ImageView imgThree;
    private ImageView imgFore;
    private ImageView imgFive;
    private ImageView imgSix;
    private ImageView imgSeven;
    private ImageView imgEight;
    private ImageView imgNine;
    private ImageView imgTen;
    private ImageView imgEleven;
    private ImageView imgTwelve;
    private ViewGroup rootLayout;
    private int mFinish = 0;
    private int mFinishh = 0;
    private int _xDelta;
    private int _yDelta;
    private static final String TAG = "myLogs";

    private int one = 0;
    private int two = 0;
    private int three = 0;
    private int fore = 0;
    private int five = 0;
    private int six = 0;
    private int seven = 0;
    private int eight = 0;
    private int nine = 0;
    private int ten = 0;
    private int eleven = 0;
    private int twelve = 0;

    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        imageview = new ImageView(DandDMultiPazl.this);
        RelativeLayout relativelayout = (RelativeLayout) findViewById(R.id.view_root);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(Math.round(pxFromDp(74)), Math.round(pxFromDp(11)));

        imageview.setImageResource(R.drawable.onee);
        imageview.setScaleType(ImageView.ScaleType.FIT_XY);
        params.leftMargin = Math.round(pxFromDp(200));
        params.topMargin = Math.round(pxFromDp(20));
        imageview.setLayoutParams(params);
        relativelayout.addView(imageview);

        textView = new TextView(DandDMultiPazl.this);
        textView.setText("FINISH");
        LinearLayout.LayoutParams paramsText = new LinearLayout
                .LayoutParams(Math.round(pxFromDp(100)), Math.round(pxFromDp(100)));
        paramsText.leftMargin = Math.round(pxFromDp(150));
        paramsText.topMargin = Math.round(pxFromDp(250));
        textView.setLayoutParams(paramsText);
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);



        imgTwo = new ImageView(DandDMultiPazl.this);
        LinearLayout.LayoutParams paramsTwo = new LinearLayout
                .LayoutParams(Math.round(pxFromDp(74)), Math.round(pxFromDp(42)));

        imgTwo.setImageResource(R.drawable.two);
        imgTwo.setScaleType(ImageView.ScaleType.FIT_XY);
        paramsTwo.leftMargin = Math.round(pxFromDp(250));
        paramsTwo.topMargin = Math.round(pxFromDp(500));
        imgTwo.setLayoutParams(paramsTwo);
        relativelayout.addView(imgTwo);
        rootLayout = (ViewGroup) findViewById(R.id.view_root);

        imgThree = new ImageView(DandDMultiPazl.this);
        LinearLayout.LayoutParams paramsThree = new LinearLayout
                .LayoutParams(Math.round(pxFromDp(74)), Math.round(pxFromDp(64)));
        imgThree.setImageResource(R.drawable.three);
        imgThree.setScaleType(ImageView.ScaleType.FIT_XY);
        paramsThree.leftMargin = Math.round(pxFromDp(250));
        paramsThree.topMargin = Math.round(pxFromDp(520));
        imgThree.setLayoutParams(paramsThree);
        relativelayout.addView(imgThree);
        rootLayout = (ViewGroup) findViewById(R.id.view_root);

        imgFore = new ImageView(DandDMultiPazl.this);
        LinearLayout.LayoutParams paramsFore = new LinearLayout
                .LayoutParams(Math.round(pxFromDp(74)), Math.round(pxFromDp(36)));
        imgFore.setImageResource(R.drawable.fore);
        imgFore.setScaleType(ImageView.ScaleType.FIT_XY);
        paramsFore.leftMargin = Math.round(pxFromDp(250));
        paramsFore.topMargin = Math.round(pxFromDp(220));
        imgFore.setLayoutParams(paramsFore);
        relativelayout.addView(imgFore);
        rootLayout = (ViewGroup) findViewById(R.id.view_root);

        imgFive = new ImageView(DandDMultiPazl.this);
        LinearLayout.LayoutParams paramsFive = new LinearLayout
                .LayoutParams(Math.round(pxFromDp(74)), Math.round(pxFromDp(35)));
        imgFive.setImageResource(R.drawable.five);
        imgFive.setScaleType(ImageView.ScaleType.FIT_XY);
        paramsFive.leftMargin = Math.round(pxFromDp(250));
        paramsFive.topMargin = Math.round(pxFromDp(260));
        imgFive.setLayoutParams(paramsFive);
        relativelayout.addView(imgFive);
        rootLayout = (ViewGroup) findViewById(R.id.view_root);

        imgSix = new ImageView(DandDMultiPazl.this);
        LinearLayout.LayoutParams paramsSix = new LinearLayout
                .LayoutParams(Math.round(pxFromDp(74)), Math.round(pxFromDp(24)));
        imgSix.setImageResource(R.drawable.six);
        imgSix.setScaleType(ImageView.ScaleType.FIT_XY);
        paramsSix.leftMargin = Math.round(pxFromDp(250));
        paramsSix.topMargin = Math.round(pxFromDp(240));
        imgSix.setLayoutParams(paramsSix);
        relativelayout.addView(imgSix);
        rootLayout = (ViewGroup) findViewById(R.id.view_root);

        imgSeven = new ImageView(DandDMultiPazl.this);
        LinearLayout.LayoutParams paramsSeven = new LinearLayout
                .LayoutParams(Math.round(pxFromDp(74)), Math.round(pxFromDp(65)));
        imgSeven.setImageResource(R.drawable.seven);
        imgSeven.setScaleType(ImageView.ScaleType.FIT_XY);
        paramsSeven.leftMargin = Math.round(pxFromDp(250));
        paramsSeven.topMargin = Math.round(pxFromDp(280));
        imgSeven.setLayoutParams(paramsSeven);
        relativelayout.addView(imgSeven);
        rootLayout = (ViewGroup) findViewById(R.id.view_root);

        imgEight = new ImageView(DandDMultiPazl.this);
        LinearLayout.LayoutParams paramsEight = new LinearLayout
                .LayoutParams(Math.round(pxFromDp(74)), Math.round(pxFromDp(26)));
        imgEight.setImageResource(R.drawable.eight);
        imgEight.setScaleType(ImageView.ScaleType.FIT_XY);
        paramsEight.leftMargin = Math.round(pxFromDp(250));
        paramsEight.topMargin = Math.round(pxFromDp(300));
        imgEight.setLayoutParams(paramsEight);
        relativelayout.addView(imgEight);
        rootLayout = (ViewGroup) findViewById(R.id.view_root);

        imgNine = new ImageView(DandDMultiPazl.this);
        LinearLayout.LayoutParams paramsNine = new LinearLayout
                .LayoutParams(Math.round(pxFromDp(74)), Math.round(pxFromDp(22)));
        imgNine.setImageResource(R.drawable.nine);
        imgNine.setScaleType(ImageView.ScaleType.FIT_XY);
        paramsNine.leftMargin = Math.round(pxFromDp(300));
        paramsNine.topMargin = Math.round(pxFromDp(320));
        imgNine.setLayoutParams(paramsNine);
        relativelayout.addView(imgNine);
        rootLayout = (ViewGroup) findViewById(R.id.view_root);

        imgTen = new ImageView(DandDMultiPazl.this);
        LinearLayout.LayoutParams paramsTen = new LinearLayout
                .LayoutParams(Math.round(pxFromDp(74)), Math.round(pxFromDp(50)));
        imgTen.setImageResource(R.drawable.ten);
        imgTen.setScaleType(ImageView.ScaleType.FIT_XY);
        paramsTen.leftMargin = Math.round(pxFromDp(300));
        paramsTen.topMargin = Math.round(pxFromDp(340));
        imgTen.setLayoutParams(paramsTen);
        relativelayout.addView(imgTen);
        rootLayout = (ViewGroup) findViewById(R.id.view_root);

        imgEleven = new ImageView(DandDMultiPazl.this);
        LinearLayout.LayoutParams paramsEleven = new LinearLayout
                .LayoutParams(Math.round(pxFromDp(74)), Math.round(pxFromDp(63)));
        imgEleven.setImageResource(R.drawable.eleven);
        imgEleven.setScaleType(ImageView.ScaleType.FIT_XY);
        paramsEleven.leftMargin = Math.round(pxFromDp(300));
        paramsEleven.topMargin = Math.round(pxFromDp(360));
        imgEleven.setLayoutParams(paramsEleven);
        relativelayout.addView(imgEleven);
        rootLayout = (ViewGroup) findViewById(R.id.view_root);

        imgTwelve = new ImageView(DandDMultiPazl.this);
        LinearLayout.LayoutParams paramsTwelve = new LinearLayout
                .LayoutParams(Math.round(pxFromDp(74)), Math.round(pxFromDp(39)));
        imgTwelve.setImageResource(R.drawable.twelve);
        imgTwelve.setScaleType(ImageView.ScaleType.FIT_XY);
        paramsTwelve.leftMargin = Math.round(pxFromDp(280));
        paramsTwelve.topMargin = Math.round(pxFromDp(380));
        imgTwelve.setLayoutParams(paramsTwelve);
        relativelayout.addView(imgTwelve);
        rootLayout = (ViewGroup) findViewById(R.id.view_root);


        imageview.setOnTouchListener(new ChoiceTouchListener());
        imgTwo.setOnTouchListener(new ChoiceTouchListener());
        imgThree.setOnTouchListener(new ChoiceTouchListener());
        imgFore.setOnTouchListener(new ChoiceTouchListener());
        imgFive.setOnTouchListener(new ChoiceTouchListener());
        imgSix.setOnTouchListener(new ChoiceTouchListener());
        imgSeven.setOnTouchListener(new ChoiceTouchListener());
        imgEight.setOnTouchListener(new ChoiceTouchListener());
        imgNine.setOnTouchListener(new ChoiceTouchListener());
        imgTen.setOnTouchListener(new ChoiceTouchListener());
        imgEleven.setOnTouchListener(new ChoiceTouchListener());
        imgTwelve.setOnTouchListener(new ChoiceTouchListener());

    }
    private final class ChoiceTouchListener implements View.OnTouchListener {
        public boolean onTouch(View view, MotionEvent event) {
            final int X = (int) event.getRawX();// point on the monitor x
            final int Y = (int) event.getRawY();// point on the monitor y
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    RelativeLayout.LayoutParams lParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
                    _xDelta = X - lParams.leftMargin; // point x on obj(img); "lParams.leftMargin" - point where  now object(img)
                    _yDelta = Y - lParams.topMargin;
                    //Log.d(TAG, "imageview = " + imgTwo.getLeft() );
                    break;
                case MotionEvent.ACTION_UP:
                    RelativeLayout.LayoutParams layoutP = (RelativeLayout.LayoutParams) view.getLayoutParams();

                        if (imageview.getLeft() >= Math.round(pxFromDp(80)) && imageview.getLeft() <= Math.round(pxFromDp(100))
                                && imageview.getTop() >= Math.round(pxFromDp(0)) && imageview.getTop() <= Math.round(pxFromDp(17))) {
                            methodOne();
                        }
                    if (imgTwo.getLeft() >= Math.round(pxFromDp(80)) && imgTwo.getLeft() <= Math.round(pxFromDp(100))
                            && imgTwo.getTop() >= Math.round(pxFromDp(8)) && imgTwo.getTop() <= Math.round(pxFromDp(28))) {
                        methodTwo();
                    }
                    if (imgThree.getLeft() >= Math.round(pxFromDp(80)) && imgThree.getLeft() <= Math.round(pxFromDp(100))
                            && imgThree.getTop() >= Math.round(pxFromDp(50)) && imgThree.getTop() <= Math.round(pxFromDp(70))) {
                        methodThree();
                    }
                    if (imgFore.getLeft() >= Math.round(pxFromDp(80)) && imgFore.getLeft() <= Math.round(pxFromDp(100))
                            && imgFore.getTop() >= Math.round(pxFromDp(114)) && imgFore.getTop() <= Math.round(pxFromDp(234))) {
                        methodFore();
                    }
                    if (imgFive.getLeft() >= Math.round(pxFromDp(80)) && imgFive.getLeft() <= Math.round(pxFromDp(100))
                            && imgFive.getTop() >= Math.round(pxFromDp(150)) && imgFive.getTop() <= Math.round(pxFromDp(170))) {
                        methodFive();
                    }
                    if (imgSix.getLeft() >= Math.round(pxFromDp(80)) && imgSix.getLeft() <= Math.round(pxFromDp(100))
                            && imgSix.getTop() >= Math.round(pxFromDp(185)) && imgSix.getTop() <= Math.round(pxFromDp(205))) {
                        methodSix();
                    }
                    if (imgSeven.getLeft() >= Math.round(pxFromDp(80)) && imgSeven.getLeft() <= Math.round(pxFromDp(100))
                            && imgSeven.getTop() >= Math.round(pxFromDp(209)) && imgSeven.getTop() <= Math.round(pxFromDp(229))) {
                        methodSeven();
                    }
                    if (imgEight.getLeft() >= Math.round(pxFromDp(80)) && imgEight.getLeft() <= Math.round(pxFromDp(100))
                            && imgEight.getTop() >= Math.round(pxFromDp(274)) && imgEight.getTop() <= Math.round(pxFromDp(294))) {
                        methodEight();
                    }
                    if (imgNine.getLeft() >= Math.round(pxFromDp(80)) && imgNine.getLeft() <= Math.round(pxFromDp(100))
                            && imgNine.getTop() >= Math.round(pxFromDp(301)) && imgNine.getTop() <= Math.round(pxFromDp(321))) {
                        methodNine();
                    }
                    if (imgTen.getLeft() >= Math.round(pxFromDp(80)) && imgTen.getLeft() <= Math.round(pxFromDp(100))
                            && imgTen.getTop() >= Math.round(pxFromDp(323)) && imgTen.getTop() <= Math.round(pxFromDp(343))) {
                        methodTen();
                    }
                    if (imgEleven.getLeft() >= Math.round(pxFromDp(80)) && imgEleven.getLeft() <= Math.round(pxFromDp(100))
                            && imgEleven.getTop() >= Math.round(pxFromDp(373)) && imgEleven.getTop() <= Math.round(pxFromDp(393))) {
                        methodEleven();
                    }
                    if (imgTwelve.getLeft() >= Math.round(pxFromDp(80)) && imgTwelve.getLeft() <= Math.round(pxFromDp(100))
                            && imgTwelve.getTop() >= Math.round(pxFromDp(436)) && imgTwelve.getTop() <= Math.round(pxFromDp(456))) {
                        methodTwelve();
                    }
                    break;
                case MotionEvent.ACTION_POINTER_DOWN:
                    break;
                case MotionEvent.ACTION_POINTER_UP:
                    break;
                case MotionEvent.ACTION_MOVE:
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
                    layoutParams.leftMargin = X - _xDelta;
                    layoutParams.topMargin = Y - _yDelta;
                    view.setLayoutParams(layoutParams);
                   // Log.d(TAG, "x = " + layoutParams.leftMargin + "  y = " + layoutParams.topMargin);
                    break;
            }
            rootLayout.invalidate();
            return true;
        }

    }

    private void methodOne(){
        imageview.setVisibility(View.GONE);
        imageview = new ImageView(DandDMultiPazl.this);
        RelativeLayout relativelayout = (RelativeLayout) findViewById(R.id.view_root);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(Math.round(pxFromDp(74)), Math.round(pxFromDp(11)));

        imageview.setImageResource(R.drawable.onee);
        imageview.setScaleType(ImageView.ScaleType.FIT_XY);
        params.leftMargin = Math.round(pxFromDp(90));
        params.topMargin = Math.round(pxFromDp(7));
        imageview.setLayoutParams(params);
        relativelayout.addView(imageview);
        if (one == 0){  mFinish++;    }
          one = 1;
        Log.d(TAG, "mFinish = " + mFinish);
        if(mFinish == 12) {
          //  relativelayout.addView(textView);
            Log.d(TAG, "FINISH!!!!!!!!!!!!!!!!!!!!!! = " + mFinish); }


    }
    private void methodTwo(){
        imgTwo.setVisibility(View.GONE);
        imgTwo = new ImageView(DandDMultiPazl.this);
        RelativeLayout relativelayout = (RelativeLayout) findViewById(R.id.view_root);
        LinearLayout.LayoutParams paramsTwo = new LinearLayout.LayoutParams(Math.round(pxFromDp(74)), Math.round(pxFromDp(42)));

        imgTwo.setImageResource(R.drawable.two);
        imgTwo.setScaleType(ImageView.ScaleType.FIT_XY);
        paramsTwo.leftMargin = Math.round(pxFromDp(90));
        paramsTwo.topMargin = Math.round(pxFromDp(18));
        imgTwo.setLayoutParams(paramsTwo);
        relativelayout.addView(imgTwo);
        if (two == 0){  mFinish++;    }
        two = 1;
        Log.d(TAG, "mFinish = " + mFinish);
        if(mFinish == 12) {
          //  relativelayout.addView(textView);
            Log.d(TAG, "FINISH!!!!!!!!!!!!!!!!!!!!!! = " + mFinish); }
    }
    private void methodThree(){
        imgThree.setVisibility(View.GONE);
        imgThree = new ImageView(DandDMultiPazl.this);
        RelativeLayout relativelayout = (RelativeLayout) findViewById(R.id.view_root);
        LinearLayout.LayoutParams paramsThree = new LinearLayout.LayoutParams(Math.round(pxFromDp(74)), Math.round(pxFromDp(64)));

        imgThree.setImageResource(R.drawable.three);
        imgThree.setScaleType(ImageView.ScaleType.FIT_XY);
        paramsThree.leftMargin = Math.round(pxFromDp(90));
        paramsThree.topMargin = Math.round(pxFromDp(60));
        imgThree.setLayoutParams(paramsThree);
        relativelayout.addView(imgThree);
        if (three == 0){  mFinish++;    }
        three = 1;
        Log.d(TAG, "mFinish = " + mFinish);
        if(mFinish == 12) {
          //  relativelayout.addView(textView);
            Log.d(TAG, "FINISH!!!!!!!!!!!!!!!!!!!!!! = " + mFinish); }
    }
    private void methodFore(){
        imgFore.setVisibility(View.GONE);
        imgFore = new ImageView(DandDMultiPazl.this);
        RelativeLayout relativelayout = (RelativeLayout) findViewById(R.id.view_root);
        LinearLayout.LayoutParams paramsFore = new LinearLayout.LayoutParams(Math.round(pxFromDp(74)), Math.round(pxFromDp(36)));
        imgFore.setImageResource(R.drawable.fore);
        imgFore.setScaleType(ImageView.ScaleType.FIT_XY);
        paramsFore.leftMargin = Math.round(pxFromDp(90));
        paramsFore.topMargin = Math.round(pxFromDp(124));
        imgFore.setLayoutParams(paramsFore);
        relativelayout.addView(imgFore);
        if (fore == 0){  mFinish++;    }
        fore = 1;
        Log.d(TAG, "mFinish = " + mFinish);
        if(mFinish == 12) {
           // relativelayout.addView(textView);
            Log.d(TAG, "FINISH!!!!!!!!!!!!!!!!!!!!!! = " + mFinish); }
    }
    private void methodFive(){
        imgFive.setVisibility(View.GONE);
        imgFive = new ImageView(DandDMultiPazl.this);
        RelativeLayout relativelayout = (RelativeLayout) findViewById(R.id.view_root);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(Math.round(pxFromDp(74)), Math.round(pxFromDp(35)));
        imgFive.setImageResource(R.drawable.five);
        imgFive.setScaleType(ImageView.ScaleType.FIT_XY);
        params.leftMargin = Math.round(pxFromDp(90));
        params.topMargin = Math.round(pxFromDp(160));
        imgFive.setLayoutParams(params);
        relativelayout.addView(imgFive);
        if (five == 0){  mFinish++;    }
        five = 1;
        Log.d(TAG, "mFinish = " + mFinish);
        if(mFinish == 12) {
         //   relativelayout.addView(textView);
            Log.d(TAG, "FINISH!!!!!!!!!!!!!!!!!!!!!! = " + mFinish); }
    }
    private void methodSix(){
        imgSix.setVisibility(View.GONE);
        imgSix = new ImageView(DandDMultiPazl.this);
        RelativeLayout relativelayout = (RelativeLayout) findViewById(R.id.view_root);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(Math.round(pxFromDp(74)), Math.round(pxFromDp(24)));
        imgSix.setImageResource(R.drawable.six);
        imgSix.setScaleType(ImageView.ScaleType.FIT_XY);
        params.leftMargin = Math.round(pxFromDp(90));
        params.topMargin = Math.round(pxFromDp(195));
        imgSix.setLayoutParams(params);
        relativelayout.addView(imgSix);
        if (six == 0){  mFinish++;    }
        six = 1;
        Log.d(TAG, "mFinish = " + mFinish);
        if(mFinish == 12) {
            //relativelayout.addView(textView);
            Log.d(TAG, "FINISH!!!!!!!!!!!!!!!!!!!!!! = " + mFinish); }
    }
    private void methodSeven(){
        imgSeven.setVisibility(View.GONE);
        imgSeven = new ImageView(DandDMultiPazl.this);
        RelativeLayout relativelayout = (RelativeLayout) findViewById(R.id.view_root);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(Math.round(pxFromDp(74)), Math.round(pxFromDp(65)));
        imgSeven.setImageResource(R.drawable.seven);
        imgSeven.setScaleType(ImageView.ScaleType.FIT_XY);
        params.leftMargin = Math.round(pxFromDp(90));
        params.topMargin = Math.round(pxFromDp(219));
        imgSeven.setLayoutParams(params);
        relativelayout.addView(imgSeven);
        if (seven == 0){  mFinish++;    }
        seven = 1;
        Log.d(TAG, "mFinish = " + mFinish);
        if(mFinish == 12) {
           // relativelayout.addView(textView);
            Log.d(TAG, "FINISH!!!!!!!!!!!!!!!!!!!!!! = " + mFinish); }
    }
    private void methodEight(){
        imgEight.setVisibility(View.GONE);
        imgEight = new ImageView(DandDMultiPazl.this);
        RelativeLayout relativelayout = (RelativeLayout) findViewById(R.id.view_root);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(Math.round(pxFromDp(74)), Math.round(pxFromDp(26)));
        imgEight.setImageResource(R.drawable.eight);
        imgEight.setScaleType(ImageView.ScaleType.FIT_XY);
        params.leftMargin = Math.round(pxFromDp(90));
        params.topMargin = Math.round(pxFromDp(284));
        imgEight.setLayoutParams(params);
        relativelayout.addView(imgEight);
        if (eight == 0){  mFinish++;    }
        eight = 1;
        Log.d(TAG, "mFinish = " + mFinish);
        if(mFinish == 12) {
            //relativelayout.addView(textView);
            Log.d(TAG, "FINISH!!!!!!!!!!!!!!!!!!!!!! = " + mFinish); }
    }
    private void methodNine(){
        imgNine.setVisibility(View.GONE);
        imgNine = new ImageView(DandDMultiPazl.this);
        RelativeLayout relativelayout = (RelativeLayout) findViewById(R.id.view_root);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(Math.round(pxFromDp(74)), Math.round(pxFromDp(22)));
        imgNine.setImageResource(R.drawable.nine);
        imgNine.setScaleType(ImageView.ScaleType.FIT_XY);
        params.leftMargin = Math.round(pxFromDp(90));
        params.topMargin = Math.round(pxFromDp(311));
        imgNine.setLayoutParams(params);
        relativelayout.addView(imgNine);
        if (nine == 0){  mFinish++;    }
        nine = 1;
        Log.d(TAG, "mFinish = " + mFinish);
        if(mFinish == 12) {
            //relativelayout.addView(textView);
            Log.d(TAG, "FINISH!!!!!!!!!!!!!!!!!!!!!! = " + mFinish); }
    }
    private void methodTen(){
        imgTen.setVisibility(View.GONE);
        imgTen = new ImageView(DandDMultiPazl.this);
        RelativeLayout relativelayout = (RelativeLayout) findViewById(R.id.view_root);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(Math.round(pxFromDp(74)), Math.round(pxFromDp(50)));

        imgTen.setImageResource(R.drawable.ten);
        imgTen.setScaleType(ImageView.ScaleType.FIT_XY);
        params.leftMargin = Math.round(pxFromDp(90));
        params.topMargin = Math.round(pxFromDp(333));
        imgTen.setLayoutParams(params);
        relativelayout.addView(imgTen);
        if (ten == 0){  mFinish++;    }
        ten = 1;
        Log.d(TAG, "mFinish = " + mFinish);
        if(mFinish == 12) {
            relativelayout.addView(textView);
            Log.d(TAG, "FINISH!!!!!!!!!!!!!!!!!!!!!! = " + mFinish); }
    }
    private void methodEleven(){
        imgEleven.setVisibility(View.GONE);
        imgEleven = new ImageView(DandDMultiPazl.this);
        RelativeLayout relativelayout = (RelativeLayout) findViewById(R.id.view_root);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(Math.round(pxFromDp(74)), Math.round(pxFromDp(63)));
        imgEleven.setImageResource(R.drawable.eleven);
        imgEleven.setScaleType(ImageView.ScaleType.FIT_XY);
        params.leftMargin = Math.round(pxFromDp(90));
        params.topMargin = Math.round(pxFromDp(383));
        imgEleven.setLayoutParams(params);
        relativelayout.addView(imgEleven);
        if (eleven == 0){  mFinish++;    }
        eleven = 1;
        Log.d(TAG, "mFinish = " + mFinish);
        if(mFinish == 12) {
            //relativelayout.addView(textView);
            Log.d(TAG, "FINISH!!!!!!!!!!!!!!!!!!!!!! = " + mFinish); }
    }
    private void methodTwelve(){
        imgTwelve.setVisibility(View.GONE);
        imgTwelve = new ImageView(DandDMultiPazl.this);
        RelativeLayout relativelayout = (RelativeLayout) findViewById(R.id.view_root);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(Math.round(pxFromDp(74)), Math.round(pxFromDp(39)));
        imgTwelve.setImageResource(R.drawable.twelve);
        imgTwelve.setScaleType(ImageView.ScaleType.FIT_XY);
        params.leftMargin = Math.round(pxFromDp(90));
        params.topMargin = Math.round(pxFromDp(446));
        imgTwelve.setLayoutParams(params);
        relativelayout.addView(imgTwelve);
        if (twelve == 0){  mFinish++;    }
        twelve = 1;
        Log.d(TAG, "mFinish = " + mFinish);
        if(mFinish == 12) {
            //relativelayout.addView(textView);
            Log.d(TAG, "FINISH!!!!!!!!!!!!!!!!!!!!!! = " + mFinish); }
    }
    private float pxFromDp(float dp) {
        return dp
                * getApplicationContext().getResources().getDisplayMetrics().density;
    }
}
