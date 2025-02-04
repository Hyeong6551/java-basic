package com.company.portfolio;

import java.util.ArrayList;

interface UserProcess {
	void exec( ArrayList<UserInfo> user ); 
	void exec( ArrayList<UserInfo> user, UserView view ); 
}
