package com.fasthand;


import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by 雅倩宝宝 on 2017/8/10.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    private List<User> list2;
    public MyAdapter(List<User> list ){
        this.list2 = list;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main,parent,false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
    holder.load(list2.get(position));
    }

    @Override
    public int getItemCount() {
        return list2.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView iv_photo;
        private CircleImageView cc_head;
        public MyViewHolder(View itemView) {
            super(itemView);
            iv_photo = (ImageView) itemView.findViewById(R.id.iv_photo);
            int width = ((Activity) iv_photo.getContext()).getWindowManager().getDefaultDisplay().getWidth();
            ViewGroup.LayoutParams params = iv_photo.getLayoutParams();
            params.width = width/2;
            params.height =  (int) (400 + Math.random() * 400) ;
            iv_photo.setLayoutParams(params);
            cc_head = (CircleImageView) itemView.findViewById(R.id.cc_head);
        }
        public void load(User user){
            iv_photo.setImageResource(user.getPhoto());
            cc_head.setImageResource(user.getHead());
        }
    }
}
