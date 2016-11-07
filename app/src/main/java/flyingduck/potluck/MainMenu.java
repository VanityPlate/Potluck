package flyingduck.potluck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by Alex on 11/6/2016.
 */


public class MainMenu extends AppCompatActivity {

    //LOGIC DEFINITIONS
    public final static String NEW_INSTANCE = "com.flyingduck.potluck.NEWINSTANCE";
    public final static String USER_ID = "com.flyingduck.potluck.USERID";
    public final static String POTLUCK_ID = "com.flyingduck.potluck.POTLUCKID";

    //RETURN USER TO HOMEPAGE
    public void menuHomePage(MenuItem item){
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        //TODO: Add logic for prompting to save of discard changes based on where the call came from This logic should belong in each indvidual activity class
    }

    //TAKES USER TO CREATE A POTLUCK PAGE
    public void menuCreatePotluck(MenuItem item){
        Intent intent = new Intent(this, OwnedPotluck.class);
        intent.putExtra(NEW_INSTANCE, true);
        startActivity(intent);
    }

    //TAKES USER TO LIST OF THEIR POTLUCKS
    public void menuMyPotlucks(MenuItem item){
        Intent intent = new Intent(this, MyPotlucks.class);
        startActivity(intent);
    }

    //TAKES USER TO LIST OF THEIR CONTACTS
    public void menuContacts(MenuItem item){
        Intent intent = new Intent(this, Contacts.class);
        startActivity(intent);
    }

    //TAKES USER TO CONTACTINFO PAGE DISPLAYING THEIR INFO
    public void menuMyInfo(MenuItem item){
        Intent intent = new Intent(this, ContactInfo.class);
        intent.putExtra(USER_ID, 0);
        startActivity(intent);
    }

    //TAKES USER TO LIST OF FAVORITE DISHES
    public void menuFavoriteDishes(MenuItem item){
        Intent intent = new Intent(this, FavoriteDishes.class);
        startActivity(intent);
    }

    //LOGS USER OUT AND RETURNS TO USER PAGE
    public void menuLogOut(MenuItem item){
        LoginActivity.logOut();
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
