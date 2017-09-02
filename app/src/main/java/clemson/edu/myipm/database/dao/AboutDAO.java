package clemson.edu.myipm.database.dao;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import clemson.edu.myipm.database.DBAdapter;

/**
 * Created by gedison on 6/18/2017.
 */

public class AboutDAO {

    private Context mContext;

    public AboutDAO(Context context){
        mContext = context;
    }

    public String getAboutText(){
        DBAdapter dbAdapter = new DBAdapter(mContext);
        String sql = "SELECT about.about FROM about;";

        String ret = "";
        String[][] results = dbAdapter.getMultidimensionalArrayOfStringsFromCursor(dbAdapter.runSelectQuery(sql, true));
        for(String[] result : results) ret+=result[0];

        return ret;
    }

}
