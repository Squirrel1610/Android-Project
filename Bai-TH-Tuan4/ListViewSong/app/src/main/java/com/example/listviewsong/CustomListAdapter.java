package com.example.listviewsong;

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
    List<Song> listSong;
    LayoutInflater layoutInflater;
    Context context;

    public CustomListAdapter(List<Song> listSong, Context aContext) {
        this.listSong = listSong;
        this.context = aContext;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return listSong.size();
    }

    @Override
    public Object getItem(int position) {
        return listSong.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_item_layout, null);
            holder = new ViewHolder();
            holder.songView = (ImageView) convertView.findViewById(R.id.imageView_song);
            holder.songNameView = (TextView) convertView.findViewById(R.id.textView_songName);
            holder.singerView = (TextView) convertView.findViewById(R.id.textView_singerName);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Song song = this.listSong.get(position);
        holder.songNameView.setText(song.getSongName());
        holder.singerView.setText("Singer: " + song.getSingerName());

        int imageId = this.getMipmapResIdByName(song.getSongImage());

        holder.songView.setImageResource(imageId);

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
        ImageView songView;
        TextView songNameView;
        TextView singerView;
    }
}
