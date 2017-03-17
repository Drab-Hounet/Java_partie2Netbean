
package com.dgr.menu;

import com.dgr.attributes.*;
import com.dgr.members.*;

/**
 *
 * @author jerome.lombard
 */
public interface Menu {
    public void     display();
    public int      returnDisplay();
    public void     loopMenu(Person user, GroupPerson list);
    public void     controlMenu(Person user);
    public void     setProfil(Person user);
    public int      pointerToDelete(String message);
}
