import java.util.*;

class StudentData {
    private int enrollNumber;
    private String name;
    private String address;
    private long mobileNumber;
    // private boolean isActive;

    // Create a constructor to access class data
    StudentData(int enrollNumber, String name, String address, long mobileNumber) {
        this.enrollNumber = enrollNumber;
        this.name = name;
        this.address = address;
        this.mobileNumber = mobileNumber;
        // this.isActive = isActive;
    }

    /*
     * private is a instance variable it can not be accessiable another class it is
     * create public function to access private variable
     */

    public int getEnrollNumber() {
        return enrollNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    /*
     * public boolean isActive(){
     * return isActive;
     * }
     */

    public String toString() {
        return enrollNumber + " " + name + " " + address + " " + mobileNumber + " ";// +isActive;
    }
}

class Student {
    public static void main(String[] args) {

        List<StudentData> c = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.print("Enter Your Choice : ");
            choice = s.nextInt();
            switch (choice) {
                // Case 1 to insert record in the student database
                case 1:
                    System.out.print("Enter Enrollment Number : ");
                    int eno = s.nextInt();
                    System.out.print("Enter Student Name : ");
                    String sname = s1.nextLine();
                    System.out.print("Enter Student Address : ");
                    String saddress = s1.nextLine();
                    System.out.print("Enter Student Mobile Number : ");
                    long smobilenumber = s.nextLong();

                    c.add(new StudentData(eno, sname, saddress, smobilenumber));
                    break;

                // Case 2 to Display record in the student database
                case 2:
                    System.out.println("------------Student Database---------------");
                    Iterator<StudentData> i = c.iterator();
                    while (i.hasNext()) {
                        StudentData stu = i.next();
                        System.out.println(stu);
                    }
                    System.out.println("---------------------------------------");
                    break;

                // Case 3 to Search record in the student database through enrollment id
                case 3:
                    Boolean found = false;
                    System.out.print("Enter the Enrollment Number to Search :");
                    eno = s.nextInt();
                    System.out.println("------------Student Database---------------");
                    i = c.iterator();
                    while (i.hasNext()) {
                        StudentData stu = i.next();
                        if (stu.getEnrollNumber() == eno) {
                            System.out.println(stu);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record Not found !");
                    }
                    System.out.println("---------------------------------------");
                    break;

                // Case 4 to Delete record in the student database through enrollment id
                case 4:
                    found = false;
                    System.out.print("Enter the Enrollment Number to Delete :");
                    eno = s.nextInt();
                    System.out.println("------------Student Database---------------");
                    i = c.iterator();
                    while (i.hasNext()) {
                        StudentData stu = i.next();
                        if (stu.getEnrollNumber() == eno) {
                            i.remove();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record Not found !");
                    } else {
                        System.out.println("Record Delete Successfully...!");
                    }
                    System.out.println("---------------------------------------");
                    break;

                // Case 5 to Update record in the student database through enrollment id
                case 5:
                    found = false;
                    System.out.print("Enter the Enrollment Number to Update :");
                    eno = s.nextInt();
                    System.out.println("------------Student Database---------------");
                    ListIterator<StudentData> li = c.listIterator();
                    while (li.hasNext()) {
                        StudentData stu = li.next();
                        if (stu.getEnrollNumber() == eno) {
                            System.out.print("Enter Student New Name : ");
                            sname = s1.nextLine();
                            System.out.print("Enter Student New Address : ");
                            saddress = s1.nextLine();
                            System.out.print("Enter Student New Mobile Number : ");
                            smobilenumber = s.nextLong();
                            li.set(new StudentData(eno, sname, saddress, smobilenumber));
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record Not found !");
                    } else {
                        System.out.println("Record Update Successfully...!");
                    }
                    System.out.println("---------------------------------------");
                    break;

                default:
                    break;

            }
        } while (choice != 0);

    }

}