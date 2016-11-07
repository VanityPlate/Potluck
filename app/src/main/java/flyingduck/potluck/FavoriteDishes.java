package flyingduck.potluck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

public class FavoriteDishes extends MainMenu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_dishes);
        setTitle(getString(R.string.favorite_dishes));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        //TODO: Index of menu item not linked to position but actual option
        menu.getItem(5).setVisible(false);
        return true;
    }
}
