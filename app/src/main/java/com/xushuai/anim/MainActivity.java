package com.xushuai.anim;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //查找控件id
        btn = (Button) findViewById(R.id.btn);
        text = (TextView) findViewById(R.id.text);

        //Button监听事件
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //旋转 参数一 textview  参数二 表示旋转  参数三 从0开始  参数四 旋转360度
//                ObjectAnimator animator = ObjectAnimator.ofFloat(text, "rotation", 0f, 360f);

                //透明 参数一 textview  参数二 表示透明  参数三 从1(完全不透明)  参数四 到0(完全透明)
//                ObjectAnimator animator = ObjectAnimator.ofFloat(text, "alpha", 1f, 0f, 1f, 0f, 1f, 0f, 1f, 0f, 1f, 0f, 1f);

                //缩放 参数一 textview  参数二 表示缩放，+X表示在X轴上  参数三 从1(最大)  参数四 到0(最小)
//                ObjectAnimator animator = ObjectAnimator.ofFloat(text, "scaleX", 1f, 0f, 1f, 0f, 1f, 0f, 1f, 0f, 1f, 0f, 1f, 0f, 1f);

                //平移 参数一 textview  参数二 表示平移，+X表示在X轴上  参数三 从X轴开始位置  参数四 到X轴最终位置
//                ObjectAnimator animator = ObjectAnimator.ofFloat(text, "translationX", 0f, 100f);
                //持续时间
//                animator.setDuration(5000);

                //开始动画
//                animator.start();

                //综合
//                ObjectAnimator moveIn = ObjectAnimator.ofFloat(text, "translationX", 0f, 100f);
//                ObjectAnimator rotate = ObjectAnimator.ofFloat(text, "rotation", 0f, 360f, 0f, 360f, 0f, 360f);
                ObjectAnimator fadeInOut = ObjectAnimator.ofFloat(text, "alpha", 1f, 0f, 1f, 0f, 1f, 0f, 1f, 0f, 1f, 0f, 1f);
                ObjectAnimator scale = ObjectAnimator.ofFloat(text, "scaleY", 1f, 0f, 1f, 0f, 1f, 0f, 1f, 0f, 1f, 0f, 1f, 0f, 1f);
                AnimatorSet animSet = new AnimatorSet();
                //play：开始   with：和/与 after：在..之后执行动画    before：在..之前执行动画
                animSet.play(fadeInOut).with(scale);
                //持续时间
                animSet.setDuration(10000);
                //开始动画
                animSet.start();
            }
        });
    }
}