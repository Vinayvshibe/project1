package Project_1;
import java.io.*;
import java.util.*;
class print
{
void cart(int i, String l)
{
    if(i==0)
    {
        System.out.println("No item of Locker "+l+" in a cart");
    }
    else
    {
        System.out.println("There are "+i+" number of Lockers "+l+" in a cart");
    }
}
void queries(int i,String s)
{
    System.out.println("Query of Locker L"+i+" product is:");
    System.out.println(s);
    System.out.println();
}
void successful_query()
{
    System.out.println("Thank you for your valuable feedback");
    System.out.println("Query received successfully");
    System.out.println();
    System.out.println("Back to main menu?");
    System.out.println("press 1 for \"Yes\"");
    System.out.println("press any number for \"No\"");
}
void canceled_query()
{
    System.out.println("cancelled!");
    System.out.println();
    System.out.println("Back to main menu?");
    System.out.println("press 1 for \"Yes\"");
    System.out.println("press any number for \"No\"");
}
void successful_buy()
{
    System.out.println();
    System.out.println("Want to shop again?");
    System.out.println("press 1 for \"Yes\"");
    System.out.println("press any number for \"No\"");
}
void canceled_buy()
{
    System.out.println("cancelled!");
    System.out.println();
    System.out.println("Want to shop again?");
    System.out.println("press 1 for \"Yes\"");
    System.out.println("press any number for \"No\"");
}

}

