package com.company.project;

import java.util.ArrayList;

interface BookProcess {
	void exec( ArrayList<BookInfo> books );
	void exec( ArrayList<BookInfo> books, View_Admin_crud ad_crud );
}
