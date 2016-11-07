package flyingduck.potluck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

public class OwnedPotluck extends MainMenu {

    private boolean newInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owned_potluck);
        setTitle(getString(R.string.owned_potluck));
        Intent intent = getIntent();
        newInstance = intent.getExtras().getBoolean(MainMenu.NEW_INSTANCE);
        //TODO: Add logic to define between new Potluck or preexisting potlucks
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        if(newInstance){
            //TODO: Index of menu item not linked to position but actual option
            menu.getItem(1).setVisible(false);
        }
        return true;
    }
}
