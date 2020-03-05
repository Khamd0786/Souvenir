package com.company.souvenir2k20.Message;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.company.souvenir2k20.R;

import java.util.Objects;

public class MessageAdapter extends ArrayAdapter<String> {

    private final String[] names;
    private final String[] heading;
    private final String[] post;
    private final int[] userImage;
    private final Context mContext;

    public MessageAdapter(@NonNull Context context, String[] names, int[] userImage, String[] post, String[] heading) {
        super(context, R.layout.message_list);
        this.names = names;
        this.userImage = userImage;
        this.mContext = context;
        this.post = post;
        this.heading = heading;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder mViewHolder = new ViewHolder();
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = Objects.requireNonNull(layoutInflater).inflate(R.layout.message_list, parent, false);
            mViewHolder.userImage =  convertView.findViewById(R.id.ivMessageUser);
            mViewHolder.messageHeading =  convertView.findViewById(R.id.tvMessageHeading);
            mViewHolder.messageName =  convertView.findViewById(R.id.tvMessageName);
            mViewHolder.messagePost =  convertView.findViewById(R.id.tvMessagePost);
            convertView.setTag(mViewHolder);
        }else {
            mViewHolder = (ViewHolder) convertView.getTag();
        }
//        mViewHolder.userImage.setImageResource(userImage[position]);
        Glide.with(mContext).load(userImage[position]).into(mViewHolder.userImage);
        //pta ni kyu ni aa ra centercrop ...usko skip krte hai ye wala error dur krte hiai
        //ye pta hai crash ho kab raha hai?...start hote hi ...
        //anand wala logo aa raha hai?....hn bs wahi aa raha hai...
        //is logo ka resolution chota karo... photo edito rhai koi?...hn adobe PS? hn cc kro chota ...ok..sbka chota karu???
        //koshish kro ki 2000 x2000 se upr na ho koi
        //aur wo jo 13 mb 5 mb ki badi badi files hain unko bhi compress kro ... ok online hai koi editor???
        //check krlo mil jayega ya PS me hi kr lo... paint me mt kro kuch ...aur drawable folder ka backup create kr lo ..ok krta hun
        //kitna size krlu sabka...???... dekh lo jo chote views me display hona hai wo to around 800x 800 k kr lo ...jos abk h krlu..???
        //sbse pehle logo chota kro ...okkk
        //ek baar try kro us device pr jispr crash ho ra tha...
        //acha ek chiz aur, ye jitni bhi files drawable me hain ye sab use ho ri hain ? ya kuch kuch ni bhi bhi ho ri hain?...
        //ho sakta hai ek aad nh ho rahi ho but zada tar ho hi rahi hai...thik h ek baar inspection kr lena
        //analyze menu me jakr option hoga, to unnecessary files delete kr dena size pr effect padega...
        //okay...ho gyi build?..mene signed apk banaya tha ....ha woi ho gya?....mujhe nhi lgta...


        mViewHolder.messageName.setText(names[position]);
        mViewHolder.messagePost.setText(post[position]);
        mViewHolder.messageHeading.setText(heading[position]);
        return convertView;
    }
    static class ViewHolder {
        TextView messageHeading;
        TextView messagePost;
        TextView messageName;
        ImageView userImage;
    }
}
