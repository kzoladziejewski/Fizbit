package com.example.kacper.fizbit;

/**
 * Created by Kacper on 30.01.2019.
 */

import org.junit.Test;
import static org.junit.Assert.*;



public class TestActivity {
    @Test
    public void mainActivity_run_correctly() throws Exception {
        MainActivity mainActivity = new MainActivity();
        assertNotNull(mainActivity);

    }
    @Test
    public void bankPytan_run_correctly() throws Exception{
        BankPytan bankPytan = new BankPytan("fizyka","optyka","latwy");
        assertNotNull(bankPytan);
    }
    @Test
    public void category_run_correctly() throws Exception{
        Category category = new Category();
        assertNotNull(category);
    }




}