package org.project.controller;

import java.util.Scanner;

import org.project.commend.ActionDelete;
import org.project.commend.ActionInsert;
import org.project.commend.ActionSelect;
import org.project.commend.ActionUpdate;

public class ActionController {

	public static void main(String[] args) {
		Scanner query = new Scanner(System.in);
		ActionInsert in = new ActionInsert();
		ActionSelect se = new ActionSelect();
		ActionDelete de = new ActionDelete();
		ActionUpdate up = new ActionUpdate();

		while (true) {
			System.out.println("������ �Է�(insert//select//delete//update)");
			String excute = query.next();

			if (excute.equals("insert")) {
				in.excuteQuery();
				System.out.println();
			} else if (excute.equals("select")) {
				se.excuteQuery();
				System.out.println();
			} else if (excute.equals("delete")) {
				de.excuteQuery();
				System.out.println();
			} else if (excute.equals("update")) {
				up.excuteQuery();
			} else if (excute.equals("exit")) {
				System.out.println("�����մϴ�.");
				query.close();
				break;
			} else {
				System.out.println("�ٽ� �Է��ϼ���(insert//select//delete//update)");
			}

		}
	}
}