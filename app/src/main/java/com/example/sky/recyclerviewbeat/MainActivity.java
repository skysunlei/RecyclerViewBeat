package com.example.sky.recyclerviewbeat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruit();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        /**
         * 创建一个linearlayoutmaneger对象，并将他设置到recyclerview当中。layoutmanager用于指定
         * recyclerview的布局方式，这里是线性布局的意思。可以实现和listview类似的效果。
         *
         * 接下来我们创建了Fruitadapter的实例，并将数据传进去
         */
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initFruit() {
        for (int i =0;i<2;i++) {
            Fruit apple = new Fruit(getRandomLengthName("a"), R.mipmap.ic_launcher);
            fruitList.add(apple);
            Fruit banana = new Fruit(getRandomLengthName("banana"), R.mipmap.ic_launcher);
            fruitList.add(banana);
            Fruit oragen = new Fruit(getRandomLengthName("orange"), R.mipmap.ic_launcher);
            fruitList.add(oragen);
            Fruit watermelon = new Fruit(getRandomLengthName("watermelon"), R.mipmap.ic_launcher);
            fruitList.add(apple);
            Fruit pear = new Fruit(getRandomLengthName("pear"), R.mipmap.ic_launcher);
            fruitList.add(pear);
            Fruit grape = new Fruit(getRandomLengthName("grape"), R.mipmap.ic_launcher);
            fruitList.add(grape);
            Fruit pineapple = new Fruit(getRandomLengthName("pineapple"), R.mipmap.ic_launcher);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit(getRandomLengthName("strawberry"), R.mipmap.ic_launcher);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit(getRandomLengthName("cherry"), R.mipmap.ic_launcher);
            fruitList.add(cherry);
            Fruit a = new Fruit("a", R.mipmap.ic_launcher);
            fruitList.add(a);
            Fruit b = new Fruit("b", R.mipmap.ic_launcher);
            fruitList.add(b);
            Fruit c = new Fruit("c", R.mipmap.ic_launcher);
            fruitList.add(c);
            Fruit d = new Fruit("d", R.mipmap.ic_launcher);
            fruitList.add(d);
            Fruit e = new Fruit("e", R.mipmap.ic_launcher);
            fruitList.add(e);
            Fruit f = new Fruit("f", R.mipmap.ic_launcher);
            fruitList.add(f);
            Fruit g = new Fruit("g", R.mipmap.ic_launcher);
            fruitList.add(g);
            Fruit h = new Fruit("h", R.mipmap.ic_launcher);
            fruitList.add(h);
        }

    }
    private String getRandomLengthName (String name){
        Random random =new Random();
        int length = random.nextInt(20)+1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0;i < length;i++){
            builder.append(name);
        }
        return builder.toString();

    }
}
