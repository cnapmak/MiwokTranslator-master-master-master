package com.example.android.miwok;
import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId )
        {
            super(context, 0, words);
            mColorResourceId = colorResourceId;

        }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Word currentWord = getItem(position);

        TextView miwokNameTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);

        miwokNameTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultNameTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

        defaultNameTextView.setText(currentWord.getDefaultTranslation());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image_view);
        if (currentWord.hasImage()) {
            iconView.setImageResource(currentWord.getImageResourceId());

            iconView.setVisibility((View.VISIBLE));
        }
        else {
            iconView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        textContainer.setBackgroundColor((color));
        return listItemView;

    }


}
