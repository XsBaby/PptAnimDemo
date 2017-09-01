package com.xushuai.anim;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //查找控件id
        btn = (Button) findViewById(R.id.btn);
        image = (ImageView) findViewById(R.id.image);

        //Button监听事件
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //透明 参数一 textview  参数二 表示透明  参数三 从1(完全不透明)  参数四 到0(完全透明)
                ObjectAnimator animator = ObjectAnimator.ofFloat(image, "alpha", 1f, 0f, 1f, 0f, 1f, 0f, 1f, 0f, 1f, 0f, 1f, 0f, 1f, 0f, 1f, 0f, 1f, 0f, 1f, 0f, 1f,0f, 1f, 0f, 1f, 0f, 1f, 0f, 1f, 0f, 1f, 0f, 1f, 0f, 1f);

                //旋转 参数一 textview  参数二 表示旋转  参数三 从0开始  参数四 旋转360度
//                ObjectAnimator animator = ObjectAnimator.ofFloat(image, "rotation", 0f, 18000f,0f,18000f,0f);

                //缩放 参数一 textview  参数二 表示缩放，+X表示在X轴上  参数三 从1(最大)  参数四 到0(最小)
//                ObjectAnimator animator = ObjectAnimator.ofFloat(image, "scaleX", 2f, 0f, 2f, 0f, 2f, 0f, 2f, 0f, 2f, 0f, 2f, 0f, 2f, 0f, 2f, 0f, 2f, 0f, 2f, 0f, 2f, 0f, 2f, 0f,1f);

                //平移 参数一 textview  参数二 表示平移，+X表示在X轴上  参数三 从X轴开始位置  参数四 到X轴最终位置
//                ObjectAnimator animator = ObjectAnimator.ofFloat(image, "translationX", 0f, 100f,0f, 100f,0f, 100f,0f, 100f,0f,100f,0f,100f,0f,100f,0f, 100f,0f,100f,0f,100f,0f);

                //持续时间
                animator.setDuration(2000);
                //开始动画
                animator.start();

                //综合
//                ObjectAnimator moveIn = ObjectAnimator.ofFloat(image, "translationX", 0f, 100f);
//                ObjectAnimator rotate = ObjectAnimator.ofFloat(image, "rotation", 0f, 360f, 0f, 360f, 0f, 360f);
//                ObjectAnimator fadeInOut = ObjectAnimator.ofFloat(image, "alpha", 1f, 0f, 1f, 0f, 1f, 0f, 1f, 0f, 1f, 0f, 1f);
//                ObjectAnimator scale = ObjectAnimator.ofFloat(image, "scaleY", 1f, 0f, 1f, 0f, 1f, 0f, 1f, 0f, 1f, 0f, 1f, 0f, 1f);
//                AnimatorSet animSet = new AnimatorSet();
//                //play：开始   with：和/与 after：在..之后执行动画    before：在..之前执行动画
//                animSet.play(fadeInOut).with(scale).with(moveIn).with(rotate);
//                //持续时间
//                animSet.setDuration(10000);
//                //开始动画
//                animSet.start();
            }
        });
    }
}