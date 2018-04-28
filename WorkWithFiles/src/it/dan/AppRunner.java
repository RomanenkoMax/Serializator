package it.dan;

import java.io.File;

import it.dan.model.Item;
import it.dan.service.ItemFileManager;

public class AppRunner {

	public static void main(String[] args) {

		String sep = System.getProperty("file.separator");

		// String appDir = "D:" + sep + "Test1";
		//
		// String filePath = appDir + sep + "text.txt";
		//
		// Item item = new Item("artId1", "My favorite item", 3000, new
		// File("D:\\Test1\\Penguins.jpg"));
		//
		//
		// ItemFileManager.saveItemToFile(item, filePath);

		ItemFileManager.copy("D:" + sep + "Test1\\Penguins.jpg", "D:" + sep + "Test1\\copy_Penguins.jpg");
	}

}
