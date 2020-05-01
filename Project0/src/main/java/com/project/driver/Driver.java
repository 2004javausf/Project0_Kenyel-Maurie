package com.project.driver;

import com.project.menu.AllMenus;
import com.project.util.AccountList;
import com.project.util.Files;

public class Driver {

	public static void main(String[] args) {

Files.readCustomerFile();
Files.readNewCustomerFile();
//System.out.println(AccountList.customerList.toString());
//System.out.println("-------------------------");
AllMenus.mainStartMenu();

	}

}
