class Database {
    //we use static variable to store the instance
    private static Database dbObject;

    //this is a private constructor where out of class can not be initiated
    private Database() {
    }

    public static Database getInstance() {

        // create object if it's not already created
        if(dbObject == null) {
            dbObject = new Database();
        }

        // returns the singleton object
        return dbObject;
    }

    public void getConnection() {
        System.out.println("You are now connected to the database.");
    }
}

class Main {
    public static void main(String[] args) {
        Database db1;
        Database db2;

        // refers to the only object of Database
        db1= Database.getInstance();

        db1.getConnection();

        db2= Database.getInstance();

        db2.getConnection();
    }
}