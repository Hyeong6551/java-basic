package com.company.mini_project;

import java.util.ArrayList;

public class Test002_1_InfoProcess {
	interface InfoProcess{
		void exec(ArrayList<U_Info> users);
	}

	class InfoCreate implements InfoProcess{	// ADD

		@Override
		public void exec(ArrayList<U_Info> users) {
			System.out.println("1. 등록기능\n");
			
		}
	}

	class InfoRead implements InfoProcess{

		@Override
		public void exec(ArrayList<U_Info> users) {
			System.out.println("2. 확인기능\n");

			
		}		
	}

	class InfoUpdate implements InfoProcess{

		@Override
		public void exec(ArrayList<U_Info> users) {
			System.out.println("3. 수정기능\n");
			
		}	// UPDATE
	}

	class InfoDelete implements InfoProcess{

		@Override
		public void exec(ArrayList<U_Info> users) {
			System.out.println("4. 삭제기능\n");
			
		}	// DELETE
	}
}
