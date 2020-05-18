package com.library.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.library.bean.Book;
import com.library.utility.Messages;
import com.library.utility.UtilityClass;

public class MainClass {

	public static void main(String[] args) {

		Scanner scanner = UtilityClass.getScannerObject();
		
		List<Book> books = new ArrayList<Book>();
		
		while(true) {
			System.out.println(Messages.MAINMENU);
			int choice = scanner.nextInt();

			if(choice == 1) {	// For Add
				
				System.out.println(Messages.BOOKNAMEENTRY);
				String bookName = scanner.next();
				
				String bookId = UUID.randomUUID().toString();
				
				Book book = new Book();
				
				book.setBookId(bookId);
				book.setBookName(bookName);
				
				books.add(book);		// adding current book to list
				
				System.out.println(Messages.SUCCESSBOOKADDED);
				
				System.out.println(Messages.EXITENTERCHOICE);
				int continueOrExit = scanner.nextInt();
				if(continueOrExit != 1) {
					System.out.println(Messages.EXITINGFROMSYSTEM);
					try {
						TimeUnit.SECONDS.sleep(2);
						System.out.println(Messages.EXITEDFROMSYSTEM);
					} catch (InterruptedException e) {
						Logger loger = Logger.getLogger(MainClass.class.getName());
						loger.log(Level.SEVERE, "InterruptedException ", e);
					}

					break;
				}
				
			}
			else if(choice == 2) {	// For Edit
				
				// Code to be Written by Jishnu
				
				System.out.println(Messages.EXITENTERCHOICE);
				
				int continueOrExit = scanner.nextInt();
				
				if(continueOrExit != 1) {
					System.out.println(Messages.EXITINGFROMSYSTEM);
					try {
						TimeUnit.SECONDS.sleep(2);
						System.out.println(Messages.EXITEDFROMSYSTEM);
					} catch (InterruptedException e) {
						Logger loger = Logger.getLogger(MainClass.class.getName());
						loger.log(Level.SEVERE, "InterruptedException ", e);
					}
					break;
				}
				
			}
			else if(choice == 3) {	// // For Delete
				
				// Code to be Written by Jishnu
				
				System.out.println(Messages.EXITENTERCHOICE);
				
				int continueOrExit = scanner.nextInt();
				
				if(continueOrExit != 1) {
					System.out.println(Messages.EXITINGFROMSYSTEM);
					try {
						TimeUnit.SECONDS.sleep(2);
						System.out.println(Messages.EXITEDFROMSYSTEM);
					} catch (InterruptedException e) {
						Logger loger = Logger.getLogger(MainClass.class.getName());
						loger.log(Level.SEVERE, "InterruptedException ", e);
					}
					break;
				}
				
			}
			else if(choice == 4) {		// For Listing
				System.out.println(Messages.BOOKLIST);
				
				books.forEach(book ->{
					System.out.println(book.toString());
				});
				System.out.println(Messages.EXITENTERCHOICE);
				
				int continueOrExit = scanner.nextInt();
				
				if(continueOrExit != 1) {
					System.out.println(Messages.EXITINGFROMSYSTEM);
					try {
						TimeUnit.SECONDS.sleep(2);
						System.out.println(Messages.EXITEDFROMSYSTEM);
					} catch (InterruptedException e) {
						Logger loger = Logger.getLogger(MainClass.class.getName());
						loger.log(Level.SEVERE, "InterruptedException ", e);
					}
					break;
				}
				
			}
			else if(choice == 5) {		// For Exit
				System.out.println(Messages.EXITINGFROMSYSTEM);
				try {
					TimeUnit.SECONDS.sleep(2);
					System.out.println(Messages.EXITEDFROMSYSTEM);
				} catch (InterruptedException e) {
					Logger loger = Logger.getLogger(MainClass.class.getName());
					loger.log(Level.SEVERE, "InterruptedException ", e);
				}
				break;
			}
			else {		// For Wrong Choice
				System.err.println("Please enter correct choice");	// Will be changed by Jishnu ( Put this message to Messages Class like other System.out.println
				System.out.println(Messages.EXITENTERCHOICE);
				
				int continueOrExit = scanner.nextInt();
				
				if(continueOrExit != 1) {
					System.out.println(Messages.EXITINGFROMSYSTEM);
					try {
						TimeUnit.SECONDS.sleep(2);
						System.out.println(Messages.EXITEDFROMSYSTEM);
					} catch (InterruptedException e) {
						Logger loger = Logger.getLogger(MainClass.class.getName());
						loger.log(Level.SEVERE, "InterruptedException ", e);
					}
					break;
				}
			}
		}
		
	}

}
