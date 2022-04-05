package com.example.nguyenduythinh.baikt4;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomListAdapter extends BaseAdapter {
    private List<Animal> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomListAdapter(List<Animal> listData, Context aContext) {
        this.listData = listData;
        this.context = aContext;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            convertView = layoutInflater.inflate(R.layout.list_item_layout, null);
            holder = new ViewHolder();
            holder.logoView = (ImageView) convertView.findViewById(R.id.imageView_logoAnimal);
            holder.animalNameView = (TextView) convertView.findViewById(R.id.textView_animalName);
            holder.descView = (TextView) convertView.findViewById(R.id.textView_descAnimal);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        Animal animal = this.listData.get(position);
        holder.animalNameView.setText(animal.getAnimalName());
        holder.descView.setText(animal.getDesciption());

        int imageId = this.getMipmapResIdByName(animal.getLogoName());

        holder.logoView.setImageResource(imageId);

        return convertView;
    }

    // Find Image ID corresponding to the name of the image (in the directory mipmap).
    public int getMipmapResIdByName(String resName)  {
        String pkgName = context.getPackageName();
        // Return 0 if not found.
        int resID = context.getResources().getIdentifier(resName , "mipmap", pkgName);
        Log.i("CustomListView", "Res Name: "+ resName+"==> Res ID = "+ resID);
        return resID;
    }

    static class ViewHolder {
        ImageView logoView;
        TextView animalNameView;
        TextView descView;
    }
}
