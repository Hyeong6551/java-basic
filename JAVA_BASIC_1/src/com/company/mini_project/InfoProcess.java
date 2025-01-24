package com.company.mini_project;

import java.util.ArrayList;

interface InfoProcess{  
	void exec( ArrayList<U_Info> users );  
	void exec( ArrayList<U_Info> users, View_crud crud );  
}