package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import ru.geekbrains.fragment.R;

public class FragmentCount extends Fragment {

    private int count = 0;

    public FragmentCount() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_count, container, false);

        Button updateButton = (Button) view.findViewById(R.id.button);
        final TextView updateBox = (TextView) view.findViewById(R.id.textView);

        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String curCount = Integer.toString(++count);
                updateBox.setText(curCount);
            }
        });

        return view;
    }

}