public class project_1 {
	    public static void main(String[] args) {
	    	        print ob = new print();
	    	        File obj = new File("C:\\Users\\VINAY\\OneDrive\\Desktop\\Project\\Project_1");
	    	        obj.mkdir();
	    	        System.out.println();
	    	        System.out.println("Welcome to the \"Lockers PVT LTD, Pune.\"");
	    	        System.out.println("This is the official application of \"Lockers PVT LTD, Pune.\" ");
	    	        System.out.println("Where you can access all of our products and product details and also can submit queries.");
	    	        System.out.println();
	    	        String[] query = new String[4];
	    	        int i1 = 0;
	    	        int i2 = 0;
	    	        int i3 = 0;
	    	        int i4 = 0;
	    	        while (true) {
	    	            System.out.println("Please select your choice from options listed below:");
	    	            System.out.println();
	    	        System.out.println("1. list of all items currently present in the inventory.");
	    	        System.out.println("2. Query regarding the owned product");
	    	        System.out.println("3. items in a cart");
	    	        System.out.println("4. Your Queries");
	    	        System.out.println("5. Terminate the function and return to main menu");
	    	        System.out.println("6. Stop program");
	    	        System.out.println();
	    	        Scanner scan = new Scanner(System.in);
	    	        int choice_1 = scan.nextInt();
	    	            if (choice_1 == 1) {
	    	                try {
	    	                    File obj1 = new File("C:\\Users\\VINAY\\OneDrive\\Desktop\\Project\\Project_1\\locker_l1.txt");
	    	                    obj1.createNewFile();
	    	                } catch (IOException e) {
	    	                    e.printStackTrace();
	    	                }try {
	    	                    File obj2 = new File("C:\\Users\\VINAY\\OneDrive\\Desktop\\Project\\Project_1\\locker_l2.txt");
	    	                    obj2.createNewFile();
	    	                } catch (IOException e) {
	    	                    e.printStackTrace();
	    	                }try {
	    	                    File obj3 = new File("C:\\Users\\VINAY\\OneDrive\\Desktop\\Project\\Project_1\\locker_l3.txt");
	    	                    obj3.createNewFile();
	    	                } catch (IOException e) {
	    	                    e.printStackTrace();
	    	                }try {
	    	                    File obj4 = new File("C:\\Users\\VINAY\\OneDrive\\Desktop\\Project\\Project_1\\locker_l4.txt");
	    	                    obj4.createNewFile();
	    	                } catch (IOException e) {
	    	                    e.printStackTrace();
	    	                }
	    	                System.out.println("Please select your choice from options listed below to buy:");
	    	                System.out.println("1. Locker L1 (small size)");
	    	                System.out.println("2. Locker L2 (medium size)");
	    	                System.out.println("3. Locker L3 (large size)");
	    	                System.out.println("4. Locker L4 (extra large size)");
	    	                System.out.println("5. Design your own locker here (User Specified design)");
	    	                System.out.println("6. Back to main menu");
	    	                System.out.println();
	    	                int choice_2 = scan.nextInt();
	    	                switch (choice_2) {
	    	                    case 1: {
	    	                        int choice_3;
	    	                        System.out.println("Locker L1 has size of '250mm x 300mm x 350mm'.");
	    	                        System.out.println("Locker L1 has price Rs.19999");
	    	                        System.out.println("1. Buy Locker L1");
	    	                        System.out.println("2. cancel");
	    	                        choice_3 = scan.nextInt();
	    	                        if (choice_3 == 1) {
	    	                            System.out.println("Buy request approved.");
	    	                            System.out.println("Product added successfully to your cart");
	    	                            i1++;
	    	                            ob.successful_buy();
	    	                            int choice_4 = scan.nextInt();
	    	                            if (choice_4 == 1) {
	    	                                System.out.println("LockedMe.com at your service");
	    	                                break;
	    	                            } else {
	    	                            	 System.out.println("Thank you ! visit again .");
	    	                                System.exit(1);
	    	                            }
	    	                        } else if (choice_3 == 2) {
	    	                            ob.canceled_buy();
	    	                            int choice_4 = scan.nextInt();
	    	                            if (choice_4 == 1) {
	    	                                break;
	    	                            } else {
	    	                                System.out.println("Thank you ! visit again .");
	    	                                System.exit(1);
	    	                            }
	    	                        } else {
	    	                            System.out.println("invalid input!");
	    	                            break;
	    	                        }
	    	                    }case 2: {
	    	                        int choice_3;
	    	                        System.out.println("Locker L2 has size of '200mm x 350mm x 480mm'.");
	    	                        System.out.println("Locker L2 has price Rs.24999");
	    	                        System.out.println("1. Buy Locker L2");
	    	                        System.out.println("2. cancel");
	    	                        choice_3 = scan.nextInt();
	    	                        if (choice_3 == 1) {
	    	                            System.out.println("Buy request approved.");
	    	                            System.out.println("Product added successfully to your cart");
	    	                            i2++;
	    	                            ob.successful_buy();
	    	                            int choice_4 = scan.nextInt();
	    	                            if (choice_4 == 1) {
	    	                                System.out.println("LockedMe.com at your service");
	    	                                break;
	    	                            } else {
	    	                            	 System.out.println("Thank you ! visit again .");
	    	                                System.exit(1);
	    	                            }
	    	                        } else if (choice_3 == 2) {
	    	                            ob.canceled_buy();
	    	                            int choice_4 = scan.nextInt();
	    	                            if (choice_4 == 1) {
	    	                                break;
	    	                            } else {
	    	                                System.out.println("Thank you ! visit again .");
	    	                                System.exit(1);
	    	                            }
	    	                        } else {
	    	                            System.out.println("invalid input!");
	    	                            break;
	    	                        }
	    	                    }case 3: {
	    	                        int choice_3;
	    	                        System.out.println("Locker L3 has size of '400mm x 340mm x 350mm'.");
	    	                        System.out.println("Locker L3 has price Rs.29999");
	    	                        System.out.println("1. Buy Locker L3");
	    	                        System.out.println("2. cancel");
	    	                        choice_3 = scan.nextInt();
	    	                        if (choice_3 == 1) {
	    	                            System.out.println("Buy request approved.");
	    	                            System.out.println("Product added successfully to your cart");
	    	                            i3++;
	    	                            ob.successful_buy();
	    	                            int choice_4 = scan.nextInt();
	    	                            if (choice_4 == 1) {
	    	                                System.out.println("LockedMe.com at your service");
	    	                                break;
	    	                            } else {
	    	                            	 System.out.println("Thank you ! visit again .");
	    	                                System.exit(1);
	    	                            }
	    	                        } else if (choice_3 == 2) {
	    	                            ob.canceled_buy();
	    	                            int choice_4 = scan.nextInt();
	    	                            if (choice_4 == 1) {
	    	                                break;
	    	                            } else {
	    	                                System.out.println("Thank you ! visit again .");
	    	                                System.exit(1);
	    	                            }
	    	                        } else {
	    	                            System.out.println("invalid input!");
	    	                            break;
	    	                        }
	    	                    }case 4: {
	    	                        int choice_3;
	    	                        System.out.println("Locker L4 has size of '520mm x 360mm x 350mm'.");
	    	                        System.out.println("Locker L4 has price Rs.36999");
	    	                        System.out.println("1. Buy Locker L4");
	    	                        System.out.println("2. cancel");
	    	                        choice_3 = scan.nextInt();
	    	                        if (choice_3 == 1) {
	    	                            System.out.println("Buy request approved.");
	    	                            System.out.println("Product added successfully to your cart");
	    	                            i4++;
	    	                            ob.successful_buy();
	    	                            int choice_4 = scan.nextInt();
	    	                            if (choice_4 == 1) {
	    	                                System.out.println("LockedMe.com at your service");
	    	                                break;
	    	                            } else {
	    	                            	 System.out.println("Thank you ! visit again .");
	    	                                System.exit(1);
	    	                            }
	    	                        } else if (choice_3 == 2) {
	    	                            ob.canceled_buy();
	    	                            int choice_4 = scan.nextInt();
	    	                            if (choice_4 == 1) {
	    	                                break;
	    	                            } else {
	    	                                System.out.println("Thank you ! visit again .");
	    	                                System.exit(1);
	    	                            }
	    	                        } else {
	    	                            System.out.println("invalid input!");
	    	                            break;
	    	                        }
	    	                    }case 5: {
	    	                        System.out.println("Please select your choice from options listed below");
	    	                        System.out.println();
	    	                        System.out.println("1. Create locker design according to your requirement");
	    	                        System.out.println("2. Retrieve all files in ascending order");
	    	                        System.out.println("3. Delete your designed file");
	    	                        System.out.println("4. Search for your file");
	    	                        System.out.println("5. Main menu");
	    	                        System.out.println("6. Exit program");
	    	                        int choice_3 = scan.nextInt();
					 File obj5 = new File("C:\\Users\\VINAY\\OneDrive\\Desktop\\Project\\Project_1\\Design.txt");
	    	                        if (choice_3==1)
	    	                        {
	    	                            try {
	    	                                obj5.createNewFile();
	    	                                System.out.println("You have created a file viz: "+obj5.getName());
	    	                            } catch (IOException e) {
	    	                                e.printStackTrace();
	    	                            }
	    	                        try {
	    	                            Scanner sc1 = new Scanner(System.in);
	    	                            FileWriter obr1 = new FileWriter("C:\\Users\\VINAY\\OneDrive\\Desktop\\Project\\Project_1\\Design.txt");
	    	                            System.out.println("Enter your design dimensions here:");
	    	                            String design = sc1.nextLine();
	    	                            obr1.write(design);
	    	                            obr1.close();
	    	                            System.out.println(" Design received Successfully ");
	    	                            System.out.println();
	    	                        } catch (IOException e) {
	    	                            e.printStackTrace();
	    	                        }
	    	                        }
	    	                        else if (choice_3==2)
	    	                        {
	    	                            File[] list = obj.listFiles();
	    	                            System.out.println("Retrieving all files in ascending order");
	    	                         for(int i = 0; i< Objects.requireNonNull(list).length; i++)
	    	                         {
	    	                             System.out.println(list[i]);
	    	                         }
	    	                        }
	    	                        else if (choice_3==3)
	    	                        {
	    	                            System.out.println("Delete your designed file!");
	    	                            System.out.println("Press 1 for confirm delete");
	    	                            int choice_4 = scan.nextInt();
	    	                            if (choice_4==1)
	    	                            {
	    	                                //File obj1 = new File("C:\\Users\\VINAY\\OneDrive\\Desktop\\Project\\Project_1\\Design.txt");
	    	                              if(obj5.exists()){
	    	                                  obj5.delete();
						      System.out.println("Deleted file!");
	    	                                  System.out.println("list of remaining files in directory after deleting file:");
	    	                                  String[] list = obj.list();
	    	                                  for (int i =0;i< list.length;i++)
	    	                                  {
	    	                                      System.out.println(list[i]);
	    	                                  }
	    	                              }
	    	                              else {
	    	                                  System.out.println("file not exist");
	    	                              }
	    	                            }
	    	                            else {
	    	                                System.out.println("Invalid input");
	    	                            }
	    	                        }
	    	                        else if (choice_3==4)
	    	                        {
	    	                            System.out.println("Enter file name to search for");
	    	                        
	    	                            String name = scan.nextLine();
	    	                              name=  scan.nextLine();
	    	                            File[] list = obj.listFiles();
	    	                           if(list[0].startsWith(name) && list[0].endsWith("txt"))
	    	                            {
	    	                                System.out.println("Your searched file is exist");
	    	                            }
	    	                            else
	    	                            {
	    	                            System.out.println("Your Searched file not exists!");
	    	                            }
	    	                        }
	    	                        else if(choice_3==5) {
	    	                            System.out.println("Returning to main menu..");
	    	                           break;
	    	                        }
	    	                        else if(choice_3==6) {
	    	                        	System.out.println("Thank you ! visit again .");
	                                    System.exit(1);
	    	                        }else {
	    	                        	System.out.println("Invalid input !");
	    	                        	break;
	    	                        }
	    	                    }
	    	                    case 6: {
	    	                        System.out.println("Returning to Main Menu....");
	    	                        System.out.println();
	    	                        break;
	    	                    }
	    	                    default: {
	    	                        System.out.println("Invalid input!");
	    	                        System.out.println("Please enter valid input from 1 to 6 natural numbers");
	    	                        System.out.println();
	    	                    }
	    	                }
	    	            }else if (choice_1 == 2) {
	    	                System.out.println("Please select product choice to solve query:");
	    	                    System.out.println("1. Locker L1 (small size)");
	    	                    System.out.println("2. Locker L2 (medium size)");
	    	                    System.out.println("3. Locker L3 (large size)");
	    	                    System.out.println("4. Locker L4 (extra large size)");
	    	                    System.out.println("5. Back to main menu");
	    	                    System.out.println();
	    	                    int choice_2 = scan.nextInt();
	    	                    switch (choice_2) {
	    	                        case 1: {
	    	                            int choice_3;
	    	                            System.out.println("1. Query with Locker L1?");
	    	                            System.out.println("2. cancel");
	    	                            choice_3 = scan.nextInt();
	    	                            if (choice_3 == 1) {
	    	                                System.out.println("Explain query here:");
	    	                                String q1;
	    	                                scan.nextLine();
	    	                                q1 = scan.nextLine();
	    	                                query[0] = q1;
	    	                                ob.successful_query();
	    	                                int choice_4 = scan.nextInt();
	    	                                if (choice_4 == 1) {
	    	                                    break;
	    	                                } else {
	    	                                    System.out.println("Thank you ! visit again .");
	    	                                    System.exit(1);
	    	                                }
	    	                            } else if (choice_3 == 2) {
	    	                                ob.canceled_query();
	    	                                int choice_4 = scan.nextInt();
	    	                                if (choice_4 == 1) {
	    	                                    break;
	    	                                } else {
	    	                                    System.out.println("Thank you ! visit again .");
	    	                                    System.exit(1);
	    	                                }
	    	                            } else {
	    	                                System.out.println("invalid input!");
	    	                            }
	    	                        }case 2: {
	    	                            int choice_3;
	    	                            System.out.println("1. Query with Locker L2?");
	    	                            System.out.println("2. cancel");
	    	                            choice_3 = scan.nextInt();
	    	                            if (choice_3 == 1) {
	    	                                System.out.println("explain query here:");
	    	                                String q2;
	    	                                scan.nextLine();
	    	                                q2 = scan.nextLine();
	    	                                query[1] = q2;
	    	                                ob.successful_query();
	    	                                int choice_4 = scan.nextInt();
	    	                                if (choice_4 == 1) {
	    	                                    break;
	    	                                } else {
	    	                                    System.out.println("Thank you ! visit again .");
	    	                                    System.exit(1);
	    	                                }
	    	                            } else if (choice_3 == 2) {
	    	                                ob.canceled_query();
	    	                                int choice_4 = scan.nextInt();
	    	                                if (choice_4 == 1) {
	    	                                    break;
	    	                                } else {
	    	                                    System.out.println("Thank you ! visit again .");
	    	                                    System.exit(1);
	    	                                }
	    	                            } else {
	    	                                System.out.println("invalid input!");
	    	                            }
	    	                        }case 3: {
	    	                            int choice_3;
	    	                            System.out.println("1. Query with Locker L1?");
	    	                            System.out.println("2. cancel");
	    	                            choice_3 = scan.nextInt();
	    	                            if (choice_3 == 1) {
	    	                                System.out.println("explain query here:");
	    	                                String q3;
	    	                                scan.nextLine();
	    	                                q3 = scan.nextLine();
	    	                                query[2] = q3;
	    	                                ob.successful_query();
	    	                                int choice_4 = scan.nextInt();
	    	                                if (choice_4 == 1) {
	    	                                    break;
	    	                                } else {
	    	                                    System.out.println("Thank you ! visit again .");
	    	                                    System.exit(1);
	    	                                }
	    	                            } else if (choice_3 == 2) {
	    	                                ob.canceled_query();
	    	                                int choice_4 = scan.nextInt();
	    	                                if (choice_4 == 1) {
	    	                                    break;
	    	                                } else {
	    	                                    System.out.println("Thank you ! visit again .");
	    	                                    System.exit(1);
	    	                                }
	    	                            } else {
	    	                                System.out.println("invalid input!");
	    	                            }
	    	                        }case 4: {
	    	                            int choice_3;
	    	                            System.out.println("1. Query with Locker L4?");
	    	                            System.out.println("2. cancel");
	    	                            choice_3 = scan.nextInt();
	    	                            if (choice_3 == 1) {
	    	                                System.out.println("explain query here:");
	    	                                String q4;
	    	                                scan.nextLine();
	    	                                q4 = scan.nextLine();
	    	                                query[3] = q4;
	    	                                ob.successful_query();
	    	                                int choice_4 = scan.nextInt();
	    	                                if (choice_4 == 1) {
	    	                                    break;
	    	                                } else {
	    	                                    System.out.println("Thank you ! visit again .");
	    	                                    System.exit(1);
	    	                                }
	    	                            } else if (choice_3 == 2) {
	    	                                ob.canceled_query();
	    	                                int choice_4 = scan.nextInt();
	    	                                if (choice_4 == 1) {
	    	                                    break;
	    	                                } else {
	    	                                    System.out.println("Thank you ! visit again .");
	    	                                    System.exit(1);
	    	                                }
	    	                            } else {
	    	                                System.out.println("invalid input!");
	    	                            }
	    	                        }case 5: {
	    	                            System.out.println("Returning to Main Menu....");
	    	                            System.out.println();
	    	                            break;
	    	                        }default: {
	    	                            System.out.println("Invalid input!");
	    	                            System.out.println("Please enter valid input from 1 to 5 natural numbers");
	    	                            System.out.println();
	    	                        }
	    	                    }
	    	                }else if (choice_1 == 3) {
	    	                    System.out.println("List of your cart");
	    	                    String l1= "L1";
	    	                    ob.cart(i1,l1);
	    	                    String l2= "L2";
	    	                    ob.cart(i2,l2);
	    	                    String l3= "L3";
	    	                    ob.cart(i3,l3);
	    	                    String l4= "L4";
	    	                    ob.cart(i4,l4);
	    	                    System.out.println();
	    	                }else if (choice_1 == 4) {
	    	                    System.out.println("Your Queries displayed below:");
	    	                    // L1
	    	                    String q1 = query[0];
	    	                    int l1 = 1;
	    	                    ob.queries(l1, q1);
	    	                    //L2
	    	                    String q2 = query[1];
	    	                    int l2 = 2;
	    	                    ob.queries(l2, q2);
	    	                    //L3
	    	                    String q3 = query[2];
	    	                    int l3 = 3;
	    	                    ob.queries(l3, q3);
	    	                    //L4
	    	                    String q4 = query[3];
	    	                    int l4 = 4;
	    	                    ob.queries(l4, q4);

	    	                }else if (choice_1 == 5) {
	    	                    System.out.println("Returning to Main Menu....");
	    	                    System.out.println();
	    	                }else if (choice_1 == 6) {
	    	            	 System.out.println("Thank you ! visit again .");
	    	                    System.exit(1);
	    	                }else {
	    	                    System.out.println("Invalid input!");
	    	                    System.out.println("Please enter valid input from 1 to 6 natural numbers");
	    	                    System.out.println();
	    	                }
	    	            }
	        }
	    }







