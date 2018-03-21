package com.wyattb413;

import java.math.BigDecimal;
import java.util.ArrayList;

public interface Orderable {
    String getItemName();

    BigDecimal getItemPrice();

    int getNumberOfAdditions();

    ArrayList<ItemAddition> getAdditions();
}
