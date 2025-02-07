package com.company.project;

import java.util.ArrayList;

interface BookProcess {
	void exec( ArrayList<BookInfo> books );
	void exec( ArrayList<BookInfo> books, ArrayList<MyBookInfo> myBooks, View_Admin_crud ad_crud, View_User_crud usr_crud );
}
