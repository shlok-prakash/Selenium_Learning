package constructor;

public class Employee {

        public Employee(){
                age = 18;
                companyName = "Prodapt";
        }

        public Employee(int id, String firstName, String lastname, boolean isPermanentEmployee){
                this.id=id;
                this.firstName = firstName;
                this.lastname = lastname;
                this.isPermanentEmployee = isPermanentEmployee;
        }


        public Employee(int id, String firstName, String lastname, int age, String companyName, boolean isPermanentEmployee) {
                this.id = id;
                this.firstName = firstName;
                this.lastname = lastname;
                this.age = age;
                this.companyName = companyName;
                this.isPermanentEmployee = isPermanentEmployee;
        }

        public int id;
        public String firstName;
        public String lastname;
        public int age;
        public String companyName;
        public boolean isPermanentEmployee;

        public void work(){
                System.out.println("Work For 9 Hours");
        }

}
