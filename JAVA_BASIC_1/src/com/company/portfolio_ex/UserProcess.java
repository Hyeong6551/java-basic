package com.company.portfolio_ex;

import java.util.ArrayList;

interface UserProcess {
	void exec( ArrayList<UserInfo> user ); 
	void exec( ArrayList<UserInfo> user, View_crud crud ); 
	void exec( View_crud crud );
}
