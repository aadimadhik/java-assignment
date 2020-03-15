## FocusListenerDemo

This is an example that discusses how to use *FocusListener in Java*. This is a very handy feature when you have several components and you want to monitor and handle the event when on of them gains or looses focus.

In short, all you have to do in order to work with a FocusListener is:

1) Create a new FocusListener
2) Override the methods that correspond to the events that you want to monitor about the component e.g *focusGained*, *focusLost and customize as you wish the handling of the respective events.* Now every time the monitored component gains or looses focus the corresponding method will be executed.
3) Use the *addFocusListener* method of the component you want to monitor, in order to add the FocusListener you’ve created.