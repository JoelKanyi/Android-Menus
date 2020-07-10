package com.example.menus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ActionMode;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //To be used in the contextual menu
    ActionMode actionMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //For floating contextual menu
        TextView txtTitle = findViewById(R.id.tv_title);
        this.registerForContextMenu(txtTitle);

        //For the ActionMode contextual menu
        Button btnActionMode = findViewById(R.id.btnActionModeMenu);
        btnActionMode.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (actionMode != null){
                    return false;
                }
                actionMode = startSupportActionMode(mActionModeCallback);
                return true;
            }
        });

    }

    //ActionMode Contextual Menu
    private ActionMode.Callback mActionModeCallback = new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.actionmode_menu,menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            switch (item.getItemId()){
                case R.id.action_mode_item1:
                    Toast.makeText(MainActivity.this, "ActionMode Menu Item 1", Toast.LENGTH_SHORT).show();
                    mode.finish();
                    return true;
                case R.id.action_mode_item2:
                    Toast.makeText(MainActivity.this, "ActionMode Menu Item 2", Toast.LENGTH_SHORT).show();
                    mode.finish();
                    return true;
                case R.id.action_mode_item3:
                    Toast.makeText(MainActivity.this, "ActionMode Menu Item 3", Toast.LENGTH_SHORT).show();
                    mode.finish();
                    return true;
                default:
                    return false;
            }
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {
                actionMode = null;
        }
    };


    //Creating Floating Contextual Menu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.floating_contextual_menu,menu);

    }

    //Handling click events for the Floating Contextual Menu
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.context_item1:
                Toast.makeText(this, "Floating Context Menu item 1", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.context_item2:
                Toast.makeText(this, "Floating Context Menu item 2", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.context_item3:
                Toast.makeText(this, "Floating Context Menu item 3", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }



    //Creating the OptionsMenu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //inflating the menu

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu,menu);
        return true;
    }

    //Handling click events for the Options Menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.options_item1:
                Toast.makeText(this, "Options menu item 1", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.options_item2:
                Toast.makeText(this, "Options menu item 2", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.options_item3:
                Toast.makeText(this, "Options menu item 3", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    //Method to create and handle click events of a popup menu
    public void showPopupMenu(View view) {

        PopupMenu popupMenu = new PopupMenu(this,view);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.popup_item1:
                        Toast.makeText(MainActivity.this, "Popup menu item 1", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.popup_item2:
                        Toast.makeText(MainActivity.this, "Popup menu item 2", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.popup_item3:
                        Toast.makeText(MainActivity.this, "Popup menu item 3", Toast.LENGTH_SHORT).show();
                        return true;
                    default:
                        return false;
                }
            }
        });
        popupMenu.inflate(R.menu.popup_menu);
        popupMenu.show();
    }
}