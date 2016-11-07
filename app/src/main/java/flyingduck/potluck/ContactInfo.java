package flyingduck.potluck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

public class ContactInfo extends MainMenu {

    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_info);
        Intent intent = getIntent();
        id = intent.getIntExtra(MainMenu.USER_ID, 0);
        setTitle(id == 0 ? getString(R.string.my_contact_info) : getString(R.string.contact_info));
        //TODO: Create seperate logic for both personal and contact info
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        if(id == 0){
            //TODO: Index of menu item not linked to position but actual option
            menu.getItem(4).setVisible(false);
        }
        return true;
    }
}
