import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MultipleAddressbook {
    public static Map<String,AddressBook> multiAddressBook=new HashMap<>();
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            System.out.println("1 : Add Address Book\n2 : Delete Address Book\n3 : Select Address Book\n4 : Search for person\n5 : Exit");
            switch(Integer.parseInt(sc.nextLine())){
                case 1:{
                    System.out.println("Enter the name of address book");
                    String name=sc.nextLine();
                    multiAddressBook.put(name, new AddressBook());
                    multiAddressBook.get(name).initFunction();
                    break;
                }
                case 2:{
                    System.out.println("Enter the name of address book");
                    String name=sc.nextLine();
                    multiAddressBook.remove(name);
                    break;
                }
                case 3:{
                    System.out.println("Enter the name of address book");
                    String name=sc.nextLine();
                    multiAddressBook.get(name).initFunction();
                    break;
                }
                case 4:{
                    System.out.println("Enter the name contact");
                    String name=sc.nextLine();
                    for(String key:multiAddressBook.keySet()){
                        AddressBook obj=multiAddressBook.get(key);
                        Contact person=obj.getPerson(obj.list, name);
                        if(person==null){
                            continue;
                        }
                        else{
                            System.out.println(person.firstName+" found in Address book "+key);
                            person.displayContactDetails();
                        }
                    }
                    break;
                }
                case 5:{
                    System.exit(0);
                }
                default:{
                    System.exit(0);
                }
            }
        }
    }
}
