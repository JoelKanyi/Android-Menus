# Menus


**Screenshots:**  :rocket:

<p float="left">
<img src="Screenshots/WhatsApp Image 2020-07-12 at 22.24.40.jpeg" width="100"/>
<img src="Screenshots/WhatsApp Image 2020-07-12 at 22.24.39(2).jpeg" width="100"/>
<img src="Screenshots/WhatsApp Image 2020-07-12 at 22.24.39(3).jpeg" width="100"/>
<img src="Screenshots/WhatsApp Image 2020-07-12 at 22.24.39(1).jpeg" width="100"/>
<img src="Screenshots/WhatsApp Image 2020-07-12 at 22.24.39(4).jpeg" width="100"/>
    </p>
    
----------------    
## OptionsMenu
----------------

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
    
    
----------------
## Floating Contextual Menu
----------------
 
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
    
----------------
## ActionMode Contextual Menu
----------------
 
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
----------------
## Popup Menu
----------------

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

----------------
## Setup Requirements
----------------

- Android device or emulator
- Android Studio

## Getting Started
----------------

In order to get the app running yourself, you need to:

1.  clone this project
2.  Import the project into Android Studio
3.  Connect the android device with USB or just use your emulator
4.  In Android Studio, click on the "Run" button.


## Support
--------

- Found this project useful ❤️? Support by clicking the ⭐️ button on the upper right of this page. ✌️

- Notice anything else missing? File an issue 

## Get in touch - Let's become friends
-----------------------------------

Please feel free to contact me if you have any questions, ideas or even if you just want to say hi. I’m up for talking, exchange ideas, collaborations or consults. You can connect with me through any of the avenues listed below:
- [Twitter](https://twitter.com/_joelkanyi)
- [Github](https://github.com/JoelKanyi)
- [Facebook](https://www.facebook.com/joel.kanyi.71)
- [LinkedIn](https://www.linkedin.com/in/joel-kanyi-037270174/) 
