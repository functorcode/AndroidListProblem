package juned.listproblem.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by juned on 12/2/15.
 */
public class CustomListAdapter extends BaseAdapter {
    ArrayList<DbItem> items;
    Context context;
    LayoutInflater mInflater;
    public CustomListAdapter(Context context,ArrayList<DbItem> data)
    {
        this.context=context;
        mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        items=new ArrayList<DbItem>();
        for(int i=0;i<data.size();i++)
        {
            items.add(data.get(i));
        }
    }
    public int getCount() {
        return items.size();
    }

    public Object getItem(int i) {
        return items.get(i);
    }

    public long getItemId(int i) {
        return i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View rowView=null;
        ViewHolder viewHolder;
        if(view==null) {
            viewHolder = new ViewHolder();
            rowView = mInflater.inflate(R.layout.list_item, null, true);
            viewHolder.MainText=(TextView)rowView.findViewById(R.id.MainText);
            viewHolder.SubText=(TextView)rowView.findViewById(R.id.SubText);
            rowView.setTag(viewHolder);


        }
        else
        {
            viewHolder=(ViewHolder)view.getTag();
            rowView=view;
        }

        viewHolder.MainText.setText(items.get(i).getItemName());
        if(items.get(i).getHasPrice()==false)
        {
            viewHolder.SubText.setVisibility(View.GONE);
        }
        else
        {
            viewHolder.SubText.setText(items.get(i).getPrice()+"");
        }

        return rowView;
    }

    static class  ViewHolder{

        TextView MainText;
        TextView SubText;



    }
}
