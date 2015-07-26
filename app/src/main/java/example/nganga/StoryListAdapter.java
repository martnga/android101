package example.nganga;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;

/**
 * Created by nganga on 7/25/15.
 */
public class StoryListAdapter extends RecyclerView.Adapter<StoryListAdapter.CardViewHolder> {

    private int mNumCards;

    @Override
    public StoryListAdapter.CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(StoryListAdapter.CardViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
