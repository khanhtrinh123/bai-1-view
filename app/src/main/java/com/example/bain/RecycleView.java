package com.example.bain;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecycleView extends RecyclerView.Adapter <RecycleView.RecycleViewHolder>{
    private List<Game> gameList;
    public RecycleView(List<Game> gameList){

        this.gameList = gameList;
    }
    @NonNull
    @Override
    /* khai báo các đối tượng có trong hàng đó */
    public RecycleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_game2,viewGroup,false);
        return new RecycleViewHolder(view);
    }

    /* đưa các dữ liệu có trong danh sách bỏ vào hàng tương ứng */
    @Override
    public void onBindViewHolder(@NonNull RecycleViewHolder holder, int position) {
        RecycleViewHolder.namegame.setText(gameList.get(position).name );
        RecycleViewHolder.theloai.setText(gameList.get(position).theloai);

    }

    @Override
    /* Trả về số hàng mà RecyclerView hiển thị */
    public int getItemCount() {

        return gameList.size();
    }

    public static class RecycleViewHolder extends RecyclerView.ViewHolder {
        /* vì sao lại bỏ static mới không lỗi */
        public static TextView namegame;
        public static TextView theloai;
        public RecycleViewHolder(@NonNull View itemView) {
            super(itemView);
            namegame = itemView.findViewById(R.id.namegame);
            theloai = itemView.findViewById(R.id.theloai);

        }
    }
}
