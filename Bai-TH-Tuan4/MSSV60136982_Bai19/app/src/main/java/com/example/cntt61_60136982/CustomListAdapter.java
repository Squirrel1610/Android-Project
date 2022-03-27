package com.example.cntt61_60136982;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomListAdapter {
    List<Province> listData;
    LayoutInflater layoutInflater;
    Context context;

    public CustomListAdapter(Context aContext, List<Province> listData){
        this.context = aContext;
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }

    public int getCount(){
        return listData.size();
    }

    public Object getItem(int position){
        return listData.get(position);
    }

    public long getItemId(int position){
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder holder;
        if(convertView == null){
            convertView = layoutInflater.inflate(R.layout.list_item_layout, null);
            holder = new ViewHolder();
            holder.iconView = (ImageView) convertView.findViewById(R.id.imageView_icon);
            holder.provinceNameView = (TextView) convertView.findViewById(R.id.tv_provinceName);
            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
        }

        Province province = this.listData.get(position);
        holder.provinceNameView.setText(province.getProvinceName());

        int imageId = this.getMipmapResIdByName(province.getIcon());
        holder.iconView.setImageResource(imageId);

        return convertView;
    }

    //find image id corresponding to the name of the image (in the directory mimap)
    public int getMipmapResIdByName(String resName){
        String pkgName = context.getPackageName();
        //return 0 if not found
        int resID = context.getResources().getIdentifier(resName, "mipmap", pkgName);
        Log.i("CustomListView", "Res Name: " + resName + "===> Res ID =" + resID);
        return resID;
    }

    static class ViewHolder {
        ImageView iconView;
        TextView provinceNameView;
    }

}
