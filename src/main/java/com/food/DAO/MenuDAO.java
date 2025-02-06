package com.food.DAO;



import java.util.List;

import com.food.model.Menu;

public interface MenuDAO {
    // CRUD operations
    int addMenu(Menu menu);
    int updateMenu(Menu menu);
    int deleteMenu(int menuID);
    Menu getMenu(int menuID);
    List<Menu> getAllMenusByRestaurant(int restaurantID);
}
