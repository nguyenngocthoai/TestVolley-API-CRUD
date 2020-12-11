package snowdrop.nnt.testvolley;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class UserAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<User> users;

    public UserAdapter(Context context, int layout, List<User> users) {
        this.context = context;
        this.layout = layout;
        this.users = users;
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder {
        TextView txtId, txtName, txtPhone;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
//        View view;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate( R.layout.list_row_main, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.txtId = convertView.findViewById(R.id.id);
            viewHolder.txtName = convertView.findViewById(R.id.name);
//            viewHolder.txtPhone = convertView.findViewById(R.id.phone);
//            view=convertView;
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
//            view=convertView;
        }
//        convertView = LayoutInflater.from(context).inflate(layout, parent, false);

//        TextView id = convertView.findViewById(R.id.id);
//        TextView name = convertView.findViewById(R.id.name);
//        TextView phone=convertView.findViewById(R.id.phone);



        User user = users.get(position);
        viewHolder.txtId.setText((Integer) user.getId());
        viewHolder.txtName.setText(user.getName());
//        viewHolder.txtPhone.setText(user.getPhone());
        return convertView;
    }


}
