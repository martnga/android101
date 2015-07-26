package example.nganga;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by nganga on 7/25/15.
 */
public class StoryListAdapter extends RecyclerView.Adapter<CardViewHolder> {

    private int mNumCards;

    public StoryListAdapter(int numCards) {
       mNumCards = numCards;

    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext()).inflate(R.Layout.card_view, parent, false);
        CardViewHolder Vh = new CardViewHolder(v);
        return Vh;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
