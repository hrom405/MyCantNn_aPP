package com.example.hario.mycantnn_app.Modal;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hario.mycantnn_app.R;

import java.util.ArrayList;

public class GetOrderRecyclerAdapter extends RecyclerView.Adapter<GetOrderRecyclerAdapter.ViewHolder> {

    ArrayList<getOrderItemClass> arrayList;

    public GetOrderRecyclerAdapter(ArrayList<getOrderItemClass> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.get_customer_order_main_layout, parent, false);
        final ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.OrderName.setText(arrayList.get(position).getData());
        holder.OrderQuantity.setText("" + arrayList.get(position).getCount());
        holder.OrderPrice.setText("" + arrayList.get(position).getCost());
        holder.OrderTotal.setText("" + arrayList.get(position).getTotal());
        holder.OrderID.setText(arrayList.get(position).getOrderID());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView OrderName, OrderQuantity, OrderPrice, OrderTotal, OrderID;

        public ViewHolder(View itemView) {
            super(itemView);
            OrderName = itemView.findViewById(R.id.getProductName_TV);
            OrderQuantity = itemView.findViewById(R.id.getProductQuantity_TV);
            OrderPrice = itemView.findViewById(R.id.getProductSinglePrice_TV);
            OrderTotal = itemView.findViewById(R.id.getProductTotalPrice_TV);
            OrderID = itemView.findViewById(R.id.getProductOrderId_TV);

        }
    }
}